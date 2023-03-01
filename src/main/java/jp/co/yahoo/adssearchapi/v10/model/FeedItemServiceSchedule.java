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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v10.model.FeedItemServiceDayOfWeek;
import jp.co.yahoo.adssearchapi.v10.model.FeedItemServiceMinuteOfHour;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceScheduleオブジェクトは、広告表示オプションの配信スケジュール設定を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceSchedule object describes display schedule from Ad Display Option.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceScheduleオブジェクトは、広告表示オプションの配信スケジュール設定を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">FeedItemServiceSchedule object describes display schedule from Ad Display Option.<br> This field is optional in ADD and SET operation.</div> ")
@JsonPropertyOrder({
  FeedItemServiceSchedule.JSON_PROPERTY_DAY_OF_WEEK,
  FeedItemServiceSchedule.JSON_PROPERTY_END_HOUR,
  FeedItemServiceSchedule.JSON_PROPERTY_END_MINUTE,
  FeedItemServiceSchedule.JSON_PROPERTY_START_HOUR,
  FeedItemServiceSchedule.JSON_PROPERTY_START_MINUTE
})
@JsonTypeName("FeedItemServiceSchedule")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItemServiceSchedule {
  public static final String JSON_PROPERTY_DAY_OF_WEEK = "dayOfWeek";
  private FeedItemServiceDayOfWeek dayOfWeek;

  public static final String JSON_PROPERTY_END_HOUR = "endHour";
  private Long endHour;

  public static final String JSON_PROPERTY_END_MINUTE = "endMinute";
  private FeedItemServiceMinuteOfHour endMinute;

  public static final String JSON_PROPERTY_START_HOUR = "startHour";
  private Long startHour;

  public static final String JSON_PROPERTY_START_MINUTE = "startMinute";
  private FeedItemServiceMinuteOfHour startMinute;

  public FeedItemServiceSchedule() { 
  }

  public FeedItemServiceSchedule dayOfWeek(FeedItemServiceDayOfWeek dayOfWeek) {
    
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }


  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfWeek(FeedItemServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public FeedItemServiceSchedule endHour(Long endHour) {
    
    this.endHour = endHour;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;終了時です。&lt;br&gt; ※0 ～ 24の範囲で設定してください。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End time in hour.&lt;br&gt; *Specify from 0 - 24.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return endHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">終了時です。<br> ※0 ～ 24の範囲で設定してください。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">End time in hour.<br> *Specify from 0 - 24.<br> This field is required in ADD and SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndHour() {
    return endHour;
  }


  @JsonProperty(JSON_PROPERTY_END_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndHour(Long endHour) {
    this.endHour = endHour;
  }


  public FeedItemServiceSchedule endMinute(FeedItemServiceMinuteOfHour endMinute) {
    
    this.endMinute = endMinute;
    return this;
  }

   /**
   * Get endMinute
   * @return endMinute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceMinuteOfHour getEndMinute() {
    return endMinute;
  }


  @JsonProperty(JSON_PROPERTY_END_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndMinute(FeedItemServiceMinuteOfHour endMinute) {
    this.endMinute = endMinute;
  }


  public FeedItemServiceSchedule startHour(Long startHour) {
    
    this.startHour = startHour;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始時です。&lt;br&gt; ※0 ～ 23の範囲で設定してください。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start time in hour.&lt;br&gt;*Specify from 0 - 23.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return startHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始時です。<br> ※0 ～ 23の範囲で設定してください。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">Start time in hour.<br>*Specify from 0 - 23.<br> This field is required in ADD and SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartHour() {
    return startHour;
  }


  @JsonProperty(JSON_PROPERTY_START_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartHour(Long startHour) {
    this.startHour = startHour;
  }


  public FeedItemServiceSchedule startMinute(FeedItemServiceMinuteOfHour startMinute) {
    
    this.startMinute = startMinute;
    return this;
  }

   /**
   * Get startMinute
   * @return startMinute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceMinuteOfHour getStartMinute() {
    return startMinute;
  }


  @JsonProperty(JSON_PROPERTY_START_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartMinute(FeedItemServiceMinuteOfHour startMinute) {
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
    FeedItemServiceSchedule feedItemServiceSchedule = (FeedItemServiceSchedule) o;
    return Objects.equals(this.dayOfWeek, feedItemServiceSchedule.dayOfWeek) &&
        Objects.equals(this.endHour, feedItemServiceSchedule.endHour) &&
        Objects.equals(this.endMinute, feedItemServiceSchedule.endMinute) &&
        Objects.equals(this.startHour, feedItemServiceSchedule.startHour) &&
        Objects.equals(this.startMinute, feedItemServiceSchedule.startMinute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, endHour, endMinute, startHour, startMinute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceSchedule {\n");
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
