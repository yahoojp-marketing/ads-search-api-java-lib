/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v7.model;

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
import jp.co.yahoo.adssearchapi.v7.model.AdGroupCriterionServiceBiddableAdGroupCriterion;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupCriterionServiceCriterion;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupCriterionServiceLabel;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupCriterionServiceTrademarkStatus;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupCriterionServiceUse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionオブジェクトは、広告グループのクライテリアを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterion object describes ad group criteria information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionオブジェクトは、広告グループのクライテリアを表します。</div> <div lang=\"en\">AdGroupCriterion object describes ad group criteria information.</div> ")
@JsonPropertyOrder({
  AdGroupCriterion.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupCriterion.JSON_PROPERTY_AD_GROUP_ID,
  AdGroupCriterion.JSON_PROPERTY_AD_GROUP_NAME,
  AdGroupCriterion.JSON_PROPERTY_AD_GROUP_TRACK_ID,
  AdGroupCriterion.JSON_PROPERTY_BIDDABLE_AD_GROUP_CRITERION,
  AdGroupCriterion.JSON_PROPERTY_CAMPAIGN_ID,
  AdGroupCriterion.JSON_PROPERTY_CAMPAIGN_NAME,
  AdGroupCriterion.JSON_PROPERTY_CAMPAIGN_TRACK_ID,
  AdGroupCriterion.JSON_PROPERTY_CRITERION,
  AdGroupCriterion.JSON_PROPERTY_LABELS,
  AdGroupCriterion.JSON_PROPERTY_USE,
  AdGroupCriterion.JSON_PROPERTY_TRADEMARK_STATUS,
  AdGroupCriterion.JSON_PROPERTY_INVALIDED_TRADEMARKS
})
@JsonTypeName("AdGroupCriterion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupCriterion {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_AD_GROUP_NAME = "adGroupName";
  private String adGroupName;

  public static final String JSON_PROPERTY_AD_GROUP_TRACK_ID = "adGroupTrackId";
  private Long adGroupTrackId;

  public static final String JSON_PROPERTY_BIDDABLE_AD_GROUP_CRITERION = "biddableAdGroupCriterion";
  private AdGroupCriterionServiceBiddableAdGroupCriterion biddableAdGroupCriterion;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_CAMPAIGN_TRACK_ID = "campaignTrackId";
  private Long campaignTrackId;

  public static final String JSON_PROPERTY_CRITERION = "criterion";
  private AdGroupCriterionServiceCriterion criterion;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<AdGroupCriterionServiceLabel> labels = null;

  public static final String JSON_PROPERTY_USE = "use";
  private AdGroupCriterionServiceUse use;

  public static final String JSON_PROPERTY_TRADEMARK_STATUS = "trademarkStatus";
  private AdGroupCriterionServiceTrademarkStatus trademarkStatus;

  public static final String JSON_PROPERTY_INVALIDED_TRADEMARKS = "invalidedTrademarks";
  private List<String> invalidedTrademarks = null;

  public AdGroupCriterion() { 
  }

  public AdGroupCriterion accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
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


  public AdGroupCriterion adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> ")
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


  public AdGroupCriterion adGroupName(String adGroupName) {
    
    this.adGroupName = adGroupName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループ名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group name.&lt;/div&gt; 
   * @return adGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名です。</div> <div lang=\"en\">Ad group name.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdGroupName() {
    return adGroupName;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }


  public AdGroupCriterion adGroupTrackId(Long adGroupTrackId) {
    
    this.adGroupTrackId = adGroupTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用広告グループIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID for tracking.&lt;/div&gt; 
   * @return adGroupTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用広告グループIDです。</div> <div lang=\"en\">Ad group ID for tracking.</div> ")
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


  public AdGroupCriterion biddableAdGroupCriterion(AdGroupCriterionServiceBiddableAdGroupCriterion biddableAdGroupCriterion) {
    
    this.biddableAdGroupCriterion = biddableAdGroupCriterion;
    return this;
  }

   /**
   * Get biddableAdGroupCriterion
   * @return biddableAdGroupCriterion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIDDABLE_AD_GROUP_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupCriterionServiceBiddableAdGroupCriterion getBiddableAdGroupCriterion() {
    return biddableAdGroupCriterion;
  }


  @JsonProperty(JSON_PROPERTY_BIDDABLE_AD_GROUP_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddableAdGroupCriterion(AdGroupCriterionServiceBiddableAdGroupCriterion biddableAdGroupCriterion) {
    this.biddableAdGroupCriterion = biddableAdGroupCriterion;
  }


  public AdGroupCriterion campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> ")
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


  public AdGroupCriterion campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign name.&lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign name.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public AdGroupCriterion campaignTrackId(Long campaignTrackId) {
    
    this.campaignTrackId = campaignTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用キャンペーンIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID for tracking.&lt;/div&gt; 
   * @return campaignTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用キャンペーンIDです。</div> <div lang=\"en\">Campaign ID for tracking.</div> ")
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


  public AdGroupCriterion criterion(AdGroupCriterionServiceCriterion criterion) {
    
    this.criterion = criterion;
    return this;
  }

   /**
   * Get criterion
   * @return criterion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupCriterionServiceCriterion getCriterion() {
    return criterion;
  }


  @JsonProperty(JSON_PROPERTY_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriterion(AdGroupCriterionServiceCriterion criterion) {
    this.criterion = criterion;
  }


  public AdGroupCriterion labels(List<AdGroupCriterionServiceLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public AdGroupCriterion addLabelsItem(AdGroupCriterionServiceLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupCriterionServiceLabel> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<AdGroupCriterionServiceLabel> labels) {
    this.labels = labels;
  }


  public AdGroupCriterion use(AdGroupCriterionServiceUse use) {
    
    this.use = use;
    return this;
  }

   /**
   * Get use
   * @return use
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupCriterionServiceUse getUse() {
    return use;
  }


  @JsonProperty(JSON_PROPERTY_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUse(AdGroupCriterionServiceUse use) {
    this.use = use;
  }


  public AdGroupCriterion trademarkStatus(AdGroupCriterionServiceTrademarkStatus trademarkStatus) {
    
    this.trademarkStatus = trademarkStatus;
    return this;
  }

   /**
   * Get trademarkStatus
   * @return trademarkStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADEMARK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupCriterionServiceTrademarkStatus getTrademarkStatus() {
    return trademarkStatus;
  }


  @JsonProperty(JSON_PROPERTY_TRADEMARK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrademarkStatus(AdGroupCriterionServiceTrademarkStatus trademarkStatus) {
    this.trademarkStatus = trademarkStatus;
  }


  public AdGroupCriterion invalidedTrademarks(List<String> invalidedTrademarks) {
    
    this.invalidedTrademarks = invalidedTrademarks;
    return this;
  }

  public AdGroupCriterion addInvalidedTrademarksItem(String invalidedTrademarksItem) {
    if (this.invalidedTrademarks == null) {
      this.invalidedTrademarks = new ArrayList<>();
    }
    this.invalidedTrademarks.add(invalidedTrademarksItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;制限された商標です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Invalided trademarks.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return invalidedTrademarks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">制限された商標です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Invalided trademarks.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_INVALIDED_TRADEMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getInvalidedTrademarks() {
    return invalidedTrademarks;
  }


  @JsonProperty(JSON_PROPERTY_INVALIDED_TRADEMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalidedTrademarks(List<String> invalidedTrademarks) {
    this.invalidedTrademarks = invalidedTrademarks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterion adGroupCriterion = (AdGroupCriterion) o;
    return Objects.equals(this.accountId, adGroupCriterion.accountId) &&
        Objects.equals(this.adGroupId, adGroupCriterion.adGroupId) &&
        Objects.equals(this.adGroupName, adGroupCriterion.adGroupName) &&
        Objects.equals(this.adGroupTrackId, adGroupCriterion.adGroupTrackId) &&
        Objects.equals(this.biddableAdGroupCriterion, adGroupCriterion.biddableAdGroupCriterion) &&
        Objects.equals(this.campaignId, adGroupCriterion.campaignId) &&
        Objects.equals(this.campaignName, adGroupCriterion.campaignName) &&
        Objects.equals(this.campaignTrackId, adGroupCriterion.campaignTrackId) &&
        Objects.equals(this.criterion, adGroupCriterion.criterion) &&
        Objects.equals(this.labels, adGroupCriterion.labels) &&
        Objects.equals(this.use, adGroupCriterion.use) &&
        Objects.equals(this.trademarkStatus, adGroupCriterion.trademarkStatus) &&
        Objects.equals(this.invalidedTrademarks, adGroupCriterion.invalidedTrademarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, adGroupName, adGroupTrackId, biddableAdGroupCriterion, campaignId, campaignName, campaignTrackId, criterion, labels, use, trademarkStatus, invalidedTrademarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterion {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    adGroupTrackId: ").append(toIndentedString(adGroupTrackId)).append("\n");
    sb.append("    biddableAdGroupCriterion: ").append(toIndentedString(biddableAdGroupCriterion)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignTrackId: ").append(toIndentedString(campaignTrackId)).append("\n");
    sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    trademarkStatus: ").append(toIndentedString(trademarkStatus)).append("\n");
    sb.append("    invalidedTrademarks: ").append(toIndentedString(invalidedTrademarks)).append("\n");
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
