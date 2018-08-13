package cn.edu.jxufe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * goodsinfo
 * @author 
 */
public class Goodsinfo implements Serializable {
    /**
     * 商品索引id
     */
    private Integer goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品副标题
     */
    private String goodsSubtitle;

    /**
     * 商品分类id
     */
    private Integer gcId;

    /**
     * 商品分类名称
     */
    private String gcName;

    /**
     * 商品原价
     */
    private Double goodsPrice;

    /**
     * 商品现价
     */
    private Double goodsSellPrice;

    /**
     * 商品默认封面图片
     */
    private String goodsImage;

    /**
     * 商品浏览数
     */
    private Integer goodsClick;

    /**
     * 商品状态，0开启，1违规下架
     */
    private Integer goodsState;

    /**
     * 商品推荐
     */
    private Integer goodsCommend;

    /**
     * 商品违规下架原因
     */
    private String goodsCloseReason;

    /**
     * 评论次数
     */
    private Integer commentNum;

    /**
     * 商品点赞量
     */
    private Long thumbsUpNum;

    /**
     * 售出数量
     */
    private Integer salenumNum;

    /**
     * 商品收藏数量
     */
    private Integer goodsCollectNum;

    /**
     * 是否删除 0:未删除  1:已删除
     */
    private Integer isDel;

    /**
     * 上传者
     */
    private Integer memberId;

    /**
     * 商品库存
     */
    private Integer stock;

    /**
     * 商品修改时间
     */
    private Date updateTime;

    /**
     * 商品上传时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsSubtitle() {
        return goodsSubtitle;
    }

    public void setGoodsSubtitle(String goodsSubtitle) {
        this.goodsSubtitle = goodsSubtitle;
    }

    public Integer getGcId() {
        return gcId;
    }

    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Double getGoodsSellPrice() {
        return goodsSellPrice;
    }

    public void setGoodsSellPrice(Double goodsSellPrice) {
        this.goodsSellPrice = goodsSellPrice;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public Integer getGoodsClick() {
        return goodsClick;
    }

    public void setGoodsClick(Integer goodsClick) {
        this.goodsClick = goodsClick;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public Integer getGoodsCommend() {
        return goodsCommend;
    }

    public void setGoodsCommend(Integer goodsCommend) {
        this.goodsCommend = goodsCommend;
    }

    public String getGoodsCloseReason() {
        return goodsCloseReason;
    }

    public void setGoodsCloseReason(String goodsCloseReason) {
        this.goodsCloseReason = goodsCloseReason;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Long getThumbsUpNum() {
        return thumbsUpNum;
    }

    public void setThumbsUpNum(Long thumbsUpNum) {
        this.thumbsUpNum = thumbsUpNum;
    }

    public Integer getSalenumNum() {
        return salenumNum;
    }

    public void setSalenumNum(Integer salenumNum) {
        this.salenumNum = salenumNum;
    }

    public Integer getGoodsCollectNum() {
        return goodsCollectNum;
    }

    public void setGoodsCollectNum(Integer goodsCollectNum) {
        this.goodsCollectNum = goodsCollectNum;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        Goodsinfo other = (Goodsinfo) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsSubtitle() == null ? other.getGoodsSubtitle() == null : this.getGoodsSubtitle().equals(other.getGoodsSubtitle()))
            && (this.getGcId() == null ? other.getGcId() == null : this.getGcId().equals(other.getGcId()))
            && (this.getGcName() == null ? other.getGcName() == null : this.getGcName().equals(other.getGcName()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsSellPrice() == null ? other.getGoodsSellPrice() == null : this.getGoodsSellPrice().equals(other.getGoodsSellPrice()))
            && (this.getGoodsImage() == null ? other.getGoodsImage() == null : this.getGoodsImage().equals(other.getGoodsImage()))
            && (this.getGoodsClick() == null ? other.getGoodsClick() == null : this.getGoodsClick().equals(other.getGoodsClick()))
            && (this.getGoodsState() == null ? other.getGoodsState() == null : this.getGoodsState().equals(other.getGoodsState()))
            && (this.getGoodsCommend() == null ? other.getGoodsCommend() == null : this.getGoodsCommend().equals(other.getGoodsCommend()))
            && (this.getGoodsCloseReason() == null ? other.getGoodsCloseReason() == null : this.getGoodsCloseReason().equals(other.getGoodsCloseReason()))
            && (this.getCommentNum() == null ? other.getCommentNum() == null : this.getCommentNum().equals(other.getCommentNum()))
            && (this.getThumbsUpNum() == null ? other.getThumbsUpNum() == null : this.getThumbsUpNum().equals(other.getThumbsUpNum()))
            && (this.getSalenumNum() == null ? other.getSalenumNum() == null : this.getSalenumNum().equals(other.getSalenumNum()))
            && (this.getGoodsCollectNum() == null ? other.getGoodsCollectNum() == null : this.getGoodsCollectNum().equals(other.getGoodsCollectNum()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsSubtitle() == null) ? 0 : getGoodsSubtitle().hashCode());
        result = prime * result + ((getGcId() == null) ? 0 : getGcId().hashCode());
        result = prime * result + ((getGcName() == null) ? 0 : getGcName().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsSellPrice() == null) ? 0 : getGoodsSellPrice().hashCode());
        result = prime * result + ((getGoodsImage() == null) ? 0 : getGoodsImage().hashCode());
        result = prime * result + ((getGoodsClick() == null) ? 0 : getGoodsClick().hashCode());
        result = prime * result + ((getGoodsState() == null) ? 0 : getGoodsState().hashCode());
        result = prime * result + ((getGoodsCommend() == null) ? 0 : getGoodsCommend().hashCode());
        result = prime * result + ((getGoodsCloseReason() == null) ? 0 : getGoodsCloseReason().hashCode());
        result = prime * result + ((getCommentNum() == null) ? 0 : getCommentNum().hashCode());
        result = prime * result + ((getThumbsUpNum() == null) ? 0 : getThumbsUpNum().hashCode());
        result = prime * result + ((getSalenumNum() == null) ? 0 : getSalenumNum().hashCode());
        result = prime * result + ((getGoodsCollectNum() == null) ? 0 : getGoodsCollectNum().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsSubtitle=").append(goodsSubtitle);
        sb.append(", gcId=").append(gcId);
        sb.append(", gcName=").append(gcName);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsSellPrice=").append(goodsSellPrice);
        sb.append(", goodsImage=").append(goodsImage);
        sb.append(", goodsClick=").append(goodsClick);
        sb.append(", goodsState=").append(goodsState);
        sb.append(", goodsCommend=").append(goodsCommend);
        sb.append(", goodsCloseReason=").append(goodsCloseReason);
        sb.append(", commentNum=").append(commentNum);
        sb.append(", thumbsUpNum=").append(thumbsUpNum);
        sb.append(", salenumNum=").append(salenumNum);
        sb.append(", goodsCollectNum=").append(goodsCollectNum);
        sb.append(", isDel=").append(isDel);
        sb.append(", memberId=").append(memberId);
        sb.append(", stock=").append(stock);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}