package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceCustomKeyRuleItem;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceRuleOperator;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceRuleType;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceUrlRuleItem;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceRuleItemは、ルールの評価条件を保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceRuleItem is an object that holds evaluation condition of rule.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceRuleItemは、ルールの評価条件を保持するオブジェクトです。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">RetargetingListServiceRuleItem is an object that holds evaluation condition of rule.<br> This field is required in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceRuleItem   {
  @JsonProperty("customKeyRuleItem")
  private RetargetingListServiceCustomKeyRuleItem customKeyRuleItem = null;

  @JsonProperty("ruleOperator")
  private RetargetingListServiceRuleOperator ruleOperator = null;

  @JsonProperty("ruleType")
  private RetargetingListServiceRuleType ruleType = null;

  @JsonProperty("urlRuleItem")
  private RetargetingListServiceUrlRuleItem urlRuleItem = null;

  @JsonProperty("value")
  private String value = null;

  public RetargetingListServiceRuleItem customKeyRuleItem(RetargetingListServiceCustomKeyRuleItem customKeyRuleItem) {
    this.customKeyRuleItem = customKeyRuleItem;
    return this;
  }

  /**
   * Get customKeyRuleItem
   * @return customKeyRuleItem
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceCustomKeyRuleItem getCustomKeyRuleItem() {
    return customKeyRuleItem;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceRuleOperator getRuleOperator() {
    return ruleOperator;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceRuleType getRuleType() {
    return ruleType;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceUrlRuleItem getUrlRuleItem() {
    return urlRuleItem;
  }

  public void setUrlRuleItem(RetargetingListServiceUrlRuleItem urlRuleItem) {
    this.urlRuleItem = urlRuleItem;
  }

  public RetargetingListServiceRuleItem value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <div lang=\"ja\">評価値です。<br> ADDおよびSET時、このフィールドは必須となります。<br> ※括弧（()）、シングルクォート（&#39;）、ダブルクォート（&#34;）、タブ（\\t）は利用できません。<br> ※250文字まで指定可能です。</div> <div lang=\"en\">Evaluation value.<br> *Cannot use: bracket, single quote, double quote, and tab.<br> *Can select up to 250 characters.<br> This field is required in ADD and SET operation.</div> 
   * @return value
  */
  @ApiModelProperty(value = "<div lang=\"ja\">評価値です。<br> ADDおよびSET時、このフィールドは必須となります。<br> ※括弧（()）、シングルクォート（&#39;）、ダブルクォート（&#34;）、タブ（\\t）は利用できません。<br> ※250文字まで指定可能です。</div> <div lang=\"en\">Evaluation value.<br> *Cannot use: bracket, single quote, double quote, and tab.<br> *Can select up to 250 characters.<br> This field is required in ADD and SET operation.</div> ")


  public String getValue() {
    return value;
  }

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

