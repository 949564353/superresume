package com.hongang.superresume.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "app_info")
public class AppInfo implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * app名称
     */
    @Column(name = "app_name")
    private String appName;

    /**
     * app环境：1、沙箱环境；2、正式环境
     */
    @Column(name = "app_enviroment")
    private Integer appEnviroment;

    /**
     * 是否有效：1、有效；0、无效
     */
    @Column(name = "is_valid")
    private Integer isValid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * app描述
     */
    @Column(name = "app_desc")
    private String appDesc;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取app名称
     *
     * @return app_name - app名称
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 设置app名称
     *
     * @param appName app名称
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * 获取app环境：1、沙箱环境；2、正式环境
     *
     * @return app_enviroment - app环境：1、沙箱环境；2、正式环境
     */
    public Integer getAppEnviroment() {
        return appEnviroment;
    }

    /**
     * 设置app环境：1、沙箱环境；2、正式环境
     *
     * @param appEnviroment app环境：1、沙箱环境；2、正式环境
     */
    public void setAppEnviroment(Integer appEnviroment) {
        this.appEnviroment = appEnviroment;
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
     * 获取app描述
     *
     * @return app_desc - app描述
     */
    public String getAppDesc() {
        return appDesc;
    }

    /**
     * 设置app描述
     *
     * @param appDesc app描述
     */
    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc == null ? null : appDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appName=").append(appName);
        sb.append(", appEnviroment=").append(appEnviroment);
        sb.append(", isValid=").append(isValid);
        sb.append(", createTime=").append(createTime);
        sb.append(", appDesc=").append(appDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
