package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel
public class WordVideoVo {

    /**
     * 视频类型
     */
    @ApiModelProperty(value = "视频类型", required = true)
    private Long typeId;
}
