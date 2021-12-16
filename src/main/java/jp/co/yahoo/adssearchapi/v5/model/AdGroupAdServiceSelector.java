package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceAdType;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceContainsLabelId;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceCreatedDateRange;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceSelectorオブジェクトは、操作の対象とする広告およびフィルタ条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceSelector object describes the information and filter criteria of the Ads to be operated on.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceSelectorオブジェクトは、操作の対象とする広告およびフィルタ条件を表します。</div> <div lang=\"en\">AdGroupAdServiceSelector object describes the information and filter criteria of the Ads to be operated on.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceSelector   {

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

  @JsonProperty("adIds")
  @Valid
  private List<Long> adIds = null;

  @JsonProperty("adTypes")
  @Valid
  private List<AdGroupAdServiceAdType> adTypes = null;

  @JsonProperty("approvalStatuses")
  @Valid
  private List<AdGroupAdServiceApprovalStatus> approvalStatuses = null;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("containsLabelId")
  private AdGroupAdServiceContainsLabelId containsLabelId = null;

  @JsonProperty("labelIds")
  @Valid
  private List<Long> labelIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("userStatuses")
  @Valid
  private List<AdGroupAdServiceUserStatus> userStatuses = null;

  @JsonProperty("createdDateRange")
  private AdGroupAdServiceCreatedDateRange createdDateRange = null;

  public AdGroupAdServiceSelector accountId(Long accountId) {
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

  public AdGroupAdServiceSelector adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public AdGroupAdServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad group ID.<br> Ads returned will be from adgroups whose ids are included in this list.</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad group ID.<br> Ads returned will be from adgroups whose ids are included in this list.</div> ")

@Size(max=1000) 
  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdGroupAdServiceSelector adIds(List<Long> adIds) {
    this.adIds = adIds;
    return this;
  }

  public AdGroupAdServiceSelector addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：広告ID</div> <div lang=\"en\">Search condition: Ad ID.<br> Ads will return from ads whose ids are included in this list.<br> If you omit adIds field, it will return all adIds under the adGroup.</div> 
   * @return adIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告ID</div> <div lang=\"en\">Search condition: Ad ID.<br> Ads will return from ads whose ids are included in this list.<br> If you omit adIds field, it will return all adIds under the adGroup.</div> ")

@Size(max=1000) 
  public List<Long> getAdIds() {
    return adIds;
  }

  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }

  public AdGroupAdServiceSelector adTypes(List<AdGroupAdServiceAdType> adTypes) {
    this.adTypes = adTypes;
    return this;
  }

  public AdGroupAdServiceSelector addAdTypesItem(AdGroupAdServiceAdType adTypesItem) {
    if (this.adTypes == null) {
      this.adTypes = new ArrayList<>();
    }
    this.adTypes.add(adTypesItem);
    return this;
  }

  /**
   * Get adTypes
   * @return adTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public List<AdGroupAdServiceAdType> getAdTypes() {
    return adTypes;
  }

  public void setAdTypes(List<AdGroupAdServiceAdType> adTypes) {
    this.adTypes = adTypes;
  }

  public AdGroupAdServiceSelector approvalStatuses(List<AdGroupAdServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
    return this;
  }

  public AdGroupAdServiceSelector addApprovalStatusesItem(AdGroupAdServiceApprovalStatus approvalStatusesItem) {
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
  public List<AdGroupAdServiceApprovalStatus> getApprovalStatuses() {
    return approvalStatuses;
  }

  public void setApprovalStatuses(List<AdGroupAdServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
  }

  public AdGroupAdServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public AdGroupAdServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID.<br> Ads returned will be from campaigns whose ids are included in this list.<br> An empty list means there are no campaign restrictions when selecting AdGroupAds.<br> * This field must contain distinct elements.<br>* This field cannot contain null elements.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID.<br> Ads returned will be from campaigns whose ids are included in this list.<br> An empty list means there are no campaign restrictions when selecting AdGroupAds.<br> * This field must contain distinct elements.<br>* This field cannot contain null elements.</div> ")

@Size(max=1000) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdGroupAdServiceSelector containsLabelId(AdGroupAdServiceContainsLabelId containsLabelId) {
    this.containsLabelId = containsLabelId;
    return this;
  }

  /**
   * Get containsLabelId
   * @return containsLabelId
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceContainsLabelId getContainsLabelId() {
    return containsLabelId;
  }

  public void setContainsLabelId(AdGroupAdServiceContainsLabelId containsLabelId) {
    this.containsLabelId = containsLabelId;
  }

  public AdGroupAdServiceSelector labelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
    return this;
  }

  public AdGroupAdServiceSelector addLabelIdsItem(Long labelIdsItem) {
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

  public AdGroupAdServiceSelector numberResults(Integer numberResults) {
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

  public AdGroupAdServiceSelector startIndex(Integer startIndex) {
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

  public AdGroupAdServiceSelector userStatuses(List<AdGroupAdServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
    return this;
  }

  public AdGroupAdServiceSelector addUserStatusesItem(AdGroupAdServiceUserStatus userStatusesItem) {
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
  public List<AdGroupAdServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }

  public void setUserStatuses(List<AdGroupAdServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
  }

  public AdGroupAdServiceSelector createdDateRange(AdGroupAdServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = createdDateRange;
    return this;
  }

  /**
   * Get createdDateRange
   * @return createdDateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceCreatedDateRange getCreatedDateRange() {
    return createdDateRange;
  }

  public void setCreatedDateRange(AdGroupAdServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = createdDateRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceSelector adGroupAdServiceSelector = (AdGroupAdServiceSelector) o;
    return Objects.equals(this.accountId, adGroupAdServiceSelector.accountId) &&
        Objects.equals(this.adGroupIds, adGroupAdServiceSelector.adGroupIds) &&
        Objects.equals(this.adIds, adGroupAdServiceSelector.adIds) &&
        Objects.equals(this.adTypes, adGroupAdServiceSelector.adTypes) &&
        Objects.equals(this.approvalStatuses, adGroupAdServiceSelector.approvalStatuses) &&
        Objects.equals(this.campaignIds, adGroupAdServiceSelector.campaignIds) &&
        Objects.equals(this.containsLabelId, adGroupAdServiceSelector.containsLabelId) &&
        Objects.equals(this.labelIds, adGroupAdServiceSelector.labelIds) &&
        Objects.equals(this.numberResults, adGroupAdServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, adGroupAdServiceSelector.startIndex) &&
        Objects.equals(this.userStatuses, adGroupAdServiceSelector.userStatuses) &&
        Objects.equals(this.createdDateRange, adGroupAdServiceSelector.createdDateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupIds, adIds, adTypes, approvalStatuses, campaignIds, containsLabelId, labelIds, numberResults, startIndex, userStatuses, createdDateRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    adTypes: ").append(toIndentedString(adTypes)).append("\n");
    sb.append("    approvalStatuses: ").append(toIndentedString(approvalStatuses)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    containsLabelId: ").append(toIndentedString(containsLabelId)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    userStatuses: ").append(toIndentedString(userStatuses)).append("\n");
    sb.append("    createdDateRange: ").append(toIndentedString(createdDateRange)).append("\n");
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

