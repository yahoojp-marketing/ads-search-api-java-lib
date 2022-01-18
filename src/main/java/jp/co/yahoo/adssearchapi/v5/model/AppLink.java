package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AppLinkServiceAppLinkPlatform;
import jp.co.yahoo.adssearchapi.v5.model.AppLinkServiceLinkStatus;
import jp.co.yahoo.adssearchapi.v5.model.AppLinkServiceSyncStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AppLinkオブジェクトは、アプリリンク情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AppLink information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AppLinkオブジェクトは、アプリリンク情報を表します。</div> <div lang=\"en\">AppLink information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AppLink   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("appLinkId")
  private Long appLinkId = null;

  @JsonProperty("appVendorId")
  private String appVendorId = null;

  @JsonProperty("appVendorNameJa")
  private String appVendorNameJa = null;

  @JsonProperty("appVendorNameEn")
  private String appVendorNameEn = null;

  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("appLinkPlatform")
  private AppLinkServiceAppLinkPlatform appLinkPlatform = null;

  @JsonProperty("linkId")
  private String linkId = null;

  @JsonProperty("linkStatus")
  private AppLinkServiceLinkStatus linkStatus = null;

  @JsonProperty("syncStatus")
  private AppLinkServiceSyncStatus syncStatus = null;

  public AppLink accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AppLink appLinkId(Long appLinkId) {
    this.appLinkId = appLinkId;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリリンクIDです。<br> SETまたはREGENERATE時、このフィールドは必須となります。</div> <div lang=\"en\">App Link ID.<br> This field is required in SET or REGENERATE operation.</div> 
   * @return appLinkId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリリンクIDです。<br> SETまたはREGENERATE時、このフィールドは必須となります。</div> <div lang=\"en\">App Link ID.<br> This field is required in SET or REGENERATE operation.</div> ")


  public Long getAppLinkId() {
    return appLinkId;
  }

  public void setAppLinkId(Long appLinkId) {
    this.appLinkId = appLinkId;
  }

  public AppLink appVendorId(String appVendorId) {
    this.appVendorId = appVendorId;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダーIDです。<br> ADD時、このフィールドは必須となります。<br> ※DictionaryService/getAppLinkVendorで取得できるappVendorIdのみ使用できます。</div> <div lang=\"en\">App Vendor ID.<br> This field is required in ADD operation.<br> *Only the appVendorId that can be obtained with DictionaryService/getAppLinkVendor can be used.</div> 
   * @return appVendorId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダーIDです。<br> ADD時、このフィールドは必須となります。<br> ※DictionaryService/getAppLinkVendorで取得できるappVendorIdのみ使用できます。</div> <div lang=\"en\">App Vendor ID.<br> This field is required in ADD operation.<br> *Only the appVendorId that can be obtained with DictionaryService/getAppLinkVendor can be used.</div> ")


  public String getAppVendorId() {
    return appVendorId;
  }

  public void setAppVendorId(String appVendorId) {
    this.appVendorId = appVendorId;
  }

  public AppLink appVendorNameJa(String appVendorNameJa) {
    this.appVendorNameJa = appVendorNameJa;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダー名（日本語）です。</div> <div lang=\"en\">App Vendor Name in Japanese.</div> 
   * @return appVendorNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー名（日本語）です。</div> <div lang=\"en\">App Vendor Name in Japanese.</div> ")


  public String getAppVendorNameJa() {
    return appVendorNameJa;
  }

  public void setAppVendorNameJa(String appVendorNameJa) {
    this.appVendorNameJa = appVendorNameJa;
  }

  public AppLink appVendorNameEn(String appVendorNameEn) {
    this.appVendorNameEn = appVendorNameEn;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダー名（英語）です。</div> <div lang=\"en\">App Vendor Name in English.</div> 
   * @return appVendorNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー名（英語）です。</div> <div lang=\"en\">App Vendor Name in English.</div> ")


  public String getAppVendorNameEn() {
    return appVendorNameEn;
  }

  public void setAppVendorNameEn(String appVendorNameEn) {
    this.appVendorNameEn = appVendorNameEn;
  }

  public AppLink appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリIDです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">App ID.<br> This field is required in ADD operation.</div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリIDです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">App ID.<br> This field is required in ADD operation.</div> ")


  public String getAppId() {
    return appId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AppLinkServiceAppLinkPlatform getAppLinkPlatform() {
    return appLinkPlatform;
  }

  public void setAppLinkPlatform(AppLinkServiceAppLinkPlatform appLinkPlatform) {
    this.appLinkPlatform = appLinkPlatform;
  }

  public AppLink linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

  /**
   * <div lang=\"ja\">リンクIDです。</div> <div lang=\"en\">Link ID.</div> 
   * @return linkId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リンクIDです。</div> <div lang=\"en\">Link ID.</div> ")


  public String getLinkId() {
    return linkId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AppLinkServiceLinkStatus getLinkStatus() {
    return linkStatus;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AppLinkServiceSyncStatus getSyncStatus() {
    return syncStatus;
  }

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

