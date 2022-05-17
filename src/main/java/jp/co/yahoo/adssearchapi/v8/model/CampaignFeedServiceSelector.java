/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

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
import jp.co.yahoo.adssearchapi.v8.model.CampaignFeedServicePlaceholderType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignFeedServiceSelectorオブジェクトは、FeedItem情報を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignFeedServiceSelector describes the FeedItem information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignFeedServiceSelectorオブジェクトは、FeedItem情報を指定します。</div> <div lang=\"en\">CampaignFeedServiceSelector describes the FeedItem information.</div> ")
@JsonPropertyOrder({
  CampaignFeedServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  CampaignFeedServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  CampaignFeedServiceSelector.JSON_PROPERTY_FEED_ITEM_IDS,
  CampaignFeedServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  CampaignFeedServiceSelector.JSON_PROPERTY_PLACEHOLDER_TYPES,
  CampaignFeedServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("CampaignFeedServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignFeedServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_FEED_ITEM_IDS = "feedItemIds";
  private List<Long> feedItemIds = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_PLACEHOLDER_TYPES = "placeholderTypes";
  private List<CampaignFeedServicePlaceholderType> placeholderTypes = null;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public CampaignFeedServiceSelector() { 
  }

  public CampaignFeedServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
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


  public CampaignFeedServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignFeedServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;/div&gt; 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")
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


  public CampaignFeedServiceSelector feedItemIds(List<Long> feedItemIds) {
    
    this.feedItemIds = feedItemIds;
    return this;
  }

  public CampaignFeedServiceSelector addFeedItemIdsItem(Long feedItemIdsItem) {
    if (this.feedItemIds == null) {
      this.feedItemIds = new ArrayList<>();
    }
    this.feedItemIds.add(feedItemIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItem情報のIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItem information ID.&lt;/div&gt; 
   * @return feedItemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">FeedItem情報のIDです。</div> <div lang=\"en\">FeedItem information ID.</div> ")
  @JsonProperty(JSON_PROPERTY_FEED_ITEM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getFeedItemIds() {
    return feedItemIds;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ITEM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedItemIds(List<Long> feedItemIds) {
    this.feedItemIds = feedItemIds;
  }


  public CampaignFeedServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
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


  public CampaignFeedServiceSelector placeholderTypes(List<CampaignFeedServicePlaceholderType> placeholderTypes) {
    
    this.placeholderTypes = placeholderTypes;
    return this;
  }

  public CampaignFeedServiceSelector addPlaceholderTypesItem(CampaignFeedServicePlaceholderType placeholderTypesItem) {
    if (this.placeholderTypes == null) {
      this.placeholderTypes = new ArrayList<>();
    }
    this.placeholderTypes.add(placeholderTypesItem);
    return this;
  }

   /**
   * Get placeholderTypes
   * @return placeholderTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignFeedServicePlaceholderType> getPlaceholderTypes() {
    return placeholderTypes;
  }


  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaceholderTypes(List<CampaignFeedServicePlaceholderType> placeholderTypes) {
    this.placeholderTypes = placeholderTypes;
  }


  public CampaignFeedServiceSelector startIndex(Integer startIndex) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignFeedServiceSelector campaignFeedServiceSelector = (CampaignFeedServiceSelector) o;
    return Objects.equals(this.accountId, campaignFeedServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, campaignFeedServiceSelector.campaignIds) &&
        Objects.equals(this.feedItemIds, campaignFeedServiceSelector.feedItemIds) &&
        Objects.equals(this.numberResults, campaignFeedServiceSelector.numberResults) &&
        Objects.equals(this.placeholderTypes, campaignFeedServiceSelector.placeholderTypes) &&
        Objects.equals(this.startIndex, campaignFeedServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, feedItemIds, numberResults, placeholderTypes, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignFeedServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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

