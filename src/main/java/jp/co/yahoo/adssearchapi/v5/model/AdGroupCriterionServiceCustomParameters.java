package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceCustomParameter;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceIsRemove;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupCriterionServiceCustomParameters displays the setting of custom parameters.<br> This field is optional in ADD and SET operation.</div> ")

public class AdGroupCriterionServiceCustomParameters   {
  @JsonProperty("isRemove")
  private JsonNullable<AdGroupCriterionServiceIsRemove> isRemove = JsonNullable.undefined();

  @JsonProperty("parameters")
  @Valid
  private JsonNullable<List<AdGroupCriterionServiceCustomParameter>> parameters = JsonNullable.undefined();

  public AdGroupCriterionServiceCustomParameters isRemove(AdGroupCriterionServiceIsRemove isRemove) {
    this.isRemove = JsonNullable.of(isRemove);
    return this;
  }

  /**
   * Get isRemove
   * @return isRemove
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceIsRemove> getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(JsonNullable<AdGroupCriterionServiceIsRemove> isRemove) {
    this.isRemove = isRemove;
  }

  public AdGroupCriterionServiceCustomParameters parameters(List<AdGroupCriterionServiceCustomParameter> parameters) {
    this.parameters = JsonNullable.of(parameters);
    return this;
  }

  public AdGroupCriterionServiceCustomParameters addParametersItem(AdGroupCriterionServiceCustomParameter parametersItem) {
    if (this.parameters == null || !this.parameters.isPresent()) {
      this.parameters = JsonNullable.of(new ArrayList<>());
    }
    this.parameters.get().add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<AdGroupCriterionServiceCustomParameter>> getParameters() {
    return parameters;
  }

  public void setParameters(JsonNullable<List<AdGroupCriterionServiceCustomParameter>> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceCustomParameters adGroupCriterionServiceCustomParameters = (AdGroupCriterionServiceCustomParameters) o;
    return Objects.equals(this.isRemove, adGroupCriterionServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, adGroupCriterionServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceCustomParameters {\n");
    
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

