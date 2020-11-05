package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel(value = "订制文件VO")
public class PlanCustomVo {

    @ApiModelProperty(value = "方案标识Key",required = true)
    @NotBlank(message = "方案标识key不能为空")
    private String planKey;

    @ApiModelProperty(value = "文案描述",required = true)
    @NotBlank(message = "方案描述不能为空")
    private String planDesc;

}
