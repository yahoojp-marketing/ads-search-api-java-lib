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
import jp.co.yahoo.adssearchapi.v17.model.CampaignWebpageServiceWebpageConditionType;
import jp.co.yahoo.adssearchapi.v17.model.CampaignWebpageServiceWebpageOperator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignWebpageServiceWebpageConditionオブジェクトは、Webpageの条件を保持します。&lt;br&gt; このフィールドは、ADD時に必須となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignWebpageServiceWebpageCondition object contains the rules of webpage.&lt;br&gt; This field is required in ADD operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignWebpageServiceWebpageCondition.JSON_PROPERTY_ARGUMENT,
  CampaignWebpageServiceWebpageCondition.JSON_PROPERTY_TYPE,
  CampaignWebpageServiceWebpageCondition.JSON_PROPERTY_OPERATOR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignWebpageServiceWebpageCondition {
  public static final String JSON_PROPERTY_ARGUMENT = "argument";
  private String argument;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CampaignWebpageServiceWebpageConditionType type;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private CampaignWebpageServiceWebpageOperator operator;

  public CampaignWebpageServiceWebpageCondition() {
  }

  public CampaignWebpageServiceWebpageCondition argument(String argument) {
    
    this.argument = argument;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;条件の設定値です。&lt;br&gt; このフィールドは、ADD時に必須となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Value of rule setting.&lt;br&gt; This field is required in ADD operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return argument
  **/
  @jakarta.annotation.Nullable
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


  public CampaignWebpageServiceWebpageCondition type(CampaignWebpageServiceWebpageConditionType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignWebpageServiceWebpageConditionType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(CampaignWebpageServiceWebpageConditionType type) {
    this.type = type;
  }


  public CampaignWebpageServiceWebpageCondition operator(CampaignWebpageServiceWebpageOperator operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignWebpageServiceWebpageOperator getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperator(CampaignWebpageServiceWebpageOperator operator) {
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
    CampaignWebpageServiceWebpageCondition campaignWebpageServiceWebpageCondition = (CampaignWebpageServiceWebpageCondition) o;
    return Objects.equals(this.argument, campaignWebpageServiceWebpageCondition.argument) &&
        Objects.equals(this.type, campaignWebpageServiceWebpageCondition.type) &&
        Objects.equals(this.operator, campaignWebpageServiceWebpageCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argument, type, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignWebpageServiceWebpageCondition {\n");
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

