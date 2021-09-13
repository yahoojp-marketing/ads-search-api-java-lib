package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.CampaignFeed;
import jp.co.yahoo.adssearchapi.v4.model.CampaignFeedServicePlaceholderType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignFeedServiceListオブジェクトは、キャンペーンに関連付けられたFeedItem情報を表します。&lt;br&gt; 更新時にcampaignFeedを指定するとすべて上書きされ、未指定のcampaignFeedの属性情報は削除されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignFeedServiceList object describes FeedItem information connected to campaign.&lt;br&gt; Upon updating, if campaignFeed is specified, the attribute information will be overwritten, but if campaignFeed is not specified, it will be deleted. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignFeedServiceListオブジェクトは、キャンペーンに関連付けられたFeedItem情報を表します。<br> 更新時にcampaignFeedを指定するとすべて上書きされ、未指定のcampaignFeedの属性情報は削除されます。 </div> <div lang=\"en\">CampaignFeedServiceList object describes FeedItem information connected to campaign.<br> Upon updating, if campaignFeed is specified, the attribute information will be overwritten, but if campaignFeed is not specified, it will be deleted. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignFeedServiceList   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("campaignFeed")
  @Valid
  private List<CampaignFeed> campaignFeed = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("placeholderType")
  private CampaignFeedServicePlaceholderType placeholderType = null;

  public CampaignFeedServiceList accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> SET時、このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br>This field is required in SET operation.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> SET時、このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br>This field is required in SET operation.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignFeedServiceList campaignFeed(List<CampaignFeed> campaignFeed) {
    this.campaignFeed = campaignFeed;
    return this;
  }

  public CampaignFeedServiceList addCampaignFeedItem(CampaignFeed campaignFeedItem) {
    if (this.campaignFeed == null) {
      this.campaignFeed = new ArrayList<>();
    }
    this.campaignFeed.add(campaignFeedItem);
    return this;
  }

  /**
   * Get campaignFeed
   * @return campaignFeed
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CampaignFeed> getCampaignFeed() {
    return campaignFeed;
  }

  public void setCampaignFeed(List<CampaignFeed> campaignFeed) {
    this.campaignFeed = campaignFeed;
  }

  public CampaignFeedServiceList campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> SET時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> SET時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET operation.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignFeedServiceList placeholderType(CampaignFeedServicePlaceholderType placeholderType) {
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
    CampaignFeedServiceList campaignFeedServiceList = (CampaignFeedServiceList) o;
    return Objects.equals(this.accountId, campaignFeedServiceList.accountId) &&
        Objects.equals(this.campaignFeed, campaignFeedServiceList.campaignFeed) &&
        Objects.equals(this.campaignId, campaignFeedServiceList.campaignId) &&
        Objects.equals(this.placeholderType, campaignFeedServiceList.placeholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignFeed, campaignId, placeholderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignFeedServiceList {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignFeed: ").append(toIndentedString(campaignFeed)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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

