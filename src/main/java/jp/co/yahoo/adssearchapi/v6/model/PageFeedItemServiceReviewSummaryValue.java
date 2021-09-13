package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.Error;
import jp.co.yahoo.adssearchapi.v6.model.PageFeedItemServiceReviewSummary;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceReviewSummaryValueは、ページフィードアイテムの審査成績、状況サマリー取得結果を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceReviewSummaryValue is a container storing the examination results of the page feed item, acquisitionc result of situation summary.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceReviewSummaryValueは、ページフィードアイテムの審査成績、状況サマリー取得結果を格納するコンテナです。</div> <div lang=\"en\">PageFeedItemServiceReviewSummaryValue is a container storing the examination results of the page feed item, acquisitionc result of situation summary.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceReviewSummaryValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("reviewSummary")
  private PageFeedItemServiceReviewSummary reviewSummary = null;

  public PageFeedItemServiceReviewSummaryValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public PageFeedItemServiceReviewSummaryValue addErrorsItem(Error errorsItem) {
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

  public PageFeedItemServiceReviewSummaryValue operationSucceeded(Boolean operationSucceeded) {
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

  public PageFeedItemServiceReviewSummaryValue reviewSummary(PageFeedItemServiceReviewSummary reviewSummary) {
    this.reviewSummary = reviewSummary;
    return this;
  }

  /**
   * Get reviewSummary
   * @return reviewSummary
  */
  @ApiModelProperty(value = "")

  @Valid

  public PageFeedItemServiceReviewSummary getReviewSummary() {
    return reviewSummary;
  }

  public void setReviewSummary(PageFeedItemServiceReviewSummary reviewSummary) {
    this.reviewSummary = reviewSummary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedItemServiceReviewSummaryValue pageFeedItemServiceReviewSummaryValue = (PageFeedItemServiceReviewSummaryValue) o;
    return Objects.equals(this.errors, pageFeedItemServiceReviewSummaryValue.errors) &&
        Objects.equals(this.operationSucceeded, pageFeedItemServiceReviewSummaryValue.operationSucceeded) &&
        Objects.equals(this.reviewSummary, pageFeedItemServiceReviewSummaryValue.reviewSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, reviewSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceReviewSummaryValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    reviewSummary: ").append(toIndentedString(reviewSummary)).append("\n");
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

