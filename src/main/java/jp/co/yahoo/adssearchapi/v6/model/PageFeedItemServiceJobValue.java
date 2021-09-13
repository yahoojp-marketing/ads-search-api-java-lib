package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.Error;
import jp.co.yahoo.adssearchapi.v6.model.PageFeedItemServiceDownloadJob;
import jp.co.yahoo.adssearchapi.v6.model.PageFeedItemServiceUploadJob;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceJobValueは、upload、downloadの処理状況を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceJobValue retains a container of the processing situation results (upload/download).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceJobValueは、upload、downloadの処理状況を格納するコンテナです。</div> <div lang=\"en\">PageFeedItemServiceJobValue retains a container of the processing situation results (upload/download).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceJobValue   {
  @JsonProperty("downloadJob")
  private PageFeedItemServiceDownloadJob downloadJob = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("uploadJob")
  private PageFeedItemServiceUploadJob uploadJob = null;

  public PageFeedItemServiceJobValue downloadJob(PageFeedItemServiceDownloadJob downloadJob) {
    this.downloadJob = downloadJob;
    return this;
  }

  /**
   * Get downloadJob
   * @return downloadJob
  */
  @ApiModelProperty(value = "")

  @Valid

  public PageFeedItemServiceDownloadJob getDownloadJob() {
    return downloadJob;
  }

  public void setDownloadJob(PageFeedItemServiceDownloadJob downloadJob) {
    this.downloadJob = downloadJob;
  }

  public PageFeedItemServiceJobValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public PageFeedItemServiceJobValue addErrorsItem(Error errorsItem) {
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

  public PageFeedItemServiceJobValue operationSucceeded(Boolean operationSucceeded) {
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

  public PageFeedItemServiceJobValue uploadJob(PageFeedItemServiceUploadJob uploadJob) {
    this.uploadJob = uploadJob;
    return this;
  }

  /**
   * Get uploadJob
   * @return uploadJob
  */
  @ApiModelProperty(value = "")

  @Valid

  public PageFeedItemServiceUploadJob getUploadJob() {
    return uploadJob;
  }

  public void setUploadJob(PageFeedItemServiceUploadJob uploadJob) {
    this.uploadJob = uploadJob;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedItemServiceJobValue pageFeedItemServiceJobValue = (PageFeedItemServiceJobValue) o;
    return Objects.equals(this.downloadJob, pageFeedItemServiceJobValue.downloadJob) &&
        Objects.equals(this.errors, pageFeedItemServiceJobValue.errors) &&
        Objects.equals(this.operationSucceeded, pageFeedItemServiceJobValue.operationSucceeded) &&
        Objects.equals(this.uploadJob, pageFeedItemServiceJobValue.uploadJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadJob, errors, operationSucceeded, uploadJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceJobValue {\n");
    
    sb.append("    downloadJob: ").append(toIndentedString(downloadJob)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    uploadJob: ").append(toIndentedString(uploadJob)).append("\n");
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

