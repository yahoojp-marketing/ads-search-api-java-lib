package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupCriterionServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupCriterionServiceContainsLabelId;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupCriterionServiceKeyword;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupCriterionServiceUse;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupCriterionServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceSelectorオブジェクトは、操作の対象となる広告グループのクライテリアを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceSelector object displays criteria of ad group to be operated.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceSelectorオブジェクトは、操作の対象となる広告グループのクライテリアを表します。</div> <div lang=\"en\">AdGroupCriterionServiceSelector object displays criteria of ad group to be operated.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("adGroupIds")
  @Valid
  private List<Long> adGroupIds = null;

  @JsonProperty("approvalStatuses")
  @Valid
  private List<AdGroupCriterionServiceApprovalStatus> approvalStatuses = null;

  @JsonProperty("biddingStrategyIds")
  @Valid
  private List<Long> biddingStrategyIds = null;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("containsLabelId")
  private AdGroupCriterionServiceContainsLabelId containsLabelId = null;

  @JsonProperty("criterionIds")
  @Valid
  private List<Long> criterionIds = null;

  @JsonProperty("labelIds")
  @Valid
  private List<Long> labelIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("use")
  private AdGroupCriterionServiceUse use = null;

  @JsonProperty("userStatuses")
  @Valid
  private List<AdGroupCriterionServiceUserStatus> userStatuses = null;

  @JsonProperty("keyword")
  private AdGroupCriterionServiceKeyword keyword = null;

  public AdGroupCriterionServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Search condition: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Search condition: Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdGroupCriterionServiceSelector adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public AdGroupCriterionServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad group ID.</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad group ID.</div> ")

