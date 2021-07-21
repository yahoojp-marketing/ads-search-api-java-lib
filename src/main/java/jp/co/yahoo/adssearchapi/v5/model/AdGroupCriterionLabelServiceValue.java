package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionLabel;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionLabelServiceValueオブジェクトは、操作結果を含む広告グループのクライテリアラベル情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionLabelServiceValue object describes ad group criterion label information including its operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionLabelServiceValueオブジェクトは、操作結果を含む広告グループのクライテリアラベル情報を表します。</div> <div lang=\"en\">AdGroupCriterionLabelServiceValue object describes ad group criterion label information including its operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionLabelServiceValue   {
  @JsonProperty("adGroupCriterionLabel")
  private AdGroupCriterionLabel adGroupCriterionLabel = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AdGroupCriterionLabelServiceValue adGroupCriterionLabel(AdGroupCriterionLabel adGroupCriterionLabel) {
    this.adGroupCriterionLabel = adGroupCriterionLabel;
    return this;
  }

  /**
   * Get adGroupCriterionLabel
   * @return adGroupCriterionLabel
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionLabel getAdGroupCriterionLabel() {
    return adGroupCriterionLabel;
  }

  public void setAdGroupCriterionLabel(AdGroupCriterionLabel adGroupCriterionLabel) {
    this.adGroupCriterionLabel = adGroupCriterionLabel;
  }

  public AdGroupCriterionLabelServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AdGroupCriterionLabelServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupCriterionLabelServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    AdGroupCriterionLabelServiceValue adGroupCriterionLabelServiceValue = (AdGroupCriterionLabelServiceValue) o;
    return Objects.equals(this.adGroupCriterionLabel, adGroupCriterionLabelServiceValue.adGroupCriterionLabel) &&
        Objects.equals(this.errors, adGroupCriterionLabelServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupCriterionLabelServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupCriterionLabel, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionLabelServiceValue {\n");
    
    sb.append("    adGroupCriterionLabel: ").append(toIndentedString(adGroupCriterionLabel)).append("\n");
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

