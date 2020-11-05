package com.hongang.superresume.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "word_collect")
public class WordCollect implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 手机识别码
     */
    @Column(name = "phone_iden")
    private String phoneIden;

    /**
     * 文档ID
     */
    @Column(name = "word_id")
    private Long wordId;

    /**
     * 是否有效：1、有效；0、无效
     */
    @Column(name = "is_valid")
    private String isValid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 收藏类型：1、视频；2、文档
     */
    @Column(name = "collect_type")
    private String collectType;

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
     * 获取手机识别码
     *
     * @return phone_iden - 手机识别码
     */
    public String getPhoneIden() {
        return phoneIden;
    }

    /**
     * 设置手机识别码
     *
     * @param phoneIden 手机识别码
     */
    public void setPhoneIden(String phoneIden) {
        this.phoneIden = phoneIden == null ? null : phoneIden.trim();
    }

    /**
     * 获取文档ID
     *
     * @return word_id - 文档ID
     */
    public Long getWordId() {
        return wordId;
    }

    /**
     * 设置文档ID
     *
     * @param wordId 文档ID
     */
    public void setWordId(Long wordId) {
        this.wordId = wordId;
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
     * 获取收藏类型：1、视频；2、文档
     *
     * @return collect_type - 收藏类型：1、视频；2、文档
     */
    public String getCollectType() {
        return collectType;
    }

    /**
     * 设置收藏类型：1、视频；2、文档
     *
     * @param collectType 收藏类型：1、视频；2、文档
     */
    public void setCollectType(String collectType) {
        this.collectType = collectType == null ? null : collectType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phoneIden=").append(phoneIden);
        sb.append(", wordId=").append(wordId);
        sb.append(", isValid=").append(isValid);
        sb.append(", createTime=").append(createTime);
        sb.append(", collectType=").append(collectType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
