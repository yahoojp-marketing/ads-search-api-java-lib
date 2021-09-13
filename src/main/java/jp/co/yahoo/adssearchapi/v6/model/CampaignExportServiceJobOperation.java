package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.CampaignExportServiceExportSetting;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CampaignExportServiceJobOperation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignExportServiceJobOperation   {
  @JsonProperty("setting")
  private CampaignExportServiceExportSetting setting = null;

  public CampaignExportServiceJobOperation setting(CampaignExportServiceExportSetting setting) {
    this.setting = setting;
    return this;
  }

  /**
   * Get setting
   * @return setting
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CampaignExportServiceExportSetting getSetting() {
    return setting;
  }

  public void setSetting(CampaignExportServiceExportSetting setting) {
    this.setting = setting;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

