/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceAppLinkVendor オブジェクトは、 アプリ計測ベンダー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceAppLinkVendor object is a container that stores App measurement vendor information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceAppLinkVendor オブジェクトは、 アプリ計測ベンダー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceAppLinkVendor object is a container that stores App measurement vendor information.</div> ")
@JsonPropertyOrder({
  DictionaryServiceAppLinkVendor.JSON_PROPERTY_APP_VENDOR_ID,
  DictionaryServiceAppLinkVendor.JSON_PROPERTY_APP_VENDOR_NAME_JA,
  DictionaryServiceAppLinkVendor.JSON_PROPERTY_APP_VENDOR_NAME_EN
})
@JsonTypeName("DictionaryServiceAppLinkVendor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceAppLinkVendor {
  public static final String JSON_PROPERTY_APP_VENDOR_ID = "appVendorId";
  private String appVendorId;

  public static final String JSON_PROPERTY_APP_VENDOR_NAME_JA = "appVendorNameJa";
  private String appVendorNameJa;

  public static final String JSON_PROPERTY_APP_VENDOR_NAME_EN = "appVendorNameEn";
  private String appVendorNameEn;

  public DictionaryServiceAppLinkVendor() { 
  }

  public DictionaryServiceAppLinkVendor appVendorId(String appVendorId) {
    
    this.appVendorId = appVendorId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ計測ベンダーIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App Vendor ID.&lt;/div&gt; 
   * @return appVendorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダーIDです。</div> <div lang=\"en\">App Vendor ID.</div> ")
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


  public DictionaryServiceAppLinkVendor appVendorNameJa(String appVendorNameJa) {
    
    this.appVendorNameJa = appVendorNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ計測ベンダー名（日本語）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App Vendor Name in Japanese.&lt;/div&gt; 
   * @return appVendorNameJa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー名（日本語）です。</div> <div lang=\"en\">App Vendor Name in Japanese.</div> ")
  @JsonProperty(JSON_PROPERTY_APP_VENDOR_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppVendorNameJa() {
    return appVendorNameJa;
  }


  @JsonProperty(JSON_PROPERTY_APP_VENDOR_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppVendorNameJa(String appVendorNameJa) {
    this.appVendorNameJa = appVendorNameJa;
  }


  public DictionaryServiceAppLinkVendor appVendorNameEn(String appVendorNameEn) {
    
    this.appVendorNameEn = appVendorNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ計測ベンダー名（英語）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App Vendor Name in English.&lt;/div&gt; 
   * @return appVendorNameEn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー名（英語）です。</div> <div lang=\"en\">App Vendor Name in English.</div> ")
  @JsonProperty(JSON_PROPERTY_APP_VENDOR_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppVendorNameEn() {
    return appVendorNameEn;
  }


  @JsonProperty(JSON_PROPERTY_APP_VENDOR_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppVendorNameEn(String appVendorNameEn) {
    this.appVendorNameEn = appVendorNameEn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceAppLinkVendor dictionaryServiceAppLinkVendor = (DictionaryServiceAppLinkVendor) o;
    return Objects.equals(this.appVendorId, dictionaryServiceAppLinkVendor.appVendorId) &&
        Objects.equals(this.appVendorNameJa, dictionaryServiceAppLinkVendor.appVendorNameJa) &&
        Objects.equals(this.appVendorNameEn, dictionaryServiceAppLinkVendor.appVendorNameEn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVendorId, appVendorNameJa, appVendorNameEn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceAppLinkVendor {\n");
    sb.append("    appVendorId: ").append(toIndentedString(appVendorId)).append("\n");
    sb.append("    appVendorNameJa: ").append(toIndentedString(appVendorNameJa)).append("\n");
    sb.append("    appVendorNameEn: ").append(toIndentedString(appVendorNameEn)).append("\n");
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

