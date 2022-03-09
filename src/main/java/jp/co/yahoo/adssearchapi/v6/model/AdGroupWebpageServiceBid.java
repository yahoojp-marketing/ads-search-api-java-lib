/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupWebpageServiceBidSource;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceBidオブジェクトは、入札価格を表示します。 （AdGroupWebpageService用のオブジェクトです。）&lt;br&gt; ADD時およびSET時、このフィールドは省略可能となります。※ExcludedTypeがINCLUDEDのみ更新可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceBid object describes bid. (Object for AdGroupWebpageService.)&lt;br&gt; This field is optional in ADD and SET operation. *This field can be updated when ExcludedType is &#39;INCLUDED&#39;.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageServiceBidオブジェクトは、入札価格を表示します。 （AdGroupWebpageService用のオブジェクトです。）<br> ADD時およびSET時、このフィールドは省略可能となります。※ExcludedTypeがINCLUDEDのみ更新可能です。</div> <div lang=\"en\">AdGroupWebpageServiceBid object describes bid. (Object for AdGroupWebpageService.)<br> This field is optional in ADD and SET operation. *This field can be updated when ExcludedType is 'INCLUDED'.</div> ")
@JsonPropertyOrder({
  AdGroupWebpageServiceBid.JSON_PROPERTY_AD_GROUP_MAX_CPC,
  AdGroupWebpageServiceBid.JSON_PROPERTY_BID_SOURCE,
  AdGroupWebpageServiceBid.JSON_PROPERTY_KEYWORD_MAX_CPC,
  AdGroupWebpageServiceBid.JSON_PROPERTY_MAX_CPC
})
@JsonTypeName("AdGroupWebpageServiceBid")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupWebpageServiceBid {
  public static final String JSON_PROPERTY_AD_GROUP_MAX_CPC = "adGroupMaxCpc";
  private Long adGroupMaxCpc;

  public static final String JSON_PROPERTY_BID_SOURCE = "bidSource";
  private AdGroupWebpageServiceBidSource bidSource;

  public static final String JSON_PROPERTY_KEYWORD_MAX_CPC = "keywordMaxCpc";
  private Long keywordMaxCpc;

  public static final String JSON_PROPERTY_MAX_CPC = "maxCpc";
  private Long maxCpc;

  public AdGroupWebpageServiceBid() { 
  }

  public AdGroupWebpageServiceBid adGroupMaxCpc(Long adGroupMaxCpc) {
    
    this.adGroupMaxCpc = adGroupMaxCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループの最大入札価格です。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Max bid of ad group.&lt;br&gt;Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return adGroupMaxCpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループの最大入札価格です。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Max bid of ad group.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_MAX_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupMaxCpc() {
    return adGroupMaxCpc;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_MAX_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupMaxCpc(Long adGroupMaxCpc) {
    this.adGroupMaxCpc = adGroupMaxCpc;
  }


  public AdGroupWebpageServiceBid bidSource(AdGroupWebpageServiceBidSource bidSource) {
    
    this.bidSource = bidSource;
    return this;
  }

   /**
   * Get bidSource
   * @return bidSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BID_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupWebpageServiceBidSource getBidSource() {
    return bidSource;
  }


  @JsonProperty(JSON_PROPERTY_BID_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBidSource(AdGroupWebpageServiceBidSource bidSource) {
    this.bidSource = bidSource;
  }


  public AdGroupWebpageServiceBid keywordMaxCpc(Long keywordMaxCpc) {
    
    this.keywordMaxCpc = keywordMaxCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードの最大入札価格です。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Max bid of keyword.&lt;br&gt;Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return keywordMaxCpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードの最大入札価格です。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Max bid of keyword.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_KEYWORD_MAX_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getKeywordMaxCpc() {
    return keywordMaxCpc;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_MAX_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordMaxCpc(Long keywordMaxCpc) {
    this.keywordMaxCpc = keywordMaxCpc;
  }


  public AdGroupWebpageServiceBid maxCpc(Long maxCpc) {
    
    this.maxCpc = maxCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最大入札価格です。&lt;br&gt;ADD時、このフィールドは省略可能となります。その際、デフォルト値は1となります。SET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Max bid.&lt;br&gt;This field is optional in ADD and SET operation. The default value in ADD operation will be 1.&lt;/div&gt; 
   * @return maxCpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">最大入札価格です。<br>ADD時、このフィールドは省略可能となります。その際、デフォルト値は1となります。SET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Max bid.<br>This field is optional in ADD and SET operation. The default value in ADD operation will be 1.</div> ")
  @JsonProperty(JSON_PROPERTY_MAX_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxCpc() {
    return maxCpc;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupWebpageServiceBid adGroupWebpageServiceBid = (AdGroupWebpageServiceBid) o;
    return Objects.equals(this.adGroupMaxCpc, adGroupWebpageServiceBid.adGroupMaxCpc) &&
        Objects.equals(this.bidSource, adGroupWebpageServiceBid.bidSource) &&
        Objects.equals(this.keywordMaxCpc, adGroupWebpageServiceBid.keywordMaxCpc) &&
        Objects.equals(this.maxCpc, adGroupWebpageServiceBid.maxCpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupMaxCpc, bidSource, keywordMaxCpc, maxCpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceBid {\n");
    sb.append("    adGroupMaxCpc: ").append(toIndentedString(adGroupMaxCpc)).append("\n");
    sb.append("    bidSource: ").append(toIndentedString(bidSource)).append("\n");
    sb.append("    keywordMaxCpc: ").append(toIndentedString(keywordMaxCpc)).append("\n");
    sb.append("    maxCpc: ").append(toIndentedString(maxCpc)).append("\n");
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

