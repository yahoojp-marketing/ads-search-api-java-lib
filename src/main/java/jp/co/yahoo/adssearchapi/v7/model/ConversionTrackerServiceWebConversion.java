/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.ConversionTrackerServiceMarkupLanguage;
import jp.co.yahoo.adssearchapi.v7.model.ConversionTrackerServiceTrackingCodeType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceWebConversionオブジェクトは、ウェブページのコンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョン設定を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※ADD時、conversionTrackerTypeがWEB_CONVERSIONの場合、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceWebConversion describes ConversionTracker settings such as ConversionTag and performance data by tag.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If the conversionTrackerType is WEB_CONVERSION,  this field will be required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceWebConversionオブジェクトは、ウェブページのコンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョン設定を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※ADD時、conversionTrackerTypeがWEB_CONVERSIONの場合、このフィールドは必須となります。</div> <div lang=\"en\">ConversionTrackerServiceWebConversion describes ConversionTracker settings such as ConversionTag and performance data by tag.<br> This field is optional in ADD and SET operation.<br> *If the conversionTrackerType is WEB_CONVERSION,  this field will be required in ADD operation.</div> ")
@JsonPropertyOrder({
  ConversionTrackerServiceWebConversion.JSON_PROPERTY_MARKUP_LANGUAGE,
  ConversionTrackerServiceWebConversion.JSON_PROPERTY_SNIPPET,
  ConversionTrackerServiceWebConversion.JSON_PROPERTY_ADVANCED_SNIPPET,
  ConversionTrackerServiceWebConversion.JSON_PROPERTY_TRACKING_CODE_TYPE
})
@JsonTypeName("ConversionTrackerServiceWebConversion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceWebConversion {
  public static final String JSON_PROPERTY_MARKUP_LANGUAGE = "markupLanguage";
  private ConversionTrackerServiceMarkupLanguage markupLanguage;

  public static final String JSON_PROPERTY_SNIPPET = "snippet";
  private String snippet;

  public static final String JSON_PROPERTY_ADVANCED_SNIPPET = "advancedSnippet";
  private String advancedSnippet;

  public static final String JSON_PROPERTY_TRACKING_CODE_TYPE = "trackingCodeType";
  private ConversionTrackerServiceTrackingCodeType trackingCodeType;

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ConversionTrackerServiceWebConversion snippet(String snippet) {
    
    this.snippet = snippet;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングスクリプトです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Tracking script.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return snippet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングスクリプトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\"> Tracking script.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSnippet() {
    return snippet;
  }


  @JsonProperty(JSON_PROPERTY_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  public ConversionTrackerServiceWebConversion advancedSnippet(String advancedSnippet) {
    
    this.advancedSnippet = advancedSnippet;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。&lt;br&gt;   詳細は以下のヘルプを参照してください。&lt;br&gt;   ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan&#x3D;ja&amp;aid&#x3D;1159\&quot;&gt;コンバージョン測定とは&lt;/a&gt;&lt;br&gt;   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   The new format of conversion tag avoids the impacts such as changes made to the browser. &lt;br&gt;   See also the help below.&lt;br&gt;   * &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan&#x3D;en&amp;aid&#x3D;353\&quot;&gt;Conversion Analytics&lt;/a&gt;&lt;br&gt;   Although this field will be returned in the response, it will be ignored on input. &lt;/div&gt; 
   * @return advancedSnippet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">   リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。<br>   詳細は以下のヘルプを参照してください。<br>   ・<a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=ja&aid=1159\">コンバージョン測定とは</a><br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   The new format of conversion tag avoids the impacts such as changes made to the browser. <br>   See also the help below.<br>   * <a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=en&aid=353\">Conversion Analytics</a><br>   Although this field will be returned in the response, it will be ignored on input. </div> ")
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
        Objects.equals(this.snippet, conversionTrackerServiceWebConversion.snippet) &&
        Objects.equals(this.advancedSnippet, conversionTrackerServiceWebConversion.advancedSnippet) &&
        Objects.equals(this.trackingCodeType, conversionTrackerServiceWebConversion.trackingCodeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markupLanguage, snippet, advancedSnippet, trackingCodeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceWebConversion {\n");
    sb.append("    markupLanguage: ").append(toIndentedString(markupLanguage)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    advancedSnippet: ").append(toIndentedString(advancedSnippet)).append("\n");
    sb.append("    trackingCodeType: ").append(toIndentedString(trackingCodeType)).append("\n");
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

