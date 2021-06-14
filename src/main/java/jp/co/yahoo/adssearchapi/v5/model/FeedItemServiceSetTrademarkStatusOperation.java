package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServicePlaceholderType;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceSetTrademarkStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceSetTrademarkStatusOperationオブジェクトは、操作対象の商標使用制限の情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceSetTrademarkStatusOperation object holds the target&#39;s trademark restriction information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceSetTrademarkStatusOperationオブジェクトは、操作対象の商標使用制限の情報を格納します。</div> <div lang=\"en\">FeedItemServiceSetTrademarkStatusOperation object holds the target's trademark restriction information.</div> ")

public class FeedItemServiceSetTrademarkStatusOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private JsonNullable<List<FeedItemServiceSetTrademarkStatus>> operand = JsonNullable.undefined();

  @JsonProperty("placeholderType")
  private JsonNullable<FeedItemServicePlaceholderType> placeholderType = JsonNullable.undefined();

  public FeedItemServiceSetTrademarkStatusOperation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public FeedItemServiceSetTrademarkStatusOperation operand(List<FeedItemServiceSetTrademarkStatus> operand) {
    this.operand = JsonNullable.of(operand);
    return this;
  }

  public FeedItemServiceSetTrademarkStatusOperation addOperandItem(FeedItemServiceSetTrademarkStatus operandItem) {
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
@Size(min=1,max=2000) 
  public JsonNullable<List<FeedItemServiceSetTrademarkStatus>> getOperand() {
    return operand;
  }

  public void setOperand(JsonNullable<List<FeedItemServiceSetTrademarkStatus>> operand) {
    this.operand = operand;
  }

  public FeedItemServiceSetTrademarkStatusOperation placeholderType(FeedItemServicePlaceholderType placeholderType) {
    this.placeholderType = JsonNullable.of(placeholderType);
    return this;
  }

  /**
   * Get placeholderType
   * @return placeholderType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public JsonNullable<FeedItemServicePlaceholderType> getPlaceholderType() {
    return placeholderType;
  }

  public void setPlaceholderType(JsonNullable<FeedItemServicePlaceholderType> placeholderType) {
    this.placeholderType = placeholderType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceSetTrademarkStatusOperation feedItemServiceSetTrademarkStatusOperation = (FeedItemServiceSetTrademarkStatusOperation) o;
    return Objects.equals(this.accountId, feedItemServiceSetTrademarkStatusOperation.accountId) &&
        Objects.equals(this.operand, feedItemServiceSetTrademarkStatusOperation.operand) &&
        Objects.equals(this.placeholderType, feedItemServiceSetTrademarkStatusOperation.placeholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand, placeholderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceSetTrademarkStatusOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    placeholderType: ").append(toIndentedString(placeholderType)).append("\n");
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

