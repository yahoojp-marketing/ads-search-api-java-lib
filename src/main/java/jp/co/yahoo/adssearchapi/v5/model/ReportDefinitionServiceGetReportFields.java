package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.ReportDefinitionServiceReportType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReportDefinitionServiceGetReportFields
 */

public class ReportDefinitionServiceGetReportFields   {
  @JsonProperty("reportType")
  private JsonNullable<ReportDefinitionServiceReportType> reportType = JsonNullable.undefined();

  public ReportDefinitionServiceGetReportFields reportType(ReportDefinitionServiceReportType reportType) {
    this.reportType = JsonNullable.of(reportType);
    return this;
  }

  /**
   * Get reportType
   * @return reportType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public JsonNullable<ReportDefinitionServiceReportType> getReportType() {
    return reportType;
  }

  public void setReportType(JsonNullable<ReportDefinitionServiceReportType> reportType) {
    this.reportType = reportType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceGetReportFields reportDefinitionServiceGetReportFields = (ReportDefinitionServiceGetReportFields) o;
    return Objects.equals(this.reportType, reportDefinitionServiceGetReportFields.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceGetReportFields {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
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

