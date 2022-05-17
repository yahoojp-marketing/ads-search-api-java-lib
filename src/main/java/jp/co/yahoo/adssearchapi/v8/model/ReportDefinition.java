/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportCompressType;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportDateRange;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportDateRangeType;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportDecimalPartDisplayType;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportDownloadEncode;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportDownloadFormat;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportFilter;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportIncludeDeleted;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportJobStatus;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportLanguage;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportSkipColumnHeader;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportSkipReportSummary;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportSortField;
import jp.co.yahoo.adssearchapi.v8.model.ReportDefinitionServiceReportType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionオブジェクトは、レポートの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinition object describes report information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionオブジェクトは、レポートの情報を表します。</div> <div lang=\"en\">ReportDefinition object describes report information.</div> ")
@JsonPropertyOrder({
  ReportDefinition.JSON_PROPERTY_ACCOUNT_ID,
  ReportDefinition.JSON_PROPERTY_COMPLETE_TIME,
  ReportDefinition.JSON_PROPERTY_DATE_RANGE,
  ReportDefinition.JSON_PROPERTY_FIELDS,
  ReportDefinition.JSON_PROPERTY_FILTERS,
  ReportDefinition.JSON_PROPERTY_REPORT_COMPRESS_TYPE,
  ReportDefinition.JSON_PROPERTY_REPORT_DATE_RANGE_TYPE,
  ReportDefinition.JSON_PROPERTY_REPORT_DECIMAL_PART_DISPLAY_TYPE,
  ReportDefinition.JSON_PROPERTY_REPORT_DOWNLOAD_ENCODE,
  ReportDefinition.JSON_PROPERTY_REPORT_DOWNLOAD_FORMAT,
  ReportDefinition.JSON_PROPERTY_REPORT_INCLUDE_DELETED,
  ReportDefinition.JSON_PROPERTY_REPORT_JOB_ERROR_DETAIL,
  ReportDefinition.JSON_PROPERTY_REPORT_JOB_ID,
  ReportDefinition.JSON_PROPERTY_REPORT_JOB_STATUS,
  ReportDefinition.JSON_PROPERTY_REPORT_LANGUAGE,
  ReportDefinition.JSON_PROPERTY_REPORT_NAME,
  ReportDefinition.JSON_PROPERTY_REPORT_SKIP_COLUMN_HEADER,
  ReportDefinition.JSON_PROPERTY_REPORT_SKIP_REPORT_SUMMARY,
  ReportDefinition.JSON_PROPERTY_REPORT_TYPE,
  ReportDefinition.JSON_PROPERTY_REQUEST_TIME,
  ReportDefinition.JSON_PROPERTY_SORT_FIELDS
})
@JsonTypeName("ReportDefinition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinition {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_COMPLETE_TIME = "completeTime";
  private String completeTime;

  public static final String JSON_PROPERTY_DATE_RANGE = "dateRange";
  private ReportDefinitionServiceReportDateRange dateRange;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<String> fields = null;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<ReportDefinitionServiceReportFilter> filters = null;

  public static final String JSON_PROPERTY_REPORT_COMPRESS_TYPE = "reportCompressType";
  private ReportDefinitionServiceReportCompressType reportCompressType;

  public static final String JSON_PROPERTY_REPORT_DATE_RANGE_TYPE = "reportDateRangeType";
  private ReportDefinitionServiceReportDateRangeType reportDateRangeType;

  public static final String JSON_PROPERTY_REPORT_DECIMAL_PART_DISPLAY_TYPE = "reportDecimalPartDisplayType";
  private ReportDefinitionServiceReportDecimalPartDisplayType reportDecimalPartDisplayType;

  public static final String JSON_PROPERTY_REPORT_DOWNLOAD_ENCODE = "reportDownloadEncode";
  private ReportDefinitionServiceReportDownloadEncode reportDownloadEncode;

  public static final String JSON_PROPERTY_REPORT_DOWNLOAD_FORMAT = "reportDownloadFormat";
  private ReportDefinitionServiceReportDownloadFormat reportDownloadFormat;

  public static final String JSON_PROPERTY_REPORT_INCLUDE_DELETED = "reportIncludeDeleted";
  private ReportDefinitionServiceReportIncludeDeleted reportIncludeDeleted;

  public static final String JSON_PROPERTY_REPORT_JOB_ERROR_DETAIL = "reportJobErrorDetail";
  private String reportJobErrorDetail;

  public static final String JSON_PROPERTY_REPORT_JOB_ID = "reportJobId";
  private Long reportJobId;

  public static final String JSON_PROPERTY_REPORT_JOB_STATUS = "reportJobStatus";
  private ReportDefinitionServiceReportJobStatus reportJobStatus;

  public static final String JSON_PROPERTY_REPORT_LANGUAGE = "reportLanguage";
  private ReportDefinitionServiceReportLanguage reportLanguage;

  public static final String JSON_PROPERTY_REPORT_NAME = "reportName";
  private String reportName;

  public static final String JSON_PROPERTY_REPORT_SKIP_COLUMN_HEADER = "reportSkipColumnHeader";
  private ReportDefinitionServiceReportSkipColumnHeader reportSkipColumnHeader;

  public static final String JSON_PROPERTY_REPORT_SKIP_REPORT_SUMMARY = "reportSkipReportSummary";
  private ReportDefinitionServiceReportSkipReportSummary reportSkipReportSummary;

  public static final String JSON_PROPERTY_REPORT_TYPE = "reportType";
  private ReportDefinitionServiceReportType reportType;

  public static final String JSON_PROPERTY_REQUEST_TIME = "requestTime";
  private String requestTime;

  public static final String JSON_PROPERTY_SORT_FIELDS = "sortFields";
  private List<ReportDefinitionServiceReportSortField> sortFields = null;

  public ReportDefinition() { 
  }

  public ReportDefinition accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ReportDefinition completeTime(String completeTime) {
    
    this.completeTime = completeTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブの完了時刻です。&lt;br&gt; ※YYYY/MM/DD hh:mm:ss形式になります。&lt;br&gt; ※hhは24時間表記になります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Completion time of Report Job request.&lt;br&gt; *Displays in YYYY/MM/DD hh:mm:ss form.&lt;br&gt; *hh will display in 24-hour time.&lt;/div&gt; 
   * @return completeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの完了時刻です。<br> ※YYYY/MM/DD hh:mm:ss形式になります。<br> ※hhは24時間表記になります。</div> <div lang=\"en\">Completion time of Report Job request.<br> *Displays in YYYY/MM/DD hh:mm:ss form.<br> *hh will display in 24-hour time.</div> ")
  @JsonProperty(JSON_PROPERTY_COMPLETE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompleteTime() {
    return completeTime;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportDateRange getDateRange() {
    return dateRange;
  }


  @JsonProperty(JSON_PROPERTY_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィールド（レポートの出力項目名）です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Item name of the report.&lt;br&gt; Can appoint the value retrieved from getReportFields.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">フィールド（レポートの出力項目名）です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Item name of the report.<br> Can appoint the value retrieved from getReportFields.<br> This field is required in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportDefinitionServiceReportFilter> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_COMPRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportCompressType getReportCompressType() {
    return reportCompressType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_COMPRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_DATE_RANGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportDateRangeType getReportDateRangeType() {
    return reportDateRangeType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DATE_RANGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_DECIMAL_PART_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportDecimalPartDisplayType getReportDecimalPartDisplayType() {
    return reportDecimalPartDisplayType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DECIMAL_PART_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_DOWNLOAD_ENCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportDownloadEncode getReportDownloadEncode() {
    return reportDownloadEncode;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DOWNLOAD_ENCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_DOWNLOAD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportDownloadFormat getReportDownloadFormat() {
    return reportDownloadFormat;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DOWNLOAD_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_INCLUDE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportIncludeDeleted getReportIncludeDeleted() {
    return reportIncludeDeleted;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_INCLUDE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportIncludeDeleted(ReportDefinitionServiceReportIncludeDeleted reportIncludeDeleted) {
    this.reportIncludeDeleted = reportIncludeDeleted;
  }


  public ReportDefinition reportJobErrorDetail(String reportJobErrorDetail) {
    
    this.reportJobErrorDetail = reportJobErrorDetail;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;レポートジョブのエラー詳細です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Error details of Report Job.&lt;/div&gt; 
   * @return reportJobErrorDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">レポートジョブのエラー詳細です。</div> <div lang=\"en\">Error details of Report Job.</div> ")
  @JsonProperty(JSON_PROPERTY_REPORT_JOB_ERROR_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportJobErrorDetail() {
    return reportJobErrorDetail;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_JOB_ERROR_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportJobErrorDetail(String reportJobErrorDetail) {
    this.reportJobErrorDetail = reportJobErrorDetail;
  }


  public ReportDefinition reportJobId(Long reportJobId) {
    
    this.reportJobId = reportJobId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;レポートジョブIDです。&lt;br&gt; REMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Report Job ID.&lt;br&gt; This field is required in REMOVE operation.&lt;/div&gt; 
   * @return reportJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">レポートジョブIDです。<br> REMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Report Job ID.<br> This field is required in REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_REPORT_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReportJobId() {
    return reportJobId;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportJobStatus getReportJobStatus() {
    return reportJobStatus;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportLanguage getReportLanguage() {
    return reportLanguage;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportLanguage(ReportDefinitionServiceReportLanguage reportLanguage) {
    this.reportLanguage = reportLanguage;
  }


  public ReportDefinition reportName(String reportName) {
    
    this.reportName = reportName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;レポート名称です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of the report.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return reportName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">レポート名称です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Name of the report.<br> This field is required in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_REPORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportName() {
    return reportName;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_SKIP_COLUMN_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportSkipColumnHeader getReportSkipColumnHeader() {
    return reportSkipColumnHeader;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_SKIP_COLUMN_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_SKIP_REPORT_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportSkipReportSummary getReportSkipReportSummary() {
    return reportSkipReportSummary;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_SKIP_REPORT_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceReportType getReportType() {
    return reportType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportType(ReportDefinitionServiceReportType reportType) {
    this.reportType = reportType;
  }


  public ReportDefinition requestTime(String requestTime) {
    
    this.requestTime = requestTime;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブの起動時刻です。&lt;br&gt; ※YYYY/MM/DD hh:mm:ss形式になります。&lt;br&gt; ※hhは24時間表記になります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start time of Report Job request.&lt;br&gt; *Displays in YYYY/MM/DD hh:mm:ss form.&lt;br&gt; *hh will display in 24-hour time.&lt;/div&gt; 
   * @return requestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの起動時刻です。<br> ※YYYY/MM/DD hh:mm:ss形式になります。<br> ※hhは24時間表記になります。</div> <div lang=\"en\">Start time of Report Job request.<br> *Displays in YYYY/MM/DD hh:mm:ss form.<br> *hh will display in 24-hour time.</div> ")
  @JsonProperty(JSON_PROPERTY_REQUEST_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestTime() {
    return requestTime;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReportDefinitionServiceReportSortField> getSortFields() {
    return sortFields;
  }


  @JsonProperty(JSON_PROPERTY_SORT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

