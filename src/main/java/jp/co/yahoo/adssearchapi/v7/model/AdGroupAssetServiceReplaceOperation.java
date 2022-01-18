package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAssetServiceList;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAssetServiceReplaceOperationオブジェクトは、アセット情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAssetServiceReplaceOperation is a container of Asset information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAssetServiceReplaceOperationオブジェクトは、アセット情報を格納するコンテナです。</div> <div lang=\"en\">AdGroupAssetServiceReplaceOperation is a container of Asset information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAssetServiceReplaceOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private List<AdGroupAssetServiceList> operand = new ArrayList<>();

  public AdGroupAssetServiceReplaceOperation accountId(Long accountId) {
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

  public AdGroupAssetServiceReplaceOperation operand(List<AdGroupAssetServiceList> operand) {
    this.operand = operand;
    return this;
  }

  public AdGroupAssetServiceReplaceOperation addOperandItem(AdGroupAssetServiceList operandItem) {
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
@Size(min=1,max=200) 
  public List<AdGroupAssetServiceList> getOperand() {
    return operand;
  }

  public void setOperand(List<AdGroupAssetServiceList> operand) {
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
    AdGroupAssetServiceReplaceOperation adGroupAssetServiceReplaceOperation = (AdGroupAssetServiceReplaceOperation) o;
    return Objects.equals(this.accountId, adGroupAssetServiceReplaceOperation.accountId) &&
        Objects.equals(this.operand, adGroupAssetServiceReplaceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAssetServiceReplaceOperation {\n");
    
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

