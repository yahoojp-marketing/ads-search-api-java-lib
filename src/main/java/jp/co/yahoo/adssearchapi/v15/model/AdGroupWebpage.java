/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v15.model.AdGroupWebpageServiceBid;
import jp.co.yahoo.adssearchapi.v15.model.AdGroupWebpageServiceExcludedType;
import jp.co.yahoo.adssearchapi.v15.model.AdGroupWebpageServiceUserStatus;
import jp.co.yahoo.adssearchapi.v15.model.AdGroupWebpageServiceWebpage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageオブジェクトは、広告グループに関連付けた配信/除外設定の情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpage object contains information of allowed or excluded settings setup to adgroup.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupWebpage.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupWebpage.JSON_PROPERTY_AD_GROUP_ID,
  AdGroupWebpage.JSON_PROPERTY_AD_GROUP_TRACK_ID,
  AdGroupWebpage.JSON_PROPERTY_BID,
  AdGroupWebpage.JSON_PROPERTY_CAMPAIGN_ID,
  AdGroupWebpage.JSON_PROPERTY_CAMPAIGN_TRACK_ID,
  AdGroupWebpage.JSON_PROPERTY_EXCLUDED_TYPE,
  AdGroupWebpage.JSON_PROPERTY_USER_STATUS,
  AdGroupWebpage.JSON_PROPERTY_WEBPAGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupWebpage {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_AD_GROUP_TRACK_ID = "adGroupTrackId";
  private Long adGroupTrackId;

  public static final String JSON_PROPERTY_BID = "bid";
  private AdGroupWebpageServiceBid bid;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_TRACK_ID = "campaignTrackId";
  private Long campaignTrackId;

  public static final String JSON_PROPERTY_EXCLUDED_TYPE = "excludedType";
  private AdGroupWebpageServiceExcludedType excludedType;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  private AdGroupWebpageServiceUserStatus userStatus;

  public static final String JSON_PROPERTY_WEBPAGE = "webpage";
  private AdGroupWebpageServiceWebpage webpage;

  public AdGroupWebpage() {
  }

  public AdGroupWebpage accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt;Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupWebpage adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループIDです。&lt;br&gt;このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID.&lt;br&gt;This field is required in any cases.&lt;/div&gt; 
   * @return adGroupId
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupWebpage adGroupTrackId(Long adGroupTrackId) {
    
    this.adGroupTrackId = adGroupTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループトラッキングIDです。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group tracking ID.&lt;br&gt;Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return adGroupTrackId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_GROUP_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupTrackId() {
    return adGroupTrackId;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupTrackId(Long adGroupTrackId) {
    this.adGroupTrackId = adGroupTrackId;
  }


  public AdGroupWebpage bid(AdGroupWebpageServiceBid bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * Get bid
   * @return bid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupWebpageServiceBid getBid() {
    return bid;
  }


  @JsonProperty(JSON_PROPERTY_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBid(AdGroupWebpageServiceBid bid) {
    this.bid = bid;
  }


  public AdGroupWebpage campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt;このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt;This field is required in any cases.&lt;/div&gt; 
   * @return campaignId
  **/
  @jakarta.annotation.Nullable
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


  public AdGroupWebpage campaignTrackId(Long campaignTrackId) {
    
    this.campaignTrackId = campaignTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーントラッキングIDです。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign tracking ID.&lt;br&gt;Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return campaignTrackId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignTrackId() {
    return campaignTrackId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignTrackId(Long campaignTrackId) {
    this.campaignTrackId = campaignTrackId;
  }


  public AdGroupWebpage excludedType(AdGroupWebpageServiceExcludedType excludedType) {
    
    this.excludedType = excludedType;
    return this;
  }

   /**
   * Get excludedType
   * @return excludedType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupWebpageServiceExcludedType getExcludedType() {
    return excludedType;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludedType(AdGroupWebpageServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }


  public AdGroupWebpage userStatus(AdGroupWebpageServiceUserStatus userStatus) {
    
    this.userStatus = userStatus;
    return this;
  }

   /**
   * Get userStatus
   * @return userStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupWebpageServiceUserStatus getUserStatus() {
    return userStatus;
  }


  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserStatus(AdGroupWebpageServiceUserStatus userStatus) {
    this.userStatus = userStatus;
  }


  public AdGroupWebpage webpage(AdGroupWebpageServiceWebpage webpage) {
    
    this.webpage = webpage;
    return this;
  }

   /**
   * Get webpage
   * @return webpage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupWebpageServiceWebpage getWebpage() {
    return webpage;
  }


  @JsonProperty(JSON_PROPERTY_WEBPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebpage(AdGroupWebpageServiceWebpage webpage) {
    this.webpage = webpage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupWebpage adGroupWebpage = (AdGroupWebpage) o;
    return Objects.equals(this.accountId, adGroupWebpage.accountId) &&
        Objects.equals(this.adGroupId, adGroupWebpage.adGroupId) &&
        Objects.equals(this.adGroupTrackId, adGroupWebpage.adGroupTrackId) &&
        Objects.equals(this.bid, adGroupWebpage.bid) &&
        Objects.equals(this.campaignId, adGroupWebpage.campaignId) &&
        Objects.equals(this.campaignTrackId, adGroupWebpage.campaignTrackId) &&
        Objects.equals(this.excludedType, adGroupWebpage.excludedType) &&
        Objects.equals(this.userStatus, adGroupWebpage.userStatus) &&
        Objects.equals(this.webpage, adGroupWebpage.webpage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, adGroupTrackId, bid, campaignId, campaignTrackId, excludedType, userStatus, webpage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpage {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupTrackId: ").append(toIndentedString(adGroupTrackId)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignTrackId: ").append(toIndentedString(campaignTrackId)).append("\n");
    sb.append("    excludedType: ").append(toIndentedString(excludedType)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    webpage: ").append(toIndentedString(webpage)).append("\n");
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

