/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v12.model.ConversionTrackerServiceAppLinkPlatform;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceAppEventオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョン設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceAppConversion object describes the app ConversionTracker settings such as App ConversionTag and performance data by  tag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceAppEventオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョン設定を表します。</div> <div lang=\"en\">ConversionTrackerServiceAppConversion object describes the app ConversionTracker settings such as App ConversionTag and performance data by  tag.</div> ")
@JsonPropertyOrder({
  ConversionTrackerServiceAppEvent.JSON_PROPERTY_CONVERSION_TRACKER_TRACK_ID,
  ConversionTrackerServiceAppEvent.JSON_PROPERTY_APP_VENDOR_ID,
  ConversionTrackerServiceAppEvent.JSON_PROPERTY_APP_ID,
  ConversionTrackerServiceAppEvent.JSON_PROPERTY_APP_LINK_PLATFORM,
  ConversionTrackerServiceAppEvent.JSON_PROPERTY_APP_EVENT_TYPE
})
@JsonTypeName("ConversionTrackerServiceAppEvent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceAppEvent {
  public static final String JSON_PROPERTY_CONVERSION_TRACKER_TRACK_ID = "conversionTrackerTrackId";
  private Long conversionTrackerTrackId;

  public static final String JSON_PROPERTY_APP_VENDOR_ID = "appVendorId";
  private String appVendorId;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_APP_LINK_PLATFORM = "appLinkPlatform";
  private ConversionTrackerServiceAppLinkPlatform appLinkPlatform;

  public static final String JSON_PROPERTY_APP_EVENT_TYPE = "appEventType";
  private String appEventType;

  public ConversionTrackerServiceAppEvent() { 
  }

  public ConversionTrackerServiceAppEvent conversionTrackerTrackId(Long conversionTrackerTrackId) {
    
    this.conversionTrackerTrackId = conversionTrackerTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用コンバージョントラッカーIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker ID for tracking.&lt;/div&gt; 
   * @return conversionTrackerTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用コンバージョントラッカーIDです。</div> <div lang=\"en\">ConversionTracker ID for tracking.</div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionTrackerTrackId() {
    return conversionTrackerTrackId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerTrackId(Long conversionTrackerTrackId) {
    this.conversionTrackerTrackId = conversionTrackerTrackId;
  }


  public ConversionTrackerServiceAppEvent appVendorId(String appVendorId) {
    
    this.appVendorId = appVendorId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ計測ベンダー識別子です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Application vendor ID.&lt;/div&gt; 
   * @return appVendorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー識別子です。</div> <div lang=\"en\">Application vendor ID.</div> ")
  @JsonProperty(JSON_PROPERTY_APP_VENDOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppVendorId() {
    return appVendorId;
  }


  @JsonProperty(JSON_PROPERTY_APP_VENDOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppVendorId(String appVendorId) {
    this.appVendorId = appVendorId;
  }


  public ConversionTrackerServiceAppEvent appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリケーションIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Application ID.&lt;/div&gt; 
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリケーションIDです。</div> <div lang=\"en\">Application ID.</div> ")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(String appId) {
    this.appId = appId;
  }


  public ConversionTrackerServiceAppEvent appLinkPlatform(ConversionTrackerServiceAppLinkPlatform appLinkPlatform) {
    
    this.appLinkPlatform = appLinkPlatform;
    return this;
  }

   /**
   * Get appLinkPlatform
   * @return appLinkPlatform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_LINK_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceAppLinkPlatform getAppLinkPlatform() {
    return appLinkPlatform;
  }


  @JsonProperty(JSON_PROPERTY_APP_LINK_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppLinkPlatform(ConversionTrackerServiceAppLinkPlatform appLinkPlatform) {
    this.appLinkPlatform = appLinkPlatform;
  }


  public ConversionTrackerServiceAppEvent appEventType(String appEventType) {
    
    this.appEventType = appEventType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリイベントタイプです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Application event type.&lt;/div&gt; 
   * @return appEventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリイベントタイプです。</div> <div lang=\"en\">Application event type.</div> ")
  @JsonProperty(JSON_PROPERTY_APP_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppEventType() {
    return appEventType;
  }


  @JsonProperty(JSON_PROPERTY_APP_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppEventType(String appEventType) {
    this.appEventType = appEventType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceAppEvent conversionTrackerServiceAppEvent = (ConversionTrackerServiceAppEvent) o;
    return Objects.equals(this.conversionTrackerTrackId, conversionTrackerServiceAppEvent.conversionTrackerTrackId) &&
        Objects.equals(this.appVendorId, conversionTrackerServiceAppEvent.appVendorId) &&
        Objects.equals(this.appId, conversionTrackerServiceAppEvent.appId) &&
        Objects.equals(this.appLinkPlatform, conversionTrackerServiceAppEvent.appLinkPlatform) &&
        Objects.equals(this.appEventType, conversionTrackerServiceAppEvent.appEventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionTrackerTrackId, appVendorId, appId, appLinkPlatform, appEventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceAppEvent {\n");
    sb.append("    conversionTrackerTrackId: ").append(toIndentedString(conversionTrackerTrackId)).append("\n");
    sb.append("    appVendorId: ").append(toIndentedString(appVendorId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appLinkPlatform: ").append(toIndentedString(appLinkPlatform)).append("\n");
    sb.append("    appEventType: ").append(toIndentedString(appEventType)).append("\n");
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

