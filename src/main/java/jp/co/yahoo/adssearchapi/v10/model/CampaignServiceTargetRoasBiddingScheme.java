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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceTargetRoasBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; ADD時、BiddingStrategyTypeがTARGET_ROASの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceTargetRoasBiddingScheme object displays Auto Bidding setting for Target ROAS. *This is an object for anything other than BiddingStrategyService.&lt;br&gt; This field is required when BiddingStrategyType is &#39;TARGET_ROAS&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceTargetRoasBiddingScheme.JSON_PROPERTY_BID_CEILING,
  CampaignServiceTargetRoasBiddingScheme.JSON_PROPERTY_BID_FLOOR,
  CampaignServiceTargetRoasBiddingScheme.JSON_PROPERTY_TARGET_ROAS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceTargetRoasBiddingScheme {
  public static final String JSON_PROPERTY_BID_CEILING = "bidCeiling";
  private Long bidCeiling;

  public static final String JSON_PROPERTY_BID_FLOOR = "bidFloor";
  private Long bidFloor;

  public static final String JSON_PROPERTY_TARGET_ROAS = "targetRoas";
  private Double targetRoas;

  public CampaignServiceTargetRoasBiddingScheme() {
  }

  public CampaignServiceTargetRoasBiddingScheme bidCeiling(Long bidCeiling) {
    
    this.bidCeiling = bidCeiling;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入札価格の上限です。&lt;br&gt;このフィールドの追加と編集は廃止され、現在設定できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Limit of bid (CPC).&lt;br&gt;Adding and editing this field is obsolete. Currently not available.&lt;/div&gt; 
   * @return bidCeiling
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BID_CEILING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBidCeiling() {
    return bidCeiling;
  }


  @JsonProperty(JSON_PROPERTY_BID_CEILING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
  }


  public CampaignServiceTargetRoasBiddingScheme bidFloor(Long bidFloor) {
    
    this.bidFloor = bidFloor;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入札価格の下限です。&lt;br&gt;このフィールドの追加と編集は廃止され、現在設定できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Minimum CPC.&lt;br&gt;Adding and editing this field is obsolete. Currently not available.&lt;/div&gt; 
   * @return bidFloor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BID_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBidFloor() {
    return bidFloor;
  }


  @JsonProperty(JSON_PROPERTY_BID_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBidFloor(Long bidFloor) {
    this.bidFloor = bidFloor;
  }


  public CampaignServiceTargetRoasBiddingScheme targetRoas(Double targetRoas) {
    
    this.targetRoas = targetRoas;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告費用対効果の目標値です。&lt;br&gt; 0.01 ～ 1000.00（1% ～ 100000%）の範囲内のみ 許容します。&lt;br&gt; ADD時およびSET時、このフィールドは必須となります。&lt;br&gt; ※ROAS:Return On Advertising Spend&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target ROAS (Return On Advertising Spend)&lt;br&gt; * Limit range: 0.01 - 1000.00 (1% - 100000%)&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return targetRoas
  **/
  @jakarta.annotation.Nullable
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

