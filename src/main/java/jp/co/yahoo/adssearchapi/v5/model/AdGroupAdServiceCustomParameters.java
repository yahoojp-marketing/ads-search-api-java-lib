package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceCustomParameter;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceIsRemove;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; This field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupAdServiceCustomParameters displays the setting of custom parameters.<br> This field is optional in ADD operation.</div> ")

public class AdGroupAdServiceCustomParameters   {
  @JsonProperty("isRemove")
  private JsonNullable<AdGroupAdServiceIsRemove> isRemove = JsonNullable.undefined();

  @JsonProperty("parameters")
  @Valid
  private JsonNullable<List<AdGroupAdServiceCustomParameter>> parameters = JsonNullable.undefined();

  public AdGroupAdServiceCustomParameters isRemove(AdGroupAdServiceIsRemove isRemove) {
    this.isRemove = JsonNullable.of(isRemove);
    return this;
  }

  /**
   * Get isRemove
   * @return isRemove
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceIsRemove> getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(JsonNullable<AdGroupAdServiceIsRemove> isRemove) {
    this.isRemove = isRemove;
  }

  public AdGroupAdServiceCustomParameters parameters(List<AdGroupAdServiceCustomParameter> parameters) {
    this.parameters = JsonNullable.of(parameters);
    return this;
  }

  public AdGroupAdServiceCustomParameters addParametersItem(AdGroupAdServiceCustomParameter parametersItem) {
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

  public JsonNullable<List<AdGroupAdServiceCustomParameter>> getParameters() {
    return parameters;
  }

  public void setParameters(JsonNullable<List<AdGroupAdServiceCustomParameter>> parameters) {
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
    AdGroupAdServiceCustomParameters adGroupAdServiceCustomParameters = (AdGroupAdServiceCustomParameters) o;
    return Objects.equals(this.isRemove, adGroupAdServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, adGroupAdServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceCustomParameters {\n");
    
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

