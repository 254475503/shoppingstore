package cn.edu.jxufe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * admin
 * @author 
 */
public class Admin implements Serializable {
    /**
     * 管理员ID
     */
    private Integer adminId;

    /**
     * 管理员名称
     */
    private String adminName;

    /**
     * 管理员密码
     */
    private String adminPassword;

    /**
     * 登录次数
     */
    private Integer adminLoginNum;

    /**
     * 是否超级管理员
     */
    private Integer adminIsSuper;

    /**
     * 是否禁用
     */
    private Integer isDisable;

    /**
     * 登录时间
     */
    private Date adminLoginTime;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改时间
     */
    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getAdminLoginNum() {
        return adminLoginNum;
    }

    public void setAdminLoginNum(Integer adminLoginNum) {
        this.adminLoginNum = adminLoginNum;
    }

    public Integer getAdminIsSuper() {
        return adminIsSuper;
    }

    public void setAdminIsSuper(Integer adminIsSuper) {
        this.adminIsSuper = adminIsSuper;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    public Date getAdminLoginTime() {
        return adminLoginTime;
    }

    public void setAdminLoginTime(Date adminLoginTime) {
        this.adminLoginTime = adminLoginTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Admin other = (Admin) that;
        return (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()))
            && (this.getAdminName() == null ? other.getAdminName() == null : this.getAdminName().equals(other.getAdminName()))
            && (this.getAdminPassword() == null ? other.getAdminPassword() == null : this.getAdminPassword().equals(other.getAdminPassword()))
            && (this.getAdminLoginNum() == null ? other.getAdminLoginNum() == null : this.getAdminLoginNum().equals(other.getAdminLoginNum()))
            && (this.getAdminIsSuper() == null ? other.getAdminIsSuper() == null : this.getAdminIsSuper().equals(other.getAdminIsSuper()))
            && (this.getIsDisable() == null ? other.getIsDisable() == null : this.getIsDisable().equals(other.getIsDisable()))
            && (this.getAdminLoginTime() == null ? other.getAdminLoginTime() == null : this.getAdminLoginTime().equals(other.getAdminLoginTime()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getAdminName() == null) ? 0 : getAdminName().hashCode());
        result = prime * result + ((getAdminPassword() == null) ? 0 : getAdminPassword().hashCode());
        result = prime * result + ((getAdminLoginNum() == null) ? 0 : getAdminLoginNum().hashCode());
        result = prime * result + ((getAdminIsSuper() == null) ? 0 : getAdminIsSuper().hashCode());
        result = prime * result + ((getIsDisable() == null) ? 0 : getIsDisable().hashCode());
        result = prime * result + ((getAdminLoginTime() == null) ? 0 : getAdminLoginTime().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", adminName=").append(adminName);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", adminLoginNum=").append(adminLoginNum);
        sb.append(", adminIsSuper=").append(adminIsSuper);
        sb.append(", isDisable=").append(isDisable);
        sb.append(", adminLoginTime=").append(adminLoginTime);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}