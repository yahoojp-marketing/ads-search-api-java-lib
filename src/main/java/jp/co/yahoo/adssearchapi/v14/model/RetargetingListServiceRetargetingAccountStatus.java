/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v14.model.RetargetingListServiceReviewStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceRetargetingAccountStatusは、アカウントのリタゲ審査ステータスを保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceRetargetingAccountStatus is an object that holds retargeting review status of account.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RetargetingListServiceRetargetingAccountStatus.JSON_PROPERTY_AGREE_DATE,
  RetargetingListServiceRetargetingAccountStatus.JSON_PROPERTY_REVIEW_REQUEST_DATE,
  RetargetingListServiceRetargetingAccountStatus.JSON_PROPERTY_REVIEW_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceRetargetingAccountStatus {
  public static final String JSON_PROPERTY_AGREE_DATE = "agreeDate";
  private String agreeDate;

  public static final String JSON_PROPERTY_REVIEW_REQUEST_DATE = "reviewRequestDate";
  private String reviewRequestDate;

  public static final String JSON_PROPERTY_REVIEW_STATUS = "reviewStatus";
  private RetargetingListServiceReviewStatus reviewStatus;

  public RetargetingListServiceRetargetingAccountStatus() {
  }

  public RetargetingListServiceRetargetingAccountStatus agreeDate(String agreeDate) {
    
    this.agreeDate = agreeDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;規約同意日です。&lt;br&gt; ※YYYYMMDD形式です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Agreement date.&lt;br&gt; *In YYYYMMDD format.&lt;/div&gt; 
   * @return agreeDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGREE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgreeDate() {
    return agreeDate;
  }


  @JsonProperty(JSON_PROPERTY_AGREE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgreeDate(String agreeDate) {
    this.agreeDate = agreeDate;
  }


  public RetargetingListServiceRetargetingAccountStatus reviewRequestDate(String reviewRequestDate) {
    
    this.reviewRequestDate = reviewRequestDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;再審査依頼日です。&lt;br&gt; ※YYYYMMDD形式です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Re-examination review request date.&lt;br&gt; *In YYYYMMDD format.&lt;/div&gt; 
   * @return reviewRequestDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_REQUEST_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewRequestDate() {
    return reviewRequestDate;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_REQUEST_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewRequestDate(String reviewRequestDate) {
    this.reviewRequestDate = reviewRequestDate;
  }


  public RetargetingListServiceRetargetingAccountStatus reviewStatus(RetargetingListServiceReviewStatus reviewStatus) {
    
    this.reviewStatus = reviewStatus;
    return this;
  }

   /**
   * Get reviewStatus
   * @return reviewStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceReviewStatus getReviewStatus() {
    return reviewStatus;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewStatus(RetargetingListServiceReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceRetargetingAccountStatus retargetingListServiceRetargetingAccountStatus = (RetargetingListServiceRetargetingAccountStatus) o;
    return Objects.equals(this.agreeDate, retargetingListServiceRetargetingAccountStatus.agreeDate) &&
        Objects.equals(this.reviewRequestDate, retargetingListServiceRetargetingAccountStatus.reviewRequestDate) &&
        Objects.equals(this.reviewStatus, retargetingListServiceRetargetingAccountStatus.reviewStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreeDate, reviewRequestDate, reviewStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceRetargetingAccountStatus {\n");
    sb.append("    agreeDate: ").append(toIndentedString(agreeDate)).append("\n");
    sb.append("    reviewRequestDate: ").append(toIndentedString(reviewRequestDate)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
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

