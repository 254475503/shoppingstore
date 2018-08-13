package cn.edu.jxufe.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * articleinfo
 * @author 
 */
public class Articleinfo implements Serializable {
    /**
     * 索引id
     */
    private Integer articleId;

    /**
     * 文章图片
     */
    private String articlePicUrl;

    /**
     * 是否显示，0为否，1为是，默认为1
     */
    private Boolean articleShow;

    /**
     * 标题
     */
    private String articleTitle;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 阅读量
     */
    private Long amountOfReading;

    /**
     * 内容
     */
    private String articleContent;

    private static final long serialVersionUID = 1L;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticlePicUrl() {
        return articlePicUrl;
    }

    public void setArticlePicUrl(String articlePicUrl) {
        this.articlePicUrl = articlePicUrl;
    }

    public Boolean getArticleShow() {
        return articleShow;
    }

    public void setArticleShow(Boolean articleShow) {
        this.articleShow = articleShow;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getAmountOfReading() {
        return amountOfReading;
    }

    public void setAmountOfReading(Long amountOfReading) {
        this.amountOfReading = amountOfReading;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
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
        Articleinfo other = (Articleinfo) that;
        return (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getArticlePicUrl() == null ? other.getArticlePicUrl() == null : this.getArticlePicUrl().equals(other.getArticlePicUrl()))
            && (this.getArticleShow() == null ? other.getArticleShow() == null : this.getArticleShow().equals(other.getArticleShow()))
            && (this.getArticleTitle() == null ? other.getArticleTitle() == null : this.getArticleTitle().equals(other.getArticleTitle()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getAmountOfReading() == null ? other.getAmountOfReading() == null : this.getAmountOfReading().equals(other.getAmountOfReading()))
            && (this.getArticleContent() == null ? other.getArticleContent() == null : this.getArticleContent().equals(other.getArticleContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getArticlePicUrl() == null) ? 0 : getArticlePicUrl().hashCode());
        result = prime * result + ((getArticleShow() == null) ? 0 : getArticleShow().hashCode());
        result = prime * result + ((getArticleTitle() == null) ? 0 : getArticleTitle().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getAmountOfReading() == null) ? 0 : getAmountOfReading().hashCode());
        result = prime * result + ((getArticleContent() == null) ? 0 : getArticleContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", articlePicUrl=").append(articlePicUrl);
        sb.append(", articleShow=").append(articleShow);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", amountOfReading=").append(amountOfReading);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}