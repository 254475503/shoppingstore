package cn.edu.jxufe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * searchinfo
 * @author 
 */
public class Searchinfo implements Serializable {
    /**
     * 主键
     */
    private Integer sId;

    /**
     * 所属关键字
     */
    private String searchKey;

    /**
     * 会员ID
     */
    private Integer memberId;

    /**
     * 搜索时间
     */
    private Date searchtime;

    private static final long serialVersionUID = 1L;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getSearchtime() {
        return searchtime;
    }

    public void setSearchtime(Date searchtime) {
        this.searchtime = searchtime;
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
        Searchinfo other = (Searchinfo) that;
        return (this.getsId() == null ? other.getsId() == null : this.getsId().equals(other.getsId()))
            && (this.getSearchKey() == null ? other.getSearchKey() == null : this.getSearchKey().equals(other.getSearchKey()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getSearchtime() == null ? other.getSearchtime() == null : this.getSearchtime().equals(other.getSearchtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getsId() == null) ? 0 : getsId().hashCode());
        result = prime * result + ((getSearchKey() == null) ? 0 : getSearchKey().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getSearchtime() == null) ? 0 : getSearchtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", searchKey=").append(searchKey);
        sb.append(", memberId=").append(memberId);
        sb.append(", searchtime=").append(searchtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}