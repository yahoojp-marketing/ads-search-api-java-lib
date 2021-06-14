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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceTargetSpendBiddingSchemeオブジェクトは、クリック数の最大化の自動入札設定情報を表します。（BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; ADD時、BiddingStrategyTypeがTARGET_SPENDの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceTargetSpendBiddingScheme object describes auto bidding setting for Maximize Clicks. *This is an object for anything other than BiddingStrategyService.&lt;br&gt; This field is required when BiddingStrategyType is &#39;TARGET_SPEND&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceTargetSpendBiddingSchemeオブジェクトは、クリック数の最大化の自動入札設定情報を表します。（BiddingStrategyService以外用のオブジェクトです。）<br> ADD時、BiddingStrategyTypeがTARGET_SPENDの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceTargetSpendBiddingScheme object describes auto bidding setting for Maximize Clicks. *This is an object for anything other than BiddingStrategyService.<br> This field is required when BiddingStrategyType is 'TARGET_SPEND' in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.</div> ")

public class CampaignServiceTargetSpendBiddingScheme   {
  @JsonProperty("bidCeiling")
  private JsonNullable<Long> bidCeiling = JsonNullable.undefined();

  public CampaignServiceTargetSpendBiddingScheme bidCeiling(Long bidCeiling) {
    this.bidCeiling = JsonNullable.of(bidCeiling);
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の上限です。<br>※「0」が設定された 場合、上限設定は ありません。<br> このフィールドは省略可能となります。その際、デフォルト設定値は0となります。</div> <div lang=\"en\">Bid amount limit.<br>* If &#34;0&#34; is set, no bid limit.<br> This field is optional. The default value will be 0.</div> 
   * @return bidCeiling
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の上限です。<br>※「0」が設定された 場合、上限設定は ありません。<br> このフィールドは省略可能となります。その際、デフォルト設定値は0となります。</div> <div lang=\"en\">Bid amount limit.<br>* If &#34;0&#34; is set, no bid limit.<br> This field is optional. The default value will be 0.</div> ")


  public JsonNullable<Long> getBidCeiling() {
    return bidCeiling;
  }

  public void setBidCeiling(JsonNullable<Long> bidCeiling) {
    this.bidCeiling = bidCeiling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceTargetSpendBiddingScheme campaignServiceTargetSpendBiddingScheme = (CampaignServiceTargetSpendBiddingScheme) o;
    return Objects.equals(this.bidCeiling, campaignServiceTargetSpendBiddingScheme.bidCeiling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCeiling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceTargetSpendBiddingScheme {\n");
    
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
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

