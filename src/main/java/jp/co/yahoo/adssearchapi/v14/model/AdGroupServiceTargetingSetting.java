/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v14.model.AdGroupServiceTargetAll;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceTargetingSettingは、ターゲット設定を保持するオブジェクトです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceTargetingSetting is object that holds target setting.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceTargetingSettingは、ターゲット設定を保持するオブジェクトです。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupServiceTargetingSetting is object that holds target setting.<br> This field is optional in ADD and SET operation.</div> ")
@JsonPropertyOrder({
  AdGroupServiceTargetingSetting.JSON_PROPERTY_TARGET_ALL
})
@JsonTypeName("AdGroupServiceTargetingSetting")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceTargetingSetting {
  public static final String JSON_PROPERTY_TARGET_ALL = "targetAll";
  private AdGroupServiceTargetAll targetAll;

  public AdGroupServiceTargetingSetting() { 
  }

  public AdGroupServiceTargetingSetting targetAll(AdGroupServiceTargetAll targetAll) {
    
    this.targetAll = targetAll;
    return this;
  }

   /**
   * Get targetAll
   * @return targetAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceTargetAll getTargetAll() {
    return targetAll;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetAll(AdGroupServiceTargetAll targetAll) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

