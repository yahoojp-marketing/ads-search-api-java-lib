package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceAppStore;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceBiddingStrategy;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceBiddingStrategyFailedReason;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceBudget;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceConversionOptimizerEligibility;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceCustomParameters;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceLabel;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceServingStatus;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceSettings;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceType;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceUrlReviewData;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Campaignオブジェクトは、キャンペーンの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign object describes Campaign information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Campaignオブジェクトは、キャンペーンの情報を表します。</div> <div lang=\"en\">Campaign object describes Campaign information.</div> ")

public class Campaign   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("appId")
  private JsonNullable<String> appId = JsonNullable.undefined();

  @JsonProperty("appStore")
  private JsonNullable<CampaignServiceAppStore> appStore = JsonNullable.undefined();

  @JsonProperty("biddingStrategyConfiguration")
  private JsonNullable<CampaignServiceBiddingStrategy> biddingStrategyConfiguration = JsonNullable.undefined();

  @JsonProperty("biddingStrategyFailedReason")
  private JsonNullable<CampaignServiceBiddingStrategyFailedReason> biddingStrategyFailedReason = JsonNullable.undefined();

  @JsonProperty("budget")
  private JsonNullable<CampaignServiceBudget> budget = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("campaignTrackId")
  private JsonNullable<Long> campaignTrackId = JsonNullable.undefined();

  @JsonProperty("conversionOptimizerEligibility")
  private JsonNullable<CampaignServiceConversionOptimizerEligibility> conversionOptimizerEligibility = JsonNullable.undefined();

  @JsonProperty("customParameters")
  private JsonNullable<CampaignServiceCustomParameters> customParameters = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("failedBiddingStrategyConfiguration")
  private JsonNullable<CampaignServiceBiddingStrategy> failedBiddingStrategyConfiguration = JsonNullable.undefined();

  @JsonProperty("labels")
  @Valid
  private JsonNullable<List<CampaignServiceLabel>> labels = JsonNullable.undefined();

  @JsonProperty("servingStatus")
  private JsonNullable<CampaignServiceServingStatus> servingStatus = JsonNullable.undefined();

  @JsonProperty("settings")
  @Valid
  private JsonNullable<List<CampaignServiceSettings>> settings = JsonNullable.undefined();

  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  @JsonProperty("trackingUrl")
  private JsonNullable<String> trackingUrl = JsonNullable.undefined();

  @JsonProperty("type")
  private JsonNullable<CampaignServiceType> type = JsonNullable.undefined();

  @JsonProperty("urlReviewData")
  private JsonNullable<CampaignServiceUrlReviewData> urlReviewData = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<CampaignServiceUserStatus> userStatus = JsonNullable.undefined();

  @JsonProperty("createdDate")
  private JsonNullable<String> createdDate = JsonNullable.undefined();

  public Campaign accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public Campaign appId(String appId) {
    this.appId = JsonNullable.of(appId);
    return this;
  }

  /**
   * <div lang=\"ja\">アプリID（iOS）またはパッケージ名（Android）です。<br> ※アプリキャンペーンでiOSの場合、入力は数値のみです。<br> ADD時、campaignTypeがSTANDARD、またはDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、無視され、MOBILE_APPの場合、必須となります。</div> <div lang=\"en\">App ID (for iOS) or Package name (for Android).<br> *Input only the numbers for iOS in Mobile App Campaign.<br>  In ADD operation, this field will be ignored when campaignType is 'STANDARD' or 'DYNAMIC_ADS_FOR_SEARCH_SETTING', and is required when campaignType is MOBILE_APP.</div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリID（iOS）またはパッケージ名（Android）です。<br> ※アプリキャンペーンでiOSの場合、入力は数値のみです。<br> ADD時、campaignTypeがSTANDARD、またはDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、無視され、MOBILE_APPの場合、必須となります。</div> <div lang=\"en\">App ID (for iOS) or Package name (for Android).<br> *Input only the numbers for iOS in Mobile App Campaign.<br>  In ADD operation, this field will be ignored when campaignType is 'STANDARD' or 'DYNAMIC_ADS_FOR_SEARCH_SETTING', and is required when campaignType is MOBILE_APP.</div> ")


  public JsonNullable<String> getAppId() {
    return appId;
  }

  public void setAppId(JsonNullable<String> appId) {
    this.appId = appId;
  }

  public Campaign appStore(CampaignServiceAppStore appStore) {
    this.appStore = JsonNullable.of(appStore);
    return this;
  }

  /**
   * Get appStore
   * @return appStore
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceAppStore> getAppStore() {
    return appStore;
  }

  public void setAppStore(JsonNullable<CampaignServiceAppStore> appStore) {
    this.appStore = appStore;
  }

  public Campaign biddingStrategyConfiguration(CampaignServiceBiddingStrategy biddingStrategyConfiguration) {
    this.biddingStrategyConfiguration = JsonNullable.of(biddingStrategyConfiguration);
    return this;
  }

  /**
   * Get biddingStrategyConfiguration
   * @return biddingStrategyConfiguration
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBiddingStrategy> getBiddingStrategyConfiguration() {
    return biddingStrategyConfiguration;
  }

  public void setBiddingStrategyConfiguration(JsonNullable<CampaignServiceBiddingStrategy> biddingStrategyConfiguration) {
    this.biddingStrategyConfiguration = biddingStrategyConfiguration;
  }

  public Campaign biddingStrategyFailedReason(CampaignServiceBiddingStrategyFailedReason biddingStrategyFailedReason) {
    this.biddingStrategyFailedReason = JsonNullable.of(biddingStrategyFailedReason);
    return this;
  }

  /**
   * Get biddingStrategyFailedReason
   * @return biddingStrategyFailedReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBiddingStrategyFailedReason> getBiddingStrategyFailedReason() {
    return biddingStrategyFailedReason;
  }

  public void setBiddingStrategyFailedReason(JsonNullable<CampaignServiceBiddingStrategyFailedReason> biddingStrategyFailedReason) {
    this.biddingStrategyFailedReason = biddingStrategyFailedReason;
  }

  public Campaign budget(CampaignServiceBudget budget) {
    this.budget = JsonNullable.of(budget);
    return this;
  }

  /**
   * Get budget
   * @return budget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBudget> getBudget() {
    return budget;
  }

  public void setBudget(JsonNullable<CampaignServiceBudget> budget) {
    this.budget = budget;
  }

  public Campaign campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> SET時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET and REMOVE operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> SET時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET and REMOVE operation.</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public Campaign campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名です。<br>このフィールドは、ADD時に必須となり、SET時に省略可能となります。<br> ※入力制限：50文字以内です。</div> <div lang=\"en\">Campaign name.<br> *Insert limit: Up to 50 characters.<br>This field is required in ADD operation, and will be optional in SET operation.</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。<br>このフィールドは、ADD時に必須となり、SET時に省略可能となります。<br> ※入力制限：50文字以内です。</div> <div lang=\"en\">Campaign name.<br> *Insert limit: Up to 50 characters.<br>This field is required in ADD operation, and will be optional in SET operation.</div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public Campaign campaignTrackId(Long campaignTrackId) {
    this.campaignTrackId = JsonNullable.of(campaignTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用キャンペーンIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return campaignTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用キャンペーンIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getCampaignTrackId() {
    return campaignTrackId;
  }

  public void setCampaignTrackId(JsonNullable<Long> campaignTrackId) {
    this.campaignTrackId = campaignTrackId;
  }

  public Campaign conversionOptimizerEligibility(CampaignServiceConversionOptimizerEligibility conversionOptimizerEligibility) {
    this.conversionOptimizerEligibility = JsonNullable.of(conversionOptimizerEligibility);
    return this;
  }

  /**
   * Get conversionOptimizerEligibility
   * @return conversionOptimizerEligibility
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceConversionOptimizerEligibility> getConversionOptimizerEligibility() {
    return conversionOptimizerEligibility;
  }

  public void setConversionOptimizerEligibility(JsonNullable<CampaignServiceConversionOptimizerEligibility> conversionOptimizerEligibility) {
    this.conversionOptimizerEligibility = conversionOptimizerEligibility;
  }

  public Campaign customParameters(CampaignServiceCustomParameters customParameters) {
    this.customParameters = JsonNullable.of(customParameters);
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceCustomParameters> getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(JsonNullable<CampaignServiceCustomParameters> customParameters) {
    this.customParameters = customParameters;
  }

  public Campaign endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンの終了日です。<br> ADD時およびSET時、このフィールドは省略可能となります。ADD時のデフォルト設定値は20371231となります。<br> 過去の日付、開始日以前の日付は指定できません。<br>※YYYYMMDD形式です。</div> <div lang=\"en\">End date of Campaign.<br> This field is optional in ADD and SET operation. The default value in ADD operation will be 20371231.<br> *Cannot set the past date and date before the start date.<br> *In YYYYMMDD format.</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンの終了日です。<br> ADD時およびSET時、このフィールドは省略可能となります。ADD時のデフォルト設定値は20371231となります。<br> 過去の日付、開始日以前の日付は指定できません。<br>※YYYYMMDD形式です。</div> <div lang=\"en\">End date of Campaign.<br> This field is optional in ADD and SET operation. The default value in ADD operation will be 20371231.<br> *Cannot set the past date and date before the start date.<br> *In YYYYMMDD format.</div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public Campaign failedBiddingStrategyConfiguration(CampaignServiceBiddingStrategy failedBiddingStrategyConfiguration) {
    this.failedBiddingStrategyConfiguration = JsonNullable.of(failedBiddingStrategyConfiguration);
    return this;
  }

  /**
   * Get failedBiddingStrategyConfiguration
   * @return failedBiddingStrategyConfiguration
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBiddingStrategy> getFailedBiddingStrategyConfiguration() {
    return failedBiddingStrategyConfiguration;
  }

  public void setFailedBiddingStrategyConfiguration(JsonNullable<CampaignServiceBiddingStrategy> failedBiddingStrategyConfiguration) {
    this.failedBiddingStrategyConfiguration = failedBiddingStrategyConfiguration;
  }

  public Campaign labels(List<CampaignServiceLabel> labels) {
    this.labels = JsonNullable.of(labels);
    return this;
  }

  public Campaign addLabelsItem(CampaignServiceLabel labelsItem) {
    if (this.labels == null || !this.labels.isPresent()) {
      this.labels = JsonNullable.of(new ArrayList<>());
    }
    this.labels.get().add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<CampaignServiceLabel>> getLabels() {
    return labels;
  }

  public void setLabels(JsonNullable<List<CampaignServiceLabel>> labels) {
    this.labels = labels;
  }

  public Campaign servingStatus(CampaignServiceServingStatus servingStatus) {
    this.servingStatus = JsonNullable.of(servingStatus);
    return this;
  }

  /**
   * Get servingStatus
   * @return servingStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceServingStatus> getServingStatus() {
    return servingStatus;
  }

  public void setServingStatus(JsonNullable<CampaignServiceServingStatus> servingStatus) {
    this.servingStatus = servingStatus;
  }

  public Campaign settings(List<CampaignServiceSettings> settings) {
    this.settings = JsonNullable.of(settings);
    return this;
  }

  public Campaign addSettingsItem(CampaignServiceSettings settingsItem) {
    if (this.settings == null || !this.settings.isPresent()) {
      this.settings = JsonNullable.of(new ArrayList<>());
    }
    this.settings.get().add(settingsItem);
    return this;
  }

  /**
   * Get settings
   * @return settings
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<CampaignServiceSettings>> getSettings() {
    return settings;
  }

  public void setSettings(JsonNullable<List<CampaignServiceSettings>> settings) {
    this.settings = settings;
  }

  public Campaign startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンの開始日です。<br> ADD時およびSET時、このフィールドは省略可能となります。ADD時のデフォルト設定値は当日日付となります。<br> 過去の日付は指定できません。<br>※配信開始済みのキャンペーンは変更できません。<br> ※YYYYMMDD形式です。</div> <div lang=\"en\">Start date of Campaign.<br> This field is optional in ADD and SET operation. The default value in ADD operation will be Today's date.<br> *Cannot set the past date.<br>*Cannot change the date to the campaign that is already active.<br> *In YYYYMMDD format.</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンの開始日です。<br> ADD時およびSET時、このフィールドは省略可能となります。ADD時のデフォルト設定値は当日日付となります。<br> 過去の日付は指定できません。<br>※配信開始済みのキャンペーンは変更できません。<br> ※YYYYMMDD形式です。</div> <div lang=\"en\">Start date of Campaign.<br> This field is optional in ADD and SET operation. The default value in ADD operation will be Today's date.<br> *Cannot set the past date.<br>*Cannot change the date to the campaign that is already active.<br> *In YYYYMMDD format.</div> ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public Campaign trackingUrl(String trackingUrl) {
    this.trackingUrl = JsonNullable.of(trackingUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADD時およびSET時、このフィールドは省略可能となります。<br> ※アプリキャンペーンがAndroidの場合、設定はできません。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.<br> *Cannot set if Mobile App Campaign is in Android.</div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADD時およびSET時、このフィールドは省略可能となります。<br> ※アプリキャンペーンがAndroidの場合、設定はできません。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.<br> *Cannot set if Mobile App Campaign is in Android.</div> ")


  public JsonNullable<String> getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(JsonNullable<String> trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public Campaign type(CampaignServiceType type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceType> getType() {
    return type;
  }

  public void setType(JsonNullable<CampaignServiceType> type) {
    this.type = type;
  }

  public Campaign urlReviewData(CampaignServiceUrlReviewData urlReviewData) {
    this.urlReviewData = JsonNullable.of(urlReviewData);
    return this;
  }

  /**
   * Get urlReviewData
   * @return urlReviewData
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceUrlReviewData> getUrlReviewData() {
    return urlReviewData;
  }

  public void setUrlReviewData(JsonNullable<CampaignServiceUrlReviewData> urlReviewData) {
    this.urlReviewData = urlReviewData;
  }

  public Campaign userStatus(CampaignServiceUserStatus userStatus) {
    this.userStatus = JsonNullable.of(userStatus);
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceUserStatus> getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(JsonNullable<CampaignServiceUserStatus> userStatus) {
    this.userStatus = userStatus;
  }

  public Campaign createdDate(String createdDate) {
    this.createdDate = JsonNullable.of(createdDate);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンが作成された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Campaign made.<br>* Format: yyyyMMdd</div> 
   * @return createdDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンが作成された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of Campaign made.<br>* Format: yyyyMMdd</div> ")


  public JsonNullable<String> getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(JsonNullable<String> createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.accountId, campaign.accountId) &&
        Objects.equals(this.appId, campaign.appId) &&
        Objects.equals(this.appStore, campaign.appStore) &&
        Objects.equals(this.biddingStrategyConfiguration, campaign.biddingStrategyConfiguration) &&
        Objects.equals(this.biddingStrategyFailedReason, campaign.biddingStrategyFailedReason) &&
        Objects.equals(this.budget, campaign.budget) &&
        Objects.equals(this.campaignId, campaign.campaignId) &&
        Objects.equals(this.campaignName, campaign.campaignName) &&
        Objects.equals(this.campaignTrackId, campaign.campaignTrackId) &&
        Objects.equals(this.conversionOptimizerEligibility, campaign.conversionOptimizerEligibility) &&
        Objects.equals(this.customParameters, campaign.customParameters) &&
        Objects.equals(this.endDate, campaign.endDate) &&
        Objects.equals(this.failedBiddingStrategyConfiguration, campaign.failedBiddingStrategyConfiguration) &&
        Objects.equals(this.labels, campaign.labels) &&
        Objects.equals(this.servingStatus, campaign.servingStatus) &&
        Objects.equals(this.settings, campaign.settings) &&
        Objects.equals(this.startDate, campaign.startDate) &&
        Objects.equals(this.trackingUrl, campaign.trackingUrl) &&
        Objects.equals(this.type, campaign.type) &&
        Objects.equals(this.urlReviewData, campaign.urlReviewData) &&
        Objects.equals(this.userStatus, campaign.userStatus) &&
        Objects.equals(this.createdDate, campaign.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, appId, appStore, biddingStrategyConfiguration, biddingStrategyFailedReason, budget, campaignId, campaignName, campaignTrackId, conversionOptimizerEligibility, customParameters, endDate, failedBiddingStrategyConfiguration, labels, servingStatus, settings, startDate, trackingUrl, type, urlReviewData, userStatus, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appStore: ").append(toIndentedString(appStore)).append("\n");
    sb.append("    biddingStrategyConfiguration: ").append(toIndentedString(biddingStrategyConfiguration)).append("\n");
    sb.append("    biddingStrategyFailedReason: ").append(toIndentedString(biddingStrategyFailedReason)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignTrackId: ").append(toIndentedString(campaignTrackId)).append("\n");
    sb.append("    conversionOptimizerEligibility: ").append(toIndentedString(conversionOptimizerEligibility)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    failedBiddingStrategyConfiguration: ").append(toIndentedString(failedBiddingStrategyConfiguration)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    servingStatus: ").append(toIndentedString(servingStatus)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

