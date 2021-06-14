package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceDateRangeオブジェクトは操作履歴を取得する条件、期間を示します。&lt;br&gt; このフィールドは、必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceDateRange object displays the conditions and period to get Operation History.&lt;br&gt; This field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AuditLogServiceDateRangeオブジェクトは操作履歴を取得する条件、期間を示します。<br> このフィールドは、必須です。</div> <div lang=\"en\">AuditLogServiceDateRange object displays the conditions and period to get Operation History.<br> This field is required.</div> ")

public class AuditLogServiceDateRange   {
  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  public AuditLogServiceDateRange endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\">対象期間の終了日です。<br> このフィールドは、必須です。<br> ※1 「YYYYMMDDhhmmss」形式です。秒単位まで指定できます。<br> 時間の指定がない場合は、0:00:00として扱われます。<br>　 【例】2016年5月25日 午後2時5分35秒に設定したい場合：20160525140535<br> ※2 日付は19700101～20371231まで設定可能です。</div> <div lang=\"en\">End date of target date.<br> This field is required.<br> *1 The format is specified as \"YYYYMMDDhhmmss\". It can be set at second bid level.<br> If it's not specified, the value'0:00:00' is set as default.<br>　 ex.) To set 2:05:35 PM on May 25, 2016, the value for this option is \"20160525140535\".<br> *2 Available date range :Jan 1, 1970 (19700101) - Dec 31, 2037 (20371231)</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">対象期間の終了日です。<br> このフィールドは、必須です。<br> ※1 「YYYYMMDDhhmmss」形式です。秒単位まで指定できます。<br> 時間の指定がない場合は、0:00:00として扱われます。<br>　 【例】2016年5月25日 午後2時5分35秒に設定したい場合：20160525140535<br> ※2 日付は19700101～20371231まで設定可能です。</div> <div lang=\"en\">End date of target date.<br> This field is required.<br> *1 The format is specified as \"YYYYMMDDhhmmss\". It can be set at second bid level.<br> If it's not specified, the value'0:00:00' is set as default.<br>　 ex.) To set 2:05:35 PM on May 25, 2016, the value for this option is \"20160525140535\".<br> *2 Available date range :Jan 1, 1970 (19700101) - Dec 31, 2037 (20371231)</div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public AuditLogServiceDateRange startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\">対象期間の開始日です。<br> このフィールドは、必須です。<br> ※1 「YYYYMMDDhhmmss」形式です。秒単位まで指定できます。<br> 時間の指定がない場合は、0:00:00として扱われます。<br>　 【例】2016年5月25日 午後2時5分35秒に設定したい場合：20160525140535<br> ※2 日付は19700101～20371231まで設定可能です。</div> <div lang=\"en\">Start date of target date.<br> This field is required.<br> *1 The format is specified as \"YYYYMMDDhhmmss\". It can be set at second bid level.<br> If it's not specified, the value'0:00:00' is set as default.<br>　 ex.) To set 2:05:35 PM on May 25, 2016, the value for this option is \"20160525140535\".<br> *2 Available date range :Jan 1, 1970 (19700101) - Dec 31, 2037 (20371231)</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">対象期間の開始日です。<br> このフィールドは、必須です。<br> ※1 「YYYYMMDDhhmmss」形式です。秒単位まで指定できます。<br> 時間の指定がない場合は、0:00:00として扱われます。<br>　 【例】2016年5月25日 午後2時5分35秒に設定したい場合：20160525140535<br> ※2 日付は19700101～20371231まで設定可能です。</div> <div lang=\"en\">Start date of target date.<br> This field is required.<br> *1 The format is specified as \"YYYYMMDDhhmmss\". It can be set at second bid level.<br> If it's not specified, the value'0:00:00' is set as default.<br>　 ex.) To set 2:05:35 PM on May 25, 2016, the value for this option is \"20160525140535\".<br> *2 Available date range :Jan 1, 1970 (19700101) - Dec 31, 2037 (20371231)</div> ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceDateRange auditLogServiceDateRange = (AuditLogServiceDateRange) o;
    return Objects.equals(this.endDate, auditLogServiceDateRange.endDate) &&
        Objects.equals(this.startDate, auditLogServiceDateRange.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceDateRange {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

