package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceTargetAll;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceTargetingSettingは、ターゲット設定を保持するオブジェクトです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceTargetingSetting is object that holds target setting.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceTargetingSettingは、ターゲット設定を保持するオブジェクトです。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupServiceTargetingSetting is object that holds target setting.<br> This field is optional in ADD and SET operation.</div> ")

public class AdGroupServiceTargetingSetting   {
  @JsonProperty("targetAll")
  private JsonNullable<AdGroupServiceTargetAll> targetAll = JsonNullable.undefined();

  public AdGroupServiceTargetingSetting targetAll(AdGroupServiceTargetAll targetAll) {
    this.targetAll = JsonNullable.of(targetAll);
    return this;
  }

  /**
   * Get targetAll
   * @return targetAll
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceTargetAll> getTargetAll() {
    return targetAll;
  }

  public void setTargetAll(JsonNullable<AdGroupServiceTargetAll> targetAll) {
    this.targetAll = targetAll;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceTargetingSetting adGroupServiceTargetingSetting = (AdGroupServiceTargetingSetting) o;
    return Objects.equals(this.targetAll, adGroupServiceTargetingSetting.targetAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceTargetingSetting {\n");
    
    sb.append("    targetAll: ").append(toIndentedString(targetAll)).append("\n");
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

