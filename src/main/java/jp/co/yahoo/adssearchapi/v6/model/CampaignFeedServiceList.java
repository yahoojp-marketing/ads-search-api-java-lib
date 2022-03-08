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
import jp.co.yahoo.adssearchapi.v6.model.CampaignFeed;
import jp.co.yahoo.adssearchapi.v6.model.CampaignFeedServicePlaceholderType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignFeedServiceListオブジェクトは、キャンペーンに関連付けられたFeedItem情報を表します。&lt;br&gt; 更新時にcampaignFeedを指定するとすべて上書きされ、未指定のcampaignFeedの属性情報は削除されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignFeedServiceList object describes FeedItem information connected to campaign.&lt;br&gt; Upon updating, if campaignFeed is specified, the attribute information will be overwritten, but if campaignFeed is not specified, it will be deleted. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignFeedServiceListオブジェクトは、キャンペーンに関連付けられたFeedItem情報を表します。<br> 更新時にcampaignFeedを指定するとすべて上書きされ、未指定のcampaignFeedの属性情報は削除されます。 </div> <div lang=\"en\">CampaignFeedServiceList object describes FeedItem information connected to campaign.<br> Upon updating, if campaignFeed is specified, the attribute information will be overwritten, but if campaignFeed is not specified, it will be deleted. </div> ")
@JsonPropertyOrder({
  CampaignFeedServiceList.JSON_PROPERTY_ACCOUNT_ID,
  CampaignFeedServiceList.JSON_PROPERTY_CAMPAIGN_FEED,
  CampaignFeedServiceList.JSON_PROPERTY_CAMPAIGN_ID,
  CampaignFeedServiceList.JSON_PROPERTY_PLACEHOLDER_TYPE
})
@JsonTypeName("CampaignFeedServiceList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignFeedServiceList {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_FEED = "campaignFeed";
  private List<CampaignFeed> campaignFeed = null;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_PLACEHOLDER_TYPE = "placeholderType";
  private CampaignFeedServicePlaceholderType placeholderType;

  public CampaignFeedServiceList() { 
  }

  public CampaignFeedServiceList accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; SET時、このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt;This field is required in SET operation.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> SET時、このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br>This field is required in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_FEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignFeed> getCampaignFeed() {
    return campaignFeed;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_FEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignFeed(List<CampaignFeed> campaignFeed) {
    this.campaignFeed = campaignFeed;
  }


  public CampaignFeedServiceList campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; SET時、このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> SET時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignFeedServicePlaceholderType getPlaceholderType() {
    return placeholderType;
  }


  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

