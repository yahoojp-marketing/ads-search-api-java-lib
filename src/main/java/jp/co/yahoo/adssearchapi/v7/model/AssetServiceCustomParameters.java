package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AssetServiceCustomParameter;
import jp.co.yahoo.adssearchapi.v7.model.AssetServiceIsRemove;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。&lt;br&gt; このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※CustomParameters配下でのみ、クイックリンクオプションの場合、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; This field will be returned in the response, but it will be ignored on input.&lt;br&gt; *Under customParameters, this field will be optional in ADD and SET operation for QUICKLINK option.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。<br> このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※CustomParameters配下でのみ、クイックリンクオプションの場合、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">AssetServiceCustomParameters displays the setting of custom parameters.<br> This field will be returned in the response, but it will be ignored on input.<br> *Under customParameters, this field will be optional in ADD and SET operation for QUICKLINK option.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AssetServiceCustomParameters   {
  @JsonProperty("isRemove")
  private AssetServiceIsRemove isRemove = null;

  @JsonProperty("parameters")
  @Valid
  private List<AssetServiceCustomParameter> parameters = null;

  public AssetServiceCustomParameters isRemove(AssetServiceIsRemove isRemove) {
    this.isRemove = isRemove;
    return this;
  }

  /**
   * Get isRemove
   * @return isRemove
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceIsRemove getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(AssetServiceIsRemove isRemove) {
    this.isRemove = isRemove;
  }

  public AssetServiceCustomParameters parameters(List<AssetServiceCustomParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public AssetServiceCustomParameters addParametersItem(AssetServiceCustomParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AssetServiceCustomParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<AssetServiceCustomParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetServiceCustomParameters assetServiceCustomParameters = (AssetServiceCustomParameters) o;
    return Objects.equals(this.isRemove, assetServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, assetServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceCustomParameters {\n");
    
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

