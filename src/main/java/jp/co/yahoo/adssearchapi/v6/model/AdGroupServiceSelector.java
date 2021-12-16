package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupServiceBiddingKeywordCpcRange;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupServiceContainsLabelId;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupServiceCreatedDateRange;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceSelectorオブジェクトは、指定された広告グループを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceSelector object displays the specified ad group.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceSelectorオブジェクトは、指定された広告グループを表します。</div> <div lang=\"en\">AdGroupServiceSelector object displays the specified ad group.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.11";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("adGroupIds")
  @Valid
  private List<Long> adGroupIds = null;

  @JsonProperty("biddingStrategyIds")
  @Valid
  private List<Long> biddingStrategyIds = null;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("containsLabelId")
  private AdGroupServiceContainsLabelId containsLabelId = null;

  @JsonProperty("labelIds")
  @Valid
  private List<Long> labelIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("userStatuses")
  @Valid
  private List<AdGroupServiceUserStatus> userStatuses = null;

  @JsonProperty("createdDateRange")
  private AdGroupServiceCreatedDateRange createdDateRange = null;

  @JsonProperty("biddingKeywordCpcRange")
  private AdGroupServiceBiddingKeywordCpcRange biddingKeywordCpcRange = null;

  public AdGroupServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Search condition: Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Search condition: Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdGroupServiceSelector adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public AdGroupServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad Group ID</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad Group ID</div> ")

@Size(max=1000) 
  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdGroupServiceSelector biddingStrategyIds(List<Long> biddingStrategyIds) {
    this.biddingStrategyIds = biddingStrategyIds;
    return this;
  }

  public AdGroupServiceSelector addBiddingStrategyIdsItem(Long biddingStrategyIdsItem) {
    if (this.biddingStrategyIds == null) {
      this.biddingStrategyIds = new ArrayList<>();
    }
    this.biddingStrategyIds.add(biddingStrategyIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：自動入札ID</div> <div lang=\"en\">Search condition: Auto Bidding ID</div> 
   * @return biddingStrategyIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：自動入札ID</div> <div lang=\"en\">Search condition: Auto Bidding ID</div> ")

@Size(max=1000) 
  public List<Long> getBiddingStrategyIds() {
    return biddingStrategyIds;
  }

  public void setBiddingStrategyIds(List<Long> biddingStrategyIds) {
    this.biddingStrategyIds = biddingStrategyIds;
  }

  public AdGroupServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public AdGroupServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID</div> ")

@Size(max=1000) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdGroupServiceSelector containsLabelId(AdGroupServiceContainsLabelId containsLabelId) {
    this.containsLabelId = containsLabelId;
    return this;
  }

  /**
   * Get containsLabelId
   * @return containsLabelId
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceContainsLabelId getContainsLabelId() {
    return containsLabelId;
  }

  public void setContainsLabelId(AdGroupServiceContainsLabelId containsLabelId) {
    this.containsLabelId = containsLabelId;
  }

  public AdGroupServiceSelector labelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
    return this;
  }

  public AdGroupServiceSelector addLabelIdsItem(Long labelIdsItem) {
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

  public AdGroupServiceSelector numberResults(Integer numberResults) {
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

  public AdGroupServiceSelector startIndex(Integer startIndex) {
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

  public AdGroupServiceSelector userStatuses(List<AdGroupServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
    return this;
  }

  public AdGroupServiceSelector addUserStatusesItem(AdGroupServiceUserStatus userStatusesItem) {
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
  public List<AdGroupServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }

  public void setUserStatuses(List<AdGroupServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
  }

  public AdGroupServiceSelector createdDateRange(AdGroupServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = createdDateRange;
    return this;
  }

  /**
   * Get createdDateRange
   * @return createdDateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceCreatedDateRange getCreatedDateRange() {
    return createdDateRange;
  }

  public void setCreatedDateRange(AdGroupServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = createdDateRange;
  }

  public AdGroupServiceSelector biddingKeywordCpcRange(AdGroupServiceBiddingKeywordCpcRange biddingKeywordCpcRange) {
    this.biddingKeywordCpcRange = biddingKeywordCpcRange;
    return this;
  }

  /**
   * Get biddingKeywordCpcRange
   * @return biddingKeywordCpcRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceBiddingKeywordCpcRange getBiddingKeywordCpcRange() {
    return biddingKeywordCpcRange;
  }

  public void setBiddingKeywordCpcRange(AdGroupServiceBiddingKeywordCpcRange biddingKeywordCpcRange) {
    this.biddingKeywordCpcRange = biddingKeywordCpcRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceSelector adGroupServiceSelector = (AdGroupServiceSelector) o;
    return Objects.equals(this.accountId, adGroupServiceSelector.accountId) &&
        Objects.equals(this.adGroupIds, adGroupServiceSelector.adGroupIds) &&
        Objects.equals(this.biddingStrategyIds, adGroupServiceSelector.biddingStrategyIds) &&
        Objects.equals(this.campaignIds, adGroupServiceSelector.campaignIds) &&
        Objects.equals(this.containsLabelId, adGroupServiceSelector.containsLabelId) &&
        Objects.equals(this.labelIds, adGroupServiceSelector.labelIds) &&
        Objects.equals(this.numberResults, adGroupServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, adGroupServiceSelector.startIndex) &&
        Objects.equals(this.userStatuses, adGroupServiceSelector.userStatuses) &&
        Objects.equals(this.createdDateRange, adGroupServiceSelector.createdDateRange) &&
        Objects.equals(this.biddingKeywordCpcRange, adGroupServiceSelector.biddingKeywordCpcRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupIds, biddingStrategyIds, campaignIds, containsLabelId, labelIds, numberResults, startIndex, userStatuses, createdDateRange, biddingKeywordCpcRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    biddingStrategyIds: ").append(toIndentedString(biddingStrategyIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    containsLabelId: ").append(toIndentedString(containsLabelId)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    userStatuses: ").append(toIndentedString(userStatuses)).append("\n");
    sb.append("    createdDateRange: ").append(toIndentedString(createdDateRange)).append("\n");
    sb.append("    biddingKeywordCpcRange: ").append(toIndentedString(biddingKeywordCpcRange)).append("\n");
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

