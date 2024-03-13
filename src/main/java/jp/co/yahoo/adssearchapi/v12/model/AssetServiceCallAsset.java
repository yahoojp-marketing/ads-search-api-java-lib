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
import jp.co.yahoo.adssearchapi.v12.model.AssetServiceSchedule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceCallAssetオブジェクトは、電話番号アセットのアセット情報を格納します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※typeがCALLの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceCallAsset contains Asset value information for call assets.&lt;br&gt; This field is optional in ADD operation. *If type is CALL, this field is required.&lt;br&gt;&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AssetServiceCallAsset.JSON_PROPERTY_PHONE_NUMBER,
  AssetServiceCallAsset.JSON_PROPERTY_REVIEW_PHONE_NUMBER,
  AssetServiceCallAsset.JSON_PROPERTY_SCHEDULES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetServiceCallAsset {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_REVIEW_PHONE_NUMBER = "reviewPhoneNumber";
  private String reviewPhoneNumber;

  public static final String JSON_PROPERTY_SCHEDULES = "schedules";
  private List<AssetServiceSchedule> schedules;

  public AssetServiceCallAsset() {
  }

  public AssetServiceCallAsset phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;電話番号です。&lt;br&gt; ADDおよびSET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Phone number.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return phoneNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public AssetServiceCallAsset reviewPhoneNumber(String reviewPhoneNumber) {
    
    this.reviewPhoneNumber = reviewPhoneNumber;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中の電話番号です。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Phone number on editorial review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewPhoneNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewPhoneNumber() {
    return reviewPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewPhoneNumber(String reviewPhoneNumber) {
    this.reviewPhoneNumber = reviewPhoneNumber;
  }


  public AssetServiceCallAsset schedules(List<AssetServiceSchedule> schedules) {
    
    this.schedules = schedules;
    return this;
  }

  public AssetServiceCallAsset addSchedulesItem(AssetServiceSchedule schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<>();
    }
    this.schedules.add(schedulesItem);
    return this;
  }

   /**
   * Get schedules
   * @return schedules
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AssetServiceSchedule> getSchedules() {
    return schedules;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedules(List<AssetServiceSchedule> schedules) {
    this.schedules = schedules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetServiceCallAsset assetServiceCallAsset = (AssetServiceCallAsset) o;
    return Objects.equals(this.phoneNumber, assetServiceCallAsset.phoneNumber) &&
        Objects.equals(this.reviewPhoneNumber, assetServiceCallAsset.reviewPhoneNumber) &&
        Objects.equals(this.schedules, assetServiceCallAsset.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, reviewPhoneNumber, schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceCallAsset {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    reviewPhoneNumber: ").append(toIndentedString(reviewPhoneNumber)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
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

