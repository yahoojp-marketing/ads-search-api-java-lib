/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v17.model.AdGroupServiceCustomParameter;
import jp.co.yahoo.adssearchapi.v17.model.AdGroupServiceIsRemove;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※SET時、トラッキングURLが審査中の場合、編集はできません。また、変更がない場合、審査対象とはなりません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; This field is optional.&lt;br&gt; *In SET operation, cannot update it when Tracking URL is in editorial review. In addition, if there is no change, it will not to be reviewed.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupServiceCustomParameters.JSON_PROPERTY_IS_REMOVE,
  AdGroupServiceCustomParameters.JSON_PROPERTY_PARAMETERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceCustomParameters {
  public static final String JSON_PROPERTY_IS_REMOVE = "isRemove";
  private AdGroupServiceIsRemove isRemove;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<AdGroupServiceCustomParameter> parameters;

  public AdGroupServiceCustomParameters() {
  }

  public AdGroupServiceCustomParameters isRemove(AdGroupServiceIsRemove isRemove) {
    
    this.isRemove = isRemove;
    return this;
  }

   /**
   * Get isRemove
   * @return isRemove
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceIsRemove getIsRemove() {
    return isRemove;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemove(AdGroupServiceIsRemove isRemove) {
    this.isRemove = isRemove;
  }


  public AdGroupServiceCustomParameters parameters(List<AdGroupServiceCustomParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public AdGroupServiceCustomParameters addParametersItem(AdGroupServiceCustomParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupServiceCustomParameter> getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameters(List<AdGroupServiceCustomParameter> parameters) {
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
    AdGroupServiceCustomParameters adGroupServiceCustomParameters = (AdGroupServiceCustomParameters) o;
    return Objects.equals(this.isRemove, adGroupServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, adGroupServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceCustomParameters {\n");
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

