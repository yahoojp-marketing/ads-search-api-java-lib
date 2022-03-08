/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v6.model;

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
import jp.co.yahoo.adssearchapi.v6.model.AdGroupCriterionServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupCriterionServiceBiddingKeywordCpcRange;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupCriterionServiceContainsLabelId;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupCriterionServiceKeyword;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupCriterionServiceUse;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupCriterionServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceSelectorオブジェクトは、操作の対象となる広告グループのクライテリアを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceSelector object displays criteria of ad group to be operated.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceSelectorオブジェクトは、操作の対象となる広告グループのクライテリアを表します。</div> <div lang=\"en\">AdGroupCriterionServiceSelector object displays criteria of ad group to be operated.</div> ")
@JsonPropertyOrder({
  AdGroupCriterionServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_AD_GROUP_IDS,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_APPROVAL_STATUSES,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_BIDDING_STRATEGY_IDS,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_CONTAINS_LABEL_ID,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_CRITERION_IDS,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_LABEL_IDS,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_START_INDEX,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_USE,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_USER_STATUSES,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_KEYWORD,
  AdGroupCriterionServiceSelector.JSON_PROPERTY_BIDDING_KEYWORD_CPC_RANGE
})
@JsonTypeName("AdGroupCriterionServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupCriterionServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_IDS = "adGroupIds";
  private List<Long> adGroupIds = null;

  public static final String JSON_PROPERTY_APPROVAL_STATUSES = "approvalStatuses";
  private List<AdGroupCriterionServiceApprovalStatus> approvalStatuses = null;

  public static final String JSON_PROPERTY_BIDDING_STRATEGY_IDS = "biddingStrategyIds";
  private List<Long> biddingStrategyIds = null;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_CONTAINS_LABEL_ID = "containsLabelId";
  private AdGroupCriterionServiceContainsLabelId containsLabelId;

  public static final String JSON_PROPERTY_CRITERION_IDS = "criterionIds";
  private List<Long> criterionIds = null;

  public static final String JSON_PROPERTY_LABEL_IDS = "labelIds";
  private List<Long> labelIds = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_USE = "use";
  private AdGroupCriterionServiceUse use;

  public static final String JSON_PROPERTY_USER_STATUSES = "userStatuses";
  private List<AdGroupCriterionServiceUserStatus> userStatuses = null;

  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private AdGroupCriterionServiceKeyword keyword;

  public static final String JSON_PROPERTY_BIDDING_KEYWORD_CPC_RANGE = "biddingKeywordCpcRange";
  private AdGroupCriterionServiceBiddingKeywordCpcRange biddingKeywordCpcRange;

  public AdGroupCriterionServiceSelector() { 
  }

  public AdGroupCriterionServiceSelector accountId(Long accountId) {
    
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：広告グループID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Ad group ID.&lt;/div&gt; 
   * @return adGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad group ID.</div> ")
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupCriterionServiceApprovalStatus> getApprovalStatuses() {
    return approvalStatuses;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：自動入札ID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Auto bidding ID.&lt;/div&gt; 
   * @return biddingStrategyIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：自動入札ID</div> <div lang=\"en\">Search condition: Auto bidding ID.</div> ")
  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getBiddingStrategyIds() {
    return biddingStrategyIds;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：キャンペーンID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Campaign ID.&lt;/div&gt; 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID.</div> ")
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


  public AdGroupCriterionServiceSelector containsLabelId(AdGroupCriterionServiceContainsLabelId containsLabelId) {
    
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

  public AdGroupCriterionServiceContainsLabelId getContainsLabelId() {
    return containsLabelId;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：クライテリオンID&lt;br&gt;指定しない場合は、広告グループID以下のすべてのクライ テリアが含まれます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Criterion ID.&lt;br&gt;* All criteria under the Ad group ID will return if theres is no designation.&lt;/div&gt; 
   * @return criterionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：クライテリオンID<br>指定しない場合は、広告グループID以下のすべてのクライ テリアが含まれます。</div> <div lang=\"en\">Search condition: Criterion ID.<br>* All criteria under the Ad group ID will return if theres is no designation.</div> ")
  @JsonProperty(JSON_PROPERTY_CRITERION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCriterionIds() {
    return criterionIds;
  }


  @JsonProperty(JSON_PROPERTY_CRITERION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：ラベルID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Label ID&lt;/div&gt; 
   * @return labelIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ラベルID</div> <div lang=\"en\">Search condition: Label ID</div> ")
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


  public AdGroupCriterionServiceSelector numberResults(Integer numberResults) {
    
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


  public AdGroupCriterionServiceSelector startIndex(Integer startIndex) {
    
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


  public AdGroupCriterionServiceSelector use(AdGroupCriterionServiceUse use) {
    
    this.use = use;
    return this;
  }

   /**
   * Get use
   * @return use
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AdGroupCriterionServiceUse getUse() {
    return use;
  }


  @JsonProperty(JSON_PROPERTY_USE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupCriterionServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupCriterionServiceKeyword getKeyword() {
    return keyword;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyword(AdGroupCriterionServiceKeyword keyword) {
    this.keyword = keyword;
  }


  public AdGroupCriterionServiceSelector biddingKeywordCpcRange(AdGroupCriterionServiceBiddingKeywordCpcRange biddingKeywordCpcRange) {
    
    this.biddingKeywordCpcRange = biddingKeywordCpcRange;
    return this;
  }

   /**
   * Get biddingKeywordCpcRange
   * @return biddingKeywordCpcRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIDDING_KEYWORD_CPC_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupCriterionServiceBiddingKeywordCpcRange getBiddingKeywordCpcRange() {
    return biddingKeywordCpcRange;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_KEYWORD_CPC_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingKeywordCpcRange(AdGroupCriterionServiceBiddingKeywordCpcRange biddingKeywordCpcRange) {
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
        Objects.equals(this.keyword, adGroupCriterionServiceSelector.keyword) &&
        Objects.equals(this.biddingKeywordCpcRange, adGroupCriterionServiceSelector.biddingKeywordCpcRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupIds, approvalStatuses, biddingStrategyIds, campaignIds, containsLabelId, criterionIds, labelIds, numberResults, startIndex, use, userStatuses, keyword, biddingKeywordCpcRange);
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

