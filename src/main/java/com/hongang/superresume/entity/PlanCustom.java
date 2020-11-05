package com.hongang.superresume.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "plan_custom")
public class PlanCustom implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 方案标识
     */
    @Column(name = "plan_key")
    private String planKey;

    /**
     * 方案描述
     */
    @Column(name = "plan_desc")
    private String planDesc;

    /**
     * 是否有效：1、有效；0、失效
     */
    @Column(name = "is_valid")
    private Integer isValid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 版本号
     */
    private String version;

    /**
     * app主键
     */
    @Column(name = "app_id")
    private Long appId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取方案标识
     *
     * @return plan_key - 方案标识
     */
    public String getPlanKey() {
        return planKey;
    }

    /**
     * 设置方案标识
     *
     * @param planKey 方案标识
     */
    public void setPlanKey(String planKey) {
        this.planKey = planKey == null ? null : planKey.trim();
    }

    /**
     * 获取方案描述
     *
     * @return plan_desc - 方案描述
     */
    public String getPlanDesc() {
        return planDesc;
    }

    /**
     * 设置方案描述
     *
     * @param planDesc 方案描述
     */
    public void setPlanDesc(String planDesc) {
        this.planDesc = planDesc == null ? null : planDesc.trim();
    }

    /**
     * 获取是否有效：1、有效；0、失效
     *
     * @return is_valid - 是否有效：1、有效；0、失效
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效：1、有效；0、失效
     *
     * @param isValid 是否有效：1、有效；0、失效
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", planKey=").append(planKey);
        sb.append(", planDesc=").append(planDesc);
        sb.append(", isValid=").append(isValid);
        sb.append(", createTime=").append(createTime);
        sb.append(", version=").append(version);
        sb.append(", appId=").append(appId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
