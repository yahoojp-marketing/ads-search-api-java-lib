package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.Error;
import jp.co.yahoo.adssearchapi.v4.model.PageFeedItemServiceUploadJob;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PageFeedItemServiceUploadValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceUploadValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("uploadJob")
  private PageFeedItemServiceUploadJob uploadJob = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public PageFeedItemServiceUploadValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public PageFeedItemServiceUploadValue addErrorsItem(Error errorsItem) {
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

  public PageFeedItemServiceUploadValue uploadJob(PageFeedItemServiceUploadJob uploadJob) {
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

  public PageFeedItemServiceUploadValue operationSucceeded(Boolean operationSucceeded) {
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
    PageFeedItemServiceUploadValue pageFeedItemServiceUploadValue = (PageFeedItemServiceUploadValue) o;
    return Objects.equals(this.errors, pageFeedItemServiceUploadValue.errors) &&
        Objects.equals(this.uploadJob, pageFeedItemServiceUploadValue.uploadJob) &&
        Objects.equals(this.operationSucceeded, pageFeedItemServiceUploadValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, uploadJob, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceUploadValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    uploadJob: ").append(toIndentedString(uploadJob)).append("\n");
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

