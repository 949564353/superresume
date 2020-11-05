package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created by zhangruifeng on 2020/11/4.
 */
@Data
@ApiModel(value = "简历-个人信息")
public class PersonInfo {

    @ApiModelProperty(value = "主键",required = true)
    @NotBlank(message = "主键id不能为空")
    private Long id;
}
