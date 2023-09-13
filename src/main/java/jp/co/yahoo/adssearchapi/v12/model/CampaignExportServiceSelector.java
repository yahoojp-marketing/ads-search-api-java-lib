/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

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
import jp.co.yahoo.adssearchapi.v12.model.CampaignExportServiceJobStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceSelector オブジェクトは、登録したジョブを検索する条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceSelector object describes the condition to search registered job settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignExportServiceSelector オブジェクトは、登録したジョブを検索する条件を表します。</div> <div lang=\"en\">CampaignExportServiceSelector object describes the condition to search registered job settings.</div> ")
@JsonPropertyOrder({
  CampaignExportServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  CampaignExportServiceSelector.JSON_PROPERTY_JOB_IDS,
  CampaignExportServiceSelector.JSON_PROPERTY_JOB_STATUSES,
  CampaignExportServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  CampaignExportServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("CampaignExportServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignExportServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_JOB_IDS = "jobIds";
  private List<Long> jobIds = null;

  public static final String JSON_PROPERTY_JOB_STATUSES = "jobStatuses";
  private List<CampaignExportServiceJobStatus> jobStatuses = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public CampaignExportServiceSelector() { 
  }

  public CampaignExportServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
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


  public CampaignExportServiceSelector jobIds(List<Long> jobIds) {
    
    this.jobIds = jobIds;
    return this;
  }

  public CampaignExportServiceSelector addJobIdsItem(Long jobIdsItem) {
    if (this.jobIds == null) {
      this.jobIds = new ArrayList<>();
    }
    this.jobIds.add(jobIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：ジョブIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Job ID.&lt;/div&gt; 
   * @return jobIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ジョブIDです。</div> <div lang=\"en\">Search condition: Job ID.</div> ")
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


  public CampaignExportServiceSelector jobStatuses(List<CampaignExportServiceJobStatus> jobStatuses) {
    
    this.jobStatuses = jobStatuses;
    return this;
  }

  public CampaignExportServiceSelector addJobStatusesItem(CampaignExportServiceJobStatus jobStatusesItem) {
    if (this.jobStatuses == null) {
      this.jobStatuses = new ArrayList<>();
    }
    this.jobStatuses.add(jobStatusesItem);
    return this;
  }

   /**
   * Get jobStatuses
   * @return jobStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignExportServiceJobStatus> getJobStatuses() {
    return jobStatuses;
  }


  @JsonProperty(JSON_PROPERTY_JOB_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobStatuses(List<CampaignExportServiceJobStatus> jobStatuses) {
    this.jobStatuses = jobStatuses;
  }


  public CampaignExportServiceSelector numberResults(Integer numberResults) {
    
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


  public CampaignExportServiceSelector startIndex(Integer startIndex) {
    
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
    CampaignExportServiceSelector campaignExportServiceSelector = (CampaignExportServiceSelector) o;
    return Objects.equals(this.accountId, campaignExportServiceSelector.accountId) &&
        Objects.equals(this.jobIds, campaignExportServiceSelector.jobIds) &&
        Objects.equals(this.jobStatuses, campaignExportServiceSelector.jobStatuses) &&
        Objects.equals(this.numberResults, campaignExportServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, campaignExportServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, jobIds, jobStatuses, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignExportServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
    sb.append("    jobStatuses: ").append(toIndentedString(jobStatuses)).append("\n");
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

