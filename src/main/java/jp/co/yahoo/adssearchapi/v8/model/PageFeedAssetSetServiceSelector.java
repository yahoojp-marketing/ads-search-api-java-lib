/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetSetServiceSelectorオブジェクトは、ページフィードアセットセットの検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetSetServiceSelector object stores the search criteria for a page feed asset set.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedAssetSetServiceSelectorオブジェクトは、ページフィードアセットセットの検索条件を格納します。</div> <div lang=\"en\">PageFeedAssetSetServiceSelector object stores the search criteria for a page feed asset set.</div> ")
@JsonPropertyOrder({
  PageFeedAssetSetServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  PageFeedAssetSetServiceSelector.JSON_PROPERTY_FEED_IDS,
  PageFeedAssetSetServiceSelector.JSON_PROPERTY_PAGE_FEED_ASSET_SET_IDS,
  PageFeedAssetSetServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  PageFeedAssetSetServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("PageFeedAssetSetServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAssetSetServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_FEED_IDS = "feedIds";
  private List<Long> feedIds = null;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_SET_IDS = "pageFeedAssetSetIds";
  private List<Long> pageFeedAssetSetIds = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public PageFeedAssetSetServiceSelector() { 
  }

  public PageFeedAssetSetServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public PageFeedAssetSetServiceSelector feedIds(List<Long> feedIds) {
    
    this.feedIds = feedIds;
    return this;
  }

  public PageFeedAssetSetServiceSelector addFeedIdsItem(Long feedIdsItem) {
    if (this.feedIds == null) {
      this.feedIds = new ArrayList<>();
    }
    this.feedIds.add(feedIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードIDです。&lt;br&gt; 旧形式のページフィードです。旧形式から自動移行されたページフィードを検索します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID.&lt;br&gt; It is in the previous format and searches the migrated page feeds.&lt;/div&gt; 
   * @return feedIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">フィードIDです。<br> 旧形式のページフィードです。旧形式から自動移行されたページフィードを検索します。</div> <div lang=\"en\">Feed ID.<br> It is in the previous format and searches the migrated page feeds.</div> ")
  @JsonProperty(JSON_PROPERTY_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getFeedIds() {
    return feedIds;
  }


  @JsonProperty(JSON_PROPERTY_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
  }


  public PageFeedAssetSetServiceSelector pageFeedAssetSetIds(List<Long> pageFeedAssetSetIds) {
    
    this.pageFeedAssetSetIds = pageFeedAssetSetIds;
    return this;
  }

  public PageFeedAssetSetServiceSelector addPageFeedAssetSetIdsItem(Long pageFeedAssetSetIdsItem) {
    if (this.pageFeedAssetSetIds == null) {
      this.pageFeedAssetSetIds = new ArrayList<>();
    }
    this.pageFeedAssetSetIds.add(pageFeedAssetSetIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットセットIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetSet ID.&lt;/div&gt; 
   * @return pageFeedAssetSetIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードアセットセットIDです。</div> <div lang=\"en\">PageFeedAssetSet ID.</div> ")
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_SET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getPageFeedAssetSetIds() {
    return pageFeedAssetSetIds;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_SET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetSetIds(List<Long> pageFeedAssetSetIds) {
    this.pageFeedAssetSetIds = pageFeedAssetSetIds;
  }


  public PageFeedAssetSetServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public PageFeedAssetSetServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedAssetSetServiceSelector pageFeedAssetSetServiceSelector = (PageFeedAssetSetServiceSelector) o;
    return Objects.equals(this.accountId, pageFeedAssetSetServiceSelector.accountId) &&
        Objects.equals(this.feedIds, pageFeedAssetSetServiceSelector.feedIds) &&
        Objects.equals(this.pageFeedAssetSetIds, pageFeedAssetSetServiceSelector.pageFeedAssetSetIds) &&
        Objects.equals(this.numberResults, pageFeedAssetSetServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, pageFeedAssetSetServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, feedIds, pageFeedAssetSetIds, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAssetSetServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    feedIds: ").append(toIndentedString(feedIds)).append("\n");
    sb.append("    pageFeedAssetSetIds: ").append(toIndentedString(pageFeedAssetSetIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

