/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v8.model.CampaignServiceEnhancedCpcEnabled;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceCpcBiddingSchemeオブジェクトは、手動入札の設定情報を表します。&lt;br&gt; ADD時、BiddingStrategyTypeがCPCの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceCpcBiddingScheme object displays a setting of Manual Bid.&lt;br&gt; This field is required when BiddingStrategyType is &#39;CPC&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceCpcBiddingSchemeオブジェクトは、手動入札の設定情報を表します。<br> ADD時、BiddingStrategyTypeがCPCの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceCpcBiddingScheme object displays a setting of Manual Bid.<br> This field is required when BiddingStrategyType is 'CPC' in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.</div> ")
@JsonPropertyOrder({
  CampaignServiceCpcBiddingScheme.JSON_PROPERTY_ENHANCED_CPC_ENABLED
})
@JsonTypeName("CampaignServiceCpcBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceCpcBiddingScheme {
  public static final String JSON_PROPERTY_ENHANCED_CPC_ENABLED = "enhancedCpcEnabled";
  private CampaignServiceEnhancedCpcEnabled enhancedCpcEnabled;

  public CampaignServiceCpcBiddingScheme() { 
  }

  public CampaignServiceCpcBiddingScheme enhancedCpcEnabled(CampaignServiceEnhancedCpcEnabled enhancedCpcEnabled) {
    
    this.enhancedCpcEnabled = enhancedCpcEnabled;
    return this;
  }

   /**
   * Get enhancedCpcEnabled
   * @return enhancedCpcEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENHANCED_CPC_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceEnhancedCpcEnabled getEnhancedCpcEnabled() {
    return enhancedCpcEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_CPC_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    CampaignServiceCpcBiddingScheme campaignServiceCpcBiddingScheme = (CampaignServiceCpcBiddingScheme) o;
    return Objects.equals(this.enhancedCpcEnabled, campaignServiceCpcBiddingScheme.enhancedCpcEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enhancedCpcEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceCpcBiddingScheme {\n");
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

