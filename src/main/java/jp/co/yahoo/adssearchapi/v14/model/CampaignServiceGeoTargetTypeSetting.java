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
import jp.co.yahoo.adssearchapi.v14.model.CampaignServiceGeoTargetType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceGeoTargetTypeSettingsオブジェクトは、地域ターゲットの情報を格納するコンテナです。&lt;br&gt; ADD時、settingTypeがGEO_TARGET_TYPE_SETTINGの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceGeoTargetTypeSettings object is a container for GeoTargeting.&lt;br&gt; This field is optional. However, in ADD operation, this field is required only when settingType is &#39;GEO_TARGET_TYPE_SETTING&#39;, and it is optional when settingType is the others.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceGeoTargetTypeSettingsオブジェクトは、地域ターゲットの情報を格納するコンテナです。<br> ADD時、settingTypeがGEO_TARGET_TYPE_SETTINGの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceGeoTargetTypeSettings object is a container for GeoTargeting.<br> This field is optional. However, in ADD operation, this field is required only when settingType is 'GEO_TARGET_TYPE_SETTING', and it is optional when settingType is the others.</div> ")
@JsonPropertyOrder({
  CampaignServiceGeoTargetTypeSetting.JSON_PROPERTY_NEGATIVE_GEO_TARGET_TYPE,
  CampaignServiceGeoTargetTypeSetting.JSON_PROPERTY_POSITIVE_GEO_TARGET_TYPE
})
@JsonTypeName("CampaignServiceGeoTargetTypeSetting")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceGeoTargetTypeSetting {
  public static final String JSON_PROPERTY_NEGATIVE_GEO_TARGET_TYPE = "negativeGeoTargetType";
  private CampaignServiceGeoTargetType negativeGeoTargetType;

  public static final String JSON_PROPERTY_POSITIVE_GEO_TARGET_TYPE = "positiveGeoTargetType";
  private CampaignServiceGeoTargetType positiveGeoTargetType;

  public CampaignServiceGeoTargetTypeSetting() { 
  }

  public CampaignServiceGeoTargetTypeSetting negativeGeoTargetType(CampaignServiceGeoTargetType negativeGeoTargetType) {
    
    this.negativeGeoTargetType = negativeGeoTargetType;
    return this;
  }

   /**
   * Get negativeGeoTargetType
   * @return negativeGeoTargetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEGATIVE_GEO_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceGeoTargetType getNegativeGeoTargetType() {
    return negativeGeoTargetType;
  }


  @JsonProperty(JSON_PROPERTY_NEGATIVE_GEO_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegativeGeoTargetType(CampaignServiceGeoTargetType negativeGeoTargetType) {
    this.negativeGeoTargetType = negativeGeoTargetType;
  }


  public CampaignServiceGeoTargetTypeSetting positiveGeoTargetType(CampaignServiceGeoTargetType positiveGeoTargetType) {
    
    this.positiveGeoTargetType = positiveGeoTargetType;
    return this;
  }

   /**
   * Get positiveGeoTargetType
   * @return positiveGeoTargetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSITIVE_GEO_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceGeoTargetType getPositiveGeoTargetType() {
    return positiveGeoTargetType;
  }


  @JsonProperty(JSON_PROPERTY_POSITIVE_GEO_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPositiveGeoTargetType(CampaignServiceGeoTargetType positiveGeoTargetType) {
    this.positiveGeoTargetType = positiveGeoTargetType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceGeoTargetTypeSetting campaignServiceGeoTargetTypeSetting = (CampaignServiceGeoTargetTypeSetting) o;
    return Objects.equals(this.negativeGeoTargetType, campaignServiceGeoTargetTypeSetting.negativeGeoTargetType) &&
        Objects.equals(this.positiveGeoTargetType, campaignServiceGeoTargetTypeSetting.positiveGeoTargetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negativeGeoTargetType, positiveGeoTargetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceGeoTargetTypeSetting {\n");
    sb.append("    negativeGeoTargetType: ").append(toIndentedString(negativeGeoTargetType)).append("\n");
    sb.append("    positiveGeoTargetType: ").append(toIndentedString(positiveGeoTargetType)).append("\n");
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

