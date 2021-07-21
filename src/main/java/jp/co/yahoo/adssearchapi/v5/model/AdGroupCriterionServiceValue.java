package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterion;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceValueオブジェクトは、広告グループのクライテリアです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceValue object is ad group criteria information including its operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceValueオブジェクトは、広告グループのクライテリアです。</div> <div lang=\"en\">AdGroupCriterionServiceValue object is ad group criteria information including its operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionServiceValue   {
  @JsonProperty("adGroupCriterion")
  private AdGroupCriterion adGroupCriterion = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AdGroupCriterionServiceValue adGroupCriterion(AdGroupCriterion adGroupCriterion) {
    this.adGroupCriterion = adGroupCriterion;
    return this;
  }

  /**
   * Get adGroupCriterion
   * @return adGroupCriterion
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterion getAdGroupCriterion() {
    return adGroupCriterion;
  }

  public void setAdGroupCriterion(AdGroupCriterion adGroupCriterion) {
    this.adGroupCriterion = adGroupCriterion;
  }

  public AdGroupCriterionServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AdGroupCriterionServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupCriterionServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Result of process</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Result of process</div> ")


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
    AdGroupCriterionServiceValue adGroupCriterionServiceValue = (AdGroupCriterionServiceValue) o;
    return Objects.equals(this.adGroupCriterion, adGroupCriterionServiceValue.adGroupCriterion) &&
        Objects.equals(this.errors, adGroupCriterionServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupCriterionServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupCriterion, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceValue {\n");
    
    sb.append("    adGroupCriterion: ").append(toIndentedString(adGroupCriterion)).append("\n");
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

