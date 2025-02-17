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
import jp.co.yahoo.adssearchapi.v16.model.ConversionTrackerServiceConversionSource;
import jp.co.yahoo.adssearchapi.v16.model.ConversionTrackerServiceMarkupLanguage;
import jp.co.yahoo.adssearchapi.v16.model.ConversionTrackerServiceTrackingCodeType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceWebConversionオブジェクトは、ウェブページのコンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョン設定を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※ADD時、conversionTrackerTypeがWEB_CONVERSIONの場合、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceWebConversion describes ConversionTracker settings such as ConversionTag and performance data by tag.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If the conversionTrackerType is WEB_CONVERSION,  this field will be required in ADD operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ConversionTrackerServiceWebConversion.JSON_PROPERTY_MARKUP_LANGUAGE,
  ConversionTrackerServiceWebConversion.JSON_PROPERTY_ADVANCED_SNIPPET,
  ConversionTrackerServiceWebConversion.JSON_PROPERTY_TRACKING_CODE_TYPE,
  ConversionTrackerServiceWebConversion.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceWebConversion {
  public static final String JSON_PROPERTY_MARKUP_LANGUAGE = "markupLanguage";
  private ConversionTrackerServiceMarkupLanguage markupLanguage;

  public static final String JSON_PROPERTY_ADVANCED_SNIPPET = "advancedSnippet";
  private String advancedSnippet;

  public static final String JSON_PROPERTY_TRACKING_CODE_TYPE = "trackingCodeType";
  private ConversionTrackerServiceTrackingCodeType trackingCodeType;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private ConversionTrackerServiceConversionSource source;

  public ConversionTrackerServiceWebConversion() {
  }

  public ConversionTrackerServiceWebConversion markupLanguage(ConversionTrackerServiceMarkupLanguage markupLanguage) {
    
    this.markupLanguage = markupLanguage;
    return this;
  }

   /**
   * Get markupLanguage
   * @return markupLanguage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKUP_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceMarkupLanguage getMarkupLanguage() {
    return markupLanguage;
  }


  @JsonProperty(JSON_PROPERTY_MARKUP_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkupLanguage(ConversionTrackerServiceMarkupLanguage markupLanguage) {
    this.markupLanguage = markupLanguage;
  }


  public ConversionTrackerServiceWebConversion advancedSnippet(String advancedSnippet) {
    
    this.advancedSnippet = advancedSnippet;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。&lt;br&gt;   詳細は以下のヘルプを参照してください。&lt;br&gt;   ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000045014?language&#x3D;ja\&quot;&gt;コンバージョン測定とは&lt;/a&gt;&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   The new format of conversion tag avoids the impacts such as changes made to the browser. &lt;br&gt;   See also the help below.&lt;br&gt;   * &lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000045014?language&#x3D;en_US\&quot;&gt;Conversion Analytics&lt;/a&gt;&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return advancedSnippet
  **/
  @jakarta.annotation.Nullable
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


  public ConversionTrackerServiceWebConversion trackingCodeType(ConversionTrackerServiceTrackingCodeType trackingCodeType) {
    
    this.trackingCodeType = trackingCodeType;
    return this;
  }

   /**
   * Get trackingCodeType
   * @return trackingCodeType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING_CODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceTrackingCodeType getTrackingCodeType() {
    return trackingCodeType;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_CODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingCodeType(ConversionTrackerServiceTrackingCodeType trackingCodeType) {
    this.trackingCodeType = trackingCodeType;
  }


  public ConversionTrackerServiceWebConversion source(ConversionTrackerServiceConversionSource source) {
    
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
    ConversionTrackerServiceWebConversion conversionTrackerServiceWebConversion = (ConversionTrackerServiceWebConversion) o;
    return Objects.equals(this.markupLanguage, conversionTrackerServiceWebConversion.markupLanguage) &&
        Objects.equals(this.advancedSnippet, conversionTrackerServiceWebConversion.advancedSnippet) &&
        Objects.equals(this.trackingCodeType, conversionTrackerServiceWebConversion.trackingCodeType) &&
        Objects.equals(this.source, conversionTrackerServiceWebConversion.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markupLanguage, advancedSnippet, trackingCodeType, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceWebConversion {\n");
    sb.append("    markupLanguage: ").append(toIndentedString(markupLanguage)).append("\n");
    sb.append("    advancedSnippet: ").append(toIndentedString(advancedSnippet)).append("\n");
    sb.append("    trackingCodeType: ").append(toIndentedString(trackingCodeType)).append("\n");
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

