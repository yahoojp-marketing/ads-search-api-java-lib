package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceAppLinkPlatform;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceAppEventオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceAppConversion object describes the App ConversionTracker information such as App ConversionTag and performance data by  tag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceAppEventオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionTrackerServiceAppConversion object describes the App ConversionTracker information such as App ConversionTag and performance data by  tag.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceAppEvent   {
  @JsonProperty("conversionTrackerTrackId")
  private Long conversionTrackerTrackId = null;

  @JsonProperty("appVendorId")
  private String appVendorId = null;

  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("appLinkPlatform")
  private ConversionTrackerServiceAppLinkPlatform appLinkPlatform = null;

  @JsonProperty("appEventType")
  private String appEventType = null;

  public ConversionTrackerServiceAppEvent conversionTrackerTrackId(Long conversionTrackerTrackId) {
    this.conversionTrackerTrackId = conversionTrackerTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用コンバージョントラッカーIDです。</div> <div lang=\"en\">ConversionTracker ID for tracking.</div> 
   * @return conversionTrackerTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用コンバージョントラッカーIDです。</div> <div lang=\"en\">ConversionTracker ID for tracking.</div> ")


  public Long getConversionTrackerTrackId() {
    return conversionTrackerTrackId;
  }

  public void setConversionTrackerTrackId(Long conversionTrackerTrackId) {
    this.conversionTrackerTrackId = conversionTrackerTrackId;
  }

  public ConversionTrackerServiceAppEvent appVendorId(String appVendorId) {
    this.appVendorId = appVendorId;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダー識別子です。</div> <div lang=\"en\">Application Vendor ID.</div> 
   * @return appVendorId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー識別子です。</div> <div lang=\"en\">Application Vendor ID.</div> ")


  public String getAppVendorId() {
    return appVendorId;
  }

  public void setAppVendorId(String appVendorId) {
    this.appVendorId = appVendorId;
  }

  public ConversionTrackerServiceAppEvent appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリケーションIDです。</div> <div lang=\"en\">Application ID.</div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリケーションIDです。</div> <div lang=\"en\">Application ID.</div> ")


  public String getAppId() {
    return appId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceAppLinkPlatform getAppLinkPlatform() {
    return appLinkPlatform;
  }

  public void setAppLinkPlatform(ConversionTrackerServiceAppLinkPlatform appLinkPlatform) {
    this.appLinkPlatform = appLinkPlatform;
  }

  public ConversionTrackerServiceAppEvent appEventType(String appEventType) {
    this.appEventType = appEventType;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリイベントタイプです。</div> <div lang=\"en\">Application Event Type.</div> 
   * @return appEventType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリイベントタイプです。</div> <div lang=\"en\">Application Event Type.</div> ")


  public String getAppEventType() {
    return appEventType;
  }

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

