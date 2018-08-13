package cn.edu.jxufe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * advertisement
 * @author 
 */
public class Advertisement implements Serializable {
    /**
     * 主键
     */
    private Integer advId;

    /**
     * 广告的标题
     */
    private String advTitle;

    /**
     * 广告的图片路径
     */
    private String advPicUrl;

    /**
     * 广告是否禁用
     */
    private Short advOffline;

    /**
     * 广告的序号
     */
    private Integer advOrder;

    /**
     * 点击广告后跳转的地址
     */
    private String advLinkUrl;

    /**
     * 广告的创建时间
     */
    private Date advCratetime;

    /**
     * 广告的修改时间
     */
    private Date advUpdatetime;

    private static final long serialVersionUID = 1L;

    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }

    public String getAdvTitle() {
        return advTitle;
    }

    public void setAdvTitle(String advTitle) {
        this.advTitle = advTitle;
    }

    public String getAdvPicUrl() {
        return advPicUrl;
    }

    public void setAdvPicUrl(String advPicUrl) {
        this.advPicUrl = advPicUrl;
    }

    public Short getAdvOffline() {
        return advOffline;
    }

    public void setAdvOffline(Short advOffline) {
        this.advOffline = advOffline;
    }

    public Integer getAdvOrder() {
        return advOrder;
    }

    public void setAdvOrder(Integer advOrder) {
        this.advOrder = advOrder;
    }

    public String getAdvLinkUrl() {
        return advLinkUrl;
    }

    public void setAdvLinkUrl(String advLinkUrl) {
        this.advLinkUrl = advLinkUrl;
    }

    public Date getAdvCratetime() {
        return advCratetime;
    }

    public void setAdvCratetime(Date advCratetime) {
        this.advCratetime = advCratetime;
    }

    public Date getAdvUpdatetime() {
        return advUpdatetime;
    }

    public void setAdvUpdatetime(Date advUpdatetime) {
        this.advUpdatetime = advUpdatetime;
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
        Advertisement other = (Advertisement) that;
        return (this.getAdvId() == null ? other.getAdvId() == null : this.getAdvId().equals(other.getAdvId()))
            && (this.getAdvTitle() == null ? other.getAdvTitle() == null : this.getAdvTitle().equals(other.getAdvTitle()))
            && (this.getAdvPicUrl() == null ? other.getAdvPicUrl() == null : this.getAdvPicUrl().equals(other.getAdvPicUrl()))
            && (this.getAdvOffline() == null ? other.getAdvOffline() == null : this.getAdvOffline().equals(other.getAdvOffline()))
            && (this.getAdvOrder() == null ? other.getAdvOrder() == null : this.getAdvOrder().equals(other.getAdvOrder()))
            && (this.getAdvLinkUrl() == null ? other.getAdvLinkUrl() == null : this.getAdvLinkUrl().equals(other.getAdvLinkUrl()))
            && (this.getAdvCratetime() == null ? other.getAdvCratetime() == null : this.getAdvCratetime().equals(other.getAdvCratetime()))
            && (this.getAdvUpdatetime() == null ? other.getAdvUpdatetime() == null : this.getAdvUpdatetime().equals(other.getAdvUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdvId() == null) ? 0 : getAdvId().hashCode());
        result = prime * result + ((getAdvTitle() == null) ? 0 : getAdvTitle().hashCode());
        result = prime * result + ((getAdvPicUrl() == null) ? 0 : getAdvPicUrl().hashCode());
        result = prime * result + ((getAdvOffline() == null) ? 0 : getAdvOffline().hashCode());
        result = prime * result + ((getAdvOrder() == null) ? 0 : getAdvOrder().hashCode());
        result = prime * result + ((getAdvLinkUrl() == null) ? 0 : getAdvLinkUrl().hashCode());
        result = prime * result + ((getAdvCratetime() == null) ? 0 : getAdvCratetime().hashCode());
        result = prime * result + ((getAdvUpdatetime() == null) ? 0 : getAdvUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", advId=").append(advId);
        sb.append(", advTitle=").append(advTitle);
        sb.append(", advPicUrl=").append(advPicUrl);
        sb.append(", advOffline=").append(advOffline);
        sb.append(", advOrder=").append(advOrder);
        sb.append(", advLinkUrl=").append(advLinkUrl);
        sb.append(", advCratetime=").append(advCratetime);
        sb.append(", advUpdatetime=").append(advUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}