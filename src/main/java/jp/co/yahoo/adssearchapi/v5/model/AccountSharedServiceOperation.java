package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AccountShared;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountSharedServiceOperationオブジェクトは、操作対象となるアカウント情報と処理の内容を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountSharedServiceOperation object describes information of account for operation and list of operations.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountSharedServiceOperationオブジェクトは、操作対象となるアカウント情報と処理の内容を表します。</div> <div lang=\"en\">AccountSharedServiceOperation object describes information of account for operation and list of operations.</div> ")

public class AccountSharedServiceOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private JsonNullable<List<AccountShared>> operand = JsonNullable.undefined();

  public AccountSharedServiceOperation accountId(Long accountId) {
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

  public AccountSharedServiceOperation operand(List<AccountShared> operand) {
    this.operand = JsonNullable.of(operand);
    return this;
  }

  public AccountSharedServiceOperation addOperandItem(AccountShared operandItem) {
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
@Size(min=1,max=20) 
  public JsonNullable<List<AccountShared>> getOperand() {
    return operand;
  }

  public void setOperand(JsonNullable<List<AccountShared>> operand) {
    this.operand = operand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSharedServiceOperation accountSharedServiceOperation = (AccountSharedServiceOperation) o;
    return Objects.equals(this.accountId, accountSharedServiceOperation.accountId) &&
        Objects.equals(this.operand, accountSharedServiceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSharedServiceOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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

