package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.CampaignServiceTargetImpressionShareLocation;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceTargetImpressionShareSchemeオブジェクトは、インプレッションシェアの目標値の自動入札設定情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; ADD時、BiddingStrategyTypeがTARGET_IMPRESSION_SHAREの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceTargetImpressionShareScheme object describes automatic bid setting information of the impression share target value. (Object for anything other than BiddingStrategyService.)&lt;br&gt; If BiddingStrategyType is TARGET_IMPRESSION_SHARE, this field is required in ADD operation, and it is optional when BiddingStrategyType is the others.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceTargetImpressionShareSchemeオブジェクトは、インプレッションシェアの目標値の自動入札設定情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）<br> ADD時、BiddingStrategyTypeがTARGET_IMPRESSION_SHAREの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceTargetImpressionShareScheme object describes automatic bid setting information of the impression share target value. (Object for anything other than BiddingStrategyService.)<br> If BiddingStrategyType is TARGET_IMPRESSION_SHARE, this field is required in ADD operation, and it is optional when BiddingStrategyType is the others.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceTargetImpressionShareScheme   {
  @JsonProperty("location")
  private CampaignServiceTargetImpressionShareLocation location = null;

  @JsonProperty("bidCeiling")
  private Long bidCeiling = null;

  @JsonProperty("targetImpressionShare")
  private Long targetImpressionShare = null;

  public CampaignServiceTargetImpressionShareScheme location(CampaignServiceTargetImpressionShareLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceTargetImpressionShareLocation getLocation() {
    return location;
  }

  public void setLocation(CampaignServiceTargetImpressionShareLocation location) {
    this.location = location;
  }

  public CampaignServiceTargetImpressionShareScheme bidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の上限です。<br> このフィールドは省略可能となります。その際、デフォルト設定値は0となります。<br> ※「0」が設定された場合、上限設定はありません。</div> <div lang=\"en\">Limit of bid (CPC).<br> This field is optional. The default value will be 0.<br> * No limits if &#34;0&#34; is set.</div> 
   * @return bidCeiling
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の上限です。<br> このフィールドは省略可能となります。その際、デフォルト設定値は0となります。<br> ※「0」が設定された場合、上限設定はありません。</div> <div lang=\"en\">Limit of bid (CPC).<br> This field is optional. The default value will be 0.<br> * No limits if &#34;0&#34; is set.</div> ")


  public Long getBidCeiling() {
    return bidCeiling;
  }

  public void setBidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
  }

  public CampaignServiceTargetImpressionShareScheme targetImpressionShare(Long targetImpressionShare) {
    this.targetImpressionShare = targetImpressionShare;
    return this;
  }

  /**
   * <div lang=\"ja\">目標のインプレッションシェアです。<br> ADD時およびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Target impression share.<br> This field is required in ADD and SET operation.</div> 
   * @return targetImpressionShare
  */
  @ApiModelProperty(value = "<div lang=\"ja\">目標のインプレッションシェアです。<br> ADD時およびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Target impression share.<br> This field is required in ADD and SET operation.</div> ")


  public Long getTargetImpressionShare() {
    return targetImpressionShare;
  }

  public void setTargetImpressionShare(Long targetImpressionShare) {
    this.targetImpressionShare = targetImpressionShare;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceTargetImpressionShareScheme campaignServiceTargetImpressionShareScheme = (CampaignServiceTargetImpressionShareScheme) o;
    return Objects.equals(this.location, campaignServiceTargetImpressionShareScheme.location) &&
        Objects.equals(this.bidCeiling, campaignServiceTargetImpressionShareScheme.bidCeiling) &&
        Objects.equals(this.targetImpressionShare, campaignServiceTargetImpressionShareScheme.targetImpressionShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, bidCeiling, targetImpressionShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceTargetImpressionShareScheme {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
    sb.append("    targetImpressionShare: ").append(toIndentedString(targetImpressionShare)).append("\n");
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

