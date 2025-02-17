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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupAdServiceAd;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupAdServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupAdServiceLabel;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupAdServiceTrademarkStatus;
import jp.co.yahoo.adssearchapi.v16.model.AdGroupAdServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdオブジェクトは、広告に関する操作を行うための情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAd object describes information for operations on ads.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupAd.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupAd.JSON_PROPERTY_AD,
  AdGroupAd.JSON_PROPERTY_AD_GROUP_ID,
  AdGroupAd.JSON_PROPERTY_AD_GROUP_NAME,
  AdGroupAd.JSON_PROPERTY_AD_GROUP_TRACK_ID,
  AdGroupAd.JSON_PROPERTY_AD_ID,
  AdGroupAd.JSON_PROPERTY_AD_NAME,
  AdGroupAd.JSON_PROPERTY_AD_TRACK_ID,
  AdGroupAd.JSON_PROPERTY_APPROVAL_STATUS,
  AdGroupAd.JSON_PROPERTY_CAMPAIGN_ID,
  AdGroupAd.JSON_PROPERTY_CAMPAIGN_NAME,
  AdGroupAd.JSON_PROPERTY_CAMPAIGN_TRACK_ID,
  AdGroupAd.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  AdGroupAd.JSON_PROPERTY_FEED_ID,
  AdGroupAd.JSON_PROPERTY_INVALIDED_TRADEMARKS,
  AdGroupAd.JSON_PROPERTY_LABELS,
  AdGroupAd.JSON_PROPERTY_TRADEMARK_STATUS,
  AdGroupAd.JSON_PROPERTY_USER_STATUS,
  AdGroupAd.JSON_PROPERTY_CREATED_DATE,
  AdGroupAd.JSON_PROPERTY_UPDATED_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAd {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD = "ad";
  private AdGroupAdServiceAd ad;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_AD_GROUP_NAME = "adGroupName";
  private String adGroupName;

  public static final String JSON_PROPERTY_AD_GROUP_TRACK_ID = "adGroupTrackId";
  private Long adGroupTrackId;

  public static final String JSON_PROPERTY_AD_ID = "adId";
  private Long adId;

  public static final String JSON_PROPERTY_AD_NAME = "adName";
  private String adName;

  public static final String JSON_PROPERTY_AD_TRACK_ID = "adTrackId";
  private Long adTrackId;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private AdGroupAdServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_CAMPAIGN_TRACK_ID = "campaignTrackId";
  private Long campaignTrackId;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_INVALIDED_TRADEMARKS = "invalidedTrademarks";
  private List<String> invalidedTrademarks;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<AdGroupAdServiceLabel> labels;

  public static final String JSON_PROPERTY_TRADEMARK_STATUS = "trademarkStatus";
  private AdGroupAdServiceTrademarkStatus trademarkStatus;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private AdGroupAdServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private String createdDate;

  public static final String JSON_PROPERTY_UPDATED_DATE = "updatedDate";
  private String updatedDate;

  public AdGroupAd() {
  }

  public AdGroupAd accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupAd ad(AdGroupAdServiceAd ad) {
    
    this.ad = ad;
    return this;
  }

   /**
   * Get ad
   * @return ad
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceAd getAd() {
    return ad;
  }


  @JsonProperty(JSON_PROPERTY_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAd(AdGroupAdServiceAd ad) {
    this.ad = ad;
  }


  public AdGroupAd adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
   * @return adGroupId
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupAd adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループ名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return adGroupName
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupAd adGroupTrackId(Long adGroupTrackId) {
    
    this.adGroupTrackId = adGroupTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用広告グループIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID for tracking.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return adGroupTrackId
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupAd adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告IDです。&lt;br&gt; SETおよびREMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad ID.&lt;br&gt; This field is required in SET and REMOVE operation.&lt;/div&gt; 
   * @return adId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdId() {
    return adId;
  }


  @JsonProperty(JSON_PROPERTY_AD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public AdGroupAd adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告名です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad name.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
   * @return adName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdName() {
    return adName;
  }


  @JsonProperty(JSON_PROPERTY_AD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdName(String adName) {
    this.adName = adName;
  }


  public AdGroupAd adTrackId(Long adTrackId) {
    
    this.adTrackId = adTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用広告IDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad ID for tracking.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return adTrackId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdTrackId() {
    return adTrackId;
  }


  @JsonProperty(JSON_PROPERTY_AD_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(AdGroupAdServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public AdGroupAd campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
   * @return campaignId
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupAd campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return campaignName
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupAd campaignTrackId(Long campaignTrackId) {
    
    this.campaignTrackId = campaignTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用キャンペーンIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID for tracking.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return campaignTrackId
  **/
  @jakarta.annotation.Nullable
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認の理由コードです。&lt;br&gt; (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Code of Disapproval reason.&lt;br&gt; (Refer to DictionaryService getDisapprovalReason response for details) &lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  public AdGroupAd feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return feedId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedId() {
    return feedId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;制限された商標です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Invalided trademarks.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return invalidedTrademarks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVALIDED_TRADEMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getInvalidedTrademarks() {
    return invalidedTrademarks;
  }


  @JsonProperty(JSON_PROPERTY_INVALIDED_TRADEMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceLabel> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRADEMARK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceTrademarkStatus getTrademarkStatus() {
    return trademarkStatus;
  }


  @JsonProperty(JSON_PROPERTY_TRADEMARK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(AdGroupAdServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  public AdGroupAd createdDate(String createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告が作成された日です。&lt;br&gt;※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date of Ad made.&lt;br&gt;* Format: yyyyMMdd&lt;/div&gt; 
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupAd updatedDate(String updatedDate) {
    
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告が更新された日です。&lt;br&gt;※フォーマット：yyyyMMdd&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Date of Ad updated.&lt;br&gt;* Format: yyyyMMdd&lt;/div&gt; 
   * @return updatedDate
  **/
  @jakarta.annotation.Nullable
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
        Objects.equals(this.createdDate, adGroupAd.createdDate) &&
        Objects.equals(this.updatedDate, adGroupAd.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, ad, adGroupId, adGroupName, adGroupTrackId, adId, adName, adTrackId, approvalStatus, campaignId, campaignName, campaignTrackId, disapprovalReasonCodes, feedId, invalidedTrademarks, labels, trademarkStatus, userStatus, createdDate, updatedDate);
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

