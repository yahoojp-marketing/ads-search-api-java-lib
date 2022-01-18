package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AssetServiceSetTrademarkStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceSetTrademarkStatusOperationオブジェクトは、操作対象の商標使用制限の情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceSetTrademarkStatusOperation object holds the target&#39;s trademark restriction information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceSetTrademarkStatusOperationオブジェクトは、操作対象の商標使用制限の情報を格納します。</div> <div lang=\"en\">AssetServiceSetTrademarkStatusOperation object holds the target's trademark restriction information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AssetServiceSetTrademarkStatusOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private List<AssetServiceSetTrademarkStatus> operand = new ArrayList<>();

  public AssetServiceSetTrademarkStatusOperation accountId(Long accountId) {
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

  public AssetServiceSetTrademarkStatusOperation operand(List<AssetServiceSetTrademarkStatus> operand) {
    this.operand = operand;
    return this;
  }

  public AssetServiceSetTrademarkStatusOperation addOperandItem(AssetServiceSetTrademarkStatus operandItem) {
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
  public List<AssetServiceSetTrademarkStatus> getOperand() {
    return operand;
  }

  public void setOperand(List<AssetServiceSetTrademarkStatus> operand) {
    this.operand = operand;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetServiceSetTrademarkStatusOperation assetServiceSetTrademarkStatusOperation = (AssetServiceSetTrademarkStatusOperation) o;
    return Objects.equals(this.accountId, assetServiceSetTrademarkStatusOperation.accountId) &&
        Objects.equals(this.operand, assetServiceSetTrademarkStatusOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceSetTrademarkStatusOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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

