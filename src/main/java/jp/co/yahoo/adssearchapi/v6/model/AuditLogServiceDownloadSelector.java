package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;操作履歴ファイルをダウンロードします。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Download operation history data file.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">操作履歴ファイルをダウンロードします。</div> <div lang=\"en\"> Download operation history data file.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AuditLogServiceDownloadSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("jobId")
  private Long jobId = null;

  public AuditLogServiceDownloadSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AuditLogServiceDownloadSelector jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：ジョブIDです。</div> <div lang=\"en\">Search condition: Job ID.</div> 
   * @return jobId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：ジョブIDです。</div> <div lang=\"en\">Search condition: Job ID.</div> ")
  @NotNull


  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceDownloadSelector auditLogServiceDownloadSelector = (AuditLogServiceDownloadSelector) o;
    return Objects.equals(this.accountId, auditLogServiceDownloadSelector.accountId) &&
        Objects.equals(this.jobId, auditLogServiceDownloadSelector.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, jobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceDownloadSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
