package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.FeedItemServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v6.model.FeedItemServicePlaceholderType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceSelectorオブジェクトは、フィードアイテムの情報を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceSelector describes the Feed item information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceSelectorオブジェクトは、フィードアイテムの情報を指定します。</div> <div lang=\"en\">FeedItemServiceSelector describes the Feed item information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("approvalStatuses")
  @Valid
  private List<FeedItemServiceApprovalStatus> approvalStatuses = null;

  @JsonProperty("feedIds")
  @Valid
  private List<Long> feedIds = null;

  @JsonProperty("feedItemIds")
  @Valid
  private List<Long> feedItemIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("placeholderTypes")
  @Valid
  private List<FeedItemServicePlaceholderType> placeholderTypes = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public FeedItemServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public FeedItemServiceSelector approvalStatuses(List<FeedItemServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
    return this;
  }

  public FeedItemServiceSelector addApprovalStatusesItem(FeedItemServiceApprovalStatus approvalStatusesItem) {
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
  public List<FeedItemServiceApprovalStatus> getApprovalStatuses() {
    return approvalStatuses;
  }

  public void setApprovalStatuses(List<FeedItemServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
  }

  public FeedItemServiceSelector feedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
    return this;
  }

  public FeedItemServiceSelector addFeedIdsItem(Long feedIdsItem) {
    if (this.feedIds == null) {
      this.feedIds = new ArrayList<>();
    }
    this.feedIds.add(feedIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：フィードIDです。</div> <div lang=\"en\">Search condition: Feed ID.</div> 
   * @return feedIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：フィードIDです。</div> <div lang=\"en\">Search condition: Feed ID.</div> ")

@Size(max=1000) 
  public List<Long> getFeedIds() {
    return feedIds;
  }

  public void setFeedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
  }

  public FeedItemServiceSelector feedItemIds(List<Long> feedItemIds) {
    this.feedItemIds = feedItemIds;
    return this;
  }

  public FeedItemServiceSelector addFeedItemIdsItem(Long feedItemIdsItem) {
    if (this.feedItemIds == null) {
      this.feedItemIds = new ArrayList<>();
    }
    this.feedItemIds.add(feedItemIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：フィードアイテムIDです。</div> <div lang=\"en\">Search condition: Feed Item ID.</div> 
   * @return feedItemIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：フィードアイテムIDです。</div> <div lang=\"en\">Search condition: Feed Item ID.</div> ")

@Size(max=1000) 
  public List<Long> getFeedItemIds() {
    return feedItemIds;
  }

  public void setFeedItemIds(List<Long> feedItemIds) {
    this.feedItemIds = feedItemIds;
  }

  public FeedItemServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 2000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(2000) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public FeedItemServiceSelector placeholderTypes(List<FeedItemServicePlaceholderType> placeholderTypes) {
    this.placeholderTypes = placeholderTypes;
    return this;
  }

  public FeedItemServiceSelector addPlaceholderTypesItem(FeedItemServicePlaceholderType placeholderTypesItem) {
    if (this.placeholderTypes == null) {
      this.placeholderTypes = new ArrayList<>();
    }
    this.placeholderTypes.add(placeholderTypesItem);
    return this;
  }

  /**
   * Get placeholderTypes
   * @return placeholderTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public List<FeedItemServicePlaceholderType> getPlaceholderTypes() {
    return placeholderTypes;
  }

  public void setPlaceholderTypes(List<FeedItemServicePlaceholderType> placeholderTypes) {
    this.placeholderTypes = placeholderTypes;
  }

  public FeedItemServiceSelector startIndex(Integer startIndex) {
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
    FeedItemServiceSelector feedItemServiceSelector = (FeedItemServiceSelector) o;
    return Objects.equals(this.accountId, feedItemServiceSelector.accountId) &&
        Objects.equals(this.approvalStatuses, feedItemServiceSelector.approvalStatuses) &&
        Objects.equals(this.feedIds, feedItemServiceSelector.feedIds) &&
        Objects.equals(this.feedItemIds, feedItemServiceSelector.feedItemIds) &&
        Objects.equals(this.numberResults, feedItemServiceSelector.numberResults) &&
        Objects.equals(this.placeholderTypes, feedItemServiceSelector.placeholderTypes) &&
        Objects.equals(this.startIndex, feedItemServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatuses, feedIds, feedItemIds, numberResults, placeholderTypes, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatuses: ").append(toIndentedString(approvalStatuses)).append("\n");
    sb.append("    feedIds: ").append(toIndentedString(feedIds)).append("\n");
    sb.append("    feedItemIds: ").append(toIndentedString(feedItemIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    placeholderTypes: ").append(toIndentedString(placeholderTypes)).append("\n");
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

