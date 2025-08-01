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
import jp.co.yahoo.adssearchapi.v17.model.AdGroupServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceTargetRoasBiddingSchemeオブジェクトは、広告グループ費用対効果（tROAS）の設定情報を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceTargetRoasBiddingScheme object holds configuration information of target ROAS (tROAS) of ad group. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupServiceTargetRoasBiddingScheme.JSON_PROPERTY_TARGET_ROAS,
  AdGroupServiceTargetRoasBiddingScheme.JSON_PROPERTY_IS_REMOVE_TARGET_ROAS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceTargetRoasBiddingScheme {
  public static final String JSON_PROPERTY_TARGET_ROAS = "targetRoas";
  private Double targetRoas;

  public static final String JSON_PROPERTY_IS_REMOVE_TARGET_ROAS = "isRemoveTargetRoas";
  private AdGroupServiceIsRemoveFlg isRemoveTargetRoas;

  public AdGroupServiceTargetRoasBiddingScheme() {
  }

  public AdGroupServiceTargetRoasBiddingScheme targetRoas(Double targetRoas) {
    
    this.targetRoas = targetRoas;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ費用対効果（tROAS）です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※0.01 ～ 1000.00（1% ～ 100000%）の範囲内のみ 許容します。&lt;br&gt; ※campaignBiddingStrategyTypeがTARGET_ROASの場合のみ指定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Target ROAS (tROAS) of ad group.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *Limit range: 0.01 - 1000.00 (1% - 100000%)&lt;br&gt; *This can only be specified when campaignBiddingStrategyType is TARGET_ROAS. &lt;/div&gt; 
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


  public AdGroupServiceTargetRoasBiddingScheme isRemoveTargetRoas(AdGroupServiceIsRemoveFlg isRemoveTargetRoas) {
    
    this.isRemoveTargetRoas = isRemoveTargetRoas;
    return this;
  }

   /**
   * Get isRemoveTargetRoas
   * @return isRemoveTargetRoas
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TARGET_ROAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceIsRemoveFlg getIsRemoveTargetRoas() {
    return isRemoveTargetRoas;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TARGET_ROAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTargetRoas(AdGroupServiceIsRemoveFlg isRemoveTargetRoas) {
    this.isRemoveTargetRoas = isRemoveTargetRoas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceTargetRoasBiddingScheme adGroupServiceTargetRoasBiddingScheme = (AdGroupServiceTargetRoasBiddingScheme) o;
    return Objects.equals(this.targetRoas, adGroupServiceTargetRoasBiddingScheme.targetRoas) &&
        Objects.equals(this.isRemoveTargetRoas, adGroupServiceTargetRoasBiddingScheme.isRemoveTargetRoas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetRoas, isRemoveTargetRoas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceTargetRoasBiddingScheme {\n");
    sb.append("    targetRoas: ").append(toIndentedString(targetRoas)).append("\n");
    sb.append("    isRemoveTargetRoas: ").append(toIndentedString(isRemoveTargetRoas)).append("\n");
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

