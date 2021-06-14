package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignExportServiceJobStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceJob オブジェクトは、ジョブの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceJob object describes the information of job settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignExportServiceJob オブジェクトは、ジョブの情報を表します。</div> <div lang=\"en\">CampaignExportServiceJob object describes the information of job settings.</div> ")

public class CampaignExportServiceJob   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("exportFields")
  @Valid
  private JsonNullable<List<String>> exportFields = JsonNullable.undefined();

  @JsonProperty("jobId")
  private JsonNullable<Long> jobId = JsonNullable.undefined();

  @JsonProperty("jobName")
  private JsonNullable<String> jobName = JsonNullable.undefined();

  @JsonProperty("jobStatus")
  private JsonNullable<CampaignExportServiceJobStatus> jobStatus = JsonNullable.undefined();

  @JsonProperty("progress")
  private JsonNullable<Integer> progress = JsonNullable.undefined();

  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  @JsonProperty("userName")
  private JsonNullable<String> userName = JsonNullable.undefined();

  public CampaignExportServiceJob accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public CampaignExportServiceJob endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの終了日時です。</div> <div lang=\"en\">End date and time of job setting</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの終了日時です。</div> <div lang=\"en\">End date and time of job setting</div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public CampaignExportServiceJob exportFields(List<String> exportFields) {
    this.exportFields = JsonNullable.of(exportFields);
    return this;
  }

  public CampaignExportServiceJob addExportFieldsItem(String exportFieldsItem) {
    if (this.exportFields == null || !this.exportFields.isPresent()) {
      this.exportFields = JsonNullable.of(new ArrayList<>());
    }
    this.exportFields.get().add(exportFieldsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エクスポートするフィールドです。</div> <div lang=\"en\">Fields to be exported</div> 
   * @return exportFields
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エクスポートするフィールドです。</div> <div lang=\"en\">Fields to be exported</div> ")


  public JsonNullable<List<String>> getExportFields() {
    return exportFields;
  }

  public void setExportFields(JsonNullable<List<String>> exportFields) {
    this.exportFields = exportFields;
  }

  public CampaignExportServiceJob jobId(Long jobId) {
    this.jobId = JsonNullable.of(jobId);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブIDです。</div> <div lang=\"en\">CampaignExportServiceJob ID</div> 
   * @return jobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブIDです。</div> <div lang=\"en\">CampaignExportServiceJob ID</div> ")


  public JsonNullable<Long> getJobId() {
    return jobId;
  }

  public void setJobId(JsonNullable<Long> jobId) {
    this.jobId = jobId;
  }

  public CampaignExportServiceJob jobName(String jobName) {
    this.jobName = JsonNullable.of(jobName);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブ名です。</div> <div lang=\"en\">CampaignExportServiceJob name<br> ∗ Default: NULL</div> 
   * @return jobName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブ名です。</div> <div lang=\"en\">CampaignExportServiceJob name<br> ∗ Default: NULL</div> ")


  public JsonNullable<String> getJobName() {
    return jobName;
  }

  public void setJobName(JsonNullable<String> jobName) {
    this.jobName = jobName;
  }

  public CampaignExportServiceJob jobStatus(CampaignExportServiceJobStatus jobStatus) {
    this.jobStatus = JsonNullable.of(jobStatus);
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignExportServiceJobStatus> getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(JsonNullable<CampaignExportServiceJobStatus> jobStatus) {
    this.jobStatus = jobStatus;
  }

  public CampaignExportServiceJob progress(Integer progress) {
    this.progress = JsonNullable.of(progress);
    return this;
  }

  /**
   * <div lang=\"ja\">処理進捗です。</div> <div lang=\"en\">Progress of job setting</div> 
   * @return progress
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理進捗です。</div> <div lang=\"en\">Progress of job setting</div> ")


  public JsonNullable<Integer> getProgress() {
    return progress;
  }

  public void setProgress(JsonNullable<Integer> progress) {
    this.progress = progress;
  }

  public CampaignExportServiceJob startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの開始日時です。</div> <div lang=\"en\">Start date and time of job setting</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの開始日時です。</div> <div lang=\"en\">Start date and time of job setting</div> ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public CampaignExportServiceJob userName(String userName) {
    this.userName = JsonNullable.of(userName);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブ実行者のユーザー名です。</div> <div lang=\"en\">Name of user who run the job.</div> 
   * @return userName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブ実行者のユーザー名です。</div> <div lang=\"en\">Name of user who run the job.</div> ")


  public JsonNullable<String> getUserName() {
    return userName;
  }

  public void setUserName(JsonNullable<String> userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

