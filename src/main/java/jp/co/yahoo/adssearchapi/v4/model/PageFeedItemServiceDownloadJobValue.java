package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.Error;
import jp.co.yahoo.adssearchapi.v4.model.PageFeedItemServiceDownloadJob;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceDownloadJobValueは、ダウンロードの実行結果を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceDownloadJobValue retains result of download execution.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceDownloadJobValueは、ダウンロードの実行結果を格納するコンテナです。</div> <div lang=\"en\">PageFeedItemServiceDownloadJobValue retains result of download execution.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceDownloadJobValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("job")
  private PageFeedItemServiceDownloadJob job = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public PageFeedItemServiceDownloadJobValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public PageFeedItemServiceDownloadJobValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public PageFeedItemServiceDownloadJobValue job(PageFeedItemServiceDownloadJob job) {
    this.job = job;
    return this;
  }

  /**
   * Get job
   * @return job
  */
  @ApiModelProperty(value = "")

  @Valid

  public PageFeedItemServiceDownloadJob getJob() {
    return job;
  }

  public void setJob(PageFeedItemServiceDownloadJob job) {
    this.job = job;
  }

  public PageFeedItemServiceDownloadJobValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedItemServiceDownloadJobValue pageFeedItemServiceDownloadJobValue = (PageFeedItemServiceDownloadJobValue) o;
    return Objects.equals(this.errors, pageFeedItemServiceDownloadJobValue.errors) &&
        Objects.equals(this.job, pageFeedItemServiceDownloadJobValue.job) &&
        Objects.equals(this.operationSucceeded, pageFeedItemServiceDownloadJobValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, job, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceDownloadJobValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

