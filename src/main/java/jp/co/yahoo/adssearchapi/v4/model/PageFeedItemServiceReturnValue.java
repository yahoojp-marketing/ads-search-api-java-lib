package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.Error;
import jp.co.yahoo.adssearchapi.v4.model.PageFeedItem;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceReturnValueは、ページフィードアイテムのコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceReturnValue object is container of page feed item.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceReturnValueは、ページフィードアイテムのコンテナです。</div> <div lang=\"en\">PageFeedItemServiceReturnValue object is container of page feed item.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceReturnValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("pageFeedItem")
  private PageFeedItem pageFeedItem = null;

  public PageFeedItemServiceReturnValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public PageFeedItemServiceReturnValue addErrorsItem(Error errorsItem) {
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

  public PageFeedItemServiceReturnValue operationSucceeded(Boolean operationSucceeded) {
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

  public PageFeedItemServiceReturnValue pageFeedItem(PageFeedItem pageFeedItem) {
    this.pageFeedItem = pageFeedItem;
    return this;
  }

  /**
   * Get pageFeedItem
   * @return pageFeedItem
  */
  @ApiModelProperty(value = "")

  @Valid

  public PageFeedItem getPageFeedItem() {
    return pageFeedItem;
  }

  public void setPageFeedItem(PageFeedItem pageFeedItem) {
    this.pageFeedItem = pageFeedItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedItemServiceReturnValue pageFeedItemServiceReturnValue = (PageFeedItemServiceReturnValue) o;
    return Objects.equals(this.errors, pageFeedItemServiceReturnValue.errors) &&
        Objects.equals(this.operationSucceeded, pageFeedItemServiceReturnValue.operationSucceeded) &&
        Objects.equals(this.pageFeedItem, pageFeedItemServiceReturnValue.pageFeedItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, pageFeedItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceReturnValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    pageFeedItem: ").append(toIndentedString(pageFeedItem)).append("\n");
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

