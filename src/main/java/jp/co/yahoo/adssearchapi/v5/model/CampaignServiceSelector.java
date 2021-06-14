package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceBudgetAmountRange;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceContainsLabelId;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceCreatedDateRange;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceSelectorオブジェクトは、操作の対象とするキャンペーンの情報およびフィルタ条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceSelector object displays information and filter criteria of campaign to be operated.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceSelectorオブジェクトは、操作の対象とするキャンペーンの情報およびフィルタ条件を表します。</div> <div lang=\"en\">CampaignServiceSelector object displays information and filter criteria of campaign to be operated.</div> ")

public class CampaignServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("biddingStrategyIds")
  @Valid
  private JsonNullable<List<Long>> biddingStrategyIds = JsonNullable.undefined();

  @JsonProperty("campaignIds")
  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.undefined();

  @JsonProperty("containsLabelId")
  private JsonNullable<CampaignServiceContainsLabelId> containsLabelId = JsonNullable.undefined();

  @JsonProperty("labelIds")
  @Valid
  private JsonNullable<List<Long>> labelIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("userStatuses")
  @Valid
  private JsonNullable<List<CampaignServiceUserStatus>> userStatuses = JsonNullable.undefined();

  @JsonProperty("createdDateRange")
  private JsonNullable<CampaignServiceCreatedDateRange> createdDateRange = JsonNullable.undefined();

  @JsonProperty("budgetAmountRange")
  private JsonNullable<CampaignServiceBudgetAmountRange> budgetAmountRange = JsonNullable.undefined();

  public CampaignServiceSelector accountId(Long accountId) {
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

  public CampaignServiceSelector biddingStrategyIds(List<Long> biddingStrategyIds) {
    this.biddingStrategyIds = JsonNullable.of(biddingStrategyIds);
    return this;
  }

  public CampaignServiceSelector addBiddingStrategyIdsItem(Long biddingStrategyIdsItem) {
    if (this.biddingStrategyIds == null || !this.biddingStrategyIds.isPresent()) {
      this.biddingStrategyIds = JsonNullable.of(new ArrayList<>());
    }
    this.biddingStrategyIds.get().add(biddingStrategyIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：自動入札IDです。</div> <div lang=\"en\">Search condition: Auto Bidding ID.</div> 
   * @return biddingStrategyIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：自動入札IDです。</div> <div lang=\"en\">Search condition: Auto Bidding ID.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getBiddingStrategyIds() {
    return biddingStrategyIds;
  }

  public void setBiddingStrategyIds(JsonNullable<List<Long>> biddingStrategyIds) {
    this.biddingStrategyIds = biddingStrategyIds;
  }

  public CampaignServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public CampaignServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：キャンペーンIDです。<br> ※指定しない場合は、フィルタ条件に すべてのキャンペーンが含まれます。</div> <div lang=\"en\">Search condition: Campaign ID<br> * All campaign will return, if no campaign are not specified.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンIDです。<br> ※指定しない場合は、フィルタ条件に すべてのキャンペーンが含まれます。</div> <div lang=\"en\">Search condition: Campaign ID<br> * All campaign will return, if no campaign are not specified.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public CampaignServiceSelector containsLabelId(CampaignServiceContainsLabelId containsLabelId) {
    this.containsLabelId = JsonNullable.of(containsLabelId);
    return this;
  }

  /**
   * Get containsLabelId
   * @return containsLabelId
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceContainsLabelId> getContainsLabelId() {
    return containsLabelId;
  }

  public void setContainsLabelId(JsonNullable<CampaignServiceContainsLabelId> containsLabelId) {
    this.containsLabelId = containsLabelId;
  }

  public CampaignServiceSelector labelIds(List<Long> labelIds) {
    this.labelIds = JsonNullable.of(labelIds);
    return this;
  }

  public CampaignServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null || !this.labelIds.isPresent()) {
      this.labelIds = JsonNullable.of(new ArrayList<>());
    }
    this.labelIds.get().add(labelIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：ラベルIDです。</div> <div lang=\"en\">Search condition: Label ID.</div> 
   * @return labelIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ラベルIDです。</div> <div lang=\"en\">Search condition: Label ID.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getLabelIds() {
    return labelIds;
  }

  public void setLabelIds(JsonNullable<List<Long>> labelIds) {
    this.labelIds = labelIds;
  }

  public CampaignServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
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
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public CampaignServiceSelector startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }

  public CampaignServiceSelector userStatuses(List<CampaignServiceUserStatus> userStatuses) {
    this.userStatuses = JsonNullable.of(userStatuses);
    return this;
  }

  public CampaignServiceSelector addUserStatusesItem(CampaignServiceUserStatus userStatusesItem) {
    if (this.userStatuses == null || !this.userStatuses.isPresent()) {
      this.userStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.userStatuses.get().add(userStatusesItem);
    return this;
  }

  /**
   * Get userStatuses
   * @return userStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public JsonNullable<List<CampaignServiceUserStatus>> getUserStatuses() {
    return userStatuses;
  }

  public void setUserStatuses(JsonNullable<List<CampaignServiceUserStatus>> userStatuses) {
    this.userStatuses = userStatuses;
  }

  public CampaignServiceSelector createdDateRange(CampaignServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = JsonNullable.of(createdDateRange);
    return this;
  }

  /**
   * Get createdDateRange
   * @return createdDateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceCreatedDateRange> getCreatedDateRange() {
    return createdDateRange;
  }

  public void setCreatedDateRange(JsonNullable<CampaignServiceCreatedDateRange> createdDateRange) {
    this.createdDateRange = createdDateRange;
  }

  public CampaignServiceSelector budgetAmountRange(CampaignServiceBudgetAmountRange budgetAmountRange) {
    this.budgetAmountRange = JsonNullable.of(budgetAmountRange);
    return this;
  }

  /**
   * Get budgetAmountRange
   * @return budgetAmountRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBudgetAmountRange> getBudgetAmountRange() {
    return budgetAmountRange;
  }

  public void setBudgetAmountRange(JsonNullable<CampaignServiceBudgetAmountRange> budgetAmountRange) {
    this.budgetAmountRange = budgetAmountRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceSelector campaignServiceSelector = (CampaignServiceSelector) o;
    return Objects.equals(this.accountId, campaignServiceSelector.accountId) &&
        Objects.equals(this.biddingStrategyIds, campaignServiceSelector.biddingStrategyIds) &&
        Objects.equals(this.campaignIds, campaignServiceSelector.campaignIds) &&
        Objects.equals(this.containsLabelId, campaignServiceSelector.containsLabelId) &&
        Objects.equals(this.labelIds, campaignServiceSelector.labelIds) &&
        Objects.equals(this.numberResults, campaignServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, campaignServiceSelector.startIndex) &&
        Objects.equals(this.userStatuses, campaignServiceSelector.userStatuses) &&
        Objects.equals(this.createdDateRange, campaignServiceSelector.createdDateRange) &&
        Objects.equals(this.budgetAmountRange, campaignServiceSelector.budgetAmountRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, biddingStrategyIds, campaignIds, containsLabelId, labelIds, numberResults, startIndex, userStatuses, createdDateRange, budgetAmountRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    biddingStrategyIds: ").append(toIndentedString(biddingStrategyIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    containsLabelId: ").append(toIndentedString(containsLabelId)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    userStatuses: ").append(toIndentedString(userStatuses)).append("\n");
    sb.append("    createdDateRange: ").append(toIndentedString(createdDateRange)).append("\n");
    sb.append("    budgetAmountRange: ").append(toIndentedString(budgetAmountRange)).append("\n");
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

