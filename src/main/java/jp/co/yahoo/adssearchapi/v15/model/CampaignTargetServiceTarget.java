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
import jp.co.yahoo.adssearchapi.v15.model.CampaignTargetServiceLocationTarget;
import jp.co.yahoo.adssearchapi.v15.model.CampaignTargetServiceNetworkTarget;
import jp.co.yahoo.adssearchapi.v15.model.CampaignTargetServicePlatformTarget;
import jp.co.yahoo.adssearchapi.v15.model.CampaignTargetServiceScheduleTarget;
import jp.co.yahoo.adssearchapi.v15.model.CampaignTargetServiceTargetType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceTargetオブジェクトは、ターゲティング設定を表します。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServiceTarget object describes CampaignTargetServiceTarget information.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignTargetServiceTarget.JSON_PROPERTY_LOCATION_TARGET,
  CampaignTargetServiceTarget.JSON_PROPERTY_NETWORK_TARGET,
  CampaignTargetServiceTarget.JSON_PROPERTY_PLATFORM_TARGET,
  CampaignTargetServiceTarget.JSON_PROPERTY_SCHEDULE_TARGET,
  CampaignTargetServiceTarget.JSON_PROPERTY_TARGET_ID,
  CampaignTargetServiceTarget.JSON_PROPERTY_TARGET_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignTargetServiceTarget {
  public static final String JSON_PROPERTY_LOCATION_TARGET = "locationTarget";
  private CampaignTargetServiceLocationTarget locationTarget;

  public static final String JSON_PROPERTY_NETWORK_TARGET = "networkTarget";
  private CampaignTargetServiceNetworkTarget networkTarget;

  public static final String JSON_PROPERTY_PLATFORM_TARGET = "platformTarget";
  private CampaignTargetServicePlatformTarget platformTarget;

  public static final String JSON_PROPERTY_SCHEDULE_TARGET = "scheduleTarget";
  private CampaignTargetServiceScheduleTarget scheduleTarget;

  public static final String JSON_PROPERTY_TARGET_ID = "targetId";
  private String targetId;

  public static final String JSON_PROPERTY_TARGET_TYPE = "targetType";
  private CampaignTargetServiceTargetType targetType;

  public CampaignTargetServiceTarget() {
  }

  public CampaignTargetServiceTarget locationTarget(CampaignTargetServiceLocationTarget locationTarget) {
    
    this.locationTarget = locationTarget;
    return this;
  }

   /**
   * Get locationTarget
   * @return locationTarget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceLocationTarget getLocationTarget() {
    return locationTarget;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationTarget(CampaignTargetServiceLocationTarget locationTarget) {
    this.locationTarget = locationTarget;
  }


  public CampaignTargetServiceTarget networkTarget(CampaignTargetServiceNetworkTarget networkTarget) {
    
    this.networkTarget = networkTarget;
    return this;
  }

   /**
   * Get networkTarget
   * @return networkTarget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceNetworkTarget getNetworkTarget() {
    return networkTarget;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkTarget(CampaignTargetServiceNetworkTarget networkTarget) {
    this.networkTarget = networkTarget;
  }


  public CampaignTargetServiceTarget platformTarget(CampaignTargetServicePlatformTarget platformTarget) {
    
    this.platformTarget = platformTarget;
    return this;
  }

   /**
   * Get platformTarget
   * @return platformTarget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServicePlatformTarget getPlatformTarget() {
    return platformTarget;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformTarget(CampaignTargetServicePlatformTarget platformTarget) {
    this.platformTarget = platformTarget;
  }


  public CampaignTargetServiceTarget scheduleTarget(CampaignTargetServiceScheduleTarget scheduleTarget) {
    
    this.scheduleTarget = scheduleTarget;
    return this;
  }

   /**
   * Get scheduleTarget
   * @return scheduleTarget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceScheduleTarget getScheduleTarget() {
    return scheduleTarget;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleTarget(CampaignTargetServiceScheduleTarget scheduleTarget) {
    this.scheduleTarget = scheduleTarget;
  }


  public CampaignTargetServiceTarget targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットIDです。&lt;br&gt; このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。&lt;br&gt; ※LocationCampaignTargetServiceTargetの場合、ADD時に必須となります。&lt;br&gt; ※PlatformCampaignTargetServiceTargetの場合、SET時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServiceTarget ID.&lt;br&gt; This field will be ignored in ADD operation, and is required in ADD and REMOVE operation.&lt;br&gt; *For LocationCampaignTargetServiceTarget, this is required in ADD operation.&lt;br&gt; *For PlatformCampaignTargetServiceTarget, this will be ignored in SET operation.&lt;/div&gt; 
   * @return targetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetId() {
    return targetId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public CampaignTargetServiceTarget targetType(CampaignTargetServiceTargetType targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceTargetType getTargetType() {
    return targetType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetType(CampaignTargetServiceTargetType targetType) {
    this.targetType = targetType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargetServiceTarget campaignTargetServiceTarget = (CampaignTargetServiceTarget) o;
    return Objects.equals(this.locationTarget, campaignTargetServiceTarget.locationTarget) &&
        Objects.equals(this.networkTarget, campaignTargetServiceTarget.networkTarget) &&
        Objects.equals(this.platformTarget, campaignTargetServiceTarget.platformTarget) &&
        Objects.equals(this.scheduleTarget, campaignTargetServiceTarget.scheduleTarget) &&
        Objects.equals(this.targetId, campaignTargetServiceTarget.targetId) &&
        Objects.equals(this.targetType, campaignTargetServiceTarget.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationTarget, networkTarget, platformTarget, scheduleTarget, targetId, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServiceTarget {\n");
    sb.append("    locationTarget: ").append(toIndentedString(locationTarget)).append("\n");
    sb.append("    networkTarget: ").append(toIndentedString(networkTarget)).append("\n");
    sb.append("    platformTarget: ").append(toIndentedString(platformTarget)).append("\n");
    sb.append("    scheduleTarget: ").append(toIndentedString(scheduleTarget)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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

