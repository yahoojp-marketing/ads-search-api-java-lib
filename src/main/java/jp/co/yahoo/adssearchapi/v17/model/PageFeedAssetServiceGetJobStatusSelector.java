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
import jp.co.yahoo.adssearchapi.v17.model.PageFeedAssetServiceGetJobStatusType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetServiceGetJobStatusSelectorオブジェクトは、upload、downloadの処理状況を取得するための検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetServiceGetJobStatusSelector object retains search condition for The processing situation upload/download.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  PageFeedAssetServiceGetJobStatusSelector.JSON_PROPERTY_ACCOUNT_ID,
  PageFeedAssetServiceGetJobStatusSelector.JSON_PROPERTY_JOB_IDS,
  PageFeedAssetServiceGetJobStatusSelector.JSON_PROPERTY_JOB_TYPE,
  PageFeedAssetServiceGetJobStatusSelector.JSON_PROPERTY_NUMBER_RESULTS,
  PageFeedAssetServiceGetJobStatusSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAssetServiceGetJobStatusSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_JOB_IDS = "jobIds";
  private List<Long> jobIds;

  public static final String JSON_PROPERTY_JOB_TYPE = "jobType";
  private PageFeedAssetServiceGetJobStatusType jobType;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public PageFeedAssetServiceGetJobStatusSelector() {
  }

  public PageFeedAssetServiceGetJobStatusSelector accountId(Long accountId) {
    
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


  public PageFeedAssetServiceGetJobStatusSelector jobIds(List<Long> jobIds) {
    
    this.jobIds = jobIds;
    return this;
  }

  public PageFeedAssetServiceGetJobStatusSelector addJobIdsItem(Long jobIdsItem) {
    if (this.jobIds == null) {
      this.jobIds = new ArrayList<>();
    }
    this.jobIds.add(jobIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;登録したジョブのID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Registered job ID.&lt;/div&gt; 
   * @return jobIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getJobIds() {
    return jobIds;
  }


  @JsonProperty(JSON_PROPERTY_JOB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobIds(List<Long> jobIds) {
    this.jobIds = jobIds;
  }


  public PageFeedAssetServiceGetJobStatusSelector jobType(PageFeedAssetServiceGetJobStatusType jobType) {
    
    this.jobType = jobType;
    return this;
  }

   /**
   * Get jobType
   * @return jobType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PageFeedAssetServiceGetJobStatusType getJobType() {
    return jobType;
  }


  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJobType(PageFeedAssetServiceGetJobStatusType jobType) {
    this.jobType = jobType;
  }


  public PageFeedAssetServiceGetJobStatusSelector numberResults(Integer numberResults) {
    
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


  public PageFeedAssetServiceGetJobStatusSelector startIndex(Integer startIndex) {
    
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
    PageFeedAssetServiceGetJobStatusSelector pageFeedAssetServiceGetJobStatusSelector = (PageFeedAssetServiceGetJobStatusSelector) o;
    return Objects.equals(this.accountId, pageFeedAssetServiceGetJobStatusSelector.accountId) &&
        Objects.equals(this.jobIds, pageFeedAssetServiceGetJobStatusSelector.jobIds) &&
        Objects.equals(this.jobType, pageFeedAssetServiceGetJobStatusSelector.jobType) &&
        Objects.equals(this.numberResults, pageFeedAssetServiceGetJobStatusSelector.numberResults) &&
        Objects.equals(this.startIndex, pageFeedAssetServiceGetJobStatusSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, jobIds, jobType, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAssetServiceGetJobStatusSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
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

