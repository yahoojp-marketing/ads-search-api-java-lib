package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AppLinkServiceAppLinkPlatform;
import jp.co.yahoo.adssearchapi.v5.model.AppLinkServiceLinkStatus;
import jp.co.yahoo.adssearchapi.v5.model.AppLinkServiceSyncStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AppLinkオブジェクトは、アプリリンク情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AppLink information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AppLinkオブジェクトは、アプリリンク情報を表します。</div> <div lang=\"en\">AppLink information.</div> ")

public class AppLink   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("appLinkId")
  private JsonNullable<Long> appLinkId = JsonNullable.undefined();

  @JsonProperty("appVendorId")
  private JsonNullable<String> appVendorId = JsonNullable.undefined();

  @JsonProperty("appVendorNameJa")
  private JsonNullable<String> appVendorNameJa = JsonNullable.undefined();

  @JsonProperty("appVendorNameEn")
  private JsonNullable<String> appVendorNameEn = JsonNullable.undefined();

  @JsonProperty("appId")
  private JsonNullable<String> appId = JsonNullable.undefined();

  @JsonProperty("appLinkPlatform")
  private JsonNullable<AppLinkServiceAppLinkPlatform> appLinkPlatform = JsonNullable.undefined();

  @JsonProperty("linkId")
  private JsonNullable<String> linkId = JsonNullable.undefined();

  @JsonProperty("linkStatus")
  private JsonNullable<AppLinkServiceLinkStatus> linkStatus = JsonNullable.undefined();

  @JsonProperty("syncStatus")
  private JsonNullable<AppLinkServiceSyncStatus> syncStatus = JsonNullable.undefined();

  public AppLink accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public AppLink appLinkId(Long appLinkId) {
    this.appLinkId = JsonNullable.of(appLinkId);
    return this;
  }

  /**
   * <div lang=\"ja\">アプリリンクIDです。<br> SETまたはREGENERATE時、このフィールドは必須となります。</div> <div lang=\"en\">App Link ID.<br> This field is required in SET or REGENERATE operation.</div> 
   * @return appLinkId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリリンクIDです。<br> SETまたはREGENERATE時、このフィールドは必須となります。</div> <div lang=\"en\">App Link ID.<br> This field is required in SET or REGENERATE operation.</div> ")


  public JsonNullable<Long> getAppLinkId() {
    return appLinkId;
  }

  public void setAppLinkId(JsonNullable<Long> appLinkId) {
    this.appLinkId = appLinkId;
  }

  public AppLink appVendorId(String appVendorId) {
    this.appVendorId = JsonNullable.of(appVendorId);
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダーIDです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">App Vendor ID.<br> This field is required in ADD operation.</div> 
   * @return appVendorId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダーIDです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">App Vendor ID.<br> This field is required in ADD operation.</div> ")


  public JsonNullable<String> getAppVendorId() {
    return appVendorId;
  }

  public void setAppVendorId(JsonNullable<String> appVendorId) {
    this.appVendorId = appVendorId;
  }

  public AppLink appVendorNameJa(String appVendorNameJa) {
    this.appVendorNameJa = JsonNullable.of(appVendorNameJa);
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダー名（日本語）です。</div> <div lang=\"en\">App Vendor Name in Japanese.</div> 
   * @return appVendorNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー名（日本語）です。</div> <div lang=\"en\">App Vendor Name in Japanese.</div> ")


  public JsonNullable<String> getAppVendorNameJa() {
    return appVendorNameJa;
  }

  public void setAppVendorNameJa(JsonNullable<String> appVendorNameJa) {
    this.appVendorNameJa = appVendorNameJa;
  }

  public AppLink appVendorNameEn(String appVendorNameEn) {
    this.appVendorNameEn = JsonNullable.of(appVendorNameEn);
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダー名（英語）です。</div> <div lang=\"en\">App Vendor Name in English.</div> 
   * @return appVendorNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー名（英語）です。</div> <div lang=\"en\">App Vendor Name in English.</div> ")


  public JsonNullable<String> getAppVendorNameEn() {
    return appVendorNameEn;
  }

  public void setAppVendorNameEn(JsonNullable<String> appVendorNameEn) {
    this.appVendorNameEn = appVendorNameEn;
  }

  public AppLink appId(String appId) {
    this.appId = JsonNullable.of(appId);
    return this;
  }

  /**
   * <div lang=\"ja\">アプリIDです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">App ID.<br> This field is required in ADD operation.</div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリIDです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">App ID.<br> This field is required in ADD operation.</div> ")


  public JsonNullable<String> getAppId() {
    return appId;
  }

  public void setAppId(JsonNullable<String> appId) {
    this.appId = appId;
  }

  public AppLink appLinkPlatform(AppLinkServiceAppLinkPlatform appLinkPlatform) {
    this.appLinkPlatform = JsonNullable.of(appLinkPlatform);
    return this;
  }

  /**
   * Get appLinkPlatform
   * @return appLinkPlatform
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AppLinkServiceAppLinkPlatform> getAppLinkPlatform() {
    return appLinkPlatform;
  }

  public void setAppLinkPlatform(JsonNullable<AppLinkServiceAppLinkPlatform> appLinkPlatform) {
    this.appLinkPlatform = appLinkPlatform;
  }

  public AppLink linkId(String linkId) {
    this.linkId = JsonNullable.of(linkId);
    return this;
  }

  /**
   * <div lang=\"ja\">リンクIDです。</div> <div lang=\"en\">Link ID.</div> 
   * @return linkId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リンクIDです。</div> <div lang=\"en\">Link ID.</div> ")


  public JsonNullable<String> getLinkId() {
    return linkId;
  }

  public void setLinkId(JsonNullable<String> linkId) {
    this.linkId = linkId;
  }

  public AppLink linkStatus(AppLinkServiceLinkStatus linkStatus) {
    this.linkStatus = JsonNullable.of(linkStatus);
    return this;
  }

  /**
   * Get linkStatus
   * @return linkStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AppLinkServiceLinkStatus> getLinkStatus() {
    return linkStatus;
  }

  public void setLinkStatus(JsonNullable<AppLinkServiceLinkStatus> linkStatus) {
    this.linkStatus = linkStatus;
  }

  public AppLink syncStatus(AppLinkServiceSyncStatus syncStatus) {
    this.syncStatus = JsonNullable.of(syncStatus);
    return this;
  }

  /**
   * Get syncStatus
   * @return syncStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AppLinkServiceSyncStatus> getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(JsonNullable<AppLinkServiceSyncStatus> syncStatus) {
    this.syncStatus = syncStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

