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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceUpdatedDateRangeは、更新日による検索対象期間を表します。&lt;br&gt; このフィールドを指定することで、Yahoo!広告内のシステムによる自動更新やユーザーの操作を含む更新日付を対象にキャンペーンをフィルタリングできます。&lt;br&gt; フィルタリング対象の更新日付については以下をご確認ください。&lt;br&gt; ・Yahoo!広告内のシステムによる自動更新を含むため、ユーザーの操作に起因しない更新であってもフィルタリング対象になることがあります。&lt;br&gt; ・ユーザーの操作とは、CampaignServiceのADD、SET操作による更新を指します。CampaignServiceのフィールドであっても、LabelServiceなどCampaignService以外のサービスのADD、SET操作によるデータの更新は、CampaignServiceUpdatedDateRangeで指定する更新日付のフィルタリング対象にはなりません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceUpdatedDateRange represents the search target period by the update date.&lt;br&gt; By specifying this field, you can filter campaigns based on update dates, which include both automatic updates by the Yahoo! JAPAN Ads system and updates by users. &lt;br&gt; Please note the following points about the update dates that you can filter:&lt;br&gt; * Yahoo! JAPAN Ads system makes automatic updates, so updates that are not caused by user actions may also be subject to filtering.&lt;br&gt; * User actions in this context refer to updates made through ADD and SET operations in CampaignService. Therefore, updates to CampaignService fields made through ADD and SET operations in other services, such as LabelService, can NOT be filtered by the update date specified in CampaignServiceUpdatedDateRange. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceUpdatedDateRangeは、更新日による検索対象期間を表します。<br> このフィールドを指定することで、Yahoo!広告内のシステムによる自動更新やユーザーの操作を含む更新日付を対象にキャンペーンをフィルタリングできます。<br> フィルタリング対象の更新日付については以下をご確認ください。<br> ・Yahoo!広告内のシステムによる自動更新を含むため、ユーザーの操作に起因しない更新であってもフィルタリング対象になることがあります。<br> ・ユーザーの操作とは、CampaignServiceのADD、SET操作による更新を指します。CampaignServiceのフィールドであっても、LabelServiceなどCampaignService以外のサービスのADD、SET操作によるデータの更新は、CampaignServiceUpdatedDateRangeで指定する更新日付のフィルタリング対象にはなりません。 </div> <div lang=\"en\"> CampaignServiceUpdatedDateRange represents the search target period by the update date.<br> By specifying this field, you can filter campaigns based on update dates, which include both automatic updates by the Yahoo! JAPAN Ads system and updates by users. <br> Please note the following points about the update dates that you can filter:<br> * Yahoo! JAPAN Ads system makes automatic updates, so updates that are not caused by user actions may also be subject to filtering.<br> * User actions in this context refer to updates made through ADD and SET operations in CampaignService. Therefore, updates to CampaignService fields made through ADD and SET operations in other services, such as LabelService, can NOT be filtered by the update date specified in CampaignServiceUpdatedDateRange. </div> ")
@JsonPropertyOrder({
  CampaignServiceUpdatedDateRange.JSON_PROPERTY_START_DATE,
  CampaignServiceUpdatedDateRange.JSON_PROPERTY_END_DATE
})
@JsonTypeName("CampaignServiceUpdatedDateRange")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceUpdatedDateRange {
  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public CampaignServiceUpdatedDateRange() { 
  }

  public CampaignServiceUpdatedDateRange startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 検索対象期間の開始日です。&lt;br&gt; ※フォーマット：yyyyMMdd &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; This is the start date of the search target period.&lt;br&gt; * Format: yyyyMMdd &lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索対象期間の開始日です。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> This is the start date of the search target period.<br> * Format: yyyyMMdd </div> ")
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


  public CampaignServiceUpdatedDateRange endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 検索対象期間の終了日です。&lt;br&gt; ※フォーマット：yyyyMMdd &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; This is the end date of the search target period.&lt;br&gt; * Format: yyyyMMdd &lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索対象期間の終了日です。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> This is the end date of the search target period.<br> * Format: yyyyMMdd </div> ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceUpdatedDateRange campaignServiceUpdatedDateRange = (CampaignServiceUpdatedDateRange) o;
    return Objects.equals(this.startDate, campaignServiceUpdatedDateRange.startDate) &&
        Objects.equals(this.endDate, campaignServiceUpdatedDateRange.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceUpdatedDateRange {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

