package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.PageFeedItemServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v6.model.PageFeedItemServicePageFeedUrl;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceSelectorオブジェクトは、登録したページフィードアイテムを照会するための検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceSelector object stores search condition to inquire about registered page feed item.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceSelectorオブジェクトは、登録したページフィードアイテムを照会するための検索条件を格納します。</div> <div lang=\"en\">PageFeedItemServiceSelector object stores search condition to inquire about registered page feed item.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.11";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("approvalStatuses")
  @Valid
  private List<PageFeedItemServiceApprovalStatus> approvalStatuses = null;

  @JsonProperty("feedIds")
  @Valid
  private List<Long> feedIds = new ArrayList<>();

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("pageFeedCustomLabel")
  @Valid
  private List<String> pageFeedCustomLabel = null;

  @JsonProperty("pageFeedUrl")
  @Valid
  private List<PageFeedItemServicePageFeedUrl> pageFeedUrl = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public PageFeedItemServiceSelector accountId(Long accountId) {
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

  public PageFeedItemServiceSelector approvalStatuses(List<PageFeedItemServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
    return this;
  }

  public PageFeedItemServiceSelector addApprovalStatusesItem(PageFeedItemServiceApprovalStatus approvalStatusesItem) {
    if (this.approvalStatuses == null) {
      this.approvalStatuses = new ArrayList<>();
    }
    this.approvalStatuses.add(approvalStatusesItem);
    return this;
  }

  /**
   * Get approvalStatuses
   * @return approvalStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public List<PageFeedItemServiceApprovalStatus> getApprovalStatuses() {
    return approvalStatuses;
  }

  public void setApprovalStatuses(List<PageFeedItemServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
  }

  public PageFeedItemServiceSelector feedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
    return this;
  }

  public PageFeedItemServiceSelector addFeedIdsItem(Long feedIdsItem) {
    if (this.feedIds == null) {
      this.feedIds = new ArrayList<>();
    }
    this.feedIds.add(feedIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">フィードID</div> <div lang=\"en\">Feed ID</div> 
   * @return feedIds
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">フィードID</div> <div lang=\"en\">Feed ID</div> ")
  @NotNull

@Size(min=1,max=1000) 
  public List<Long> getFeedIds() {
    return feedIds;
  }

  public void setFeedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
  }

  public PageFeedItemServiceSelector numberResults(Integer numberResults) {
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

  public PageFeedItemServiceSelector pageFeedCustomLabel(List<String> pageFeedCustomLabel) {
    this.pageFeedCustomLabel = pageFeedCustomLabel;
    return this;
  }

  public PageFeedItemServiceSelector addPageFeedCustomLabelItem(String pageFeedCustomLabelItem) {
    if (this.pageFeedCustomLabel == null) {
      this.pageFeedCustomLabel = new ArrayList<>();
    }
    this.pageFeedCustomLabel.add(pageFeedCustomLabelItem);
    return this;
  }

  /**
   * <div lang=\"ja\">カスタムラベル</div> <div lang=\"en\">Custom label</div> 
   * @return pageFeedCustomLabel
  */
  @ApiModelProperty(value = "<div lang=\"ja\">カスタムラベル</div> <div lang=\"en\">Custom label</div> ")

@Size(max=5) 
  public List<String> getPageFeedCustomLabel() {
    return pageFeedCustomLabel;
  }

  public void setPageFeedCustomLabel(List<String> pageFeedCustomLabel) {
    this.pageFeedCustomLabel = pageFeedCustomLabel;
  }

  public PageFeedItemServiceSelector pageFeedUrl(List<PageFeedItemServicePageFeedUrl> pageFeedUrl) {
    this.pageFeedUrl = pageFeedUrl;
    return this;
  }

  public PageFeedItemServiceSelector addPageFeedUrlItem(PageFeedItemServicePageFeedUrl pageFeedUrlItem) {
    if (this.pageFeedUrl == null) {
      this.pageFeedUrl = new ArrayList<>();
    }
    this.pageFeedUrl.add(pageFeedUrlItem);
    return this;
  }

  /**
   * Get pageFeedUrl
   * @return pageFeedUrl
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public List<PageFeedItemServicePageFeedUrl> getPageFeedUrl() {
    return pageFeedUrl;
  }

  public void setPageFeedUrl(List<PageFeedItemServicePageFeedUrl> pageFeedUrl) {
    this.pageFeedUrl = pageFeedUrl;
  }

  public PageFeedItemServiceSelector startIndex(Integer startIndex) {
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
    PageFeedItemServiceSelector pageFeedItemServiceSelector = (PageFeedItemServiceSelector) o;
    return Objects.equals(this.accountId, pageFeedItemServiceSelector.accountId) &&
        Objects.equals(this.approvalStatuses, pageFeedItemServiceSelector.approvalStatuses) &&
        Objects.equals(this.feedIds, pageFeedItemServiceSelector.feedIds) &&
        Objects.equals(this.numberResults, pageFeedItemServiceSelector.numberResults) &&
        Objects.equals(this.pageFeedCustomLabel, pageFeedItemServiceSelector.pageFeedCustomLabel) &&
        Objects.equals(this.pageFeedUrl, pageFeedItemServiceSelector.pageFeedUrl) &&
        Objects.equals(this.startIndex, pageFeedItemServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatuses, feedIds, numberResults, pageFeedCustomLabel, pageFeedUrl, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatuses: ").append(toIndentedString(approvalStatuses)).append("\n");
    sb.append("    feedIds: ").append(toIndentedString(feedIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    pageFeedCustomLabel: ").append(toIndentedString(pageFeedCustomLabel)).append("\n");
    sb.append("    pageFeedUrl: ").append(toIndentedString(pageFeedUrl)).append("\n");
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

