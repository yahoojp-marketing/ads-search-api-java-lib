package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignFeedServicePlaceholderType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignFeedServiceSelectorオブジェクトは、FeedItem情報を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignFeedServiceSelector describes the FeedItem information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignFeedServiceSelectorオブジェクトは、FeedItem情報を指定します。</div> <div lang=\"en\">CampaignFeedServiceSelector describes the FeedItem information.</div> ")

public class CampaignFeedServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignIds")
  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.undefined();

  @JsonProperty("feedItemIds")
  @Valid
  private JsonNullable<List<Long>> feedItemIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("placeholderTypes")
  @Valid
  private JsonNullable<List<CampaignFeedServicePlaceholderType>> placeholderTypes = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

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
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public CampaignFeedServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public CampaignFeedServiceSelector feedItemIds(List<Long> feedItemIds) {
    this.feedItemIds = JsonNullable.of(feedItemIds);
    return this;
  }

  public CampaignFeedServiceSelector addFeedItemIdsItem(Long feedItemIdsItem) {
    if (this.feedItemIds == null || !this.feedItemIds.isPresent()) {
      this.feedItemIds = JsonNullable.of(new ArrayList<>());
    }
    this.feedItemIds.get().add(feedItemIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">FeedItem情報のIDです。</div> <div lang=\"en\">FeedItem information ID.</div> 
   * @return feedItemIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">FeedItem情報のIDです。</div> <div lang=\"en\">FeedItem information ID.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getFeedItemIds() {
    return feedItemIds;
  }

  public void setFeedItemIds(JsonNullable<List<Long>> feedItemIds) {
    this.feedItemIds = feedItemIds;
  }

  public CampaignFeedServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
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
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public CampaignFeedServiceSelector placeholderTypes(List<CampaignFeedServicePlaceholderType> placeholderTypes) {
    this.placeholderTypes = JsonNullable.of(placeholderTypes);
    return this;
  }

  public CampaignFeedServiceSelector addPlaceholderTypesItem(CampaignFeedServicePlaceholderType placeholderTypesItem) {
    if (this.placeholderTypes == null || !this.placeholderTypes.isPresent()) {
      this.placeholderTypes = JsonNullable.of(new ArrayList<>());
    }
    this.placeholderTypes.get().add(placeholderTypesItem);
    return this;
  }

  /**
   * Get placeholderTypes
   * @return placeholderTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=4) 
  public JsonNullable<List<CampaignFeedServicePlaceholderType>> getPlaceholderTypes() {
    return placeholderTypes;
  }

  public void setPlaceholderTypes(JsonNullable<List<CampaignFeedServicePlaceholderType>> placeholderTypes) {
    this.placeholderTypes = placeholderTypes;
  }

  public CampaignFeedServiceSelector startIndex(Integer startIndex) {
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


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

