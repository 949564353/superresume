package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel
public class VersionVo {

    @ApiModelProperty(value = "版本号", required = true)
    @NotBlank(message = "版本号不能为空")
    private String version;

}
