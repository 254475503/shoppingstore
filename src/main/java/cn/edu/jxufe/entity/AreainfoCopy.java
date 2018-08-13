package cn.edu.jxufe.entity;

import java.io.Serializable;

/**
 * areainfo_copy
 * @author 
 */
public class AreainfoCopy implements Serializable {
    /**
     * 索引ID
     */
    private Integer areaId;

    /**
     * 地区名称
     */
    private String areaName;

    /**
     * 地区父ID
     */
    private Integer areaParentId;

    /**
     * 排序
     */
    private Byte areaSort;

    /**
     * 地区深度，从1开始
     */
    private Boolean areaDeep;

    /**
     * 字母索引
     */
    private String groupid;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改时间
     */
    private Long updateTime;

    /**
     * 是否热门（1代表热门城市）
     */
    private Integer ishot;

    private static final long serialVersionUID = 1L;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getAreaParentId() {
        return areaParentId;
    }

    public void setAreaParentId(Integer areaParentId) {
        this.areaParentId = areaParentId;
    }

    public Byte getAreaSort() {
        return areaSort;
    }

    public void setAreaSort(Byte areaSort) {
        this.areaSort = areaSort;
    }

    public Boolean getAreaDeep() {
        return areaDeep;
    }

    public void setAreaDeep(Boolean areaDeep) {
        this.areaDeep = areaDeep;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIshot() {
        return ishot;
    }

    public void setIshot(Integer ishot) {
        this.ishot = ishot;
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
        AreainfoCopy other = (AreainfoCopy) that;
        return (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getAreaName() == null ? other.getAreaName() == null : this.getAreaName().equals(other.getAreaName()))
            && (this.getAreaParentId() == null ? other.getAreaParentId() == null : this.getAreaParentId().equals(other.getAreaParentId()))
            && (this.getAreaSort() == null ? other.getAreaSort() == null : this.getAreaSort().equals(other.getAreaSort()))
            && (this.getAreaDeep() == null ? other.getAreaDeep() == null : this.getAreaDeep().equals(other.getAreaDeep()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIshot() == null ? other.getIshot() == null : this.getIshot().equals(other.getIshot()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getAreaName() == null) ? 0 : getAreaName().hashCode());
        result = prime * result + ((getAreaParentId() == null) ? 0 : getAreaParentId().hashCode());
        result = prime * result + ((getAreaSort() == null) ? 0 : getAreaSort().hashCode());
        result = prime * result + ((getAreaDeep() == null) ? 0 : getAreaDeep().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIshot() == null) ? 0 : getIshot().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", areaId=").append(areaId);
        sb.append(", areaName=").append(areaName);
        sb.append(", areaParentId=").append(areaParentId);
        sb.append(", areaSort=").append(areaSort);
        sb.append(", areaDeep=").append(areaDeep);
        sb.append(", groupid=").append(groupid);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", ishot=").append(ishot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}