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
import jp.co.yahoo.adssearchapi.v12.model.AppLinkServiceAppLinkPlatform;
import jp.co.yahoo.adssearchapi.v12.model.AppLinkServiceLinkStatus;
import jp.co.yahoo.adssearchapi.v12.model.AppLinkServiceSyncStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AppLinkオブジェクトは、アプリリンク情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AppLink information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AppLinkオブジェクトは、アプリリンク情報を表します。</div> <div lang=\"en\">AppLink information.</div> ")
@JsonPropertyOrder({
  AppLink.JSON_PROPERTY_ACCOUNT_ID,
  AppLink.JSON_PROPERTY_APP_LINK_ID,
  AppLink.JSON_PROPERTY_APP_VENDOR_ID,
  AppLink.JSON_PROPERTY_APP_VENDOR_NAME_JA,
  AppLink.JSON_PROPERTY_APP_VENDOR_NAME_EN,
  AppLink.JSON_PROPERTY_APP_ID,
  AppLink.JSON_PROPERTY_APP_LINK_PLATFORM,
  AppLink.JSON_PROPERTY_LINK_ID,
  AppLink.JSON_PROPERTY_LINK_STATUS,
  AppLink.JSON_PROPERTY_SYNC_STATUS
})
@JsonTypeName("AppLink")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppLink {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_APP_LINK_ID = "appLinkId";
  private Long appLinkId;

  public static final String JSON_PROPERTY_APP_VENDOR_ID = "appVendorId";
  private String appVendorId;

  public static final String JSON_PROPERTY_APP_VENDOR_NAME_JA = "appVendorNameJa";
  private String appVendorNameJa;

  public static final String JSON_PROPERTY_APP_VENDOR_NAME_EN = "appVendorNameEn";
  private String appVendorNameEn;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_APP_LINK_PLATFORM = "appLinkPlatform";
  private AppLinkServiceAppLinkPlatform appLinkPlatform;

  public static final String JSON_PROPERTY_LINK_ID = "linkId";
  private String linkId;

  public static final String JSON_PROPERTY_LINK_STATUS = "linkStatus";
  private AppLinkServiceLinkStatus linkStatus;

  public static final String JSON_PROPERTY_SYNC_STATUS = "syncStatus";
  private AppLinkServiceSyncStatus syncStatus;

  public AppLink() { 
  }

  public AppLink accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AppLink appLinkId(Long appLinkId) {
    
    this.appLinkId = appLinkId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリリンクIDです。&lt;br&gt; SETまたはREGENERATE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App link ID.&lt;br&gt; This field is required in SET or REGENERATE operation.&lt;/div&gt; 
   * @return appLinkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリリンクIDです。<br> SETまたはREGENERATE時、このフィールドは必須となります。</div> <div lang=\"en\">App link ID.<br> This field is required in SET or REGENERATE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_APP_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAppLinkId() {
    return appLinkId;
  }


  @JsonProperty(JSON_PROPERTY_APP_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppLinkId(Long appLinkId) {
    this.appLinkId = appLinkId;
  }


  public AppLink appVendorId(String appVendorId) {
    
    this.appVendorId = appVendorId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ計測ベンダーIDです。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;br&gt; ※DictionaryService/getAppLinkVendorで取得できるappVendorIdのみ使用できます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App vendor ID.&lt;br&gt; This field is required in ADD operation.&lt;br&gt; *Only the appVendorId that can be obtained with DictionaryService/getAppLinkVendor can be used.&lt;/div&gt; 
   * @return appVendorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダーIDです。<br> ADD時、このフィールドは必須となります。<br> ※DictionaryService/getAppLinkVendorで取得できるappVendorIdのみ使用できます。</div> <div lang=\"en\">App vendor ID.<br> This field is required in ADD operation.<br> *Only the appVendorId that can be obtained with DictionaryService/getAppLinkVendor can be used.</div> ")
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


  public AppLink appVendorNameJa(String appVendorNameJa) {
    
    this.appVendorNameJa = appVendorNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ計測ベンダー名（日本語）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App vendor name in Japanese.&lt;/div&gt; 
   * @return appVendorNameJa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー名（日本語）です。</div> <div lang=\"en\">App vendor name in Japanese.</div> ")
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


  public AppLink appVendorNameEn(String appVendorNameEn) {
    
    this.appVendorNameEn = appVendorNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリ計測ベンダー名（英語）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App vendor name in English.&lt;/div&gt; 
   * @return appVendorNameEn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー名（英語）です。</div> <div lang=\"en\">App vendor name in English.</div> ")
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


  public AppLink appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリIDです。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App ID.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリIDです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">App ID.<br> This field is required in ADD operation.</div> ")
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


  public AppLink appLinkPlatform(AppLinkServiceAppLinkPlatform appLinkPlatform) {
    
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

  public AppLinkServiceAppLinkPlatform getAppLinkPlatform() {
    return appLinkPlatform;
  }


  @JsonProperty(JSON_PROPERTY_APP_LINK_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppLinkPlatform(AppLinkServiceAppLinkPlatform appLinkPlatform) {
    this.appLinkPlatform = appLinkPlatform;
  }


  public AppLink linkId(String linkId) {
    
    this.linkId = linkId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;リンクIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Link ID.&lt;/div&gt; 
   * @return linkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">リンクIDです。</div> <div lang=\"en\">Link ID.</div> ")
  @JsonProperty(JSON_PROPERTY_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkId() {
    return linkId;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }


  public AppLink linkStatus(AppLinkServiceLinkStatus linkStatus) {
    
    this.linkStatus = linkStatus;
    return this;
  }

   /**
   * Get linkStatus
   * @return linkStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppLinkServiceLinkStatus getLinkStatus() {
    return linkStatus;
  }


  @JsonProperty(JSON_PROPERTY_LINK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkStatus(AppLinkServiceLinkStatus linkStatus) {
    this.linkStatus = linkStatus;
  }


  public AppLink syncStatus(AppLinkServiceSyncStatus syncStatus) {
    
    this.syncStatus = syncStatus;
    return this;
  }

   /**
   * Get syncStatus
   * @return syncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYNC_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppLinkServiceSyncStatus getSyncStatus() {
    return syncStatus;
  }


  @JsonProperty(JSON_PROPERTY_SYNC_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyncStatus(AppLinkServiceSyncStatus syncStatus) {
    this.syncStatus = syncStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLink appLink = (AppLink) o;
    return Objects.equals(this.accountId, appLink.accountId) &&
        Objects.equals(this.appLinkId, appLink.appLinkId) &&
        Objects.equals(this.appVendorId, appLink.appVendorId) &&
        Objects.equals(this.appVendorNameJa, appLink.appVendorNameJa) &&
        Objects.equals(this.appVendorNameEn, appLink.appVendorNameEn) &&
        Objects.equals(this.appId, appLink.appId) &&
        Objects.equals(this.appLinkPlatform, appLink.appLinkPlatform) &&
        Objects.equals(this.linkId, appLink.linkId) &&
        Objects.equals(this.linkStatus, appLink.linkStatus) &&
        Objects.equals(this.syncStatus, appLink.syncStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, appLinkId, appVendorId, appVendorNameJa, appVendorNameEn, appId, appLinkPlatform, linkId, linkStatus, syncStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLink {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    appLinkId: ").append(toIndentedString(appLinkId)).append("\n");
    sb.append("    appVendorId: ").append(toIndentedString(appVendorId)).append("\n");
    sb.append("    appVendorNameJa: ").append(toIndentedString(appVendorNameJa)).append("\n");
    sb.append("    appVendorNameEn: ").append(toIndentedString(appVendorNameEn)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appLinkPlatform: ").append(toIndentedString(appLinkPlatform)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
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

