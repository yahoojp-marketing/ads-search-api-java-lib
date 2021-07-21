package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceCriterionType;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceTargetingSetting;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceSettingsは、ターゲットタイプを保持するオブジェクトです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceSettings is object that holds target type.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceSettingsは、ターゲットタイプを保持するオブジェクトです。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupServiceSettings is object that holds target type.<br> This field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceSettings   {
  @JsonProperty("criterionType")
  private AdGroupServiceCriterionType criterionType = null;

  @JsonProperty("targetingSetting")
  private AdGroupServiceTargetingSetting targetingSetting = null;

  public AdGroupServiceSettings criterionType(AdGroupServiceCriterionType criterionType) {
    this.criterionType = criterionType;
    return this;
  }

  /**
   * Get criterionType
   * @return criterionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceCriterionType getCriterionType() {
    return criterionType;
  }

  public void setCriterionType(AdGroupServiceCriterionType criterionType) {
    this.criterionType = criterionType;
  }

  public AdGroupServiceSettings targetingSetting(AdGroupServiceTargetingSetting targetingSetting) {
    this.targetingSetting = targetingSetting;
    return this;
  }

  /**
   * Get targetingSetting
   * @return targetingSetting
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceTargetingSetting getTargetingSetting() {
    return targetingSetting;
  }

  public void setTargetingSetting(AdGroupServiceTargetingSetting targetingSetting) {
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
    AdGroupServiceSettings adGroupServiceSettings = (AdGroupServiceSettings) o;
    return Objects.equals(this.criterionType, adGroupServiceSettings.criterionType) &&
        Objects.equals(this.targetingSetting, adGroupServiceSettings.targetingSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criterionType, targetingSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceSettings {\n");
    
    sb.append("    criterionType: ").append(toIndentedString(criterionType)).append("\n");
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

