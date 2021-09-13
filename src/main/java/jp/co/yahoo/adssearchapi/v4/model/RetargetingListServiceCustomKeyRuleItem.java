package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceCustomKeyRuleItemは、カスタムキールールの評価式を保持するオブジェクトです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt;ruleTypeがCUSTOM_KEY_RULEの場合、ADDおよびSET時にこのフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceCustomKeyRuleItem is an object that holds evaluation of custom key rules.　&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; If  ruleType is CUSTOM_KEY_RULE, this field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceCustomKeyRuleItemは、カスタムキールールの評価式を保持するオブジェクトです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br>ruleTypeがCUSTOM_KEY_RULEの場合、ADDおよびSET時にこのフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceCustomKeyRuleItem is an object that holds evaluation of custom key rules.　<br> This field is optional in ADD and SET operation.<br> If  ruleType is CUSTOM_KEY_RULE, this field is required in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceCustomKeyRuleItem   {
  @JsonProperty("textKey")
  private String textKey = null;

  public RetargetingListServiceCustomKeyRuleItem textKey(String textKey) {
    this.textKey = textKey;
    return this;
  }

  /**
   * <div lang=\"ja\">評価項目です。<br> ADDおよびSET時、このフィールドは必須となります。</div><div lang=\"en\">Evaluation item.<br> This field is required in ADD and SET operation.</div> 
   * @return textKey
  */
  @ApiModelProperty(value = "<div lang=\"ja\">評価項目です。<br> ADDおよびSET時、このフィールドは必須となります。</div><div lang=\"en\">Evaluation item.<br> This field is required in ADD and SET operation.</div> ")


  public String getTextKey() {
    return textKey;
  }

  public void setTextKey(String textKey) {
    this.textKey = textKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceCustomKeyRuleItem retargetingListServiceCustomKeyRuleItem = (RetargetingListServiceCustomKeyRuleItem) o;
    return Objects.equals(this.textKey, retargetingListServiceCustomKeyRuleItem.textKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceCustomKeyRuleItem {\n");
    
    sb.append("    textKey: ").append(toIndentedString(textKey)).append("\n");
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

