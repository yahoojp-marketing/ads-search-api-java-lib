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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceMaximizeClicksBiddingSchemeオブジェクトは、クリック数の最大化の自動入札設定情報を表します。（BiddingStrategyService以外用のオブジェクトです。）&lt;br&gt; ADD時、BiddingStrategyTypeがMAXIMIZE_CLICKSの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceMaximizeClicksBiddingScheme object describes auto bidding setting for Maximize Clicks. *This is an object for anything other than BiddingStrategyService.&lt;br&gt; This field is required when BiddingStrategyType is &#39;MAXIMIZE_CLICKS&#39; in ADD operation. For other BiddingStrategyType, this field is optional in ADD operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceMaximizeClicksBiddingScheme.JSON_PROPERTY_BID_CEILING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceMaximizeClicksBiddingScheme {
  public static final String JSON_PROPERTY_BID_CEILING = "bidCeiling";
  private Long bidCeiling;

  public CampaignServiceMaximizeClicksBiddingScheme() {
  }

  public CampaignServiceMaximizeClicksBiddingScheme bidCeiling(Long bidCeiling) {
    
    this.bidCeiling = bidCeiling;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入札価格の上限です。&lt;br&gt;※「0」が設定された 場合、上限設定は ありません。&lt;br&gt; このフィールドは省略可能となります。その際、デフォルト設定値は0となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Bid amount limit.&lt;br&gt;* If &amp;#34;0&amp;#34; is set, no bid limit.&lt;br&gt; This field is optional. The default value will be 0.&lt;/div&gt; 
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceMaximizeClicksBiddingScheme campaignServiceMaximizeClicksBiddingScheme = (CampaignServiceMaximizeClicksBiddingScheme) o;
    return Objects.equals(this.bidCeiling, campaignServiceMaximizeClicksBiddingScheme.bidCeiling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCeiling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceMaximizeClicksBiddingScheme {\n");
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
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

