package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceAdRotationMode;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceAdGroupAdRotationModeは、広告表示の最適化設定を表します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceAdGroupAdRotationMode describes Ad Rotation settings for optimizing and displaying ads.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceAdGroupAdRotationModeは、広告表示の最適化設定を表します。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupServiceAdGroupAdRotationMode describes Ad Rotation settings for optimizing and displaying ads.<br> This field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceAdGroupAdRotationMode   {
  @JsonProperty("adRotationMode")
  private AdGroupServiceAdRotationMode adRotationMode = null;

  public AdGroupServiceAdGroupAdRotationMode adRotationMode(AdGroupServiceAdRotationMode adRotationMode) {
    this.adRotationMode = adRotationMode;
    return this;
  }

  /**
   * Get adRotationMode
   * @return adRotationMode
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceAdRotationMode getAdRotationMode() {
    return adRotationMode;
  }

  public void setAdRotationMode(AdGroupServiceAdRotationMode adRotationMode) {
    this.adRotationMode = adRotationMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceAdGroupAdRotationMode adGroupServiceAdGroupAdRotationMode = (AdGroupServiceAdGroupAdRotationMode) o;
    return Objects.equals(this.adRotationMode, adGroupServiceAdGroupAdRotationMode.adRotationMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adRotationMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceAdGroupAdRotationMode {\n");
    
    sb.append("    adRotationMode: ").append(toIndentedString(adRotationMode)).append("\n");
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

