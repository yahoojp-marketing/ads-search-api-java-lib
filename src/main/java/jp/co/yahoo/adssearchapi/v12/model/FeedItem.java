/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceAttribute;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceCustomParameters;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceDevicePreference;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceLocation;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServicePlaceholderType;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceScheduling;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceTargetingAdGroup;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceTargetingCampaign;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceTargetingKeyword;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceTrademarkStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemオブジェクトは、フィードアイテム情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItem object contains the information of Feed Item.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedItem.JSON_PROPERTY_ACCOUNT_ID,
  FeedItem.JSON_PROPERTY_APPROVAL_STATUS,
  FeedItem.JSON_PROPERTY_CUSTOM_PARAMETERS,
  FeedItem.JSON_PROPERTY_DEVICE_PREFERENCE,
  FeedItem.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  FeedItem.JSON_PROPERTY_END_DATE,
  FeedItem.JSON_PROPERTY_FEED_ID,
  FeedItem.JSON_PROPERTY_FEED_ITEM_ATTRIBUTE,
  FeedItem.JSON_PROPERTY_FEED_ITEM_ID,
  FeedItem.JSON_PROPERTY_FEED_ITEM_TRACK_ID,
  FeedItem.JSON_PROPERTY_INVALIDED_TRADEMARKS,
  FeedItem.JSON_PROPERTY_LOCATION,
  FeedItem.JSON_PROPERTY_PLACEHOLDER_TYPE,
  FeedItem.JSON_PROPERTY_REVIEW_CUSTOM_PARAMETERS,
  FeedItem.JSON_PROPERTY_SCHEDULING,
  FeedItem.JSON_PROPERTY_START_DATE,
  FeedItem.JSON_PROPERTY_TARGETING_AD_GROUP,
  FeedItem.JSON_PROPERTY_TARGETING_CAMPAIGN,
  FeedItem.JSON_PROPERTY_TARGETING_KEYWORD,
  FeedItem.JSON_PROPERTY_TRADEMARK_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItem {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private FeedItemServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private FeedItemServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_DEVICE_PREFERENCE = "devicePreference";
  private FeedItemServiceDevicePreference devicePreference;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_FEED_ITEM_ATTRIBUTE = "feedItemAttribute";
  private List<FeedItemServiceAttribute> feedItemAttribute;

  public static final String JSON_PROPERTY_FEED_ITEM_ID = "feedItemId";
  private Long feedItemId;

  public static final String JSON_PROPERTY_FEED_ITEM_TRACK_ID = "feedItemTrackId";
  private Long feedItemTrackId;

  public static final String JSON_PROPERTY_INVALIDED_TRADEMARKS = "invalidedTrademarks";
  private List<String> invalidedTrademarks;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private FeedItemServiceLocation location;

  public static final String JSON_PROPERTY_PLACEHOLDER_TYPE = "placeholderType";
  private FeedItemServicePlaceholderType placeholderType;

  public static final String JSON_PROPERTY_REVIEW_CUSTOM_PARAMETERS = "reviewCustomParameters";
  private FeedItemServiceCustomParameters reviewCustomParameters;

  public static final String JSON_PROPERTY_SCHEDULING = "scheduling";
  private FeedItemServiceScheduling scheduling;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_TARGETING_AD_GROUP = "targetingAdGroup";
  private FeedItemServiceTargetingAdGroup targetingAdGroup;

  public static final String JSON_PROPERTY_TARGETING_CAMPAIGN = "targetingCampaign";
  private FeedItemServiceTargetingCampaign targetingCampaign;

  public static final String JSON_PROPERTY_TARGETING_KEYWORD = "targetingKeyword";
  private FeedItemServiceTargetingKeyword targetingKeyword;

  public static final String JSON_PROPERTY_TRADEMARK_STATUS = "trademarkStatus";
  private FeedItemServiceTrademarkStatus trademarkStatus;

  public FeedItem() {
  }

  public FeedItem accountId(Long accountId) {
    
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


  public FeedItem approvalStatus(FeedItemServiceApprovalStatus approvalStatus) {
    
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

  public FeedItemServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(FeedItemServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public FeedItem customParameters(FeedItemServiceCustomParameters customParameters) {
    
    this.customParameters = customParameters;
    return this;
  }

   /**
   * Get customParameters
   * @return customParameters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceCustomParameters getCustomParameters() {
    return customParameters;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomParameters(FeedItemServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }


  public FeedItem devicePreference(FeedItemServiceDevicePreference devicePreference) {
    
    this.devicePreference = devicePreference;
    return this;
  }

   /**
   * Get devicePreference
   * @return devicePreference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceDevicePreference getDevicePreference() {
    return devicePreference;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevicePreference(FeedItemServiceDevicePreference devicePreference) {
    this.devicePreference = devicePreference;
  }


  public FeedItem disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public FeedItem addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Reject reason on editorial review.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
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


  public FeedItem endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;配信終了日です。&lt;br&gt;※空で設定すると、既存の配信終了日は削除されます。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End date of ad display.&lt;br&gt;∗By setting blank, existing end date of ad display will be deleted. &lt;br&gt;This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public FeedItem feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードIDです。&lt;br&gt; このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※アドカスタマイザーの場合は、ADD時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID.&lt;br&gt;Although this field will be returned in the response, it will be ignored on input.&lt;br&gt; *For AD_CUSTOMIZER, this field is required in ADD operation.&lt;/div&gt; 
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


  public FeedItem feedItemAttribute(List<FeedItemServiceAttribute> feedItemAttribute) {
    
    this.feedItemAttribute = feedItemAttribute;
    return this;
  }

  public FeedItem addFeedItemAttributeItem(FeedItemServiceAttribute feedItemAttributeItem) {
    if (this.feedItemAttribute == null) {
      this.feedItemAttribute = new ArrayList<>();
    }
    this.feedItemAttribute.add(feedItemAttributeItem);
    return this;
  }

   /**
   * Get feedItemAttribute
   * @return feedItemAttribute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ITEM_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeedItemServiceAttribute> getFeedItemAttribute() {
    return feedItemAttribute;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ITEM_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedItemAttribute(List<FeedItemServiceAttribute> feedItemAttribute) {
    this.feedItemAttribute = feedItemAttribute;
  }


  public FeedItem feedItemId(Long feedItemId) {
    
    this.feedItemId = feedItemId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードアイテムIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となり、ADD時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed Item ID.&lt;br&gt;This field is required in SET and REMOVE operation, and will be ignored in ADD operation.&lt;/div&gt; 
   * @return feedItemId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedItemId() {
    return feedItemId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedItemId(Long feedItemId) {
    this.feedItemId = feedItemId;
  }


  public FeedItem feedItemTrackId(Long feedItemTrackId) {
    
    this.feedItemTrackId = feedItemTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用フィードアイテムIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed Item ID for tracking.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return feedItemTrackId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ITEM_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedItemTrackId() {
    return feedItemTrackId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ITEM_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedItemTrackId(Long feedItemTrackId) {
    this.feedItemTrackId = feedItemTrackId;
  }


  public FeedItem invalidedTrademarks(List<String> invalidedTrademarks) {
    
    this.invalidedTrademarks = invalidedTrademarks;
    return this;
  }

  public FeedItem addInvalidedTrademarksItem(String invalidedTrademarksItem) {
    if (this.invalidedTrademarks == null) {
      this.invalidedTrademarks = new ArrayList<>();
    }
    this.invalidedTrademarks.add(invalidedTrademarksItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;制限された商標です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Invalided trademarks.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
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


  public FeedItem location(FeedItemServiceLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceLocation getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(FeedItemServiceLocation location) {
    this.location = location;
  }


  public FeedItem placeholderType(FeedItemServicePlaceholderType placeholderType) {
    
    this.placeholderType = placeholderType;
    return this;
  }

   /**
   * Get placeholderType
   * @return placeholderType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServicePlaceholderType getPlaceholderType() {
    return placeholderType;
  }


  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaceholderType(FeedItemServicePlaceholderType placeholderType) {
    this.placeholderType = placeholderType;
  }


  public FeedItem reviewCustomParameters(FeedItemServiceCustomParameters reviewCustomParameters) {
    
    this.reviewCustomParameters = reviewCustomParameters;
    return this;
  }

   /**
   * Get reviewCustomParameters
   * @return reviewCustomParameters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceCustomParameters getReviewCustomParameters() {
    return reviewCustomParameters;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewCustomParameters(FeedItemServiceCustomParameters reviewCustomParameters) {
    this.reviewCustomParameters = reviewCustomParameters;
  }


  public FeedItem scheduling(FeedItemServiceScheduling scheduling) {
    
    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceScheduling getScheduling() {
    return scheduling;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduling(FeedItemServiceScheduling scheduling) {
    this.scheduling = scheduling;
  }


  public FeedItem startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;配信開始日です。&lt;br&gt; ※空で設定すると、既存の配信開始日は削除されます。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date of ad display&lt;br&gt; ∗On setting blank, existing start date of ad display will be deleted.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public FeedItem targetingAdGroup(FeedItemServiceTargetingAdGroup targetingAdGroup) {
    
    this.targetingAdGroup = targetingAdGroup;
    return this;
  }

   /**
   * Get targetingAdGroup
   * @return targetingAdGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_AD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceTargetingAdGroup getTargetingAdGroup() {
    return targetingAdGroup;
  }


  @JsonProperty(JSON_PROPERTY_TARGETING_AD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetingAdGroup(FeedItemServiceTargetingAdGroup targetingAdGroup) {
    this.targetingAdGroup = targetingAdGroup;
  }


  public FeedItem targetingCampaign(FeedItemServiceTargetingCampaign targetingCampaign) {
    
    this.targetingCampaign = targetingCampaign;
    return this;
  }

   /**
   * Get targetingCampaign
   * @return targetingCampaign
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceTargetingCampaign getTargetingCampaign() {
    return targetingCampaign;
  }


  @JsonProperty(JSON_PROPERTY_TARGETING_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetingCampaign(FeedItemServiceTargetingCampaign targetingCampaign) {
    this.targetingCampaign = targetingCampaign;
  }


  public FeedItem targetingKeyword(FeedItemServiceTargetingKeyword targetingKeyword) {
    
    this.targetingKeyword = targetingKeyword;
    return this;
  }

   /**
   * Get targetingKeyword
   * @return targetingKeyword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceTargetingKeyword getTargetingKeyword() {
    return targetingKeyword;
  }


  @JsonProperty(JSON_PROPERTY_TARGETING_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetingKeyword(FeedItemServiceTargetingKeyword targetingKeyword) {
    this.targetingKeyword = targetingKeyword;
  }


  public FeedItem trademarkStatus(FeedItemServiceTrademarkStatus trademarkStatus) {
    
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

  public FeedItemServiceTrademarkStatus getTrademarkStatus() {
    return trademarkStatus;
  }


  @JsonProperty(JSON_PROPERTY_TRADEMARK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrademarkStatus(FeedItemServiceTrademarkStatus trademarkStatus) {
    this.trademarkStatus = trademarkStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItem feedItem = (FeedItem) o;
    return Objects.equals(this.accountId, feedItem.accountId) &&
        Objects.equals(this.approvalStatus, feedItem.approvalStatus) &&
        Objects.equals(this.customParameters, feedItem.customParameters) &&
        Objects.equals(this.devicePreference, feedItem.devicePreference) &&
        Objects.equals(this.disapprovalReasonCodes, feedItem.disapprovalReasonCodes) &&
        Objects.equals(this.endDate, feedItem.endDate) &&
        Objects.equals(this.feedId, feedItem.feedId) &&
        Objects.equals(this.feedItemAttribute, feedItem.feedItemAttribute) &&
        Objects.equals(this.feedItemId, feedItem.feedItemId) &&
        Objects.equals(this.feedItemTrackId, feedItem.feedItemTrackId) &&
        Objects.equals(this.invalidedTrademarks, feedItem.invalidedTrademarks) &&
        Objects.equals(this.location, feedItem.location) &&
        Objects.equals(this.placeholderType, feedItem.placeholderType) &&
        Objects.equals(this.reviewCustomParameters, feedItem.reviewCustomParameters) &&
        Objects.equals(this.scheduling, feedItem.scheduling) &&
        Objects.equals(this.startDate, feedItem.startDate) &&
        Objects.equals(this.targetingAdGroup, feedItem.targetingAdGroup) &&
        Objects.equals(this.targetingCampaign, feedItem.targetingCampaign) &&
        Objects.equals(this.targetingKeyword, feedItem.targetingKeyword) &&
        Objects.equals(this.trademarkStatus, feedItem.trademarkStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatus, customParameters, devicePreference, disapprovalReasonCodes, endDate, feedId, feedItemAttribute, feedItemId, feedItemTrackId, invalidedTrademarks, location, placeholderType, reviewCustomParameters, scheduling, startDate, targetingAdGroup, targetingCampaign, targetingKeyword, trademarkStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItem {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    devicePreference: ").append(toIndentedString(devicePreference)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    feedItemAttribute: ").append(toIndentedString(feedItemAttribute)).append("\n");
    sb.append("    feedItemId: ").append(toIndentedString(feedItemId)).append("\n");
    sb.append("    feedItemTrackId: ").append(toIndentedString(feedItemTrackId)).append("\n");
    sb.append("    invalidedTrademarks: ").append(toIndentedString(invalidedTrademarks)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    placeholderType: ").append(toIndentedString(placeholderType)).append("\n");
    sb.append("    reviewCustomParameters: ").append(toIndentedString(reviewCustomParameters)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    targetingAdGroup: ").append(toIndentedString(targetingAdGroup)).append("\n");
    sb.append("    targetingCampaign: ").append(toIndentedString(targetingCampaign)).append("\n");
    sb.append("    targetingKeyword: ").append(toIndentedString(targetingKeyword)).append("\n");
    sb.append("    trademarkStatus: ").append(toIndentedString(trademarkStatus)).append("\n");
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

