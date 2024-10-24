/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v15.model.ConversionTrackerServiceAppConversionType;
import jp.co.yahoo.adssearchapi.v15.model.ConversionTrackerServiceAppPlatform;
import jp.co.yahoo.adssearchapi.v15.model.ConversionTrackerServiceAppPostbackUrl;
import jp.co.yahoo.adssearchapi.v15.model.ConversionTrackerServiceConversionSource;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceAppConversionオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョン設定を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※ADD時、conversionTrackerTypeがAPP_CONVERSIONの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceAppConversion object describes the App ConversionTracker settings such as App ConversionTag and performance data by  tag.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If the conversionTrackerType is APP_CONVERSION, this field will be required in ADD operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ConversionTrackerServiceAppConversion.JSON_PROPERTY_APP_CONVERSION_TYPE,
  ConversionTrackerServiceAppConversion.JSON_PROPERTY_APP_ID,
  ConversionTrackerServiceAppConversion.JSON_PROPERTY_APP_PLATFORM,
  ConversionTrackerServiceAppConversion.JSON_PROPERTY_APP_POSTBACK_URL,
  ConversionTrackerServiceAppConversion.JSON_PROPERTY_SNIPPET_ID,
  ConversionTrackerServiceAppConversion.JSON_PROPERTY_SNIPPET_LABEL,
  ConversionTrackerServiceAppConversion.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceAppConversion {
  public static final String JSON_PROPERTY_APP_CONVERSION_TYPE = "appConversionType";
  private ConversionTrackerServiceAppConversionType appConversionType;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_APP_PLATFORM = "appPlatform";
  private ConversionTrackerServiceAppPlatform appPlatform;

  public static final String JSON_PROPERTY_APP_POSTBACK_URL = "appPostbackUrl";
  private ConversionTrackerServiceAppPostbackUrl appPostbackUrl;

  public static final String JSON_PROPERTY_SNIPPET_ID = "snippetId";
  private Long snippetId;

  public static final String JSON_PROPERTY_SNIPPET_LABEL = "snippetLabel";
  private String snippetLabel;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private ConversionTrackerServiceConversionSource source;

  public ConversionTrackerServiceAppConversion() {
  }

  public ConversionTrackerServiceAppConversion appConversionType(ConversionTrackerServiceAppConversionType appConversionType) {
    
    this.appConversionType = appConversionType;
    return this;
  }

   /**
   * Get appConversionType
   * @return appConversionType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CONVERSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceAppConversionType getAppConversionType() {
    return appConversionType;
  }


  @JsonProperty(JSON_PROPERTY_APP_CONVERSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppConversionType(ConversionTrackerServiceAppConversionType appConversionType) {
    this.appConversionType = appConversionType;
  }


  public ConversionTrackerServiceAppConversion appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリケーションIDです。&lt;br&gt; このフィールドは、ADD時に省略可能となり、SET時は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Application ID.&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET operation.&lt;/div&gt; 
   * @return appId
  **/
  @jakarta.annotation.Nullable
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


  public ConversionTrackerServiceAppConversion appPlatform(ConversionTrackerServiceAppPlatform appPlatform) {
    
    this.appPlatform = appPlatform;
    return this;
  }

   /**
   * Get appPlatform
   * @return appPlatform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceAppPlatform getAppPlatform() {
    return appPlatform;
  }


  @JsonProperty(JSON_PROPERTY_APP_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppPlatform(ConversionTrackerServiceAppPlatform appPlatform) {
    this.appPlatform = appPlatform;
  }


  public ConversionTrackerServiceAppConversion appPostbackUrl(ConversionTrackerServiceAppPostbackUrl appPostbackUrl) {
    
    this.appPostbackUrl = appPostbackUrl;
    return this;
  }

   /**
   * Get appPostbackUrl
   * @return appPostbackUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_POSTBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceAppPostbackUrl getAppPostbackUrl() {
    return appPostbackUrl;
  }


  @JsonProperty(JSON_PROPERTY_APP_POSTBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppPostbackUrl(ConversionTrackerServiceAppPostbackUrl appPostbackUrl) {
    this.appPostbackUrl = appPostbackUrl;
  }


  public ConversionTrackerServiceAppConversion snippetId(Long snippetId) {
    
    this.snippetId = snippetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョンIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversion ID.&lt;/div&gt; 
   * @return snippetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNIPPET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSnippetId() {
    return snippetId;
  }


  @JsonProperty(JSON_PROPERTY_SNIPPET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnippetId(Long snippetId) {
    this.snippetId = snippetId;
  }


  public ConversionTrackerServiceAppConversion snippetLabel(String snippetLabel) {
    
    this.snippetLabel = snippetLabel;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョントラッカーラベルです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversion tracker label.&lt;/div&gt; 
   * @return snippetLabel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNIPPET_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSnippetLabel() {
    return snippetLabel;
  }


  @JsonProperty(JSON_PROPERTY_SNIPPET_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnippetLabel(String snippetLabel) {
    this.snippetLabel = snippetLabel;
  }


  public ConversionTrackerServiceAppConversion source(ConversionTrackerServiceConversionSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceConversionSource getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(ConversionTrackerServiceConversionSource source) {
    this.source = source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceAppConversion conversionTrackerServiceAppConversion = (ConversionTrackerServiceAppConversion) o;
    return Objects.equals(this.appConversionType, conversionTrackerServiceAppConversion.appConversionType) &&
        Objects.equals(this.appId, conversionTrackerServiceAppConversion.appId) &&
        Objects.equals(this.appPlatform, conversionTrackerServiceAppConversion.appPlatform) &&
        Objects.equals(this.appPostbackUrl, conversionTrackerServiceAppConversion.appPostbackUrl) &&
        Objects.equals(this.snippetId, conversionTrackerServiceAppConversion.snippetId) &&
        Objects.equals(this.snippetLabel, conversionTrackerServiceAppConversion.snippetLabel) &&
        Objects.equals(this.source, conversionTrackerServiceAppConversion.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appConversionType, appId, appPlatform, appPostbackUrl, snippetId, snippetLabel, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceAppConversion {\n");
    sb.append("    appConversionType: ").append(toIndentedString(appConversionType)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appPlatform: ").append(toIndentedString(appPlatform)).append("\n");
    sb.append("    appPostbackUrl: ").append(toIndentedString(appPostbackUrl)).append("\n");
    sb.append("    snippetId: ").append(toIndentedString(snippetId)).append("\n");
    sb.append("    snippetLabel: ").append(toIndentedString(snippetLabel)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

