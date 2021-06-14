package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupFeedServicePlaceholderType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupFeedオブジェクトは、広告グループに紐づけられたFeedItem情報を表します。&lt;br&gt; SET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupFeed describes the FeedItem information connected to ad group.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupFeedオブジェクトは、広告グループに紐づけられたFeedItem情報を表します。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupFeed describes the FeedItem information connected to ad group.<br> This field is required in SET operation.</div> ")

public class AdGroupFeed   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("feedItemId")
  private JsonNullable<Long> feedItemId = JsonNullable.undefined();

  @JsonProperty("placeholderType")
  private JsonNullable<AdGroupFeedServicePlaceholderType> placeholderType = JsonNullable.undefined();

  public AdGroupFeed accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public AdGroupFeed adGroupId(Long adGroupId) {
    this.adGroupId = JsonNullable.of(adGroupId);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。</div> <div lang=\"en\">Ad group ID.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。</div> <div lang=\"en\">Ad group ID.</div> ")


  public JsonNullable<Long> getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(JsonNullable<Long> adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupFeed campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupFeed feedItemId(Long feedItemId) {
    this.feedItemId = JsonNullable.of(feedItemId);
    return this;
  }

  /**
   * <div lang=\"ja\">FeedItem情報のIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">FeedItem information ID.<br> This field is required in SET operation.</div> 
   * @return feedItemId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">FeedItem情報のIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">FeedItem information ID.<br> This field is required in SET operation.</div> ")


  public JsonNullable<Long> getFeedItemId() {
    return feedItemId;
  }

  public void setFeedItemId(JsonNullable<Long> feedItemId) {
    this.feedItemId = feedItemId;
  }

  public AdGroupFeed placeholderType(AdGroupFeedServicePlaceholderType placeholderType) {
    this.placeholderType = JsonNullable.of(placeholderType);
    return this;
  }

  /**
   * Get placeholderType
   * @return placeholderType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupFeedServicePlaceholderType> getPlaceholderType() {
    return placeholderType;
  }

  public void setPlaceholderType(JsonNullable<AdGroupFeedServicePlaceholderType> placeholderType) {
    this.placeholderType = placeholderType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupFeed adGroupFeed = (AdGroupFeed) o;
    return Objects.equals(this.accountId, adGroupFeed.accountId) &&
        Objects.equals(this.adGroupId, adGroupFeed.adGroupId) &&
        Objects.equals(this.campaignId, adGroupFeed.campaignId) &&
        Objects.equals(this.feedItemId, adGroupFeed.feedItemId) &&
        Objects.equals(this.placeholderType, adGroupFeed.placeholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, campaignId, feedItemId, placeholderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupFeed {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    feedItemId: ").append(toIndentedString(feedItemId)).append("\n");
    sb.append("    placeholderType: ").append(toIndentedString(placeholderType)).append("\n");
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

