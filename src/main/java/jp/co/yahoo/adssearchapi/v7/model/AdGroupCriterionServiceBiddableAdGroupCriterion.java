package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupCriterionServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupCriterionServiceBid;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupCriterionServiceCustomParameters;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupCriterionServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceBiddableAdGroupCriterionオブジェクトは、広告グループの単価設定可能（包含）クライテリアです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceBiddableAdGroupCriterion object displays biddable criterion in ad group.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceBiddableAdGroupCriterionオブジェクトは、広告グループの単価設定可能（包含）クライテリアです。</div> <div lang=\"en\">AdGroupCriterionServiceBiddableAdGroupCriterion object displays biddable criterion in ad group.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionServiceBiddableAdGroupCriterion   {
  @JsonProperty("smartphoneFinalUrl")
  private String smartphoneFinalUrl = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("approvalStatus")
  private AdGroupCriterionServiceApprovalStatus approvalStatus = null;

  @JsonProperty("bid")
  private AdGroupCriterionServiceBid bid = null;

  @JsonProperty("customParameters")
  private AdGroupCriterionServiceCustomParameters customParameters = null;

  @JsonProperty("destinationUrl")
  private String destinationUrl = null;

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  @JsonProperty("reviewSmartphoneFinalUrl")
  private String reviewSmartphoneFinalUrl = null;

  @JsonProperty("reviewFinalUrl")
  private String reviewFinalUrl = null;

  @JsonProperty("reviewCustomParameters")
  private AdGroupCriterionServiceCustomParameters reviewCustomParameters = null;

  @JsonProperty("reviewDestinationUrl")
  private String reviewDestinationUrl = null;

  @JsonProperty("reviewTrackingUrl")
  private String reviewTrackingUrl = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  @JsonProperty("userStatus")
  private AdGroupCriterionServiceUserStatus userStatus = null;

  public AdGroupCriterionServiceBiddableAdGroupCriterion smartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URL（スマートフォン）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存の最終リンク先URL（スマートフォン）は削除されます。</div> <div lang=\"en\">Upgraded Final URL (Smartphone).<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing upgraded Final URL (Smartphone) will be deleted.</div> 
   * @return smartphoneFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URL（スマートフォン）です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存の最終リンク先URL（スマートフォン）は削除されます。</div> <div lang=\"en\">Upgraded Final URL (Smartphone).<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing upgraded Final URL (Smartphone) will be deleted.</div> ")


  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }

  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion finalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">移行後の最終リンク先URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。※ADD時、移行してtracking Urlを指定している場合は必須となります。<br> ※空で設定すると、既存の移行後の最終リンク先URLは削除されます。</div> <div lang=\"en\">Upgraded Final URL.<br> This field is optional in ADD and SET operation. *If upgraded and tracking Url is specified, it is required in ADD operation.<br> *When this is set blank, existing upgraded Final URL will be deleted.</div> 
   * @return finalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">移行後の最終リンク先URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。※ADD時、移行してtracking Urlを指定している場合は必須となります。<br> ※空で設定すると、既存の移行後の最終リンク先URLは削除されます。</div> <div lang=\"en\">Upgraded Final URL.<br> This field is optional in ADD and SET operation. *If upgraded and tracking Url is specified, it is required in ADD operation.<br> *When this is set blank, existing upgraded Final URL will be deleted.</div> ")


  public String getFinalUrl() {
    return finalUrl;
  }

  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion approvalStatus(AdGroupCriterionServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(AdGroupCriterionServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion bid(AdGroupCriterionServiceBid bid) {
    this.bid = bid;
    return this;
  }

  /**
   * Get bid
   * @return bid
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionServiceBid getBid() {
    return bid;
  }

  public void setBid(AdGroupCriterionServiceBid bid) {
    this.bid = bid;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion customParameters(AdGroupCriterionServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionServiceCustomParameters getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(AdGroupCriterionServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">移行前のカスタムURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存の移行前のカスタムURLは削除されます。</div> <div lang=\"en\">Custom URL of before upgrading.<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing Custom URL before upgrade will be deleted.</div> 
   * @return destinationUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">移行前のカスタムURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存の移行前のカスタムURLは削除されます。</div> <div lang=\"en\">Custom URL of before upgrading.<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing Custom URL before upgrade will be deleted.</div> ")


  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)</div> <div lang=\"en\">Code of Disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details)</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)</div> <div lang=\"en\">Code of Disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details)</div> ")


  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion reviewSmartphoneFinalUrl(String reviewSmartphoneFinalUrl) {
    this.reviewSmartphoneFinalUrl = reviewSmartphoneFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">配信審査中の最終リンク先URL（スマートフォン）です。</div> <div lang=\"en\">Upgraded Final URL (Smartphone), in review.</div> 
   * @return reviewSmartphoneFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信審査中の最終リンク先URL（スマートフォン）です。</div> <div lang=\"en\">Upgraded Final URL (Smartphone), in review.</div> ")


  public String getReviewSmartphoneFinalUrl() {
    return reviewSmartphoneFinalUrl;
  }

  public void setReviewSmartphoneFinalUrl(String reviewSmartphoneFinalUrl) {
    this.reviewSmartphoneFinalUrl = reviewSmartphoneFinalUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion reviewFinalUrl(String reviewFinalUrl) {
    this.reviewFinalUrl = reviewFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">移行後の配信審査中の最終リンク先URLです。</div> <div lang=\"en\">Upgraded Final URL, in review.</div> 
   * @return reviewFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">移行後の配信審査中の最終リンク先URLです。</div> <div lang=\"en\">Upgraded Final URL, in review.</div> ")


  public String getReviewFinalUrl() {
    return reviewFinalUrl;
  }

  public void setReviewFinalUrl(String reviewFinalUrl) {
    this.reviewFinalUrl = reviewFinalUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion reviewCustomParameters(AdGroupCriterionServiceCustomParameters reviewCustomParameters) {
    this.reviewCustomParameters = reviewCustomParameters;
    return this;
  }

  /**
   * Get reviewCustomParameters
   * @return reviewCustomParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionServiceCustomParameters getReviewCustomParameters() {
    return reviewCustomParameters;
  }

  public void setReviewCustomParameters(AdGroupCriterionServiceCustomParameters reviewCustomParameters) {
    this.reviewCustomParameters = reviewCustomParameters;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion reviewDestinationUrl(String reviewDestinationUrl) {
    this.reviewDestinationUrl = reviewDestinationUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">移行前の配信審査中のカスタムURLです。</div> <div lang=\"en\">Custom URL of before upgrading, in review.</div> 
   * @return reviewDestinationUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">移行前の配信審査中のカスタムURLです。</div> <div lang=\"en\">Custom URL of before upgrading, in review.</div> ")


  public String getReviewDestinationUrl() {
    return reviewDestinationUrl;
  }

  public void setReviewDestinationUrl(String reviewDestinationUrl) {
    this.reviewDestinationUrl = reviewDestinationUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion reviewTrackingUrl(String reviewTrackingUrl) {
    this.reviewTrackingUrl = reviewTrackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">配信審査中のトラッキングURLです。</div> <div lang=\"en\">Tracking URL, in review.</div> 
   * @return reviewTrackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信審査中のトラッキングURLです。</div> <div lang=\"en\">Tracking URL, in review.</div> ")


  public String getReviewTrackingUrl() {
    return reviewTrackingUrl;
  }

  public void setReviewTrackingUrl(String reviewTrackingUrl) {
    this.reviewTrackingUrl = reviewTrackingUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存のトラッキングURLは削除されます。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing Tracking URL will be deleted.</div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存のトラッキングURLは削除されます。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.<br> *When tag is set blank, existing Tracking URL will be deleted.</div> ")


  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public AdGroupCriterionServiceBiddableAdGroupCriterion userStatus(AdGroupCriterionServiceUserStatus userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionServiceUserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(AdGroupCriterionServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceBiddableAdGroupCriterion adGroupCriterionServiceBiddableAdGroupCriterion = (AdGroupCriterionServiceBiddableAdGroupCriterion) o;
    return Objects.equals(this.smartphoneFinalUrl, adGroupCriterionServiceBiddableAdGroupCriterion.smartphoneFinalUrl) &&
        Objects.equals(this.finalUrl, adGroupCriterionServiceBiddableAdGroupCriterion.finalUrl) &&
        Objects.equals(this.approvalStatus, adGroupCriterionServiceBiddableAdGroupCriterion.approvalStatus) &&
        Objects.equals(this.bid, adGroupCriterionServiceBiddableAdGroupCriterion.bid) &&
        Objects.equals(this.customParameters, adGroupCriterionServiceBiddableAdGroupCriterion.customParameters) &&
        Objects.equals(this.destinationUrl, adGroupCriterionServiceBiddableAdGroupCriterion.destinationUrl) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupCriterionServiceBiddableAdGroupCriterion.disapprovalReasonCodes) &&
        Objects.equals(this.reviewSmartphoneFinalUrl, adGroupCriterionServiceBiddableAdGroupCriterion.reviewSmartphoneFinalUrl) &&
        Objects.equals(this.reviewFinalUrl, adGroupCriterionServiceBiddableAdGroupCriterion.reviewFinalUrl) &&
        Objects.equals(this.reviewCustomParameters, adGroupCriterionServiceBiddableAdGroupCriterion.reviewCustomParameters) &&
        Objects.equals(this.reviewDestinationUrl, adGroupCriterionServiceBiddableAdGroupCriterion.reviewDestinationUrl) &&
        Objects.equals(this.reviewTrackingUrl, adGroupCriterionServiceBiddableAdGroupCriterion.reviewTrackingUrl) &&
        Objects.equals(this.trackingUrl, adGroupCriterionServiceBiddableAdGroupCriterion.trackingUrl) &&
        Objects.equals(this.userStatus, adGroupCriterionServiceBiddableAdGroupCriterion.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smartphoneFinalUrl, finalUrl, approvalStatus, bid, customParameters, destinationUrl, disapprovalReasonCodes, reviewSmartphoneFinalUrl, reviewFinalUrl, reviewCustomParameters, reviewDestinationUrl, reviewTrackingUrl, trackingUrl, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceBiddableAdGroupCriterion {\n");
    
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    reviewSmartphoneFinalUrl: ").append(toIndentedString(reviewSmartphoneFinalUrl)).append("\n");
    sb.append("    reviewFinalUrl: ").append(toIndentedString(reviewFinalUrl)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

