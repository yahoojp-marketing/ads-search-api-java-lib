package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupWebpage;
import jp.co.yahoo.adssearchapi.v4.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceValueオブジェクトは、操作結果を含むPageFeedItemの配信/除外設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceValue object describes allowed or excluded settings including operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageServiceValueオブジェクトは、操作結果を含むPageFeedItemの配信/除外設定を表します。</div> <div lang=\"en\">AdGroupWebpageServiceValue object describes allowed or excluded settings including operation result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupWebpageServiceValue   {
  @JsonProperty("adGroupWebpage")
  private AdGroupWebpage adGroupWebpage = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AdGroupWebpageServiceValue adGroupWebpage(AdGroupWebpage adGroupWebpage) {
    this.adGroupWebpage = adGroupWebpage;
    return this;
  }

  /**
   * Get adGroupWebpage
   * @return adGroupWebpage
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupWebpage getAdGroupWebpage() {
    return adGroupWebpage;
  }

  public void setAdGroupWebpage(AdGroupWebpage adGroupWebpage) {
    this.adGroupWebpage = adGroupWebpage;
  }

  public AdGroupWebpageServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AdGroupWebpageServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupWebpageServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    AdGroupWebpageServiceValue adGroupWebpageServiceValue = (AdGroupWebpageServiceValue) o;
    return Objects.equals(this.adGroupWebpage, adGroupWebpageServiceValue.adGroupWebpage) &&
        Objects.equals(this.errors, adGroupWebpageServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupWebpageServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupWebpage, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceValue {\n");
    
    sb.append("    adGroupWebpage: ").append(toIndentedString(adGroupWebpage)).append("\n");
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

