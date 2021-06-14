package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceBudgetPeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceBudgetオブジェクトは、キャンペーン予算に関する情報を表します。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceBudget object displays budget information for campaign.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceBudgetオブジェクトは、キャンペーン予算に関する情報を表します。<br> このフィールドは、ADD時に必須となり、SET時は省略可能となります。</div> <div lang=\"en\">CampaignServiceBudget object displays budget information for campaign.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")

public class CampaignServiceBudget   {
  @JsonProperty("amount")
  private JsonNullable<Long> amount = JsonNullable.undefined();

  @JsonProperty("budgetPeriod")
  private JsonNullable<CampaignServiceBudgetPeriod> budgetPeriod = JsonNullable.undefined();

  public CampaignServiceBudget amount(Long amount) {
    this.amount = JsonNullable.of(amount);
    return this;
  }

  /**
   * <div lang=\"ja\">1日単位のキャンペーン予算利用金額です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Amount of budget of Campaign.<br> This field is required in ADD operation, and is optional in SET operation.</div> 
   * @return amount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">1日単位のキャンペーン予算利用金額です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Amount of budget of Campaign.<br> This field is required in ADD operation, and is optional in SET operation.</div> ")


  public JsonNullable<Long> getAmount() {
    return amount;
  }

  public void setAmount(JsonNullable<Long> amount) {
    this.amount = amount;
  }

  public CampaignServiceBudget budgetPeriod(CampaignServiceBudgetPeriod budgetPeriod) {
    this.budgetPeriod = JsonNullable.of(budgetPeriod);
    return this;
  }

  /**
   * Get budgetPeriod
   * @return budgetPeriod
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBudgetPeriod> getBudgetPeriod() {
    return budgetPeriod;
  }

  public void setBudgetPeriod(JsonNullable<CampaignServiceBudgetPeriod> budgetPeriod) {
    this.budgetPeriod = budgetPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceBudget campaignServiceBudget = (CampaignServiceBudget) o;
    return Objects.equals(this.amount, campaignServiceBudget.amount) &&
        Objects.equals(this.budgetPeriod, campaignServiceBudget.budgetPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, budgetPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceBudget {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    budgetPeriod: ").append(toIndentedString(budgetPeriod)).append("\n");
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

