package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.AppLink;
import jp.co.yahoo.adssearchapi.v4.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AppLinkServiceValueオブジェクトは、操作結果を含むアプリリンク情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AppLinkServiceValue object describes AppLink information including operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AppLinkServiceValueオブジェクトは、操作結果を含むアプリリンク情報を表します。</div> <div lang=\"en\">AppLinkServiceValue object describes AppLink information including operation result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AppLinkServiceValue   {
  @JsonProperty("appLink")
  private AppLink appLink = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AppLinkServiceValue appLink(AppLink appLink) {
    this.appLink = appLink;
    return this;
  }

  /**
   * Get appLink
   * @return appLink
  */
  @ApiModelProperty(value = "")

  @Valid

  public AppLink getAppLink() {
    return appLink;
  }

  public void setAppLink(AppLink appLink) {
    this.appLink = appLink;
  }

  public AppLinkServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AppLinkServiceValue addErrorsItem(Error errorsItem) {
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

  public AppLinkServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    AppLinkServiceValue appLinkServiceValue = (AppLinkServiceValue) o;
    return Objects.equals(this.appLink, appLinkServiceValue.appLink) &&
        Objects.equals(this.errors, appLinkServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, appLinkServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLink, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLinkServiceValue {\n");
    
    sb.append("    appLink: ").append(toIndentedString(appLink)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

