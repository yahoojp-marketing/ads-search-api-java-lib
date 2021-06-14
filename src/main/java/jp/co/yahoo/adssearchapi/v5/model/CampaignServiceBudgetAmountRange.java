package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceBudgetAmountRangeは、予算利用金額による検索対象範囲を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceBudgetAmountRange represents the search range by budget amount.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceBudgetAmountRangeは、予算利用金額による検索対象範囲を表します。</div> <div lang=\"en\">CampaignServiceBudgetAmountRange represents the search range by budget amount.</div> ")

public class CampaignServiceBudgetAmountRange   {
  @JsonProperty("min")
  private JsonNullable<Long> min = JsonNullable.undefined();

  @JsonProperty("max")
  private JsonNullable<Long> max = JsonNullable.undefined();

  public CampaignServiceBudgetAmountRange min(Long min) {
    this.min = JsonNullable.of(min);
    return this;
  }

  /**
   * <div lang=\"ja\">検索対象範囲の最小値です。</div> <div lang=\"en\">This is the minimum value of the search range.</div> 
   * @return min
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索対象範囲の最小値です。</div> <div lang=\"en\">This is the minimum value of the search range.</div> ")


  public JsonNullable<Long> getMin() {
    return min;
  }

  public void setMin(JsonNullable<Long> min) {
    this.min = min;
  }

  public CampaignServiceBudgetAmountRange max(Long max) {
    this.max = JsonNullable.of(max);
    return this;
  }

  /**
   * <div lang=\"ja\">検索対象範囲の最大値です。</div> <div lang=\"en\">This is the maximum value of the search range.</div> 
   * @return max
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索対象範囲の最大値です。</div> <div lang=\"en\">This is the maximum value of the search range.</div> ")


  public JsonNullable<Long> getMax() {
    return max;
  }

  public void setMax(JsonNullable<Long> max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceBudgetAmountRange campaignServiceBudgetAmountRange = (CampaignServiceBudgetAmountRange) o;
    return Objects.equals(this.min, campaignServiceBudgetAmountRange.min) &&
        Objects.equals(this.max, campaignServiceBudgetAmountRange.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceBudgetAmountRange {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

