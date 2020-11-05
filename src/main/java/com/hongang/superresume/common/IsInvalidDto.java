package com.hongang.superresume.common;

import com.hongang.superresume.entity.AppInfo;
import com.hongang.superresume.entity.AppOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("爱思助手开屏响应信息模型说明")
public class IsInvalidDto {


    @ApiModelProperty(value = "支付验证信息")
    private AppInfo appInfo;
    @ApiModelProperty(value = "开屏配置信息信息")
    private AppOrder appOrder;


}
