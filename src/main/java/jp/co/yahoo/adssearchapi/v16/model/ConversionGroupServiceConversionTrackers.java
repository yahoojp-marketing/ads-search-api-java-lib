/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionGroupServiceConversionTrackersオブジェクトは、コンバージョン測定タグのコンバージョン設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionGroupServiceConversionTrackers object shows ConversionTracker settings such as ConversionTag.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ConversionGroupServiceConversionTrackers.JSON_PROPERTY_CONVERSION_TRACKER_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionGroupServiceConversionTrackers {
  public static final String JSON_PROPERTY_CONVERSION_TRACKER_ID = "conversionTrackerId";
  private Long conversionTrackerId;

  public ConversionGroupServiceConversionTrackers() {
  }

  public ConversionGroupServiceConversionTrackers conversionTrackerId(Long conversionTrackerId) {
    
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; コンバージョントラッカーIDです。&lt;br&gt; ADD、SET時、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Conversion tracker ID.&lt;br&gt; This field is required in ADD and SET operation. &lt;/div&gt; 
   * @return conversionTrackerId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionTrackerId() {
    return conversionTrackerId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionGroupServiceConversionTrackers conversionGroupServiceConversionTrackers = (ConversionGroupServiceConversionTrackers) o;
    return Objects.equals(this.conversionTrackerId, conversionGroupServiceConversionTrackers.conversionTrackerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionTrackerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionGroupServiceConversionTrackers {\n");
    sb.append("    conversionTrackerId: ").append(toIndentedString(conversionTrackerId)).append("\n");
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

