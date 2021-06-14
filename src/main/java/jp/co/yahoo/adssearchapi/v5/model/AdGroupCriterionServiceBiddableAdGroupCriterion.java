package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceAdditionalAdvancedMobileUrls;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceAdditionalAdvancedUrls;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceBid;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceCustomParameters;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceBiddableAdGroupCriterionオブジェクトは、広告グループの単価設定可能（包含）クライテリアです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceBiddableAdGroupCriterion object displays biddable criterion in ad group.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceBiddableAdGroupCriterionオブジェクトは、広告グループの単価設定可能（包含）クライテリアです。</div> <div lang=\"en\">AdGroupCriterionServiceBiddableAdGroupCriterion object displays biddable criterion in ad group.</div> ")

public class AdGroupCriterionServiceBiddableAdGroupCriterion   {
  @JsonProperty("additionalAdvancedMobileUrls")
  private JsonNullable<AdGroupCriterionServiceAdditionalAdvancedMobileUrls> additionalAdvancedMobileUrls = JsonNullable.undefined();

  @JsonProperty("additionalAdvancedUrls")
  private JsonNullable<AdGroupCriterionServiceAdditionalAdvancedUrls> additionalAdvancedUrls = JsonNullable.undefined();

  @JsonProperty("advancedMobileUrl")
  private JsonNullable<String> advancedMobileUrl = JsonNullable.undefined();

  @JsonProperty("advancedUrl")
  private JsonNullable<String> advancedUrl = JsonNullable.undefined();

  @JsonProperty("approvalStatus")
  private JsonNullable<AdGroupCriterionServiceApprovalStatus> approvalStatus = JsonNullable.undefined();

  @JsonProperty("bid")
  private JsonNullable<AdGroupCriterionServiceBid> bid = JsonNullable.undefined();

  @JsonProperty("customParameters")
  private JsonNullable<AdGroupCriterionServiceCustomParameters> customParameters = JsonNullable.undefined();

  @JsonProperty("destinationUrl")
  private JsonNullable<String> destinationUrl = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  @JsonProperty("reviewAdvancedMobileUrl")
  private JsonNullable<String> reviewAdvancedMobileUrl = JsonNullable.undefined();

  @JsonProperty("reviewAdvancedUrl")
  private JsonNullable<String> reviewAdvancedUrl = JsonNullable.undefined();

  @JsonProperty("reviewCustomParameters")
  private JsonNullable<AdGroupCriterionServiceCustomParameters> reviewCustomParameters = JsonNullable.undefined();

  @JsonProperty("reviewDestinationUrl")
  private JsonNullable<String> reviewDestinationUrl = JsonNullable.undefined();

  @JsonProperty("reviewTrackingUrl")
  private JsonNullable<String> reviewTrackingUrl = JsonNullable.undefined();

  @JsonProperty("trackingUrl")
  private JsonNullable<String> trackingUrl = JsonNullable.undefined();

  @JsonProperty("userStatus")
  private JsonNullable<AdGroupCriterionServiceUserStatus> userStatus = JsonNullable.undefined();

  public AdGroupCriterionServiceBiddableAdGroupCriterion additionalAdvancedMobileUrls(AdGroupCriterionServiceAdditionalAdvancedMobileUrls additionalAdvancedMobileUrls) {
    this.additionalAdvancedMobileUrls = JsonNullable.of(additionalAdvancedMobileUrls);
    return this;
  }

