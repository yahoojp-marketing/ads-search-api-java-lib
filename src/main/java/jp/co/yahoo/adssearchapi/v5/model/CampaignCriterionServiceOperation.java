package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignCriterion;
import jp.co.yahoo.adssearchapi.v5.model.CampaignCriterionServiceUse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionServiceOperationオブジェクトは、操作の対象となるキャンペーンのクライテリアと処理の内容を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterionServiceOperation object describes campaign criteria for operation and list of operations.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCriterionServiceOperationオブジェクトは、操作の対象となるキャンペーンのクライテリアと処理の内容を表します。</div> <div lang=\"en\">CampaignCriterionServiceOperation object describes campaign criteria for operation and list of operations.</div> ")

public class CampaignCriterionServiceOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("operand")
  @Valid
  private JsonNullable<List<CampaignCriterion>> operand = JsonNullable.undefined();

  @JsonProperty("use")
  private JsonNullable<CampaignCriterionServiceUse> use = JsonNullable.undefined();

  public CampaignCriterionServiceOperation accountId(Long accountId) {
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

  public CampaignCriterionServiceOperation campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignCriterionServiceOperation operand(List<CampaignCriterion> operand) {
    this.operand = JsonNullable.of(operand);
    return this;
  }

  public CampaignCriterionServiceOperation addOperandItem(CampaignCriterion operandItem) {
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
  public JsonNullable<List<CampaignCriterion>> getOperand() {
    return operand;
  }

  public void setOperand(JsonNullable<List<CampaignCriterion>> operand) {
    this.operand = operand;
  }

  public CampaignCriterionServiceOperation use(CampaignCriterionServiceUse use) {
    this.use = JsonNullable.of(use);
    return this;
  }

  /**
   * Get use
   * @return use
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignCriterionServiceUse> getUse() {
    return use;
  }

  public void setUse(JsonNullable<CampaignCriterionServiceUse> use) {
    this.use = use;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCriterionServiceOperation campaignCriterionServiceOperation = (CampaignCriterionServiceOperation) o;
    return Objects.equals(this.accountId, campaignCriterionServiceOperation.accountId) &&
        Objects.equals(this.campaignId, campaignCriterionServiceOperation.campaignId) &&
        Objects.equals(this.operand, campaignCriterionServiceOperation.operand) &&
        Objects.equals(this.use, campaignCriterionServiceOperation.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, operand, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCriterionServiceOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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

