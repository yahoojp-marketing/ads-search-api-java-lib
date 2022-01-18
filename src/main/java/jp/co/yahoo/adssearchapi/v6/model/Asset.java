package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceAssetData;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceCustomParameters;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceTrademarkStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Assetオブジェクトは、アセット情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Asset object contains the information of Asset.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Assetオブジェクトは、アセット情報を格納します。</div> <div lang=\"en\">Asset object contains the information of Asset.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Asset   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("assetId")
  private Long assetId = null;

  @JsonProperty("assetTrackId")
  private Long assetTrackId = null;

  @JsonProperty("assetData")
  private AssetServiceAssetData assetData = null;

  @JsonProperty("approvalStatus")
  private AssetServiceApprovalStatus approvalStatus = null;

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  @JsonProperty("invalidedTrademarks")
  @Valid
  private List<String> invalidedTrademarks = null;

  @JsonProperty("trademarkStatus")
  private AssetServiceTrademarkStatus trademarkStatus = null;

  @JsonProperty("customParameters")
  private AssetServiceCustomParameters customParameters = null;

  @JsonProperty("reviewCustomParameters")
  private AssetServiceCustomParameters reviewCustomParameters = null;

  @JsonProperty("smartphoneFinalUrl")
  private String smartphoneFinalUrl = null;

  @JsonProperty("reviewSmartphoneFinalUrl")
  private String reviewSmartphoneFinalUrl = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("reviewFinalUrl")
  private String reviewFinalUrl = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  @JsonProperty("reviewTrackingUrl")
  private String reviewTrackingUrl = null;

  public Asset accountId(Long accountId) {
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

  public Asset assetId(Long assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * <div lang=\"ja\">アセットIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時に無視されます。</div> <div lang=\"en\">Asset ID.<br>This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> 
   * @return assetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アセットIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時に無視されます。</div> <div lang=\"en\">Asset ID.<br>This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> ")


  public Long getAssetId() {
    return assetId;
  }

  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }

  public Asset assetTrackId(Long assetTrackId) {
    this.assetTrackId = assetTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用アセットIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Asset ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return assetTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用アセットIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Asset ID for tracking.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAssetTrackId() {
    return assetTrackId;
  }

  public void setAssetTrackId(Long assetTrackId) {
    this.assetTrackId = assetTrackId;
  }

  public Asset assetData(AssetServiceAssetData assetData) {
    this.assetData = assetData;
    return this;
  }

  /**
   * Get assetData
   * @return assetData
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceAssetData getAssetData() {
    return assetData;
  }

  public void setAssetData(AssetServiceAssetData assetData) {
    this.assetData = assetData;
  }

  public Asset approvalStatus(AssetServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(AssetServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public Asset disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public Asset addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public Asset invalidedTrademarks(List<String> invalidedTrademarks) {
    this.invalidedTrademarks = invalidedTrademarks;
    return this;
  }

  public Asset addInvalidedTrademarksItem(String invalidedTrademarksItem) {
    if (this.invalidedTrademarks == null) {
      this.invalidedTrademarks = new ArrayList<>();
    }
    this.invalidedTrademarks.add(invalidedTrademarksItem);
    return this;
  }

  /**
   * <div lang=\"ja\">制限された商標です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Invalided trademarks.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return invalidedTrademarks
  */
  @ApiModelProperty(value = "<div lang=\"ja\">制限された商標です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Invalided trademarks.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public List<String> getInvalidedTrademarks() {
    return invalidedTrademarks;
  }

  public void setInvalidedTrademarks(List<String> invalidedTrademarks) {
    this.invalidedTrademarks = invalidedTrademarks;
  }

  public Asset trademarkStatus(AssetServiceTrademarkStatus trademarkStatus) {
    this.trademarkStatus = trademarkStatus;
    return this;
  }

  /**
   * Get trademarkStatus
   * @return trademarkStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceTrademarkStatus getTrademarkStatus() {
    return trademarkStatus;
  }

  public void setTrademarkStatus(AssetServiceTrademarkStatus trademarkStatus) {
    this.trademarkStatus = trademarkStatus;
  }

  public Asset customParameters(AssetServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceCustomParameters getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(AssetServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }

  public Asset reviewCustomParameters(AssetServiceCustomParameters reviewCustomParameters) {
    this.reviewCustomParameters = reviewCustomParameters;
    return this;
  }

  /**
   * Get reviewCustomParameters
   * @return reviewCustomParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceCustomParameters getReviewCustomParameters() {
    return reviewCustomParameters;
  }

  public void setReviewCustomParameters(AssetServiceCustomParameters reviewCustomParameters) {
    this.reviewCustomParameters = reviewCustomParameters;
  }

  public Asset smartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URL（スマートフォン）です。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Landing Page URL (Smartphone).<br> This field is optional in ADD and SET operation.</div> 
   * @return smartphoneFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URL（スマートフォン）です。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Landing Page URL (Smartphone).<br> This field is optional in ADD and SET operation.</div> ")


  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }

  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }

  public Asset reviewSmartphoneFinalUrl(String reviewSmartphoneFinalUrl) {
    this.reviewSmartphoneFinalUrl = reviewSmartphoneFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中の最終リンク先URL（スマートフォン）です。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Landing Page URL (Smartphone) on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> 
   * @return reviewSmartphoneFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中の最終リンク先URL（スマートフォン）です。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Landing Page URL (Smartphone) on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")


  public String getReviewSmartphoneFinalUrl() {
    return reviewSmartphoneFinalUrl;
  }

  public void setReviewSmartphoneFinalUrl(String reviewSmartphoneFinalUrl) {
    this.reviewSmartphoneFinalUrl = reviewSmartphoneFinalUrl;
  }

  public Asset finalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Landing Page URL.<br> This field is optional in ADD and SET operation.</div> 
   * @return finalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Landing Page URL.<br> This field is optional in ADD and SET operation.</div> ")


  public String getFinalUrl() {
    return finalUrl;
  }

  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }

  public Asset reviewFinalUrl(String reviewFinalUrl) {
    this.reviewFinalUrl = reviewFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中の最終リンク先URLです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Landing Page URL on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> 
   * @return reviewFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中の最終リンク先URLです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Landing Page URL on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")


  public String getReviewFinalUrl() {
    return reviewFinalUrl;
  }

  public void setReviewFinalUrl(String reviewFinalUrl) {
    this.reviewFinalUrl = reviewFinalUrl;
  }

  public Asset trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.</div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.</div> ")


  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public Asset reviewTrackingUrl(String reviewTrackingUrl) {
    this.reviewTrackingUrl = reviewTrackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中のトラッキングURLです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Tracking URL on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> 
   * @return reviewTrackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のトラッキングURLです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Tracking URL on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")


  public String getReviewTrackingUrl() {
    return reviewTrackingUrl;
  }

  public void setReviewTrackingUrl(String reviewTrackingUrl) {
    this.reviewTrackingUrl = reviewTrackingUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset asset = (Asset) o;
    return Objects.equals(this.accountId, asset.accountId) &&
        Objects.equals(this.assetId, asset.assetId) &&
        Objects.equals(this.assetTrackId, asset.assetTrackId) &&
        Objects.equals(this.assetData, asset.assetData) &&
        Objects.equals(this.approvalStatus, asset.approvalStatus) &&
        Objects.equals(this.disapprovalReasonCodes, asset.disapprovalReasonCodes) &&
        Objects.equals(this.invalidedTrademarks, asset.invalidedTrademarks) &&
        Objects.equals(this.trademarkStatus, asset.trademarkStatus) &&
        Objects.equals(this.customParameters, asset.customParameters) &&
        Objects.equals(this.reviewCustomParameters, asset.reviewCustomParameters) &&
        Objects.equals(this.smartphoneFinalUrl, asset.smartphoneFinalUrl) &&
        Objects.equals(this.reviewSmartphoneFinalUrl, asset.reviewSmartphoneFinalUrl) &&
        Objects.equals(this.finalUrl, asset.finalUrl) &&
        Objects.equals(this.reviewFinalUrl, asset.reviewFinalUrl) &&
        Objects.equals(this.trackingUrl, asset.trackingUrl) &&
        Objects.equals(this.reviewTrackingUrl, asset.reviewTrackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, assetId, assetTrackId, assetData, approvalStatus, disapprovalReasonCodes, invalidedTrademarks, trademarkStatus, customParameters, reviewCustomParameters, smartphoneFinalUrl, reviewSmartphoneFinalUrl, finalUrl, reviewFinalUrl, trackingUrl, reviewTrackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetTrackId: ").append(toIndentedString(assetTrackId)).append("\n");
    sb.append("    assetData: ").append(toIndentedString(assetData)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    invalidedTrademarks: ").append(toIndentedString(invalidedTrademarks)).append("\n");
    sb.append("    trademarkStatus: ").append(toIndentedString(trademarkStatus)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    reviewCustomParameters: ").append(toIndentedString(reviewCustomParameters)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    reviewSmartphoneFinalUrl: ").append(toIndentedString(reviewSmartphoneFinalUrl)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    reviewFinalUrl: ").append(toIndentedString(reviewFinalUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    reviewTrackingUrl: ").append(toIndentedString(reviewTrackingUrl)).append("\n");
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

