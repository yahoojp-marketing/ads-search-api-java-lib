package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceMaximizeConversionsBiddingSchemeオブジェクトは、コンバージョン単価の目標値の自動入札設定情報を表します。&lt;br&gt; ADD時、BiddingStrategyTypeがMAXIMIZE_CONVERSIONSの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceMaximizeConversionsBiddingScheme object displays Auto Bidding setting for Target CPA.&lt;br&gt; This field is required when BiddingStrategyType is &#39;MAXIMIZE_CONVERSIONS&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceMaximizeConversionsBiddingSchemeオブジェクトは、コンバージョン単価の目標値の自動入札設定情報を表します。<br> ADD時、BiddingStrategyTypeがMAXIMIZE_CONVERSIONSの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceMaximizeConversionsBiddingScheme object displays Auto Bidding setting for Target CPA.<br> This field is required when BiddingStrategyType is 'MAXIMIZE_CONVERSIONS' in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceMaximizeConversionsBiddingScheme   {
  @JsonProperty("targetCpa")
  private Long targetCpa = null;

  public CampaignServiceMaximizeConversionsBiddingScheme targetCpa(Long targetCpa) {
    this.targetCpa = targetCpa;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン単価の目標値です。<br> ※制限値：1 ～ 800000<br> ※日本円のみの設定です。</div> <div lang=\"en\">Target CPA (JPY).<br> * Range limit: 1 - 800000</div> 
   * @return targetCpa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン単価の目標値です。<br> ※制限値：1 ～ 800000<br> ※日本円のみの設定です。</div> <div lang=\"en\">Target CPA (JPY).<br> * Range limit: 1 - 800000</div> ")


  public Long getTargetCpa() {
    return targetCpa;
  }

  public void setTargetCpa(Long targetCpa) {
    this.targetCpa = targetCpa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceMaximizeConversionsBiddingScheme campaignServiceMaximizeConversionsBiddingScheme = (CampaignServiceMaximizeConversionsBiddingScheme) o;
    return Objects.equals(this.targetCpa, campaignServiceMaximizeConversionsBiddingScheme.targetCpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetCpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceMaximizeConversionsBiddingScheme {\n");
    
    sb.append("    targetCpa: ").append(toIndentedString(targetCpa)).append("\n");
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

