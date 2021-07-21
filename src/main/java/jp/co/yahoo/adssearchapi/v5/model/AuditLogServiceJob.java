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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceJobオブジェクトは、操作履歴取得で登録するジョブの情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceJob object retains the job information to be added for getting operation history data.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AuditLogServiceJobオブジェクトは、操作履歴取得で登録するジョブの情報を保持します。</div> <div lang=\"en\">AuditLogServiceJob object retains the job information to be added for getting operation history data.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AuditLogServiceJob   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("dateRange")
  private AuditLogServiceDateRange dateRange = null;

  @JsonProperty("encoding")
  private AuditLogServiceEncoding encoding = null;

  @JsonProperty("eventSelector")
  @Valid
  private List<AuditLogServiceEventSelector> eventSelector = new ArrayList<>();

  @JsonProperty("jobId")
  private Long jobId = null;

  @JsonProperty("jobName")
  private String jobName = null;

  @JsonProperty("jobStatus")
  private AuditLogServiceJobStatus jobStatus = null;

  @JsonProperty("lang")
  private AuditLogServiceLang lang = null;

  @JsonProperty("output")
  private AuditLogServiceOutput output = null;

  @JsonProperty("sourceType")
  private AuditLogServiceSourceType sourceType = null;

  public AuditLogServiceJob accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AuditLogServiceJob dateRange(AuditLogServiceDateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Get dateRange
   * @return dateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditLogServiceDateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(AuditLogServiceDateRange dateRange) {
    this.dateRange = dateRange;
  }

  public AuditLogServiceJob encoding(AuditLogServiceEncoding encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Get encoding
   * @return encoding
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditLogServiceEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(AuditLogServiceEncoding encoding) {
    this.encoding = encoding;
  }

  public AuditLogServiceJob eventSelector(List<AuditLogServiceEventSelector> eventSelector) {
    this.eventSelector = eventSelector;
    return this;
  }

  public AuditLogServiceJob addEventSelectorItem(AuditLogServiceEventSelector eventSelectorItem) {
    if (this.eventSelector == null) {
      this.eventSelector = new ArrayList<>();
    }
    this.eventSelector.add(eventSelectorItem);
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
  public List<AuditLogServiceEventSelector> getEventSelector() {
    return eventSelector;
  }

  public void setEventSelector(List<AuditLogServiceEventSelector> eventSelector) {
    this.eventSelector = eventSelector;
  }

  public AuditLogServiceJob jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Job ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return jobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Job ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public AuditLogServiceJob jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブ名です。<br>このフィールドは、省略可能となります。</div> <div lang=\"en\">Name of job.<br>This field is optional.</div> 
   * @return jobName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブ名です。<br>このフィールドは、省略可能となります。</div> <div lang=\"en\">Name of job.<br>This field is optional.</div> ")


  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public AuditLogServiceJob jobStatus(AuditLogServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditLogServiceJobStatus getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(AuditLogServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
  }

  public AuditLogServiceJob lang(AuditLogServiceLang lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditLogServiceLang getLang() {
    return lang;
  }

  public void setLang(AuditLogServiceLang lang) {
    this.lang = lang;
  }

  public AuditLogServiceJob output(AuditLogServiceOutput output) {
    this.output = output;
    return this;
  }

  /**
   * Get output
   * @return output
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditLogServiceOutput getOutput() {
    return output;
  }

  public void setOutput(AuditLogServiceOutput output) {
    this.output = output;
  }

  public AuditLogServiceJob sourceType(AuditLogServiceSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditLogServiceSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(AuditLogServiceSourceType sourceType) {
    this.sourceType = sourceType;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

