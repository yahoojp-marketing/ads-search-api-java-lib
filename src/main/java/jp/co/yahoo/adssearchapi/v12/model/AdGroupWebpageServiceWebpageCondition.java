/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v12.model.AdGroupWebpageServiceOperator;
import jp.co.yahoo.adssearchapi.v12.model.AdGroupWebpageServiceWebpageConditionType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceWebpageConditionオブジェクトは、Webpageの条件を保持します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceWebpageCondition object contains the rules of webpage.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageServiceWebpageConditionオブジェクトは、Webpageの条件を保持します。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。</div> <div lang=\"en\">AdGroupWebpageServiceWebpageCondition object contains the rules of webpage.<br> This field is required in ADD operation, and will be ignored in SET operation.</div> ")
@JsonPropertyOrder({
  AdGroupWebpageServiceWebpageCondition.JSON_PROPERTY_ARGUMENT,
  AdGroupWebpageServiceWebpageCondition.JSON_PROPERTY_WEBPAGE_CONDITION_TYPE,
  AdGroupWebpageServiceWebpageCondition.JSON_PROPERTY_OPERATOR
})
@JsonTypeName("AdGroupWebpageServiceWebpageCondition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupWebpageServiceWebpageCondition {
  public static final String JSON_PROPERTY_ARGUMENT = "argument";
  private String argument;

  public static final String JSON_PROPERTY_WEBPAGE_CONDITION_TYPE = "webpageConditionType";
  private AdGroupWebpageServiceWebpageConditionType webpageConditionType;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private AdGroupWebpageServiceOperator operator;

  public AdGroupWebpageServiceWebpageCondition() { 
  }

  public AdGroupWebpageServiceWebpageCondition argument(String argument) {
    
    this.argument = argument;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;条件の設定値です。&lt;br&gt;ADD時、このフィールドは必須です。※typeがALL_PAGESの場合は省略可能となります。SET時、このフィールドは無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Value of rule setting.&lt;br&gt;This field is required in ADD operation, and will be ignored in SET operation. *If type is &#39;ALL_PAGES&#39;, this field is optional in ADD operation.&lt;/div&gt; 
   * @return argument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">条件の設定値です。<br>ADD時、このフィールドは必須です。※typeがALL_PAGESの場合は省略可能となります。SET時、このフィールドは無視されます。</div> <div lang=\"en\">Value of rule setting.<br>This field is required in ADD operation, and will be ignored in SET operation. *If type is 'ALL_PAGES', this field is optional in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_ARGUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArgument() {
    return argument;
  }


  @JsonProperty(JSON_PROPERTY_ARGUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArgument(String argument) {
    this.argument = argument;
  }


  public AdGroupWebpageServiceWebpageCondition webpageConditionType(AdGroupWebpageServiceWebpageConditionType webpageConditionType) {
    
    this.webpageConditionType = webpageConditionType;
    return this;
  }

   /**
   * Get webpageConditionType
   * @return webpageConditionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEBPAGE_CONDITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupWebpageServiceWebpageConditionType getWebpageConditionType() {
    return webpageConditionType;
  }


  @JsonProperty(JSON_PROPERTY_WEBPAGE_CONDITION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebpageConditionType(AdGroupWebpageServiceWebpageConditionType webpageConditionType) {
    this.webpageConditionType = webpageConditionType;
  }


  public AdGroupWebpageServiceWebpageCondition operator(AdGroupWebpageServiceOperator operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupWebpageServiceOperator getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperator(AdGroupWebpageServiceOperator operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupWebpageServiceWebpageCondition adGroupWebpageServiceWebpageCondition = (AdGroupWebpageServiceWebpageCondition) o;
    return Objects.equals(this.argument, adGroupWebpageServiceWebpageCondition.argument) &&
        Objects.equals(this.webpageConditionType, adGroupWebpageServiceWebpageCondition.webpageConditionType) &&
        Objects.equals(this.operator, adGroupWebpageServiceWebpageCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argument, webpageConditionType, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceWebpageCondition {\n");
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    webpageConditionType: ").append(toIndentedString(webpageConditionType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

