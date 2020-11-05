package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
@ApiModel(value = "订单生成VO")
public class AppOrderVo {

    @ApiModelProperty(value = "文案ID",required = true)
    @NotBlank(message = "方案id不能为空")
    private Long planId;

    @ApiModelProperty(value = "手机唯一识别码",required = true)
    @NotBlank(message = "手机唯一识别码不能为空")
    private String phoneIden;





}
