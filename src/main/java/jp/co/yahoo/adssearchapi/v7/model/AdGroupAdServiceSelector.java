/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceAdType;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceContainsLabelId;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceCreatedDateRange;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceSelectorオブジェクトは、操作の対象とする広告およびフィルタ条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceSelector object describes the information and filter criteria of the Ads to be operated on.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceSelectorオブジェクトは、操作の対象とする広告およびフィルタ条件を表します。</div> <div lang=\"en\">AdGroupAdServiceSelector object describes the information and filter criteria of the Ads to be operated on.</div> ")
@JsonPropertyOrder({
  AdGroupAdServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupAdServiceSelector.JSON_PROPERTY_AD_GROUP_IDS,
  AdGroupAdServiceSelector.JSON_PROPERTY_AD_IDS,
  AdGroupAdServiceSelector.JSON_PROPERTY_AD_TYPES,
  AdGroupAdServiceSelector.JSON_PROPERTY_APPROVAL_STATUSES,
  AdGroupAdServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  AdGroupAdServiceSelector.JSON_PROPERTY_CONTAINS_LABEL_ID,
  AdGroupAdServiceSelector.JSON_PROPERTY_LABEL_IDS,
  AdGroupAdServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AdGroupAdServiceSelector.JSON_PROPERTY_START_INDEX,
  AdGroupAdServiceSelector.JSON_PROPERTY_USER_STATUSES,
  AdGroupAdServiceSelector.JSON_PROPERTY_CREATED_DATE_RANGE
})
@JsonTypeName("AdGroupAdServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_IDS = "adGroupIds";
  private List<Long> adGroupIds = null;

  public static final String JSON_PROPERTY_AD_IDS = "adIds";
  private List<Long> adIds = null;

  public static final String JSON_PROPERTY_AD_TYPES = "adTypes";
  private List<AdGroupAdServiceAdType> adTypes = null;

  public static final String JSON_PROPERTY_APPROVAL_STATUSES = "approvalStatuses";
  private List<AdGroupAdServiceApprovalStatus> approvalStatuses = null;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_CONTAINS_LABEL_ID = "containsLabelId";
  private AdGroupAdServiceContainsLabelId containsLabelId;

  public static final String JSON_PROPERTY_LABEL_IDS = "labelIds";
  private List<Long> labelIds = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_USER_STATUSES = "userStatuses";
  private List<AdGroupAdServiceUserStatus> userStatuses = null;

  public static final String JSON_PROPERTY_CREATED_DATE_RANGE = "createdDateRange";
  private AdGroupAdServiceCreatedDateRange createdDateRange;

  public AdGroupAdServiceSelector() { 
  }

  public AdGroupAdServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Search condition: Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：広告グループID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Ad group ID.&lt;br&gt; Ads returned will be from adgroups whose ids are included in this list.&lt;/div&gt; 
   * @return adGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad group ID.<br> Ads returned will be from adgroups whose ids are included in this list.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：広告ID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Ad ID.&lt;br&gt; Ads will return from ads whose ids are included in this list.&lt;br&gt; If you omit adIds field, it will return all adIds under the adGroup.&lt;/div&gt; 
   * @return adIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告ID</div> <div lang=\"en\">Search condition: Ad ID.<br> Ads will return from ads whose ids are included in this list.<br> If you omit adIds field, it will return all adIds under the adGroup.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdIds() {
    return adIds;
  }


  @JsonProperty(JSON_PROPERTY_AD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceAdType> getAdTypes() {
    return adTypes;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceApprovalStatus> getApprovalStatuses() {
    return approvalStatuses;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：キャンペーンID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Campaign ID.&lt;br&gt; Ads returned will be from campaigns whose ids are included in this list.&lt;br&gt; An empty list means there are no campaign restrictions when selecting AdGroupAds.&lt;br&gt; * This field must contain distinct elements.&lt;br&gt;* This field cannot contain null elements.&lt;/div&gt; 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID.<br> Ads returned will be from campaigns whose ids are included in this list.<br> An empty list means there are no campaign restrictions when selecting AdGroupAds.<br> * This field must contain distinct elements.<br>* This field cannot contain null elements.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceContainsLabelId getContainsLabelId() {
    return containsLabelId;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：ラベルID&lt;br&gt; ※labelIdsを指定する場合は、containsLabelIdをTRUEにする必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Label ID&lt;br&gt; *To specify labelIds, must be containsLabelId set TRUE.&lt;/div&gt; 
   * @return labelIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ラベルID<br> ※labelIdsを指定する場合は、containsLabelIdをTRUEにする必要があります。</div> <div lang=\"en\">Search condition: Label ID<br> *To specify labelIds, must be containsLabelId set TRUE.</div> ")
  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getLabelIds() {
    return labelIds;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
  }


  public AdGroupAdServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 10000
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public AdGroupAdServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceCreatedDateRange getCreatedDateRange() {
    return createdDateRange;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

