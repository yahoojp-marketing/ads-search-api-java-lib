/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v10.model.CampaignServiceIsRemove;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceMaximizeConversionValueBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。&lt;br&gt; ADD時、BiddingStrategyTypeがMAXIMIZE_CONVERSION_VALUEの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceMaximizeConversionValueBiddingScheme object displays Auto Bidding setting for Target ROAS.&lt;br&gt; This field is required when BiddingStrategyType is &#39;MAXIMIZE_CONVERSION_VALUE&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceMaximizeConversionValueBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。<br> ADD時、BiddingStrategyTypeがMAXIMIZE_CONVERSION_VALUEの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceMaximizeConversionValueBiddingScheme object displays Auto Bidding setting for Target ROAS.<br> This field is required when BiddingStrategyType is 'MAXIMIZE_CONVERSION_VALUE' in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.</div> ")
@JsonPropertyOrder({
  CampaignServiceMaximizeConversionValueBiddingScheme.JSON_PROPERTY_TARGET_ROAS,
  CampaignServiceMaximizeConversionValueBiddingScheme.JSON_PROPERTY_IS_REMOVE_TARGET_ROAS
})
@JsonTypeName("CampaignServiceMaximizeConversionValueBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceMaximizeConversionValueBiddingScheme {
  public static final String JSON_PROPERTY_TARGET_ROAS = "targetRoas";
  private Double targetRoas;

  public static final String JSON_PROPERTY_IS_REMOVE_TARGET_ROAS = "isRemoveTargetRoas";
  private CampaignServiceIsRemove isRemoveTargetRoas;

  public CampaignServiceMaximizeConversionValueBiddingScheme() { 
  }

  public CampaignServiceMaximizeConversionValueBiddingScheme targetRoas(Double targetRoas) {
    
    this.targetRoas = targetRoas;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告費用対効果の目標値です。&lt;br&gt; 0.01 ～ 1000.00（1% ～ 100000%）の範囲内のみ 許容します。&lt;br&gt; ※ROAS:Return On Advertising Spend&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target ROAS (Return On Advertising Spend)&lt;br&gt; * Limit range: 0.01 - 1000.00 (1% - 100000%)&lt;/div&gt; 
   * @return targetRoas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告費用対効果の目標値です。<br> 0.01 ～ 1000.00（1% ～ 100000%）の範囲内のみ 許容します。<br> ※ROAS:Return On Advertising Spend</div> <div lang=\"en\">Target ROAS (Return On Advertising Spend)<br> * Limit range: 0.01 - 1000.00 (1% - 100000%)</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_ROAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTargetRoas() {
    return targetRoas;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ROAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetRoas(Double targetRoas) {
    this.targetRoas = targetRoas;
  }


  public CampaignServiceMaximizeConversionValueBiddingScheme isRemoveTargetRoas(CampaignServiceIsRemove isRemoveTargetRoas) {
    
    this.isRemoveTargetRoas = isRemoveTargetRoas;
    return this;
  }

   /**
   * Get isRemoveTargetRoas
   * @return isRemoveTargetRoas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TARGET_ROAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceIsRemove getIsRemoveTargetRoas() {
    return isRemoveTargetRoas;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TARGET_ROAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTargetRoas(CampaignServiceIsRemove isRemoveTargetRoas) {
    this.isRemoveTargetRoas = isRemoveTargetRoas;
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
    return Objects.equals(this.targetRoas, campaignServiceMaximizeConversionValueBiddingScheme.targetRoas) &&
        Objects.equals(this.isRemoveTargetRoas, campaignServiceMaximizeConversionValueBiddingScheme.isRemoveTargetRoas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetRoas, isRemoveTargetRoas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceMaximizeConversionValueBiddingScheme {\n");
    sb.append("    targetRoas: ").append(toIndentedString(targetRoas)).append("\n");
    sb.append("    isRemoveTargetRoas: ").append(toIndentedString(isRemoveTargetRoas)).append("\n");
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
