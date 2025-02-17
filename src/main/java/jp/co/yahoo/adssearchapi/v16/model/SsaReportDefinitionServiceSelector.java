/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v16.model.SsaReportDefinitionServiceReportJobStatus;
import jp.co.yahoo.adssearchapi.v16.model.SsaReportDefinitionServiceReportType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SsaReportDefinitionServiceSelectorオブジェクトは、操作の対象とするレポートです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SsaReportDefinitionServiceSelector is a detail of requested report.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  SsaReportDefinitionServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  SsaReportDefinitionServiceSelector.JSON_PROPERTY_REPORT_JOB_IDS,
  SsaReportDefinitionServiceSelector.JSON_PROPERTY_REPORT_JOB_STATUSES,
  SsaReportDefinitionServiceSelector.JSON_PROPERTY_REPORT_TYPES,
  SsaReportDefinitionServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  SsaReportDefinitionServiceSelector.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SsaReportDefinitionServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_REPORT_JOB_IDS = "reportJobIds";
  private List<Long> reportJobIds;

  public static final String JSON_PROPERTY_REPORT_JOB_STATUSES = "reportJobStatuses";
  private List<SsaReportDefinitionServiceReportJobStatus> reportJobStatuses;

  public static final String JSON_PROPERTY_REPORT_TYPES = "reportTypes";
  private List<SsaReportDefinitionServiceReportType> reportTypes;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public SsaReportDefinitionServiceSelector() {
  }

  public SsaReportDefinitionServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件： アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public SsaReportDefinitionServiceSelector reportJobIds(List<Long> reportJobIds) {
    
    this.reportJobIds = reportJobIds;
    return this;
  }

  public SsaReportDefinitionServiceSelector addReportJobIdsItem(Long reportJobIdsItem) {
    if (this.reportJobIds == null) {
      this.reportJobIds = new ArrayList<>();
    }
    this.reportJobIds.add(reportJobIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件： レポートジョブIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Report Job ID.&lt;/div&gt; 
   * @return reportJobIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_JOB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getReportJobIds() {
    return reportJobIds;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_JOB_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportJobIds(List<Long> reportJobIds) {
    this.reportJobIds = reportJobIds;
  }


  public SsaReportDefinitionServiceSelector reportJobStatuses(List<SsaReportDefinitionServiceReportJobStatus> reportJobStatuses) {
    
    this.reportJobStatuses = reportJobStatuses;
    return this;
  }

  public SsaReportDefinitionServiceSelector addReportJobStatusesItem(SsaReportDefinitionServiceReportJobStatus reportJobStatusesItem) {
    if (this.reportJobStatuses == null) {
      this.reportJobStatuses = new ArrayList<>();
    }
    this.reportJobStatuses.add(reportJobStatusesItem);
    return this;
  }

   /**
   * Get reportJobStatuses
   * @return reportJobStatuses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_JOB_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SsaReportDefinitionServiceReportJobStatus> getReportJobStatuses() {
    return reportJobStatuses;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_JOB_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportJobStatuses(List<SsaReportDefinitionServiceReportJobStatus> reportJobStatuses) {
    this.reportJobStatuses = reportJobStatuses;
  }


  public SsaReportDefinitionServiceSelector reportTypes(List<SsaReportDefinitionServiceReportType> reportTypes) {
    
    this.reportTypes = reportTypes;
    return this;
  }

  public SsaReportDefinitionServiceSelector addReportTypesItem(SsaReportDefinitionServiceReportType reportTypesItem) {
    if (this.reportTypes == null) {
      this.reportTypes = new ArrayList<>();
    }
    this.reportTypes.add(reportTypesItem);
    return this;
  }

   /**
   * Get reportTypes
   * @return reportTypes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SsaReportDefinitionServiceReportType> getReportTypes() {
    return reportTypes;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportTypes(List<SsaReportDefinitionServiceReportType> reportTypes) {
    this.reportTypes = reportTypes;
  }


  public SsaReportDefinitionServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public SsaReportDefinitionServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsaReportDefinitionServiceSelector ssaReportDefinitionServiceSelector = (SsaReportDefinitionServiceSelector) o;
    return Objects.equals(this.accountId, ssaReportDefinitionServiceSelector.accountId) &&
        Objects.equals(this.reportJobIds, ssaReportDefinitionServiceSelector.reportJobIds) &&
        Objects.equals(this.reportJobStatuses, ssaReportDefinitionServiceSelector.reportJobStatuses) &&
        Objects.equals(this.reportTypes, ssaReportDefinitionServiceSelector.reportTypes) &&
        Objects.equals(this.numberResults, ssaReportDefinitionServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, ssaReportDefinitionServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, reportJobIds, reportJobStatuses, reportTypes, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsaReportDefinitionServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    reportJobIds: ").append(toIndentedString(reportJobIds)).append("\n");
    sb.append("    reportJobStatuses: ").append(toIndentedString(reportJobStatuses)).append("\n");
    sb.append("    reportTypes: ").append(toIndentedString(reportTypes)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

