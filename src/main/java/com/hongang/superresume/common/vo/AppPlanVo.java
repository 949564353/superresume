package com.hongang.superresume.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "VO")
public class AppPlanVo {

    @ApiModelProperty(value = "文案类型",required = true)
    private String planType;

    @ApiModelProperty(value = "文案描述")
    private String planDesc;

    @ApiModelProperty(value = "文案排序",required = true)
    private Integer planSort;

    @ApiModelProperty(value = "文案价格",required = true)
    private Long planPrice;

    @ApiModelProperty(value = "文案天数",required = true)
    private Integer planDays;

}
