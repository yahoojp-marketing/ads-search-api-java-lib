/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v15.model.CampaignServiceCampaignConversionGoals;
import jp.co.yahoo.adssearchapi.v15.model.CampaignServiceGoalConfigLevel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceConversionSettingオブジェクトは、コンバージョン設定を表します。&lt;br&gt; conversionGroupId &#x3D; null かつ campaignConversionGoals &#x3D; null の際は goalConfigLevel &#x3D; ACCOUNT を設定してください。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceConversionSetting object display the conversion setting.&lt;br&gt; When both conversionGroupId and campaignConversionGoals are null, please set \&quot;goalConfigLevel &#x3D; ACCOUNT\&quot;.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceConversionSettingオブジェクトは、コンバージョン設定を表します。<br> conversionGroupId = null かつ campaignConversionGoals = null の際は goalConfigLevel = ACCOUNT を設定してください。</div> <div lang=\"en\">CampaignServiceConversionSetting object display the conversion setting.<br> When both conversionGroupId and campaignConversionGoals are null, please set \"goalConfigLevel = ACCOUNT\".</div> ")
@JsonPropertyOrder({
  CampaignServiceConversionSetting.JSON_PROPERTY_CONVERSION_GROUP_ID,
  CampaignServiceConversionSetting.JSON_PROPERTY_GOAL_CONFIG_LEVEL,
  CampaignServiceConversionSetting.JSON_PROPERTY_CAMPAIGN_CONVERSION_GOALS
})
@JsonTypeName("CampaignServiceConversionSetting")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceConversionSetting {
  public static final String JSON_PROPERTY_CONVERSION_GROUP_ID = "conversionGroupId";
  private Long conversionGroupId;

  public static final String JSON_PROPERTY_GOAL_CONFIG_LEVEL = "goalConfigLevel";
  private CampaignServiceGoalConfigLevel goalConfigLevel;

  public static final String JSON_PROPERTY_CAMPAIGN_CONVERSION_GOALS = "campaignConversionGoals";
  private List<CampaignServiceCampaignConversionGoals> campaignConversionGoals = null;

  public CampaignServiceConversionSetting() { 
  }

  public CampaignServiceConversionSetting conversionGroupId(Long conversionGroupId) {
    
    this.conversionGroupId = conversionGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョングループIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversion Group ID.&lt;/div&gt; 
   * @return conversionGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョングループIDです。</div> <div lang=\"en\">Conversion Group ID.</div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionGroupId() {
    return conversionGroupId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionGroupId(Long conversionGroupId) {
    this.conversionGroupId = conversionGroupId;
  }


  public CampaignServiceConversionSetting goalConfigLevel(CampaignServiceGoalConfigLevel goalConfigLevel) {
    
    this.goalConfigLevel = goalConfigLevel;
    return this;
  }

   /**
   * Get goalConfigLevel
   * @return goalConfigLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GOAL_CONFIG_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceGoalConfigLevel getGoalConfigLevel() {
    return goalConfigLevel;
  }


  @JsonProperty(JSON_PROPERTY_GOAL_CONFIG_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoalConfigLevel(CampaignServiceGoalConfigLevel goalConfigLevel) {
    this.goalConfigLevel = goalConfigLevel;
  }


  public CampaignServiceConversionSetting campaignConversionGoals(List<CampaignServiceCampaignConversionGoals> campaignConversionGoals) {
    
    this.campaignConversionGoals = campaignConversionGoals;
    return this;
  }

  public CampaignServiceConversionSetting addCampaignConversionGoalsItem(CampaignServiceCampaignConversionGoals campaignConversionGoalsItem) {
    if (this.campaignConversionGoals == null) {
      this.campaignConversionGoals = new ArrayList<>();
    }
    this.campaignConversionGoals.add(campaignConversionGoalsItem);
    return this;
  }

   /**
   * Get campaignConversionGoals
   * @return campaignConversionGoals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_CONVERSION_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignServiceCampaignConversionGoals> getCampaignConversionGoals() {
    return campaignConversionGoals;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_CONVERSION_GOALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignConversionGoals(List<CampaignServiceCampaignConversionGoals> campaignConversionGoals) {
    this.campaignConversionGoals = campaignConversionGoals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceConversionSetting campaignServiceConversionSetting = (CampaignServiceConversionSetting) o;
    return Objects.equals(this.conversionGroupId, campaignServiceConversionSetting.conversionGroupId) &&
        Objects.equals(this.goalConfigLevel, campaignServiceConversionSetting.goalConfigLevel) &&
        Objects.equals(this.campaignConversionGoals, campaignServiceConversionSetting.campaignConversionGoals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionGroupId, goalConfigLevel, campaignConversionGoals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceConversionSetting {\n");
    sb.append("    conversionGroupId: ").append(toIndentedString(conversionGroupId)).append("\n");
    sb.append("    goalConfigLevel: ").append(toIndentedString(goalConfigLevel)).append("\n");
    sb.append("    campaignConversionGoals: ").append(toIndentedString(campaignConversionGoals)).append("\n");
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

