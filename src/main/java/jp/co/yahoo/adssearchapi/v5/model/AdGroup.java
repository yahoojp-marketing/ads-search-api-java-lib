package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceAdGroupAdRotationMode;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceBid;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceCustomParameters;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceLabel;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceSettings;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceUrlReviewData;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroup オブジェクトは、広告グループを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroup object describes ad group information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroup オブジェクトは、広告グループを表します。</div> <div lang=\"en\">AdGroup object describes ad group information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroup   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adGroupAdRotationMode")
  private AdGroupServiceAdGroupAdRotationMode adGroupAdRotationMode = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("adGroupName")
  private String adGroupName = null;

  @JsonProperty("adGroupTrackId")
  private Long adGroupTrackId = null;

  @JsonProperty("bid")
  private AdGroupServiceBid bid = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("campaignTrackId")
  private Long campaignTrackId = null;

  @JsonProperty("customParameters")
  private AdGroupServiceCustomParameters customParameters = null;

  @JsonProperty("labels")
  @Valid
  private List<AdGroupServiceLabel> labels = null;

  @JsonProperty("settings")
  private AdGroupServiceSettings settings = null;

  @JsonProperty("targetRoasOverride")
  private Double targetRoasOverride = null;

  @JsonProperty("targetCpaOverride")
  private Long targetCpaOverride = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  @JsonProperty("urlReviewData")
  private AdGroupServiceUrlReviewData urlReviewData = null;

  @JsonProperty("userStatus")
  private AdGroupServiceUserStatus userStatus = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  public AdGroup accountId(Long accountId) {
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

  public AdGroup adGroupAdRotationMode(AdGroupServiceAdGroupAdRotationMode adGroupAdRotationMode) {
    this.adGroupAdRotationMode = adGroupAdRotationMode;
    return this;
  }

  /**
   * Get adGroupAdRotationMode
   * @return adGroupAdRotationMode
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceAdGroupAdRotationMode getAdGroupAdRotationMode() {
    return adGroupAdRotationMode;
  }

  public void setAdGroupAdRotationMode(AdGroupServiceAdGroupAdRotationMode adGroupAdRotationMode) {
    this.adGroupAdRotationMode = adGroupAdRotationMode;
  }

  public AdGroup adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroup adGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Ad Group name.<br> This field is required in ADD operation, and will be optional in SET operation.</div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Ad Group name.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")


  public String getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }

  public AdGroup adGroupTrackId(Long adGroupTrackId) {
    this.adGroupTrackId = adGroupTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用広告グループIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad Group ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return adGroupTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用広告グループIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad Group ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAdGroupTrackId() {
    return adGroupTrackId;
  }

  public void setAdGroupTrackId(Long adGroupTrackId) {
    this.adGroupTrackId = adGroupTrackId;
  }

  public AdGroup bid(AdGroupServiceBid bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Get bid
   * @return bid
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceBid getBid() {
    return bid;
  }

  public void setBid(AdGroupServiceBid bid) {
    this.bid = bid;
  }

  public AdGroup campaignId(Long campaignId) {
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

  public AdGroup campaignName(String campaignName) {
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

  public AdGroup campaignTrackId(Long campaignTrackId) {
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

  public AdGroup customParameters(AdGroupServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceCustomParameters getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(AdGroupServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }

  public AdGroup labels(List<AdGroupServiceLabel> labels) {
    this.labels = labels;
    return this;
  }

  public AdGroup addLabelsItem(AdGroupServiceLabel labelsItem) {
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

  public List<AdGroupServiceLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<AdGroupServiceLabel> labels) {
    this.labels = labels;
  }

  public AdGroup settings(AdGroupServiceSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceSettings getSettings() {
    return settings;
  }

  public void setSettings(AdGroupServiceSettings settings) {
    this.settings = settings;
  }

  public AdGroup targetRoasOverride(Double targetRoasOverride) {
    this.targetRoasOverride = targetRoasOverride;
    return this;
  }

  /**
   * <div lang=\"ja\">広告費用対効果の目標値です。<br> キャンペーンで設定した広告費用対効果の目標値を使用する場合は、0を指定してください。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※キャンペーンのbiddingStrategyTypeが<code>TARGET_ROAS</code>の場合のみ変更可能です。</div> <div lang=\"en\">Target ROAS. <br>  Specify 0 in order to use the Target ROAS specified in the campaign setting. <br>  This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. <br>  *This field can be specified only if biddingStrategyType of campaign is <code>TARGET_ROAS</code>. </div> 
   * @return targetRoasOverride
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告費用対効果の目標値です。<br> キャンペーンで設定した広告費用対効果の目標値を使用する場合は、0を指定してください。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※キャンペーンのbiddingStrategyTypeが<code>TARGET_ROAS</code>の場合のみ変更可能です。</div> <div lang=\"en\">Target ROAS. <br>  Specify 0 in order to use the Target ROAS specified in the campaign setting. <br>  This field is optional in ADD and SET operation, and will be ignored in REMOVE operation. <br>  *This field can be specified only if biddingStrategyType of campaign is <code>TARGET_ROAS</code>. </div> ")


  public Double getTargetRoasOverride() {
    return targetRoasOverride;
  }

  public void setTargetRoasOverride(Double targetRoasOverride) {
    this.targetRoasOverride = targetRoasOverride;
  }

  public AdGroup targetCpaOverride(Long targetCpaOverride) {
    this.targetCpaOverride = targetCpaOverride;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン単価の目標値です。<br> キャンペーンで設定したコンバージョン単価の目標値を使用する場合は、0を指定してください。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※キャンペーンのbiddingStrategyTypeが<code>TARGET_CPA</code>の場合のみ変更可能です。</div> <div lang=\"en\">Target CPA. <br>  Specify 0 in order to use the Target CPA specified in the campaign setting. <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> *This field can be specified only if biddingStrategyType of campaign is <code>TARGET_CPA</code>. </div> 
   * @return targetCpaOverride
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン単価の目標値です。<br> キャンペーンで設定したコンバージョン単価の目標値を使用する場合は、0を指定してください。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※キャンペーンのbiddingStrategyTypeが<code>TARGET_CPA</code>の場合のみ変更可能です。</div> <div lang=\"en\">Target CPA. <br>  Specify 0 in order to use the Target CPA specified in the campaign setting. <br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> *This field can be specified only if biddingStrategyType of campaign is <code>TARGET_CPA</code>. </div> ")


  public Long getTargetCpaOverride() {
    return targetCpaOverride;
  }

  public void setTargetCpaOverride(Long targetCpaOverride) {
    this.targetCpaOverride = targetCpaOverride;
  }

  public AdGroup trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> このフィールドは、省略可能となります。<br> ※キャンペーンがアプリキャンペーンでAndroidの場合、設定はできません。<br> ※SET時、こちらが審査中の場合、編集はできません。また、変更がない場合、審査対象とはなりません。</div> <div lang=\"en\">Tracking URL.<br> This field is optional.<br> *Cannot set for a Mobile App campaign for Android OS.<br> *In SET operation, cannot update it when this field is in editorial review. In addition, if there is no change, it will not to be reviewed.</div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> このフィールドは、省略可能となります。<br> ※キャンペーンがアプリキャンペーンでAndroidの場合、設定はできません。<br> ※SET時、こちらが審査中の場合、編集はできません。また、変更がない場合、審査対象とはなりません。</div> <div lang=\"en\">Tracking URL.<br> This field is optional.<br> *Cannot set for a Mobile App campaign for Android OS.<br> *In SET operation, cannot update it when this field is in editorial review. In addition, if there is no change, it will not to be reviewed.</div> ")


  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public AdGroup urlReviewData(AdGroupServiceUrlReviewData urlReviewData) {
    this.urlReviewData = urlReviewData;
    return this;
  }

  /**
   * Get urlReviewData
   * @return urlReviewData
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceUrlReviewData getUrlReviewData() {
    return urlReviewData;
  }

  public void setUrlReviewData(AdGroupServiceUrlReviewData urlReviewData) {
    this.urlReviewData = urlReviewData;
  }

  public AdGroup userStatus(AdGroupServiceUserStatus userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceUserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(AdGroupServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }

  public AdGroup createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループが作成された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad Group made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループが作成された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Ad Group made.<br>* Format: yyyyMMdd</div> ")


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
    AdGroup adGroup = (AdGroup) o;
    return Objects.equals(this.accountId, adGroup.accountId) &&
        Objects.equals(this.adGroupAdRotationMode, adGroup.adGroupAdRotationMode) &&
        Objects.equals(this.adGroupId, adGroup.adGroupId) &&
        Objects.equals(this.adGroupName, adGroup.adGroupName) &&
        Objects.equals(this.adGroupTrackId, adGroup.adGroupTrackId) &&
        Objects.equals(this.bid, adGroup.bid) &&
        Objects.equals(this.campaignId, adGroup.campaignId) &&
        Objects.equals(this.campaignName, adGroup.campaignName) &&
        Objects.equals(this.campaignTrackId, adGroup.campaignTrackId) &&
        Objects.equals(this.customParameters, adGroup.customParameters) &&
        Objects.equals(this.labels, adGroup.labels) &&
        Objects.equals(this.settings, adGroup.settings) &&
        Objects.equals(this.targetRoasOverride, adGroup.targetRoasOverride) &&
        Objects.equals(this.targetCpaOverride, adGroup.targetCpaOverride) &&
        Objects.equals(this.trackingUrl, adGroup.trackingUrl) &&
        Objects.equals(this.urlReviewData, adGroup.urlReviewData) &&
        Objects.equals(this.userStatus, adGroup.userStatus) &&
        Objects.equals(this.createdDate, adGroup.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupAdRotationMode, adGroupId, adGroupName, adGroupTrackId, bid, campaignId, campaignName, campaignTrackId, customParameters, labels, settings, targetRoasOverride, targetCpaOverride, trackingUrl, urlReviewData, userStatus, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroup {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupAdRotationMode: ").append(toIndentedString(adGroupAdRotationMode)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    adGroupTrackId: ").append(toIndentedString(adGroupTrackId)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignTrackId: ").append(toIndentedString(campaignTrackId)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    targetRoasOverride: ").append(toIndentedString(targetRoasOverride)).append("\n");
    sb.append("    targetCpaOverride: ").append(toIndentedString(targetCpaOverride)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    urlReviewData: ").append(toIndentedString(urlReviewData)).append("\n");
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