  /**
   * Get additionalAdvancedMobileUrls
   * @return additionalAdvancedMobileUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceAdditionalAdvancedMobileUrls> getAdditionalAdvancedMobileUrls() {
    return additionalAdvancedMobileUrls;
  }

  public void setAdditionalAdvancedMobileUrls(JsonNullable<AdGroupCriterionServiceAdditionalAdvancedMobileUrls> additionalAdvancedMobileUrls) {
    this.additionalAdvancedMobileUrls = additionalAdvancedMobileUrls;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion additionalAdvancedUrls(AdGroupCriterionServiceAdditionalAdvancedUrls additionalAdvancedUrls) {
    this.additionalAdvancedUrls = JsonNullable.of(additionalAdvancedUrls);
    return this;
  }

  /**
   * Get additionalAdvancedUrls
   * @return additionalAdvancedUrls
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceAdditionalAdvancedUrls> getAdditionalAdvancedUrls() {
    return additionalAdvancedUrls;
  }

  public void setAdditionalAdvancedUrls(JsonNullable<AdGroupCriterionServiceAdditionalAdvancedUrls> additionalAdvancedUrls) {
    this.additionalAdvancedUrls = additionalAdvancedUrls;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion advancedMobileUrl(String advancedMobileUrl) {
    this.advancedMobileUrl = JsonNullable.of(advancedMobileUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">カスタムURL（スマートフォン）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存のカスタムURL（スマートフォン）は削除されます。</div> <div lang=\"en\">Upgraded Custom URL (Smartphone).<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing upgraded Custom URL (Smartphone) will be deleted.</div> 
   * @return advancedMobileUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カスタムURL（スマートフォン）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存のカスタムURL（スマートフォン）は削除されます。</div> <div lang=\"en\">Upgraded Custom URL (Smartphone).<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing upgraded Custom URL (Smartphone) will be deleted.</div> ")


  public JsonNullable<String> getAdvancedMobileUrl() {
    return advancedMobileUrl;
  }

  public void setAdvancedMobileUrl(JsonNullable<String> advancedMobileUrl) {
    this.advancedMobileUrl = advancedMobileUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion advancedUrl(String advancedUrl) {
    this.advancedUrl = JsonNullable.of(advancedUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">移行後のカスタムURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。※ADD時、移行してtracking Urlを指定している場合は必須となります。<br> ※空で設定すると、既存の移行後のカスタムURLは削除されます。</div> <div lang=\"en\">Upgraded Custom URL.<br> This field is optional in ADD and SET operation. *If upgraded and tracking Url is specified, it is required in ADD operation.<br> *When this is set blank, existing upgraded Custom URL will be deleted.</div> 
   * @return advancedUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">移行後のカスタムURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。※ADD時、移行してtracking Urlを指定している場合は必須となります。<br> ※空で設定すると、既存の移行後のカスタムURLは削除されます。</div> <div lang=\"en\">Upgraded Custom URL.<br> This field is optional in ADD and SET operation. *If upgraded and tracking Url is specified, it is required in ADD operation.<br> *When this is set blank, existing upgraded Custom URL will be deleted.</div> ")


  public JsonNullable<String> getAdvancedUrl() {
    return advancedUrl;
  }

  public void setAdvancedUrl(JsonNullable<String> advancedUrl) {
    this.advancedUrl = advancedUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion approvalStatus(AdGroupCriterionServiceApprovalStatus approvalStatus) {
    this.approvalStatus = JsonNullable.of(approvalStatus);
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceApprovalStatus> getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(JsonNullable<AdGroupCriterionServiceApprovalStatus> approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion bid(AdGroupCriterionServiceBid bid) {
    this.bid = JsonNullable.of(bid);
    return this;
  }

  /**
   * Get bid
   * @return bid
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceBid> getBid() {
    return bid;
  }

  public void setBid(JsonNullable<AdGroupCriterionServiceBid> bid) {
    this.bid = bid;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion customParameters(AdGroupCriterionServiceCustomParameters customParameters) {
    this.customParameters = JsonNullable.of(customParameters);
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceCustomParameters> getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(JsonNullable<AdGroupCriterionServiceCustomParameters> customParameters) {
    this.customParameters = customParameters;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion destinationUrl(String destinationUrl) {
    this.destinationUrl = JsonNullable.of(destinationUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">移行前のカスタムURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存の移行前のカスタムURLは削除されます。</div> <div lang=\"en\">Custom URL of before upgrading.<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing Custom URL before upgrade will be deleted.</div> 
   * @return destinationUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">移行前のカスタムURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存の移行前のカスタムURLは削除されます。</div> <div lang=\"en\">Custom URL of before upgrading.<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing Custom URL before upgrade will be deleted.</div> ")


  public JsonNullable<String> getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(JsonNullable<String> destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)</div> <div lang=\"en\">Code of Disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details)</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)</div> <div lang=\"en\">Code of Disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details)</div> ")


  public JsonNullable<List<String>> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(JsonNullable<List<String>> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion reviewAdvancedMobileUrl(String reviewAdvancedMobileUrl) {
    this.reviewAdvancedMobileUrl = JsonNullable.of(reviewAdvancedMobileUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">配信審査中のカスタムURL（スマートフォン）です。</div> <div lang=\"en\">Upgraded Custom URL (Smartphone), in review.</div> 
   * @return reviewAdvancedMobileUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信審査中のカスタムURL（スマートフォン）です。</div> <div lang=\"en\">Upgraded Custom URL (Smartphone), in review.</div> ")


  public JsonNullable<String> getReviewAdvancedMobileUrl() {
    return reviewAdvancedMobileUrl;
  }

  public void setReviewAdvancedMobileUrl(JsonNullable<String> reviewAdvancedMobileUrl) {
    this.reviewAdvancedMobileUrl = reviewAdvancedMobileUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion reviewAdvancedUrl(String reviewAdvancedUrl) {
    this.reviewAdvancedUrl = JsonNullable.of(reviewAdvancedUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">移行後の配信審査中のカスタムURLです。</div> <div lang=\"en\">Upgraded Custom URL, in review.</div> 
   * @return reviewAdvancedUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">移行後の配信審査中のカスタムURLです。</div> <div lang=\"en\">Upgraded Custom URL, in review.</div> ")


  public JsonNullable<String> getReviewAdvancedUrl() {
    return reviewAdvancedUrl;
  }

  public void setReviewAdvancedUrl(JsonNullable<String> reviewAdvancedUrl) {
    this.reviewAdvancedUrl = reviewAdvancedUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion reviewCustomParameters(AdGroupCriterionServiceCustomParameters reviewCustomParameters) {
    this.reviewCustomParameters = JsonNullable.of(reviewCustomParameters);
    return this;
  }

  /**
   * Get reviewCustomParameters
   * @return reviewCustomParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceCustomParameters> getReviewCustomParameters() {
    return reviewCustomParameters;
  }

  public void setReviewCustomParameters(JsonNullable<AdGroupCriterionServiceCustomParameters> reviewCustomParameters) {
    this.reviewCustomParameters = reviewCustomParameters;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion reviewDestinationUrl(String reviewDestinationUrl) {
    this.reviewDestinationUrl = JsonNullable.of(reviewDestinationUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">移行前の配信審査中のカスタムURLです。</div> <div lang=\"en\">Custom URL of before upgrading, in review.</div> 
   * @return reviewDestinationUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">移行前の配信審査中のカスタムURLです。</div> <div lang=\"en\">Custom URL of before upgrading, in review.</div> ")


  public JsonNullable<String> getReviewDestinationUrl() {
    return reviewDestinationUrl;
  }

  public void setReviewDestinationUrl(JsonNullable<String> reviewDestinationUrl) {
    this.reviewDestinationUrl = reviewDestinationUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion reviewTrackingUrl(String reviewTrackingUrl) {
    this.reviewTrackingUrl = JsonNullable.of(reviewTrackingUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">配信審査中のトラッキングURLです。</div> <div lang=\"en\">Tracking URL, in review.</div> 
   * @return reviewTrackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信審査中のトラッキングURLです。</div> <div lang=\"en\">Tracking URL, in review.</div> ")


  public JsonNullable<String> getReviewTrackingUrl() {
    return reviewTrackingUrl;
  }

  public void setReviewTrackingUrl(JsonNullable<String> reviewTrackingUrl) {
    this.reviewTrackingUrl = reviewTrackingUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion trackingUrl(String trackingUrl) {
    this.trackingUrl = JsonNullable.of(trackingUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存のトラッキングURLは削除されます。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing Tracking URL will be deleted.</div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存のトラッキングURLは削除されます。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing Tracking URL will be deleted.</div> ")


  public JsonNullable<String> getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(JsonNullable<String> trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion userStatus(AdGroupCriterionServiceUserStatus userStatus) {
    this.userStatus = JsonNullable.of(userStatus);
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceUserStatus> getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(JsonNullable<AdGroupCriterionServiceUserStatus> userStatus) {
    this.userStatus = userStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceBiddableAdGroupCriterion adGroupCriterionServiceBiddableAdGroupCriterion = (AdGroupCriterionServiceBiddableAdGroupCriterion) o;
    return Objects.equals(this.additionalAdvancedMobileUrls, adGroupCriterionServiceBiddableAdGroupCriterion.additionalAdvancedMobileUrls) &&
        Objects.equals(this.additionalAdvancedUrls, adGroupCriterionServiceBiddableAdGroupCriterion.additionalAdvancedUrls) &&
        Objects.equals(this.advancedMobileUrl, adGroupCriterionServiceBiddableAdGroupCriterion.advancedMobileUrl) &&
        Objects.equals(this.advancedUrl, adGroupCriterionServiceBiddableAdGroupCriterion.advancedUrl) &&
        Objects.equals(this.approvalStatus, adGroupCriterionServiceBiddableAdGroupCriterion.approvalStatus) &&
        Objects.equals(this.bid, adGroupCriterionServiceBiddableAdGroupCriterion.bid) &&
        Objects.equals(this.customParameters, adGroupCriterionServiceBiddableAdGroupCriterion.customParameters) &&
        Objects.equals(this.destinationUrl, adGroupCriterionServiceBiddableAdGroupCriterion.destinationUrl) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupCriterionServiceBiddableAdGroupCriterion.disapprovalReasonCodes) &&
        Objects.equals(this.reviewAdvancedMobileUrl, adGroupCriterionServiceBiddableAdGroupCriterion.reviewAdvancedMobileUrl) &&
        Objects.equals(this.reviewAdvancedUrl, adGroupCriterionServiceBiddableAdGroupCriterion.reviewAdvancedUrl) &&
        Objects.equals(this.reviewCustomParameters, adGroupCriterionServiceBiddableAdGroupCriterion.reviewCustomParameters) &&
        Objects.equals(this.reviewDestinationUrl, adGroupCriterionServiceBiddableAdGroupCriterion.reviewDestinationUrl) &&
        Objects.equals(this.reviewTrackingUrl, adGroupCriterionServiceBiddableAdGroupCriterion.reviewTrackingUrl) &&
        Objects.equals(this.trackingUrl, adGroupCriterionServiceBiddableAdGroupCriterion.trackingUrl) &&
        Objects.equals(this.userStatus, adGroupCriterionServiceBiddableAdGroupCriterion.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalAdvancedMobileUrls, additionalAdvancedUrls, advancedMobileUrl, advancedUrl, approvalStatus, bid, customParameters, destinationUrl, disapprovalReasonCodes, reviewAdvancedMobileUrl, reviewAdvancedUrl, reviewCustomParameters, reviewDestinationUrl, reviewTrackingUrl, trackingUrl, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceBiddableAdGroupCriterion {\n");
    
    sb.append("    additionalAdvancedMobileUrls: ").append(toIndentedString(additionalAdvancedMobileUrls)).append("\n");
    sb.append("    additionalAdvancedUrls: ").append(toIndentedString(additionalAdvancedUrls)).append("\n");
    sb.append("    advancedMobileUrl: ").append(toIndentedString(advancedMobileUrl)).append("\n");
    sb.append("    advancedUrl: ").append(toIndentedString(advancedUrl)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    reviewAdvancedMobileUrl: ").append(toIndentedString(reviewAdvancedMobileUrl)).append("\n");
    sb.append("    reviewAdvancedUrl: ").append(toIndentedString(reviewAdvancedUrl)).append("\n");
    sb.append("    reviewCustomParameters: ").append(toIndentedString(reviewCustomParameters)).append("\n");
    sb.append("    reviewDestinationUrl: ").append(toIndentedString(reviewDestinationUrl)).append("\n");
    sb.append("    reviewTrackingUrl: ").append(toIndentedString(reviewTrackingUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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

