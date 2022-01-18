package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceMaximizeClicksBiddingSchemeオブジェクトは、クリック数の最大化の自動入札設定情報を表します。（BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; ADD時、BiddingStrategyTypeがMAXIMIZE_CLICKSの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceMaximizeClicksBiddingScheme object describes auto bidding setting for Maximize Clicks. *This is an object for anything other than BiddingStrategyService.&lt;br&gt; This field is required when BiddingStrategyType is &#39;MAXIMIZE_CLICKS&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceMaximizeClicksBiddingSchemeオブジェクトは、クリック数の最大化の自動入札設定情報を表します。（BiddingStrategyService以外用のオブジェクトです。）<br> ADD時、BiddingStrategyTypeがMAXIMIZE_CLICKSの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceMaximizeClicksBiddingScheme object describes auto bidding setting for Maximize Clicks. *This is an object for anything other than BiddingStrategyService.<br> This field is required when BiddingStrategyType is 'MAXIMIZE_CLICKS' in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceMaximizeClicksBiddingScheme   {
  @JsonProperty("bidCeiling")
  private Long bidCeiling = null;

  public CampaignServiceMaximizeClicksBiddingScheme bidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の上限です。<br>※「0」が設定された 場合、上限設定は ありません。<br> このフィールドは省略可能となります。その際、デフォルト設定値は0となります。</div> <div lang=\"en\">Bid amount limit.<br>* If &#34;0&#34; is set, no bid limit.<br> This field is optional. The default value will be 0.</div> 
   * @return bidCeiling
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の上限です。<br>※「0」が設定された 場合、上限設定は ありません。<br> このフィールドは省略可能となります。その際、デフォルト設定値は0となります。</div> <div lang=\"en\">Bid amount limit.<br>* If &#34;0&#34; is set, no bid limit.<br> This field is optional. The default value will be 0.</div> ")


  public Long getBidCeiling() {
    return bidCeiling;
  }

  public void setBidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceMaximizeClicksBiddingScheme campaignServiceMaximizeClicksBiddingScheme = (CampaignServiceMaximizeClicksBiddingScheme) o;
    return Objects.equals(this.bidCeiling, campaignServiceMaximizeClicksBiddingScheme.bidCeiling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCeiling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceMaximizeClicksBiddingScheme {\n");
    
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
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

