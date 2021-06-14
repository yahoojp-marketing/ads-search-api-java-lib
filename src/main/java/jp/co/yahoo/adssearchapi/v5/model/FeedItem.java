package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceAttribute;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceCustomParameters;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceDevicePreference;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceLocation;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServicePlaceholderType;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceScheduling;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceTargetingAdGroup;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceTargetingCampaign;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceTargetingKeyword;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceTrademarkStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemオブジェクトは、フィードアイテム情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItem object contains the information of Feed Item.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemオブジェクトは、フィードアイテム情報を格納します。</div> <div lang=\"en\">FeedItem object contains the information of Feed Item.</div> ")

public class FeedItem   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("approvalStatus")
  private JsonNullable<FeedItemServiceApprovalStatus> approvalStatus = JsonNullable.undefined();

  @JsonProperty("customParameters")
  private JsonNullable<FeedItemServiceCustomParameters> customParameters = JsonNullable.undefined();

  @JsonProperty("devicePreference")
  private JsonNullable<FeedItemServiceDevicePreference> devicePreference = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("feedId")
  private JsonNullable<Long> feedId = JsonNullable.undefined();

  @JsonProperty("feedItemAttribute")
  @Valid
  private JsonNullable<List<FeedItemServiceAttribute>> feedItemAttribute = JsonNullable.undefined();

  @JsonProperty("feedItemId")
  private JsonNullable<Long> feedItemId = JsonNullable.undefined();

  @JsonProperty("feedItemTrackId")
  private JsonNullable<Long> feedItemTrackId = JsonNullable.undefined();

  @JsonProperty("invalidedTrademarks")
  @Valid
  private JsonNullable<List<String>> invalidedTrademarks = JsonNullable.undefined();

  @JsonProperty("location")
  private JsonNullable<FeedItemServiceLocation> location = JsonNullable.undefined();

  @JsonProperty("placeholderType")
  private JsonNullable<FeedItemServicePlaceholderType> placeholderType = JsonNullable.undefined();

  @JsonProperty("reviewCustomParameters")
  private JsonNullable<FeedItemServiceCustomParameters> reviewCustomParameters = JsonNullable.undefined();

  @JsonProperty("scheduling")
  private JsonNullable<FeedItemServiceScheduling> scheduling = JsonNullable.undefined();

  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  @JsonProperty("targetingAdGroup")
  private JsonNullable<FeedItemServiceTargetingAdGroup> targetingAdGroup = JsonNullable.undefined();

  @JsonProperty("targetingCampaign")
  private JsonNullable<FeedItemServiceTargetingCampaign> targetingCampaign = JsonNullable.undefined();

  @JsonProperty("targetingKeyword")
  private JsonNullable<FeedItemServiceTargetingKeyword> targetingKeyword = JsonNullable.undefined();

  @JsonProperty("trademarkStatus")
  private JsonNullable<FeedItemServiceTrademarkStatus> trademarkStatus = JsonNullable.undefined();

  public FeedItem accountId(Long accountId) {
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

  public FeedItem approvalStatus(FeedItemServiceApprovalStatus approvalStatus) {
    this.approvalStatus = JsonNullable.of(approvalStatus);
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceApprovalStatus> getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(JsonNullable<FeedItemServiceApprovalStatus> approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public FeedItem customParameters(FeedItemServiceCustomParameters customParameters) {
    this.customParameters = JsonNullable.of(customParameters);
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceCustomParameters> getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(JsonNullable<FeedItemServiceCustomParameters> customParameters) {
    this.customParameters = customParameters;
  }

  public FeedItem devicePreference(FeedItemServiceDevicePreference devicePreference) {
    this.devicePreference = JsonNullable.of(devicePreference);
    return this;
  }

  /**
   * Get devicePreference
   * @return devicePreference
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceDevicePreference> getDevicePreference() {
    return devicePreference;
  }

  public void setDevicePreference(JsonNullable<FeedItemServiceDevicePreference> devicePreference) {
    this.devicePreference = devicePreference;
  }

  public FeedItem disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public FeedItem addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<List<String>> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(JsonNullable<List<String>> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public FeedItem endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\">配信終了日です。<br>※空で設定すると、既存の配信終了日は削除されます。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">End date of ad display.<br>∗By setting blank, existing end date of ad display will be deleted. <br>This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信終了日です。<br>※空で設定すると、既存の配信終了日は削除されます。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">End date of ad display.<br>∗By setting blank, existing end date of ad display will be deleted. <br>This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public FeedItem feedId(Long feedId) {
    this.feedId = JsonNullable.of(feedId);
    return this;
  }

  /**
   * <div lang=\"ja\">フィードIDです。<br> このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※アドカスタマイザーの場合は、ADD時に必須となります。</div> <div lang=\"en\">Feed ID.<br>Although this field will be returned in the response, it will be ignored on input.<br> *For AD_CUSTOMIZER, this field is required in ADD operation.</div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードIDです。<br> このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※アドカスタマイザーの場合は、ADD時に必須となります。</div> <div lang=\"en\">Feed ID.<br>Although this field will be returned in the response, it will be ignored on input.<br> *For AD_CUSTOMIZER, this field is required in ADD operation.</div> ")


  public JsonNullable<Long> getFeedId() {
    return feedId;
  }

  public void setFeedId(JsonNullable<Long> feedId) {
    this.feedId = feedId;
  }

  public FeedItem feedItemAttribute(List<FeedItemServiceAttribute> feedItemAttribute) {
    this.feedItemAttribute = JsonNullable.of(feedItemAttribute);
    return this;
  }

  public FeedItem addFeedItemAttributeItem(FeedItemServiceAttribute feedItemAttributeItem) {
    if (this.feedItemAttribute == null || !this.feedItemAttribute.isPresent()) {
      this.feedItemAttribute = JsonNullable.of(new ArrayList<>());
    }
    this.feedItemAttribute.get().add(feedItemAttributeItem);
    return this;
  }

  /**
   * Get feedItemAttribute
   * @return feedItemAttribute
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<FeedItemServiceAttribute>> getFeedItemAttribute() {
    return feedItemAttribute;
  }

  public void setFeedItemAttribute(JsonNullable<List<FeedItemServiceAttribute>> feedItemAttribute) {
    this.feedItemAttribute = feedItemAttribute;
  }

  public FeedItem feedItemId(Long feedItemId) {
    this.feedItemId = JsonNullable.of(feedItemId);
    return this;
  }

  /**
   * <div lang=\"ja\">フィードアイテムIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時に無視されます。</div> <div lang=\"en\">Feed Item ID.<br>This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> 
   * @return feedItemId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードアイテムIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時に無視されます。</div> <div lang=\"en\">Feed Item ID.<br>This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> ")


  public JsonNullable<Long> getFeedItemId() {
    return feedItemId;
  }

  public void setFeedItemId(JsonNullable<Long> feedItemId) {
    this.feedItemId = feedItemId;
  }

  public FeedItem feedItemTrackId(Long feedItemTrackId) {
    this.feedItemTrackId = JsonNullable.of(feedItemTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用フィードアイテムIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Feed Item ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return feedItemTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用フィードアイテムIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Feed Item ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getFeedItemTrackId() {
    return feedItemTrackId;
  }

  public void setFeedItemTrackId(JsonNullable<Long> feedItemTrackId) {
    this.feedItemTrackId = feedItemTrackId;
  }

  public FeedItem invalidedTrademarks(List<String> invalidedTrademarks) {
    this.invalidedTrademarks = JsonNullable.of(invalidedTrademarks);
    return this;
  }

  public FeedItem addInvalidedTrademarksItem(String invalidedTrademarksItem) {
    if (this.invalidedTrademarks == null || !this.invalidedTrademarks.isPresent()) {
      this.invalidedTrademarks = JsonNullable.of(new ArrayList<>());
    }
    this.invalidedTrademarks.get().add(invalidedTrademarksItem);
    return this;
  }

  /**
   * <div lang=\"ja\">制限された商標です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Invalided trademarks.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return invalidedTrademarks
  */
  @ApiModelProperty(value = "<div lang=\"ja\">制限された商標です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Invalided trademarks.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<List<String>> getInvalidedTrademarks() {
    return invalidedTrademarks;
  }

  public void setInvalidedTrademarks(JsonNullable<List<String>> invalidedTrademarks) {
    this.invalidedTrademarks = invalidedTrademarks;
  }

  public FeedItem location(FeedItemServiceLocation location) {
    this.location = JsonNullable.of(location);
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceLocation> getLocation() {
    return location;
  }

  public void setLocation(JsonNullable<FeedItemServiceLocation> location) {
    this.location = location;
  }

  public FeedItem placeholderType(FeedItemServicePlaceholderType placeholderType) {
    this.placeholderType = JsonNullable.of(placeholderType);
    return this;
  }

  /**
   * Get placeholderType
   * @return placeholderType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServicePlaceholderType> getPlaceholderType() {
    return placeholderType;
  }

  public void setPlaceholderType(JsonNullable<FeedItemServicePlaceholderType> placeholderType) {
    this.placeholderType = placeholderType;
  }

  public FeedItem reviewCustomParameters(FeedItemServiceCustomParameters reviewCustomParameters) {
    this.reviewCustomParameters = JsonNullable.of(reviewCustomParameters);
    return this;
  }

  /**
   * Get reviewCustomParameters
   * @return reviewCustomParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceCustomParameters> getReviewCustomParameters() {
    return reviewCustomParameters;
  }

  public void setReviewCustomParameters(JsonNullable<FeedItemServiceCustomParameters> reviewCustomParameters) {
    this.reviewCustomParameters = reviewCustomParameters;
  }

  public FeedItem scheduling(FeedItemServiceScheduling scheduling) {
    this.scheduling = JsonNullable.of(scheduling);
    return this;
  }

  /**
   * Get scheduling
   * @return scheduling
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceScheduling> getScheduling() {
    return scheduling;
  }

  public void setScheduling(JsonNullable<FeedItemServiceScheduling> scheduling) {
    this.scheduling = scheduling;
  }

  public FeedItem startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\">配信開始日です。<br> ※空で設定すると、既存の配信開始日は削除されます。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">Start date of ad display<br> ∗On setting blank, existing start date of ad display will be deleted.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信開始日です。<br> ※空で設定すると、既存の配信開始日は削除されます。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">Start date of ad display<br> ∗On setting blank, existing start date of ad display will be deleted.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public FeedItem targetingAdGroup(FeedItemServiceTargetingAdGroup targetingAdGroup) {
    this.targetingAdGroup = JsonNullable.of(targetingAdGroup);
    return this;
  }

  /**
   * Get targetingAdGroup
   * @return targetingAdGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceTargetingAdGroup> getTargetingAdGroup() {
    return targetingAdGroup;
  }

  public void setTargetingAdGroup(JsonNullable<FeedItemServiceTargetingAdGroup> targetingAdGroup) {
    this.targetingAdGroup = targetingAdGroup;
  }

  public FeedItem targetingCampaign(FeedItemServiceTargetingCampaign targetingCampaign) {
    this.targetingCampaign = JsonNullable.of(targetingCampaign);
    return this;
  }

  /**
   * Get targetingCampaign
   * @return targetingCampaign
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceTargetingCampaign> getTargetingCampaign() {
    return targetingCampaign;
  }

  public void setTargetingCampaign(JsonNullable<FeedItemServiceTargetingCampaign> targetingCampaign) {
    this.targetingCampaign = targetingCampaign;
  }

  public FeedItem targetingKeyword(FeedItemServiceTargetingKeyword targetingKeyword) {
    this.targetingKeyword = JsonNullable.of(targetingKeyword);
    return this;
  }

  /**
   * Get targetingKeyword
   * @return targetingKeyword
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceTargetingKeyword> getTargetingKeyword() {
    return targetingKeyword;
  }

  public void setTargetingKeyword(JsonNullable<FeedItemServiceTargetingKeyword> targetingKeyword) {
    this.targetingKeyword = targetingKeyword;
  }

  public FeedItem trademarkStatus(FeedItemServiceTrademarkStatus trademarkStatus) {
    this.trademarkStatus = JsonNullable.of(trademarkStatus);
    return this;
  }

  /**
   * Get trademarkStatus
   * @return trademarkStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceTrademarkStatus> getTrademarkStatus() {
    return trademarkStatus;
  }

  public void setTrademarkStatus(JsonNullable<FeedItemServiceTrademarkStatus> trademarkStatus) {
    this.trademarkStatus = trademarkStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

