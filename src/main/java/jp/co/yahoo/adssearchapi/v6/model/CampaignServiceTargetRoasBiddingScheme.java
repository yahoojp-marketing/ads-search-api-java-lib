package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceTargetRoasBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; ADD時、BiddingStrategyTypeがTARGET_ROASの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceTargetRoasBiddingScheme object displays Auto Bidding setting for Target ROAS. *This is an object for anything other than BiddingStrategyService.&lt;br&gt; This field is required when BiddingStrategyType is &#39;TARGET_ROAS&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceTargetRoasBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）<br> ADD時、BiddingStrategyTypeがTARGET_ROASの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceTargetRoasBiddingScheme object displays Auto Bidding setting for Target ROAS. *This is an object for anything other than BiddingStrategyService.<br> This field is required when BiddingStrategyType is 'TARGET_ROAS' in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceTargetRoasBiddingScheme   {
  @JsonProperty("bidCeiling")
  private Long bidCeiling = null;

  @JsonProperty("bidFloor")
  private Long bidFloor = null;

  @JsonProperty("targetRoas")
  private Double targetRoas = null;

  public CampaignServiceTargetRoasBiddingScheme bidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の上限です。<br>このフィールドの追加と編集は廃止され、現在設定できません。</div> <div lang=\"en\">Limit of bid (CPC).<br>Adding and editing this field is obsolete. Currently not available.</div> 
   * @return bidCeiling
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の上限です。<br>このフィールドの追加と編集は廃止され、現在設定できません。</div> <div lang=\"en\">Limit of bid (CPC).<br>Adding and editing this field is obsolete. Currently not available.</div> ")


  public Long getBidCeiling() {
    return bidCeiling;
  }

  public void setBidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
  }

  public CampaignServiceTargetRoasBiddingScheme bidFloor(Long bidFloor) {
    this.bidFloor = bidFloor;
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の下限です。<br>このフィールドの追加と編集は廃止され、現在設定できません。</div> <div lang=\"en\">Minimum CPC.<br>Adding and editing this field is obsolete. Currently not available.</div> 
   * @return bidFloor
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の下限です。<br>このフィールドの追加と編集は廃止され、現在設定できません。</div> <div lang=\"en\">Minimum CPC.<br>Adding and editing this field is obsolete. Currently not available.</div> ")


  public Long getBidFloor() {
    return bidFloor;
  }

  public void setBidFloor(Long bidFloor) {
    this.bidFloor = bidFloor;
  }

  public CampaignServiceTargetRoasBiddingScheme targetRoas(Double targetRoas) {
    this.targetRoas = targetRoas;
    return this;
  }

  /**
   * <div lang=\"ja\">広告費用対効果の目標値です。<br> 0.01 ～ 1000.00（1% ～ 100000%）の範囲内のみ 許容します。<br> ADD時およびSET時、このフィールドは必須となります。<br> ※ROAS:Return On Advertising Spend</div> <div lang=\"en\">Target ROAS (Return On Advertising Spend)<br> * Limit range: 0.01 - 1000.00 (1% - 100000%)<br> This field is required in ADD and SET operation.</div> 
   * @return targetRoas
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告費用対効果の目標値です。<br> 0.01 ～ 1000.00（1% ～ 100000%）の範囲内のみ 許容します。<br> ADD時およびSET時、このフィールドは必須となります。<br> ※ROAS:Return On Advertising Spend</div> <div lang=\"en\">Target ROAS (Return On Advertising Spend)<br> * Limit range: 0.01 - 1000.00 (1% - 100000%)<br> This field is required in ADD and SET operation.</div> ")


  public Double getTargetRoas() {
    return targetRoas;
  }

  public void setTargetRoas(Double targetRoas) {
    this.targetRoas = targetRoas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceTargetRoasBiddingScheme campaignServiceTargetRoasBiddingScheme = (CampaignServiceTargetRoasBiddingScheme) o;
    return Objects.equals(this.bidCeiling, campaignServiceTargetRoasBiddingScheme.bidCeiling) &&
        Objects.equals(this.bidFloor, campaignServiceTargetRoasBiddingScheme.bidFloor) &&
        Objects.equals(this.targetRoas, campaignServiceTargetRoasBiddingScheme.targetRoas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCeiling, bidFloor, targetRoas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceTargetRoasBiddingScheme {\n");
    
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
    sb.append("    bidFloor: ").append(toIndentedString(bidFloor)).append("\n");
    sb.append("    targetRoas: ").append(toIndentedString(targetRoas)).append("\n");
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

