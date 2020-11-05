package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class IsInvalidVo {

    @ApiModelProperty(value = "手机识别码",required = true)
    @NotBlank(message = "手机识别码不能为空")
    private String phoneIden;

//    @ApiModelProperty(value = "版本号",required = true)
//    @NotBlank(message = "版本号不能为空")
//    private String version;


//    @ApiModelProperty(value = "环境变量:1微商相册 2爱思助手 3火箭测速器")
////    @NotBlank(message = "环境变量不能为空")
//    private String env;

}
