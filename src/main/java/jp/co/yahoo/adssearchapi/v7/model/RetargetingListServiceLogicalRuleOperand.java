package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceLogicalRuleOperandは、組合せ対象のターゲットリストを保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceLogicalRuleOperand is an object that holds target list of combination.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceLogicalRuleOperandは、組合せ対象のターゲットリストを保持するオブジェクトです。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">RetargetingListServiceLogicalRuleOperand is an object that holds target list of combination.<br> This field is required in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceLogicalRuleOperand   {
  @JsonProperty("targetListId")
  private Long targetListId = null;

  public RetargetingListServiceLogicalRuleOperand targetListId(Long targetListId) {
    this.targetListId = targetListId;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストIDです。<br>組合せのターゲットリストは設定できません。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">Target list ID.<br>Cannot set the combination target list.<br> This field is required in ADD and SET operation.</div> 
   * @return targetListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストIDです。<br>組合せのターゲットリストは設定できません。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">Target list ID.<br>Cannot set the combination target list.<br> This field is required in ADD and SET operation.</div> ")


  public Long getTargetListId() {
    return targetListId;
  }

  public void setTargetListId(Long targetListId) {
    this.targetListId = targetListId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceLogicalRuleOperand retargetingListServiceLogicalRuleOperand = (RetargetingListServiceLogicalRuleOperand) o;
    return Objects.equals(this.targetListId, retargetingListServiceLogicalRuleOperand.targetListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceLogicalRuleOperand {\n");
    
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
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

