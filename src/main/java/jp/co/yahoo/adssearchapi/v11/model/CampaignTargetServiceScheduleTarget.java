/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v11.model.CampaignTargetServiceDayOfWeek;
import jp.co.yahoo.adssearchapi.v11.model.CampaignTargetServiceMinuteOfHour;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceScheduleTargetオブジェクトは、曜日・時間帯ターゲティングレポートを表します。&lt;br&gt; このフィールドは、ADD時およびSET時に省略可能となります。&lt;br&gt; ※targetTypeがSCHEDULEの場合、このフィールドはADD時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServiceScheduleTarget describes Day of week/Hour targeting report.&lt;br&gt; *This field is optional in ADD and SET operation.&lt;br&gt; If targetType is SCHEDULE, this field is required in ADD operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignTargetServiceScheduleTarget.JSON_PROPERTY_DAY_OF_WEEK,
  CampaignTargetServiceScheduleTarget.JSON_PROPERTY_END_HOUR,
  CampaignTargetServiceScheduleTarget.JSON_PROPERTY_END_MINUTE,
  CampaignTargetServiceScheduleTarget.JSON_PROPERTY_START_HOUR,
  CampaignTargetServiceScheduleTarget.JSON_PROPERTY_START_MINUTE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignTargetServiceScheduleTarget {
  public static final String JSON_PROPERTY_DAY_OF_WEEK = "dayOfWeek";
  private CampaignTargetServiceDayOfWeek dayOfWeek;

  public static final String JSON_PROPERTY_END_HOUR = "endHour";
  private Integer endHour;

  public static final String JSON_PROPERTY_END_MINUTE = "endMinute";
  private CampaignTargetServiceMinuteOfHour endMinute;

  public static final String JSON_PROPERTY_START_HOUR = "startHour";
  private Integer startHour;

  public static final String JSON_PROPERTY_START_MINUTE = "startMinute";
  private CampaignTargetServiceMinuteOfHour startMinute;

  public CampaignTargetServiceScheduleTarget() {
  }

  public CampaignTargetServiceScheduleTarget dayOfWeek(CampaignTargetServiceDayOfWeek dayOfWeek) {
    
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }


  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfWeek(CampaignTargetServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public CampaignTargetServiceScheduleTarget endHour(Integer endHour) {
    
    this.endHour = endHour;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;24時間表示の終了時刻です。&lt;br&gt;このフィールドは、ADD時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ending hour in 24 hour time.&lt;br&gt;This field is required in ADD operation.&lt;/div&gt; 
   * @return endHour
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndHour() {
    return endHour;
  }


  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }


  public CampaignTargetServiceScheduleTarget endMinute(CampaignTargetServiceMinuteOfHour endMinute) {
    
    this.endMinute = endMinute;
    return this;
  }

   /**
   * Get endMinute
   * @return endMinute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceMinuteOfHour getEndMinute() {
    return endMinute;
  }


  @JsonProperty(JSON_PROPERTY_END_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndMinute(CampaignTargetServiceMinuteOfHour endMinute) {
    this.endMinute = endMinute;
  }


  public CampaignTargetServiceScheduleTarget startHour(Integer startHour) {
    
    this.startHour = startHour;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;24時間表示の開始時刻です。&lt;br&gt;このフィールドは、ADD時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Starting hour in 24 hour time.&lt;br&gt;This field is required in ADD operation.&lt;/div&gt; 
   * @return startHour
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartHour() {
    return startHour;
  }


  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }


  public CampaignTargetServiceScheduleTarget startMinute(CampaignTargetServiceMinuteOfHour startMinute) {
    
    this.startMinute = startMinute;
    return this;
  }

   /**
   * Get startMinute
   * @return startMinute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceMinuteOfHour getStartMinute() {
    return startMinute;
  }


  @JsonProperty(JSON_PROPERTY_START_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartMinute(CampaignTargetServiceMinuteOfHour startMinute) {
    this.startMinute = startMinute;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargetServiceScheduleTarget campaignTargetServiceScheduleTarget = (CampaignTargetServiceScheduleTarget) o;
    return Objects.equals(this.dayOfWeek, campaignTargetServiceScheduleTarget.dayOfWeek) &&
        Objects.equals(this.endHour, campaignTargetServiceScheduleTarget.endHour) &&
        Objects.equals(this.endMinute, campaignTargetServiceScheduleTarget.endMinute) &&
        Objects.equals(this.startHour, campaignTargetServiceScheduleTarget.startHour) &&
        Objects.equals(this.startMinute, campaignTargetServiceScheduleTarget.startMinute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, endHour, endMinute, startHour, startMinute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServiceScheduleTarget {\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    endMinute: ").append(toIndentedString(endMinute)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    startMinute: ").append(toIndentedString(startMinute)).append("\n");
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

