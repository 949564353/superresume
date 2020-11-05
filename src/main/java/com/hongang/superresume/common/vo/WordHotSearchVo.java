package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel
public class WordHotSearchVo {

    /**
     * 文档名称
     */
    @ApiModelProperty(value = "文档名称", required = true)
    @NotBlank(message = "文档名称不能为空")
    private String wordName;
}
