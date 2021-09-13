package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupWebpageServiceBid;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupWebpageServiceExcludedType;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupWebpageServiceUserStatus;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupWebpageServiceWebpage;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageオブジェクトは、広告グループに関連付けた配信/除外設定の情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpage object contains information of allowed or excluded settings setup to adgroup.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageオブジェクトは、広告グループに関連付けた配信/除外設定の情報を保持します。</div> <div lang=\"en\">AdGroupWebpage object contains information of allowed or excluded settings setup to adgroup.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupWebpage   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("adGroupTrackId")
  private Long adGroupTrackId = null;

  @JsonProperty("bid")
  private AdGroupWebpageServiceBid bid = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignTrackId")
  private Long campaignTrackId = null;

  @JsonProperty("excludedType")
  private AdGroupWebpageServiceExcludedType excludedType = null;

  @JsonProperty("userStatus")
  private AdGroupWebpageServiceUserStatus userStatus = null;

  @JsonProperty("webpage")
  private AdGroupWebpageServiceWebpage webpage = null;

  public AdGroupWebpage accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdGroupWebpage adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Ad Group ID.<br>This field is required in any cases.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Ad Group ID.<br>This field is required in any cases.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupWebpage adGroupTrackId(Long adGroupTrackId) {
    this.adGroupTrackId = adGroupTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループトラッキングIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad Group Tracking ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return adGroupTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループトラッキングIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad Group Tracking ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAdGroupTrackId() {
    return adGroupTrackId;
  }

  public void setAdGroupTrackId(Long adGroupTrackId) {
    this.adGroupTrackId = adGroupTrackId;
  }

  public AdGroupWebpage bid(AdGroupWebpageServiceBid bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Get bid
   * @return bid
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupWebpageServiceBid getBid() {
    return bid;
  }

  public void setBid(AdGroupWebpageServiceBid bid) {
    this.bid = bid;
  }

  public AdGroupWebpage campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br>This field is required in any cases.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br>This field is required in any cases.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupWebpage campaignTrackId(Long campaignTrackId) {
    this.campaignTrackId = campaignTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーントラッキングIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign Tracking ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return campaignTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーントラッキングIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign Tracking ID.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getCampaignTrackId() {
    return campaignTrackId;
  }

  public void setCampaignTrackId(Long campaignTrackId) {
    this.campaignTrackId = campaignTrackId;
  }

  public AdGroupWebpage excludedType(AdGroupWebpageServiceExcludedType excludedType) {
    this.excludedType = excludedType;
    return this;
  }

  /**
   * Get excludedType
   * @return excludedType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupWebpageServiceExcludedType getExcludedType() {
    return excludedType;
  }

  public void setExcludedType(AdGroupWebpageServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }

  public AdGroupWebpage userStatus(AdGroupWebpageServiceUserStatus userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupWebpageServiceUserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(AdGroupWebpageServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }

  public AdGroupWebpage webpage(AdGroupWebpageServiceWebpage webpage) {
    this.webpage = webpage;
    return this;
  }

  /**
   * Get webpage
   * @return webpage
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupWebpageServiceWebpage getWebpage() {
    return webpage;
  }

  public void setWebpage(AdGroupWebpageServiceWebpage webpage) {
    this.webpage = webpage;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

