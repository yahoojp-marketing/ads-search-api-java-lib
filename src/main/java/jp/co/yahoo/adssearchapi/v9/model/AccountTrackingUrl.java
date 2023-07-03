/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v9.model.AccountTrackingUrlServiceUrlApprovalStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountTrackingUrlオブジェクトは、アカウントトラッキングの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountTrackingUrl object describes account tracking information.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AccountTrackingUrl.JSON_PROPERTY_ACCOUNT_ID,
  AccountTrackingUrl.JSON_PROPERTY_ACCOUNT_NAME,
  AccountTrackingUrl.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  AccountTrackingUrl.JSON_PROPERTY_DISAPPROVAL_REVIEW_URL,
  AccountTrackingUrl.JSON_PROPERTY_IN_REVIEW_URL,
  AccountTrackingUrl.JSON_PROPERTY_TRACKING_URL,
  AccountTrackingUrl.JSON_PROPERTY_URL_APPROVAL_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountTrackingUrl {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "accountName";
  private String accountName;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes;

  public static final String JSON_PROPERTY_DISAPPROVAL_REVIEW_URL = "disapprovalReviewUrl";
  private String disapprovalReviewUrl;

  public static final String JSON_PROPERTY_IN_REVIEW_URL = "inReviewUrl";
  private String inReviewUrl;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public static final String JSON_PROPERTY_URL_APPROVAL_STATUS = "urlApprovalStatus";
  private AccountTrackingUrlServiceUrlApprovalStatus urlApprovalStatus;

  public AccountTrackingUrl() {
  }

  public AccountTrackingUrl accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; SET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
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


  public AccountTrackingUrl accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account name.&lt;/div&gt; 
   * @return accountName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountName() {
    return accountName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public AccountTrackingUrl disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AccountTrackingUrl addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由コードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Code of disapproval reason.&lt;/div&gt; 
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


  public AccountTrackingUrl disapprovalReviewUrl(String disapprovalReviewUrl) {
    
    this.disapprovalReviewUrl = disapprovalReviewUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認されたトラッキングURLです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL that has been disapproved.&lt;/div&gt; 
   * @return disapprovalReviewUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisapprovalReviewUrl() {
    return disapprovalReviewUrl;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReviewUrl(String disapprovalReviewUrl) {
    this.disapprovalReviewUrl = disapprovalReviewUrl;
  }


  public AccountTrackingUrl inReviewUrl(String inReviewUrl) {
    
    this.inReviewUrl = inReviewUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中のトラッキングURLです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL that is in review.&lt;/div&gt; 
   * @return inReviewUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_REVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInReviewUrl() {
    return inReviewUrl;
  }


  @JsonProperty(JSON_PROPERTY_IN_REVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInReviewUrl(String inReviewUrl) {
    this.inReviewUrl = inReviewUrl;
  }


  public AccountTrackingUrl trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; ※空で設定すると、既存のトラッキングURLは削除されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; this field is optional in SET operation.&lt;br&gt; *When tag is set blank, existing Tracking URL will be deleted.&lt;/div&gt; 
   * @return trackingUrl
  **/
  @jakarta.annotation.Nullable
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


  public AccountTrackingUrl urlApprovalStatus(AccountTrackingUrlServiceUrlApprovalStatus urlApprovalStatus) {
    
    this.urlApprovalStatus = urlApprovalStatus;
    return this;
  }

   /**
   * Get urlApprovalStatus
   * @return urlApprovalStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountTrackingUrlServiceUrlApprovalStatus getUrlApprovalStatus() {
    return urlApprovalStatus;
  }


  @JsonProperty(JSON_PROPERTY_URL_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlApprovalStatus(AccountTrackingUrlServiceUrlApprovalStatus urlApprovalStatus) {
    this.urlApprovalStatus = urlApprovalStatus;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

