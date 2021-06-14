package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignTargetServiceDayOfWeek;
import jp.co.yahoo.adssearchapi.v5.model.CampaignTargetServiceMinuteOfHour;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceScheduleTargetオブジェクトは、曜日・時間帯ターゲティングレポートを表します。&lt;br&gt; このフィールドは、ADD時およびSET時に省略可能となります。&lt;br&gt; ※targetTypeがSCHEDULEの場合、このフィールドはADD時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServiceScheduleTarget describes Day of week/Hour targeting report.&lt;br&gt; *This field is optional in ADD and SET operation.&lt;br&gt; If targetType is SCHEDULE, this field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetServiceScheduleTargetオブジェクトは、曜日・時間帯ターゲティングレポートを表します。<br> このフィールドは、ADD時およびSET時に省略可能となります。<br> ※targetTypeがSCHEDULEの場合、このフィールドはADD時に必須となります。</div> <div lang=\"en\">CampaignTargetServiceScheduleTarget describes Day of week/Hour targeting report.<br> *This field is optional in ADD and SET operation.<br> If targetType is SCHEDULE, this field is required in ADD operation.</div> ")

public class CampaignTargetServiceScheduleTarget   {
  @JsonProperty("dayOfWeek")
  private JsonNullable<CampaignTargetServiceDayOfWeek> dayOfWeek = JsonNullable.undefined();

  @JsonProperty("endHour")
  private JsonNullable<Integer> endHour = JsonNullable.undefined();

  @JsonProperty("endMinute")
  private JsonNullable<CampaignTargetServiceMinuteOfHour> endMinute = JsonNullable.undefined();

  @JsonProperty("startHour")
  private JsonNullable<Integer> startHour = JsonNullable.undefined();

  @JsonProperty("startMinute")
  private JsonNullable<CampaignTargetServiceMinuteOfHour> startMinute = JsonNullable.undefined();

  public CampaignTargetServiceScheduleTarget dayOfWeek(CampaignTargetServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = JsonNullable.of(dayOfWeek);
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignTargetServiceDayOfWeek> getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(JsonNullable<CampaignTargetServiceDayOfWeek> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public CampaignTargetServiceScheduleTarget endHour(Integer endHour) {
    this.endHour = JsonNullable.of(endHour);
    return this;
  }

  /**
   * <div lang=\"ja\">24時間表示の終了時刻です。<br>このフィールドは、ADD時に必須となります。</div> <div lang=\"en\">Ending hour in 24 hour time.<br>This field is required in ADD operation.</div> 
   * @return endHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\">24時間表示の終了時刻です。<br>このフィールドは、ADD時に必須となります。</div> <div lang=\"en\">Ending hour in 24 hour time.<br>This field is required in ADD operation.</div> ")


  public JsonNullable<Integer> getEndHour() {
    return endHour;
  }

  public void setEndHour(JsonNullable<Integer> endHour) {
    this.endHour = endHour;
  }

  public CampaignTargetServiceScheduleTarget endMinute(CampaignTargetServiceMinuteOfHour endMinute) {
    this.endMinute = JsonNullable.of(endMinute);
    return this;
  }

  /**
   * Get endMinute
   * @return endMinute
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignTargetServiceMinuteOfHour> getEndMinute() {
    return endMinute;
  }

  public void setEndMinute(JsonNullable<CampaignTargetServiceMinuteOfHour> endMinute) {
    this.endMinute = endMinute;
  }

  public CampaignTargetServiceScheduleTarget startHour(Integer startHour) {
    this.startHour = JsonNullable.of(startHour);
    return this;
  }

  /**
   * <div lang=\"ja\">24時間表示の開始時刻です。<br>このフィールドは、ADD時に必須となります。</div> <div lang=\"en\">Starting hour in 24 hour time.<br>This field is required in ADD operation.</div> 
   * @return startHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\">24時間表示の開始時刻です。<br>このフィールドは、ADD時に必須となります。</div> <div lang=\"en\">Starting hour in 24 hour time.<br>This field is required in ADD operation.</div> ")


  public JsonNullable<Integer> getStartHour() {
    return startHour;
  }

  public void setStartHour(JsonNullable<Integer> startHour) {
    this.startHour = startHour;
  }

  public CampaignTargetServiceScheduleTarget startMinute(CampaignTargetServiceMinuteOfHour startMinute) {
    this.startMinute = JsonNullable.of(startMinute);
    return this;
  }

  /**
   * Get startMinute
   * @return startMinute
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignTargetServiceMinuteOfHour> getStartMinute() {
    return startMinute;
  }

  public void setStartMinute(JsonNullable<CampaignTargetServiceMinuteOfHour> startMinute) {
    this.startMinute = startMinute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

