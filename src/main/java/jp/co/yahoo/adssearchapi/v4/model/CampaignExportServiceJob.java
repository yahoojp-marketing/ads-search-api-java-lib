package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.CampaignExportServiceJobStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceJob オブジェクトは、ジョブの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceJob object describes the information of job settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignExportServiceJob オブジェクトは、ジョブの情報を表します。</div> <div lang=\"en\">CampaignExportServiceJob object describes the information of job settings.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignExportServiceJob   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("exportFields")
  @Valid
  private List<String> exportFields = null;

  @JsonProperty("jobId")
  private Long jobId = null;

  @JsonProperty("jobName")
  private String jobName = null;

  @JsonProperty("jobStatus")
  private CampaignExportServiceJobStatus jobStatus = null;

  @JsonProperty("progress")
  private Integer progress = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("userName")
  private String userName = null;

  public CampaignExportServiceJob accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignExportServiceJob endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの終了日時です。</div> <div lang=\"en\">End date and time of job setting</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの終了日時です。</div> <div lang=\"en\">End date and time of job setting</div> ")


  public String getEndDate() {
    return endDate;
  }

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
   * <div lang=\"ja\">エクスポートするフィールドです。</div> <div lang=\"en\">Fields to be exported</div> 
   * @return exportFields
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エクスポートするフィールドです。</div> <div lang=\"en\">Fields to be exported</div> ")


  public List<String> getExportFields() {
    return exportFields;
  }

  public void setExportFields(List<String> exportFields) {
    this.exportFields = exportFields;
  }

  public CampaignExportServiceJob jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブIDです。</div> <div lang=\"en\">CampaignExportServiceJob ID</div> 
   * @return jobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブIDです。</div> <div lang=\"en\">CampaignExportServiceJob ID</div> ")


  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public CampaignExportServiceJob jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブ名です。</div> <div lang=\"en\">CampaignExportServiceJob name<br> ∗ Default: NULL</div> 
   * @return jobName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブ名です。</div> <div lang=\"en\">CampaignExportServiceJob name<br> ∗ Default: NULL</div> ")


  public String getJobName() {
    return jobName;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignExportServiceJobStatus getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(CampaignExportServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
  }

  public CampaignExportServiceJob progress(Integer progress) {
    this.progress = progress;
    return this;
  }

  /**
   * <div lang=\"ja\">処理進捗です。</div> <div lang=\"en\">Progress of job setting</div> 
   * @return progress
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理進捗です。</div> <div lang=\"en\">Progress of job setting</div> ")


  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public CampaignExportServiceJob startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの開始日時です。</div> <div lang=\"en\">Start date and time of job setting</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの開始日時です。</div> <div lang=\"en\">Start date and time of job setting</div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CampaignExportServiceJob userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブ実行者のユーザー名です。</div> <div lang=\"en\">Name of user who run the job.</div> 
   * @return userName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブ実行者のユーザー名です。</div> <div lang=\"en\">Name of user who run the job.</div> ")


  public String getUserName() {
    return userName;
  }

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

