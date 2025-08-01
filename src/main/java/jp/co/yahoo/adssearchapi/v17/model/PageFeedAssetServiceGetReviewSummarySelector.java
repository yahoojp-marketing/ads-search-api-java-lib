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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetServiceGetReviewSummarySelectorオブジェクトは、登録したページフィードアセットの審査成績、状況サマリーを取得するための検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The PageFeedAssetServiceGetReviewSummarySelector object stores search condition to acquire the examination results of the page feed asset and the situation summary.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  PageFeedAssetServiceGetReviewSummarySelector.JSON_PROPERTY_ACCOUNT_ID,
  PageFeedAssetServiceGetReviewSummarySelector.JSON_PROPERTY_PAGE_FEED_ASSET_SET_IDS,
  PageFeedAssetServiceGetReviewSummarySelector.JSON_PROPERTY_NUMBER_RESULTS,
  PageFeedAssetServiceGetReviewSummarySelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAssetServiceGetReviewSummarySelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_SET_IDS = "pageFeedAssetSetIds";
  private List<Long> pageFeedAssetSetIds;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public PageFeedAssetServiceGetReviewSummarySelector() {
  }

  public PageFeedAssetServiceGetReviewSummarySelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nonnull
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


  public PageFeedAssetServiceGetReviewSummarySelector pageFeedAssetSetIds(List<Long> pageFeedAssetSetIds) {
    
    this.pageFeedAssetSetIds = pageFeedAssetSetIds;
    return this;
  }

  public PageFeedAssetServiceGetReviewSummarySelector addPageFeedAssetSetIdsItem(Long pageFeedAssetSetIdsItem) {
    if (this.pageFeedAssetSetIds == null) {
      this.pageFeedAssetSetIds = new ArrayList<>();
    }
    this.pageFeedAssetSetIds.add(pageFeedAssetSetIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットセットID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetSet ID.&lt;/div&gt; 
   * @return pageFeedAssetSetIds
  **/
  @jakarta.annotation.Nullable
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


  public PageFeedAssetServiceGetReviewSummarySelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 10000
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
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


  public PageFeedAssetServiceGetReviewSummarySelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
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
    PageFeedAssetServiceGetReviewSummarySelector pageFeedAssetServiceGetReviewSummarySelector = (PageFeedAssetServiceGetReviewSummarySelector) o;
    return Objects.equals(this.accountId, pageFeedAssetServiceGetReviewSummarySelector.accountId) &&
        Objects.equals(this.pageFeedAssetSetIds, pageFeedAssetServiceGetReviewSummarySelector.pageFeedAssetSetIds) &&
        Objects.equals(this.numberResults, pageFeedAssetServiceGetReviewSummarySelector.numberResults) &&
        Objects.equals(this.startIndex, pageFeedAssetServiceGetReviewSummarySelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, pageFeedAssetSetIds, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAssetServiceGetReviewSummarySelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

