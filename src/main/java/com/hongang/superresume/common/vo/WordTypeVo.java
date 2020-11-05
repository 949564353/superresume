package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel
public class WordTypeVo {
    /**
     * 类型编码
     */
    @ApiModelProperty(value = "类型编码", required = true)
    @NotBlank(message = "类型编码不能为空")
    private String typeCode;

    /**
     * 类型名称
     */
    @ApiModelProperty(value = "类型名称", required = true)
    @NotBlank(message = "类型名称不能为空")
    private String typeName;

    /**
     * 排序编号
     */
    @ApiModelProperty(value = "排序编号", required = true)
    private Byte sortNum;

    /**
     * 主类型：1、视频；2、文档
     */
    @ApiModelProperty(value = "主类型：1、视频；2、文档", required = true)
    private String mainType;

    /**
     * 是否为vip：1、是；0、否
     */
    @ApiModelProperty(value = "是否为vip：1、是；0、否", required = true)
    private String isVip;

//    /**
//     * 类型图片
//     */
//    @ApiModelProperty(value = "类型图片", required = true)
//    @NotBlank(message = "版本号不能为空")
//    private String typeImg;
}
