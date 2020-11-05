package com.hongang.superresume.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "app_search")
public class AppSearch implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * app的主键
     */
    @Column(name = "app_id")
    private Long appId;

    /**
     * 查询内容
     */
    private String content;

    /**
     * 查询时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 查询手机
     */
    @Column(name = "phone_iden")
    private String phoneIden;

    /**
     * 是否有效：1、有效；0、无效
     */
    @Column(name = "is_valid")
    private String isValid;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取查询内容
     *
     * @return content - 查询内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置查询内容
     *
     * @param content 查询内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取查询时间
     *
     * @return create_time - 查询时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置查询时间
     *
     * @param createTime 查询时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取查询手机
     *
     * @return phone_iden - 查询手机
     */
    public String getPhoneIden() {
        return phoneIden;
    }

    /**
     * 设置查询手机
     *
     * @param phoneIden 查询手机
     */
    public void setPhoneIden(String phoneIden) {
        this.phoneIden = phoneIden == null ? null : phoneIden.trim();
    }

    /**
     * 获取是否有效：1、有效；0、无效
     *
     * @return is_valid - 是否有效：1、有效；0、无效
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效：1、有效；0、无效
     *
     * @param isValid 是否有效：1、有效；0、无效
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", phoneIden=").append(phoneIden);
        sb.append(", isValid=").append(isValid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
