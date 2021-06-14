package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceDynamicSearchLinkedAdオブジェクトは、動的検索連動型広告を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceDynamicSearchLinkedAd object describes the information of Dynamic Search Ad.&lt;br&gt; This field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceDynamicSearchLinkedAdオブジェクトは、動的検索連動型広告を表します。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupAdServiceDynamicSearchLinkedAd object describes the information of Dynamic Search Ad.<br> This field is optional in ADD operation.</div> ")

public class AdGroupAdServiceDynamicSearchLinkedAd   {
  @JsonProperty("description2")
  private JsonNullable<String> description2 = JsonNullable.undefined();

  public AdGroupAdServiceDynamicSearchLinkedAd description2(String description2) {
    this.description2 = JsonNullable.of(description2);
    return this;
  }

  /**
   * <div lang=\"ja\">説明文2です。<br>※現在、こちらのフィールドは利用できません。</div> <div lang=\"en\">Description2 of the ad.<br>*Currently this field is not available.</div> 
   * @return description2
  */
  @ApiModelProperty(value = "<div lang=\"ja\">説明文2です。<br>※現在、こちらのフィールドは利用できません。</div> <div lang=\"en\">Description2 of the ad.<br>*Currently this field is not available.</div> ")


  public JsonNullable<String> getDescription2() {
    return description2;
  }

  public void setDescription2(JsonNullable<String> description2) {
    this.description2 = description2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceDynamicSearchLinkedAd adGroupAdServiceDynamicSearchLinkedAd = (AdGroupAdServiceDynamicSearchLinkedAd) o;
    return Objects.equals(this.description2, adGroupAdServiceDynamicSearchLinkedAd.description2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceDynamicSearchLinkedAd {\n");
    
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
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

