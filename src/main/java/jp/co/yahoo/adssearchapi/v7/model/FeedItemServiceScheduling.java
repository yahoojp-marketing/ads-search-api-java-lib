package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.FeedItemServiceSchedule;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceSchedulingオブジェクトは、広告配信スケジュールを表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceScheduling object describes ad display schedule.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceSchedulingオブジェクトは、広告配信スケジュールを表します。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">FeedItemServiceScheduling object describes ad display schedule.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceScheduling   {
  @JsonProperty("schedules")
  @Valid
  private List<FeedItemServiceSchedule> schedules = null;

  public FeedItemServiceScheduling schedules(List<FeedItemServiceSchedule> schedules) {
    this.schedules = schedules;
    return this;
  }

  public FeedItemServiceScheduling addSchedulesItem(FeedItemServiceSchedule schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<>();
    }
    this.schedules.add(schedulesItem);
    return this;
  }

  /**
   * Get schedules
   * @return schedules
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FeedItemServiceSchedule> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<FeedItemServiceSchedule> schedules) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

