package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignRetargetingList;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignRetargetingListServiceOperationオブジェクトは、操作対象となるキャンペーン階層のターゲットリスト設定情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignRetargetingListServiceOperation object holds the setting information of target list on campaign level to be object.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignRetargetingListServiceOperationオブジェクトは、操作対象となるキャンペーン階層のターゲットリスト設定情報を保持します。</div> <div lang=\"en\">CampaignRetargetingListServiceOperation object holds the setting information of target list on campaign level to be object.</div> ")

public class CampaignRetargetingListServiceOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private JsonNullable<List<CampaignRetargetingList>> operand = JsonNullable.undefined();

  public CampaignRetargetingListServiceOperation accountId(Long accountId) {
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

  public CampaignRetargetingListServiceOperation operand(List<CampaignRetargetingList> operand) {
    this.operand = JsonNullable.of(operand);
    return this;
  }

  public CampaignRetargetingListServiceOperation addOperandItem(CampaignRetargetingList operandItem) {
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
@Size(min=1,max=1000) 
  public JsonNullable<List<CampaignRetargetingList>> getOperand() {
    return operand;
  }

  public void setOperand(JsonNullable<List<CampaignRetargetingList>> operand) {
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
    CampaignRetargetingListServiceOperation campaignRetargetingListServiceOperation = (CampaignRetargetingListServiceOperation) o;
    return Objects.equals(this.accountId, campaignRetargetingListServiceOperation.accountId) &&
        Objects.equals(this.operand, campaignRetargetingListServiceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRetargetingListServiceOperation {\n");
    
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

