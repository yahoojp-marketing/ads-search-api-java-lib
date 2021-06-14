package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceAppConversionType;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceAppPlatform;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceAppPostbackUrl;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceAppConversionオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョントラッカー情報を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※ADD時、conversionTrackerTypeがAPP_CONVERSIONの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceAppConversion object describes the App ConversionTracker information such as App ConversionTag and performance data by  tag.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If the conversionTrackerType is APP_CONVERSION, this field will be required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceAppConversionオブジェクトは、アプリコンバージョン測定タグやタグごとのパフォーマンスデータなどのアプリコンバージョントラッカー情報を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※ADD時、conversionTrackerTypeがAPP_CONVERSIONの場合は必須です。</div> <div lang=\"en\">ConversionTrackerServiceAppConversion object describes the App ConversionTracker information such as App ConversionTag and performance data by  tag.<br> This field is optional in ADD and SET operation.<br> *If the conversionTrackerType is APP_CONVERSION, this field will be required in ADD operation.</div> ")

public class ConversionTrackerServiceAppConversion   {
  @JsonProperty("appConversionType")
  private JsonNullable<ConversionTrackerServiceAppConversionType> appConversionType = JsonNullable.undefined();

  @JsonProperty("appId")
  private JsonNullable<String> appId = JsonNullable.undefined();

  @JsonProperty("appPlatform")
  private JsonNullable<ConversionTrackerServiceAppPlatform> appPlatform = JsonNullable.undefined();

  @JsonProperty("appPostbackUrl")
  private JsonNullable<ConversionTrackerServiceAppPostbackUrl> appPostbackUrl = JsonNullable.undefined();

  @JsonProperty("snippetId")
  private JsonNullable<Long> snippetId = JsonNullable.undefined();

  @JsonProperty("snippetLabel")
  private JsonNullable<String> snippetLabel = JsonNullable.undefined();

  public ConversionTrackerServiceAppConversion appConversionType(ConversionTrackerServiceAppConversionType appConversionType) {
    this.appConversionType = JsonNullable.of(appConversionType);
    return this;
  }

  /**
   * Get appConversionType
   * @return appConversionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceAppConversionType> getAppConversionType() {
    return appConversionType;
  }

  public void setAppConversionType(JsonNullable<ConversionTrackerServiceAppConversionType> appConversionType) {
    this.appConversionType = appConversionType;
  }

  public ConversionTrackerServiceAppConversion appId(String appId) {
    this.appId = JsonNullable.of(appId);
    return this;
  }

  /**
   * <div lang=\"ja\">アプリケーションIDです。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Application ID.<br> This field is optional in any cases.</div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリケーションIDです。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Application ID.<br> This field is optional in any cases.</div> ")


  public JsonNullable<String> getAppId() {
    return appId;
  }

  public void setAppId(JsonNullable<String> appId) {
    this.appId = appId;
  }

  public ConversionTrackerServiceAppConversion appPlatform(ConversionTrackerServiceAppPlatform appPlatform) {
    this.appPlatform = JsonNullable.of(appPlatform);
    return this;
  }

  /**
   * Get appPlatform
   * @return appPlatform
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceAppPlatform> getAppPlatform() {
    return appPlatform;
  }

  public void setAppPlatform(JsonNullable<ConversionTrackerServiceAppPlatform> appPlatform) {
    this.appPlatform = appPlatform;
  }

  public ConversionTrackerServiceAppConversion appPostbackUrl(ConversionTrackerServiceAppPostbackUrl appPostbackUrl) {
    this.appPostbackUrl = JsonNullable.of(appPostbackUrl);
    return this;
  }

  /**
   * Get appPostbackUrl
   * @return appPostbackUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceAppPostbackUrl> getAppPostbackUrl() {
    return appPostbackUrl;
  }

  public void setAppPostbackUrl(JsonNullable<ConversionTrackerServiceAppPostbackUrl> appPostbackUrl) {
    this.appPostbackUrl = appPostbackUrl;
  }

  public ConversionTrackerServiceAppConversion snippetId(Long snippetId) {
    this.snippetId = JsonNullable.of(snippetId);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョンIDです。</div> <div lang=\"en\">Converison ID</div> 
   * @return snippetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョンIDです。</div> <div lang=\"en\">Converison ID</div> ")


  public JsonNullable<Long> getSnippetId() {
    return snippetId;
  }

  public void setSnippetId(JsonNullable<Long> snippetId) {
    this.snippetId = snippetId;
  }

  public ConversionTrackerServiceAppConversion snippetLabel(String snippetLabel) {
    this.snippetLabel = JsonNullable.of(snippetLabel);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョントラッカーラベルです。</div> <div lang=\"en\">Converison tracker label</div> 
   * @return snippetLabel
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーラベルです。</div> <div lang=\"en\">Converison tracker label</div> ")


  public JsonNullable<String> getSnippetLabel() {
    return snippetLabel;
  }

  public void setSnippetLabel(JsonNullable<String> snippetLabel) {
    this.snippetLabel = snippetLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.snippetLabel, conversionTrackerServiceAppConversion.snippetLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appConversionType, appId, appPlatform, appPostbackUrl, snippetId, snippetLabel);
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

