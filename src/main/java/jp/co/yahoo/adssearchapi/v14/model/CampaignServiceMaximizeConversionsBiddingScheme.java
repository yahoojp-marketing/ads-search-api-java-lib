/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v14.model.CampaignServiceIsRemove;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceMaximizeConversionsBiddingSchemeオブジェクトは、コンバージョン単価の目標値の自動入札設定情報を表します。&lt;br&gt; ADD時、BiddingStrategyTypeがMAXIMIZE_CONVERSIONSの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceMaximizeConversionsBiddingScheme object displays auto bidding setting for Target CPA.&lt;br&gt; This field is required when BiddingStrategyType is &#39;MAXIMIZE_CONVERSIONS&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceMaximizeConversionsBiddingScheme.JSON_PROPERTY_TARGET_CPA,
  CampaignServiceMaximizeConversionsBiddingScheme.JSON_PROPERTY_IS_REMOVE_TARGET_CPA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceMaximizeConversionsBiddingScheme {
  public static final String JSON_PROPERTY_TARGET_CPA = "targetCpa";
  private Long targetCpa;

  public static final String JSON_PROPERTY_IS_REMOVE_TARGET_CPA = "isRemoveTargetCpa";
  private CampaignServiceIsRemove isRemoveTargetCpa;

  public CampaignServiceMaximizeConversionsBiddingScheme() {
  }

  public CampaignServiceMaximizeConversionsBiddingScheme targetCpa(Long targetCpa) {
    
    this.targetCpa = targetCpa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン単価の目標値です。&lt;br&gt; ※制限値：1 ～ 800000&lt;br&gt; ※日本円のみの設定です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target CPA (JPY).&lt;br&gt; * Range limit: 1 - 800000&lt;/div&gt; 
   * @return targetCpa
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetCpa() {
    return targetCpa;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetCpa(Long targetCpa) {
    this.targetCpa = targetCpa;
  }


  public CampaignServiceMaximizeConversionsBiddingScheme isRemoveTargetCpa(CampaignServiceIsRemove isRemoveTargetCpa) {
    
    this.isRemoveTargetCpa = isRemoveTargetCpa;
    return this;
  }

   /**
   * Get isRemoveTargetCpa
   * @return isRemoveTargetCpa
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TARGET_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceIsRemove getIsRemoveTargetCpa() {
    return isRemoveTargetCpa;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TARGET_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTargetCpa(CampaignServiceIsRemove isRemoveTargetCpa) {
    this.isRemoveTargetCpa = isRemoveTargetCpa;
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
    return Objects.equals(this.targetCpa, campaignServiceMaximizeConversionsBiddingScheme.targetCpa) &&
        Objects.equals(this.isRemoveTargetCpa, campaignServiceMaximizeConversionsBiddingScheme.isRemoveTargetCpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetCpa, isRemoveTargetCpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceMaximizeConversionsBiddingScheme {\n");
    sb.append("    targetCpa: ").append(toIndentedString(targetCpa)).append("\n");
    sb.append("    isRemoveTargetCpa: ").append(toIndentedString(isRemoveTargetCpa)).append("\n");
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

