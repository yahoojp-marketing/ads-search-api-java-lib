/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v10.model.AssetServiceSchedule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceQuickLinkAssetオブジェクトは、クイックリンクオプションのアセット情報を格納します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※typeがQUICKLINKの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceQuickLinkAsset contains Asset value information for quicklink options.&lt;br&gt; This field is optional in ADD operation. *If type is QUICKLINK, this field is required.&lt;br&gt;&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AssetServiceQuickLinkAsset.JSON_PROPERTY_LINK_TEXT,
  AssetServiceQuickLinkAsset.JSON_PROPERTY_REVIEW_LINK_TEXT,
  AssetServiceQuickLinkAsset.JSON_PROPERTY_DESCRIPTION1,
  AssetServiceQuickLinkAsset.JSON_PROPERTY_REVIEW_DESCRIPTION1,
  AssetServiceQuickLinkAsset.JSON_PROPERTY_DESCRIPTION2,
  AssetServiceQuickLinkAsset.JSON_PROPERTY_REVIEW_DESCRIPTION2,
  AssetServiceQuickLinkAsset.JSON_PROPERTY_START_DATE,
  AssetServiceQuickLinkAsset.JSON_PROPERTY_END_DATE,
  AssetServiceQuickLinkAsset.JSON_PROPERTY_SCHEDULES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetServiceQuickLinkAsset {
  public static final String JSON_PROPERTY_LINK_TEXT = "linkText";
  private String linkText;

  public static final String JSON_PROPERTY_REVIEW_LINK_TEXT = "reviewLinkText";
  private String reviewLinkText;

  public static final String JSON_PROPERTY_DESCRIPTION1 = "description1";
  private String description1;

  public static final String JSON_PROPERTY_REVIEW_DESCRIPTION1 = "reviewDescription1";
  private String reviewDescription1;

  public static final String JSON_PROPERTY_DESCRIPTION2 = "description2";
  private String description2;

  public static final String JSON_PROPERTY_REVIEW_DESCRIPTION2 = "reviewDescription2";
  private String reviewDescription2;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_SCHEDULES = "schedules";
  private List<AssetServiceSchedule> schedules;

  public AssetServiceQuickLinkAsset() {
  }

  public AssetServiceQuickLinkAsset linkText(String linkText) {
    
    this.linkText = linkText;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;リンクテキストです。&lt;br&gt; ADDおよびSET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Link text.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return linkText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkText() {
    return linkText;
  }


  @JsonProperty(JSON_PROPERTY_LINK_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }


  public AssetServiceQuickLinkAsset reviewLinkText(String reviewLinkText) {
    
    this.reviewLinkText = reviewLinkText;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中のリンクテキストです。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Link text on editorial review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewLinkText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_LINK_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewLinkText() {
    return reviewLinkText;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_LINK_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewLinkText(String reviewLinkText) {
    this.reviewLinkText = reviewLinkText;
  }


  public AssetServiceQuickLinkAsset description1(String description1) {
    
    this.description1 = description1;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;説明文1です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description 1.&lt;/div&gt; 
   * @return description1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription1() {
    return description1;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription1(String description1) {
    this.description1 = description1;
  }


  public AssetServiceQuickLinkAsset reviewDescription1(String reviewDescription1) {
    
    this.reviewDescription1 = reviewDescription1;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中の説明文1です。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description 1 on editorial review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewDescription1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_DESCRIPTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewDescription1() {
    return reviewDescription1;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_DESCRIPTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewDescription1(String reviewDescription1) {
    this.reviewDescription1 = reviewDescription1;
  }


  public AssetServiceQuickLinkAsset description2(String description2) {
    
    this.description2 = description2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;説明文2です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description 2.&lt;/div&gt; 
   * @return description2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription2() {
    return description2;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription2(String description2) {
    this.description2 = description2;
  }


  public AssetServiceQuickLinkAsset reviewDescription2(String reviewDescription2) {
    
    this.reviewDescription2 = reviewDescription2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中の説明文2です。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description 2 on editorial review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewDescription2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewDescription2() {
    return reviewDescription2;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewDescription2(String reviewDescription2) {
    this.reviewDescription2 = reviewDescription2;
  }


  public AssetServiceQuickLinkAsset startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;配信開始日です。&lt;br&gt; ※空で設定すると、既存の配信開始日は削除されます。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date of ad display&lt;br&gt; *On setting blank, existing start date of ad display will be deleted.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
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


  public AssetServiceQuickLinkAsset endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;配信終了日です。&lt;br&gt; ※空で設定すると、既存の配信終了日は削除されます。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End date of ad display.&lt;br&gt; *By setting blank, existing end date of ad display will be deleted.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
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


  public AssetServiceQuickLinkAsset schedules(List<AssetServiceSchedule> schedules) {
    
    this.schedules = schedules;
    return this;
  }

  public AssetServiceQuickLinkAsset addSchedulesItem(AssetServiceSchedule schedulesItem) {
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
    AssetServiceQuickLinkAsset assetServiceQuickLinkAsset = (AssetServiceQuickLinkAsset) o;
    return Objects.equals(this.linkText, assetServiceQuickLinkAsset.linkText) &&
        Objects.equals(this.reviewLinkText, assetServiceQuickLinkAsset.reviewLinkText) &&
        Objects.equals(this.description1, assetServiceQuickLinkAsset.description1) &&
        Objects.equals(this.reviewDescription1, assetServiceQuickLinkAsset.reviewDescription1) &&
        Objects.equals(this.description2, assetServiceQuickLinkAsset.description2) &&
        Objects.equals(this.reviewDescription2, assetServiceQuickLinkAsset.reviewDescription2) &&
        Objects.equals(this.startDate, assetServiceQuickLinkAsset.startDate) &&
        Objects.equals(this.endDate, assetServiceQuickLinkAsset.endDate) &&
        Objects.equals(this.schedules, assetServiceQuickLinkAsset.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkText, reviewLinkText, description1, reviewDescription1, description2, reviewDescription2, startDate, endDate, schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceQuickLinkAsset {\n");
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
    sb.append("    reviewLinkText: ").append(toIndentedString(reviewLinkText)).append("\n");
    sb.append("    description1: ").append(toIndentedString(description1)).append("\n");
    sb.append("    reviewDescription1: ").append(toIndentedString(reviewDescription1)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    reviewDescription2: ").append(toIndentedString(reviewDescription2)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

