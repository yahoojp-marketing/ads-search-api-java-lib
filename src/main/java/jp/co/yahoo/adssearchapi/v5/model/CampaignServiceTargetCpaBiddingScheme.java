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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceTargetCpaBiddingSchemeオブジェクトは、コンバージョン単価の目標値の自動入札設定情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; ADD時、BiddingStrategyTypeがTARGET_CPAの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceTargetCpaBiddingScheme object displays Auto Bidding setting for Target CPA.&lt;br&gt; This field is required when BiddingStrategyType is &#39;TARGET_CPA&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceTargetCpaBiddingSchemeオブジェクトは、コンバージョン単価の目標値の自動入札設定情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）<br> ADD時、BiddingStrategyTypeがTARGET_CPAの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceTargetCpaBiddingScheme object displays Auto Bidding setting for Target CPA.<br> This field is required when BiddingStrategyType is 'TARGET_CPA' in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.</div> ")

public class CampaignServiceTargetCpaBiddingScheme   {
  @JsonProperty("bidCeiling")
  private JsonNullable<Long> bidCeiling = JsonNullable.undefined();

  @JsonProperty("bidFloor")
  private JsonNullable<Long> bidFloor = JsonNullable.undefined();

  @JsonProperty("targetCpa")
  private JsonNullable<Long> targetCpa = JsonNullable.undefined();

  public CampaignServiceTargetCpaBiddingScheme bidCeiling(Long bidCeiling) {
    this.bidCeiling = JsonNullable.of(bidCeiling);
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の上限です。<br> このフィールドは省略可能となります。その際、デフォルト設定値は0となります。<br> ※「0」が設定された場合、上限設定はありません。</div> <div lang=\"en\">Limit of bid (CPC).<br> This field is optional. The default value will be 0.<br> * No limits if &#34;0&#34; is set.</div> 
   * @return bidCeiling
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の上限です。<br> このフィールドは省略可能となります。その際、デフォルト設定値は0となります。<br> ※「0」が設定された場合、上限設定はありません。</div> <div lang=\"en\">Limit of bid (CPC).<br> This field is optional. The default value will be 0.<br> * No limits if &#34;0&#34; is set.</div> ")


  public JsonNullable<Long> getBidCeiling() {
    return bidCeiling;
  }

  public void setBidCeiling(JsonNullable<Long> bidCeiling) {
    this.bidCeiling = bidCeiling;
  }

  public CampaignServiceTargetCpaBiddingScheme bidFloor(Long bidFloor) {
    this.bidFloor = JsonNullable.of(bidFloor);
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の下限です。<br> このフィールドは省略可能となります。その際、デフォルト設定値は0となります。<br> ※ 設定を解除する場合は「0」を指定します。</div> <div lang=\"en\">Minimum CPC.<br>This field is optional. The default value will be 0.<br> * Set &#34;0&#34; to deactivate.</div> 
   * @return bidFloor
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の下限です。<br> このフィールドは省略可能となります。その際、デフォルト設定値は0となります。<br> ※ 設定を解除する場合は「0」を指定します。</div> <div lang=\"en\">Minimum CPC.<br>This field is optional. The default value will be 0.<br> * Set &#34;0&#34; to deactivate.</div> ")


  public JsonNullable<Long> getBidFloor() {
    return bidFloor;
  }

  public void setBidFloor(JsonNullable<Long> bidFloor) {
    this.bidFloor = bidFloor;
  }

  public CampaignServiceTargetCpaBiddingScheme targetCpa(Long targetCpa) {
    this.targetCpa = JsonNullable.of(targetCpa);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン単価の目標値です。<br> ADD時およびSET時、このフィールドは必須となります。<br> ※制限値：0 ～ 99999999<br>※日本円のみの設定です。</div> <div lang=\"en\">Target CPA (JPY).<br> This field is required in ADD and SET operation.<br> * Range limit: 0 - 99999999</div> 
   * @return targetCpa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン単価の目標値です。<br> ADD時およびSET時、このフィールドは必須となります。<br> ※制限値：0 ～ 99999999<br>※日本円のみの設定です。</div> <div lang=\"en\">Target CPA (JPY).<br> This field is required in ADD and SET operation.<br> * Range limit: 0 - 99999999</div> ")


  public JsonNullable<Long> getTargetCpa() {
    return targetCpa;
  }

  public void setTargetCpa(JsonNullable<Long> targetCpa) {
    this.targetCpa = targetCpa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceTargetCpaBiddingScheme campaignServiceTargetCpaBiddingScheme = (CampaignServiceTargetCpaBiddingScheme) o;
    return Objects.equals(this.bidCeiling, campaignServiceTargetCpaBiddingScheme.bidCeiling) &&
        Objects.equals(this.bidFloor, campaignServiceTargetCpaBiddingScheme.bidFloor) &&
        Objects.equals(this.targetCpa, campaignServiceTargetCpaBiddingScheme.targetCpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCeiling, bidFloor, targetCpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceTargetCpaBiddingScheme {\n");
    
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
    sb.append("    bidFloor: ").append(toIndentedString(bidFloor)).append("\n");
    sb.append("    targetCpa: ").append(toIndentedString(targetCpa)).append("\n");
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

