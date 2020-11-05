package com.hongang.superresume.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "word_type")
public class WordType implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 类型编码
     */
    @Column(name = "type_code")
    private String typeCode;

    /**
     * 类型名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 排序编号
     */
    @Column(name = "sort_num")
    private Byte sortNum;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否有效
     */
    @Column(name = "is_valid")
    private String isValid;

    /**
     * app的主键
     */
    @Column(name = "app_id")
    private Long appId;

    /**
     * 主类型：1、视频；2、文档
     */
    @Column(name = "main_type")
    private String mainType;

    /**
     * 是否为vip：1、是；0、否
     */
    @Column(name = "is_vip")
    private String isVip;

    /**
     * 类型图片
     */
    @Column(name = "type_img")
    private String typeImg;

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
     * 获取类型编码
     *
     * @return type_code - 类型编码
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * 设置类型编码
     *
     * @param typeCode 类型编码
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    /**
     * 获取类型名称
     *
     * @return type_name - 类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置类型名称
     *
     * @param typeName 类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * 获取排序编号
     *
     * @return sort_num - 排序编号
     */
    public Byte getSortNum() {
        return sortNum;
    }

    /**
     * 设置排序编号
     *
     * @param sortNum 排序编号
     */
    public void setSortNum(Byte sortNum) {
        this.sortNum = sortNum;
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
     * 获取是否有效
     *
     * @return is_valid - 是否有效
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效
     *
     * @param isValid 是否有效
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
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
     * 获取主类型：1、视频；2、文档
     *
     * @return main_type - 主类型：1、视频；2、文档
     */
    public String getMainType() {
        return mainType;
    }

    /**
     * 设置主类型：1、视频；2、文档
     *
     * @param mainType 主类型：1、视频；2、文档
     */
    public void setMainType(String mainType) {
        this.mainType = mainType == null ? null : mainType.trim();
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

    /**
     * 获取类型图片
     *
     * @return type_img - 类型图片
     */
    public String getTypeImg() {
        return typeImg;
    }

    /**
     * 设置类型图片
     *
     * @param typeImg 类型图片
     */
    public void setTypeImg(String typeImg) {
        this.typeImg = typeImg == null ? null : typeImg.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeCode=").append(typeCode);
        sb.append(", typeName=").append(typeName);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", isValid=").append(isValid);
        sb.append(", appId=").append(appId);
        sb.append(", mainType=").append(mainType);
        sb.append(", isVip=").append(isVip);
        sb.append(", typeImg=").append(typeImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
