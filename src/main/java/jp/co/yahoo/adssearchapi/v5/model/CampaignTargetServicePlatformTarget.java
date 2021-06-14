package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignTargetServicePlatformType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServicePlatformTargetオブジェクトは、デバイス設定を表します。&lt;br&gt; このフィールドは、ADD時およびSET時に省略可能となります。&lt;br&gt; ※TargetTypeがPLATFORMの場合、このフィールドはADD時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServicePlatformTarget object describes device setting.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If targetType is PLATFORM, this field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetServicePlatformTargetオブジェクトは、デバイス設定を表します。<br> このフィールドは、ADD時およびSET時に省略可能となります。<br> ※TargetTypeがPLATFORMの場合、このフィールドはADD時に必須となります。</div> <div lang=\"en\">CampaignTargetServicePlatformTarget object describes device setting.<br> This field is optional in ADD and SET operation.<br> *If targetType is PLATFORM, this field is required in ADD operation.</div> ")

public class CampaignTargetServicePlatformTarget   {
  @JsonProperty("platformType")
  private JsonNullable<CampaignTargetServicePlatformType> platformType = JsonNullable.undefined();

  public CampaignTargetServicePlatformTarget platformType(CampaignTargetServicePlatformType platformType) {
    this.platformType = JsonNullable.of(platformType);
    return this;
  }

  /**
   * Get platformType
   * @return platformType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignTargetServicePlatformType> getPlatformType() {
    return platformType;
  }

  public void setPlatformType(JsonNullable<CampaignTargetServicePlatformType> platformType) {
    this.platformType = platformType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargetServicePlatformTarget campaignTargetServicePlatformTarget = (CampaignTargetServicePlatformTarget) o;
    return Objects.equals(this.platformType, campaignTargetServicePlatformTarget.platformType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServicePlatformTarget {\n");
    
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
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

