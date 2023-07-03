/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v11.model.PageFeedAssetServiceBulkEncoding;
import jp.co.yahoo.adssearchapi.v11.model.PageFeedAssetServiceBulkLang;
import jp.co.yahoo.adssearchapi.v11.model.PageFeedAssetServiceBulkOutput;
import jp.co.yahoo.adssearchapi.v11.model.PageFeedAssetServiceDownloadJobStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetServiceDownloadJobオブジェクトは、ページフィードアセット情報をダウンロードする処理内容を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetServiceDownloadJob object retains contents of page feed asset information for download.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  PageFeedAssetServiceDownloadJob.JSON_PROPERTY_ACCOUNT_ID,
  PageFeedAssetServiceDownloadJob.JSON_PROPERTY_BULK_ENCODING,
  PageFeedAssetServiceDownloadJob.JSON_PROPERTY_BULK_LANG,
  PageFeedAssetServiceDownloadJob.JSON_PROPERTY_BULK_OUTPUT,
  PageFeedAssetServiceDownloadJob.JSON_PROPERTY_DOWNLOAD_JOB_STATUS,
  PageFeedAssetServiceDownloadJob.JSON_PROPERTY_END_DATE,
  PageFeedAssetServiceDownloadJob.JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID,
  PageFeedAssetServiceDownloadJob.JSON_PROPERTY_JOB_ID,
  PageFeedAssetServiceDownloadJob.JSON_PROPERTY_PROGRESS,
  PageFeedAssetServiceDownloadJob.JSON_PROPERTY_START_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAssetServiceDownloadJob {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_BULK_ENCODING = "bulkEncoding";
  private PageFeedAssetServiceBulkEncoding bulkEncoding;

  public static final String JSON_PROPERTY_BULK_LANG = "bulkLang";
  private PageFeedAssetServiceBulkLang bulkLang;

  public static final String JSON_PROPERTY_BULK_OUTPUT = "bulkOutput";
  private PageFeedAssetServiceBulkOutput bulkOutput;

  public static final String JSON_PROPERTY_DOWNLOAD_JOB_STATUS = "downloadJobStatus";
  private PageFeedAssetServiceDownloadJobStatus downloadJobStatus;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID = "pageFeedAssetSetId";
  private Long pageFeedAssetSetId;

  public static final String JSON_PROPERTY_JOB_ID = "jobId";
  private Long jobId;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  private Integer progress;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public PageFeedAssetServiceDownloadJob() {
  }

  public PageFeedAssetServiceDownloadJob accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; This field is required.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
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


  public PageFeedAssetServiceDownloadJob bulkEncoding(PageFeedAssetServiceBulkEncoding bulkEncoding) {
    
    this.bulkEncoding = bulkEncoding;
    return this;
  }

   /**
   * Get bulkEncoding
   * @return bulkEncoding
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BULK_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedAssetServiceBulkEncoding getBulkEncoding() {
    return bulkEncoding;
  }


  @JsonProperty(JSON_PROPERTY_BULK_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBulkEncoding(PageFeedAssetServiceBulkEncoding bulkEncoding) {
    this.bulkEncoding = bulkEncoding;
  }


  public PageFeedAssetServiceDownloadJob bulkLang(PageFeedAssetServiceBulkLang bulkLang) {
    
    this.bulkLang = bulkLang;
    return this;
  }

   /**
   * Get bulkLang
   * @return bulkLang
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BULK_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedAssetServiceBulkLang getBulkLang() {
    return bulkLang;
  }


  @JsonProperty(JSON_PROPERTY_BULK_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBulkLang(PageFeedAssetServiceBulkLang bulkLang) {
    this.bulkLang = bulkLang;
  }


  public PageFeedAssetServiceDownloadJob bulkOutput(PageFeedAssetServiceBulkOutput bulkOutput) {
    
    this.bulkOutput = bulkOutput;
    return this;
  }

   /**
   * Get bulkOutput
   * @return bulkOutput
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BULK_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedAssetServiceBulkOutput getBulkOutput() {
    return bulkOutput;
  }


  @JsonProperty(JSON_PROPERTY_BULK_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBulkOutput(PageFeedAssetServiceBulkOutput bulkOutput) {
    this.bulkOutput = bulkOutput;
  }


  public PageFeedAssetServiceDownloadJob downloadJobStatus(PageFeedAssetServiceDownloadJobStatus downloadJobStatus) {
    
    this.downloadJobStatus = downloadJobStatus;
    return this;
  }

   /**
   * Get downloadJobStatus
   * @return downloadJobStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedAssetServiceDownloadJobStatus getDownloadJobStatus() {
    return downloadJobStatus;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadJobStatus(PageFeedAssetServiceDownloadJobStatus downloadJobStatus) {
    this.downloadJobStatus = downloadJobStatus;
  }


  public PageFeedAssetServiceDownloadJob endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブの終了日です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; 形式：yyyyMMddHHmmss&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;End date of job.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.  &lt;br&gt; Format:yyyyMMddHHmmss&lt;/div&gt; 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public PageFeedAssetServiceDownloadJob pageFeedAssetSetId(Long pageFeedAssetSetId) {
    
    this.pageFeedAssetSetId = pageFeedAssetSetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットセットIDです。&lt;br&gt; このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetSet ID.&lt;br&gt; This field is required.&lt;/div&gt; 
   * @return pageFeedAssetSetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPageFeedAssetSetId() {
    return pageFeedAssetSetId;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetSetId(Long pageFeedAssetSetId) {
    this.pageFeedAssetSetId = pageFeedAssetSetId;
  }


  public PageFeedAssetServiceDownloadJob jobId(Long jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Job ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return jobId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getJobId() {
    return jobId;
  }


  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }


  public PageFeedAssetServiceDownloadJob progress(Integer progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブの進捗状況です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Progress of page feed asset job.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return progress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProgress() {
    return progress;
  }


  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgress(Integer progress) {
    this.progress = progress;
  }


  public PageFeedAssetServiceDownloadJob startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブの開始日です。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;br&gt; 形式：yyyyMMddHHmmss &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date of job.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;br&gt; Format:yyyyMMddHHmmss&lt;/div&gt; 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    PageFeedAssetServiceDownloadJob pageFeedAssetServiceDownloadJob = (PageFeedAssetServiceDownloadJob) o;
    return Objects.equals(this.accountId, pageFeedAssetServiceDownloadJob.accountId) &&
        Objects.equals(this.bulkEncoding, pageFeedAssetServiceDownloadJob.bulkEncoding) &&
        Objects.equals(this.bulkLang, pageFeedAssetServiceDownloadJob.bulkLang) &&
        Objects.equals(this.bulkOutput, pageFeedAssetServiceDownloadJob.bulkOutput) &&
        Objects.equals(this.downloadJobStatus, pageFeedAssetServiceDownloadJob.downloadJobStatus) &&
        Objects.equals(this.endDate, pageFeedAssetServiceDownloadJob.endDate) &&
        Objects.equals(this.pageFeedAssetSetId, pageFeedAssetServiceDownloadJob.pageFeedAssetSetId) &&
        Objects.equals(this.jobId, pageFeedAssetServiceDownloadJob.jobId) &&
        Objects.equals(this.progress, pageFeedAssetServiceDownloadJob.progress) &&
        Objects.equals(this.startDate, pageFeedAssetServiceDownloadJob.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bulkEncoding, bulkLang, bulkOutput, downloadJobStatus, endDate, pageFeedAssetSetId, jobId, progress, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAssetServiceDownloadJob {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bulkEncoding: ").append(toIndentedString(bulkEncoding)).append("\n");
    sb.append("    bulkLang: ").append(toIndentedString(bulkLang)).append("\n");
    sb.append("    bulkOutput: ").append(toIndentedString(bulkOutput)).append("\n");
    sb.append("    downloadJobStatus: ").append(toIndentedString(downloadJobStatus)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    pageFeedAssetSetId: ").append(toIndentedString(pageFeedAssetSetId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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

