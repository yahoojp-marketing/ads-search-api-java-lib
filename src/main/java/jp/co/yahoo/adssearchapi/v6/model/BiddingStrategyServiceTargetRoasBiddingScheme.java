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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceTargetRoasBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。&lt;br&gt; このフィールドは、省略可能となります。※ADD時、typeがTARGET_ROASの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceTargetRoasBiddingScheme object displays Auto Bidding setting for Target ROAS.&lt;br&gt; This field is optional. *If type is &#39;TARGET_ROAS&#39;, this field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceTargetRoasBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。<br> このフィールドは、省略可能となります。※ADD時、typeがTARGET_ROASの場合は必須です。</div> <div lang=\"en\">BiddingStrategyServiceTargetRoasBiddingScheme object displays Auto Bidding setting for Target ROAS.<br> This field is optional. *If type is 'TARGET_ROAS', this field is required in ADD operation.</div> ")
@JsonPropertyOrder({
  BiddingStrategyServiceTargetRoasBiddingScheme.JSON_PROPERTY_BID_CEILING,
  BiddingStrategyServiceTargetRoasBiddingScheme.JSON_PROPERTY_BID_FLOOR,
  BiddingStrategyServiceTargetRoasBiddingScheme.JSON_PROPERTY_TARGET_ROAS
})
@JsonTypeName("BiddingStrategyServiceTargetRoasBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BiddingStrategyServiceTargetRoasBiddingScheme {
  public static final String JSON_PROPERTY_BID_CEILING = "bidCeiling";
  private Long bidCeiling;

  public static final String JSON_PROPERTY_BID_FLOOR = "bidFloor";
  private Long bidFloor;

  public static final String JSON_PROPERTY_TARGET_ROAS = "targetRoas";
  private Double targetRoas;

  public BiddingStrategyServiceTargetRoasBiddingScheme() { 
  }

  public BiddingStrategyServiceTargetRoasBiddingScheme bidCeiling(Long bidCeiling) {
    
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


  public BiddingStrategyServiceTargetRoasBiddingScheme bidFloor(Long bidFloor) {
    
    this.bidFloor = bidFloor;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入札価格の下限です。&lt;br&gt; ※ 設定を解除する場合は「0」を指定します。&lt;br&gt; このフィールドは、いずれの場合でも省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Minimum CPC.&lt;br&gt; * Set &amp;#34;0&amp;#34; to deactivate.&lt;br&gt; This field is optional in any cases.&lt;/div&gt; 
   * @return bidFloor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の下限です。<br> ※ 設定を解除する場合は「0」を指定します。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Minimum CPC.<br> * Set &#34;0&#34; to deactivate.<br> This field is optional in any cases.</div> ")
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


  public BiddingStrategyServiceTargetRoasBiddingScheme targetRoas(Double targetRoas) {
    
    this.targetRoas = targetRoas;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告費用対効果の目標値&lt;br&gt; ※0.01 〜1000.00（1%〜100000%）の範囲内のみ許容します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。※Return On Advertising Spend(ROAS)&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target ROAS.&lt;br&gt; * ROAS: Return On Average Spend.&lt;br&gt; * Setting limit: 0.01 〜1000.00（1%〜100000%）.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
   * @return targetRoas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告費用対効果の目標値<br> ※0.01 〜1000.00（1%〜100000%）の範囲内のみ許容します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。※Return On Advertising Spend(ROAS)</div> <div lang=\"en\">Target ROAS.<br> * ROAS: Return On Average Spend.<br> * Setting limit: 0.01 〜1000.00（1%〜100000%）.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
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
    BiddingStrategyServiceTargetRoasBiddingScheme biddingStrategyServiceTargetRoasBiddingScheme = (BiddingStrategyServiceTargetRoasBiddingScheme) o;
    return Objects.equals(this.bidCeiling, biddingStrategyServiceTargetRoasBiddingScheme.bidCeiling) &&
        Objects.equals(this.bidFloor, biddingStrategyServiceTargetRoasBiddingScheme.bidFloor) &&
        Objects.equals(this.targetRoas, biddingStrategyServiceTargetRoasBiddingScheme.targetRoas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCeiling, bidFloor, targetRoas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceTargetRoasBiddingScheme {\n");
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

