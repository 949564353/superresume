package com.hongang.superresume.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "word_img")
public class WordImg implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 图片地址
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 图片类型：1、热门课程；2、推荐课程；3、文档图片
     */
    @Column(name = "img_type")
    private String imgType;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否有效：0、无效；1、有效
     */
    @Column(name = "is_valid")
    private String isValid;

    /**
     * app主键
     */
    @Column(name = "app_id")
    private Long appId;

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
     * 获取图片地址
     *
     * @return img_url - 图片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置图片地址
     *
     * @param imgUrl 图片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 获取图片类型：1、热门课程；2、推荐课程；3、文档图片
     *
     * @return img_type - 图片类型：1、热门课程；2、推荐课程；3、文档图片
     */
    public String getImgType() {
        return imgType;
    }

    /**
     * 设置图片类型：1、热门课程；2、推荐课程；3、文档图片
     *
     * @param imgType 图片类型：1、热门课程；2、推荐课程；3、文档图片
     */
    public void setImgType(String imgType) {
        this.imgType = imgType == null ? null : imgType.trim();
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
     * 获取是否有效：0、无效；1、有效
     *
     * @return is_valid - 是否有效：0、无效；1、有效
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效：0、无效；1、有效
     *
     * @param isValid 是否有效：0、无效；1、有效
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
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
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", imgType=").append(imgType);
        sb.append(", createTime=").append(createTime);
        sb.append(", isValid=").append(isValid);
        sb.append(", appId=").append(appId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
