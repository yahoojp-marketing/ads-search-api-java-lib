/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v17.model.CampaignServiceTargetImpressionShareLocation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceTargetImpressionShareSchemeオブジェクトは、インプレッションシェアの目標値の自動入札設定情報を表します。 （BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; ADD時、BiddingStrategyTypeがTARGET_IMPRESSION_SHAREの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceTargetImpressionShareScheme object describes automatic bid setting information of the impression share target value. (Object for anything other than BiddingStrategyService.)&lt;br&gt; If BiddingStrategyType is TARGET_IMPRESSION_SHARE, this field is required in ADD operation, and it is optional when BiddingStrategyType is the others.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceTargetImpressionShareScheme.JSON_PROPERTY_LOCATION,
  CampaignServiceTargetImpressionShareScheme.JSON_PROPERTY_BID_CEILING,
  CampaignServiceTargetImpressionShareScheme.JSON_PROPERTY_TARGET_IMPRESSION_SHARE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceTargetImpressionShareScheme {
  public static final String JSON_PROPERTY_LOCATION = "location";
  private CampaignServiceTargetImpressionShareLocation location;

  public static final String JSON_PROPERTY_BID_CEILING = "bidCeiling";
  private Long bidCeiling;

  public static final String JSON_PROPERTY_TARGET_IMPRESSION_SHARE = "targetImpressionShare";
  private Long targetImpressionShare;

  public CampaignServiceTargetImpressionShareScheme() {
  }

  public CampaignServiceTargetImpressionShareScheme location(CampaignServiceTargetImpressionShareLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceTargetImpressionShareLocation getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(CampaignServiceTargetImpressionShareLocation location) {
    this.location = location;
  }


  public CampaignServiceTargetImpressionShareScheme bidCeiling(Long bidCeiling) {
    
    this.bidCeiling = bidCeiling;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入札価格の上限です。&lt;br&gt; 入札価格の上限の詳細は以下のヘルプを参照してください。&lt;br&gt; ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044401?language&#x3D;ja\&quot;&gt;自動入札タイプ「ページ最上部掲載」【検索広告】&lt;/a&gt;&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;br&gt; ただし、他の入札戦略から「ページ最上部掲載」へ変更される場合はSET時でも必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Bid Limit.&lt;br&gt; Refer to the following help.&lt;br&gt; * &lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044401?language&#x3D;en_US\&quot;&gt;Autobidding type absolute top placement [Search Ads]&lt;/a&gt;&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;br&gt; If the &#39;Absolute top placement&#39; type is specified in a SET operation from another bidding strategy type, this field will be required. &lt;/div&gt; 
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


  public CampaignServiceTargetImpressionShareScheme targetImpressionShare(Long targetImpressionShare) {
    
    this.targetImpressionShare = targetImpressionShare;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;目標のインプレッションシェアです。&lt;br&gt; ADD時およびSET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target impression share.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return targetImpressionShare
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_IMPRESSION_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetImpressionShare() {
    return targetImpressionShare;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_IMPRESSION_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetImpressionShare(Long targetImpressionShare) {
    this.targetImpressionShare = targetImpressionShare;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceTargetImpressionShareScheme campaignServiceTargetImpressionShareScheme = (CampaignServiceTargetImpressionShareScheme) o;
    return Objects.equals(this.location, campaignServiceTargetImpressionShareScheme.location) &&
        Objects.equals(this.bidCeiling, campaignServiceTargetImpressionShareScheme.bidCeiling) &&
        Objects.equals(this.targetImpressionShare, campaignServiceTargetImpressionShareScheme.targetImpressionShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, bidCeiling, targetImpressionShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceTargetImpressionShareScheme {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
    sb.append("    targetImpressionShare: ").append(toIndentedString(targetImpressionShare)).append("\n");
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

