package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
@ApiModel(value = "苹果验证模型")
public class IAPVo {


    @ApiModelProperty(value = "最新凭证")
    @NotBlank(message = "最新凭证不能为空")
    private String latest_receipt;

    @ApiModelProperty(value = "App专用共享密钥")
    @NotBlank(message = "App专用共享密钥不能为空")
    private String password;

    @ApiModelProperty(value = "idfa")
    @NotBlank(message = "idfa不能为空")
    private String idfa;

    @ApiModelProperty(value = "产品ID")
    @NotBlank(message = "产品ID不能为空")
    private String product_id;





}
