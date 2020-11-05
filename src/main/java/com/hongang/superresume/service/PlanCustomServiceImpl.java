package com.hongang.superresume.service;

import com.hongang.superresume.common.vo.VersionVo;
import com.hongang.superresume.dao.PlanCustomMapper;
import com.hongang.superresume.common.Result;
import com.hongang.superresume.common.vo.PlanCustomVo;
import com.hongang.superresume.entity.AppPlan;
import com.hongang.superresume.entity.PlanCustom;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PlanCustomServiceImpl {

    @Autowired
    private PlanCustomMapper planCustomMapper;


    @Value("${app.id}")
    private Integer appId;

    /**
     * 设置订制方案信息
     *
     * @param planCustomVoList
     * @param version
     * @return
     */
    @Transactional
    public Result savePlanCustom(List<PlanCustomVo> planCustomVoList, String version) {

        List<PlanCustom> planCustomList = planCustomMapper.selectByExample(Example.builder(PlanCustom.class).where(Sqls.custom()
                .andEqualTo("version", version)
                .andEqualTo("appId", appId)).build());

        if (!CollectionUtils.isEmpty(planCustomList)) {
            planCustomMapper.deleteByExample(Example.builder(AppPlan.class).where(Sqls.custom()
                    .andEqualTo("version", version)
                    .andEqualTo("appId", appId)).build());
        }

        //TODO:改为批量新增
        List<PlanCustom> rtnPlanList = new ArrayList<>();
        for (PlanCustomVo customVo : planCustomVoList) {
            PlanCustom planCustom = new PlanCustom();
            BeanUtils.copyProperties(customVo, planCustom);
            planCustom.setAppId(appId.longValue());
            planCustom.setCreateTime(new Date());
            planCustom.setIsValid(1);
            planCustom.setVersion(version);
            int i = planCustomMapper.insertSelective(planCustom);
            rtnPlanList.add(planCustom);
        }
        return Result.success(rtnPlanList, "订制方案设置成功");
    }


    /**
     * 查询订制文案信息
     *
     * @param versionVo
     * @return
     */
    public Result selectPlanCustom(VersionVo versionVo) {
        List<PlanCustom> appPlanList = planCustomMapper.selectByExample(Example.builder(PlanCustom.class).where(Sqls.custom()
                .andEqualTo("version", versionVo.getVersion())
                .andEqualTo("appId", appId)).build());
        if (appPlanList.size() > 0) {
            return Result.success(appPlanList, "查询成功");
        }
        return Result.fail("数据为空，请联系管理员！");
    }

}
