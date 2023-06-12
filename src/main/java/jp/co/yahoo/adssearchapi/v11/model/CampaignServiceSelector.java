/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

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
import jp.co.yahoo.adssearchapi.v11.model.CampaignServiceBudgetAmountRange;
import jp.co.yahoo.adssearchapi.v11.model.CampaignServiceCreatedDateRange;
import jp.co.yahoo.adssearchapi.v11.model.CampaignServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceSelectorオブジェクトは、操作の対象とするキャンペーンの情報およびフィルタ条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceSelector object displays information and filter criteria of campaign to be operated.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceSelectorオブジェクトは、操作の対象とするキャンペーンの情報およびフィルタ条件を表します。</div> <div lang=\"en\">CampaignServiceSelector object displays information and filter criteria of campaign to be operated.</div> ")
@JsonPropertyOrder({
  CampaignServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  CampaignServiceSelector.JSON_PROPERTY_PORTFOLIO_BIDDING_IDS,
  CampaignServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  CampaignServiceSelector.JSON_PROPERTY_CONTAINS_LABEL,
  CampaignServiceSelector.JSON_PROPERTY_LABEL_IDS,
  CampaignServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  CampaignServiceSelector.JSON_PROPERTY_START_INDEX,
  CampaignServiceSelector.JSON_PROPERTY_USER_STATUSES,
  CampaignServiceSelector.JSON_PROPERTY_CREATED_DATE_RANGE,
  CampaignServiceSelector.JSON_PROPERTY_BUDGET_AMOUNT_RANGE
})
@JsonTypeName("CampaignServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_PORTFOLIO_BIDDING_IDS = "portfolioBiddingIds";
  private List<Long> portfolioBiddingIds = null;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_CONTAINS_LABEL = "containsLabel";
  private Boolean containsLabel;

  public static final String JSON_PROPERTY_LABEL_IDS = "labelIds";
  private List<Long> labelIds = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_USER_STATUSES = "userStatuses";
  private List<CampaignServiceUserStatus> userStatuses = null;

  public static final String JSON_PROPERTY_CREATED_DATE_RANGE = "createdDateRange";
  private CampaignServiceCreatedDateRange createdDateRange;

  public static final String JSON_PROPERTY_BUDGET_AMOUNT_RANGE = "budgetAmountRange";
  private CampaignServiceBudgetAmountRange budgetAmountRange;

  public CampaignServiceSelector() { 
  }

  public CampaignServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
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


  public CampaignServiceSelector portfolioBiddingIds(List<Long> portfolioBiddingIds) {
    
    this.portfolioBiddingIds = portfolioBiddingIds;
    return this;
  }

  public CampaignServiceSelector addPortfolioBiddingIdsItem(Long portfolioBiddingIdsItem) {
    if (this.portfolioBiddingIds == null) {
      this.portfolioBiddingIds = new ArrayList<>();
    }
    this.portfolioBiddingIds.add(portfolioBiddingIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：ポートフォリオ入札IDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Portfolio bidding ID.&lt;/div&gt; 
   * @return portfolioBiddingIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ポートフォリオ入札IDです。</div> <div lang=\"en\">Search condition: Portfolio bidding ID.</div> ")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO_BIDDING_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getPortfolioBiddingIds() {
    return portfolioBiddingIds;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO_BIDDING_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortfolioBiddingIds(List<Long> portfolioBiddingIds) {
    this.portfolioBiddingIds = portfolioBiddingIds;
  }


  public CampaignServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：キャンペーンIDです。&lt;br&gt; ※指定しない場合は、フィルタ条件に すべてのキャンペーンが含まれます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Campaign ID&lt;br&gt; * All campaign will return, if no campaign are not specified.&lt;/div&gt; 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンIDです。<br> ※指定しない場合は、フィルタ条件に すべてのキャンペーンが含まれます。</div> <div lang=\"en\">Search condition: Campaign ID<br> * All campaign will return, if no campaign are not specified.</div> ")
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


  public CampaignServiceSelector containsLabel(Boolean containsLabel) {
    
    this.containsLabel = containsLabel;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベルID取得フラグです。&lt;br&gt; このフィールドは省略可能となります。その際、デフォルト値はfalseとなります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Flag of contains label ID.&lt;br&gt; This field is optional. The default value will be false. &lt;/div&gt; 
   * @return containsLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルID取得フラグです。<br> このフィールドは省略可能となります。その際、デフォルト値はfalseとなります。 </div> <div lang=\"en\">Flag of contains label ID.<br> This field is optional. The default value will be false. </div> ")
  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsLabel() {
    return containsLabel;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsLabel(Boolean containsLabel) {
    this.containsLabel = containsLabel;
  }


  public CampaignServiceSelector labelIds(List<Long> labelIds) {
    
    this.labelIds = labelIds;
    return this;
  }

  public CampaignServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null) {
      this.labelIds = new ArrayList<>();
    }
    this.labelIds.add(labelIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：ラベルIDです。&lt;br&gt; ※labelIdsを指定した場合は、取得結果にcontainsLabelの情報が付与されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Label ID.&lt;br&gt; *When specified labelIds, containsLabel information is added to the result.&lt;/div&gt; 
   * @return labelIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ラベルIDです。<br> ※labelIdsを指定した場合は、取得結果にcontainsLabelの情報が付与されます。</div> <div lang=\"en\">Search condition: Label ID.<br> *When specified labelIds, containsLabel information is added to the result.</div> ")
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


  public CampaignServiceSelector numberResults(Integer numberResults) {
    
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


  public CampaignServiceSelector startIndex(Integer startIndex) {
    
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


  public CampaignServiceSelector userStatuses(List<CampaignServiceUserStatus> userStatuses) {
    
    this.userStatuses = userStatuses;
    return this;
  }

  public CampaignServiceSelector addUserStatusesItem(CampaignServiceUserStatus userStatusesItem) {
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

  public List<CampaignServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatuses(List<CampaignServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
  }


  public CampaignServiceSelector createdDateRange(CampaignServiceCreatedDateRange createdDateRange) {
    
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

  public CampaignServiceCreatedDateRange getCreatedDateRange() {
    return createdDateRange;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDateRange(CampaignServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = createdDateRange;
  }


  public CampaignServiceSelector budgetAmountRange(CampaignServiceBudgetAmountRange budgetAmountRange) {
    
    this.budgetAmountRange = budgetAmountRange;
    return this;
  }

   /**
   * Get budgetAmountRange
   * @return budgetAmountRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUDGET_AMOUNT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceBudgetAmountRange getBudgetAmountRange() {
    return budgetAmountRange;
  }


  @JsonProperty(JSON_PROPERTY_BUDGET_AMOUNT_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBudgetAmountRange(CampaignServiceBudgetAmountRange budgetAmountRange) {
    this.budgetAmountRange = budgetAmountRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceSelector campaignServiceSelector = (CampaignServiceSelector) o;
    return Objects.equals(this.accountId, campaignServiceSelector.accountId) &&
        Objects.equals(this.portfolioBiddingIds, campaignServiceSelector.portfolioBiddingIds) &&
        Objects.equals(this.campaignIds, campaignServiceSelector.campaignIds) &&
        Objects.equals(this.containsLabel, campaignServiceSelector.containsLabel) &&
        Objects.equals(this.labelIds, campaignServiceSelector.labelIds) &&
        Objects.equals(this.numberResults, campaignServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, campaignServiceSelector.startIndex) &&
        Objects.equals(this.userStatuses, campaignServiceSelector.userStatuses) &&
        Objects.equals(this.createdDateRange, campaignServiceSelector.createdDateRange) &&
        Objects.equals(this.budgetAmountRange, campaignServiceSelector.budgetAmountRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, portfolioBiddingIds, campaignIds, containsLabel, labelIds, numberResults, startIndex, userStatuses, createdDateRange, budgetAmountRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    portfolioBiddingIds: ").append(toIndentedString(portfolioBiddingIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    containsLabel: ").append(toIndentedString(containsLabel)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

