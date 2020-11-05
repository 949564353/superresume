package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "updateVo")
public class AppPlanUpdateVo {

    @ApiModelProperty(value = "方案ID",required = true)
    private Long id ;

    @ApiModelProperty(value = "文案类型")
    private String planType;

    @ApiModelProperty(value = "文案描述")
    private String planDesc;

    @ApiModelProperty(value = "文案排序")
    private Integer planSort;

    @ApiModelProperty(value = "文案价格")
    private Long planPrice;

    @ApiModelProperty(value = "文案天数")
    private Integer planDays;

}
