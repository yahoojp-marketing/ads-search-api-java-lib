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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceRuleItemは、ルールの評価条件を保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceRuleItem is an object that holds evaluation condition of rule.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceRuleItemは、ルールの評価条件を保持するオブジェクトです。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">RetargetingListServiceRuleItem is an object that holds evaluation condition of rule.<br> This field is required in ADD and SET operation.</div> ")

public class RetargetingListServiceRuleItem   {
  @JsonProperty("customKeyRuleItem")
  private JsonNullable<RetargetingListServiceCustomKeyRuleItem> customKeyRuleItem = JsonNullable.undefined();

  @JsonProperty("ruleOperator")
  private JsonNullable<RetargetingListServiceRuleOperator> ruleOperator = JsonNullable.undefined();

  @JsonProperty("ruleType")
  private JsonNullable<RetargetingListServiceRuleType> ruleType = JsonNullable.undefined();

  @JsonProperty("urlRuleItem")
  private JsonNullable<RetargetingListServiceUrlRuleItem> urlRuleItem = JsonNullable.undefined();

  @JsonProperty("value")
  private JsonNullable<String> value = JsonNullable.undefined();

  public RetargetingListServiceRuleItem customKeyRuleItem(RetargetingListServiceCustomKeyRuleItem customKeyRuleItem) {
    this.customKeyRuleItem = JsonNullable.of(customKeyRuleItem);
    return this;
  }

  /**
   * Get customKeyRuleItem
   * @return customKeyRuleItem
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceCustomKeyRuleItem> getCustomKeyRuleItem() {
    return customKeyRuleItem;
  }

  public void setCustomKeyRuleItem(JsonNullable<RetargetingListServiceCustomKeyRuleItem> customKeyRuleItem) {
    this.customKeyRuleItem = customKeyRuleItem;
  }

  public RetargetingListServiceRuleItem ruleOperator(RetargetingListServiceRuleOperator ruleOperator) {
    this.ruleOperator = JsonNullable.of(ruleOperator);
    return this;
  }

  /**
   * Get ruleOperator
   * @return ruleOperator
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceRuleOperator> getRuleOperator() {
    return ruleOperator;
  }

  public void setRuleOperator(JsonNullable<RetargetingListServiceRuleOperator> ruleOperator) {
    this.ruleOperator = ruleOperator;
  }

  public RetargetingListServiceRuleItem ruleType(RetargetingListServiceRuleType ruleType) {
    this.ruleType = JsonNullable.of(ruleType);
    return this;
  }

  /**
   * Get ruleType
   * @return ruleType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceRuleType> getRuleType() {
    return ruleType;
  }

  public void setRuleType(JsonNullable<RetargetingListServiceRuleType> ruleType) {
    this.ruleType = ruleType;
  }

  public RetargetingListServiceRuleItem urlRuleItem(RetargetingListServiceUrlRuleItem urlRuleItem) {
    this.urlRuleItem = JsonNullable.of(urlRuleItem);
    return this;
  }

  /**
   * Get urlRuleItem
   * @return urlRuleItem
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceUrlRuleItem> getUrlRuleItem() {
    return urlRuleItem;
  }

  public void setUrlRuleItem(JsonNullable<RetargetingListServiceUrlRuleItem> urlRuleItem) {
    this.urlRuleItem = urlRuleItem;
  }

  public RetargetingListServiceRuleItem value(String value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * <div lang=\"ja\">評価値です。<br> ADDおよびSET時、このフィールドは必須となります。<br> ※括弧（()）、シングルクォート（&#39;）、ダブルクォート（&#34;）、タブ（\\t）は利用できません。<br> ※250文字まで指定可能です。</div> <div lang=\"en\">Evaluation value.<br> *Cannot use: bracket, single quote, double quote, and tab.<br> *Can select up to 250 characters.<br> This field is required in ADD and SET operation.</div> 
   * @return value
  */
  @ApiModelProperty(value = "<div lang=\"ja\">評価値です。<br> ADDおよびSET時、このフィールドは必須となります。<br> ※括弧（()）、シングルクォート（&#39;）、ダブルクォート（&#34;）、タブ（\\t）は利用できません。<br> ※250文字まで指定可能です。</div> <div lang=\"en\">Evaluation value.<br> *Cannot use: bracket, single quote, double quote, and tab.<br> *Can select up to 250 characters.<br> This field is required in ADD and SET operation.</div> ")


  public JsonNullable<String> getValue() {
    return value;
  }

  public void setValue(JsonNullable<String> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

