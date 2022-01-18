package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportCompressType;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportDateRange;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportDateRangeType;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportDecimalPartDisplayType;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportDownloadEncode;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportDownloadFormat;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportFilter;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportIncludeDeleted;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportJobStatus;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportLanguage;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportSkipColumnHeader;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportSkipReportSummary;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportSortField;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceReportType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionオブジェクトは、レポートの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinition object describes report information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionオブジェクトは、レポートの情報を表します。</div> <div lang=\"en\">ReportDefinition object describes report information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinition   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("completeTime")
  private String completeTime = null;

  @JsonProperty("dateRange")
  private ReportDefinitionServiceReportDateRange dateRange = null;

  @JsonProperty("fields")
  @Valid
  private List<String> fields = null;

  @JsonProperty("filters")
  @Valid
  private List<ReportDefinitionServiceReportFilter> filters = null;

  @JsonProperty("reportCompressType")
  private ReportDefinitionServiceReportCompressType reportCompressType = null;

  @JsonProperty("reportDateRangeType")
  private ReportDefinitionServiceReportDateRangeType reportDateRangeType = null;

  @JsonProperty("reportDecimalPartDisplayType")
  private ReportDefinitionServiceReportDecimalPartDisplayType reportDecimalPartDisplayType = null;

  @JsonProperty("reportDownloadEncode")
  private ReportDefinitionServiceReportDownloadEncode reportDownloadEncode = null;

  @JsonProperty("reportDownloadFormat")
  private ReportDefinitionServiceReportDownloadFormat reportDownloadFormat = null;

  @JsonProperty("reportIncludeDeleted")
  private ReportDefinitionServiceReportIncludeDeleted reportIncludeDeleted = null;

  @JsonProperty("reportJobErrorDetail")
  private String reportJobErrorDetail = null;

  @JsonProperty("reportJobId")
  private Long reportJobId = null;

  @JsonProperty("reportJobStatus")
  private ReportDefinitionServiceReportJobStatus reportJobStatus = null;

  @JsonProperty("reportLanguage")
  private ReportDefinitionServiceReportLanguage reportLanguage = null;

  @JsonProperty("reportName")
  private String reportName = null;

  @JsonProperty("reportSkipColumnHeader")
  private ReportDefinitionServiceReportSkipColumnHeader reportSkipColumnHeader = null;

  @JsonProperty("reportSkipReportSummary")
  private ReportDefinitionServiceReportSkipReportSummary reportSkipReportSummary = null;

  @JsonProperty("reportType")
  private ReportDefinitionServiceReportType reportType = null;

  @JsonProperty("requestTime")
  private String requestTime = null;

  @JsonProperty("sortFields")
  @Valid
  private List<ReportDefinitionServiceReportSortField> sortFields = null;

  public ReportDefinition accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ReportDefinition completeTime(String completeTime) {
    this.completeTime = completeTime;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの完了時刻です。<br> ※YYYY/MM/DD hh:mm:ss形式になります。<br> ※hhは24時間表記になります。</div> <div lang=\"en\">Completion time of Report Job request.<br> *Displays in YYYY/MM/DD hh:mm:ss form.<br> *hh will display in 24-hour time.</div> 
   * @return completeTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの完了時刻です。<br> ※YYYY/MM/DD hh:mm:ss形式になります。<br> ※hhは24時間表記になります。</div> <div lang=\"en\">Completion time of Report Job request.<br> *Displays in YYYY/MM/DD hh:mm:ss form.<br> *hh will display in 24-hour time.</div> ")


  public String getCompleteTime() {
    return completeTime;
  }

  public void setCompleteTime(String completeTime) {
    this.completeTime = completeTime;
  }

  public ReportDefinition dateRange(ReportDefinitionServiceReportDateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Get dateRange
   * @return dateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportDateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(ReportDefinitionServiceReportDateRange dateRange) {
    this.dateRange = dateRange;
  }

  public ReportDefinition fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public ReportDefinition addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">フィールド（レポートの出力項目名）です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Item name of the report.<br> Can appoint the value retrieved from getReportFields.<br> This field is required in ADD operation.</div> 
   * @return fields
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールド（レポートの出力項目名）です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Item name of the report.<br> Can appoint the value retrieved from getReportFields.<br> This field is required in ADD operation.</div> ")


  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public ReportDefinition filters(List<ReportDefinitionServiceReportFilter> filters) {
    this.filters = filters;
    return this;
  }

  public ReportDefinition addFiltersItem(ReportDefinitionServiceReportFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Get filters
   * @return filters
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReportDefinitionServiceReportFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<ReportDefinitionServiceReportFilter> filters) {
    this.filters = filters;
  }

  public ReportDefinition reportCompressType(ReportDefinitionServiceReportCompressType reportCompressType) {
    this.reportCompressType = reportCompressType;
    return this;
  }

  /**
   * Get reportCompressType
   * @return reportCompressType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportCompressType getReportCompressType() {
    return reportCompressType;
  }

  public void setReportCompressType(ReportDefinitionServiceReportCompressType reportCompressType) {
    this.reportCompressType = reportCompressType;
  }

  public ReportDefinition reportDateRangeType(ReportDefinitionServiceReportDateRangeType reportDateRangeType) {
    this.reportDateRangeType = reportDateRangeType;
    return this;
  }

  /**
   * Get reportDateRangeType
   * @return reportDateRangeType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportDateRangeType getReportDateRangeType() {
    return reportDateRangeType;
  }

  public void setReportDateRangeType(ReportDefinitionServiceReportDateRangeType reportDateRangeType) {
    this.reportDateRangeType = reportDateRangeType;
  }

  public ReportDefinition reportDecimalPartDisplayType(ReportDefinitionServiceReportDecimalPartDisplayType reportDecimalPartDisplayType) {
    this.reportDecimalPartDisplayType = reportDecimalPartDisplayType;
    return this;
  }

  /**
   * Get reportDecimalPartDisplayType
   * @return reportDecimalPartDisplayType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportDecimalPartDisplayType getReportDecimalPartDisplayType() {
    return reportDecimalPartDisplayType;
  }

  public void setReportDecimalPartDisplayType(ReportDefinitionServiceReportDecimalPartDisplayType reportDecimalPartDisplayType) {
    this.reportDecimalPartDisplayType = reportDecimalPartDisplayType;
  }

  public ReportDefinition reportDownloadEncode(ReportDefinitionServiceReportDownloadEncode reportDownloadEncode) {
    this.reportDownloadEncode = reportDownloadEncode;
    return this;
  }

  /**
   * Get reportDownloadEncode
   * @return reportDownloadEncode
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportDownloadEncode getReportDownloadEncode() {
    return reportDownloadEncode;
  }

  public void setReportDownloadEncode(ReportDefinitionServiceReportDownloadEncode reportDownloadEncode) {
    this.reportDownloadEncode = reportDownloadEncode;
  }

  public ReportDefinition reportDownloadFormat(ReportDefinitionServiceReportDownloadFormat reportDownloadFormat) {
    this.reportDownloadFormat = reportDownloadFormat;
    return this;
  }

  /**
   * Get reportDownloadFormat
   * @return reportDownloadFormat
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportDownloadFormat getReportDownloadFormat() {
    return reportDownloadFormat;
  }

  public void setReportDownloadFormat(ReportDefinitionServiceReportDownloadFormat reportDownloadFormat) {
    this.reportDownloadFormat = reportDownloadFormat;
  }

  public ReportDefinition reportIncludeDeleted(ReportDefinitionServiceReportIncludeDeleted reportIncludeDeleted) {
    this.reportIncludeDeleted = reportIncludeDeleted;
    return this;
  }

  /**
   * Get reportIncludeDeleted
   * @return reportIncludeDeleted
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportIncludeDeleted getReportIncludeDeleted() {
    return reportIncludeDeleted;
  }

  public void setReportIncludeDeleted(ReportDefinitionServiceReportIncludeDeleted reportIncludeDeleted) {
    this.reportIncludeDeleted = reportIncludeDeleted;
  }

  public ReportDefinition reportJobErrorDetail(String reportJobErrorDetail) {
    this.reportJobErrorDetail = reportJobErrorDetail;
    return this;
  }

  /**
   * <div lang=\"ja\">レポートジョブのエラー詳細です。</div> <div lang=\"en\">Error details of Report Job.</div> 
   * @return reportJobErrorDetail
  */
  @ApiModelProperty(value = "<div lang=\"ja\">レポートジョブのエラー詳細です。</div> <div lang=\"en\">Error details of Report Job.</div> ")


  public String getReportJobErrorDetail() {
    return reportJobErrorDetail;
  }

  public void setReportJobErrorDetail(String reportJobErrorDetail) {
    this.reportJobErrorDetail = reportJobErrorDetail;
  }

  public ReportDefinition reportJobId(Long reportJobId) {
    this.reportJobId = reportJobId;
    return this;
  }

  /**
   * <div lang=\"ja\">レポートジョブIDです。<br> REMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Report Job ID.<br> This field is required in REMOVE operation.</div> 
   * @return reportJobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">レポートジョブIDです。<br> REMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Report Job ID.<br> This field is required in REMOVE operation.</div> ")


  public Long getReportJobId() {
    return reportJobId;
  }

  public void setReportJobId(Long reportJobId) {
    this.reportJobId = reportJobId;
  }

  public ReportDefinition reportJobStatus(ReportDefinitionServiceReportJobStatus reportJobStatus) {
    this.reportJobStatus = reportJobStatus;
    return this;
  }

  /**
   * Get reportJobStatus
   * @return reportJobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportJobStatus getReportJobStatus() {
    return reportJobStatus;
  }

  public void setReportJobStatus(ReportDefinitionServiceReportJobStatus reportJobStatus) {
    this.reportJobStatus = reportJobStatus;
  }

  public ReportDefinition reportLanguage(ReportDefinitionServiceReportLanguage reportLanguage) {
    this.reportLanguage = reportLanguage;
    return this;
  }

  /**
   * Get reportLanguage
   * @return reportLanguage
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportLanguage getReportLanguage() {
    return reportLanguage;
  }

  public void setReportLanguage(ReportDefinitionServiceReportLanguage reportLanguage) {
    this.reportLanguage = reportLanguage;
  }

  public ReportDefinition reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * <div lang=\"ja\">レポート名称です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Name of the report.<br> This field is required in ADD operation.</div> 
   * @return reportName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">レポート名称です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Name of the report.<br> This field is required in ADD operation.</div> ")


  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ReportDefinition reportSkipColumnHeader(ReportDefinitionServiceReportSkipColumnHeader reportSkipColumnHeader) {
    this.reportSkipColumnHeader = reportSkipColumnHeader;
    return this;
  }

  /**
   * Get reportSkipColumnHeader
   * @return reportSkipColumnHeader
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportSkipColumnHeader getReportSkipColumnHeader() {
    return reportSkipColumnHeader;
  }

  public void setReportSkipColumnHeader(ReportDefinitionServiceReportSkipColumnHeader reportSkipColumnHeader) {
    this.reportSkipColumnHeader = reportSkipColumnHeader;
  }

  public ReportDefinition reportSkipReportSummary(ReportDefinitionServiceReportSkipReportSummary reportSkipReportSummary) {
    this.reportSkipReportSummary = reportSkipReportSummary;
    return this;
  }

  /**
   * Get reportSkipReportSummary
   * @return reportSkipReportSummary
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportSkipReportSummary getReportSkipReportSummary() {
    return reportSkipReportSummary;
  }

  public void setReportSkipReportSummary(ReportDefinitionServiceReportSkipReportSummary reportSkipReportSummary) {
    this.reportSkipReportSummary = reportSkipReportSummary;
  }

  public ReportDefinition reportType(ReportDefinitionServiceReportType reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * Get reportType
   * @return reportType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceReportType getReportType() {
    return reportType;
  }

  public void setReportType(ReportDefinitionServiceReportType reportType) {
    this.reportType = reportType;
  }

  public ReportDefinition requestTime(String requestTime) {
    this.requestTime = requestTime;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの起動時刻です。<br> ※YYYY/MM/DD hh:mm:ss形式になります。<br> ※hhは24時間表記になります。</div> <div lang=\"en\">Start time of Report Job request.<br> *Displays in YYYY/MM/DD hh:mm:ss form.<br> *hh will display in 24-hour time.</div> 
   * @return requestTime
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの起動時刻です。<br> ※YYYY/MM/DD hh:mm:ss形式になります。<br> ※hhは24時間表記になります。</div> <div lang=\"en\">Start time of Report Job request.<br> *Displays in YYYY/MM/DD hh:mm:ss form.<br> *hh will display in 24-hour time.</div> ")


  public String getRequestTime() {
    return requestTime;
  }

  public void setRequestTime(String requestTime) {
    this.requestTime = requestTime;
  }

  public ReportDefinition sortFields(List<ReportDefinitionServiceReportSortField> sortFields) {
    this.sortFields = sortFields;
    return this;
  }

  public ReportDefinition addSortFieldsItem(ReportDefinitionServiceReportSortField sortFieldsItem) {
    if (this.sortFields == null) {
      this.sortFields = new ArrayList<>();
    }
    this.sortFields.add(sortFieldsItem);
    return this;
  }

  /**
   * Get sortFields
   * @return sortFields
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public List<ReportDefinitionServiceReportSortField> getSortFields() {
    return sortFields;
  }

  public void setSortFields(List<ReportDefinitionServiceReportSortField> sortFields) {
    this.sortFields = sortFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinition reportDefinition = (ReportDefinition) o;
    return Objects.equals(this.accountId, reportDefinition.accountId) &&
        Objects.equals(this.completeTime, reportDefinition.completeTime) &&
        Objects.equals(this.dateRange, reportDefinition.dateRange) &&
        Objects.equals(this.fields, reportDefinition.fields) &&
        Objects.equals(this.filters, reportDefinition.filters) &&
        Objects.equals(this.reportCompressType, reportDefinition.reportCompressType) &&
        Objects.equals(this.reportDateRangeType, reportDefinition.reportDateRangeType) &&
        Objects.equals(this.reportDecimalPartDisplayType, reportDefinition.reportDecimalPartDisplayType) &&
        Objects.equals(this.reportDownloadEncode, reportDefinition.reportDownloadEncode) &&
        Objects.equals(this.reportDownloadFormat, reportDefinition.reportDownloadFormat) &&
        Objects.equals(this.reportIncludeDeleted, reportDefinition.reportIncludeDeleted) &&
        Objects.equals(this.reportJobErrorDetail, reportDefinition.reportJobErrorDetail) &&
        Objects.equals(this.reportJobId, reportDefinition.reportJobId) &&
        Objects.equals(this.reportJobStatus, reportDefinition.reportJobStatus) &&
        Objects.equals(this.reportLanguage, reportDefinition.reportLanguage) &&
        Objects.equals(this.reportName, reportDefinition.reportName) &&
        Objects.equals(this.reportSkipColumnHeader, reportDefinition.reportSkipColumnHeader) &&
        Objects.equals(this.reportSkipReportSummary, reportDefinition.reportSkipReportSummary) &&
        Objects.equals(this.reportType, reportDefinition.reportType) &&
        Objects.equals(this.requestTime, reportDefinition.requestTime) &&
        Objects.equals(this.sortFields, reportDefinition.sortFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, completeTime, dateRange, fields, filters, reportCompressType, reportDateRangeType, reportDecimalPartDisplayType, reportDownloadEncode, reportDownloadFormat, reportIncludeDeleted, reportJobErrorDetail, reportJobId, reportJobStatus, reportLanguage, reportName, reportSkipColumnHeader, reportSkipReportSummary, reportType, requestTime, sortFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinition {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    completeTime: ").append(toIndentedString(completeTime)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    reportCompressType: ").append(toIndentedString(reportCompressType)).append("\n");
    sb.append("    reportDateRangeType: ").append(toIndentedString(reportDateRangeType)).append("\n");
    sb.append("    reportDecimalPartDisplayType: ").append(toIndentedString(reportDecimalPartDisplayType)).append("\n");
    sb.append("    reportDownloadEncode: ").append(toIndentedString(reportDownloadEncode)).append("\n");
    sb.append("    reportDownloadFormat: ").append(toIndentedString(reportDownloadFormat)).append("\n");
    sb.append("    reportIncludeDeleted: ").append(toIndentedString(reportIncludeDeleted)).append("\n");
    sb.append("    reportJobErrorDetail: ").append(toIndentedString(reportJobErrorDetail)).append("\n");
    sb.append("    reportJobId: ").append(toIndentedString(reportJobId)).append("\n");
    sb.append("    reportJobStatus: ").append(toIndentedString(reportJobStatus)).append("\n");
    sb.append("    reportLanguage: ").append(toIndentedString(reportLanguage)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportSkipColumnHeader: ").append(toIndentedString(reportSkipColumnHeader)).append("\n");
    sb.append("    reportSkipReportSummary: ").append(toIndentedString(reportSkipReportSummary)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    sortFields: ").append(toIndentedString(sortFields)).append("\n");
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

