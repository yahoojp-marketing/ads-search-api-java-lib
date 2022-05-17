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
import jp.co.yahoo.adssearchapi.v8.model.BiddingStrategyServiceTargetImpressionShareLocation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceTargetImpressionShareSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。&lt;br&gt; このフィールドは、省略可能となります。※ADD時、typeがTARGET_IMPRESSION_SHAREの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceTargetImpressionShareScheme describes the Auto bidding setting information of Target ROAS. &lt;br&gt; This field is optional. *If type is TARGET_IMPRESSION_SHARE, this field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceTargetImpressionShareSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。<br> このフィールドは、省略可能となります。※ADD時、typeがTARGET_IMPRESSION_SHAREの場合は必須です。</div> <div lang=\"en\">BiddingStrategyServiceTargetImpressionShareScheme describes the Auto bidding setting information of Target ROAS. <br> This field is optional. *If type is TARGET_IMPRESSION_SHARE, this field is required in ADD operation.</div> ")
@JsonPropertyOrder({
  BiddingStrategyServiceTargetImpressionShareScheme.JSON_PROPERTY_LOCATION,
  BiddingStrategyServiceTargetImpressionShareScheme.JSON_PROPERTY_BID_CEILING,
  BiddingStrategyServiceTargetImpressionShareScheme.JSON_PROPERTY_TARGET_IMPRESSION_SHARE
})
@JsonTypeName("BiddingStrategyServiceTargetImpressionShareScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BiddingStrategyServiceTargetImpressionShareScheme {
  public static final String JSON_PROPERTY_LOCATION = "location";
  private BiddingStrategyServiceTargetImpressionShareLocation location;

  public static final String JSON_PROPERTY_BID_CEILING = "bidCeiling";
  private Long bidCeiling;

  public static final String JSON_PROPERTY_TARGET_IMPRESSION_SHARE = "targetImpressionShare";
  private Long targetImpressionShare;

  public BiddingStrategyServiceTargetImpressionShareScheme() { 
  }

  public BiddingStrategyServiceTargetImpressionShareScheme location(BiddingStrategyServiceTargetImpressionShareLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BiddingStrategyServiceTargetImpressionShareLocation getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(BiddingStrategyServiceTargetImpressionShareLocation location) {
    this.location = location;
  }


  public BiddingStrategyServiceTargetImpressionShareScheme bidCeiling(Long bidCeiling) {
    
    this.bidCeiling = bidCeiling;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入札価格の上限です。（0〜50000）&lt;br&gt; ※「0」が設定された場合、上限設定はありません。&lt;br&gt; このフィールドは、いずれの場合でも省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CPC limit (0-50000).&lt;br&gt; * No limits if &amp;#34;0&amp;#34; is set.&lt;br&gt; This field is optional in any cases.&lt;/div&gt; 
   * @return bidCeiling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の上限です。（0〜50000）<br> ※「0」が設定された場合、上限設定はありません。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">CPC limit (0-50000).<br> * No limits if &#34;0&#34; is set.<br> This field is optional in any cases.</div> ")
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


  public BiddingStrategyServiceTargetImpressionShareScheme targetImpressionShare(Long targetImpressionShare) {
    
    this.targetImpressionShare = targetImpressionShare;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;目標のインプレッションシェアです。&lt;br&gt; ADD時およびSET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target impression share.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return targetImpressionShare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">目標のインプレッションシェアです。<br> ADD時およびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Target impression share.<br> This field is required in ADD and SET operation. </div> ")
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
    BiddingStrategyServiceTargetImpressionShareScheme biddingStrategyServiceTargetImpressionShareScheme = (BiddingStrategyServiceTargetImpressionShareScheme) o;
    return Objects.equals(this.location, biddingStrategyServiceTargetImpressionShareScheme.location) &&
        Objects.equals(this.bidCeiling, biddingStrategyServiceTargetImpressionShareScheme.bidCeiling) &&
        Objects.equals(this.targetImpressionShare, biddingStrategyServiceTargetImpressionShareScheme.targetImpressionShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, bidCeiling, targetImpressionShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceTargetImpressionShareScheme {\n");
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

