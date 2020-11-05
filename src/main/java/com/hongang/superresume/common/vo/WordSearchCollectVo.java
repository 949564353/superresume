package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel
public class WordSearchCollectVo {

    /**
     * 文档类型
     */
    @ApiModelProperty(value = "文档类型：1、视频；2、文件", required = true)
    @NotBlank(message = "文档类型不能为空")
    private String collectType;

    /**
     * 手机识别码
     */
    @ApiModelProperty(value = "手机识别码", required = true)
    @NotBlank(message = "手机识别码不能为空")
    private String phoneIden;
}
