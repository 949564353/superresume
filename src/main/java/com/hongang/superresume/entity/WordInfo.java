package com.hongang.superresume.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "word_info")
public class WordInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 文档类别
     */
    @Column(name = "type_id")
    private Long typeId;

    /**
     * 文档名称
     */
    @Column(name = "word_name")
    private String wordName;

    /**
     * 文档url
     */
    @Column(name = "word_url")
    private String wordUrl;

    /**
     * 浏览次数
     */
    @Column(name = "word_view")
    private Long wordView;

    /**
     * 下载次数
     */
    @Column(name = "word_download")
    private Long wordDownload;

    /**
     * 文档大小
     */
    @Column(name = "word_size")
    private String wordSize;

    /**
     * 文档简介
     */
    @Column(name = "word_short")
    private String wordShort;

    @Column(name = "is_valid")
    private String isValid;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否为vip：1、是；0、否
     */
    @Column(name = "is_vip")
    private String isVip;

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
     * 获取文档类别
     *
     * @return type_id - 文档类别
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 设置文档类别
     *
     * @param typeId 文档类别
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取文档名称
     *
     * @return word_name - 文档名称
     */
    public String getWordName() {
        return wordName;
    }

    /**
     * 设置文档名称
     *
     * @param wordName 文档名称
     */
    public void setWordName(String wordName) {
        this.wordName = wordName == null ? null : wordName.trim();
    }

    /**
     * 获取文档url
     *
     * @return word_url - 文档url
     */
    public String getWordUrl() {
        return wordUrl;
    }

    /**
     * 设置文档url
     *
     * @param wordUrl 文档url
     */
    public void setWordUrl(String wordUrl) {
        this.wordUrl = wordUrl == null ? null : wordUrl.trim();
    }

    /**
     * 获取浏览次数
     *
     * @return word_view - 浏览次数
     */
    public Long getWordView() {
        return wordView;
    }

    /**
     * 设置浏览次数
     *
     * @param wordView 浏览次数
     */
    public void setWordView(Long wordView) {
        this.wordView = wordView;
    }

    /**
     * 获取下载次数
     *
     * @return word_download - 下载次数
     */
    public Long getWordDownload() {
        return wordDownload;
    }

    /**
     * 设置下载次数
     *
     * @param wordDownload 下载次数
     */
    public void setWordDownload(Long wordDownload) {
        this.wordDownload = wordDownload;
    }

    /**
     * 获取文档大小
     *
     * @return word_size - 文档大小
     */
    public String getWordSize() {
        return wordSize;
    }

    /**
     * 设置文档大小
     *
     * @param wordSize 文档大小
     */
    public void setWordSize(String wordSize) {
        this.wordSize = wordSize == null ? null : wordSize.trim();
    }

    /**
     * 获取文档简介
     *
     * @return word_short - 文档简介
     */
    public String getWordShort() {
        return wordShort;
    }

    /**
     * 设置文档简介
     *
     * @param wordShort 文档简介
     */
    public void setWordShort(String wordShort) {
        this.wordShort = wordShort == null ? null : wordShort.trim();
    }

    /**
     * @return is_valid
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * @param isValid
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否为vip：1、是；0、否
     *
     * @return is_vip - 是否为vip：1、是；0、否
     */
    public String getIsVip() {
        return isVip;
    }

    /**
     * 设置是否为vip：1、是；0、否
     *
     * @param isVip 是否为vip：1、是；0、否
     */
    public void setIsVip(String isVip) {
        this.isVip = isVip == null ? null : isVip.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeId=").append(typeId);
        sb.append(", wordName=").append(wordName);
        sb.append(", wordUrl=").append(wordUrl);
        sb.append(", wordView=").append(wordView);
        sb.append(", wordDownload=").append(wordDownload);
        sb.append(", wordSize=").append(wordSize);
        sb.append(", wordShort=").append(wordShort);
        sb.append(", isValid=").append(isValid);
        sb.append(", createTime=").append(createTime);
        sb.append(", isVip=").append(isVip);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
