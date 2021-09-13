package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceReviewSummaryオブジェクトは、ページフィードアイテムの審査成績、状況サマリーを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceReviewSummary object retains the examination results of the page feed item, the situation summary acquisition result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceReviewSummaryオブジェクトは、ページフィードアイテムの審査成績、状況サマリーを格納します。</div> <div lang=\"en\">PageFeedItemServiceReviewSummary object retains the examination results of the page feed item, the situation summary acquisition result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceReviewSummary   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("approvedCount")
  private Long approvedCount = null;

  @JsonProperty("approvedWithReviewCount")
  private Long approvedWithReviewCount = null;

  @JsonProperty("entityCount")
  private Long entityCount = null;

  @JsonProperty("feedId")
  private Long feedId = null;

  @JsonProperty("postDisapprovedCount")
  private Long postDisapprovedCount = null;

  @JsonProperty("preDisapprovedCount")
  private Long preDisapprovedCount = null;

  @JsonProperty("reviewCount")
  private Long reviewCount = null;

  public PageFeedItemServiceReviewSummary accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public PageFeedItemServiceReviewSummary approvedCount(Long approvedCount) {
    this.approvedCount = approvedCount;
    return this;
  }

  /**
   * <div lang=\"ja\">承認済みの件数</div> <div lang=\"en\">Count of approved</div> 
   * @return approvedCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">承認済みの件数</div> <div lang=\"en\">Count of approved</div> ")


  public Long getApprovedCount() {
    return approvedCount;
  }

  public void setApprovedCount(Long approvedCount) {
    this.approvedCount = approvedCount;
  }

  public PageFeedItemServiceReviewSummary approvedWithReviewCount(Long approvedWithReviewCount) {
    this.approvedWithReviewCount = approvedWithReviewCount;
    return this;
  }

  /**
   * <div lang=\"ja\">編集内容審査中の件数</div> <div lang=\"en\">Count of approved with review</div> 
   * @return approvedWithReviewCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">編集内容審査中の件数</div> <div lang=\"en\">Count of approved with review</div> ")


  public Long getApprovedWithReviewCount() {
    return approvedWithReviewCount;
  }

  public void setApprovedWithReviewCount(Long approvedWithReviewCount) {
    this.approvedWithReviewCount = approvedWithReviewCount;
  }

  public PageFeedItemServiceReviewSummary entityCount(Long entityCount) {
    this.entityCount = entityCount;
    return this;
  }

  /**
   * <div lang=\"ja\">フィードフォルダ内にあるページフィードアイテムの総件数</div> <div lang=\"en\">Total count of page feed item in feed folder</div> 
   * @return entityCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードフォルダ内にあるページフィードアイテムの総件数</div> <div lang=\"en\">Total count of page feed item in feed folder</div> ")


  public Long getEntityCount() {
    return entityCount;
  }

  public void setEntityCount(Long entityCount) {
    this.entityCount = entityCount;
  }

  public PageFeedItemServiceReviewSummary feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * <div lang=\"ja\">フィードID</div> <div lang=\"en\">Feed ID</div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードID</div> <div lang=\"en\">Feed ID</div> ")


  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public PageFeedItemServiceReviewSummary postDisapprovedCount(Long postDisapprovedCount) {
    this.postDisapprovedCount = postDisapprovedCount;
    return this;
  }

  /**
   * <div lang=\"ja\">配信停止の件数</div> <div lang=\"en\">Count of distribution cancelled</div> 
   * @return postDisapprovedCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信停止の件数</div> <div lang=\"en\">Count of distribution cancelled</div> ")


  public Long getPostDisapprovedCount() {
    return postDisapprovedCount;
  }

  public void setPostDisapprovedCount(Long postDisapprovedCount) {
    this.postDisapprovedCount = postDisapprovedCount;
  }

  public PageFeedItemServiceReviewSummary preDisapprovedCount(Long preDisapprovedCount) {
    this.preDisapprovedCount = preDisapprovedCount;
    return this;
  }

  /**
   * <div lang=\"ja\">掲載不可の件数</div> <div lang=\"en\">Count of disapproved</div> 
   * @return preDisapprovedCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">掲載不可の件数</div> <div lang=\"en\">Count of disapproved</div> ")


  public Long getPreDisapprovedCount() {
    return preDisapprovedCount;
  }

  public void setPreDisapprovedCount(Long preDisapprovedCount) {
    this.preDisapprovedCount = preDisapprovedCount;
  }

  public PageFeedItemServiceReviewSummary reviewCount(Long reviewCount) {
    this.reviewCount = reviewCount;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中の件数</div> <div lang=\"en\">Count of review</div> 
   * @return reviewCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中の件数</div> <div lang=\"en\">Count of review</div> ")


  public Long getReviewCount() {
    return reviewCount;
  }

  public void setReviewCount(Long reviewCount) {
    this.reviewCount = reviewCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedItemServiceReviewSummary pageFeedItemServiceReviewSummary = (PageFeedItemServiceReviewSummary) o;
    return Objects.equals(this.accountId, pageFeedItemServiceReviewSummary.accountId) &&
        Objects.equals(this.approvedCount, pageFeedItemServiceReviewSummary.approvedCount) &&
        Objects.equals(this.approvedWithReviewCount, pageFeedItemServiceReviewSummary.approvedWithReviewCount) &&
        Objects.equals(this.entityCount, pageFeedItemServiceReviewSummary.entityCount) &&
        Objects.equals(this.feedId, pageFeedItemServiceReviewSummary.feedId) &&
        Objects.equals(this.postDisapprovedCount, pageFeedItemServiceReviewSummary.postDisapprovedCount) &&
        Objects.equals(this.preDisapprovedCount, pageFeedItemServiceReviewSummary.preDisapprovedCount) &&
        Objects.equals(this.reviewCount, pageFeedItemServiceReviewSummary.reviewCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvedCount, approvedWithReviewCount, entityCount, feedId, postDisapprovedCount, preDisapprovedCount, reviewCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceReviewSummary {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvedCount: ").append(toIndentedString(approvedCount)).append("\n");
    sb.append("    approvedWithReviewCount: ").append(toIndentedString(approvedWithReviewCount)).append("\n");
    sb.append("    entityCount: ").append(toIndentedString(entityCount)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    postDisapprovedCount: ").append(toIndentedString(postDisapprovedCount)).append("\n");
    sb.append("    preDisapprovedCount: ").append(toIndentedString(preDisapprovedCount)).append("\n");
    sb.append("    reviewCount: ").append(toIndentedString(reviewCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

