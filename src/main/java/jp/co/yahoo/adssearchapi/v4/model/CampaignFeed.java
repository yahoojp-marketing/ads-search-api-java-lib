package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.CampaignFeedServicePlaceholderType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignFeedオブジェクトは、キャンペーンに紐づけられたFeedItem情報を表します。&lt;br&gt; SET時、このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignFeed describes FeedItem information connected to campaign.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignFeedオブジェクトは、キャンペーンに紐づけられたFeedItem情報を表します。<br> SET時、このフィールドは必須です。</div> <div lang=\"en\">CampaignFeed describes FeedItem information connected to campaign.<br> This field is required in SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignFeed   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("feedItemId")
  private Long feedItemId = null;

  @JsonProperty("placeholderType")
  private CampaignFeedServicePlaceholderType placeholderType = null;

  public CampaignFeed accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignFeed campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignFeed feedItemId(Long feedItemId) {
    this.feedItemId = feedItemId;
    return this;
  }

  /**
   * <div lang=\"ja\">FeedItem情報のIDです。<br> SET時、このフィールドは必須です。</div> <div lang=\"en\">FeedItem information ID.<br> This field is required in SET operation.</div> 
   * @return feedItemId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">FeedItem情報のIDです。<br> SET時、このフィールドは必須です。</div> <div lang=\"en\">FeedItem information ID.<br> This field is required in SET operation.</div> ")


  public Long getFeedItemId() {
    return feedItemId;
  }

  public void setFeedItemId(Long feedItemId) {
    this.feedItemId = feedItemId;
  }

  public CampaignFeed placeholderType(CampaignFeedServicePlaceholderType placeholderType) {
    this.placeholderType = placeholderType;
    return this;
  }

  /**
   * Get placeholderType
   * @return placeholderType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignFeedServicePlaceholderType getPlaceholderType() {
    return placeholderType;
  }

  public void setPlaceholderType(CampaignFeedServicePlaceholderType placeholderType) {
    this.placeholderType = placeholderType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignFeed campaignFeed = (CampaignFeed) o;
    return Objects.equals(this.accountId, campaignFeed.accountId) &&
        Objects.equals(this.campaignId, campaignFeed.campaignId) &&
        Objects.equals(this.feedItemId, campaignFeed.feedItemId) &&
        Objects.equals(this.placeholderType, campaignFeed.placeholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, feedItemId, placeholderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignFeed {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