@Size(max=1000) 
  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdGroupCriterionServiceSelector approvalStatuses(List<AdGroupCriterionServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
    return this;
  }

  public AdGroupCriterionServiceSelector addApprovalStatusesItem(AdGroupCriterionServiceApprovalStatus approvalStatusesItem) {
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
  public List<AdGroupCriterionServiceApprovalStatus> getApprovalStatuses() {
    return approvalStatuses;
  }

  public void setApprovalStatuses(List<AdGroupCriterionServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
  }

  public AdGroupCriterionServiceSelector biddingStrategyIds(List<Long> biddingStrategyIds) {
    this.biddingStrategyIds = biddingStrategyIds;
    return this;
  }

  public AdGroupCriterionServiceSelector addBiddingStrategyIdsItem(Long biddingStrategyIdsItem) {
    if (this.biddingStrategyIds == null) {
      this.biddingStrategyIds = new ArrayList<>();
    }
    this.biddingStrategyIds.add(biddingStrategyIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：自動入札ID</div> <div lang=\"en\">Search condition: Auto bidding ID.</div> 
   * @return biddingStrategyIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：自動入札ID</div> <div lang=\"en\">Search condition: Auto bidding ID.</div> ")

@Size(max=1000) 
  public List<Long> getBiddingStrategyIds() {
    return biddingStrategyIds;
  }

  public void setBiddingStrategyIds(List<Long> biddingStrategyIds) {
    this.biddingStrategyIds = biddingStrategyIds;
  }

  public AdGroupCriterionServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public AdGroupCriterionServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID.</div> ")

@Size(max=1000) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdGroupCriterionServiceSelector containsLabelId(AdGroupCriterionServiceContainsLabelId containsLabelId) {
    this.containsLabelId = containsLabelId;
    return this;
  }

  /**
   * Get containsLabelId
   * @return containsLabelId
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionServiceContainsLabelId getContainsLabelId() {
    return containsLabelId;
  }

  public void setContainsLabelId(AdGroupCriterionServiceContainsLabelId containsLabelId) {
    this.containsLabelId = containsLabelId;
  }

  public AdGroupCriterionServiceSelector criterionIds(List<Long> criterionIds) {
    this.criterionIds = criterionIds;
    return this;
  }

  public AdGroupCriterionServiceSelector addCriterionIdsItem(Long criterionIdsItem) {
    if (this.criterionIds == null) {
      this.criterionIds = new ArrayList<>();
    }
    this.criterionIds.add(criterionIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：クライテリオンID<br>指定しない場合は、広告グループID以下のすべてのクライ テリアが含まれます。</div> <div lang=\"en\">Search condition: Criterion ID.<br>* All criteria under the Ad group ID will return if theres is no designation.</div> 
   * @return criterionIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：クライテリオンID<br>指定しない場合は、広告グループID以下のすべてのクライ テリアが含まれます。</div> <div lang=\"en\">Search condition: Criterion ID.<br>* All criteria under the Ad group ID will return if theres is no designation.</div> ")

@Size(max=1000) 
  public List<Long> getCriterionIds() {
    return criterionIds;
  }

  public void setCriterionIds(List<Long> criterionIds) {
    this.criterionIds = criterionIds;
  }

  public AdGroupCriterionServiceSelector labelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
    return this;
  }

  public AdGroupCriterionServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null) {
      this.labelIds = new ArrayList<>();
    }
    this.labelIds.add(labelIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：ラベルID</div> <div lang=\"en\">Search condition: Label ID</div> 
   * @return labelIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ラベルID</div> <div lang=\"en\">Search condition: Label ID</div> ")

@Size(max=1000) 
  public List<Long> getLabelIds() {
    return labelIds;
  }

  public void setLabelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
  }

  public AdGroupCriterionServiceSelector numberResults(Integer numberResults) {
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

  public AdGroupCriterionServiceSelector startIndex(Integer startIndex) {
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

  public AdGroupCriterionServiceSelector use(AdGroupCriterionServiceUse use) {
    this.use = use;
    return this;
  }

  /**
   * Get use
   * @return use
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AdGroupCriterionServiceUse getUse() {
    return use;
  }

  public void setUse(AdGroupCriterionServiceUse use) {
    this.use = use;
  }

  public AdGroupCriterionServiceSelector userStatuses(List<AdGroupCriterionServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
    return this;
  }

  public AdGroupCriterionServiceSelector addUserStatusesItem(AdGroupCriterionServiceUserStatus userStatusesItem) {
    if (this.userStatuses == null) {
      this.userStatuses = new ArrayList<>();
    }
    this.userStatuses.add(userStatusesItem);
    return this;
  }

  /**
   * Get userStatuses
   * @return userStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<AdGroupCriterionServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }

  public void setUserStatuses(List<AdGroupCriterionServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
  }

  public AdGroupCriterionServiceSelector keyword(AdGroupCriterionServiceKeyword keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Get keyword
   * @return keyword
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionServiceKeyword getKeyword() {
    return keyword;
  }

  public void setKeyword(AdGroupCriterionServiceKeyword keyword) {
    this.keyword = keyword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceSelector adGroupCriterionServiceSelector = (AdGroupCriterionServiceSelector) o;
    return Objects.equals(this.accountId, adGroupCriterionServiceSelector.accountId) &&
        Objects.equals(this.adGroupIds, adGroupCriterionServiceSelector.adGroupIds) &&
        Objects.equals(this.approvalStatuses, adGroupCriterionServiceSelector.approvalStatuses) &&
        Objects.equals(this.biddingStrategyIds, adGroupCriterionServiceSelector.biddingStrategyIds) &&
        Objects.equals(this.campaignIds, adGroupCriterionServiceSelector.campaignIds) &&
        Objects.equals(this.containsLabelId, adGroupCriterionServiceSelector.containsLabelId) &&
        Objects.equals(this.criterionIds, adGroupCriterionServiceSelector.criterionIds) &&
        Objects.equals(this.labelIds, adGroupCriterionServiceSelector.labelIds) &&
        Objects.equals(this.numberResults, adGroupCriterionServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, adGroupCriterionServiceSelector.startIndex) &&
        Objects.equals(this.use, adGroupCriterionServiceSelector.use) &&
        Objects.equals(this.userStatuses, adGroupCriterionServiceSelector.userStatuses) &&
        Objects.equals(this.keyword, adGroupCriterionServiceSelector.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupIds, approvalStatuses, biddingStrategyIds, campaignIds, containsLabelId, criterionIds, labelIds, numberResults, startIndex, use, userStatuses, keyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    approvalStatuses: ").append(toIndentedString(approvalStatuses)).append("\n");
    sb.append("    biddingStrategyIds: ").append(toIndentedString(biddingStrategyIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    containsLabelId: ").append(toIndentedString(containsLabelId)).append("\n");
    sb.append("    criterionIds: ").append(toIndentedString(criterionIds)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    userStatuses: ").append(toIndentedString(userStatuses)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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

