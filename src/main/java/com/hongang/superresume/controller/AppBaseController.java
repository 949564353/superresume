package com.hongang.superresume.controller;

import com.hongang.superresume.common.IsInvalidDto;
import com.hongang.superresume.common.Result;
import com.hongang.superresume.common.vo.*;
import com.hongang.superresume.common.vo.*;
import com.hongang.superresume.service.AppBaseServiceImpl;
import com.hongang.superresume.service.PlanCustomServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("base")
@ApiSort(2)
@Api(value = "base", tags = "内购接口", description = "内购接口")
public class AppBaseController {

    @Autowired
    private AppBaseServiceImpl appBaseService;

    @Autowired
    private PlanCustomServiceImpl planCustomService;


    @ApiOperation(value = "是否会员", response = IsInvalidDto.class, position = 1)
    @PostMapping(value = "/isOpen")
    public Result isOpen(@Valid @RequestBody IsInvalidVo isInvalidVo) {
        return appBaseService.isOpen(isInvalidVo);
    }


    @ApiOperation(value = "配置文案信息(新增)", position = 3)
    @PostMapping(value = "/savePlanInfo")
    public Result savePlanInfo(@Valid @RequestBody List<AppPlanVo> planVoList) {
        return appBaseService.savePlanInfo(planVoList);
    }

    @ApiOperation(value = "修改文案信息", position = 3)
    @PostMapping(value = "/updatePlanInfo")
    public Result updatePlanInfo(@Valid @RequestBody AppPlanUpdateVo updateVo) {
        return appBaseService.updatePlanInfo(updateVo);
    }

    @ApiOperation(value = "查询文案信息", position = 4)
    @PostMapping(value = "/selectPlanInfo")
    public Result selectPlanInfo() {
        return appBaseService.selectPlanInfo();
    }

    @ApiOperation(value = "内网支付成功生成订单", position = 2)
    @PostMapping(value = "/verification")
    public Result verification(@Valid @RequestBody AppOrderVo orderVo) {
        return appBaseService.verification(orderVo);
    }

    @ApiOperation(value = "配置订制文案", position = 5)
    @PostMapping(value = "/savePlanCustom")
    public Result savePlanCustom(@Valid @RequestBody List<PlanCustomVo> planCustomVoList, @RequestParam(value = "version", required = true) String version) {
        return planCustomService.savePlanCustom(planCustomVoList, version);
    }

    @ApiOperation(value = "查询订制文案", position = 6)
    @PostMapping(value = "/selectPlanCustom")
    public Result selectPlanCustom(@Valid @RequestBody VersionVo versionVo) {
        return planCustomService.selectPlanCustom(versionVo);
    }
}
