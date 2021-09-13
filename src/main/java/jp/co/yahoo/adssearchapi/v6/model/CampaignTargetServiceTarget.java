package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.CampaignTargetServiceLocationTarget;
import jp.co.yahoo.adssearchapi.v6.model.CampaignTargetServiceNetworkTarget;
import jp.co.yahoo.adssearchapi.v6.model.CampaignTargetServicePlatformTarget;
import jp.co.yahoo.adssearchapi.v6.model.CampaignTargetServiceScheduleTarget;
import jp.co.yahoo.adssearchapi.v6.model.CampaignTargetServiceTargetType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceTargetオブジェクトは、ターゲティング設定を表します。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServiceTarget object describes CampaignTargetServiceTarget information.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetServiceTargetオブジェクトは、ターゲティング設定を表します。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">CampaignTargetServiceTarget object describes CampaignTargetServiceTarget information.<br> This field is required in any cases.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignTargetServiceTarget   {
  @JsonProperty("locationTarget")
  private CampaignTargetServiceLocationTarget locationTarget = null;

  @JsonProperty("networkTarget")
  private CampaignTargetServiceNetworkTarget networkTarget = null;

  @JsonProperty("platformTarget")
  private CampaignTargetServicePlatformTarget platformTarget = null;

  @JsonProperty("scheduleTarget")
  private CampaignTargetServiceScheduleTarget scheduleTarget = null;

  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("targetType")
  private CampaignTargetServiceTargetType targetType = null;

  public CampaignTargetServiceTarget locationTarget(CampaignTargetServiceLocationTarget locationTarget) {
    this.locationTarget = locationTarget;
    return this;
  }

  /**
   * Get locationTarget
   * @return locationTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignTargetServiceLocationTarget getLocationTarget() {
    return locationTarget;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignTargetServiceNetworkTarget getNetworkTarget() {
    return networkTarget;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignTargetServicePlatformTarget getPlatformTarget() {
    return platformTarget;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignTargetServiceScheduleTarget getScheduleTarget() {
    return scheduleTarget;
  }

  public void setScheduleTarget(CampaignTargetServiceScheduleTarget scheduleTarget) {
    this.scheduleTarget = scheduleTarget;
  }

  public CampaignTargetServiceTarget targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。<br> ※LocationCampaignTargetServiceTargetの場合、ADD時に必須となります。<br> ※PlatformCampaignTargetServiceTargetの場合、SET時に無視されます。</div> <div lang=\"en\">CampaignTargetServiceTarget ID.<br> This field will be ignored in ADD operation, and is required in ADD and REMOVE operation.<br> *For LocationCampaignTargetServiceTarget, this is required in ADD operation.<br> *For PlatformCampaignTargetServiceTarget, this will be ignored in SET operation.</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。<br> ※LocationCampaignTargetServiceTargetの場合、ADD時に必須となります。<br> ※PlatformCampaignTargetServiceTargetの場合、SET時に無視されます。</div> <div lang=\"en\">CampaignTargetServiceTarget ID.<br> This field will be ignored in ADD operation, and is required in ADD and REMOVE operation.<br> *For LocationCampaignTargetServiceTarget, this is required in ADD operation.<br> *For PlatformCampaignTargetServiceTarget, this will be ignored in SET operation.</div> ")


  public String getTargetId() {
    return targetId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignTargetServiceTargetType getTargetType() {
    return targetType;
  }

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

