package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReportDateRangeオブジェクトは、レポートの集計対象期間を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceReportDateRange object displays date range of the report.&lt;br&gt; This field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceReportDateRangeオブジェクトは、レポートの集計対象期間を表します。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">ReportDefinitionServiceReportDateRange object displays date range of the report.<br> This field is optional in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceReportDateRange   {
  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("startDate")
  private String startDate = null;

  public ReportDefinitionServiceReportDateRange endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\">集計の終了日です。<br>※フォーマット：yyyyMMdd<br>DateRangeTypeがCUSTOM_DATEの場合、このフィールドはADD時に必須となります。</div> <div lang=\"en\">End date.<br>∗ Format: yyyyMMdd<br>If DateRangeType is CUSTOM_DATE, this field is required in ADD operation.</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">集計の終了日です。<br>※フォーマット：yyyyMMdd<br>DateRangeTypeがCUSTOM_DATEの場合、このフィールドはADD時に必須となります。</div> <div lang=\"en\">End date.<br>∗ Format: yyyyMMdd<br>If DateRangeType is CUSTOM_DATE, this field is required in ADD operation.</div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ReportDefinitionServiceReportDateRange startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\">集計の開始日です。<br>※フォーマット：yyyyMMdd<br>DateRangeTypeがCUSTOM_DATEの場合、このフィールドはADD時に必須となります。</div> <div lang=\"en\">Start date. <br>∗ Format: yyyyMMdd<br>If DateRangeType is CUSTOM_DATE, this field is required in ADD operation.</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">集計の開始日です。<br>※フォーマット：yyyyMMdd<br>DateRangeTypeがCUSTOM_DATEの場合、このフィールドはADD時に必須となります。</div> <div lang=\"en\">Start date. <br>∗ Format: yyyyMMdd<br>If DateRangeType is CUSTOM_DATE, this field is required in ADD operation.</div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceReportDateRange reportDefinitionServiceReportDateRange = (ReportDefinitionServiceReportDateRange) o;
    return Objects.equals(this.endDate, reportDefinitionServiceReportDateRange.endDate) &&
        Objects.equals(this.startDate, reportDefinitionServiceReportDateRange.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceReportDateRange {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

