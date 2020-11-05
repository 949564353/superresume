package com.hongang.superresume.controller;

import com.hongang.superresume.common.Result;
import com.hongang.superresume.common.vo.PersonInfo;
import com.hongang.superresume.service.ResumeServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhangruifeng on 2020/11/4.
 */

@RestController
@RequestMapping("resume")
@ApiSort(3)
@Api(value = "resume", tags = "简历接口", description = "简历接口")
public class ResumeController {

    @Autowired
    private ResumeServiceImpl resumeService;


    @ApiOperation(value = "是否存在简历", position = 1)
    @RequestMapping(value = "/isExist", method = RequestMethod.GET)
    public Result isExist(@RequestParam("idenId") String idenId) {
        return resumeService.isExist(idenId);
    }

    @ApiOperation(value = "获得简历详情", position = 2)
    @RequestMapping(value = "/getResumeDetail", method = RequestMethod.GET)
    public Result getResumeDetail(@RequestParam("idenId") String idenId) {
        return resumeService.getResumeDetail(idenId);
    }

    @ApiOperation(value = "更新个人信息", position = 3)
    @RequestMapping(value = "/updatePersonInfo", method = RequestMethod.POST)
    public Result updatePersonInfo(@RequestBody PersonInfo personInfo) {
        return resumeService.updatePersonInfo(personInfo);
    }
}
