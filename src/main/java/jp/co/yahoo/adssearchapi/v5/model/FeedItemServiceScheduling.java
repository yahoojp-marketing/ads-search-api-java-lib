package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceSchedule;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceSchedulingオブジェクトは、広告配信スケジュールを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceScheduling object describes ad display schedule.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceSchedulingオブジェクトは、広告配信スケジュールを表します。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">FeedItemServiceScheduling object describes ad display schedule.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")

public class FeedItemServiceScheduling   {
  @JsonProperty("schedules")
  @Valid
  private JsonNullable<List<FeedItemServiceSchedule>> schedules = JsonNullable.undefined();

  public FeedItemServiceScheduling schedules(List<FeedItemServiceSchedule> schedules) {
    this.schedules = JsonNullable.of(schedules);
    return this;
  }

  public FeedItemServiceScheduling addSchedulesItem(FeedItemServiceSchedule schedulesItem) {
    if (this.schedules == null || !this.schedules.isPresent()) {
      this.schedules = JsonNullable.of(new ArrayList<>());
    }
    this.schedules.get().add(schedulesItem);
    return this;
  }

  /**
   * Get schedules
   * @return schedules
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<FeedItemServiceSchedule>> getSchedules() {
    return schedules;
  }

  public void setSchedules(JsonNullable<List<FeedItemServiceSchedule>> schedules) {
    this.schedules = schedules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceScheduling feedItemServiceScheduling = (FeedItemServiceScheduling) o;
    return Objects.equals(this.schedules, feedItemServiceScheduling.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceScheduling {\n");
    
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
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

