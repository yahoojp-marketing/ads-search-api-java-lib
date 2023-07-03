/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v9.model.AdGroupServiceCriterionType;
import jp.co.yahoo.adssearchapi.v9.model.AdGroupServiceTargetingSetting;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceSettingsは、ターゲットタイプを保持するオブジェクトです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceSettings is object that holds target type.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupServiceSettings.JSON_PROPERTY_CRITERION_TYPE,
  AdGroupServiceSettings.JSON_PROPERTY_TARGETING_SETTING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceSettings {
  public static final String JSON_PROPERTY_CRITERION_TYPE = "criterionType";
  private AdGroupServiceCriterionType criterionType;

  public static final String JSON_PROPERTY_TARGETING_SETTING = "targetingSetting";
  private AdGroupServiceTargetingSetting targetingSetting;

  public AdGroupServiceSettings() {
  }

  public AdGroupServiceSettings criterionType(AdGroupServiceCriterionType criterionType) {
    
    this.criterionType = criterionType;
    return this;
  }

   /**
   * Get criterionType
   * @return criterionType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITERION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceCriterionType getCriterionType() {
    return criterionType;
  }


  @JsonProperty(JSON_PROPERTY_CRITERION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceTargetingSetting getTargetingSetting() {
    return targetingSetting;
  }


  @JsonProperty(JSON_PROPERTY_TARGETING_SETTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

