package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AccountTrackingUrlServiceUrlApprovalStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountTrackingUrlオブジェクトは、アカウントトラッキングの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountTrackingUrl object describes account tracking information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountTrackingUrlオブジェクトは、アカウントトラッキングの情報を表します。</div> <div lang=\"en\">AccountTrackingUrl object describes account tracking information.</div> ")

public class AccountTrackingUrl   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("accountName")
  private JsonNullable<String> accountName = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  @JsonProperty("disapprovalReviewUrl")
  private JsonNullable<String> disapprovalReviewUrl = JsonNullable.undefined();

  @JsonProperty("inReviewUrl")
  private JsonNullable<String> inReviewUrl = JsonNullable.undefined();

  @JsonProperty("trackingUrl")
  private JsonNullable<String> trackingUrl = JsonNullable.undefined();

  @JsonProperty("urlApprovalStatus")
  private JsonNullable<AccountTrackingUrlServiceUrlApprovalStatus> urlApprovalStatus = JsonNullable.undefined();

  public AccountTrackingUrl accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required in SET operation.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required in SET operation.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public AccountTrackingUrl accountName(String accountName) {
    this.accountName = JsonNullable.of(accountName);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウント名です。</div> <div lang=\"en\">Account name.</div> 
   * @return accountName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント名です。</div> <div lang=\"en\">Account name.</div> ")


  public JsonNullable<String> getAccountName() {
    return accountName;
  }

  public void setAccountName(JsonNullable<String> accountName) {
    this.accountName = accountName;
  }

  public AccountTrackingUrl disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public AccountTrackingUrl addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Code of disapproval reason.</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Code of disapproval reason.</div> ")


  public JsonNullable<List<String>> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(JsonNullable<List<String>> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public AccountTrackingUrl disapprovalReviewUrl(String disapprovalReviewUrl) {
    this.disapprovalReviewUrl = JsonNullable.of(disapprovalReviewUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認されたトラッキングURLです。</div> <div lang=\"en\">Tracking URL that has been disapproved.</div> 
   * @return disapprovalReviewUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認されたトラッキングURLです。</div> <div lang=\"en\">Tracking URL that has been disapproved.</div> ")


  public JsonNullable<String> getDisapprovalReviewUrl() {
    return disapprovalReviewUrl;
  }

  public void setDisapprovalReviewUrl(JsonNullable<String> disapprovalReviewUrl) {
    this.disapprovalReviewUrl = disapprovalReviewUrl;
  }

  public AccountTrackingUrl inReviewUrl(String inReviewUrl) {
    this.inReviewUrl = JsonNullable.of(inReviewUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">審査中のトラッキングURLです。</div> <div lang=\"en\">Tracking URL that is in review.</div> 
   * @return inReviewUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のトラッキングURLです。</div> <div lang=\"en\">Tracking URL that is in review.</div> ")


  public JsonNullable<String> getInReviewUrl() {
    return inReviewUrl;
  }

  public void setInReviewUrl(JsonNullable<String> inReviewUrl) {
    this.inReviewUrl = inReviewUrl;
  }

  public AccountTrackingUrl trackingUrl(String trackingUrl) {
    this.trackingUrl = JsonNullable.of(trackingUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> SET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存のトラッキングURLは削除されます。</div> <div lang=\"en\">Tracking URL.<br> this field is optional in SET operation.<br> *When tag is set blank, existing Tracking URL will be deleted.</div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> SET時、このフィールドは省略可能となります。<br> ※空で設定すると、既存のトラッキングURLは削除されます。</div> <div lang=\"en\">Tracking URL.<br> this field is optional in SET operation.<br> *When tag is set blank, existing Tracking URL will be deleted.</div> ")


  public JsonNullable<String> getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(JsonNullable<String> trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public AccountTrackingUrl urlApprovalStatus(AccountTrackingUrlServiceUrlApprovalStatus urlApprovalStatus) {
    this.urlApprovalStatus = JsonNullable.of(urlApprovalStatus);
    return this;
  }

  /**
   * Get urlApprovalStatus
   * @return urlApprovalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountTrackingUrlServiceUrlApprovalStatus> getUrlApprovalStatus() {
    return urlApprovalStatus;
  }

  public void setUrlApprovalStatus(JsonNullable<AccountTrackingUrlServiceUrlApprovalStatus> urlApprovalStatus) {
    this.urlApprovalStatus = urlApprovalStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTrackingUrl accountTrackingUrl = (AccountTrackingUrl) o;
    return Objects.equals(this.accountId, accountTrackingUrl.accountId) &&
        Objects.equals(this.accountName, accountTrackingUrl.accountName) &&
        Objects.equals(this.disapprovalReasonCodes, accountTrackingUrl.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReviewUrl, accountTrackingUrl.disapprovalReviewUrl) &&
        Objects.equals(this.inReviewUrl, accountTrackingUrl.inReviewUrl) &&
        Objects.equals(this.trackingUrl, accountTrackingUrl.trackingUrl) &&
        Objects.equals(this.urlApprovalStatus, accountTrackingUrl.urlApprovalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, disapprovalReasonCodes, disapprovalReviewUrl, inReviewUrl, trackingUrl, urlApprovalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTrackingUrl {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReviewUrl: ").append(toIndentedString(disapprovalReviewUrl)).append("\n");
    sb.append("    inReviewUrl: ").append(toIndentedString(inReviewUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    urlApprovalStatus: ").append(toIndentedString(urlApprovalStatus)).append("\n");
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

