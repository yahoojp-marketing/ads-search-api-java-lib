package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceUrlRuleKey;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceUrlRuleItemは、URLルールの評価式を保持するオブジェクトです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ruleTypeがURL_RULEの場合、ADDおよびSET時にこのフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceUrlRuleItem is an object that holds evaluation of URL rules.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; If ruleType is  URL_RULE, this field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceUrlRuleItemは、URLルールの評価式を保持するオブジェクトです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ruleTypeがURL_RULEの場合、ADDおよびSET時にこのフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceUrlRuleItem is an object that holds evaluation of URL rules.<br> This field is optional in ADD and SET operation.<br> If ruleType is  URL_RULE, this field is required in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceUrlRuleItem   {
  @JsonProperty("urlRuleKey")
  private RetargetingListServiceUrlRuleKey urlRuleKey = null;

  public RetargetingListServiceUrlRuleItem urlRuleKey(RetargetingListServiceUrlRuleKey urlRuleKey) {
    this.urlRuleKey = urlRuleKey;
    return this;
  }

  /**
   * Get urlRuleKey
   * @return urlRuleKey
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceUrlRuleKey getUrlRuleKey() {
    return urlRuleKey;
  }

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

