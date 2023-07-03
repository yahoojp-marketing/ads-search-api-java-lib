/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v9.model.RetargetingListServiceCustomKeyRuleItem;
import jp.co.yahoo.adssearchapi.v9.model.RetargetingListServiceRuleOperator;
import jp.co.yahoo.adssearchapi.v9.model.RetargetingListServiceRuleType;
import jp.co.yahoo.adssearchapi.v9.model.RetargetingListServiceUrlRuleItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceRuleItemは、ルールの評価条件を保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceRuleItem is an object that holds evaluation condition of rule.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RetargetingListServiceRuleItem.JSON_PROPERTY_CUSTOM_KEY_RULE_ITEM,
  RetargetingListServiceRuleItem.JSON_PROPERTY_RULE_OPERATOR,
  RetargetingListServiceRuleItem.JSON_PROPERTY_RULE_TYPE,
  RetargetingListServiceRuleItem.JSON_PROPERTY_URL_RULE_ITEM,
  RetargetingListServiceRuleItem.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceRuleItem {
  public static final String JSON_PROPERTY_CUSTOM_KEY_RULE_ITEM = "customKeyRuleItem";
  private RetargetingListServiceCustomKeyRuleItem customKeyRuleItem;

  public static final String JSON_PROPERTY_RULE_OPERATOR = "ruleOperator";
  private RetargetingListServiceRuleOperator ruleOperator;

  public static final String JSON_PROPERTY_RULE_TYPE = "ruleType";
  private RetargetingListServiceRuleType ruleType;

  public static final String JSON_PROPERTY_URL_RULE_ITEM = "urlRuleItem";
  private RetargetingListServiceUrlRuleItem urlRuleItem;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public RetargetingListServiceRuleItem() {
  }

  public RetargetingListServiceRuleItem customKeyRuleItem(RetargetingListServiceCustomKeyRuleItem customKeyRuleItem) {
    
    this.customKeyRuleItem = customKeyRuleItem;
    return this;
  }

   /**
   * Get customKeyRuleItem
   * @return customKeyRuleItem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_KEY_RULE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceCustomKeyRuleItem getCustomKeyRuleItem() {
    return customKeyRuleItem;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_KEY_RULE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomKeyRuleItem(RetargetingListServiceCustomKeyRuleItem customKeyRuleItem) {
    this.customKeyRuleItem = customKeyRuleItem;
  }


  public RetargetingListServiceRuleItem ruleOperator(RetargetingListServiceRuleOperator ruleOperator) {
    
    this.ruleOperator = ruleOperator;
    return this;
  }

   /**
   * Get ruleOperator
   * @return ruleOperator
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceRuleOperator getRuleOperator() {
    return ruleOperator;
  }


  @JsonProperty(JSON_PROPERTY_RULE_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleOperator(RetargetingListServiceRuleOperator ruleOperator) {
    this.ruleOperator = ruleOperator;
  }


  public RetargetingListServiceRuleItem ruleType(RetargetingListServiceRuleType ruleType) {
    
    this.ruleType = ruleType;
    return this;
  }

   /**
   * Get ruleType
   * @return ruleType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceRuleType getRuleType() {
    return ruleType;
  }


  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleType(RetargetingListServiceRuleType ruleType) {
    this.ruleType = ruleType;
  }


  public RetargetingListServiceRuleItem urlRuleItem(RetargetingListServiceUrlRuleItem urlRuleItem) {
    
    this.urlRuleItem = urlRuleItem;
    return this;
  }

   /**
   * Get urlRuleItem
   * @return urlRuleItem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_RULE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceUrlRuleItem getUrlRuleItem() {
    return urlRuleItem;
  }


  @JsonProperty(JSON_PROPERTY_URL_RULE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlRuleItem(RetargetingListServiceUrlRuleItem urlRuleItem) {
    this.urlRuleItem = urlRuleItem;
  }


  public RetargetingListServiceRuleItem value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;評価値です。&lt;br&gt; ADDおよびSET時、このフィールドは必須となります。&lt;br&gt; ※括弧（()）、シングルクォート（&amp;#39;）、ダブルクォート（&amp;#34;）、タブ（\\t）は利用できません。&lt;br&gt; ※250文字まで指定可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Evaluation value.&lt;br&gt; *Cannot use: bracket, single quote, double quote, and tab.&lt;br&gt; *Can select up to 250 characters.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceRuleItem retargetingListServiceRuleItem = (RetargetingListServiceRuleItem) o;
    return Objects.equals(this.customKeyRuleItem, retargetingListServiceRuleItem.customKeyRuleItem) &&
        Objects.equals(this.ruleOperator, retargetingListServiceRuleItem.ruleOperator) &&
        Objects.equals(this.ruleType, retargetingListServiceRuleItem.ruleType) &&
        Objects.equals(this.urlRuleItem, retargetingListServiceRuleItem.urlRuleItem) &&
        Objects.equals(this.value, retargetingListServiceRuleItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customKeyRuleItem, ruleOperator, ruleType, urlRuleItem, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceRuleItem {\n");
    sb.append("    customKeyRuleItem: ").append(toIndentedString(customKeyRuleItem)).append("\n");
    sb.append("    ruleOperator: ").append(toIndentedString(ruleOperator)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    urlRuleItem: ").append(toIndentedString(urlRuleItem)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

