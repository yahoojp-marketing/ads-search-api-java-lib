package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceTargetListOwner;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceTargetingList;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceOperationは、操作対象のターゲットリストを保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceOperation is an object that holds target retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceOperationは、操作対象のターゲットリストを保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceOperation is an object that holds target retargeting.</div> ")

public class RetargetingListServiceOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private JsonNullable<List<RetargetingListServiceTargetingList>> operand = JsonNullable.undefined();

  @JsonProperty("targetListOwner")
  private JsonNullable<RetargetingListServiceTargetListOwner> targetListOwner = JsonNullable.undefined();

  public RetargetingListServiceOperation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public RetargetingListServiceOperation operand(List<RetargetingListServiceTargetingList> operand) {
    this.operand = JsonNullable.of(operand);
    return this;
  }

  public RetargetingListServiceOperation addOperandItem(RetargetingListServiceTargetingList operandItem) {
    this.operand.get().add(operandItem);
    return this;
  }

  /**
   * Get operand
   * @return operand
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1,max=200) 
  public JsonNullable<List<RetargetingListServiceTargetingList>> getOperand() {
    return operand;
  }

  public void setOperand(JsonNullable<List<RetargetingListServiceTargetingList>> operand) {
    this.operand = operand;
  }

  public RetargetingListServiceOperation targetListOwner(RetargetingListServiceTargetListOwner targetListOwner) {
    this.targetListOwner = JsonNullable.of(targetListOwner);
    return this;
  }

  /**
   * Get targetListOwner
   * @return targetListOwner
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceTargetListOwner> getTargetListOwner() {
    return targetListOwner;
  }

  public void setTargetListOwner(JsonNullable<RetargetingListServiceTargetListOwner> targetListOwner) {
    this.targetListOwner = targetListOwner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceOperation retargetingListServiceOperation = (RetargetingListServiceOperation) o;
    return Objects.equals(this.accountId, retargetingListServiceOperation.accountId) &&
        Objects.equals(this.operand, retargetingListServiceOperation.operand) &&
        Objects.equals(this.targetListOwner, retargetingListServiceOperation.targetListOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand, targetListOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    targetListOwner: ").append(toIndentedString(targetListOwner)).append("\n");
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

