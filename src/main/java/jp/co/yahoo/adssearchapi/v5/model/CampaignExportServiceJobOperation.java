package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignExportServiceExportSetting;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CampaignExportServiceJobOperation
 */

public class CampaignExportServiceJobOperation   {
  @JsonProperty("setting")
  private JsonNullable<CampaignExportServiceExportSetting> setting = JsonNullable.undefined();

  public CampaignExportServiceJobOperation setting(CampaignExportServiceExportSetting setting) {
    this.setting = JsonNullable.of(setting);
    return this;
  }

  /**
   * Get setting
   * @return setting
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public JsonNullable<CampaignExportServiceExportSetting> getSetting() {
    return setting;
  }

  public void setSetting(JsonNullable<CampaignExportServiceExportSetting> setting) {
    this.setting = setting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignExportServiceJobOperation campaignExportServiceJobOperation = (CampaignExportServiceJobOperation) o;
    return Objects.equals(this.setting, campaignExportServiceJobOperation.setting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignExportServiceJobOperation {\n");
    
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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

