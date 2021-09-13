package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupAdServiceAd;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupAdServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupAdServiceLabel;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupAdServiceTrademarkStatus;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupAdServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdオブジェクトは、広告に関する操作を行うための情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAd object describes information for operations on ads.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdオブジェクトは、広告に関する操作を行うための情報を表します。</div> <div lang=\"en\">AdGroupAd object describes information for operations on ads.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAd   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("ad")
  private AdGroupAdServiceAd ad = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("adGroupName")
  private String adGroupName = null;

  @JsonProperty("adGroupTrackId")
  private Long adGroupTrackId = null;

  @JsonProperty("adId")
  private Long adId = null;

  @JsonProperty("adName")
  private String adName = null;

  @JsonProperty("adTrackId")
  private Long adTrackId = null;

  @JsonProperty("approvalStatus")
  private AdGroupAdServiceApprovalStatus approvalStatus = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("campaignTrackId")
  private Long campaignTrackId = null;

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  @JsonProperty("feedId")
  private Long feedId = null;

  @JsonProperty("invalidedTrademarks")
  @Valid
  private List<String> invalidedTrademarks = null;

  @JsonProperty("labels")
  @Valid
  private List<AdGroupAdServiceLabel> labels = null;

  @JsonProperty("trademarkStatus")
  private AdGroupAdServiceTrademarkStatus trademarkStatus = null;

  @JsonProperty("userStatus")
  private AdGroupAdServiceUserStatus userStatus = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  public AdGroupAd accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdGroupAd ad(AdGroupAdServiceAd ad) {
    this.ad = ad;
    return this;
  }

  /**
   * Get ad
   * @return ad
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceAd getAd() {
    return ad;
  }

  public void setAd(AdGroupAdServiceAd ad) {
    this.ad = ad;
  }

  public AdGroupAd adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupAd adGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad group name.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad group name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }

  public AdGroupAd adGroupTrackId(Long adGroupTrackId) {
    this.adGroupTrackId = adGroupTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用広告グループIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad group ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return adGroupTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用広告グループIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad group ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAdGroupTrackId() {
    return adGroupTrackId;
  }

  public void setAdGroupTrackId(Long adGroupTrackId) {
    this.adGroupTrackId = adGroupTrackId;
  }

  public AdGroupAd adId(Long adId) {
    this.adId = adId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告IDです。<br> SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Ad ID.<br> This field is required in SET and REMOVE operation.</div> 
   * @return adId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告IDです。<br> SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Ad ID.<br> This field is required in SET and REMOVE operation.</div> ")


  public Long getAdId() {
    return adId;
  }

  public void setAdId(Long adId) {
    this.adId = adId;
  }

  public AdGroupAd adName(String adName) {
    this.adName = adName;
    return this;
  }

  /**
   * <div lang=\"ja\">広告名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Ad name.<br> This field is required in ADD operation, and will be optional in SET operation.</div> 
   * @return adName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Ad name.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")


  public String getAdName() {
    return adName;
  }

  public void setAdName(String adName) {
    this.adName = adName;
  }

  public AdGroupAd adTrackId(Long adTrackId) {
    this.adTrackId = adTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用広告IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return adTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用広告IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAdTrackId() {
    return adTrackId;
  }

  public void setAdTrackId(Long adTrackId) {
    this.adTrackId = adTrackId;
  }

  public AdGroupAd approvalStatus(AdGroupAdServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(AdGroupAdServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AdGroupAd campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupAd campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public AdGroupAd campaignTrackId(Long campaignTrackId) {
    this.campaignTrackId = campaignTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用キャンペーンIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return campaignTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用キャンペーンIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getCampaignTrackId() {
    return campaignTrackId;
  }

  public void setCampaignTrackId(Long campaignTrackId) {
    this.campaignTrackId = campaignTrackId;
  }

  public AdGroupAd disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AdGroupAd addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認の理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Code of Disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details) <br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認の理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Code of Disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details) <br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public AdGroupAd feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * <div lang=\"ja\">フィードIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Feed ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Feed ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public AdGroupAd invalidedTrademarks(List<String> invalidedTrademarks) {
    this.invalidedTrademarks = invalidedTrademarks;
    return this;
  }

  public AdGroupAd addInvalidedTrademarksItem(String invalidedTrademarksItem) {
    if (this.invalidedTrademarks == null) {
      this.invalidedTrademarks = new ArrayList<>();
    }
    this.invalidedTrademarks.add(invalidedTrademarksItem);
    return this;
  }

  /**
   * <div lang=\"ja\">制限された商標です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Invalided trademarks.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return invalidedTrademarks
  */
  @ApiModelProperty(value = "<div lang=\"ja\">制限された商標です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Invalided trademarks.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public List<String> getInvalidedTrademarks() {
    return invalidedTrademarks;
  }

  public void setInvalidedTrademarks(List<String> invalidedTrademarks) {
    this.invalidedTrademarks = invalidedTrademarks;
  }

  public AdGroupAd labels(List<AdGroupAdServiceLabel> labels) {
    this.labels = labels;
    return this;
  }

  public AdGroupAd addLabelsItem(AdGroupAdServiceLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupAdServiceLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<AdGroupAdServiceLabel> labels) {
    this.labels = labels;
  }

  public AdGroupAd trademarkStatus(AdGroupAdServiceTrademarkStatus trademarkStatus) {
    this.trademarkStatus = trademarkStatus;
    return this;
  }

  /**
   * Get trademarkStatus
   * @return trademarkStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceTrademarkStatus getTrademarkStatus() {
    return trademarkStatus;
  }

  public void setTrademarkStatus(AdGroupAdServiceTrademarkStatus trademarkStatus) {
    this.trademarkStatus = trademarkStatus;
  }

  public AdGroupAd userStatus(AdGroupAdServiceUserStatus userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceUserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(AdGroupAdServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }

  public AdGroupAd createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * <div lang=\"ja\">広告が作成された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告が作成された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad made.<br>* Format: yyyyMMdd</div> ")


  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAd adGroupAd = (AdGroupAd) o;
    return Objects.equals(this.accountId, adGroupAd.accountId) &&
        Objects.equals(this.ad, adGroupAd.ad) &&
        Objects.equals(this.adGroupId, adGroupAd.adGroupId) &&
        Objects.equals(this.adGroupName, adGroupAd.adGroupName) &&
        Objects.equals(this.adGroupTrackId, adGroupAd.adGroupTrackId) &&
        Objects.equals(this.adId, adGroupAd.adId) &&
        Objects.equals(this.adName, adGroupAd.adName) &&
        Objects.equals(this.adTrackId, adGroupAd.adTrackId) &&
        Objects.equals(this.approvalStatus, adGroupAd.approvalStatus) &&
        Objects.equals(this.campaignId, adGroupAd.campaignId) &&
        Objects.equals(this.campaignName, adGroupAd.campaignName) &&
        Objects.equals(this.campaignTrackId, adGroupAd.campaignTrackId) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupAd.disapprovalReasonCodes) &&
        Objects.equals(this.feedId, adGroupAd.feedId) &&
        Objects.equals(this.invalidedTrademarks, adGroupAd.invalidedTrademarks) &&
        Objects.equals(this.labels, adGroupAd.labels) &&
        Objects.equals(this.trademarkStatus, adGroupAd.trademarkStatus) &&
        Objects.equals(this.userStatus, adGroupAd.userStatus) &&
        Objects.equals(this.createdDate, adGroupAd.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, ad, adGroupId, adGroupName, adGroupTrackId, adId, adName, adTrackId, approvalStatus, campaignId, campaignName, campaignTrackId, disapprovalReasonCodes, feedId, invalidedTrademarks, labels, trademarkStatus, userStatus, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAd {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    adGroupTrackId: ").append(toIndentedString(adGroupTrackId)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    adTrackId: ").append(toIndentedString(adTrackId)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignTrackId: ").append(toIndentedString(campaignTrackId)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    invalidedTrademarks: ").append(toIndentedString(invalidedTrademarks)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    trademarkStatus: ").append(toIndentedString(trademarkStatus)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

