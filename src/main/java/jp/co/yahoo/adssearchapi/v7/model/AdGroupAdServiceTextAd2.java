package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceTextAd2オブジェクトは、検索広告のPCおよびスマートフォン向けの広告を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがTEXT_AD2の場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceTextAd2 object is a text ad type for Sponsored Search on PC and smartphone.&lt;br&gt; This field is optional in ADD operation. *If adType is TEXT_AD2, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceTextAd2オブジェクトは、検索広告のPCおよびスマートフォン向けの広告を表します。<br> ADD時、このフィールドは省略可能となります。※adTypeがTEXT_AD2の場合は必須です。</div> <div lang=\"en\">AdGroupAdServiceTextAd2 object is a text ad type for Sponsored Search on PC and smartphone.<br> This field is optional in ADD operation. *If adType is TEXT_AD2, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceTextAd2   {
  @JsonProperty("description2")
  private String description2 = null;

  public AdGroupAdServiceTextAd2 description2(String description2) {
    this.description2 = description2;
    return this;
  }

  /**
   * <div lang=\"ja\">説明文2（2行目）です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Description2 (line2) of the ad.<br> This field is required in ADD operation.</div> 
   * @return description2
  */
  @ApiModelProperty(value = "<div lang=\"ja\">説明文2（2行目）です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Description2 (line2) of the ad.<br> This field is required in ADD operation.</div> ")


  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceTextAd2 adGroupAdServiceTextAd2 = (AdGroupAdServiceTextAd2) o;
    return Objects.equals(this.description2, adGroupAdServiceTextAd2.description2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceTextAd2 {\n");
    
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
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

