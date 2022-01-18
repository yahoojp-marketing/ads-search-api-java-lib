package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.RetargetingListServiceLogicalCondition;
import jp.co.yahoo.adssearchapi.v7.model.RetargetingListServiceLogicalRuleOperand;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceLogicalGroupは、組合せグループの情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceLogicalGroup is an object that holds combination group information.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceLogicalGroupは、組合せグループの情報を保持するオブジェクトです。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">RetargetingListServiceLogicalGroup is an object that holds combination group information.<br> This field is required in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceLogicalGroup   {
  @JsonProperty("logicalCondition")
  private RetargetingListServiceLogicalCondition logicalCondition = null;

  @JsonProperty("logicalOperand")
  @Valid
  private List<RetargetingListServiceLogicalRuleOperand> logicalOperand = null;

  public RetargetingListServiceLogicalGroup logicalCondition(RetargetingListServiceLogicalCondition logicalCondition) {
    this.logicalCondition = logicalCondition;
    return this;
  }

  /**
   * Get logicalCondition
   * @return logicalCondition
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceLogicalCondition getLogicalCondition() {
    return logicalCondition;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RetargetingListServiceLogicalRuleOperand> getLogicalOperand() {
    return logicalOperand;
  }

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

