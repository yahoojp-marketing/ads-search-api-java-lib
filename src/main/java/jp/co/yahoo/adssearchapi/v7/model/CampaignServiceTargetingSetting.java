package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.CampaignServiceTargetAll;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceTargetingSettingは、ターゲット設定を保持するオブジェクトです。&lt;br&gt; ADD時、settingTypeがTARGET_LIST_SETTINGの場合、必須となり、それ以外では省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceTargetingSetting is object that holds target setting.&lt;br&gt; This field is optional. However, in ADD operation, this field is required only when settingType is &#39;TARGET_LIST_SETTING&#39;, and it is optional when settingType is the others.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceTargetingSettingは、ターゲット設定を保持するオブジェクトです。<br> ADD時、settingTypeがTARGET_LIST_SETTINGの場合、必須となり、それ以外では省略可能となります。</div> <div lang=\"en\">CampaignServiceTargetingSetting is object that holds target setting.<br> This field is optional. However, in ADD operation, this field is required only when settingType is 'TARGET_LIST_SETTING', and it is optional when settingType is the others.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceTargetingSetting   {
  @JsonProperty("targetAll")
  private CampaignServiceTargetAll targetAll = null;

  public CampaignServiceTargetingSetting targetAll(CampaignServiceTargetAll targetAll) {
    this.targetAll = targetAll;
    return this;
  }

  /**
   * Get targetAll
   * @return targetAll
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignServiceTargetAll getTargetAll() {
    return targetAll;
  }

  public void setTargetAll(CampaignServiceTargetAll targetAll) {
    this.targetAll = targetAll;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceTargetingSetting campaignServiceTargetingSetting = (CampaignServiceTargetingSetting) o;
    return Objects.equals(this.targetAll, campaignServiceTargetingSetting.targetAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceTargetingSetting {\n");
    
    sb.append("    targetAll: ").append(toIndentedString(targetAll)).append("\n");
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

