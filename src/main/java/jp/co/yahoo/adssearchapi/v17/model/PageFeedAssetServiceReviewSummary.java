/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetServiceReviewSummaryオブジェクトは、ページフィードアセットの審査成績、状況サマリーを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetServiceReviewSummary object retains the examination results of the page feed asset, the situation summary acquisition result.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  PageFeedAssetServiceReviewSummary.JSON_PROPERTY_ACCOUNT_ID,
  PageFeedAssetServiceReviewSummary.JSON_PROPERTY_APPROVED_COUNT,
  PageFeedAssetServiceReviewSummary.JSON_PROPERTY_APPROVED_WITH_REVIEW_COUNT,
  PageFeedAssetServiceReviewSummary.JSON_PROPERTY_ENTITY_COUNT,
  PageFeedAssetServiceReviewSummary.JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID,
  PageFeedAssetServiceReviewSummary.JSON_PROPERTY_POST_DISAPPROVED_COUNT,
  PageFeedAssetServiceReviewSummary.JSON_PROPERTY_PRE_DISAPPROVED_COUNT,
  PageFeedAssetServiceReviewSummary.JSON_PROPERTY_REVIEW_COUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAssetServiceReviewSummary {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_APPROVED_COUNT = "approvedCount";
  private Long approvedCount;

  public static final String JSON_PROPERTY_APPROVED_WITH_REVIEW_COUNT = "approvedWithReviewCount";
  private Long approvedWithReviewCount;

  public static final String JSON_PROPERTY_ENTITY_COUNT = "entityCount";
  private Long entityCount;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID = "pageFeedAssetSetId";
  private Long pageFeedAssetSetId;

  public static final String JSON_PROPERTY_POST_DISAPPROVED_COUNT = "postDisapprovedCount";
  private Long postDisapprovedCount;

  public static final String JSON_PROPERTY_PRE_DISAPPROVED_COUNT = "preDisapprovedCount";
  private Long preDisapprovedCount;

  public static final String JSON_PROPERTY_REVIEW_COUNT = "reviewCount";
  private Long reviewCount;

  public PageFeedAssetServiceReviewSummary() {
  }

  public PageFeedAssetServiceReviewSummary accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public PageFeedAssetServiceReviewSummary approvedCount(Long approvedCount) {
    
    this.approvedCount = approvedCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;承認済みの件数&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Count of approved.&lt;/div&gt; 
   * @return approvedCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getApprovedCount() {
    return approvedCount;
  }


  @JsonProperty(JSON_PROPERTY_APPROVED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovedCount(Long approvedCount) {
    this.approvedCount = approvedCount;
  }


  public PageFeedAssetServiceReviewSummary approvedWithReviewCount(Long approvedWithReviewCount) {
    
    this.approvedWithReviewCount = approvedWithReviewCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;編集内容審査中の件数&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Count of approved with review.&lt;/div&gt; 
   * @return approvedWithReviewCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVED_WITH_REVIEW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getApprovedWithReviewCount() {
    return approvedWithReviewCount;
  }


  @JsonProperty(JSON_PROPERTY_APPROVED_WITH_REVIEW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovedWithReviewCount(Long approvedWithReviewCount) {
    this.approvedWithReviewCount = approvedWithReviewCount;
  }


  public PageFeedAssetServiceReviewSummary entityCount(Long entityCount) {
    
    this.entityCount = entityCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットセット内にあるページフィードアセットの総件数&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total count of page feed asset in page feed asset set.&lt;/div&gt; 
   * @return entityCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEntityCount() {
    return entityCount;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityCount(Long entityCount) {
    this.entityCount = entityCount;
  }


  public PageFeedAssetServiceReviewSummary pageFeedAssetSetId(Long pageFeedAssetSetId) {
    
    this.pageFeedAssetSetId = pageFeedAssetSetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットセットID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetSet ID.&lt;/div&gt; 
   * @return pageFeedAssetSetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPageFeedAssetSetId() {
    return pageFeedAssetSetId;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetSetId(Long pageFeedAssetSetId) {
    this.pageFeedAssetSetId = pageFeedAssetSetId;
  }


  public PageFeedAssetServiceReviewSummary postDisapprovedCount(Long postDisapprovedCount) {
    
    this.postDisapprovedCount = postDisapprovedCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;配信停止の件数&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Count of distribution cancelled.&lt;/div&gt; 
   * @return postDisapprovedCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_DISAPPROVED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPostDisapprovedCount() {
    return postDisapprovedCount;
  }


  @JsonProperty(JSON_PROPERTY_POST_DISAPPROVED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostDisapprovedCount(Long postDisapprovedCount) {
    this.postDisapprovedCount = postDisapprovedCount;
  }


  public PageFeedAssetServiceReviewSummary preDisapprovedCount(Long preDisapprovedCount) {
    
    this.preDisapprovedCount = preDisapprovedCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;掲載不可の件数&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Count of disapproved.&lt;/div&gt; 
   * @return preDisapprovedCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_DISAPPROVED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPreDisapprovedCount() {
    return preDisapprovedCount;
  }


  @JsonProperty(JSON_PROPERTY_PRE_DISAPPROVED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreDisapprovedCount(Long preDisapprovedCount) {
    this.preDisapprovedCount = preDisapprovedCount;
  }


  public PageFeedAssetServiceReviewSummary reviewCount(Long reviewCount) {
    
    this.reviewCount = reviewCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中の件数&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Count of review.&lt;/div&gt; 
   * @return reviewCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReviewCount() {
    return reviewCount;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    PageFeedAssetServiceReviewSummary pageFeedAssetServiceReviewSummary = (PageFeedAssetServiceReviewSummary) o;
    return Objects.equals(this.accountId, pageFeedAssetServiceReviewSummary.accountId) &&
        Objects.equals(this.approvedCount, pageFeedAssetServiceReviewSummary.approvedCount) &&
        Objects.equals(this.approvedWithReviewCount, pageFeedAssetServiceReviewSummary.approvedWithReviewCount) &&
        Objects.equals(this.entityCount, pageFeedAssetServiceReviewSummary.entityCount) &&
        Objects.equals(this.pageFeedAssetSetId, pageFeedAssetServiceReviewSummary.pageFeedAssetSetId) &&
        Objects.equals(this.postDisapprovedCount, pageFeedAssetServiceReviewSummary.postDisapprovedCount) &&
        Objects.equals(this.preDisapprovedCount, pageFeedAssetServiceReviewSummary.preDisapprovedCount) &&
        Objects.equals(this.reviewCount, pageFeedAssetServiceReviewSummary.reviewCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvedCount, approvedWithReviewCount, entityCount, pageFeedAssetSetId, postDisapprovedCount, preDisapprovedCount, reviewCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAssetServiceReviewSummary {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvedCount: ").append(toIndentedString(approvedCount)).append("\n");
    sb.append("    approvedWithReviewCount: ").append(toIndentedString(approvedWithReviewCount)).append("\n");
    sb.append("    entityCount: ").append(toIndentedString(entityCount)).append("\n");
    sb.append("    pageFeedAssetSetId: ").append(toIndentedString(pageFeedAssetSetId)).append("\n");
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

