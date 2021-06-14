package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AuditLogServiceDateRange;
import jp.co.yahoo.adssearchapi.v5.model.AuditLogServiceEncoding;
import jp.co.yahoo.adssearchapi.v5.model.AuditLogServiceEventSelector;
import jp.co.yahoo.adssearchapi.v5.model.AuditLogServiceJobStatus;
import jp.co.yahoo.adssearchapi.v5.model.AuditLogServiceLang;
import jp.co.yahoo.adssearchapi.v5.model.AuditLogServiceOutput;
import jp.co.yahoo.adssearchapi.v5.model.AuditLogServiceSourceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceJobオブジェクトは、操作履歴取得で登録するジョブの情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceJob object retains the job information to be added for getting operation history data.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AuditLogServiceJobオブジェクトは、操作履歴取得で登録するジョブの情報を保持します。</div> <div lang=\"en\">AuditLogServiceJob object retains the job information to be added for getting operation history data.</div> ")

public class AuditLogServiceJob   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("dateRange")
  private JsonNullable<AuditLogServiceDateRange> dateRange = JsonNullable.undefined();

  @JsonProperty("encoding")
  private JsonNullable<AuditLogServiceEncoding> encoding = JsonNullable.undefined();

  @JsonProperty("eventSelector")
  @Valid
  private JsonNullable<List<AuditLogServiceEventSelector>> eventSelector = JsonNullable.undefined();

  @JsonProperty("jobId")
  private JsonNullable<Long> jobId = JsonNullable.undefined();

  @JsonProperty("jobName")
  private JsonNullable<String> jobName = JsonNullable.undefined();

  @JsonProperty("jobStatus")
  private JsonNullable<AuditLogServiceJobStatus> jobStatus = JsonNullable.undefined();

  @JsonProperty("lang")
  private JsonNullable<AuditLogServiceLang> lang = JsonNullable.undefined();

  @JsonProperty("output")
  private JsonNullable<AuditLogServiceOutput> output = JsonNullable.undefined();

  @JsonProperty("sourceType")
  private JsonNullable<AuditLogServiceSourceType> sourceType = JsonNullable.undefined();

  public AuditLogServiceJob accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public AuditLogServiceJob dateRange(AuditLogServiceDateRange dateRange) {
    this.dateRange = JsonNullable.of(dateRange);
    return this;
  }

  /**
   * Get dateRange
   * @return dateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AuditLogServiceDateRange> getDateRange() {
    return dateRange;
  }

  public void setDateRange(JsonNullable<AuditLogServiceDateRange> dateRange) {
    this.dateRange = dateRange;
  }

  public AuditLogServiceJob encoding(AuditLogServiceEncoding encoding) {
    this.encoding = JsonNullable.of(encoding);
    return this;
  }

  /**
   * Get encoding
   * @return encoding
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AuditLogServiceEncoding> getEncoding() {
    return encoding;
  }

  public void setEncoding(JsonNullable<AuditLogServiceEncoding> encoding) {
    this.encoding = encoding;
  }

  public AuditLogServiceJob eventSelector(List<AuditLogServiceEventSelector> eventSelector) {
    this.eventSelector = JsonNullable.of(eventSelector);
    return this;
  }

  public AuditLogServiceJob addEventSelectorItem(AuditLogServiceEventSelector eventSelectorItem) {
    this.eventSelector.get().add(eventSelectorItem);
    return this;
  }

  /**
   * Get eventSelector
   * @return eventSelector
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1,max=25) 
  public JsonNullable<List<AuditLogServiceEventSelector>> getEventSelector() {
    return eventSelector;
  }

  public void setEventSelector(JsonNullable<List<AuditLogServiceEventSelector>> eventSelector) {
    this.eventSelector = eventSelector;
  }

  public AuditLogServiceJob jobId(Long jobId) {
    this.jobId = JsonNullable.of(jobId);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Job ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return jobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Job ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getJobId() {
    return jobId;
  }

  public void setJobId(JsonNullable<Long> jobId) {
    this.jobId = jobId;
  }

  public AuditLogServiceJob jobName(String jobName) {
    this.jobName = JsonNullable.of(jobName);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブ名です。<br>このフィールドは、省略可能となります。</div> <div lang=\"en\">Name of job.<br>This field is optional.</div> 
   * @return jobName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブ名です。<br>このフィールドは、省略可能となります。</div> <div lang=\"en\">Name of job.<br>This field is optional.</div> ")


  public JsonNullable<String> getJobName() {
    return jobName;
  }

  public void setJobName(JsonNullable<String> jobName) {
    this.jobName = jobName;
  }

  public AuditLogServiceJob jobStatus(AuditLogServiceJobStatus jobStatus) {
    this.jobStatus = JsonNullable.of(jobStatus);
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AuditLogServiceJobStatus> getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(JsonNullable<AuditLogServiceJobStatus> jobStatus) {
    this.jobStatus = jobStatus;
  }

  public AuditLogServiceJob lang(AuditLogServiceLang lang) {
    this.lang = JsonNullable.of(lang);
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AuditLogServiceLang> getLang() {
    return lang;
  }

  public void setLang(JsonNullable<AuditLogServiceLang> lang) {
    this.lang = lang;
  }

  public AuditLogServiceJob output(AuditLogServiceOutput output) {
    this.output = JsonNullable.of(output);
    return this;
  }

  /**
   * Get output
   * @return output
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AuditLogServiceOutput> getOutput() {
    return output;
  }

  public void setOutput(JsonNullable<AuditLogServiceOutput> output) {
    this.output = output;
  }

  public AuditLogServiceJob sourceType(AuditLogServiceSourceType sourceType) {
    this.sourceType = JsonNullable.of(sourceType);
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AuditLogServiceSourceType> getSourceType() {
    return sourceType;
  }

  public void setSourceType(JsonNullable<AuditLogServiceSourceType> sourceType) {
    this.sourceType = sourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceJob auditLogServiceJob = (AuditLogServiceJob) o;
    return Objects.equals(this.accountId, auditLogServiceJob.accountId) &&
        Objects.equals(this.dateRange, auditLogServiceJob.dateRange) &&
        Objects.equals(this.encoding, auditLogServiceJob.encoding) &&
        Objects.equals(this.eventSelector, auditLogServiceJob.eventSelector) &&
        Objects.equals(this.jobId, auditLogServiceJob.jobId) &&
        Objects.equals(this.jobName, auditLogServiceJob.jobName) &&
        Objects.equals(this.jobStatus, auditLogServiceJob.jobStatus) &&
        Objects.equals(this.lang, auditLogServiceJob.lang) &&
        Objects.equals(this.output, auditLogServiceJob.output) &&
        Objects.equals(this.sourceType, auditLogServiceJob.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, dateRange, encoding, eventSelector, jobId, jobName, jobStatus, lang, output, sourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceJob {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    eventSelector: ").append(toIndentedString(eventSelector)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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

