package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceGeoTargetType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceGeoTargetTypeSettingsオブジェクトは、地域ターゲットの情報を格納するコンテナです。&lt;br&gt; ADD時、settingTypeがGEO_TARGET_TYPE_SETTINGの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceGeoTargetTypeSettings object is a container for GeoTargeting.&lt;br&gt; This field is optional. However, in ADD operation, this field is required only when settingType is &#39;GEO_TARGET_TYPE_SETTING&#39;, and it is optional when settingType is the others.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceGeoTargetTypeSettingsオブジェクトは、地域ターゲットの情報を格納するコンテナです。<br> ADD時、settingTypeがGEO_TARGET_TYPE_SETTINGの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceGeoTargetTypeSettings object is a container for GeoTargeting.<br> This field is optional. However, in ADD operation, this field is required only when settingType is 'GEO_TARGET_TYPE_SETTING', and it is optional when settingType is the others.</div> ")

public class CampaignServiceGeoTargetTypeSetting   {
  @JsonProperty("negativeGeoTargetType")
  private JsonNullable<CampaignServiceGeoTargetType> negativeGeoTargetType = JsonNullable.undefined();

  @JsonProperty("positiveGeoTargetType")
  private JsonNullable<CampaignServiceGeoTargetType> positiveGeoTargetType = JsonNullable.undefined();

  public CampaignServiceGeoTargetTypeSetting negativeGeoTargetType(CampaignServiceGeoTargetType negativeGeoTargetType) {
    this.negativeGeoTargetType = JsonNullable.of(negativeGeoTargetType);
    return this;
  }

  /**
   * Get negativeGeoTargetType
   * @return negativeGeoTargetType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceGeoTargetType> getNegativeGeoTargetType() {
    return negativeGeoTargetType;
  }

  public void setNegativeGeoTargetType(JsonNullable<CampaignServiceGeoTargetType> negativeGeoTargetType) {
    this.negativeGeoTargetType = negativeGeoTargetType;
  }

  public CampaignServiceGeoTargetTypeSetting positiveGeoTargetType(CampaignServiceGeoTargetType positiveGeoTargetType) {
    this.positiveGeoTargetType = JsonNullable.of(positiveGeoTargetType);
    return this;
  }

  /**
   * Get positiveGeoTargetType
   * @return positiveGeoTargetType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceGeoTargetType> getPositiveGeoTargetType() {
    return positiveGeoTargetType;
  }

  public void setPositiveGeoTargetType(JsonNullable<CampaignServiceGeoTargetType> positiveGeoTargetType) {
    this.positiveGeoTargetType = positiveGeoTargetType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

