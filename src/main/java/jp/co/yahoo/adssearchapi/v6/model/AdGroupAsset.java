package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupAssetServiceType;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupAssetServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAssetオブジェクトは、広告グループとアセット間の設定情報を表します。&lt;br&gt; SETおよびREPLACE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAsset describes configuration information between ad groups and assets.&lt;br&gt; This field is required in SET and REPLACE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAssetオブジェクトは、広告グループとアセット間の設定情報を表します。<br> SETおよびREPLACE時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupAsset describes configuration information between ad groups and assets.<br> This field is required in SET and REPLACE operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAsset   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("assetId")
  private Long assetId = null;

  @JsonProperty("type")
  private AdGroupAssetServiceType type = null;

  @JsonProperty("userStatus")
  private AdGroupAssetServiceUserStatus userStatus = null;

  public AdGroupAsset accountId(Long accountId) {
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

  public AdGroupAsset adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in SET operation.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in SET operation.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupAsset campaignId(Long campaignId) {
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

  public AdGroupAsset assetId(Long assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * <div lang=\"ja\">アセットのIDです。<br> SETおよびREPLACE時、このフィールドは必須となります。<br> SET時、このフィールドは更新対象のアセットIDを入力してください。<br> REPLACE時、このフィールドは広告グループに設定するアセットIDを入力してください。</div> <div lang=\"en\">Asset ID.<br> This field is required in SET and REPLACE operation.<br> In SET operation, enter the asset ID to be updated.<br> In REPLACE operation, enter the asset ID to be set for the ad group.</div> 
   * @return assetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アセットのIDです。<br> SETおよびREPLACE時、このフィールドは必須となります。<br> SET時、このフィールドは更新対象のアセットIDを入力してください。<br> REPLACE時、このフィールドは広告グループに設定するアセットIDを入力してください。</div> <div lang=\"en\">Asset ID.<br> This field is required in SET and REPLACE operation.<br> In SET operation, enter the asset ID to be updated.<br> In REPLACE operation, enter the asset ID to be set for the ad group.</div> ")


  public Long getAssetId() {
    return assetId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAssetServiceType getType() {
    return type;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAssetServiceUserStatus getUserStatus() {
    return userStatus;
  }

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

