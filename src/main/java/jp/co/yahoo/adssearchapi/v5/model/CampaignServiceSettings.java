package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceDynamicAdsForSearchSetting;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceGeoTargetTypeSetting;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceSettingType;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceTargetingSetting;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceSettingsオブジェクトは、キャンペーンの地域ターゲットを格納するコンテナです。&lt;br&gt; ADD時、このフィールドは、campaignTypeがDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、必須となり、それ以外では省略可能となります。また、TargetingSettingが未設定の場合、デフォルト設定値は[SettingType:TARGET_LIST_SETTING, TargetAll:ACTIVE]となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceSettings object is container for geographic targeting  of campaign.&lt;br&gt; This field is required when campaignType is &#39;DYNAMIC_ADS_FOR_SEARCH_SETTING&#39; in ADD operation. For other campaignType, this field is optional in ADD operation. The default value will be TARGET_LIST_SETTING for SettingType or ACTIVE for TargetAll when TargetingSetting is not setting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceSettingsオブジェクトは、キャンペーンの地域ターゲットを格納するコンテナです。<br> ADD時、このフィールドは、campaignTypeがDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、必須となり、それ以外では省略可能となります。また、TargetingSettingが未設定の場合、デフォルト設定値は[SettingType:TARGET_LIST_SETTING, TargetAll:ACTIVE]となります。</div> <div lang=\"en\">CampaignServiceSettings object is container for geographic targeting  of campaign.<br> This field is required when campaignType is 'DYNAMIC_ADS_FOR_SEARCH_SETTING' in ADD operation. For other campaignType, this field is optional in ADD operation. The default value will be TARGET_LIST_SETTING for SettingType or ACTIVE for TargetAll when TargetingSetting is not setting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceSettings   {
  @JsonProperty("dynamicAdsForSearchSetting")
  private CampaignServiceDynamicAdsForSearchSetting dynamicAdsForSearchSetting = null;

  @JsonProperty("geoTargetTypeSetting")
  private CampaignServiceGeoTargetTypeSetting geoTargetTypeSetting = null;

  @JsonProperty("settingType")
  private CampaignServiceSettingType settingType = null;

  @JsonProperty("targetingSetting")
  private CampaignServiceTargetingSetting targetingSetting = null;

  public CampaignServiceSettings dynamicAdsForSearchSetting(CampaignServiceDynamicAdsForSearchSetting dynamicAdsForSearchSetting) {
    this.dynamicAdsForSearchSetting = dynamicAdsForSearchSetting;
    return this;
  }

  /**
   * Get dynamicAdsForSearchSetting
   * @return dynamicAdsForSearchSetting
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceDynamicAdsForSearchSetting getDynamicAdsForSearchSetting() {
    return dynamicAdsForSearchSetting;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceGeoTargetTypeSetting getGeoTargetTypeSetting() {
    return geoTargetTypeSetting;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceSettingType getSettingType() {
    return settingType;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceTargetingSetting getTargetingSetting() {
    return targetingSetting;
  }

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

