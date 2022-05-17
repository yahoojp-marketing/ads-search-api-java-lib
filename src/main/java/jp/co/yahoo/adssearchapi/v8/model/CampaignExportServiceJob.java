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
import jp.co.yahoo.adssearchapi.v8.model.CampaignExportServiceJobStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceJob オブジェクトは、ジョブの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceJob object describes the information of job settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignExportServiceJob オブジェクトは、ジョブの情報を表します。</div> <div lang=\"en\">CampaignExportServiceJob object describes the information of job settings.</div> ")
@JsonPropertyOrder({
  CampaignExportServiceJob.JSON_PROPERTY_ACCOUNT_ID,
  CampaignExportServiceJob.JSON_PROPERTY_END_DATE,
  CampaignExportServiceJob.JSON_PROPERTY_EXPORT_FIELDS,
  CampaignExportServiceJob.JSON_PROPERTY_JOB_ID,
  CampaignExportServiceJob.JSON_PROPERTY_JOB_NAME,
  CampaignExportServiceJob.JSON_PROPERTY_JOB_STATUS,
  CampaignExportServiceJob.JSON_PROPERTY_PROGRESS,
  CampaignExportServiceJob.JSON_PROPERTY_START_DATE,
  CampaignExportServiceJob.JSON_PROPERTY_USER_NAME
})
@JsonTypeName("CampaignExportServiceJob")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignExportServiceJob {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_EXPORT_FIELDS = "exportFields";
  private List<String> exportFields = null;

  public static final String JSON_PROPERTY_JOB_ID = "jobId";
  private Long jobId;

  public static final String JSON_PROPERTY_JOB_NAME = "jobName";
  private String jobName;

  public static final String JSON_PROPERTY_JOB_STATUS = "jobStatus";
  private CampaignExportServiceJobStatus jobStatus;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  private Integer progress;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public CampaignExportServiceJob() { 
  }

  public CampaignExportServiceJob accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")
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


  public CampaignExportServiceJob endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブの終了日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End date and time of job setting&lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの終了日時です。</div> <div lang=\"en\">End date and time of job setting</div> ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public CampaignExportServiceJob exportFields(List<String> exportFields) {
    
    this.exportFields = exportFields;
    return this;
  }

  public CampaignExportServiceJob addExportFieldsItem(String exportFieldsItem) {
    if (this.exportFields == null) {
      this.exportFields = new ArrayList<>();
    }
    this.exportFields.add(exportFieldsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;エクスポートするフィールドです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Fields to be exported&lt;/div&gt; 
   * @return exportFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">エクスポートするフィールドです。</div> <div lang=\"en\">Fields to be exported</div> ")
  @JsonProperty(JSON_PROPERTY_EXPORT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExportFields() {
    return exportFields;
  }


  @JsonProperty(JSON_PROPERTY_EXPORT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportFields(List<String> exportFields) {
    this.exportFields = exportFields;
  }


  public CampaignExportServiceJob jobId(Long jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceJob ID&lt;/div&gt; 
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブIDです。</div> <div lang=\"en\">CampaignExportServiceJob ID</div> ")
  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getJobId() {
    return jobId;
  }


  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }


  public CampaignExportServiceJob jobName(String jobName) {
    
    this.jobName = jobName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブ名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceJob name&lt;br&gt; ∗ Default: NULL&lt;/div&gt; 
   * @return jobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブ名です。</div> <div lang=\"en\">CampaignExportServiceJob name<br> ∗ Default: NULL</div> ")
  @JsonProperty(JSON_PROPERTY_JOB_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobName() {
    return jobName;
  }


  @JsonProperty(JSON_PROPERTY_JOB_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobName(String jobName) {
    this.jobName = jobName;
  }


  public CampaignExportServiceJob jobStatus(CampaignExportServiceJobStatus jobStatus) {
    
    this.jobStatus = jobStatus;
    return this;
  }

   /**
   * Get jobStatus
   * @return jobStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignExportServiceJobStatus getJobStatus() {
    return jobStatus;
  }


  @JsonProperty(JSON_PROPERTY_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobStatus(CampaignExportServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
  }


  public CampaignExportServiceJob progress(Integer progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理進捗です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Progress of job setting&lt;/div&gt; 
   * @return progress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理進捗です。</div> <div lang=\"en\">Progress of job setting</div> ")
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProgress() {
    return progress;
  }


  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgress(Integer progress) {
    this.progress = progress;
  }


  public CampaignExportServiceJob startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブの開始日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date and time of job setting&lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの開始日時です。</div> <div lang=\"en\">Start date and time of job setting</div> ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public CampaignExportServiceJob userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブ実行者のユーザー名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of user who run the job.&lt;/div&gt; 
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブ実行者のユーザー名です。</div> <div lang=\"en\">Name of user who run the job.</div> ")
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignExportServiceJob campaignExportServiceJob = (CampaignExportServiceJob) o;
    return Objects.equals(this.accountId, campaignExportServiceJob.accountId) &&
        Objects.equals(this.endDate, campaignExportServiceJob.endDate) &&
        Objects.equals(this.exportFields, campaignExportServiceJob.exportFields) &&
        Objects.equals(this.jobId, campaignExportServiceJob.jobId) &&
        Objects.equals(this.jobName, campaignExportServiceJob.jobName) &&
        Objects.equals(this.jobStatus, campaignExportServiceJob.jobStatus) &&
        Objects.equals(this.progress, campaignExportServiceJob.progress) &&
        Objects.equals(this.startDate, campaignExportServiceJob.startDate) &&
        Objects.equals(this.userName, campaignExportServiceJob.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, endDate, exportFields, jobId, jobName, jobStatus, progress, startDate, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignExportServiceJob {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    exportFields: ").append(toIndentedString(exportFields)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

