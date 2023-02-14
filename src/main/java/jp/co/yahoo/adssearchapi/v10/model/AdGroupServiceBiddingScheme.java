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
import jp.co.yahoo.adssearchapi.v10.model.AdGroupServiceCampaignBiddingStrategyType;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupServiceCpcBiddingScheme;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupServiceMaximizeConversionValueBiddingScheme;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupServiceMaximizeConversionsBiddingScheme;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupServiceTargetCpaBiddingScheme;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupServiceTargetRoasBiddingScheme;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceBiddingScheme object displays the details of Auto Bidding setting.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">AdGroupServiceBiddingScheme object displays the details of Auto Bidding setting.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
@JsonPropertyOrder({
  AdGroupServiceBiddingScheme.JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE,
  AdGroupServiceBiddingScheme.JSON_PROPERTY_CPC_BIDDING_SCHEME,
  AdGroupServiceBiddingScheme.JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME,
  AdGroupServiceBiddingScheme.JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME,
  AdGroupServiceBiddingScheme.JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME,
  AdGroupServiceBiddingScheme.JSON_PROPERTY_MAXIMIZE_CONVERSION_VALUE_BIDDING_SCHEME
})
@JsonTypeName("AdGroupServiceBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceBiddingScheme {
  public static final String JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE = "campaignBiddingStrategyType";
  private AdGroupServiceCampaignBiddingStrategyType campaignBiddingStrategyType;

  public static final String JSON_PROPERTY_CPC_BIDDING_SCHEME = "cpcBiddingScheme";
  private AdGroupServiceCpcBiddingScheme cpcBiddingScheme;

  public static final String JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME = "targetCpaBiddingScheme";
  private AdGroupServiceTargetCpaBiddingScheme targetCpaBiddingScheme;

  public static final String JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME = "targetRoasBiddingScheme";
  private AdGroupServiceTargetRoasBiddingScheme targetRoasBiddingScheme;

  public static final String JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME = "maximizeConversionsBiddingScheme";
  private AdGroupServiceMaximizeConversionsBiddingScheme maximizeConversionsBiddingScheme;

  public static final String JSON_PROPERTY_MAXIMIZE_CONVERSION_VALUE_BIDDING_SCHEME = "maximizeConversionValueBiddingScheme";
  private AdGroupServiceMaximizeConversionValueBiddingScheme maximizeConversionValueBiddingScheme;

  public AdGroupServiceBiddingScheme() { 
  }

  public AdGroupServiceBiddingScheme campaignBiddingStrategyType(AdGroupServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
    return this;
  }

   /**
   * Get campaignBiddingStrategyType
   * @return campaignBiddingStrategyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceCampaignBiddingStrategyType getCampaignBiddingStrategyType() {
    return campaignBiddingStrategyType;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBiddingStrategyType(AdGroupServiceCampaignBiddingStrategyType campaignBiddingStrategyType) {
    this.campaignBiddingStrategyType = campaignBiddingStrategyType;
  }


  public AdGroupServiceBiddingScheme cpcBiddingScheme(AdGroupServiceCpcBiddingScheme cpcBiddingScheme) {
    
    this.cpcBiddingScheme = cpcBiddingScheme;
    return this;
  }

   /**
   * Get cpcBiddingScheme
   * @return cpcBiddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPC_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceCpcBiddingScheme getCpcBiddingScheme() {
    return cpcBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_CPC_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpcBiddingScheme(AdGroupServiceCpcBiddingScheme cpcBiddingScheme) {
    this.cpcBiddingScheme = cpcBiddingScheme;
  }


  public AdGroupServiceBiddingScheme targetCpaBiddingScheme(AdGroupServiceTargetCpaBiddingScheme targetCpaBiddingScheme) {
    
    this.targetCpaBiddingScheme = targetCpaBiddingScheme;
    return this;
  }

   /**
   * Get targetCpaBiddingScheme
   * @return targetCpaBiddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceTargetCpaBiddingScheme getTargetCpaBiddingScheme() {
    return targetCpaBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetCpaBiddingScheme(AdGroupServiceTargetCpaBiddingScheme targetCpaBiddingScheme) {
    this.targetCpaBiddingScheme = targetCpaBiddingScheme;
  }


  public AdGroupServiceBiddingScheme targetRoasBiddingScheme(AdGroupServiceTargetRoasBiddingScheme targetRoasBiddingScheme) {
    
    this.targetRoasBiddingScheme = targetRoasBiddingScheme;
    return this;
  }

   /**
   * Get targetRoasBiddingScheme
   * @return targetRoasBiddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceTargetRoasBiddingScheme getTargetRoasBiddingScheme() {
    return targetRoasBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetRoasBiddingScheme(AdGroupServiceTargetRoasBiddingScheme targetRoasBiddingScheme) {
    this.targetRoasBiddingScheme = targetRoasBiddingScheme;
  }


  public AdGroupServiceBiddingScheme maximizeConversionsBiddingScheme(AdGroupServiceMaximizeConversionsBiddingScheme maximizeConversionsBiddingScheme) {
    
    this.maximizeConversionsBiddingScheme = maximizeConversionsBiddingScheme;
    return this;
  }

   /**
   * Get maximizeConversionsBiddingScheme
   * @return maximizeConversionsBiddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceMaximizeConversionsBiddingScheme getMaximizeConversionsBiddingScheme() {
    return maximizeConversionsBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeConversionsBiddingScheme(AdGroupServiceMaximizeConversionsBiddingScheme maximizeConversionsBiddingScheme) {
    this.maximizeConversionsBiddingScheme = maximizeConversionsBiddingScheme;
  }


  public AdGroupServiceBiddingScheme maximizeConversionValueBiddingScheme(AdGroupServiceMaximizeConversionValueBiddingScheme maximizeConversionValueBiddingScheme) {
    
    this.maximizeConversionValueBiddingScheme = maximizeConversionValueBiddingScheme;
    return this;
  }

   /**
   * Get maximizeConversionValueBiddingScheme
   * @return maximizeConversionValueBiddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSION_VALUE_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceMaximizeConversionValueBiddingScheme getMaximizeConversionValueBiddingScheme() {
    return maximizeConversionValueBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSION_VALUE_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeConversionValueBiddingScheme(AdGroupServiceMaximizeConversionValueBiddingScheme maximizeConversionValueBiddingScheme) {
    this.maximizeConversionValueBiddingScheme = maximizeConversionValueBiddingScheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceBiddingScheme adGroupServiceBiddingScheme = (AdGroupServiceBiddingScheme) o;
    return Objects.equals(this.campaignBiddingStrategyType, adGroupServiceBiddingScheme.campaignBiddingStrategyType) &&
        Objects.equals(this.cpcBiddingScheme, adGroupServiceBiddingScheme.cpcBiddingScheme) &&
        Objects.equals(this.targetCpaBiddingScheme, adGroupServiceBiddingScheme.targetCpaBiddingScheme) &&
        Objects.equals(this.targetRoasBiddingScheme, adGroupServiceBiddingScheme.targetRoasBiddingScheme) &&
        Objects.equals(this.maximizeConversionsBiddingScheme, adGroupServiceBiddingScheme.maximizeConversionsBiddingScheme) &&
        Objects.equals(this.maximizeConversionValueBiddingScheme, adGroupServiceBiddingScheme.maximizeConversionValueBiddingScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBiddingStrategyType, cpcBiddingScheme, targetCpaBiddingScheme, targetRoasBiddingScheme, maximizeConversionsBiddingScheme, maximizeConversionValueBiddingScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceBiddingScheme {\n");
    sb.append("    campaignBiddingStrategyType: ").append(toIndentedString(campaignBiddingStrategyType)).append("\n");
    sb.append("    cpcBiddingScheme: ").append(toIndentedString(cpcBiddingScheme)).append("\n");
    sb.append("    targetCpaBiddingScheme: ").append(toIndentedString(targetCpaBiddingScheme)).append("\n");
    sb.append("    targetRoasBiddingScheme: ").append(toIndentedString(targetRoasBiddingScheme)).append("\n");
    sb.append("    maximizeConversionsBiddingScheme: ").append(toIndentedString(maximizeConversionsBiddingScheme)).append("\n");
    sb.append("    maximizeConversionValueBiddingScheme: ").append(toIndentedString(maximizeConversionValueBiddingScheme)).append("\n");
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

