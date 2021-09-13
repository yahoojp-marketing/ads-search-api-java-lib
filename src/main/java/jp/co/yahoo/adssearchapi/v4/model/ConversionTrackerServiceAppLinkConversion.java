package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceAppLinkPlatform;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceAppLinkConversionオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョントラッカー情報を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceAppConversion object describes the App ConversionTracker information such as App ConversionTag and performance data by tag.&lt;br&gt; This field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceAppLinkConversionオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョントラッカー情報を表します。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">ConversionTrackerServiceAppConversion object describes the App ConversionTracker information such as App ConversionTag and performance data by tag.<br> This field is optional in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceAppLinkConversion   {
  @JsonProperty("appVendorId")
  private String appVendorId = null;

  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("appLinkPlatform")
  private ConversionTrackerServiceAppLinkPlatform appLinkPlatform = null;

  @JsonProperty("appEventType")
  private String appEventType = null;

  @JsonProperty("snippet")
  private String snippet = null;

  @JsonProperty("advancedSnippet")
  private String advancedSnippet = null;

  public ConversionTrackerServiceAppLinkConversion appVendorId(String appVendorId) {
    this.appVendorId = appVendorId;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダー識別子です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Application Vendor ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return appVendorId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー識別子です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Application Vendor ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getAppVendorId() {
    return appVendorId;
  }

  public void setAppVendorId(String appVendorId) {
    this.appVendorId = appVendorId;
  }

  public ConversionTrackerServiceAppLinkConversion appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリケーションIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Application ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリケーションIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Application ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getAppId() {
    return appId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceAppLinkPlatform getAppLinkPlatform() {
    return appLinkPlatform;
  }

  public void setAppLinkPlatform(ConversionTrackerServiceAppLinkPlatform appLinkPlatform) {
    this.appLinkPlatform = appLinkPlatform;
  }

  public ConversionTrackerServiceAppLinkConversion appEventType(String appEventType) {
    this.appEventType = appEventType;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリイベントタイプです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Application Event Type.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return appEventType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリイベントタイプです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Application Event Type.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getAppEventType() {
    return appEventType;
  }

  public void setAppEventType(String appEventType) {
    this.appEventType = appEventType;
  }

  public ConversionTrackerServiceAppLinkConversion snippet(String snippet) {
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

  public ConversionTrackerServiceAppLinkConversion advancedSnippet(String advancedSnippet) {
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
        Objects.equals(this.snippet, conversionTrackerServiceAppLinkConversion.snippet) &&
        Objects.equals(this.advancedSnippet, conversionTrackerServiceAppLinkConversion.advancedSnippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVendorId, appId, appLinkPlatform, appEventType, snippet, advancedSnippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceAppLinkConversion {\n");
    
    sb.append("    appVendorId: ").append(toIndentedString(appVendorId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appLinkPlatform: ").append(toIndentedString(appLinkPlatform)).append("\n");
    sb.append("    appEventType: ").append(toIndentedString(appEventType)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
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

