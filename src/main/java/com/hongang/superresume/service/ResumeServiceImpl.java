package com.hongang.superresume.service;

import com.hongang.superresume.common.Result;
import com.hongang.superresume.common.vo.PersonInfo;
import com.hongang.superresume.dao.ResumeInfoMapper;
import com.hongang.superresume.entity.ResumeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.Date;
import java.util.List;

@Service
public class ResumeServiceImpl {


    @Autowired
    private ResumeInfoMapper resumeInfoMapper;


    /**
     * 是否存在简历
     *
     * @return
     */
    public Result isExist(String idenId) {
        List<ResumeInfo> typeList = resumeInfoMapper.selectByExample(Example.builder(ResumeInfo.class).where(Sqls.custom()
                .andEqualTo("isValid", "1")
                .andEqualTo("idenId", idenId)
                .andEqualTo("isEdit", "1")).build());
        Boolean falg = CollectionUtils.isEmpty(typeList)?false:true;
        return Result.success(falg, "查询是否存在简历成功！");
    }

    /**
     * 获得简历详情
     *
     * @return
     */
    public Result getResumeDetail(String idenId) {
        List<ResumeInfo> resumeInfoList = resumeInfoMapper.selectByExample(Example.builder(ResumeInfo.class).where(Sqls.custom()
                .andEqualTo("isValid", "1")
                .andEqualTo("idenId", idenId)).build());
        if(CollectionUtils.isEmpty(resumeInfoList)){
            ResumeInfo resumeInfo = new ResumeInfo();
            resumeInfo.setCreateTime(new Date());
            resumeInfo.setIsValid("1");
            resumeInfo.setIsEdit("0");
            resumeInfoMapper.insertSelective(resumeInfo);
            return Result.success(resumeInfo, "获得简历详情！");
        }else{
            return Result.success(resumeInfoList.get(0), "获得简历详情！");
        }
    }

    /**
     * 更新简历-个人信息
     *
     * @return
     */
    public Result updatePersonInfo(PersonInfo personInfo) {
        ResumeInfo resumeInfo = resumeInfoMapper.selectByPrimaryKey(personInfo.getId());
        int i = resumeInfoMapper.updateByPrimaryKeySelective(resumeInfo);
        return i > 0 ? Result.success(resumeInfo, "更新个人信息成功！") : Result.fail("更新个人信息失败！");
    }

}
