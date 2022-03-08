/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceBulkEncoding;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceBulkLang;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceBulkOutput;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceDownloadJobStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceDownloadJobオブジェクトは、ページフィードアイテム情報をダウンロードする処理内容を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceDownloadJob object retains contents of page feed item information for download.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceDownloadJobオブジェクトは、ページフィードアイテム情報をダウンロードする処理内容を格納します。</div> <div lang=\"en\">PageFeedItemServiceDownloadJob object retains contents of page feed item information for download.</div> ")
@JsonPropertyOrder({
  PageFeedItemServiceDownloadJob.JSON_PROPERTY_ACCOUNT_ID,
  PageFeedItemServiceDownloadJob.JSON_PROPERTY_BULK_ENCODING,
  PageFeedItemServiceDownloadJob.JSON_PROPERTY_BULK_LANG,
  PageFeedItemServiceDownloadJob.JSON_PROPERTY_BULK_OUTPUT,
  PageFeedItemServiceDownloadJob.JSON_PROPERTY_DOWNLOAD_JOB_STATUS,
  PageFeedItemServiceDownloadJob.JSON_PROPERTY_END_DATE,
  PageFeedItemServiceDownloadJob.JSON_PROPERTY_FEED_ID,
  PageFeedItemServiceDownloadJob.JSON_PROPERTY_JOB_ID,
  PageFeedItemServiceDownloadJob.JSON_PROPERTY_PROGRESS,
  PageFeedItemServiceDownloadJob.JSON_PROPERTY_START_DATE
})
@JsonTypeName("PageFeedItemServiceDownloadJob")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedItemServiceDownloadJob {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_BULK_ENCODING = "bulkEncoding";
  private PageFeedItemServiceBulkEncoding bulkEncoding;

  public static final String JSON_PROPERTY_BULK_LANG = "bulkLang";
  private PageFeedItemServiceBulkLang bulkLang;

  public static final String JSON_PROPERTY_BULK_OUTPUT = "bulkOutput";
  private PageFeedItemServiceBulkOutput bulkOutput;

  public static final String JSON_PROPERTY_DOWNLOAD_JOB_STATUS = "downloadJobStatus";
  private PageFeedItemServiceDownloadJobStatus downloadJobStatus;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_JOB_ID = "jobId";
  private Long jobId;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  private Integer progress;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public PageFeedItemServiceDownloadJob() { 
  }

  public PageFeedItemServiceDownloadJob accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; This field is required.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br> This field is required.</div> ")
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


  public PageFeedItemServiceDownloadJob bulkEncoding(PageFeedItemServiceBulkEncoding bulkEncoding) {
    
    this.bulkEncoding = bulkEncoding;
    return this;
  }

   /**
   * Get bulkEncoding
   * @return bulkEncoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BULK_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedItemServiceBulkEncoding getBulkEncoding() {
    return bulkEncoding;
  }


  @JsonProperty(JSON_PROPERTY_BULK_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBulkEncoding(PageFeedItemServiceBulkEncoding bulkEncoding) {
    this.bulkEncoding = bulkEncoding;
  }


  public PageFeedItemServiceDownloadJob bulkLang(PageFeedItemServiceBulkLang bulkLang) {
    
    this.bulkLang = bulkLang;
    return this;
  }

   /**
   * Get bulkLang
   * @return bulkLang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BULK_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedItemServiceBulkLang getBulkLang() {
    return bulkLang;
  }


  @JsonProperty(JSON_PROPERTY_BULK_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBulkLang(PageFeedItemServiceBulkLang bulkLang) {
    this.bulkLang = bulkLang;
  }


  public PageFeedItemServiceDownloadJob bulkOutput(PageFeedItemServiceBulkOutput bulkOutput) {
    
    this.bulkOutput = bulkOutput;
    return this;
  }

   /**
   * Get bulkOutput
   * @return bulkOutput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BULK_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedItemServiceBulkOutput getBulkOutput() {
    return bulkOutput;
  }


  @JsonProperty(JSON_PROPERTY_BULK_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBulkOutput(PageFeedItemServiceBulkOutput bulkOutput) {
    this.bulkOutput = bulkOutput;
  }


  public PageFeedItemServiceDownloadJob downloadJobStatus(PageFeedItemServiceDownloadJobStatus downloadJobStatus) {
    
    this.downloadJobStatus = downloadJobStatus;
    return this;
  }

   /**
   * Get downloadJobStatus
   * @return downloadJobStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedItemServiceDownloadJobStatus getDownloadJobStatus() {
    return downloadJobStatus;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_JOB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadJobStatus(PageFeedItemServiceDownloadJobStatus downloadJobStatus) {
    this.downloadJobStatus = downloadJobStatus;
  }


  public PageFeedItemServiceDownloadJob endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブの終了日です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; 形式：yyyyMMddHHmmss&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;End date of job.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.  &lt;br&gt; Format:yyyyMMddHHmmss&lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの終了日です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> 形式：yyyyMMddHHmmss</div><div lang=\"en\">End date of job.<br> Although this field will be returned in the response, it will be ignored on input.  <br> Format:yyyyMMddHHmmss</div> ")
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


  public PageFeedItemServiceDownloadJob feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードIDです。&lt;br&gt; このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID.&lt;br&gt; This field is required.&lt;/div&gt; 
   * @return feedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">フィードIDです。<br> このフィールドは必須です。</div> <div lang=\"en\">Feed ID.<br> This field is required.</div> ")
  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedId() {
    return feedId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }


  public PageFeedItemServiceDownloadJob jobId(Long jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Job ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Job ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
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


  public PageFeedItemServiceDownloadJob progress(Integer progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブの進捗状況です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Progress of page feed item job.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return progress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの進捗状況です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Progress of page feed item job.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
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


  public PageFeedItemServiceDownloadJob startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ジョブの開始日です。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;br&gt; 形式：yyyyMMddHHmmss &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date of job.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;br&gt; Format:yyyyMMddHHmmss&lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの開始日です。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 <br> 形式：yyyyMMddHHmmss </div> <div lang=\"en\">Start date of job.<br> Although this field will be returned in the response, it will be ignored on input.<br> Format:yyyyMMddHHmmss</div> ")
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
    PageFeedItemServiceDownloadJob pageFeedItemServiceDownloadJob = (PageFeedItemServiceDownloadJob) o;
    return Objects.equals(this.accountId, pageFeedItemServiceDownloadJob.accountId) &&
        Objects.equals(this.bulkEncoding, pageFeedItemServiceDownloadJob.bulkEncoding) &&
        Objects.equals(this.bulkLang, pageFeedItemServiceDownloadJob.bulkLang) &&
        Objects.equals(this.bulkOutput, pageFeedItemServiceDownloadJob.bulkOutput) &&
        Objects.equals(this.downloadJobStatus, pageFeedItemServiceDownloadJob.downloadJobStatus) &&
        Objects.equals(this.endDate, pageFeedItemServiceDownloadJob.endDate) &&
        Objects.equals(this.feedId, pageFeedItemServiceDownloadJob.feedId) &&
        Objects.equals(this.jobId, pageFeedItemServiceDownloadJob.jobId) &&
        Objects.equals(this.progress, pageFeedItemServiceDownloadJob.progress) &&
        Objects.equals(this.startDate, pageFeedItemServiceDownloadJob.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bulkEncoding, bulkLang, bulkOutput, downloadJobStatus, endDate, feedId, jobId, progress, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceDownloadJob {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bulkEncoding: ").append(toIndentedString(bulkEncoding)).append("\n");
    sb.append("    bulkLang: ").append(toIndentedString(bulkLang)).append("\n");
    sb.append("    bulkOutput: ").append(toIndentedString(bulkOutput)).append("\n");
    sb.append("    downloadJobStatus: ").append(toIndentedString(downloadJobStatus)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
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

