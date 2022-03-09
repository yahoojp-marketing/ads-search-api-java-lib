/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.CampaignAssetServiceType;
import jp.co.yahoo.adssearchapi.v6.model.CampaignAssetServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignAssetオブジェクトは、キャンペーンとアセット間の設定情報を表します。&lt;br&gt; SETおよびREPLACE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAsset describes configuration information between campaign and assets.&lt;br&gt; This field is required in SET and REPLACE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignAssetオブジェクトは、キャンペーンとアセット間の設定情報を表します。<br> SETおよびREPLACE時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupAsset describes configuration information between campaign and assets.<br> This field is required in SET and REPLACE operation.</div> ")
@JsonPropertyOrder({
  CampaignAsset.JSON_PROPERTY_ACCOUNT_ID,
  CampaignAsset.JSON_PROPERTY_CAMPAIGN_ID,
  CampaignAsset.JSON_PROPERTY_ASSET_ID,
  CampaignAsset.JSON_PROPERTY_TYPE,
  CampaignAsset.JSON_PROPERTY_USER_STATUS
})
@JsonTypeName("CampaignAsset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignAsset {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_ASSET_ID = "assetId";
  private Long assetId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CampaignAssetServiceType type;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private CampaignAssetServiceUserStatus userStatus;

  public CampaignAsset() { 
  }

  public CampaignAsset accountId(Long accountId) {
    
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


  public CampaignAsset campaignId(Long campaignId) {
    
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


  public CampaignAsset assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アセットのIDです。&lt;br&gt; SETおよびREPLACE時、このフィールドは必須となります。&lt;br&gt; SET時、このフィールドは更新対象のアセットIDを入力してください。&lt;br&gt; REPLACE時、このフィールドはキャンペーンに設定するアセットIDを入力してください。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Asset ID.&lt;br&gt; This field is required in SET and REPLACE operation.&lt;br&gt; In SET operation, enter the asset ID to be updated.&lt;br&gt; In REPLACE operation, enter the asset ID to be set for the campaign.&lt;/div&gt; 
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アセットのIDです。<br> SETおよびREPLACE時、このフィールドは必須となります。<br> SET時、このフィールドは更新対象のアセットIDを入力してください。<br> REPLACE時、このフィールドはキャンペーンに設定するアセットIDを入力してください。</div> <div lang=\"en\">Asset ID.<br> This field is required in SET and REPLACE operation.<br> In SET operation, enter the asset ID to be updated.<br> In REPLACE operation, enter the asset ID to be set for the campaign.</div> ")
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


  public CampaignAsset type(CampaignAssetServiceType type) {
    
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

  public CampaignAssetServiceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(CampaignAssetServiceType type) {
    this.type = type;
  }


  public CampaignAsset userStatus(CampaignAssetServiceUserStatus userStatus) {
    
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

  public CampaignAssetServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(CampaignAssetServiceUserStatus userStatus) {
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
    CampaignAsset campaignAsset = (CampaignAsset) o;
    return Objects.equals(this.accountId, campaignAsset.accountId) &&
        Objects.equals(this.campaignId, campaignAsset.campaignId) &&
        Objects.equals(this.assetId, campaignAsset.assetId) &&
        Objects.equals(this.type, campaignAsset.type) &&
        Objects.equals(this.userStatus, campaignAsset.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, assetId, type, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAsset {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
