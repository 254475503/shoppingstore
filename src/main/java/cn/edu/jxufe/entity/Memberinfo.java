package cn.edu.jxufe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * memberinfo
 * @author 
 */
public class Memberinfo implements Serializable {
    /**
     * 会员id
     */
    private Integer memberId;

    /**
     * 手机号
     */
    private String memberMobile;

    /**
     * 会员昵称
     */
    private String memberName;

    /**
     * 生日
     */
    private Date memberBirthday;

    /**
     * 会员密码
     */
    private String memberPasswd;

    /**
     * 会员邮箱
     */
    private String memberEmail;

    /**
     * 微信OPENDID
     */
    private String memberWw;

    /**
     * 登录次数
     */
    private Integer memberLoginNum;

    /**
     * 会员注册时间
     */
    private Date createTime;

    /**
     * 当前登录时间
     */
    private Date memberLoginTime;

    /**
     * 上次登录时间
     */
    private Date memberOldLoginTime;

    /**
     * 当前登录ip
     */
    private String memberLoginIp;

    /**
     * 上次登录ip
     */
    private String memberOldLoginIp;

    /**
     * 会员是否有发布商品权限 1为开启 0为关闭
     */
    private Boolean isSell;

    /**
     * 会员的开启状态 1为开启 0为关闭
     */
    private Boolean memberState;

    /**
     * 会员头像
     */
    private String memberPic;

    private static final long serialVersionUID = 1L;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(Date memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public String getMemberPasswd() {
        return memberPasswd;
    }

    public void setMemberPasswd(String memberPasswd) {
        this.memberPasswd = memberPasswd;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberWw() {
        return memberWw;
    }

    public void setMemberWw(String memberWw) {
        this.memberWw = memberWw;
    }

    public Integer getMemberLoginNum() {
        return memberLoginNum;
    }

    public void setMemberLoginNum(Integer memberLoginNum) {
        this.memberLoginNum = memberLoginNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getMemberLoginTime() {
        return memberLoginTime;
    }

    public void setMemberLoginTime(Date memberLoginTime) {
        this.memberLoginTime = memberLoginTime;
    }

    public Date getMemberOldLoginTime() {
        return memberOldLoginTime;
    }

    public void setMemberOldLoginTime(Date memberOldLoginTime) {
        this.memberOldLoginTime = memberOldLoginTime;
    }

    public String getMemberLoginIp() {
        return memberLoginIp;
    }

    public void setMemberLoginIp(String memberLoginIp) {
        this.memberLoginIp = memberLoginIp;
    }

    public String getMemberOldLoginIp() {
        return memberOldLoginIp;
    }

    public void setMemberOldLoginIp(String memberOldLoginIp) {
        this.memberOldLoginIp = memberOldLoginIp;
    }

    public Boolean getIsSell() {
        return isSell;
    }

    public void setIsSell(Boolean isSell) {
        this.isSell = isSell;
    }

    public Boolean getMemberState() {
        return memberState;
    }

    public void setMemberState(Boolean memberState) {
        this.memberState = memberState;
    }

    public String getMemberPic() {
        return memberPic;
    }

    public void setMemberPic(String memberPic) {
        this.memberPic = memberPic;
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
        Memberinfo other = (Memberinfo) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getMemberMobile() == null ? other.getMemberMobile() == null : this.getMemberMobile().equals(other.getMemberMobile()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getMemberBirthday() == null ? other.getMemberBirthday() == null : this.getMemberBirthday().equals(other.getMemberBirthday()))
            && (this.getMemberPasswd() == null ? other.getMemberPasswd() == null : this.getMemberPasswd().equals(other.getMemberPasswd()))
            && (this.getMemberEmail() == null ? other.getMemberEmail() == null : this.getMemberEmail().equals(other.getMemberEmail()))
            && (this.getMemberWw() == null ? other.getMemberWw() == null : this.getMemberWw().equals(other.getMemberWw()))
            && (this.getMemberLoginNum() == null ? other.getMemberLoginNum() == null : this.getMemberLoginNum().equals(other.getMemberLoginNum()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getMemberLoginTime() == null ? other.getMemberLoginTime() == null : this.getMemberLoginTime().equals(other.getMemberLoginTime()))
            && (this.getMemberOldLoginTime() == null ? other.getMemberOldLoginTime() == null : this.getMemberOldLoginTime().equals(other.getMemberOldLoginTime()))
            && (this.getMemberLoginIp() == null ? other.getMemberLoginIp() == null : this.getMemberLoginIp().equals(other.getMemberLoginIp()))
            && (this.getMemberOldLoginIp() == null ? other.getMemberOldLoginIp() == null : this.getMemberOldLoginIp().equals(other.getMemberOldLoginIp()))
            && (this.getIsSell() == null ? other.getIsSell() == null : this.getIsSell().equals(other.getIsSell()))
            && (this.getMemberState() == null ? other.getMemberState() == null : this.getMemberState().equals(other.getMemberState()))
            && (this.getMemberPic() == null ? other.getMemberPic() == null : this.getMemberPic().equals(other.getMemberPic()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getMemberMobile() == null) ? 0 : getMemberMobile().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getMemberBirthday() == null) ? 0 : getMemberBirthday().hashCode());
        result = prime * result + ((getMemberPasswd() == null) ? 0 : getMemberPasswd().hashCode());
        result = prime * result + ((getMemberEmail() == null) ? 0 : getMemberEmail().hashCode());
        result = prime * result + ((getMemberWw() == null) ? 0 : getMemberWw().hashCode());
        result = prime * result + ((getMemberLoginNum() == null) ? 0 : getMemberLoginNum().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getMemberLoginTime() == null) ? 0 : getMemberLoginTime().hashCode());
        result = prime * result + ((getMemberOldLoginTime() == null) ? 0 : getMemberOldLoginTime().hashCode());
        result = prime * result + ((getMemberLoginIp() == null) ? 0 : getMemberLoginIp().hashCode());
        result = prime * result + ((getMemberOldLoginIp() == null) ? 0 : getMemberOldLoginIp().hashCode());
        result = prime * result + ((getIsSell() == null) ? 0 : getIsSell().hashCode());
        result = prime * result + ((getMemberState() == null) ? 0 : getMemberState().hashCode());
        result = prime * result + ((getMemberPic() == null) ? 0 : getMemberPic().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberId=").append(memberId);
        sb.append(", memberMobile=").append(memberMobile);
        sb.append(", memberName=").append(memberName);
        sb.append(", memberBirthday=").append(memberBirthday);
        sb.append(", memberPasswd=").append(memberPasswd);
        sb.append(", memberEmail=").append(memberEmail);
        sb.append(", memberWw=").append(memberWw);
        sb.append(", memberLoginNum=").append(memberLoginNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberLoginTime=").append(memberLoginTime);
        sb.append(", memberOldLoginTime=").append(memberOldLoginTime);
        sb.append(", memberLoginIp=").append(memberLoginIp);
        sb.append(", memberOldLoginIp=").append(memberOldLoginIp);
        sb.append(", isSell=").append(isSell);
        sb.append(", memberState=").append(memberState);
        sb.append(", memberPic=").append(memberPic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}