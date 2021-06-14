package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceBulkEncoding;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceBulkLang;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceBulkOutput;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceDownloadJobStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceDownloadJobオブジェクトは、ページフィードアイテム情報をダウンロードする処理内容を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceDownloadJob object retains contents of page feed item information for download.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceDownloadJobオブジェクトは、ページフィードアイテム情報をダウンロードする処理内容を格納します。</div> <div lang=\"en\">PageFeedItemServiceDownloadJob object retains contents of page feed item information for download.</div> ")

public class PageFeedItemServiceDownloadJob   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("bulkEncoding")
  private JsonNullable<PageFeedItemServiceBulkEncoding> bulkEncoding = JsonNullable.undefined();

  @JsonProperty("bulkLang")
  private JsonNullable<PageFeedItemServiceBulkLang> bulkLang = JsonNullable.undefined();

  @JsonProperty("bulkOutput")
  private JsonNullable<PageFeedItemServiceBulkOutput> bulkOutput = JsonNullable.undefined();

  @JsonProperty("downloadJobStatus")
  private JsonNullable<PageFeedItemServiceDownloadJobStatus> downloadJobStatus = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  @JsonProperty("feedId")
  private JsonNullable<Long> feedId = JsonNullable.undefined();

  @JsonProperty("jobId")
  private JsonNullable<Long> jobId = JsonNullable.undefined();

  @JsonProperty("progress")
  private JsonNullable<Integer> progress = JsonNullable.undefined();

  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  public PageFeedItemServiceDownloadJob accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br> This field is required.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br> This field is required.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public PageFeedItemServiceDownloadJob bulkEncoding(PageFeedItemServiceBulkEncoding bulkEncoding) {
    this.bulkEncoding = JsonNullable.of(bulkEncoding);
    return this;
  }

  /**
   * Get bulkEncoding
   * @return bulkEncoding
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<PageFeedItemServiceBulkEncoding> getBulkEncoding() {
    return bulkEncoding;
  }

  public void setBulkEncoding(JsonNullable<PageFeedItemServiceBulkEncoding> bulkEncoding) {
    this.bulkEncoding = bulkEncoding;
  }

  public PageFeedItemServiceDownloadJob bulkLang(PageFeedItemServiceBulkLang bulkLang) {
    this.bulkLang = JsonNullable.of(bulkLang);
    return this;
  }

  /**
   * Get bulkLang
   * @return bulkLang
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<PageFeedItemServiceBulkLang> getBulkLang() {
    return bulkLang;
  }

  public void setBulkLang(JsonNullable<PageFeedItemServiceBulkLang> bulkLang) {
    this.bulkLang = bulkLang;
  }

  public PageFeedItemServiceDownloadJob bulkOutput(PageFeedItemServiceBulkOutput bulkOutput) {
    this.bulkOutput = JsonNullable.of(bulkOutput);
    return this;
  }

  /**
   * Get bulkOutput
   * @return bulkOutput
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<PageFeedItemServiceBulkOutput> getBulkOutput() {
    return bulkOutput;
  }

  public void setBulkOutput(JsonNullable<PageFeedItemServiceBulkOutput> bulkOutput) {
    this.bulkOutput = bulkOutput;
  }

  public PageFeedItemServiceDownloadJob downloadJobStatus(PageFeedItemServiceDownloadJobStatus downloadJobStatus) {
    this.downloadJobStatus = JsonNullable.of(downloadJobStatus);
    return this;
  }

  /**
   * Get downloadJobStatus
   * @return downloadJobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<PageFeedItemServiceDownloadJobStatus> getDownloadJobStatus() {
    return downloadJobStatus;
  }

  public void setDownloadJobStatus(JsonNullable<PageFeedItemServiceDownloadJobStatus> downloadJobStatus) {
    this.downloadJobStatus = downloadJobStatus;
  }

  public PageFeedItemServiceDownloadJob endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの終了日です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> 形式：yyyyMMddHHmmss</div><div lang=\"en\">End date of job.<br> Although this field will be returned in the response, it will be ignored on input.  <br> Format:yyyyMMddHHmmss</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの終了日です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> 形式：yyyyMMddHHmmss</div><div lang=\"en\">End date of job.<br> Although this field will be returned in the response, it will be ignored on input.  <br> Format:yyyyMMddHHmmss</div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public PageFeedItemServiceDownloadJob feedId(Long feedId) {
    this.feedId = JsonNullable.of(feedId);
    return this;
  }

  /**
   * <div lang=\"ja\">フィードIDです。<br> このフィールドは必須です。</div> <div lang=\"en\">Feed ID.<br> This field is required.</div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードIDです。<br> このフィールドは必須です。</div> <div lang=\"en\">Feed ID.<br> This field is required.</div> ")


  public JsonNullable<Long> getFeedId() {
    return feedId;
  }

  public void setFeedId(JsonNullable<Long> feedId) {
    this.feedId = feedId;
  }

  public PageFeedItemServiceDownloadJob jobId(Long jobId) {
    this.jobId = JsonNullable.of(jobId);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Job ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return jobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Job ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getJobId() {
    return jobId;
  }

  public void setJobId(JsonNullable<Long> jobId) {
    this.jobId = jobId;
  }

  public PageFeedItemServiceDownloadJob progress(Integer progress) {
    this.progress = JsonNullable.of(progress);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの進捗状況です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Progress of page feed item job.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return progress
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの進捗状況です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Progress of page feed item job.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Integer> getProgress() {
    return progress;
  }

  public void setProgress(JsonNullable<Integer> progress) {
    this.progress = progress;
  }

  public PageFeedItemServiceDownloadJob startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの開始日です。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 <br> 形式：yyyyMMddHHmmss </div> <div lang=\"en\">Start date of job.<br> Although this field will be returned in the response, it will be ignored on input.<br> Format:yyyyMMddHHmmss</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの開始日です。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 <br> 形式：yyyyMMddHHmmss </div> <div lang=\"en\">Start date of job.<br> Although this field will be returned in the response, it will be ignored on input.<br> Format:yyyyMMddHHmmss</div> ")


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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

