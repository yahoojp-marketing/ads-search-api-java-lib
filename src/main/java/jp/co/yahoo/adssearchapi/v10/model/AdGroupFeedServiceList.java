/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

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
import jp.co.yahoo.adssearchapi.v10.model.AdGroupFeed;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupFeedServicePlaceholderType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupFeedServiceListオブジェクトは、広告グループに関連付けられたFeedItem情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupFeedServiceList object describes the FeedItem information connected to ad group.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupFeedServiceListオブジェクトは、広告グループに関連付けられたFeedItem情報を表します。</div> <div lang=\"en\">AdGroupFeedServiceList object describes the FeedItem information connected to ad group.</div> ")
@JsonPropertyOrder({
  AdGroupFeedServiceList.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupFeedServiceList.JSON_PROPERTY_AD_GROUP_FEED,
  AdGroupFeedServiceList.JSON_PROPERTY_AD_GROUP_ID,
  AdGroupFeedServiceList.JSON_PROPERTY_CAMPAIGN_ID,
  AdGroupFeedServiceList.JSON_PROPERTY_PLACEHOLDER_TYPE
})
@JsonTypeName("AdGroupFeedServiceList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupFeedServiceList {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_FEED = "adGroupFeed";
  private List<AdGroupFeed> adGroupFeed = null;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_PLACEHOLDER_TYPE = "placeholderType";
  private AdGroupFeedServicePlaceholderType placeholderType;

  public AdGroupFeedServiceList() { 
  }

  public AdGroupFeedServiceList accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; SET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required in SET operation.</div> ")
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


  public AdGroupFeedServiceList adGroupFeed(List<AdGroupFeed> adGroupFeed) {
    
    this.adGroupFeed = adGroupFeed;
    return this;
  }

  public AdGroupFeedServiceList addAdGroupFeedItem(AdGroupFeed adGroupFeedItem) {
    if (this.adGroupFeed == null) {
      this.adGroupFeed = new ArrayList<>();
    }
    this.adGroupFeed.add(adGroupFeedItem);
    return this;
  }

   /**
   * Get adGroupFeed
   * @return adGroupFeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_FEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupFeed> getAdGroupFeed() {
    return adGroupFeed;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_FEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupFeed(List<AdGroupFeed> adGroupFeed) {
    this.adGroupFeed = adGroupFeed;
  }


  public AdGroupFeedServiceList adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループIDです。&lt;br&gt; SET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad Group ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Ad Group ID.<br> This field is required in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupId() {
    return adGroupId;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }


  public AdGroupFeedServiceList campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; SET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET operation.</div> ")
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


  public AdGroupFeedServiceList placeholderType(AdGroupFeedServicePlaceholderType placeholderType) {
    
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

  public AdGroupFeedServicePlaceholderType getPlaceholderType() {
    return placeholderType;
  }


  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaceholderType(AdGroupFeedServicePlaceholderType placeholderType) {
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
    AdGroupFeedServiceList adGroupFeedServiceList = (AdGroupFeedServiceList) o;
    return Objects.equals(this.accountId, adGroupFeedServiceList.accountId) &&
        Objects.equals(this.adGroupFeed, adGroupFeedServiceList.adGroupFeed) &&
        Objects.equals(this.adGroupId, adGroupFeedServiceList.adGroupId) &&
        Objects.equals(this.campaignId, adGroupFeedServiceList.campaignId) &&
        Objects.equals(this.placeholderType, adGroupFeedServiceList.placeholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupFeed, adGroupId, campaignId, placeholderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupFeedServiceList {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupFeed: ").append(toIndentedString(adGroupFeed)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
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
