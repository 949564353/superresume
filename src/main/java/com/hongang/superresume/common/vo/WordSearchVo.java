package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel
public class WordSearchVo {

    /**
     * 文档名称
     */
    @ApiModelProperty(value = "文档名称", required = true)
    @NotBlank(message = "文档名称不能为空")
    private String wordName;

    /**
     * 文档类型ID
     */
    @ApiModelProperty(value = "文档类型ID", required = true)
    private Long typeId;

    /**
     * 版本号
     */
    @ApiModelProperty(value = "版本号", required = true)
    private String version;

    /**
     * 手机唯一识别码
     */
    @ApiModelProperty(value = "手机唯一识别码", required = true)
    private String phoneIden;
}
