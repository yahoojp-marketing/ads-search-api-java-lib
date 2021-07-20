package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceJobType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceJobStatusSelectorオブジェクトは、upload、downloadの処理状況を取得するための検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceJobStatusSelector object retains search condition for The processing situation upload/download.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceJobStatusSelectorオブジェクトは、upload、downloadの処理状況を取得するための検索条件を格納します。</div> <div lang=\"en\">PageFeedItemServiceJobStatusSelector object retains search condition for The processing situation upload/download.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceJobStatusSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("jobIds")
  @Valid
  private List<Long> jobIds = null;

  @JsonProperty("jobType")
  private PageFeedItemServiceJobType jobType = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public PageFeedItemServiceJobStatusSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public PageFeedItemServiceJobStatusSelector jobIds(List<Long> jobIds) {
    this.jobIds = jobIds;
    return this;
  }

  public PageFeedItemServiceJobStatusSelector addJobIdsItem(Long jobIdsItem) {
    if (this.jobIds == null) {
      this.jobIds = new ArrayList<>();
    }
    this.jobIds.add(jobIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">登録したジョブのID</div> <div lang=\"en\">Registered job ID</div> 
   * @return jobIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">登録したジョブのID</div> <div lang=\"en\">Registered job ID</div> ")

@Size(max=1000) 
  public List<Long> getJobIds() {
    return jobIds;
  }

  public void setJobIds(List<Long> jobIds) {
    this.jobIds = jobIds;
  }

  public PageFeedItemServiceJobStatusSelector jobType(PageFeedItemServiceJobType jobType) {
    this.jobType = jobType;
    return this;
  }

  /**
   * Get jobType
   * @return jobType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PageFeedItemServiceJobType getJobType() {
    return jobType;
  }

  public void setJobType(PageFeedItemServiceJobType jobType) {
    this.jobType = jobType;
  }

  public PageFeedItemServiceJobStatusSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 10000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(10000) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public PageFeedItemServiceJobStatusSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

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
    PageFeedItemServiceJobStatusSelector pageFeedItemServiceJobStatusSelector = (PageFeedItemServiceJobStatusSelector) o;
    return Objects.equals(this.accountId, pageFeedItemServiceJobStatusSelector.accountId) &&
        Objects.equals(this.jobIds, pageFeedItemServiceJobStatusSelector.jobIds) &&
        Objects.equals(this.jobType, pageFeedItemServiceJobStatusSelector.jobType) &&
        Objects.equals(this.numberResults, pageFeedItemServiceJobStatusSelector.numberResults) &&
        Objects.equals(this.startIndex, pageFeedItemServiceJobStatusSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, jobIds, jobType, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceJobStatusSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
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

