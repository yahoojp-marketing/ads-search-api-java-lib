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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v14.model.AdGroupServiceIsRemoveFlg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceTargetCpaBiddingSchemeオブジェクトは、広告グループ目標単価（tCPA）の設定情報を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceTargetCpaBiddingScheme object holds configuration information of target CPA (tCPA) of ad group. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceTargetCpaBiddingSchemeオブジェクトは、広告グループ目標単価（tCPA）の設定情報を表します。 </div> <div lang=\"en\"> AdGroupServiceTargetCpaBiddingScheme object holds configuration information of target CPA (tCPA) of ad group. </div> ")
@JsonPropertyOrder({
  AdGroupServiceTargetCpaBiddingScheme.JSON_PROPERTY_TARGET_CPA,
  AdGroupServiceTargetCpaBiddingScheme.JSON_PROPERTY_IS_REMOVE_TARGET_CPA
})
@JsonTypeName("AdGroupServiceTargetCpaBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceTargetCpaBiddingScheme {
  public static final String JSON_PROPERTY_TARGET_CPA = "targetCpa";
  private Long targetCpa;

  public static final String JSON_PROPERTY_IS_REMOVE_TARGET_CPA = "isRemoveTargetCpa";
  private AdGroupServiceIsRemoveFlg isRemoveTargetCpa;

  public AdGroupServiceTargetCpaBiddingScheme() { 
  }

  public AdGroupServiceTargetCpaBiddingScheme targetCpa(Long targetCpa) {
    
    this.targetCpa = targetCpa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ目標単価（tCPA）です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;br&gt; ※制限値：1 ～ 800000&lt;br&gt; ※日本円のみの設定です。&lt;br&gt; ※campaignBiddingStrategyTypeがTARGET_CPAの場合のみ指定可能です。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Target CPA (tCPA) of ad group.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *Range limit: 1 - 800000&lt;br&gt; *JPY only.&lt;br&gt; *This can only be specified when campaignBiddingStrategyType is TARGET_CPA. &lt;/div&gt; 
   * @return targetCpa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ目標単価（tCPA）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※制限値：1 ～ 800000<br> ※日本円のみの設定です。<br> ※campaignBiddingStrategyTypeがTARGET_CPAの場合のみ指定可能です。 </div> <div lang=\"en\"> Target CPA (tCPA) of ad group.<br> This field is optional in ADD and SET operation.<br> *Range limit: 1 - 800000<br> *JPY only.<br> *This can only be specified when campaignBiddingStrategyType is TARGET_CPA. </div> ")
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


  public AdGroupServiceTargetCpaBiddingScheme isRemoveTargetCpa(AdGroupServiceIsRemoveFlg isRemoveTargetCpa) {
    
    this.isRemoveTargetCpa = isRemoveTargetCpa;
    return this;
  }

   /**
   * Get isRemoveTargetCpa
   * @return isRemoveTargetCpa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TARGET_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceIsRemoveFlg getIsRemoveTargetCpa() {
    return isRemoveTargetCpa;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TARGET_CPA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTargetCpa(AdGroupServiceIsRemoveFlg isRemoveTargetCpa) {
    this.isRemoveTargetCpa = isRemoveTargetCpa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceTargetCpaBiddingScheme adGroupServiceTargetCpaBiddingScheme = (AdGroupServiceTargetCpaBiddingScheme) o;
    return Objects.equals(this.targetCpa, adGroupServiceTargetCpaBiddingScheme.targetCpa) &&
        Objects.equals(this.isRemoveTargetCpa, adGroupServiceTargetCpaBiddingScheme.isRemoveTargetCpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetCpa, isRemoveTargetCpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceTargetCpaBiddingScheme {\n");
    sb.append("    targetCpa: ").append(toIndentedString(targetCpa)).append("\n");
    sb.append("    isRemoveTargetCpa: ").append(toIndentedString(isRemoveTargetCpa)).append("\n");
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

