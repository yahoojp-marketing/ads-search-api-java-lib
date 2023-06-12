/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceIsAllVisitorRule;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceIsDateSpecificRule;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceRuleGroup;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceRuleBaseTargetListは、ベースターゲットリストの情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※targetListTypeがRULEの場合、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceRuleBaseTargetList is an object that holds Rule based target list information.&lt;br&gt; This field is optional.&lt;br&gt;*If the targetListType is RULE, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceRuleBaseTargetListは、ベースターゲットリストの情報を保持するオブジェクトです。<br> このフィールドは、省略可能となります。<br> ※targetListTypeがRULEの場合、このフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceRuleBaseTargetList is an object that holds Rule based target list information.<br> This field is optional.<br>*If the targetListType is RULE, this field is required.</div> ")
@JsonPropertyOrder({
  RetargetingListServiceRuleBaseTargetList.JSON_PROPERTY_END_DATE,
  RetargetingListServiceRuleBaseTargetList.JSON_PROPERTY_IS_ALL_VISITOR_RULE,
  RetargetingListServiceRuleBaseTargetList.JSON_PROPERTY_IS_DATE_SPECIFIC_RULE,
  RetargetingListServiceRuleBaseTargetList.JSON_PROPERTY_RULES,
  RetargetingListServiceRuleBaseTargetList.JSON_PROPERTY_START_DATE
})
@JsonTypeName("RetargetingListServiceRuleBaseTargetList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceRuleBaseTargetList {
  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_IS_ALL_VISITOR_RULE = "isAllVisitorRule";
  private RetargetingListServiceIsAllVisitorRule isAllVisitorRule;

  public static final String JSON_PROPERTY_IS_DATE_SPECIFIC_RULE = "isDateSpecificRule";
  private RetargetingListServiceIsDateSpecificRule isDateSpecificRule;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<RetargetingListServiceRuleGroup> rules = null;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public RetargetingListServiceRuleBaseTargetList() { 
  }

  public RetargetingListServiceRuleBaseTargetList endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ルール適用終了日です。&lt;br&gt; ※このフィールドの追加と編集は廃止され、現在設定できません。&lt;br&gt; ※YYYYMMDD形式です。&lt;br&gt; ※リクエスト日は2037/12/30まで 指定可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End date of rule setting.&lt;br&gt; *In YYYYMMDD format&lt;br&gt; *Request date can be set up to 2037/12/30&lt;br&gt; *Adding and editing this field is obsolete. Currently not available.&lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ルール適用終了日です。<br> ※このフィールドの追加と編集は廃止され、現在設定できません。<br> ※YYYYMMDD形式です。<br> ※リクエスト日は2037/12/30まで 指定可能です。</div> <div lang=\"en\">End date of rule setting.<br> *In YYYYMMDD format<br> *Request date can be set up to 2037/12/30<br> *Adding and editing this field is obsolete. Currently not available.</div> ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public RetargetingListServiceRuleBaseTargetList isAllVisitorRule(RetargetingListServiceIsAllVisitorRule isAllVisitorRule) {
    
    this.isAllVisitorRule = isAllVisitorRule;
    return this;
  }

   /**
   * Get isAllVisitorRule
   * @return isAllVisitorRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ALL_VISITOR_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceIsAllVisitorRule getIsAllVisitorRule() {
    return isAllVisitorRule;
  }


  @JsonProperty(JSON_PROPERTY_IS_ALL_VISITOR_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAllVisitorRule(RetargetingListServiceIsAllVisitorRule isAllVisitorRule) {
    this.isAllVisitorRule = isAllVisitorRule;
  }


  public RetargetingListServiceRuleBaseTargetList isDateSpecificRule(RetargetingListServiceIsDateSpecificRule isDateSpecificRule) {
    
    this.isDateSpecificRule = isDateSpecificRule;
    return this;
  }

   /**
   * Get isDateSpecificRule
   * @return isDateSpecificRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DATE_SPECIFIC_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceIsDateSpecificRule getIsDateSpecificRule() {
    return isDateSpecificRule;
  }


  @JsonProperty(JSON_PROPERTY_IS_DATE_SPECIFIC_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDateSpecificRule(RetargetingListServiceIsDateSpecificRule isDateSpecificRule) {
    this.isDateSpecificRule = isDateSpecificRule;
  }


  public RetargetingListServiceRuleBaseTargetList rules(List<RetargetingListServiceRuleGroup> rules) {
    
    this.rules = rules;
    return this;
  }

  public RetargetingListServiceRuleBaseTargetList addRulesItem(RetargetingListServiceRuleGroup rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetargetingListServiceRuleGroup> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRules(List<RetargetingListServiceRuleGroup> rules) {
    this.rules = rules;
  }


  public RetargetingListServiceRuleBaseTargetList startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ルール適用開始日です。&lt;br&gt; ※YYYYMMDD形式です。&lt;br&gt;※リクエスト日は2037/12/30まで 指定可能です。&lt;br&gt; ※このフィールドの追加と編集は廃止され、現在設定できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date of rule setting.&lt;br&gt; *In YYYYMMDD format&lt;br&gt; *Request date can be set up to 2037/12/30&lt;br&gt; *Adding and editing this field is obsolete. Currently not available.&lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ルール適用開始日です。<br> ※YYYYMMDD形式です。<br>※リクエスト日は2037/12/30まで 指定可能です。<br> ※このフィールドの追加と編集は廃止され、現在設定できません。</div> <div lang=\"en\">Start date of rule setting.<br> *In YYYYMMDD format<br> *Request date can be set up to 2037/12/30<br> *Adding and editing this field is obsolete. Currently not available.</div> ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceRuleBaseTargetList retargetingListServiceRuleBaseTargetList = (RetargetingListServiceRuleBaseTargetList) o;
    return Objects.equals(this.endDate, retargetingListServiceRuleBaseTargetList.endDate) &&
        Objects.equals(this.isAllVisitorRule, retargetingListServiceRuleBaseTargetList.isAllVisitorRule) &&
        Objects.equals(this.isDateSpecificRule, retargetingListServiceRuleBaseTargetList.isDateSpecificRule) &&
        Objects.equals(this.rules, retargetingListServiceRuleBaseTargetList.rules) &&
        Objects.equals(this.startDate, retargetingListServiceRuleBaseTargetList.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, isAllVisitorRule, isDateSpecificRule, rules, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceRuleBaseTargetList {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isAllVisitorRule: ").append(toIndentedString(isAllVisitorRule)).append("\n");
    sb.append("    isDateSpecificRule: ").append(toIndentedString(isDateSpecificRule)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

