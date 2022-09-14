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
import jp.co.yahoo.adssearchapi.v9.model.AdGroupAssetServiceType;
import jp.co.yahoo.adssearchapi.v9.model.AdGroupAssetServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAssetオブジェクトは、広告グループとアセット間の設定情報を表します。&lt;br&gt; SETおよびREPLACE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAsset describes configuration information between ad groups and assets.&lt;br&gt; This field is required in SET and REPLACE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAssetオブジェクトは、広告グループとアセット間の設定情報を表します。<br> SETおよびREPLACE時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupAsset describes configuration information between ad groups and assets.<br> This field is required in SET and REPLACE operation.</div> ")
@JsonPropertyOrder({
  AdGroupAsset.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupAsset.JSON_PROPERTY_AD_GROUP_ID,
  AdGroupAsset.JSON_PROPERTY_CAMPAIGN_ID,
  AdGroupAsset.JSON_PROPERTY_ASSET_ID,
  AdGroupAsset.JSON_PROPERTY_TYPE,
  AdGroupAsset.JSON_PROPERTY_USER_STATUS
})
@JsonTypeName("AdGroupAsset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAsset {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_ASSET_ID = "assetId";
  private Long assetId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AdGroupAssetServiceType type;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private AdGroupAssetServiceUserStatus userStatus;

  public AdGroupAsset() { 
  }

  public AdGroupAsset accountId(Long accountId) {
    
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


  public AdGroupAsset adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループIDです。&lt;br&gt; SET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupId() {
    return adGroupId;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }


  public AdGroupAsset campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; SET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public AdGroupAsset assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アセットのIDです。&lt;br&gt; SETおよびREPLACE時、このフィールドは必須となります。&lt;br&gt; SET時、このフィールドは更新対象のアセットIDを入力してください。&lt;br&gt; REPLACE時、このフィールドは広告グループに設定するアセットIDを入力してください。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Asset ID.&lt;br&gt; This field is required in SET and REPLACE operation.&lt;br&gt; In SET operation, enter the asset ID to be updated.&lt;br&gt; In REPLACE operation, enter the asset ID to be set for the ad group.&lt;/div&gt; 
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アセットのIDです。<br> SETおよびREPLACE時、このフィールドは必須となります。<br> SET時、このフィールドは更新対象のアセットIDを入力してください。<br> REPLACE時、このフィールドは広告グループに設定するアセットIDを入力してください。</div> <div lang=\"en\">Asset ID.<br> This field is required in SET and REPLACE operation.<br> In SET operation, enter the asset ID to be updated.<br> In REPLACE operation, enter the asset ID to be set for the ad group.</div> ")
  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAssetId() {
    return assetId;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public AdGroupAsset type(AdGroupAssetServiceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAssetServiceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(AdGroupAssetServiceType type) {
    this.type = type;
  }


  public AdGroupAsset userStatus(AdGroupAssetServiceUserStatus userStatus) {
    
    this.userStatus = userStatus;
    return this;
  }

   /**
   * Get userStatus
   * @return userStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAssetServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(AdGroupAssetServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAsset adGroupAsset = (AdGroupAsset) o;
    return Objects.equals(this.accountId, adGroupAsset.accountId) &&
        Objects.equals(this.adGroupId, adGroupAsset.adGroupId) &&
        Objects.equals(this.campaignId, adGroupAsset.campaignId) &&
        Objects.equals(this.assetId, adGroupAsset.assetId) &&
        Objects.equals(this.type, adGroupAsset.type) &&
        Objects.equals(this.userStatus, adGroupAsset.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, campaignId, assetId, type, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAsset {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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

