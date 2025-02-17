/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v13.model.AssetServiceSchedule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceCalloutAssetオブジェクトは、テキスト補足アセットのアセット情報を格納します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※typeがCALLOUTの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceCalloutAsset contains Asset value information for callout options.&lt;br&gt; This field is optional in ADD operation. *If type is CALLOUT, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceCalloutAssetオブジェクトは、テキスト補足アセットのアセット情報を格納します。<br> ADD時、このフィールドは省略可能となります。※typeがCALLOUTの場合は必須です。</div> <div lang=\"en\">AssetServiceCalloutAsset contains Asset value information for callout options.<br> This field is optional in ADD operation. *If type is CALLOUT, this field is required.</div> ")
@JsonPropertyOrder({
  AssetServiceCalloutAsset.JSON_PROPERTY_CALLOUT_TEXT,
  AssetServiceCalloutAsset.JSON_PROPERTY_REVIEW_CALLOUT_TEXT,
  AssetServiceCalloutAsset.JSON_PROPERTY_START_DATE,
  AssetServiceCalloutAsset.JSON_PROPERTY_END_DATE,
  AssetServiceCalloutAsset.JSON_PROPERTY_SCHEDULES
})
@JsonTypeName("AssetServiceCalloutAsset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetServiceCalloutAsset {
  public static final String JSON_PROPERTY_CALLOUT_TEXT = "calloutText";
  private String calloutText;

  public static final String JSON_PROPERTY_REVIEW_CALLOUT_TEXT = "reviewCalloutText";
  private String reviewCalloutText;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_SCHEDULES = "schedules";
  private List<AssetServiceSchedule> schedules = null;

  public AssetServiceCalloutAsset() { 
  }

  public AssetServiceCalloutAsset calloutText(String calloutText) {
    
    this.calloutText = calloutText;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コールアウトテキストです。&lt;br&gt; ADDおよびSET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Callout text.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return calloutText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コールアウトテキストです。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Callout text.<br> This field is required in ADD and SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_CALLOUT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCalloutText() {
    return calloutText;
  }


  @JsonProperty(JSON_PROPERTY_CALLOUT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalloutText(String calloutText) {
    this.calloutText = calloutText;
  }


  public AssetServiceCalloutAsset reviewCalloutText(String reviewCalloutText) {
    
    this.reviewCalloutText = reviewCalloutText;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中のコールアウトテキストです。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Callout text on editorial review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewCalloutText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のコールアウトテキストです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Callout text on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")
  @JsonProperty(JSON_PROPERTY_REVIEW_CALLOUT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewCalloutText() {
    return reviewCalloutText;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_CALLOUT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewCalloutText(String reviewCalloutText) {
    this.reviewCalloutText = reviewCalloutText;
  }


  public AssetServiceCalloutAsset startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;配信開始日です。&lt;br&gt; ※空で設定すると、既存の配信開始日は削除されます。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date of ad display&lt;br&gt; *On setting blank, existing start date of ad display will be deleted.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">配信開始日です。<br> ※空で設定すると、既存の配信開始日は削除されます。<br> このフィールドは、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">Start date of ad display<br> *On setting blank, existing start date of ad display will be deleted.<br> This field is optional in ADD and SET operation.</div> ")
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


  public AssetServiceCalloutAsset endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;配信終了日です。&lt;br&gt; ※空で設定すると、既存の配信終了日は削除されます。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End date of ad display.&lt;br&gt; *By setting blank, existing end date of ad display will be deleted.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">配信終了日です。<br> ※空で設定すると、既存の配信終了日は削除されます。<br> このフィールドは、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">End date of ad display.<br> *By setting blank, existing end date of ad display will be deleted.<br> This field is optional in ADD and SET operation.</div> ")
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


  public AssetServiceCalloutAsset schedules(List<AssetServiceSchedule> schedules) {
    
    this.schedules = schedules;
    return this;
  }

  public AssetServiceCalloutAsset addSchedulesItem(AssetServiceSchedule schedulesItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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
    AssetServiceCalloutAsset assetServiceCalloutAsset = (AssetServiceCalloutAsset) o;
    return Objects.equals(this.calloutText, assetServiceCalloutAsset.calloutText) &&
        Objects.equals(this.reviewCalloutText, assetServiceCalloutAsset.reviewCalloutText) &&
        Objects.equals(this.startDate, assetServiceCalloutAsset.startDate) &&
        Objects.equals(this.endDate, assetServiceCalloutAsset.endDate) &&
        Objects.equals(this.schedules, assetServiceCalloutAsset.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calloutText, reviewCalloutText, startDate, endDate, schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceCalloutAsset {\n");
    sb.append("    calloutText: ").append(toIndentedString(calloutText)).append("\n");
    sb.append("    reviewCalloutText: ").append(toIndentedString(reviewCalloutText)).append("\n");
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

