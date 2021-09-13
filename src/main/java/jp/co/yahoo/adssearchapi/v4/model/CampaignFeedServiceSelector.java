package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.CampaignFeedServicePlaceholderType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignFeedServiceSelectorオブジェクトは、FeedItem情報を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignFeedServiceSelector describes the FeedItem information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignFeedServiceSelectorオブジェクトは、FeedItem情報を指定します。</div> <div lang=\"en\">CampaignFeedServiceSelector describes the FeedItem information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignFeedServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("feedItemIds")
  @Valid
  private List<Long> feedItemIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("placeholderTypes")
  @Valid
  private List<CampaignFeedServicePlaceholderType> placeholderTypes = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public CampaignFeedServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

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
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")

@Size(max=500) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

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
   * <div lang=\"ja\">FeedItem情報のIDです。</div> <div lang=\"en\">FeedItem information ID.</div> 
   * @return feedItemIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">FeedItem情報のIDです。</div> <div lang=\"en\">FeedItem information ID.</div> ")

@Size(max=500) 
  public List<Long> getFeedItemIds() {
    return feedItemIds;
  }

  public void setFeedItemIds(List<Long> feedItemIds) {
    this.feedItemIds = feedItemIds;
  }

  public CampaignFeedServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public Integer getNumberResults() {
    return numberResults;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=4) 
  public List<CampaignFeedServicePlaceholderType> getPlaceholderTypes() {
    return placeholderTypes;
  }

  public void setPlaceholderTypes(List<CampaignFeedServicePlaceholderType> placeholderTypes) {
    this.placeholderTypes = placeholderTypes;
  }

  public CampaignFeedServiceSelector startIndex(Integer startIndex) {
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

