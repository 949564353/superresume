package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
@ApiModel
public class WordInfoVo {

    /**
     * 类型ID
     */
    @ApiModelProperty(value = "类型ID", required = true)
    private Long typeId;
}
