package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.FeedItem;
import jp.co.yahoo.adssearchapi.v6.model.FeedItemServicePlaceholderType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceOperationオブジェクトは、フィードアイテムの情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceOperation contains the Feed Item information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceOperationオブジェクトは、フィードアイテムの情報を格納します。</div> <div lang=\"en\">FeedItemServiceOperation contains the Feed Item information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private List<FeedItem> operand = new ArrayList<>();

  @JsonProperty("placeholderType")
  private FeedItemServicePlaceholderType placeholderType = null;

  public FeedItemServiceOperation accountId(Long accountId) {
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

  public FeedItemServiceOperation operand(List<FeedItem> operand) {
    this.operand = operand;
    return this;
  }

  public FeedItemServiceOperation addOperandItem(FeedItem operandItem) {
    if (this.operand == null) {
      this.operand = new ArrayList<>();
    }
    this.operand.add(operandItem);
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
  public List<FeedItem> getOperand() {
    return operand;
  }

  public void setOperand(List<FeedItem> operand) {
    this.operand = operand;
  }

  public FeedItemServiceOperation placeholderType(FeedItemServicePlaceholderType placeholderType) {
    this.placeholderType = placeholderType;
    return this;
  }

  /**
   * Get placeholderType
   * @return placeholderType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public FeedItemServicePlaceholderType getPlaceholderType() {
    return placeholderType;
  }

  public void setPlaceholderType(FeedItemServicePlaceholderType placeholderType) {
    this.placeholderType = placeholderType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceOperation feedItemServiceOperation = (FeedItemServiceOperation) o;
    return Objects.equals(this.accountId, feedItemServiceOperation.accountId) &&
        Objects.equals(this.operand, feedItemServiceOperation.operand) &&
        Objects.equals(this.placeholderType, feedItemServiceOperation.placeholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand, placeholderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceOperation {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

