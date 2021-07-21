package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceBiddingStrategyType;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceManualCpcBiddingScheme;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceTargetCpaBiddingScheme;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceTargetImpressionShareScheme;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceTargetRoasBiddingScheme;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceTargetSpendBiddingScheme;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; ADD時、標準入札設定の場合、このフィールドは必須となり、ポートフォリオ入札設定の場合、設定不可となります。また、biddingStrategyIdと同時に設定することはできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceBiddingScheme object displays the details of Auto Bidding setting.&lt;br&gt; This field is required when Standard bidding is setting, and cannot be specified when Portfolio bidding is setting in ADD operation. It cannot be specified at the same times as biddingStrategyId.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）<br> ADD時、標準入札設定の場合、このフィールドは必須となり、ポートフォリオ入札設定の場合、設定不可となります。また、biddingStrategyIdと同時に設定することはできません。</div> <div lang=\"en\">CampaignServiceBiddingScheme object displays the details of Auto Bidding setting.<br> This field is required when Standard bidding is setting, and cannot be specified when Portfolio bidding is setting in ADD operation. It cannot be specified at the same times as biddingStrategyId.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceBiddingScheme   {
  @JsonProperty("biddingStrategyType")
  private CampaignServiceBiddingStrategyType biddingStrategyType = null;

  @JsonProperty("manualCpcBiddingScheme")
  private CampaignServiceManualCpcBiddingScheme manualCpcBiddingScheme = null;

  @JsonProperty("targetCpaBiddingScheme")
  private CampaignServiceTargetCpaBiddingScheme targetCpaBiddingScheme = null;

  @JsonProperty("targetRoasBiddingScheme")
  private CampaignServiceTargetRoasBiddingScheme targetRoasBiddingScheme = null;

  @JsonProperty("targetSpendBiddingScheme")
  private CampaignServiceTargetSpendBiddingScheme targetSpendBiddingScheme = null;

  @JsonProperty("targetImpressionShareScheme")
  private CampaignServiceTargetImpressionShareScheme targetImpressionShareScheme = null;

  public CampaignServiceBiddingScheme biddingStrategyType(CampaignServiceBiddingStrategyType biddingStrategyType) {
    this.biddingStrategyType = biddingStrategyType;
    return this;
  }

  /**
   * Get biddingStrategyType
   * @return biddingStrategyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceBiddingStrategyType getBiddingStrategyType() {
    return biddingStrategyType;
  }

  public void setBiddingStrategyType(CampaignServiceBiddingStrategyType biddingStrategyType) {
    this.biddingStrategyType = biddingStrategyType;
  }

  public CampaignServiceBiddingScheme manualCpcBiddingScheme(CampaignServiceManualCpcBiddingScheme manualCpcBiddingScheme) {
    this.manualCpcBiddingScheme = manualCpcBiddingScheme;
    return this;
  }

  /**
   * Get manualCpcBiddingScheme
   * @return manualCpcBiddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceManualCpcBiddingScheme getManualCpcBiddingScheme() {
    return manualCpcBiddingScheme;
  }

  public void setManualCpcBiddingScheme(CampaignServiceManualCpcBiddingScheme manualCpcBiddingScheme) {
    this.manualCpcBiddingScheme = manualCpcBiddingScheme;
  }

  public CampaignServiceBiddingScheme targetCpaBiddingScheme(CampaignServiceTargetCpaBiddingScheme targetCpaBiddingScheme) {
    this.targetCpaBiddingScheme = targetCpaBiddingScheme;
    return this;
  }

  /**
   * Get targetCpaBiddingScheme
   * @return targetCpaBiddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceTargetCpaBiddingScheme getTargetCpaBiddingScheme() {
    return targetCpaBiddingScheme;
  }

  public void setTargetCpaBiddingScheme(CampaignServiceTargetCpaBiddingScheme targetCpaBiddingScheme) {
    this.targetCpaBiddingScheme = targetCpaBiddingScheme;
  }

  public CampaignServiceBiddingScheme targetRoasBiddingScheme(CampaignServiceTargetRoasBiddingScheme targetRoasBiddingScheme) {
    this.targetRoasBiddingScheme = targetRoasBiddingScheme;
    return this;
  }

  /**
   * Get targetRoasBiddingScheme
   * @return targetRoasBiddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceTargetRoasBiddingScheme getTargetRoasBiddingScheme() {
    return targetRoasBiddingScheme;
  }

  public void setTargetRoasBiddingScheme(CampaignServiceTargetRoasBiddingScheme targetRoasBiddingScheme) {
    this.targetRoasBiddingScheme = targetRoasBiddingScheme;
  }

  public CampaignServiceBiddingScheme targetSpendBiddingScheme(CampaignServiceTargetSpendBiddingScheme targetSpendBiddingScheme) {
    this.targetSpendBiddingScheme = targetSpendBiddingScheme;
    return this;
  }

  /**
   * Get targetSpendBiddingScheme
   * @return targetSpendBiddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceTargetSpendBiddingScheme getTargetSpendBiddingScheme() {
    return targetSpendBiddingScheme;
  }

  public void setTargetSpendBiddingScheme(CampaignServiceTargetSpendBiddingScheme targetSpendBiddingScheme) {
    this.targetSpendBiddingScheme = targetSpendBiddingScheme;
  }

  public CampaignServiceBiddingScheme targetImpressionShareScheme(CampaignServiceTargetImpressionShareScheme targetImpressionShareScheme) {
    this.targetImpressionShareScheme = targetImpressionShareScheme;
    return this;
  }

  /**
   * Get targetImpressionShareScheme
   * @return targetImpressionShareScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceTargetImpressionShareScheme getTargetImpressionShareScheme() {
    return targetImpressionShareScheme;
  }

  public void setTargetImpressionShareScheme(CampaignServiceTargetImpressionShareScheme targetImpressionShareScheme) {
    this.targetImpressionShareScheme = targetImpressionShareScheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceBiddingScheme campaignServiceBiddingScheme = (CampaignServiceBiddingScheme) o;
    return Objects.equals(this.biddingStrategyType, campaignServiceBiddingScheme.biddingStrategyType) &&
        Objects.equals(this.manualCpcBiddingScheme, campaignServiceBiddingScheme.manualCpcBiddingScheme) &&
        Objects.equals(this.targetCpaBiddingScheme, campaignServiceBiddingScheme.targetCpaBiddingScheme) &&
        Objects.equals(this.targetRoasBiddingScheme, campaignServiceBiddingScheme.targetRoasBiddingScheme) &&
        Objects.equals(this.targetSpendBiddingScheme, campaignServiceBiddingScheme.targetSpendBiddingScheme) &&
        Objects.equals(this.targetImpressionShareScheme, campaignServiceBiddingScheme.targetImpressionShareScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biddingStrategyType, manualCpcBiddingScheme, targetCpaBiddingScheme, targetRoasBiddingScheme, targetSpendBiddingScheme, targetImpressionShareScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceBiddingScheme {\n");
    
    sb.append("    biddingStrategyType: ").append(toIndentedString(biddingStrategyType)).append("\n");
    sb.append("    manualCpcBiddingScheme: ").append(toIndentedString(manualCpcBiddingScheme)).append("\n");
    sb.append("    targetCpaBiddingScheme: ").append(toIndentedString(targetCpaBiddingScheme)).append("\n");
    sb.append("    targetRoasBiddingScheme: ").append(toIndentedString(targetRoasBiddingScheme)).append("\n");
    sb.append("    targetSpendBiddingScheme: ").append(toIndentedString(targetSpendBiddingScheme)).append("\n");
    sb.append("    targetImpressionShareScheme: ").append(toIndentedString(targetImpressionShareScheme)).append("\n");
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

