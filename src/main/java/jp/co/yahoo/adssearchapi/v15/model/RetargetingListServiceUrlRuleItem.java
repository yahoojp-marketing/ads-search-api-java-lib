/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v15.model.RetargetingListServiceUrlRuleKey;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceUrlRuleItemは、URLルールの評価式を保持するオブジェクトです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ruleTypeがURL_RULEの場合、ADDおよびSET時にこのフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceUrlRuleItem is an object that holds evaluation of URL rules.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; If ruleType is  URL_RULE, this field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceUrlRuleItemは、URLルールの評価式を保持するオブジェクトです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ruleTypeがURL_RULEの場合、ADDおよびSET時にこのフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceUrlRuleItem is an object that holds evaluation of URL rules.<br> This field is optional in ADD and SET operation.<br> If ruleType is  URL_RULE, this field is required in ADD and SET operation.</div> ")
@JsonPropertyOrder({
  RetargetingListServiceUrlRuleItem.JSON_PROPERTY_URL_RULE_KEY
})
@JsonTypeName("RetargetingListServiceUrlRuleItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceUrlRuleItem {
  public static final String JSON_PROPERTY_URL_RULE_KEY = "urlRuleKey";
  private RetargetingListServiceUrlRuleKey urlRuleKey;

  public RetargetingListServiceUrlRuleItem() { 
  }

  public RetargetingListServiceUrlRuleItem urlRuleKey(RetargetingListServiceUrlRuleKey urlRuleKey) {
    
    this.urlRuleKey = urlRuleKey;
    return this;
  }

   /**
   * Get urlRuleKey
   * @return urlRuleKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_RULE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceUrlRuleKey getUrlRuleKey() {
    return urlRuleKey;
  }


  @JsonProperty(JSON_PROPERTY_URL_RULE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlRuleKey(RetargetingListServiceUrlRuleKey urlRuleKey) {
    this.urlRuleKey = urlRuleKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceUrlRuleItem retargetingListServiceUrlRuleItem = (RetargetingListServiceUrlRuleItem) o;
    return Objects.equals(this.urlRuleKey, retargetingListServiceUrlRuleItem.urlRuleKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlRuleKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceUrlRuleItem {\n");
    sb.append("    urlRuleKey: ").append(toIndentedString(urlRuleKey)).append("\n");
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

