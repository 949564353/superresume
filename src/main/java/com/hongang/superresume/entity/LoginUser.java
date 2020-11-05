package com.hongang.superresume.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "login_user")
public class LoginUser implements Serializable {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 手机号
     */
    @Column(name = "phone_num")
    private String phoneNum;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像地址
     */
    @Column(name = "head_pic_url")
    private String headPicUrl;

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
     * 昵称
     */
    @Column(name = "nike_name")
    private String nikeName;

    /**
     * 描述
     */
    @Column(name = "user_desc")
    private String userDesc;

    /**
     * 用户类型：
     */
    @Column(name = "user_type")
    private String userType;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取手机号
     *
     * @return phone_num - 手机号
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置手机号
     *
     * @param phoneNum 手机号
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取头像地址
     *
     * @return head_pic_url - 头像地址
     */
    public String getHeadPicUrl() {
        return headPicUrl;
    }

    /**
     * 设置头像地址
     *
     * @param headPicUrl 头像地址
     */
    public void setHeadPicUrl(String headPicUrl) {
        this.headPicUrl = headPicUrl == null ? null : headPicUrl.trim();
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
     * 获取昵称
     *
     * @return nike_name - 昵称
     */
    public String getNikeName() {
        return nikeName;
    }

    /**
     * 设置昵称
     *
     * @param nikeName 昵称
     */
    public void setNikeName(String nikeName) {
        this.nikeName = nikeName == null ? null : nikeName.trim();
    }

    /**
     * 获取描述
     *
     * @return user_desc - 描述
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * 设置描述
     *
     * @param userDesc 描述
     */
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    /**
     * 获取用户类型：
     *
     * @return user_type - 用户类型：
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型：
     *
     * @param userType 用户类型：
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", password=").append(password);
        sb.append(", headPicUrl=").append(headPicUrl);
        sb.append(", isValid=").append(isValid);
        sb.append(", createTime=").append(createTime);
        sb.append(", nikeName=").append(nikeName);
        sb.append(", userDesc=").append(userDesc);
        sb.append(", userType=").append(userType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
