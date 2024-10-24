/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v15.model.AdGroupCriterionServiceBidSource;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceBidオブジェクトは、入札価格を表示します。 （AdGroupCriterionService用のオブジェクトです。）&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceBid object displays the bid values. *Object for AdGroupCriterionService.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupCriterionServiceBid.JSON_PROPERTY_AD_GROUP_CPC,
  AdGroupCriterionServiceBid.JSON_PROPERTY_BID_SOURCE,
  AdGroupCriterionServiceBid.JSON_PROPERTY_KEYWORD_CPC,
  AdGroupCriterionServiceBid.JSON_PROPERTY_CPC
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupCriterionServiceBid {
  public static final String JSON_PROPERTY_AD_GROUP_CPC = "adGroupCpc";
  private Long adGroupCpc;

  public static final String JSON_PROPERTY_BID_SOURCE = "bidSource";
  private AdGroupCriterionServiceBidSource bidSource;

  public static final String JSON_PROPERTY_KEYWORD_CPC = "keywordCpc";
  private Long keywordCpc;

  public static final String JSON_PROPERTY_CPC = "cpc";
  private Long cpc;

  public AdGroupCriterionServiceBid() {
  }

  public AdGroupCriterionServiceBid adGroupCpc(Long adGroupCpc) {
    
    this.adGroupCpc = adGroupCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループ入札価格です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CPC of Ad group.&lt;/div&gt; 
   * @return adGroupCpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUP_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupCpc() {
    return adGroupCpc;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupCpc(Long adGroupCpc) {
    this.adGroupCpc = adGroupCpc;
  }


  public AdGroupCriterionServiceBid bidSource(AdGroupCriterionServiceBidSource bidSource) {
    
    this.bidSource = bidSource;
    return this;
  }

   /**
   * Get bidSource
   * @return bidSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BID_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupCriterionServiceBidSource getBidSource() {
    return bidSource;
  }


  @JsonProperty(JSON_PROPERTY_BID_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBidSource(AdGroupCriterionServiceBidSource bidSource) {
    this.bidSource = bidSource;
  }


  public AdGroupCriterionServiceBid keywordCpc(Long keywordCpc) {
    
    this.keywordCpc = keywordCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワード入札価格です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CPC of Keyword.&lt;/div&gt; 
   * @return keywordCpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getKeywordCpc() {
    return keywordCpc;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordCpc(Long keywordCpc) {
    this.keywordCpc = keywordCpc;
  }


  public AdGroupCriterionServiceBid cpc(Long cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワード入札価格です。&lt;br&gt; このフィールドは、省略可能となります。その際、ADD時のデフォルト設定値は1となります。&lt;br&gt; ※cpcが0の場合は、設定なしと同様です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CPC of Keyword.&lt;br&gt; This field is optional. The default value in ADD operation will be 1.&lt;br&gt; *Confirmed as no setting, if value is set &amp;#34;0&amp;#34;.&lt;/div&gt; 
   * @return cpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCpc() {
    return cpc;
  }


  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpc(Long cpc) {
    this.cpc = cpc;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceBid adGroupCriterionServiceBid = (AdGroupCriterionServiceBid) o;
    return Objects.equals(this.adGroupCpc, adGroupCriterionServiceBid.adGroupCpc) &&
        Objects.equals(this.bidSource, adGroupCriterionServiceBid.bidSource) &&
        Objects.equals(this.keywordCpc, adGroupCriterionServiceBid.keywordCpc) &&
        Objects.equals(this.cpc, adGroupCriterionServiceBid.cpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupCpc, bidSource, keywordCpc, cpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceBid {\n");
    sb.append("    adGroupCpc: ").append(toIndentedString(adGroupCpc)).append("\n");
    sb.append("    bidSource: ").append(toIndentedString(bidSource)).append("\n");
    sb.append("    keywordCpc: ").append(toIndentedString(keywordCpc)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
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

