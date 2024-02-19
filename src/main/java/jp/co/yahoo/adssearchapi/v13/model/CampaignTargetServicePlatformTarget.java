/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v13.model.CampaignTargetServicePlatformType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServicePlatformTargetオブジェクトは、デバイス設定を表します。&lt;br&gt; このフィールドは、ADD時およびSET時に省略可能となります。&lt;br&gt; ※TargetTypeがPLATFORMの場合、このフィールドはADD時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServicePlatformTarget object describes device setting.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If targetType is PLATFORM, this field is required in ADD operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignTargetServicePlatformTarget.JSON_PROPERTY_PLATFORM_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignTargetServicePlatformTarget {
  public static final String JSON_PROPERTY_PLATFORM_TYPE = "platformType";
  private CampaignTargetServicePlatformType platformType;

  public CampaignTargetServicePlatformTarget() {
  }

  public CampaignTargetServicePlatformTarget platformType(CampaignTargetServicePlatformType platformType) {
    
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServicePlatformType getPlatformType() {
    return platformType;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformType(CampaignTargetServicePlatformType platformType) {
    this.platformType = platformType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargetServicePlatformTarget campaignTargetServicePlatformTarget = (CampaignTargetServicePlatformTarget) o;
    return Objects.equals(this.platformType, campaignTargetServicePlatformTarget.platformType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServicePlatformTarget {\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
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

