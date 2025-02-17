/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v16.model.CampaignServiceBiddingStrategyType;
import jp.co.yahoo.adssearchapi.v16.model.CampaignServiceCpcBiddingScheme;
import jp.co.yahoo.adssearchapi.v16.model.CampaignServiceMaximizeClicksBiddingScheme;
import jp.co.yahoo.adssearchapi.v16.model.CampaignServiceMaximizeConversionValueBiddingScheme;
import jp.co.yahoo.adssearchapi.v16.model.CampaignServiceMaximizeConversionsBiddingScheme;
import jp.co.yahoo.adssearchapi.v16.model.CampaignServiceTargetCpaBiddingScheme;
import jp.co.yahoo.adssearchapi.v16.model.CampaignServiceTargetImpressionShareScheme;
import jp.co.yahoo.adssearchapi.v16.model.CampaignServiceTargetRoasBiddingScheme;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; ADD時、標準入札設定の場合、このフィールドは必須となり、ポートフォリオ入札設定の場合、設定不可となります。また、portfolioBiddingIdと同時に設定することはできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceBiddingScheme object displays the details of auto bidding setting.&lt;br&gt; This field is required when Standard bidding is setting, and cannot be specified when Portfolio bidding is setting in ADD operation. It cannot be specified at the same times as portfolioBiddingId.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）<br> ADD時、標準入札設定の場合、このフィールドは必須となり、ポートフォリオ入札設定の場合、設定不可となります。また、portfolioBiddingIdと同時に設定することはできません。</div> <div lang=\"en\">CampaignServiceBiddingScheme object displays the details of auto bidding setting.<br> This field is required when Standard bidding is setting, and cannot be specified when Portfolio bidding is setting in ADD operation. It cannot be specified at the same times as portfolioBiddingId.</div> ")
@JsonPropertyOrder({
  CampaignServiceBiddingScheme.JSON_PROPERTY_BIDDING_STRATEGY_TYPE,
  CampaignServiceBiddingScheme.JSON_PROPERTY_CPC_BIDDING_SCHEME,
  CampaignServiceBiddingScheme.JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME,
  CampaignServiceBiddingScheme.JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME,
  CampaignServiceBiddingScheme.JSON_PROPERTY_MAXIMIZE_CLICKS_BIDDING_SCHEME,
  CampaignServiceBiddingScheme.JSON_PROPERTY_TARGET_IMPRESSION_SHARE_SCHEME,
  CampaignServiceBiddingScheme.JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME,
  CampaignServiceBiddingScheme.JSON_PROPERTY_MAXIMIZE_CONVERSION_VALUE_BIDDING_SCHEME
})
@JsonTypeName("CampaignServiceBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceBiddingScheme {
  public static final String JSON_PROPERTY_BIDDING_STRATEGY_TYPE = "biddingStrategyType";
  private CampaignServiceBiddingStrategyType biddingStrategyType;

  public static final String JSON_PROPERTY_CPC_BIDDING_SCHEME = "cpcBiddingScheme";
  private CampaignServiceCpcBiddingScheme cpcBiddingScheme;

  public static final String JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME = "targetCpaBiddingScheme";
  private CampaignServiceTargetCpaBiddingScheme targetCpaBiddingScheme;

  public static final String JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME = "targetRoasBiddingScheme";
  private CampaignServiceTargetRoasBiddingScheme targetRoasBiddingScheme;

  public static final String JSON_PROPERTY_MAXIMIZE_CLICKS_BIDDING_SCHEME = "maximizeClicksBiddingScheme";
  private CampaignServiceMaximizeClicksBiddingScheme maximizeClicksBiddingScheme;

  public static final String JSON_PROPERTY_TARGET_IMPRESSION_SHARE_SCHEME = "targetImpressionShareScheme";
  private CampaignServiceTargetImpressionShareScheme targetImpressionShareScheme;

  public static final String JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME = "maximizeConversionsBiddingScheme";
  private CampaignServiceMaximizeConversionsBiddingScheme maximizeConversionsBiddingScheme;

  public static final String JSON_PROPERTY_MAXIMIZE_CONVERSION_VALUE_BIDDING_SCHEME = "maximizeConversionValueBiddingScheme";
  private CampaignServiceMaximizeConversionValueBiddingScheme maximizeConversionValueBiddingScheme;

  public CampaignServiceBiddingScheme() { 
  }

  public CampaignServiceBiddingScheme biddingStrategyType(CampaignServiceBiddingStrategyType biddingStrategyType) {
    
    this.biddingStrategyType = biddingStrategyType;
    return this;
  }

   /**
   * Get biddingStrategyType
   * @return biddingStrategyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceBiddingStrategyType getBiddingStrategyType() {
    return biddingStrategyType;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingStrategyType(CampaignServiceBiddingStrategyType biddingStrategyType) {
    this.biddingStrategyType = biddingStrategyType;
  }


  public CampaignServiceBiddingScheme cpcBiddingScheme(CampaignServiceCpcBiddingScheme cpcBiddingScheme) {
    
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

  public CampaignServiceCpcBiddingScheme getCpcBiddingScheme() {
    return cpcBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_CPC_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpcBiddingScheme(CampaignServiceCpcBiddingScheme cpcBiddingScheme) {
    this.cpcBiddingScheme = cpcBiddingScheme;
  }


  public CampaignServiceBiddingScheme targetCpaBiddingScheme(CampaignServiceTargetCpaBiddingScheme targetCpaBiddingScheme) {
    
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

  public CampaignServiceTargetCpaBiddingScheme getTargetCpaBiddingScheme() {
    return targetCpaBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceTargetRoasBiddingScheme getTargetRoasBiddingScheme() {
    return targetRoasBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetRoasBiddingScheme(CampaignServiceTargetRoasBiddingScheme targetRoasBiddingScheme) {
    this.targetRoasBiddingScheme = targetRoasBiddingScheme;
  }


  public CampaignServiceBiddingScheme maximizeClicksBiddingScheme(CampaignServiceMaximizeClicksBiddingScheme maximizeClicksBiddingScheme) {
    
    this.maximizeClicksBiddingScheme = maximizeClicksBiddingScheme;
    return this;
  }

   /**
   * Get maximizeClicksBiddingScheme
   * @return maximizeClicksBiddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CLICKS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceMaximizeClicksBiddingScheme getMaximizeClicksBiddingScheme() {
    return maximizeClicksBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CLICKS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeClicksBiddingScheme(CampaignServiceMaximizeClicksBiddingScheme maximizeClicksBiddingScheme) {
    this.maximizeClicksBiddingScheme = maximizeClicksBiddingScheme;
  }


  public CampaignServiceBiddingScheme targetImpressionShareScheme(CampaignServiceTargetImpressionShareScheme targetImpressionShareScheme) {
    
    this.targetImpressionShareScheme = targetImpressionShareScheme;
    return this;
  }

   /**
   * Get targetImpressionShareScheme
   * @return targetImpressionShareScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_IMPRESSION_SHARE_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceTargetImpressionShareScheme getTargetImpressionShareScheme() {
    return targetImpressionShareScheme;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_IMPRESSION_SHARE_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetImpressionShareScheme(CampaignServiceTargetImpressionShareScheme targetImpressionShareScheme) {
    this.targetImpressionShareScheme = targetImpressionShareScheme;
  }


  public CampaignServiceBiddingScheme maximizeConversionsBiddingScheme(CampaignServiceMaximizeConversionsBiddingScheme maximizeConversionsBiddingScheme) {
    
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

  public CampaignServiceMaximizeConversionsBiddingScheme getMaximizeConversionsBiddingScheme() {
    return maximizeConversionsBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSIONS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeConversionsBiddingScheme(CampaignServiceMaximizeConversionsBiddingScheme maximizeConversionsBiddingScheme) {
    this.maximizeConversionsBiddingScheme = maximizeConversionsBiddingScheme;
  }


  public CampaignServiceBiddingScheme maximizeConversionValueBiddingScheme(CampaignServiceMaximizeConversionValueBiddingScheme maximizeConversionValueBiddingScheme) {
    
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

  public CampaignServiceMaximizeConversionValueBiddingScheme getMaximizeConversionValueBiddingScheme() {
    return maximizeConversionValueBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CONVERSION_VALUE_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeConversionValueBiddingScheme(CampaignServiceMaximizeConversionValueBiddingScheme maximizeConversionValueBiddingScheme) {
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
    CampaignServiceBiddingScheme campaignServiceBiddingScheme = (CampaignServiceBiddingScheme) o;
    return Objects.equals(this.biddingStrategyType, campaignServiceBiddingScheme.biddingStrategyType) &&
        Objects.equals(this.cpcBiddingScheme, campaignServiceBiddingScheme.cpcBiddingScheme) &&
        Objects.equals(this.targetCpaBiddingScheme, campaignServiceBiddingScheme.targetCpaBiddingScheme) &&
        Objects.equals(this.targetRoasBiddingScheme, campaignServiceBiddingScheme.targetRoasBiddingScheme) &&
        Objects.equals(this.maximizeClicksBiddingScheme, campaignServiceBiddingScheme.maximizeClicksBiddingScheme) &&
        Objects.equals(this.targetImpressionShareScheme, campaignServiceBiddingScheme.targetImpressionShareScheme) &&
        Objects.equals(this.maximizeConversionsBiddingScheme, campaignServiceBiddingScheme.maximizeConversionsBiddingScheme) &&
        Objects.equals(this.maximizeConversionValueBiddingScheme, campaignServiceBiddingScheme.maximizeConversionValueBiddingScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biddingStrategyType, cpcBiddingScheme, targetCpaBiddingScheme, targetRoasBiddingScheme, maximizeClicksBiddingScheme, targetImpressionShareScheme, maximizeConversionsBiddingScheme, maximizeConversionValueBiddingScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceBiddingScheme {\n");
    sb.append("    biddingStrategyType: ").append(toIndentedString(biddingStrategyType)).append("\n");
    sb.append("    cpcBiddingScheme: ").append(toIndentedString(cpcBiddingScheme)).append("\n");
    sb.append("    targetCpaBiddingScheme: ").append(toIndentedString(targetCpaBiddingScheme)).append("\n");
    sb.append("    targetRoasBiddingScheme: ").append(toIndentedString(targetRoasBiddingScheme)).append("\n");
    sb.append("    maximizeClicksBiddingScheme: ").append(toIndentedString(maximizeClicksBiddingScheme)).append("\n");
    sb.append("    targetImpressionShareScheme: ").append(toIndentedString(targetImpressionShareScheme)).append("\n");
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

