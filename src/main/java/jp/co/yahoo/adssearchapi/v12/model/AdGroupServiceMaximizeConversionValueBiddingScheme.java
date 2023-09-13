/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v12.model.AdGroupServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceMaximizeConversionValueBiddingSchemeオブジェクトは、広告グループ費用対効果（tROAS）の設定情報を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceMaximizeConversionValueBiddingScheme object holds configuration information of Target ROAS (tROAS) of ad group. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceMaximizeConversionValueBiddingSchemeオブジェクトは、広告グループ費用対効果（tROAS）の設定情報を表します。 </div> <div lang=\"en\"> AdGroupServiceMaximizeConversionValueBiddingScheme object holds configuration information of Target ROAS (tROAS) of ad group. </div> ")
@JsonPropertyOrder({
  AdGroupServiceMaximizeConversionValueBiddingScheme.JSON_PROPERTY_TARGET_ROAS,
  AdGroupServiceMaximizeConversionValueBiddingScheme.JSON_PROPERTY_IS_REMOVE_TARGET_ROAS
})
@JsonTypeName("AdGroupServiceMaximizeConversionValueBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceMaximizeConversionValueBiddingScheme {
  public static final String JSON_PROPERTY_TARGET_ROAS = "targetRoas";
  private Double targetRoas;

  public static final String JSON_PROPERTY_IS_REMOVE_TARGET_ROAS = "isRemoveTargetRoas";
  private AdGroupServiceIsRemoveFlg isRemoveTargetRoas;

  public AdGroupServiceMaximizeConversionValueBiddingScheme() { 
  }

  public AdGroupServiceMaximizeConversionValueBiddingScheme targetRoas(Double targetRoas) {
    
    this.targetRoas = targetRoas;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ費用対効果（tROAS）です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※0.01 ～ 1000.00（1% ～ 100000%）の範囲内のみ 許容します。&lt;br&gt; ※campaignBiddingStrategyTypeがMAXIMIZE_CONVERSION_VALUEの場合のみ指定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Target ROAS (tROAS) of ad group.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *Limit range: 0.01 - 1000.00 (1% - 100000%)&lt;br&gt; *This can only be specified when campaignBiddingStrategyType is MAXIMIZE_CONVERSION_VALUE. &lt;/div&gt; 
   * @return targetRoas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ費用対効果（tROAS）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※0.01 ～ 1000.00（1% ～ 100000%）の範囲内のみ 許容します。<br> ※campaignBiddingStrategyTypeがMAXIMIZE_CONVERSION_VALUEの場合のみ指定可能です。 </div> <div lang=\"en\"> Target ROAS (tROAS) of ad group.<br> This field is optional in ADD and SET operation.<br> *Limit range: 0.01 - 1000.00 (1% - 100000%)<br> *This can only be specified when campaignBiddingStrategyType is MAXIMIZE_CONVERSION_VALUE. </div> ")
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


  public AdGroupServiceMaximizeConversionValueBiddingScheme isRemoveTargetRoas(AdGroupServiceIsRemoveFlg isRemoveTargetRoas) {
    
    this.isRemoveTargetRoas = isRemoveTargetRoas;
    return this;
  }

   /**
   * Get isRemoveTargetRoas
   * @return isRemoveTargetRoas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    AdGroupServiceMaximizeConversionValueBiddingScheme adGroupServiceMaximizeConversionValueBiddingScheme = (AdGroupServiceMaximizeConversionValueBiddingScheme) o;
    return Objects.equals(this.targetRoas, adGroupServiceMaximizeConversionValueBiddingScheme.targetRoas) &&
        Objects.equals(this.isRemoveTargetRoas, adGroupServiceMaximizeConversionValueBiddingScheme.isRemoveTargetRoas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetRoas, isRemoveTargetRoas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceMaximizeConversionValueBiddingScheme {\n");
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

