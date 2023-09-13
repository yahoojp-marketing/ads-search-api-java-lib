/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v10.model.RetargetingListServiceRuleItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceRuleGroupは、URL/LABELのルールをグループ化した情報を保持するオブジェクトです。&lt;br&gt; ADDおよびSET時に、このフィールドは省略可能となります。&lt;br&gt; isAllVisitorがTRUEである場合、ADDおよびSET時に必須となります。&lt;br&gt; ※SET時、isAllVisitorRule &#x3D; TRUEを指定してリクエストすると、このフィールドは無視されます。&lt;br&gt; ruleBaseTargetList.isDateSpecificRule &#x3D; TRUEの場合には、このフィールドは変更出来ません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceRuleGroup is an object that holds grouped URL/LABEL rules.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; If isAllVisitor is TRUE, this field is required in ADD and SET operation.&lt;br&gt; *In SET operation, if isAllVisitorRule &#x3D; TRUE, this field is ignored on request.&lt;br&gt; If ruleBaseTargetList.isDateSpecificRule &#x3D; TRUE, it is can not change.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RetargetingListServiceRuleGroup.JSON_PROPERTY_RULE_ITEMS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceRuleGroup {
  public static final String JSON_PROPERTY_RULE_ITEMS = "ruleItems";
  private List<RetargetingListServiceRuleItem> ruleItems;

  public RetargetingListServiceRuleGroup() {
  }

  public RetargetingListServiceRuleGroup ruleItems(List<RetargetingListServiceRuleItem> ruleItems) {
    
    this.ruleItems = ruleItems;
    return this;
  }

  public RetargetingListServiceRuleGroup addRuleItemsItem(RetargetingListServiceRuleItem ruleItemsItem) {
    if (this.ruleItems == null) {
      this.ruleItems = new ArrayList<>();
    }
    this.ruleItems.add(ruleItemsItem);
    return this;
  }

   /**
   * Get ruleItems
   * @return ruleItems
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetargetingListServiceRuleItem> getRuleItems() {
    return ruleItems;
  }


  @JsonProperty(JSON_PROPERTY_RULE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleItems(List<RetargetingListServiceRuleItem> ruleItems) {
    this.ruleItems = ruleItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceRuleGroup retargetingListServiceRuleGroup = (RetargetingListServiceRuleGroup) o;
    return Objects.equals(this.ruleItems, retargetingListServiceRuleGroup.ruleItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceRuleGroup {\n");
    sb.append("    ruleItems: ").append(toIndentedString(ruleItems)).append("\n");
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

