package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceDayOfWeek;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceMinuteOfHour;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceScheduleオブジェクトは、広告表示オプションの配信スケジュール設定を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceSchedule object describes display schedule from Ad Display Option.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceScheduleオブジェクトは、広告表示オプションの配信スケジュール設定を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">AssetServiceSchedule object describes display schedule from Ad Display Option.<br> This field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AssetServiceSchedule   {
  @JsonProperty("dayOfWeek")
  private AssetServiceDayOfWeek dayOfWeek = null;

  @JsonProperty("endHour")
  private Long endHour = null;

  @JsonProperty("endMinute")
  private AssetServiceMinuteOfHour endMinute = null;

  @JsonProperty("startHour")
  private Long startHour = null;

  @JsonProperty("startMinute")
  private AssetServiceMinuteOfHour startMinute = null;

  public AssetServiceSchedule dayOfWeek(AssetServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(AssetServiceDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public AssetServiceSchedule endHour(Long endHour) {
    this.endHour = endHour;
    return this;
  }

  /**
   * <div lang=\"ja\">終了時です。<br> ※0 ～ 24の範囲で設定してください。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">End time in hour.<br> *Specify from 0 - 24.<br> This field is required in ADD and SET operation.</div> 
   * @return endHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\">終了時です。<br> ※0 ～ 24の範囲で設定してください。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">End time in hour.<br> *Specify from 0 - 24.<br> This field is required in ADD and SET operation.</div> ")


  public Long getEndHour() {
    return endHour;
  }

  public void setEndHour(Long endHour) {
    this.endHour = endHour;
  }

  public AssetServiceSchedule endMinute(AssetServiceMinuteOfHour endMinute) {
    this.endMinute = endMinute;
    return this;
  }

  /**
   * Get endMinute
   * @return endMinute
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceMinuteOfHour getEndMinute() {
    return endMinute;
  }

  public void setEndMinute(AssetServiceMinuteOfHour endMinute) {
    this.endMinute = endMinute;
  }

  public AssetServiceSchedule startHour(Long startHour) {
    this.startHour = startHour;
    return this;
  }

  /**
   * <div lang=\"ja\">開始時です。<br> ※0 ～ 23の範囲で設定してください。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">Start time in hour.<br> *Specify from 0 - 23.<br> This field is required in ADD and SET operation.</div> 
   * @return startHour
  */
  @ApiModelProperty(value = "<div lang=\"ja\">開始時です。<br> ※0 ～ 23の範囲で設定してください。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">Start time in hour.<br> *Specify from 0 - 23.<br> This field is required in ADD and SET operation.</div> ")


  public Long getStartHour() {
    return startHour;
  }

  public void setStartHour(Long startHour) {
    this.startHour = startHour;
  }

  public AssetServiceSchedule startMinute(AssetServiceMinuteOfHour startMinute) {
    this.startMinute = startMinute;
    return this;
  }

  /**
   * Get startMinute
   * @return startMinute
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceMinuteOfHour getStartMinute() {
    return startMinute;
  }

  public void setStartMinute(AssetServiceMinuteOfHour startMinute) {
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
    AssetServiceSchedule assetServiceSchedule = (AssetServiceSchedule) o;
    return Objects.equals(this.dayOfWeek, assetServiceSchedule.dayOfWeek) &&
        Objects.equals(this.endHour, assetServiceSchedule.endHour) &&
        Objects.equals(this.endMinute, assetServiceSchedule.endMinute) &&
        Objects.equals(this.startHour, assetServiceSchedule.startHour) &&
        Objects.equals(this.startMinute, assetServiceSchedule.startMinute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, endHour, endMinute, startHour, startMinute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceSchedule {\n");
    
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

