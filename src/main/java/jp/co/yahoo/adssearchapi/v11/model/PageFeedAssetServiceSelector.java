/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v11.model.PageFeedAssetServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v11.model.PageFeedAssetServicePageFeedAssetUrl;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetServiceSelectorオブジェクトは、登録したページフィードアセットを照会するための検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetServiceSelector object stores search condition to inquire about registered page feed asset.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  PageFeedAssetServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  PageFeedAssetServiceSelector.JSON_PROPERTY_PAGE_FEED_ASSET_SET_IDS,
  PageFeedAssetServiceSelector.JSON_PROPERTY_PAGE_FEED_ASSET_IDS,
  PageFeedAssetServiceSelector.JSON_PROPERTY_APPROVAL_STATUSES,
  PageFeedAssetServiceSelector.JSON_PROPERTY_PAGE_FEED_ASSET_CUSTOM_LABELS,
  PageFeedAssetServiceSelector.JSON_PROPERTY_PAGE_FEED_ASSET_URLS,
  PageFeedAssetServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  PageFeedAssetServiceSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAssetServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_SET_IDS = "pageFeedAssetSetIds";
  private List<Long> pageFeedAssetSetIds;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_IDS = "pageFeedAssetIds";
  private List<Long> pageFeedAssetIds;

  public static final String JSON_PROPERTY_APPROVAL_STATUSES = "approvalStatuses";
  private List<PageFeedAssetServiceApprovalStatus> approvalStatuses;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_CUSTOM_LABELS = "pageFeedAssetCustomLabels";
  private List<String> pageFeedAssetCustomLabels;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_URLS = "pageFeedAssetUrls";
  private List<PageFeedAssetServicePageFeedAssetUrl> pageFeedAssetUrls;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public PageFeedAssetServiceSelector() {
  }

  public PageFeedAssetServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID&lt;/div&gt; 
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


  public PageFeedAssetServiceSelector pageFeedAssetSetIds(List<Long> pageFeedAssetSetIds) {
    
    this.pageFeedAssetSetIds = pageFeedAssetSetIds;
    return this;
  }

  public PageFeedAssetServiceSelector addPageFeedAssetSetIdsItem(Long pageFeedAssetSetIdsItem) {
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


  public PageFeedAssetServiceSelector pageFeedAssetIds(List<Long> pageFeedAssetIds) {
    
    this.pageFeedAssetIds = pageFeedAssetIds;
    return this;
  }

  public PageFeedAssetServiceSelector addPageFeedAssetIdsItem(Long pageFeedAssetIdsItem) {
    if (this.pageFeedAssetIds == null) {
      this.pageFeedAssetIds = new ArrayList<>();
    }
    this.pageFeedAssetIds.add(pageFeedAssetIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAsset ID.&lt;/div&gt; 
   * @return pageFeedAssetIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getPageFeedAssetIds() {
    return pageFeedAssetIds;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetIds(List<Long> pageFeedAssetIds) {
    this.pageFeedAssetIds = pageFeedAssetIds;
  }


  public PageFeedAssetServiceSelector approvalStatuses(List<PageFeedAssetServiceApprovalStatus> approvalStatuses) {
    
    this.approvalStatuses = approvalStatuses;
    return this;
  }

  public PageFeedAssetServiceSelector addApprovalStatusesItem(PageFeedAssetServiceApprovalStatus approvalStatusesItem) {
    if (this.approvalStatuses == null) {
      this.approvalStatuses = new ArrayList<>();
    }
    this.approvalStatuses.add(approvalStatusesItem);
    return this;
  }

   /**
   * Get approvalStatuses
   * @return approvalStatuses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PageFeedAssetServiceApprovalStatus> getApprovalStatuses() {
    return approvalStatuses;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatuses(List<PageFeedAssetServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
  }


  public PageFeedAssetServiceSelector pageFeedAssetCustomLabels(List<String> pageFeedAssetCustomLabels) {
    
    this.pageFeedAssetCustomLabels = pageFeedAssetCustomLabels;
    return this;
  }

  public PageFeedAssetServiceSelector addPageFeedAssetCustomLabelsItem(String pageFeedAssetCustomLabelsItem) {
    if (this.pageFeedAssetCustomLabels == null) {
      this.pageFeedAssetCustomLabels = new ArrayList<>();
    }
    this.pageFeedAssetCustomLabels.add(pageFeedAssetCustomLabelsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットのカスタムラベル&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Custom label of Page feed asset.&lt;/div&gt; 
   * @return pageFeedAssetCustomLabels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_CUSTOM_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPageFeedAssetCustomLabels() {
    return pageFeedAssetCustomLabels;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_CUSTOM_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetCustomLabels(List<String> pageFeedAssetCustomLabels) {
    this.pageFeedAssetCustomLabels = pageFeedAssetCustomLabels;
  }


  public PageFeedAssetServiceSelector pageFeedAssetUrls(List<PageFeedAssetServicePageFeedAssetUrl> pageFeedAssetUrls) {
    
    this.pageFeedAssetUrls = pageFeedAssetUrls;
    return this;
  }

  public PageFeedAssetServiceSelector addPageFeedAssetUrlsItem(PageFeedAssetServicePageFeedAssetUrl pageFeedAssetUrlsItem) {
    if (this.pageFeedAssetUrls == null) {
      this.pageFeedAssetUrls = new ArrayList<>();
    }
    this.pageFeedAssetUrls.add(pageFeedAssetUrlsItem);
    return this;
  }

   /**
   * Get pageFeedAssetUrls
   * @return pageFeedAssetUrls
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PageFeedAssetServicePageFeedAssetUrl> getPageFeedAssetUrls() {
    return pageFeedAssetUrls;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetUrls(List<PageFeedAssetServicePageFeedAssetUrl> pageFeedAssetUrls) {
    this.pageFeedAssetUrls = pageFeedAssetUrls;
  }


  public PageFeedAssetServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
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


  public PageFeedAssetServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
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
    PageFeedAssetServiceSelector pageFeedAssetServiceSelector = (PageFeedAssetServiceSelector) o;
    return Objects.equals(this.accountId, pageFeedAssetServiceSelector.accountId) &&
        Objects.equals(this.pageFeedAssetSetIds, pageFeedAssetServiceSelector.pageFeedAssetSetIds) &&
        Objects.equals(this.pageFeedAssetIds, pageFeedAssetServiceSelector.pageFeedAssetIds) &&
        Objects.equals(this.approvalStatuses, pageFeedAssetServiceSelector.approvalStatuses) &&
        Objects.equals(this.pageFeedAssetCustomLabels, pageFeedAssetServiceSelector.pageFeedAssetCustomLabels) &&
        Objects.equals(this.pageFeedAssetUrls, pageFeedAssetServiceSelector.pageFeedAssetUrls) &&
        Objects.equals(this.numberResults, pageFeedAssetServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, pageFeedAssetServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, pageFeedAssetSetIds, pageFeedAssetIds, approvalStatuses, pageFeedAssetCustomLabels, pageFeedAssetUrls, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAssetServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    pageFeedAssetSetIds: ").append(toIndentedString(pageFeedAssetSetIds)).append("\n");
    sb.append("    pageFeedAssetIds: ").append(toIndentedString(pageFeedAssetIds)).append("\n");
    sb.append("    approvalStatuses: ").append(toIndentedString(approvalStatuses)).append("\n");
    sb.append("    pageFeedAssetCustomLabels: ").append(toIndentedString(pageFeedAssetCustomLabels)).append("\n");
    sb.append("    pageFeedAssetUrls: ").append(toIndentedString(pageFeedAssetUrls)).append("\n");
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

