/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

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
import jp.co.yahoo.adssearchapi.v14.model.AdGroupServiceBiddingKeywordCpcRange;
import jp.co.yahoo.adssearchapi.v14.model.AdGroupServiceCreatedDateRange;
import jp.co.yahoo.adssearchapi.v14.model.AdGroupServiceUpdatedDateRange;
import jp.co.yahoo.adssearchapi.v14.model.AdGroupServiceUserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceSelectorオブジェクトは、指定された広告グループを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceSelector object displays the specified ad group.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceSelectorオブジェクトは、指定された広告グループを表します。</div> <div lang=\"en\">AdGroupServiceSelector object displays the specified ad group.</div> ")
@JsonPropertyOrder({
  AdGroupServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupServiceSelector.JSON_PROPERTY_AD_GROUP_IDS,
  AdGroupServiceSelector.JSON_PROPERTY_PORTFOLIO_BIDDING_IDS,
  AdGroupServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  AdGroupServiceSelector.JSON_PROPERTY_CONTAINS_LABEL,
  AdGroupServiceSelector.JSON_PROPERTY_LABEL_IDS,
  AdGroupServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AdGroupServiceSelector.JSON_PROPERTY_START_INDEX,
  AdGroupServiceSelector.JSON_PROPERTY_USER_STATUSES,
  AdGroupServiceSelector.JSON_PROPERTY_CREATED_DATE_RANGE,
  AdGroupServiceSelector.JSON_PROPERTY_UPDATED_DATE_RANGE,
  AdGroupServiceSelector.JSON_PROPERTY_BIDDING_KEYWORD_CPC_RANGE
})
@JsonTypeName("AdGroupServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_IDS = "adGroupIds";
  private List<Long> adGroupIds = null;

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
  private List<AdGroupServiceUserStatus> userStatuses = null;

  public static final String JSON_PROPERTY_CREATED_DATE_RANGE = "createdDateRange";
  private AdGroupServiceCreatedDateRange createdDateRange;

  public static final String JSON_PROPERTY_UPDATED_DATE_RANGE = "updatedDateRange";
  private AdGroupServiceUpdatedDateRange updatedDateRange;

  public static final String JSON_PROPERTY_BIDDING_KEYWORD_CPC_RANGE = "biddingKeywordCpcRange";
  private AdGroupServiceBiddingKeywordCpcRange biddingKeywordCpcRange;

  public AdGroupServiceSelector() { 
  }

  public AdGroupServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントID</div> <div lang=\"en\">Search condition: Account ID</div> ")
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：広告グループID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Ad group ID&lt;/div&gt; 
   * @return adGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad group ID</div> ")
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


  public AdGroupServiceSelector portfolioBiddingIds(List<Long> portfolioBiddingIds) {
    
    this.portfolioBiddingIds = portfolioBiddingIds;
    return this;
  }

  public AdGroupServiceSelector addPortfolioBiddingIdsItem(Long portfolioBiddingIdsItem) {
    if (this.portfolioBiddingIds == null) {
      this.portfolioBiddingIds = new ArrayList<>();
    }
    this.portfolioBiddingIds.add(portfolioBiddingIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：ポートフォリオ入札ID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Portfolio bidding ID&lt;/div&gt; 
   * @return portfolioBiddingIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ポートフォリオ入札ID</div> <div lang=\"en\">Search condition: Portfolio bidding ID</div> ")
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：キャンペーンID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Campaign ID&lt;/div&gt; 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID</div> ")
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


  public AdGroupServiceSelector containsLabel(Boolean containsLabel) {
    
    this.containsLabel = containsLabel;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベル情報取得フラグです。&lt;br&gt; このフィールドは省略可能となります。その際、デフォルト値はfalseとなります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Flag of contains label information.&lt;br&gt; This field is optional. The default value will be false. &lt;/div&gt; 
   * @return containsLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ラベル情報取得フラグです。<br> このフィールドは省略可能となります。その際、デフォルト値はfalseとなります。 </div> <div lang=\"en\">Flag of contains label information.<br> This field is optional. The default value will be false. </div> ")
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


  public AdGroupServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 10000
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.</div> ")
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


  public AdGroupServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The position within the result set where retrieval begins. This field must be greater than or equal to 1.</div> ")
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceCreatedDateRange getCreatedDateRange() {
    return createdDateRange;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDateRange(AdGroupServiceCreatedDateRange createdDateRange) {
    this.createdDateRange = createdDateRange;
  }


  public AdGroupServiceSelector updatedDateRange(AdGroupServiceUpdatedDateRange updatedDateRange) {
    
    this.updatedDateRange = updatedDateRange;
    return this;
  }

   /**
   * Get updatedDateRange
   * @return updatedDateRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupServiceUpdatedDateRange getUpdatedDateRange() {
    return updatedDateRange;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedDateRange(AdGroupServiceUpdatedDateRange updatedDateRange) {
    this.updatedDateRange = updatedDateRange;
  }


  public AdGroupServiceSelector biddingKeywordCpcRange(AdGroupServiceBiddingKeywordCpcRange biddingKeywordCpcRange) {
    
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

  public AdGroupServiceBiddingKeywordCpcRange getBiddingKeywordCpcRange() {
    return biddingKeywordCpcRange;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_KEYWORD_CPC_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        Objects.equals(this.portfolioBiddingIds, adGroupServiceSelector.portfolioBiddingIds) &&
        Objects.equals(this.campaignIds, adGroupServiceSelector.campaignIds) &&
        Objects.equals(this.containsLabel, adGroupServiceSelector.containsLabel) &&
        Objects.equals(this.labelIds, adGroupServiceSelector.labelIds) &&
        Objects.equals(this.numberResults, adGroupServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, adGroupServiceSelector.startIndex) &&
        Objects.equals(this.userStatuses, adGroupServiceSelector.userStatuses) &&
        Objects.equals(this.createdDateRange, adGroupServiceSelector.createdDateRange) &&
        Objects.equals(this.updatedDateRange, adGroupServiceSelector.updatedDateRange) &&
        Objects.equals(this.biddingKeywordCpcRange, adGroupServiceSelector.biddingKeywordCpcRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupIds, portfolioBiddingIds, campaignIds, containsLabel, labelIds, numberResults, startIndex, userStatuses, createdDateRange, updatedDateRange, biddingKeywordCpcRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    portfolioBiddingIds: ").append(toIndentedString(portfolioBiddingIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    containsLabel: ").append(toIndentedString(containsLabel)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    userStatuses: ").append(toIndentedString(userStatuses)).append("\n");
    sb.append("    createdDateRange: ").append(toIndentedString(createdDateRange)).append("\n");
    sb.append("    updatedDateRange: ").append(toIndentedString(updatedDateRange)).append("\n");
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

