/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v15.model.CampaignServiceReviewUrl;
import jp.co.yahoo.adssearchapi.v15.model.CampaignServiceUrlApprovalStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceUrlReviewDataオブジェクトは、URLの審査状況を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceUrlReviewData object displays review status of URL.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceUrlReviewData.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  CampaignServiceUrlReviewData.JSON_PROPERTY_DISAPPROVAL_REVIEW_URL,
  CampaignServiceUrlReviewData.JSON_PROPERTY_IN_REVIEW_URL,
  CampaignServiceUrlReviewData.JSON_PROPERTY_URL_APPROVAL_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceUrlReviewData {
  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes;

  public static final String JSON_PROPERTY_DISAPPROVAL_REVIEW_URL = "disapprovalReviewUrl";
  private CampaignServiceReviewUrl disapprovalReviewUrl;

  public static final String JSON_PROPERTY_IN_REVIEW_URL = "inReviewUrl";
  private CampaignServiceReviewUrl inReviewUrl;

  public static final String JSON_PROPERTY_URL_APPROVAL_STATUS = "urlApprovalStatus";
  private CampaignServiceUrlApprovalStatus urlApprovalStatus;

  public CampaignServiceUrlReviewData() {
  }

  public CampaignServiceUrlReviewData disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public CampaignServiceUrlReviewData addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由コードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Code of Disapproval reason.&lt;br&gt;&lt;/div&gt; 
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


  public CampaignServiceUrlReviewData disapprovalReviewUrl(CampaignServiceReviewUrl disapprovalReviewUrl) {
    
    this.disapprovalReviewUrl = disapprovalReviewUrl;
    return this;
  }

   /**
   * Get disapprovalReviewUrl
   * @return disapprovalReviewUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceReviewUrl getDisapprovalReviewUrl() {
    return disapprovalReviewUrl;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReviewUrl(CampaignServiceReviewUrl disapprovalReviewUrl) {
    this.disapprovalReviewUrl = disapprovalReviewUrl;
  }


  public CampaignServiceUrlReviewData inReviewUrl(CampaignServiceReviewUrl inReviewUrl) {
    
    this.inReviewUrl = inReviewUrl;
    return this;
  }

   /**
   * Get inReviewUrl
   * @return inReviewUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_REVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceReviewUrl getInReviewUrl() {
    return inReviewUrl;
  }


  @JsonProperty(JSON_PROPERTY_IN_REVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInReviewUrl(CampaignServiceReviewUrl inReviewUrl) {
    this.inReviewUrl = inReviewUrl;
  }


  public CampaignServiceUrlReviewData urlApprovalStatus(CampaignServiceUrlApprovalStatus urlApprovalStatus) {
    
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

  public CampaignServiceUrlApprovalStatus getUrlApprovalStatus() {
    return urlApprovalStatus;
  }


  @JsonProperty(JSON_PROPERTY_URL_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlApprovalStatus(CampaignServiceUrlApprovalStatus urlApprovalStatus) {
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
    CampaignServiceUrlReviewData campaignServiceUrlReviewData = (CampaignServiceUrlReviewData) o;
    return Objects.equals(this.disapprovalReasonCodes, campaignServiceUrlReviewData.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReviewUrl, campaignServiceUrlReviewData.disapprovalReviewUrl) &&
        Objects.equals(this.inReviewUrl, campaignServiceUrlReviewData.inReviewUrl) &&
        Objects.equals(this.urlApprovalStatus, campaignServiceUrlReviewData.urlApprovalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disapprovalReasonCodes, disapprovalReviewUrl, inReviewUrl, urlApprovalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceUrlReviewData {\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReviewUrl: ").append(toIndentedString(disapprovalReviewUrl)).append("\n");
    sb.append("    inReviewUrl: ").append(toIndentedString(inReviewUrl)).append("\n");
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

