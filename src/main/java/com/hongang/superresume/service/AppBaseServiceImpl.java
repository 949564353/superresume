package com.hongang.superresume.service;

import com.hongang.superresume.common.Result;
import com.hongang.superresume.common.vo.AppOrderVo;
import com.hongang.superresume.common.vo.AppPlanUpdateVo;
import com.hongang.superresume.common.vo.AppPlanVo;
import com.hongang.superresume.common.vo.IsInvalidVo;
import com.hongang.superresume.dao.AppInfoMapper;
import com.hongang.superresume.dao.AppOrderMapper;
import com.hongang.superresume.dao.AppPlanMapper;
import com.hongang.superresume.dao.PlanCustomMapper;
import com.hongang.superresume.entity.AppInfo;
import com.hongang.superresume.entity.AppOrder;
import com.hongang.superresume.entity.AppPlan;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.*;

@Service
public class AppBaseServiceImpl {

    @Autowired
    private AppPlanMapper planMapper;

    @Autowired
    private AppInfoMapper appInfoMapper;

    @Autowired
    private AppOrderMapper orderMapper;

    @Autowired
    private PlanCustomMapper planCustomMapper;

    @Value("${app.id}")
    private Integer appId;

    /**
     * 设置方案信息
     * @param planVoList
     * @return
     */
    @Transactional
    public Result savePlanInfo(List<AppPlanVo> planVoList) {

        List<AppPlan> planList = planMapper.selectByExample(Example.builder(AppPlan.class).where(Sqls.custom()
//                .andEqualTo("version", version)
                .andEqualTo("isValid",1)
                .andEqualTo("appId",appId)).build());

        if(!CollectionUtils.isEmpty(planList)){
            planMapper.deleteByExample(Example.builder(AppPlan.class).where(Sqls.custom()
//                    .andEqualTo("version", version)
                    .andEqualTo("isValid",1)
                    .andEqualTo("appId",appId)).build());
        }

        //TODO:改为批量新增
        List<AppPlan> rtnPlanList = new ArrayList<>();
        for (AppPlanVo planVo:planVoList){
            AppPlan plan = new AppPlan();
            BeanUtils.copyProperties(planVo,plan);
            plan.setAppId(appId.longValue());
            plan.setCreateTime(new Date());
            plan.setIsValid(1);
//            plan.setVersion(version);
            int i = planMapper.insertSelective(plan);
            rtnPlanList.add(plan);
        }
        return Result.success(rtnPlanList, "设置成功");
    }

    /**
     * 修改方案
     * @param updateVo
     * @return
     */
    @Transactional
    public Result updatePlanInfo(AppPlanUpdateVo updateVo) {

        AppPlan appPlan = planMapper.selectByPrimaryKey(updateVo);
        if(appPlan==null){
            return Result.fail("没有相应的方案信息，请新增文案！");
        }

        BeanUtils.copyProperties(updateVo,appPlan);
        int i = planMapper.updateByPrimaryKeySelective(appPlan);
        return i > 0 ? Result.success(appPlan, "修改方案成功！") : Result.fail("修改方案失败！");
    }


    /**
     * 查询文案信息
     * @return
     */
    public Result selectPlanInfo() {
        List<AppPlan> appPlanList = planMapper.selectByExample(Example.builder(AppPlan.class).where(Sqls.custom()
                .andEqualTo("isValid",1)
                .andEqualTo("appId",appId)).build());
        if (appPlanList.size() > 0) {
            return Result.success(appPlanList, "查询成功");
        }
        return Result.fail("数据为空，请联系管理员！");
    }

    public Result isOpen(IsInvalidVo isInvalidVo) {

        List<AppInfo> appInfos = appInfoMapper.selectByExample(Example.builder(AppInfo.class).where(Sqls.custom()
            .andEqualTo("id",appId)
            .andEqualTo("isValid",1)).build());

        if (null == appInfos || appInfos.size() < 1) {
            return Result.fail("校验失败，请联系管理员：缺少环境参数");
        }

        Map map = new HashMap();
        map.put("appInfo", appInfos.get(0));

        Example example = Example.builder(AppOrder.class).where(Sqls.custom()
                .andEqualTo("phoneIden", isInvalidVo.getPhoneIden())
                .andEqualTo("appId", appId)
                .andEqualTo("isValid", 1)
//                .andEqualTo("version",isInvalidVo.getVersion())
                .andGreaterThan("invalidTime", new Date())
        ).build();
        List<AppOrder> orderList = orderMapper.selectByExample(example);

        if (null != orderList && orderList.size() > 0) {
            map.put("appOrder", orderList.get(0));
//            orderList.get(0).setInvalidTime(null);
            return Result.success(map, "校验成功");
        }
        return Result.fail(map, "校验失败");
    }


    /**
     * 购买成功后更新到期时间
     * @param orderVo
     * @return
     */
    @Transactional
    public Result verification(AppOrderVo orderVo) {
        try {
            AppPlan plan = planMapper.selectByPrimaryKey(orderVo.getPlanId());
            Example example = Example.builder(AppOrder.class).where(Sqls.custom()
                    .andEqualTo("phoneIden", orderVo.getPhoneIden())
//                    .andEqualTo("version", plan.getVersion())
                    .andEqualTo("appId", plan.getAppId())
                    .andEqualTo("isValid", 1)
                    .andGreaterThan("invalidTime", new Date())
            ).build();
            List<AppOrder> orderList = orderMapper.selectByExample(example);

            if(CollectionUtils.isEmpty(orderList)){     //新增
                AppOrder order = new AppOrder();
                order.setPlanId(plan.getId());
                order.setAppId(plan.getAppId());
                order.setCreateTime(new Date());
                order.setIsValid(1);
                order.setPhoneIden(orderVo.getPhoneIden());
//                order.setVersion(plan.getVersion());

                Date date = new Date();//取时间
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(date);
                //3天失效
                calendar.add(calendar.DATE, 3);
                calendar.add(calendar.DATE, plan.getPlanDays());
                order.setInvalidTime(calendar.getTime());

                int i = orderMapper.insertSelective(order);
                return i > 0 ? Result.success(order, "购买成功！") : Result.fail("购买失败！");
            }else{      //修改失效时间
                AppOrder order = orderList.get(0);
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(order.getInvalidTime());
                //3天失效
                calendar.add(calendar.DATE, 3);
                calendar.add(calendar.DATE, plan.getPlanDays());
                order.setPlanId(plan.getId());
                order.setInvalidTime(calendar.getTime());
                int i = orderMapper.updateByPrimaryKeySelective(order);
                return i > 0 ? Result.success(order, "购买成功！") : Result.fail("购买失败！");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.fail("支付失败！！！");
    }


}
