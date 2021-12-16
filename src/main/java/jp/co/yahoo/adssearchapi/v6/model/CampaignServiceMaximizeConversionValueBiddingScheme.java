package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceMaximizeConversionValueBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。&lt;br&gt; ADD時、BiddingStrategyTypeがMAXIMIZE_CONVERSION_VALUEの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceMaximizeConversionValueBiddingScheme object displays Auto Bidding setting for Target ROAS.&lt;br&gt; This field is required when BiddingStrategyType is &#39;MAXIMIZE_CONVERSION_VALUE&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceMaximizeConversionValueBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。<br> ADD時、BiddingStrategyTypeがMAXIMIZE_CONVERSION_VALUEの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceMaximizeConversionValueBiddingScheme object displays Auto Bidding setting for Target ROAS.<br> This field is required when BiddingStrategyType is 'MAXIMIZE_CONVERSION_VALUE' in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceMaximizeConversionValueBiddingScheme   {
  @JsonProperty("targetRoas")
  private Double targetRoas = null;

  public CampaignServiceMaximizeConversionValueBiddingScheme targetRoas(Double targetRoas) {
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
    CampaignServiceMaximizeConversionValueBiddingScheme campaignServiceMaximizeConversionValueBiddingScheme = (CampaignServiceMaximizeConversionValueBiddingScheme) o;
    return Objects.equals(this.targetRoas, campaignServiceMaximizeConversionValueBiddingScheme.targetRoas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetRoas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceMaximizeConversionValueBiddingScheme {\n");
    
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

