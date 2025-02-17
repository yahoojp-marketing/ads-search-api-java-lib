/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupServiceBiddingStrategyConfiguration;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupServiceCustomParameters;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupServiceFrequentlyRunBetterPerformingAdsMode;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupServiceIsRemoveFlg;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupServiceLabel;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupServiceSettings;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupServiceUrlReviewData;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroup オブジェクトは、広告グループを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroup object describes ad group information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroup オブジェクトは、広告グループを表します。</div> <div lang=\"en\">AdGroup object describes ad group information.</div> ")
@JsonPropertyOrder({
  AdGroup.JSON_PROPERTY_ACCOUNT_ID,
  AdGroup.JSON_PROPERTY_BIDDING_STRATEGY_CONFIGURATION,
  AdGroup.JSON_PROPERTY_FREQUENTLY_RUN_BETTER_PERFORMING_ADS_MODE,
  AdGroup.JSON_PROPERTY_AD_GROUP_ID,
  AdGroup.JSON_PROPERTY_AD_GROUP_NAME,
  AdGroup.JSON_PROPERTY_AD_GROUP_TRACK_ID,
  AdGroup.JSON_PROPERTY_CAMPAIGN_ID,
  AdGroup.JSON_PROPERTY_CAMPAIGN_NAME,
  AdGroup.JSON_PROPERTY_CAMPAIGN_TRACK_ID,
  AdGroup.JSON_PROPERTY_CUSTOM_PARAMETERS,
  AdGroup.JSON_PROPERTY_LABELS,
  AdGroup.JSON_PROPERTY_SETTINGS,
  AdGroup.JSON_PROPERTY_TRACKING_URL,
  AdGroup.JSON_PROPERTY_IS_REMOVE_TRACKING_URL,
  AdGroup.JSON_PROPERTY_URL_REVIEW_DATA,
  AdGroup.JSON_PROPERTY_USER_STATUS,
  AdGroup.JSON_PROPERTY_CREATED_DATE,
  AdGroup.JSON_PROPERTY_UPDATED_DATE
})
@JsonTypeName("AdGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroup {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_BIDDING_STRATEGY_CONFIGURATION = "biddingStrategyConfiguration";
  private AdGroupServiceBiddingStrategyConfiguration biddingStrategyConfiguration;

  public static final String JSON_PROPERTY_FREQUENTLY_RUN_BETTER_PERFORMING_ADS_MODE = "frequentlyRunBetterPerformingAdsMode";
  private AdGroupServiceFrequentlyRunBetterPerformingAdsMode frequentlyRunBetterPerformingAdsMode;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_AD_GROUP_NAME = "adGroupName";
  private String adGroupName;

  public static final String JSON_PROPERTY_AD_GROUP_TRACK_ID = "adGroupTrackId";
  private Long adGroupTrackId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_CAMPAIGN_TRACK_ID = "campaignTrackId";
  private Long campaignTrackId;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private AdGroupServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<AdGroupServiceLabel> labels = null;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private AdGroupServiceSettings settings;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_TRACKING_URL = "isRemoveTrackingUrl";
  private AdGroupServiceIsRemoveFlg isRemoveTrackingUrl;

  public static final String JSON_PROPERTY_URL_REVIEW_DATA = "urlReviewData";
  private AdGroupServiceUrlReviewData urlReviewData;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private AdGroupServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private String createdDate;

  public static final String JSON_PROPERTY_UPDATED_DATE = "updatedDate";
  private String updatedDate;

  public AdGroup() { 
  }

  public AdGroup accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
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


  public AdGroup biddingStrategyConfiguration(AdGroupServiceBiddingStrategyConfiguration biddingStrategyConfiguration) {
    
    this.biddingStrategyConfiguration = biddingStrategyConfiguration;
    return this;
  }

   /**
   * Get biddingStrategyConfiguration
   * @return biddingStrategyConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceBiddingStrategyConfiguration getBiddingStrategyConfiguration() {
    return biddingStrategyConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingStrategyConfiguration(AdGroupServiceBiddingStrategyConfiguration biddingStrategyConfiguration) {
    this.biddingStrategyConfiguration = biddingStrategyConfiguration;
  }


  public AdGroup frequentlyRunBetterPerformingAdsMode(AdGroupServiceFrequentlyRunBetterPerformingAdsMode frequentlyRunBetterPerformingAdsMode) {
    
    this.frequentlyRunBetterPerformingAdsMode = frequentlyRunBetterPerformingAdsMode;
    return this;
  }

   /**
   * Get frequentlyRunBetterPerformingAdsMode
   * @return frequentlyRunBetterPerformingAdsMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENTLY_RUN_BETTER_PERFORMING_ADS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceFrequentlyRunBetterPerformingAdsMode getFrequentlyRunBetterPerformingAdsMode() {
    return frequentlyRunBetterPerformingAdsMode;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENTLY_RUN_BETTER_PERFORMING_ADS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequentlyRunBetterPerformingAdsMode(AdGroupServiceFrequentlyRunBetterPerformingAdsMode frequentlyRunBetterPerformingAdsMode) {
    this.frequentlyRunBetterPerformingAdsMode = frequentlyRunBetterPerformingAdsMode;
  }


  public AdGroup adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループIDです。&lt;br&gt; このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID.&lt;br&gt; This field will be ignored in ADD operation, and will be required in SET and REMOVE operation.&lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> このフィールドは、ADD時は無視され、SETおよびREMOVE時は必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field will be ignored in ADD operation, and will be required in SET and REMOVE operation.</div> ")
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


  public AdGroup adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループ名です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group name.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
   * @return adGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Ad group name.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdGroupName() {
    return adGroupName;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }


  public AdGroup adGroupTrackId(Long adGroupTrackId) {
    
    this.adGroupTrackId = adGroupTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用広告グループIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID for tracking.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return adGroupTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用広告グループIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad group ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupTrackId() {
    return adGroupTrackId;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupTrackId(Long adGroupTrackId) {
    this.adGroupTrackId = adGroupTrackId;
  }


  public AdGroup campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> ")
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


  public AdGroup campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public AdGroup campaignTrackId(Long campaignTrackId) {
    
    this.campaignTrackId = campaignTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用キャンペーンIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID for tracking.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return campaignTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用キャンペーンIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignTrackId() {
    return campaignTrackId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceCustomParameters getCustomParameters() {
    return customParameters;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupServiceLabel> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceSettings getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(AdGroupServiceSettings settings) {
    this.settings = settings;
  }


  public AdGroup trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※キャンペーンがアプリキャンペーンでAndroidの場合、設定はできません。&lt;br&gt; ※SET時、こちらが審査中の場合、編集はできません。また、変更がない場合、審査対象とはなりません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field is optional.&lt;br&gt; *Cannot set for a Mobile App campaign for Android OS.&lt;br&gt; *In SET operation, cannot update it when this field is in editorial review. In addition, if there is no change, it will not to be reviewed.&lt;/div&gt; 
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> このフィールドは、省略可能となります。<br> ※キャンペーンがアプリキャンペーンでAndroidの場合、設定はできません。<br> ※SET時、こちらが審査中の場合、編集はできません。また、変更がない場合、審査対象とはなりません。</div> <div lang=\"en\">Tracking URL.<br> This field is optional.<br> *Cannot set for a Mobile App campaign for Android OS.<br> *In SET operation, cannot update it when this field is in editorial review. In addition, if there is no change, it will not to be reviewed.</div> ")
  @JsonProperty(JSON_PROPERTY_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingUrl() {
    return trackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  public AdGroup isRemoveTrackingUrl(AdGroupServiceIsRemoveFlg isRemoveTrackingUrl) {
    
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
    return this;
  }

   /**
   * Get isRemoveTrackingUrl
   * @return isRemoveTrackingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceIsRemoveFlg getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTrackingUrl(AdGroupServiceIsRemoveFlg isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }


  public AdGroup urlReviewData(AdGroupServiceUrlReviewData urlReviewData) {
    
    this.urlReviewData = urlReviewData;
    return this;
  }

   /**
   * Get urlReviewData
   * @return urlReviewData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_REVIEW_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceUrlReviewData getUrlReviewData() {
    return urlReviewData;
  }


  @JsonProperty(JSON_PROPERTY_URL_REVIEW_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(AdGroupServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  public AdGroup createdDate(String createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループが作成された日です。&lt;br&gt;※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date of ad group made.&lt;br&gt;* Format: yyyyMMdd&lt;/div&gt; 
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループが作成された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of ad group made.<br>* Format: yyyyMMdd</div> ")
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  public AdGroup updatedDate(String updatedDate) {
    
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループが更新された日です。&lt;br&gt;※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date of ad group updated.&lt;br&gt;* Format: yyyyMMdd&lt;/div&gt; 
   * @return updatedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループが更新された日です。<br>※フォーマット：yyyyMMdd</div> <div lang=\"en\">Date of ad group updated.<br>* Format: yyyyMMdd</div> ")
  @JsonProperty(JSON_PROPERTY_UPDATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedDate() {
    return updatedDate;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
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
        Objects.equals(this.biddingStrategyConfiguration, adGroup.biddingStrategyConfiguration) &&
        Objects.equals(this.frequentlyRunBetterPerformingAdsMode, adGroup.frequentlyRunBetterPerformingAdsMode) &&
        Objects.equals(this.adGroupId, adGroup.adGroupId) &&
        Objects.equals(this.adGroupName, adGroup.adGroupName) &&
        Objects.equals(this.adGroupTrackId, adGroup.adGroupTrackId) &&
        Objects.equals(this.campaignId, adGroup.campaignId) &&
        Objects.equals(this.campaignName, adGroup.campaignName) &&
        Objects.equals(this.campaignTrackId, adGroup.campaignTrackId) &&
        Objects.equals(this.customParameters, adGroup.customParameters) &&
        Objects.equals(this.labels, adGroup.labels) &&
        Objects.equals(this.settings, adGroup.settings) &&
        Objects.equals(this.trackingUrl, adGroup.trackingUrl) &&
        Objects.equals(this.isRemoveTrackingUrl, adGroup.isRemoveTrackingUrl) &&
        Objects.equals(this.urlReviewData, adGroup.urlReviewData) &&
        Objects.equals(this.userStatus, adGroup.userStatus) &&
        Objects.equals(this.createdDate, adGroup.createdDate) &&
        Objects.equals(this.updatedDate, adGroup.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, biddingStrategyConfiguration, frequentlyRunBetterPerformingAdsMode, adGroupId, adGroupName, adGroupTrackId, campaignId, campaignName, campaignTrackId, customParameters, labels, settings, trackingUrl, isRemoveTrackingUrl, urlReviewData, userStatus, createdDate, updatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroup {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    biddingStrategyConfiguration: ").append(toIndentedString(biddingStrategyConfiguration)).append("\n");
    sb.append("    frequentlyRunBetterPerformingAdsMode: ").append(toIndentedString(frequentlyRunBetterPerformingAdsMode)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    adGroupTrackId: ").append(toIndentedString(adGroupTrackId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignTrackId: ").append(toIndentedString(campaignTrackId)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
    sb.append("    urlReviewData: ").append(toIndentedString(urlReviewData)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

