package com.hongang.superresume.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "app_plan")
public class AppPlan implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 文案类型
     */
    @Column(name = "plan_type")
    private String planType;

    /**
     * 文案描述
     */
    @Column(name = "plan_desc")
    private String planDesc;

    /**
     * 文案排序
     */
    @Column(name = "plan_sort")
    private Integer planSort;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否有效：1、有效；0、无效
     */
    @Column(name = "is_valid")
    private Integer isValid;

    /**
     * 版本号
     */
    private String version;

    /**
     * app的主键
     */
    @Column(name = "app_id")
    private Long appId;

    /**
     * 文案价格
     */
    @Column(name = "plan_price")
    private Long planPrice;

    /**
     * 方案天数
     */
    @Column(name = "plan_days")
    private Integer planDays;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取文案类型
     *
     * @return plan_type - 文案类型
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * 设置文案类型
     *
     * @param planType 文案类型
     */
    public void setPlanType(String planType) {
        this.planType = planType == null ? null : planType.trim();
    }

    /**
     * 获取文案描述
     *
     * @return plan_desc - 文案描述
     */
    public String getPlanDesc() {
        return planDesc;
    }

    /**
     * 设置文案描述
     *
     * @param planDesc 文案描述
     */
    public void setPlanDesc(String planDesc) {
        this.planDesc = planDesc == null ? null : planDesc.trim();
    }

    /**
     * 获取文案排序
     *
     * @return plan_sort - 文案排序
     */
    public Integer getPlanSort() {
        return planSort;
    }

    /**
     * 设置文案排序
     *
     * @param planSort 文案排序
     */
    public void setPlanSort(Integer planSort) {
        this.planSort = planSort;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否有效：1、有效；0、无效
     *
     * @return is_valid - 是否有效：1、有效；0、无效
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效：1、有效；0、无效
     *
     * @param isValid 是否有效：1、有效；0、无效
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 获取app的主键
     *
     * @return app_id - app的主键
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * 设置app的主键
     *
     * @param appId app的主键
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * 获取文案价格
     *
     * @return plan_price - 文案价格
     */
    public Long getPlanPrice() {
        return planPrice;
    }

    /**
     * 设置文案价格
     *
     * @param planPrice 文案价格
     */
    public void setPlanPrice(Long planPrice) {
        this.planPrice = planPrice;
    }

    /**
     * 获取方案天数
     *
     * @return plan_days - 方案天数
     */
    public Integer getPlanDays() {
        return planDays;
    }

    /**
     * 设置方案天数
     *
     * @param planDays 方案天数
     */
    public void setPlanDays(Integer planDays) {
        this.planDays = planDays;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", planType=").append(planType);
        sb.append(", planDesc=").append(planDesc);
        sb.append(", planSort=").append(planSort);
        sb.append(", createTime=").append(createTime);
        sb.append(", isValid=").append(isValid);
        sb.append(", version=").append(version);
        sb.append(", appId=").append(appId);
        sb.append(", planPrice=").append(planPrice);
        sb.append(", planDays=").append(planDays);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
