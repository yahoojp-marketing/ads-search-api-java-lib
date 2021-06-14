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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceSelectorオブジェクトは、操作の対象とする広告およびフィルタ条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceSelector object describes the information and filter criteria of the Ads to be operated on.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceSelectorオブジェクトは、操作の対象とする広告およびフィルタ条件を表します。</div> <div lang=\"en\">AdGroupAdServiceSelector object describes the information and filter criteria of the Ads to be operated on.</div> ")

public class AdGroupAdServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("adGroupIds")
  @Valid
  private JsonNullable<List<Long>> adGroupIds = JsonNullable.undefined();

  @JsonProperty("adIds")
  @Valid
  private JsonNullable<List<Long>> adIds = JsonNullable.undefined();

  @JsonProperty("adTypes")
  @Valid
  private JsonNullable<List<AdGroupAdServiceAdType>> adTypes = JsonNullable.undefined();

  @JsonProperty("approvalStatuses")
  @Valid
  private JsonNullable<List<AdGroupAdServiceApprovalStatus>> approvalStatuses = JsonNullable.undefined();

  @JsonProperty("campaignIds")
  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.undefined();

  @JsonProperty("containsLabelId")
  private JsonNullable<AdGroupAdServiceContainsLabelId> containsLabelId = JsonNullable.undefined();

  @JsonProperty("labelIds")
  @Valid
  private JsonNullable<List<Long>> labelIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("userStatuses")
  @Valid
  private JsonNullable<List<AdGroupAdServiceUserStatus>> userStatuses = JsonNullable.undefined();

  @JsonProperty("createdDateRange")
  private JsonNullable<AdGroupAdServiceCreatedDateRange> createdDateRange = JsonNullable.undefined();

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
    this.adGroupIds = JsonNullable.of(adGroupIds);
    return this;
  }

  public AdGroupAdServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null || !this.adGroupIds.isPresent()) {
      this.adGroupIds = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupIds.get().add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad group ID.<br> Ads returned will be from adgroups whose ids are included in this list.</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad group ID.<br> Ads returned will be from adgroups whose ids are included in this list.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(JsonNullable<List<Long>> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdGroupAdServiceSelector adIds(List<Long> adIds) {
    this.adIds = JsonNullable.of(adIds);
    return this;
  }

  public AdGroupAdServiceSelector addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null || !this.adIds.isPresent()) {
      this.adIds = JsonNullable.of(new ArrayList<>());
    }
    this.adIds.get().add(adIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：広告ID</div> <div lang=\"en\">Search condition: Ad ID.<br> Ads will return from ads whose ids are included in this list.<br> If you omit adIds field, it will return all adIds under the adGroup.</div> 
   * @return adIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告ID</div> <div lang=\"en\">Search condition: Ad ID.<br> Ads will return from ads whose ids are included in this list.<br> If you omit adIds field, it will return all adIds under the adGroup.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getAdIds() {
    return adIds;
  }

  public void setAdIds(JsonNullable<List<Long>> adIds) {
    this.adIds = adIds;
  }

  public AdGroupAdServiceSelector adTypes(List<AdGroupAdServiceAdType> adTypes) {
    this.adTypes = JsonNullable.of(adTypes);
    return this;
  }

  public AdGroupAdServiceSelector addAdTypesItem(AdGroupAdServiceAdType adTypesItem) {
    if (this.adTypes == null || !this.adTypes.isPresent()) {
      this.adTypes = JsonNullable.of(new ArrayList<>());
    }
    this.adTypes.get().add(adTypesItem);
    return this;
  }

  /**
   * Get adTypes
   * @return adTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public JsonNullable<List<AdGroupAdServiceAdType>> getAdTypes() {
    return adTypes;
  }

  public void setAdTypes(JsonNullable<List<AdGroupAdServiceAdType>> adTypes) {
    this.adTypes = adTypes;
  }

  public AdGroupAdServiceSelector approvalStatuses(List<AdGroupAdServiceApprovalStatus> approvalStatuses) {
    this.approvalStatuses = JsonNullable.of(approvalStatuses);
    return this;
  }

  public AdGroupAdServiceSelector addApprovalStatusesItem(AdGroupAdServiceApprovalStatus approvalStatusesItem) {
    if (this.approvalStatuses == null || !this.approvalStatuses.isPresent()) {
      this.approvalStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.approvalStatuses.get().add(approvalStatusesItem);
    return this;
  }

  /**
   * Get approvalStatuses
   * @return approvalStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public JsonNullable<List<AdGroupAdServiceApprovalStatus>> getApprovalStatuses() {
    return approvalStatuses;
  }

  public void setApprovalStatuses(JsonNullable<List<AdGroupAdServiceApprovalStatus>> approvalStatuses) {
    this.approvalStatuses = approvalStatuses;
  }

  public AdGroupAdServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public AdGroupAdServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID.<br> Ads returned will be from campaigns whose ids are included in this list.<br> An empty list means there are no campaign restrictions when selecting AdGroupAds.<br> * This field must contain distinct elements.<br>* This field cannot contain null elements.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID.<br> Ads returned will be from campaigns whose ids are included in this list.<br> An empty list means there are no campaign restrictions when selecting AdGroupAds.<br> * This field must contain distinct elements.<br>* This field cannot contain null elements.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdGroupAdServiceSelector containsLabelId(AdGroupAdServiceContainsLabelId containsLabelId) {
    this.containsLabelId = JsonNullable.of(containsLabelId);
    return this;
  }

  /**
   * Get containsLabelId
   * @return containsLabelId
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceContainsLabelId> getContainsLabelId() {
    return containsLabelId;
  }

  public void setContainsLabelId(JsonNullable<AdGroupAdServiceContainsLabelId> containsLabelId) {
    this.containsLabelId = containsLabelId;
  }

  public AdGroupAdServiceSelector labelIds(List<Long> labelIds) {
    this.labelIds = JsonNullable.of(labelIds);
    return this;
  }

  public AdGroupAdServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null || !this.labelIds.isPresent()) {
      this.labelIds = JsonNullable.of(new ArrayList<>());
    }
    this.labelIds.get().add(labelIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：ラベルID</div> <div lang=\"en\">Search condition: Label ID</div> 
   * @return labelIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ラベルID</div> <div lang=\"en\">Search condition: Label ID</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getLabelIds() {
    return labelIds;
  }

  public void setLabelIds(JsonNullable<List<Long>> labelIds) {
    this.labelIds = labelIds;
  }

  public AdGroupAdServiceSelector numberResults(Integer numberResults) {
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

  public AdGroupAdServiceSelector startIndex(Integer startIndex) {
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

  public AdGroupAdServiceSelector userStatuses(List<AdGroupAdServiceUserStatus> userStatuses) {
    this.userStatuses = JsonNullable.of(userStatuses);
    return this;
  }

  public AdGroupAdServiceSelector addUserStatusesItem(AdGroupAdServiceUserStatus userStatusesItem) {
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
  public JsonNullable<List<AdGroupAdServiceUserStatus>> getUserStatuses() {
    return userStatuses;
  }

  public void setUserStatuses(JsonNullable<List<AdGroupAdServiceUserStatus>> userStatuses) {
    this.userStatuses = userStatuses;
  }

  public AdGroupAdServiceSelector createdDateRange(AdGroupAdServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = JsonNullable.of(createdDateRange);
    return this;
  }

  /**
   * Get createdDateRange
   * @return createdDateRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceCreatedDateRange> getCreatedDateRange() {
    return createdDateRange;
  }

  public void setCreatedDateRange(JsonNullable<AdGroupAdServiceCreatedDateRange> createdDateRange) {
    this.createdDateRange = createdDateRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

