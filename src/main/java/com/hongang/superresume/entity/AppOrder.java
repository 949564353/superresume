package com.hongang.superresume.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "app_order")
public class AppOrder implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * app主键
     */
    @Column(name = "app_id")
    private Long appId;

    /**
     * 方案id
     */
    @Column(name = "plan_id")
    private Long planId;

    /**
     * 失效时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Column(name = "invalid_time")
    private Date invalidTime;

    /**
     * 手机唯一识别
     */
    @Column(name = "phone_iden")
    private String phoneIden;

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

//    /**
//     * 版本
//     */
//    private String version;

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
     * 获取app主键
     *
     * @return app_id - app主键
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * 设置app主键
     *
     * @param appId app主键
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * 获取方案id
     *
     * @return plan_id - 方案id
     */
    public Long getPlanId() {
        return planId;
    }

    /**
     * 设置方案id
     *
     * @param planId 方案id
     */
    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    /**
     * 获取失效时间
     *
     * @return invalid_time - 失效时间
     */
    public Date getInvalidTime() {
        return invalidTime;
    }

    /**
     * 设置失效时间
     *
     * @param invalidTime 失效时间
     */
    public void setInvalidTime(Date invalidTime) {
        this.invalidTime = invalidTime;
    }

    /**
     * 获取手机唯一识别
     *
     * @return phone_iden - 手机唯一识别
     */
    public String getPhoneIden() {
        return phoneIden;
    }

    /**
     * 设置手机唯一识别
     *
     * @param phoneIden 手机唯一识别
     */
    public void setPhoneIden(String phoneIden) {
        this.phoneIden = phoneIden == null ? null : phoneIden.trim();
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

//    /**
//     * 获取版本
//     *
//     * @return version - 版本
//     */
//    public String getVersion() {
//        return version;
//    }
//
//    /**
//     * 设置版本
//     *
//     * @param version 版本
//     */
//    public void setVersion(String version) {
//        this.version = version == null ? null : version.trim();
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", planId=").append(planId);
        sb.append(", invalidTime=").append(invalidTime);
        sb.append(", phoneIden=").append(phoneIden);
        sb.append(", createTime=").append(createTime);
        sb.append(", isValid=").append(isValid);
//        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
