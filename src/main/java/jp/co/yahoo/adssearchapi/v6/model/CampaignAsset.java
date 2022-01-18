package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.CampaignAssetServiceType;
import jp.co.yahoo.adssearchapi.v6.model.CampaignAssetServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignAssetオブジェクトは、キャンペーンとアセット間の設定情報を表します。&lt;br&gt; SETおよびREPLACE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAsset describes configuration information between campaign and assets.&lt;br&gt; This field is required in SET and REPLACE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignAssetオブジェクトは、キャンペーンとアセット間の設定情報を表します。<br> SETおよびREPLACE時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupAsset describes configuration information between campaign and assets.<br> This field is required in SET and REPLACE operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignAsset   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("assetId")
  private Long assetId = null;

  @JsonProperty("type")
  private CampaignAssetServiceType type = null;

  @JsonProperty("userStatus")
  private CampaignAssetServiceUserStatus userStatus = null;

  public CampaignAsset accountId(Long accountId) {
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

  public CampaignAsset campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET operation.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignAsset assetId(Long assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * <div lang=\"ja\">アセットのIDです。<br> SETおよびREPLACE時、このフィールドは必須となります。<br> SET時、このフィールドは更新対象のアセットIDを入力してください。<br> REPLACE時、このフィールドはキャンペーンに設定するアセットIDを入力してください。</div> <div lang=\"en\">Asset ID.<br> This field is required in SET and REPLACE operation.<br> In SET operation, enter the asset ID to be updated.<br> In REPLACE operation, enter the asset ID to be set for the campaign.</div> 
   * @return assetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アセットのIDです。<br> SETおよびREPLACE時、このフィールドは必須となります。<br> SET時、このフィールドは更新対象のアセットIDを入力してください。<br> REPLACE時、このフィールドはキャンペーンに設定するアセットIDを入力してください。</div> <div lang=\"en\">Asset ID.<br> This field is required in SET and REPLACE operation.<br> In SET operation, enter the asset ID to be updated.<br> In REPLACE operation, enter the asset ID to be set for the campaign.</div> ")


  public Long getAssetId() {
    return assetId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignAssetServiceType getType() {
    return type;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignAssetServiceUserStatus getUserStatus() {
    return userStatus;
  }

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

