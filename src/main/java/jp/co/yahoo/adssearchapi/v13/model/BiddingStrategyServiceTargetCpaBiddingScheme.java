/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceTargetCpaBiddingSchemeオブジェクトは、コンバージョン単価の目標値の自動入札設定情報を表します。&lt;br&gt; このフィールドは、省略可能となります。※ADD時、typeがTARGET_CPAの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceTargetCpaBiddingScheme object displays auto bidding setting for Target CPA.&lt;br&gt; This field is optional. *If type is &#39;TARGET_CPA&#39;, this field is required in ADD operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  BiddingStrategyServiceTargetCpaBiddingScheme.JSON_PROPERTY_BID_CEILING,
  BiddingStrategyServiceTargetCpaBiddingScheme.JSON_PROPERTY_BID_FLOOR,
  BiddingStrategyServiceTargetCpaBiddingScheme.JSON_PROPERTY_TARGET_CPA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BiddingStrategyServiceTargetCpaBiddingScheme {
  public static final String JSON_PROPERTY_BID_CEILING = "bidCeiling";
  private Long bidCeiling;

  public static final String JSON_PROPERTY_BID_FLOOR = "bidFloor";
  private Long bidFloor;

  public static final String JSON_PROPERTY_TARGET_CPA = "targetCpa";
  private Long targetCpa;

  public BiddingStrategyServiceTargetCpaBiddingScheme() {
  }

  public BiddingStrategyServiceTargetCpaBiddingScheme bidCeiling(Long bidCeiling) {
    
    this.bidCeiling = bidCeiling;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入札価格の上限です。&lt;br&gt;※「0」が設定された場合、上限設定はありません。&lt;br&gt; このフィールドは、いずれの場合でも省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CPC limit.&lt;br&gt;* No limits if &amp;#34;0&amp;#34; is set.&lt;br&gt; This field is optional in any cases.&lt;/div&gt; 
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


  public BiddingStrategyServiceTargetCpaBiddingScheme bidFloor(Long bidFloor) {
    
    this.bidFloor = bidFloor;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;入札価格の下限です。&lt;br&gt;※ 設定を解除する場合は「0」を指定します。&lt;br&gt; このフィールドは、いずれの場合でも省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Minimum CPC.&lt;br&gt; * Set &amp;#34;0&amp;#34; to deactivate.&lt;br&gt;This field is optional in any cases.&lt;/div&gt; 
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


  public BiddingStrategyServiceTargetCpaBiddingScheme targetCpa(Long targetCpa) {
    
    this.targetCpa = targetCpa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン単価の目標値です（日本円です）。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target CPA (JPY).&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiddingStrategyServiceTargetCpaBiddingScheme biddingStrategyServiceTargetCpaBiddingScheme = (BiddingStrategyServiceTargetCpaBiddingScheme) o;
    return Objects.equals(this.bidCeiling, biddingStrategyServiceTargetCpaBiddingScheme.bidCeiling) &&
        Objects.equals(this.bidFloor, biddingStrategyServiceTargetCpaBiddingScheme.bidFloor) &&
        Objects.equals(this.targetCpa, biddingStrategyServiceTargetCpaBiddingScheme.targetCpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCeiling, bidFloor, targetCpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceTargetCpaBiddingScheme {\n");
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
    sb.append("    bidFloor: ").append(toIndentedString(bidFloor)).append("\n");
    sb.append("    targetCpa: ").append(toIndentedString(targetCpa)).append("\n");
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

