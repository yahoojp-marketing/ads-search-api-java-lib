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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v15.model.RetargetingListServiceLogicalCondition;
import jp.co.yahoo.adssearchapi.v15.model.RetargetingListServiceLogicalRuleOperand;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceLogicalGroupは、組合せグループの情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceLogicalGroup is an object that holds combination group information.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceLogicalGroupは、組合せグループの情報を保持するオブジェクトです。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">RetargetingListServiceLogicalGroup is an object that holds combination group information.<br> This field is required in ADD and SET operation.</div> ")
@JsonPropertyOrder({
  RetargetingListServiceLogicalGroup.JSON_PROPERTY_LOGICAL_CONDITION,
  RetargetingListServiceLogicalGroup.JSON_PROPERTY_LOGICAL_OPERAND
})
@JsonTypeName("RetargetingListServiceLogicalGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceLogicalGroup {
  public static final String JSON_PROPERTY_LOGICAL_CONDITION = "logicalCondition";
  private RetargetingListServiceLogicalCondition logicalCondition;

  public static final String JSON_PROPERTY_LOGICAL_OPERAND = "logicalOperand";
  private List<RetargetingListServiceLogicalRuleOperand> logicalOperand = null;

  public RetargetingListServiceLogicalGroup() { 
  }

  public RetargetingListServiceLogicalGroup logicalCondition(RetargetingListServiceLogicalCondition logicalCondition) {
    
    this.logicalCondition = logicalCondition;
    return this;
  }

   /**
   * Get logicalCondition
   * @return logicalCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGICAL_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceLogicalCondition getLogicalCondition() {
    return logicalCondition;
  }


  @JsonProperty(JSON_PROPERTY_LOGICAL_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogicalCondition(RetargetingListServiceLogicalCondition logicalCondition) {
    this.logicalCondition = logicalCondition;
  }


  public RetargetingListServiceLogicalGroup logicalOperand(List<RetargetingListServiceLogicalRuleOperand> logicalOperand) {
    
    this.logicalOperand = logicalOperand;
    return this;
  }

  public RetargetingListServiceLogicalGroup addLogicalOperandItem(RetargetingListServiceLogicalRuleOperand logicalOperandItem) {
    if (this.logicalOperand == null) {
      this.logicalOperand = new ArrayList<>();
    }
    this.logicalOperand.add(logicalOperandItem);
    return this;
  }

   /**
   * Get logicalOperand
   * @return logicalOperand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGICAL_OPERAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetargetingListServiceLogicalRuleOperand> getLogicalOperand() {
    return logicalOperand;
  }


  @JsonProperty(JSON_PROPERTY_LOGICAL_OPERAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogicalOperand(List<RetargetingListServiceLogicalRuleOperand> logicalOperand) {
    this.logicalOperand = logicalOperand;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceLogicalGroup retargetingListServiceLogicalGroup = (RetargetingListServiceLogicalGroup) o;
    return Objects.equals(this.logicalCondition, retargetingListServiceLogicalGroup.logicalCondition) &&
        Objects.equals(this.logicalOperand, retargetingListServiceLogicalGroup.logicalOperand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalCondition, logicalOperand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceLogicalGroup {\n");
    sb.append("    logicalCondition: ").append(toIndentedString(logicalCondition)).append("\n");
    sb.append("    logicalOperand: ").append(toIndentedString(logicalOperand)).append("\n");
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

