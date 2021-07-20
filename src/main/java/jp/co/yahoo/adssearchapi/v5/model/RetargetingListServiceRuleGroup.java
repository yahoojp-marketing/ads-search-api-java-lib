package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceRuleItem;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceRuleGroupは、URL/LABELのルールをグループ化した情報を保持するオブジェクトです。&lt;br&gt; ADDおよびSET時に、このフィールドは省略可能となります。&lt;br&gt; isAllVisitorがTRUEである場合、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceRuleGroup is an object that holds grouped URL/LABEL rules.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; If isAllVisitor is TRUE, this field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceRuleGroupは、URL/LABELのルールをグループ化した情報を保持するオブジェクトです。<br> ADDおよびSET時に、このフィールドは省略可能となります。<br> isAllVisitorがTRUEである場合、ADDおよびSET時に必須となります。</div> <div lang=\"en\">RetargetingListServiceRuleGroup is an object that holds grouped URL/LABEL rules.<br> This field is optional in ADD and SET operation.<br> If isAllVisitor is TRUE, this field is required in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceRuleGroup   {
  @JsonProperty("ruleItems")
  @Valid
  private List<RetargetingListServiceRuleItem> ruleItems = null;

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RetargetingListServiceRuleItem> getRuleItems() {
    return ruleItems;
  }

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

