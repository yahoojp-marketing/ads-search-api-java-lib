package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupWebpageServiceBid;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupWebpageServiceExcludedType;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupWebpageServiceUserStatus;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupWebpageServiceWebpage;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageオブジェクトは、広告グループに関連付けた配信/除外設定の情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpage object contains information of allowed or excluded settings setup to adgroup.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageオブジェクトは、広告グループに関連付けた配信/除外設定の情報を保持します。</div> <div lang=\"en\">AdGroupWebpage object contains information of allowed or excluded settings setup to adgroup.</div> ")

public class AdGroupWebpage   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("adGroupTrackId")
  private JsonNullable<Long> adGroupTrackId = JsonNullable.undefined();

  @JsonProperty("bid")
  private JsonNullable<AdGroupWebpageServiceBid> bid = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignTrackId")
  private JsonNullable<Long> campaignTrackId = JsonNullable.undefined();

  @JsonProperty("excludedType")
  private JsonNullable<AdGroupWebpageServiceExcludedType> excludedType = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<AdGroupWebpageServiceUserStatus> userStatus = JsonNullable.undefined();

  @JsonProperty("webpage")
  private JsonNullable<AdGroupWebpageServiceWebpage> webpage = JsonNullable.undefined();

  public AdGroupWebpage accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public AdGroupWebpage adGroupId(Long adGroupId) {
    this.adGroupId = JsonNullable.of(adGroupId);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Ad Group ID.<br>This field is required in any cases.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Ad Group ID.<br>This field is required in any cases.</div> ")


  public JsonNullable<Long> getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(JsonNullable<Long> adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupWebpage adGroupTrackId(Long adGroupTrackId) {
    this.adGroupTrackId = JsonNullable.of(adGroupTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループトラッキングIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad Group Tracking ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return adGroupTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループトラッキングIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad Group Tracking ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getAdGroupTrackId() {
    return adGroupTrackId;
  }

  public void setAdGroupTrackId(JsonNullable<Long> adGroupTrackId) {
    this.adGroupTrackId = adGroupTrackId;
  }

  public AdGroupWebpage bid(AdGroupWebpageServiceBid bid) {
    this.bid = JsonNullable.of(bid);
    return this;
  }

  /**
   * Get bid
   * @return bid
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupWebpageServiceBid> getBid() {
    return bid;
  }

  public void setBid(JsonNullable<AdGroupWebpageServiceBid> bid) {
    this.bid = bid;
  }

  public AdGroupWebpage campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br>This field is required in any cases.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br>This field is required in any cases.</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupWebpage campaignTrackId(Long campaignTrackId) {
    this.campaignTrackId = JsonNullable.of(campaignTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーントラッキングIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign Tracking ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return campaignTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーントラッキングIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign Tracking ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getCampaignTrackId() {
    return campaignTrackId;
  }

  public void setCampaignTrackId(JsonNullable<Long> campaignTrackId) {
    this.campaignTrackId = campaignTrackId;
  }

  public AdGroupWebpage excludedType(AdGroupWebpageServiceExcludedType excludedType) {
    this.excludedType = JsonNullable.of(excludedType);
    return this;
  }

  /**
   * Get excludedType
   * @return excludedType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupWebpageServiceExcludedType> getExcludedType() {
    return excludedType;
  }

  public void setExcludedType(JsonNullable<AdGroupWebpageServiceExcludedType> excludedType) {
    this.excludedType = excludedType;
  }

  public AdGroupWebpage userStatus(AdGroupWebpageServiceUserStatus userStatus) {
    this.userStatus = JsonNullable.of(userStatus);
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupWebpageServiceUserStatus> getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(JsonNullable<AdGroupWebpageServiceUserStatus> userStatus) {
    this.userStatus = userStatus;
  }

  public AdGroupWebpage webpage(AdGroupWebpageServiceWebpage webpage) {
    this.webpage = JsonNullable.of(webpage);
    return this;
  }

  /**
   * Get webpage
   * @return webpage
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupWebpageServiceWebpage> getWebpage() {
    return webpage;
  }

  public void setWebpage(JsonNullable<AdGroupWebpageServiceWebpage> webpage) {
    this.webpage = webpage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupWebpage adGroupWebpage = (AdGroupWebpage) o;
    return Objects.equals(this.accountId, adGroupWebpage.accountId) &&
        Objects.equals(this.adGroupId, adGroupWebpage.adGroupId) &&
        Objects.equals(this.adGroupTrackId, adGroupWebpage.adGroupTrackId) &&
        Objects.equals(this.bid, adGroupWebpage.bid) &&
        Objects.equals(this.campaignId, adGroupWebpage.campaignId) &&
        Objects.equals(this.campaignTrackId, adGroupWebpage.campaignTrackId) &&
        Objects.equals(this.excludedType, adGroupWebpage.excludedType) &&
        Objects.equals(this.userStatus, adGroupWebpage.userStatus) &&
        Objects.equals(this.webpage, adGroupWebpage.webpage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, adGroupTrackId, bid, campaignId, campaignTrackId, excludedType, userStatus, webpage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpage {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupTrackId: ").append(toIndentedString(adGroupTrackId)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignTrackId: ").append(toIndentedString(campaignTrackId)).append("\n");
    sb.append("    excludedType: ").append(toIndentedString(excludedType)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    webpage: ").append(toIndentedString(webpage)).append("\n");
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

