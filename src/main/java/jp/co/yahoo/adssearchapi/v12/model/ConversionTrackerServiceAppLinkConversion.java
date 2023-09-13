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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceAppLinkConversionオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョン設定を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceAppConversion object describes the App ConversionTracker settings such as App ConversionTag and performance data by tag.&lt;br&gt; This field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceAppLinkConversionオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョン設定を表します。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">ConversionTrackerServiceAppConversion object describes the App ConversionTracker settings such as App ConversionTag and performance data by tag.<br> This field is optional in ADD operation.</div> ")
@JsonPropertyOrder({
  ConversionTrackerServiceAppLinkConversion.JSON_PROPERTY_APP_VENDOR_ID,
  ConversionTrackerServiceAppLinkConversion.JSON_PROPERTY_APP_ID,
  ConversionTrackerServiceAppLinkConversion.JSON_PROPERTY_APP_LINK_PLATFORM,
  ConversionTrackerServiceAppLinkConversion.JSON_PROPERTY_APP_EVENT_TYPE,
  ConversionTrackerServiceAppLinkConversion.JSON_PROPERTY_ADVANCED_SNIPPET
})
@JsonTypeName("ConversionTrackerServiceAppLinkConversion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceAppLinkConversion {
  public static final String JSON_PROPERTY_APP_VENDOR_ID = "appVendorId";
  private String appVendorId;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_APP_LINK_PLATFORM = "appLinkPlatform";
  private ConversionTrackerServiceAppLinkPlatform appLinkPlatform;

  public static final String JSON_PROPERTY_APP_EVENT_TYPE = "appEventType";
  private String appEventType;

  public static final String JSON_PROPERTY_ADVANCED_SNIPPET = "advancedSnippet";
  private String advancedSnippet;

  public ConversionTrackerServiceAppLinkConversion() { 
  }

  public ConversionTrackerServiceAppLinkConversion appVendorId(String appVendorId) {
    
    this.appVendorId = appVendorId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ計測ベンダー識別子です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Application vendor ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return appVendorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー識別子です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Application vendor ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
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


  public ConversionTrackerServiceAppLinkConversion appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリケーションIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Application ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリケーションIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Application ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
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


  public ConversionTrackerServiceAppLinkConversion appLinkPlatform(ConversionTrackerServiceAppLinkPlatform appLinkPlatform) {
    
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


  public ConversionTrackerServiceAppLinkConversion appEventType(String appEventType) {
    
    this.appEventType = appEventType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリイベントタイプです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Application event type.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return appEventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリイベントタイプです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Application event type.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
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


  public ConversionTrackerServiceAppLinkConversion advancedSnippet(String advancedSnippet) {
    
    this.advancedSnippet = advancedSnippet;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。&lt;br&gt;   詳細は以下のヘルプを参照してください。&lt;br&gt;   ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000045014?language&#x3D;ja\&quot;&gt;コンバージョン測定とは&lt;/a&gt;&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   The new format of conversion tag avoids the impacts such as changes made to the browser. &lt;br&gt;   See also the help below.&lt;br&gt;   * &lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000045014?language&#x3D;en_US\&quot;&gt;Conversion Analytics&lt;/a&gt;&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return advancedSnippet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">   リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。<br>   詳細は以下のヘルプを参照してください。<br>   ・<a href=\"https://ads-help.yahoo-net.jp/s/article/H000045014?language=ja\">コンバージョン測定とは</a><br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   The new format of conversion tag avoids the impacts such as changes made to the browser. <br>   See also the help below.<br>   * <a href=\"https://ads-help.yahoo-net.jp/s/article/H000045014?language=en_US\">Conversion Analytics</a><br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
  @JsonProperty(JSON_PROPERTY_ADVANCED_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdvancedSnippet() {
    return advancedSnippet;
  }


  @JsonProperty(JSON_PROPERTY_ADVANCED_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdvancedSnippet(String advancedSnippet) {
    this.advancedSnippet = advancedSnippet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceAppLinkConversion conversionTrackerServiceAppLinkConversion = (ConversionTrackerServiceAppLinkConversion) o;
    return Objects.equals(this.appVendorId, conversionTrackerServiceAppLinkConversion.appVendorId) &&
        Objects.equals(this.appId, conversionTrackerServiceAppLinkConversion.appId) &&
        Objects.equals(this.appLinkPlatform, conversionTrackerServiceAppLinkConversion.appLinkPlatform) &&
        Objects.equals(this.appEventType, conversionTrackerServiceAppLinkConversion.appEventType) &&
        Objects.equals(this.advancedSnippet, conversionTrackerServiceAppLinkConversion.advancedSnippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVendorId, appId, appLinkPlatform, appEventType, advancedSnippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceAppLinkConversion {\n");
    sb.append("    appVendorId: ").append(toIndentedString(appVendorId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appLinkPlatform: ").append(toIndentedString(appLinkPlatform)).append("\n");
    sb.append("    appEventType: ").append(toIndentedString(appEventType)).append("\n");
    sb.append("    advancedSnippet: ").append(toIndentedString(advancedSnippet)).append("\n");
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

