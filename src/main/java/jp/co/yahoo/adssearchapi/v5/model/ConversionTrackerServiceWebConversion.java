package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceMarkupLanguage;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceTrackingCodeType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceWebConversionオブジェクトは、ウェブページのコンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※ADD時、conversionTrackerTypeがWEB_CONVERSIONの場合、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceWebConversion describes ConversionTracker information such as ConversionTag and performance data by tag.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If the conversionTrackerType is WEB_CONVERSION,  this field will be required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceWebConversionオブジェクトは、ウェブページのコンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※ADD時、conversionTrackerTypeがWEB_CONVERSIONの場合、このフィールドは必須となります。</div> <div lang=\"en\">ConversionTrackerServiceWebConversion describes ConversionTracker information such as ConversionTag and performance data by tag.<br> This field is optional in ADD and SET operation.<br> *If the conversionTrackerType is WEB_CONVERSION,  this field will be required in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceWebConversion   {
  @JsonProperty("markupLanguage")
  private ConversionTrackerServiceMarkupLanguage markupLanguage = null;

  @JsonProperty("snippet")
  private String snippet = null;

  @JsonProperty("advancedSnippet")
  private String advancedSnippet = null;

  @JsonProperty("trackingCodeType")
  private ConversionTrackerServiceTrackingCodeType trackingCodeType = null;

  public ConversionTrackerServiceWebConversion markupLanguage(ConversionTrackerServiceMarkupLanguage markupLanguage) {
    this.markupLanguage = markupLanguage;
    return this;
  }

  /**
   * Get markupLanguage
   * @return markupLanguage
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceMarkupLanguage getMarkupLanguage() {
    return markupLanguage;
  }

  public void setMarkupLanguage(ConversionTrackerServiceMarkupLanguage markupLanguage) {
    this.markupLanguage = markupLanguage;
  }

  public ConversionTrackerServiceWebConversion snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングスクリプトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\"> Tracking script.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return snippet
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングスクリプトです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\"> Tracking script.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }

  public ConversionTrackerServiceWebConversion advancedSnippet(String advancedSnippet) {
    this.advancedSnippet = advancedSnippet;
    return this;
  }

  /**
   * <div lang=\"ja\">   リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。<br>   詳細は以下のヘルプを参照してください。<br>   ・<a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=ja&aid=1159\">コンバージョン測定とは</a><br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   The new format of conversion tag avoids the impacts such as changes made to the browser. <br>   See also the help below.<br>   * <a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=en&aid=353\">Conversion Analytics</a><br>   Although this field will be returned in the response, it will be ignored on input. </div> 
   * @return advancedSnippet
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   リニューアル版のコンバージョンタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットです。<br>   詳細は以下のヘルプを参照してください。<br>   ・<a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=ja&aid=1159\">コンバージョン測定とは</a><br>   このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">   The new format of conversion tag avoids the impacts such as changes made to the browser. <br>   See also the help below.<br>   * <a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=en&aid=353\">Conversion Analytics</a><br>   Although this field will be returned in the response, it will be ignored on input. </div> ")


  public String getAdvancedSnippet() {
    return advancedSnippet;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceTrackingCodeType getTrackingCodeType() {
    return trackingCodeType;
  }

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

