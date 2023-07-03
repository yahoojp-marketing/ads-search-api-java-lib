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
import jp.co.yahoo.adssearchapi.v10.model.BiddingStrategyServiceMaximizeClicksBiddingScheme;
import jp.co.yahoo.adssearchapi.v10.model.BiddingStrategyServiceTargetCpaBiddingScheme;
import jp.co.yahoo.adssearchapi.v10.model.BiddingStrategyServiceTargetImpressionShareScheme;
import jp.co.yahoo.adssearchapi.v10.model.BiddingStrategyServiceTargetRoasBiddingScheme;
import jp.co.yahoo.adssearchapi.v10.model.BiddingStrategyServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。（BiddingStrategyService用のオブジェクトです。）&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceBiddingScheme object displays the details of Auto Bidding setting. (This is for BiddingStrategyService)&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  BiddingStrategyServiceBiddingScheme.JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME,
  BiddingStrategyServiceBiddingScheme.JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME,
  BiddingStrategyServiceBiddingScheme.JSON_PROPERTY_MAXIMIZE_CLICKS_BIDDING_SCHEME,
  BiddingStrategyServiceBiddingScheme.JSON_PROPERTY_TARGET_IMPRESSION_SHARE_SCHEME,
  BiddingStrategyServiceBiddingScheme.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BiddingStrategyServiceBiddingScheme {
  public static final String JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME = "targetCpaBiddingScheme";
  private BiddingStrategyServiceTargetCpaBiddingScheme targetCpaBiddingScheme;

  public static final String JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME = "targetRoasBiddingScheme";
  private BiddingStrategyServiceTargetRoasBiddingScheme targetRoasBiddingScheme;

  public static final String JSON_PROPERTY_MAXIMIZE_CLICKS_BIDDING_SCHEME = "maximizeClicksBiddingScheme";
  private BiddingStrategyServiceMaximizeClicksBiddingScheme maximizeClicksBiddingScheme;

  public static final String JSON_PROPERTY_TARGET_IMPRESSION_SHARE_SCHEME = "targetImpressionShareScheme";
  private BiddingStrategyServiceTargetImpressionShareScheme targetImpressionShareScheme;

  public static final String JSON_PROPERTY_TYPE = "type";
  private BiddingStrategyServiceType type;

  public BiddingStrategyServiceBiddingScheme() {
  }

  public BiddingStrategyServiceBiddingScheme targetCpaBiddingScheme(BiddingStrategyServiceTargetCpaBiddingScheme targetCpaBiddingScheme) {
    
    this.targetCpaBiddingScheme = targetCpaBiddingScheme;
    return this;
  }

   /**
   * Get targetCpaBiddingScheme
   * @return targetCpaBiddingScheme
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BiddingStrategyServiceTargetCpaBiddingScheme getTargetCpaBiddingScheme() {
    return targetCpaBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CPA_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetCpaBiddingScheme(BiddingStrategyServiceTargetCpaBiddingScheme targetCpaBiddingScheme) {
    this.targetCpaBiddingScheme = targetCpaBiddingScheme;
  }


  public BiddingStrategyServiceBiddingScheme targetRoasBiddingScheme(BiddingStrategyServiceTargetRoasBiddingScheme targetRoasBiddingScheme) {
    
    this.targetRoasBiddingScheme = targetRoasBiddingScheme;
    return this;
  }

   /**
   * Get targetRoasBiddingScheme
   * @return targetRoasBiddingScheme
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BiddingStrategyServiceTargetRoasBiddingScheme getTargetRoasBiddingScheme() {
    return targetRoasBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ROAS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetRoasBiddingScheme(BiddingStrategyServiceTargetRoasBiddingScheme targetRoasBiddingScheme) {
    this.targetRoasBiddingScheme = targetRoasBiddingScheme;
  }


  public BiddingStrategyServiceBiddingScheme maximizeClicksBiddingScheme(BiddingStrategyServiceMaximizeClicksBiddingScheme maximizeClicksBiddingScheme) {
    
    this.maximizeClicksBiddingScheme = maximizeClicksBiddingScheme;
    return this;
  }

   /**
   * Get maximizeClicksBiddingScheme
   * @return maximizeClicksBiddingScheme
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CLICKS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BiddingStrategyServiceMaximizeClicksBiddingScheme getMaximizeClicksBiddingScheme() {
    return maximizeClicksBiddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMIZE_CLICKS_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximizeClicksBiddingScheme(BiddingStrategyServiceMaximizeClicksBiddingScheme maximizeClicksBiddingScheme) {
    this.maximizeClicksBiddingScheme = maximizeClicksBiddingScheme;
  }


  public BiddingStrategyServiceBiddingScheme targetImpressionShareScheme(BiddingStrategyServiceTargetImpressionShareScheme targetImpressionShareScheme) {
    
    this.targetImpressionShareScheme = targetImpressionShareScheme;
    return this;
  }

   /**
   * Get targetImpressionShareScheme
   * @return targetImpressionShareScheme
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_IMPRESSION_SHARE_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BiddingStrategyServiceTargetImpressionShareScheme getTargetImpressionShareScheme() {
    return targetImpressionShareScheme;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_IMPRESSION_SHARE_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetImpressionShareScheme(BiddingStrategyServiceTargetImpressionShareScheme targetImpressionShareScheme) {
    this.targetImpressionShareScheme = targetImpressionShareScheme;
  }


  public BiddingStrategyServiceBiddingScheme type(BiddingStrategyServiceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BiddingStrategyServiceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(BiddingStrategyServiceType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiddingStrategyServiceBiddingScheme biddingStrategyServiceBiddingScheme = (BiddingStrategyServiceBiddingScheme) o;
    return Objects.equals(this.targetCpaBiddingScheme, biddingStrategyServiceBiddingScheme.targetCpaBiddingScheme) &&
        Objects.equals(this.targetRoasBiddingScheme, biddingStrategyServiceBiddingScheme.targetRoasBiddingScheme) &&
        Objects.equals(this.maximizeClicksBiddingScheme, biddingStrategyServiceBiddingScheme.maximizeClicksBiddingScheme) &&
        Objects.equals(this.targetImpressionShareScheme, biddingStrategyServiceBiddingScheme.targetImpressionShareScheme) &&
        Objects.equals(this.type, biddingStrategyServiceBiddingScheme.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetCpaBiddingScheme, targetRoasBiddingScheme, maximizeClicksBiddingScheme, targetImpressionShareScheme, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceBiddingScheme {\n");
    sb.append("    targetCpaBiddingScheme: ").append(toIndentedString(targetCpaBiddingScheme)).append("\n");
    sb.append("    targetRoasBiddingScheme: ").append(toIndentedString(targetRoasBiddingScheme)).append("\n");
    sb.append("    maximizeClicksBiddingScheme: ").append(toIndentedString(maximizeClicksBiddingScheme)).append("\n");
    sb.append("    targetImpressionShareScheme: ").append(toIndentedString(targetImpressionShareScheme)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

