package com.hongang.superresume.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "resume_info")
public class ResumeInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 手机识别码

     */
    @Column(name = "iden_id")
    private String idenId;

    /**
     * 姓名

     */
    private String name;

    /**
     * 手机号码 
     */
    @Column(name = "phone_num")
    private String phoneNum;

    /**
     * 邮箱

     */
    private String email;

    /**
     * 性别

     */
    private String sex;

    /**
     * 年龄
     */
    private Byte age;

    /**
     * 教育经历
     */
    private String education;

    /**
     * 工作经历
     */
    private String work;

    /**
     * 其它
     */
    private String other;

    /**
     * 是否有效：1、有效；0、无效

     */
    @Column(name = "is_valid")
    private String isValid;

    /**
     * 是否编辑：0、否；1、是

     */
    @Column(name = "is_edit")
    private String isEdit;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取手机识别码

     *
     * @return iden_id - 手机识别码

     */
    public String getIdenId() {
        return idenId;
    }

    /**
     * 设置手机识别码

     *
     * @param idenId 手机识别码

     */
    public void setIdenId(String idenId) {
        this.idenId = idenId == null ? null : idenId.trim();
    }

    /**
     * 获取姓名

     *
     * @return name - 姓名

     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名

     *
     * @param name 姓名

     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取手机号码 
     *
     * @return phone_num - 手机号码 
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置手机号码 
     *
     * @param phoneNum 手机号码 
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    /**
     * 获取邮箱

     *
     * @return email - 邮箱

     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱

     *
     * @param email 邮箱

     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取性别

     *
     * @return sex - 性别

     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别

     *
     * @param sex 性别

     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Byte getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * 获取教育经历
     *
     * @return education - 教育经历
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设置教育经历
     *
     * @param education 教育经历
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * 获取工作经历
     *
     * @return work - 工作经历
     */
    public String getWork() {
        return work;
    }

    /**
     * 设置工作经历
     *
     * @param work 工作经历
     */
    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    /**
     * 获取其它
     *
     * @return other - 其它
     */
    public String getOther() {
        return other;
    }

    /**
     * 设置其它
     *
     * @param other 其它
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
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
     * 获取是否编辑：0、否；1、是

     *
     * @return is_edit - 是否编辑：0、否；1、是

     */
    public String getIsEdit() {
        return isEdit;
    }

    /**
     * 设置是否编辑：0、否；1、是

     *
     * @param isEdit 是否编辑：0、否；1、是

     */
    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit == null ? null : isEdit.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", idenId=").append(idenId);
        sb.append(", name=").append(name);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", email=").append(email);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", education=").append(education);
        sb.append(", work=").append(work);
        sb.append(", other=").append(other);
        sb.append(", isValid=").append(isValid);
        sb.append(", isEdit=").append(isEdit);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}