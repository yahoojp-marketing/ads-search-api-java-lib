package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.CampaignServiceEnhancedCpcEnabled;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceManualCpcBiddingSchemeオブジェクトは、手動入札の設定情報を表します。&lt;br&gt; ADD時、BiddingStrategyTypeがMANUAL_CPCの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceManualCpcBiddingScheme object displays a setting of Manual Bid.&lt;br&gt; This field is required when BiddingStrategyType is &#39;MANUAL_CPC&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceManualCpcBiddingSchemeオブジェクトは、手動入札の設定情報を表します。<br> ADD時、BiddingStrategyTypeがMANUAL_CPCの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceManualCpcBiddingScheme object displays a setting of Manual Bid.<br> This field is required when BiddingStrategyType is 'MANUAL_CPC' in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceManualCpcBiddingScheme   {
  @JsonProperty("enhancedCpcEnabled")
  private CampaignServiceEnhancedCpcEnabled enhancedCpcEnabled = null;

  public CampaignServiceManualCpcBiddingScheme enhancedCpcEnabled(CampaignServiceEnhancedCpcEnabled enhancedCpcEnabled) {
    this.enhancedCpcEnabled = enhancedCpcEnabled;
    return this;
  }

  /**
   * Get enhancedCpcEnabled
   * @return enhancedCpcEnabled
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceEnhancedCpcEnabled getEnhancedCpcEnabled() {
    return enhancedCpcEnabled;
  }

  public void setEnhancedCpcEnabled(CampaignServiceEnhancedCpcEnabled enhancedCpcEnabled) {
    this.enhancedCpcEnabled = enhancedCpcEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceManualCpcBiddingScheme campaignServiceManualCpcBiddingScheme = (CampaignServiceManualCpcBiddingScheme) o;
    return Objects.equals(this.enhancedCpcEnabled, campaignServiceManualCpcBiddingScheme.enhancedCpcEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enhancedCpcEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceManualCpcBiddingScheme {\n");
    
    sb.append("    enhancedCpcEnabled: ").append(toIndentedString(enhancedCpcEnabled)).append("\n");
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

