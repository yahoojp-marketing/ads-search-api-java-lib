package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.PageFeedItemServiceUploadJobStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceUploadJobオブジェクトは、ページフィードアイテム情報をダウンロードする処理内容を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceUploadJob object retains contents of page feed item information for upload.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceUploadJobオブジェクトは、ページフィードアイテム情報をダウンロードする処理内容を格納します。</div> <div lang=\"en\">PageFeedItemServiceUploadJob object retains contents of page feed item information for upload.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceUploadJob   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("errorCount")
  private Integer errorCount = null;

  @JsonProperty("feedIds")
  @Valid
  private List<Long> feedIds = null;

  @JsonProperty("jobId")
  private Long jobId = null;

  @JsonProperty("progress")
  private Integer progress = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("uploadJobStatus")
  private PageFeedItemServiceUploadJobStatus uploadJobStatus = null;

  public PageFeedItemServiceUploadJob accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public PageFeedItemServiceUploadJob endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの終了日<br> 形式：yyyyMMddHHmmss</div> <div lang=\"en\">End date of job<br> Format:yyyyMMddHHmmss</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの終了日<br> 形式：yyyyMMddHHmmss</div> <div lang=\"en\">End date of job<br> Format:yyyyMMddHHmmss</div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public PageFeedItemServiceUploadJob errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * <div lang=\"ja\">エラーの件数</div> <div lang=\"en\">count of error occured</div> 
   * @return errorCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エラーの件数</div> <div lang=\"en\">count of error occured</div> ")


  public Integer getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }

  public PageFeedItemServiceUploadJob feedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
    return this;
  }

  public PageFeedItemServiceUploadJob addFeedIdsItem(Long feedIdsItem) {
    if (this.feedIds == null) {
      this.feedIds = new ArrayList<>();
    }
    this.feedIds.add(feedIdsItem);
    return this;
  }

  /**
   * Get feedIds
   * @return feedIds
  */
  @ApiModelProperty(value = "")


  public List<Long> getFeedIds() {
    return feedIds;
  }

  public void setFeedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
  }

  public PageFeedItemServiceUploadJob jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブID</div> <div lang=\"en\">Job ID.</div> 
   * @return jobId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブID</div> <div lang=\"en\">Job ID.</div> ")


  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public PageFeedItemServiceUploadJob progress(Integer progress) {
    this.progress = progress;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの進捗状況</div> <div lang=\"en\">Progress of page feed item job</div> 
   * @return progress
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの進捗状況</div> <div lang=\"en\">Progress of page feed item job</div> ")


  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public PageFeedItemServiceUploadJob startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\">ジョブの開始日<br> 形式：yyyyMMddHHmmss</div> <div lang=\"en\">Start date of job<br> Format:yyyyMMddHHmmss</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ジョブの開始日<br> 形式：yyyyMMddHHmmss</div> <div lang=\"en\">Start date of job<br> Format:yyyyMMddHHmmss</div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public PageFeedItemServiceUploadJob uploadJobStatus(PageFeedItemServiceUploadJobStatus uploadJobStatus) {
    this.uploadJobStatus = uploadJobStatus;
    return this;
  }

  /**
   * Get uploadJobStatus
   * @return uploadJobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public PageFeedItemServiceUploadJobStatus getUploadJobStatus() {
    return uploadJobStatus;
  }

  public void setUploadJobStatus(PageFeedItemServiceUploadJobStatus uploadJobStatus) {
    this.uploadJobStatus = uploadJobStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedItemServiceUploadJob pageFeedItemServiceUploadJob = (PageFeedItemServiceUploadJob) o;
    return Objects.equals(this.accountId, pageFeedItemServiceUploadJob.accountId) &&
        Objects.equals(this.endDate, pageFeedItemServiceUploadJob.endDate) &&
        Objects.equals(this.errorCount, pageFeedItemServiceUploadJob.errorCount) &&
        Objects.equals(this.feedIds, pageFeedItemServiceUploadJob.feedIds) &&
        Objects.equals(this.jobId, pageFeedItemServiceUploadJob.jobId) &&
        Objects.equals(this.progress, pageFeedItemServiceUploadJob.progress) &&
        Objects.equals(this.startDate, pageFeedItemServiceUploadJob.startDate) &&
        Objects.equals(this.uploadJobStatus, pageFeedItemServiceUploadJob.uploadJobStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, endDate, errorCount, feedIds, jobId, progress, startDate, uploadJobStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceUploadJob {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    feedIds: ").append(toIndentedString(feedIds)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    uploadJobStatus: ").append(toIndentedString(uploadJobStatus)).append("\n");
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

