package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel
public class WordCollectVo {

    /**
     * 文档ID
     */
    @ApiModelProperty(value = "文档id", required = true)
    private Long wordId;

    /**
     * 手机识别码
     */
    @ApiModelProperty(value = "手机识别码", required = true)
    @NotBlank(message = "手机识别码不能为空")
    private String phoneIden;
}
