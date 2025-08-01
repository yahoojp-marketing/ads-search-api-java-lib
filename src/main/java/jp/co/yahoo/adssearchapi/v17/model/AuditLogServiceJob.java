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
import jp.co.yahoo.adssearchapi.v17.model.AuditLogServiceDateRange;
import jp.co.yahoo.adssearchapi.v17.model.AuditLogServiceEncoding;
import jp.co.yahoo.adssearchapi.v17.model.AuditLogServiceEventSelector;
import jp.co.yahoo.adssearchapi.v17.model.AuditLogServiceJobStatus;
import jp.co.yahoo.adssearchapi.v17.model.AuditLogServiceLang;
import jp.co.yahoo.adssearchapi.v17.model.AuditLogServiceOutput;
import jp.co.yahoo.adssearchapi.v17.model.AuditLogServiceSourceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceJobオブジェクトは、操作履歴取得で登録するジョブの情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceJob object retains the job information to be added for getting operation history data.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AuditLogServiceJob.JSON_PROPERTY_ACCOUNT_ID,
  AuditLogServiceJob.JSON_PROPERTY_DATE_RANGE,
  AuditLogServiceJob.JSON_PROPERTY_ENCODING,
  AuditLogServiceJob.JSON_PROPERTY_EVENT_SELECTOR,
  AuditLogServiceJob.JSON_PROPERTY_JOB_ID,
  AuditLogServiceJob.JSON_PROPERTY_JOB_NAME,
  AuditLogServiceJob.JSON_PROPERTY_JOB_STATUS,
  AuditLogServiceJob.JSON_PROPERTY_LANG,
  AuditLogServiceJob.JSON_PROPERTY_OUTPUT,
  AuditLogServiceJob.JSON_PROPERTY_SOURCE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditLogServiceJob {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_DATE_RANGE = "dateRange";
  private AuditLogServiceDateRange dateRange;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private AuditLogServiceEncoding encoding;

  public static final String JSON_PROPERTY_EVENT_SELECTOR = "eventSelector";
  private List<AuditLogServiceEventSelector> eventSelector;

  public static final String JSON_PROPERTY_JOB_ID = "jobId";
  private Long jobId;

  public static final String JSON_PROPERTY_JOB_NAME = "jobName";
  private String jobName;

  public static final String JSON_PROPERTY_JOB_STATUS = "jobStatus";
  private AuditLogServiceJobStatus jobStatus;

  public static final String JSON_PROPERTY_LANG = "lang";
  private AuditLogServiceLang lang;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  private AuditLogServiceOutput output;

  public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
  private AuditLogServiceSourceType sourceType;

  public AuditLogServiceJob() {
  }

  public AuditLogServiceJob accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt;Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
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


  public AuditLogServiceJob dateRange(AuditLogServiceDateRange dateRange) {
    
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuditLogServiceDateRange getDateRange() {
    return dateRange;
  }


  @JsonProperty(JSON_PROPERTY_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuditLogServiceEncoding getEncoding() {
    return encoding;
  }


  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AuditLogServiceEventSelector> getEventSelector() {
    return eventSelector;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventSelector(List<AuditLogServiceEventSelector> eventSelector) {
    this.eventSelector = eventSelector;
  }


  public AuditLogServiceJob jobId(Long jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブIDです。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Job ID.&lt;br&gt;Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return jobId
  **/
  @jakarta.annotation.Nullable
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


  public AuditLogServiceJob jobName(String jobName) {
    
    this.jobName = jobName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブ名です。&lt;br&gt;このフィールドは、省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of job.&lt;br&gt;This field is optional.&lt;/div&gt; 
   * @return jobName
  **/
  @jakarta.annotation.Nullable
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


  public AuditLogServiceJob jobStatus(AuditLogServiceJobStatus jobStatus) {
    
    this.jobStatus = jobStatus;
    return this;
  }

   /**
   * Get jobStatus
   * @return jobStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuditLogServiceJobStatus getJobStatus() {
    return jobStatus;
  }


  @JsonProperty(JSON_PROPERTY_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuditLogServiceLang getLang() {
    return lang;
  }


  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuditLogServiceOutput getOutput() {
    return output;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuditLogServiceSourceType getSourceType() {
    return sourceType;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

