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
import jp.co.yahoo.adssearchapi.v12.model.CampaignServiceDynamicAdsForSearchSetting;
import jp.co.yahoo.adssearchapi.v12.model.CampaignServiceGeoTargetTypeSetting;
import jp.co.yahoo.adssearchapi.v12.model.CampaignServiceSettingType;
import jp.co.yahoo.adssearchapi.v12.model.CampaignServiceTargetingSetting;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceSettingsオブジェクトは、キャンペーンの地域ターゲットを格納するコンテナです。&lt;br&gt; ADD時、このフィールドは、campaignTypeがDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、必須となり、それ以外では省略可能となります。また、TargetingSettingが未設定の場合、デフォルト設定値は[SettingType:TARGET_LIST_SETTING, TargetAll:ACTIVE]となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceSettings object is container for geographic targeting  of campaign.&lt;br&gt; This field is required when campaignType is &#39;DYNAMIC_ADS_FOR_SEARCH_SETTING&#39; in ADD operation. For other campaignType, this field is optional in ADD operation. The default value will be TARGET_LIST_SETTING for SettingType or ACTIVE for TargetAll when TargetingSetting is not setting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceSettingsオブジェクトは、キャンペーンの地域ターゲットを格納するコンテナです。<br> ADD時、このフィールドは、campaignTypeがDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、必須となり、それ以外では省略可能となります。また、TargetingSettingが未設定の場合、デフォルト設定値は[SettingType:TARGET_LIST_SETTING, TargetAll:ACTIVE]となります。</div> <div lang=\"en\">CampaignServiceSettings object is container for geographic targeting  of campaign.<br> This field is required when campaignType is 'DYNAMIC_ADS_FOR_SEARCH_SETTING' in ADD operation. For other campaignType, this field is optional in ADD operation. The default value will be TARGET_LIST_SETTING for SettingType or ACTIVE for TargetAll when TargetingSetting is not setting.</div> ")
@JsonPropertyOrder({
  CampaignServiceSettings.JSON_PROPERTY_DYNAMIC_ADS_FOR_SEARCH_SETTING,
  CampaignServiceSettings.JSON_PROPERTY_GEO_TARGET_TYPE_SETTING,
  CampaignServiceSettings.JSON_PROPERTY_SETTING_TYPE,
  CampaignServiceSettings.JSON_PROPERTY_TARGETING_SETTING
})
@JsonTypeName("CampaignServiceSettings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceSettings {
  public static final String JSON_PROPERTY_DYNAMIC_ADS_FOR_SEARCH_SETTING = "dynamicAdsForSearchSetting";
  private CampaignServiceDynamicAdsForSearchSetting dynamicAdsForSearchSetting;

  public static final String JSON_PROPERTY_GEO_TARGET_TYPE_SETTING = "geoTargetTypeSetting";
  private CampaignServiceGeoTargetTypeSetting geoTargetTypeSetting;

  public static final String JSON_PROPERTY_SETTING_TYPE = "settingType";
  private CampaignServiceSettingType settingType;

  public static final String JSON_PROPERTY_TARGETING_SETTING = "targetingSetting";
  private CampaignServiceTargetingSetting targetingSetting;

  public CampaignServiceSettings() { 
  }

  public CampaignServiceSettings dynamicAdsForSearchSetting(CampaignServiceDynamicAdsForSearchSetting dynamicAdsForSearchSetting) {
    
    this.dynamicAdsForSearchSetting = dynamicAdsForSearchSetting;
    return this;
  }

   /**
   * Get dynamicAdsForSearchSetting
   * @return dynamicAdsForSearchSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DYNAMIC_ADS_FOR_SEARCH_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceDynamicAdsForSearchSetting getDynamicAdsForSearchSetting() {
    return dynamicAdsForSearchSetting;
  }


  @JsonProperty(JSON_PROPERTY_DYNAMIC_ADS_FOR_SEARCH_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDynamicAdsForSearchSetting(CampaignServiceDynamicAdsForSearchSetting dynamicAdsForSearchSetting) {
    this.dynamicAdsForSearchSetting = dynamicAdsForSearchSetting;
  }


  public CampaignServiceSettings geoTargetTypeSetting(CampaignServiceGeoTargetTypeSetting geoTargetTypeSetting) {
    
    this.geoTargetTypeSetting = geoTargetTypeSetting;
    return this;
  }

   /**
   * Get geoTargetTypeSetting
   * @return geoTargetTypeSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEO_TARGET_TYPE_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceGeoTargetTypeSetting getGeoTargetTypeSetting() {
    return geoTargetTypeSetting;
  }


  @JsonProperty(JSON_PROPERTY_GEO_TARGET_TYPE_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoTargetTypeSetting(CampaignServiceGeoTargetTypeSetting geoTargetTypeSetting) {
    this.geoTargetTypeSetting = geoTargetTypeSetting;
  }


  public CampaignServiceSettings settingType(CampaignServiceSettingType settingType) {
    
    this.settingType = settingType;
    return this;
  }

   /**
   * Get settingType
   * @return settingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SETTING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceSettingType getSettingType() {
    return settingType;
  }


  @JsonProperty(JSON_PROPERTY_SETTING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettingType(CampaignServiceSettingType settingType) {
    this.settingType = settingType;
  }


  public CampaignServiceSettings targetingSetting(CampaignServiceTargetingSetting targetingSetting) {
    
    this.targetingSetting = targetingSetting;
    return this;
  }

   /**
   * Get targetingSetting
   * @return targetingSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGETING_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceTargetingSetting getTargetingSetting() {
    return targetingSetting;
  }


  @JsonProperty(JSON_PROPERTY_TARGETING_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetingSetting(CampaignServiceTargetingSetting targetingSetting) {
    this.targetingSetting = targetingSetting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceSettings campaignServiceSettings = (CampaignServiceSettings) o;
    return Objects.equals(this.dynamicAdsForSearchSetting, campaignServiceSettings.dynamicAdsForSearchSetting) &&
        Objects.equals(this.geoTargetTypeSetting, campaignServiceSettings.geoTargetTypeSetting) &&
        Objects.equals(this.settingType, campaignServiceSettings.settingType) &&
        Objects.equals(this.targetingSetting, campaignServiceSettings.targetingSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicAdsForSearchSetting, geoTargetTypeSetting, settingType, targetingSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceSettings {\n");
    sb.append("    dynamicAdsForSearchSetting: ").append(toIndentedString(dynamicAdsForSearchSetting)).append("\n");
    sb.append("    geoTargetTypeSetting: ").append(toIndentedString(geoTargetTypeSetting)).append("\n");
    sb.append("    settingType: ").append(toIndentedString(settingType)).append("\n");
    sb.append("    targetingSetting: ").append(toIndentedString(targetingSetting)).append("\n");
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

