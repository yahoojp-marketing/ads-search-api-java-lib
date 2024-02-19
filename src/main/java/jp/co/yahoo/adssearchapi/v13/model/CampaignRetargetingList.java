/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v13.model.CampaignRetargetingListServiceCriterionTargetList;
import jp.co.yahoo.adssearchapi.v13.model.CampaignRetargetingListServiceExcludedType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignRetargetingListオブジェクトは、キャンペーン階層におけるターゲットリストの設定情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignRetargetingList object holds the setting information of Target List on campaign level.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignRetargetingListオブジェクトは、キャンペーン階層におけるターゲットリストの設定情報を保持するオブジェクトです。</div> <div lang=\"en\">CampaignRetargetingList object holds the setting information of Target List on campaign level.</div> ")
@JsonPropertyOrder({
  CampaignRetargetingList.JSON_PROPERTY_ACCOUNT_ID,
  CampaignRetargetingList.JSON_PROPERTY_BID_MULTIPLIER,
  CampaignRetargetingList.JSON_PROPERTY_CAMPAIGN_ID,
  CampaignRetargetingList.JSON_PROPERTY_CAMPAIGN_NAME,
  CampaignRetargetingList.JSON_PROPERTY_CRITERION_TARGET_LIST,
  CampaignRetargetingList.JSON_PROPERTY_EXCLUDED_TYPE
})
@JsonTypeName("CampaignRetargetingList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignRetargetingList {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_BID_MULTIPLIER = "bidMultiplier";
  private Double bidMultiplier;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_CRITERION_TARGET_LIST = "criterionTargetList";
  private CampaignRetargetingListServiceCriterionTargetList criterionTargetList;

  public static final String JSON_PROPERTY_EXCLUDED_TYPE = "excludedType";
  private CampaignRetargetingListServiceExcludedType excludedType;

  public CampaignRetargetingList() { 
  }

  public CampaignRetargetingList accountId(Long accountId) {
    
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


  public CampaignRetargetingList bidMultiplier(Double bidMultiplier) {
    
    this.bidMultiplier = bidMultiplier;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   入札価格調整率です。0.10～10.00まで指定できます。&lt;br&gt;   0を指定した場合、広告は配信されません。&lt;br&gt;   また、入札価格調整率の値は小数点第二位まで指定可能です。&lt;br&gt;   このフィールドは省略可能となります。その際、デフォルト設定値は1.0となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Bid adjustment rate.&lt;br&gt;   Can be specified between  0.10 to 10.00.&lt;br&gt;   When specified &amp;#39;0&amp;#39;, the ad will not be delivered.&lt;br&gt;   Bid adjustment rate can be specified up to two decimal places.&lt;br&gt;   This field is optional. The default value will be 1.0. &lt;/div&gt; 
   * @return bidMultiplier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">   入札価格調整率です。0.10～10.00まで指定できます。<br>   0を指定した場合、広告は配信されません。<br>   また、入札価格調整率の値は小数点第二位まで指定可能です。<br>   このフィールドは省略可能となります。その際、デフォルト設定値は1.0となります。 </div> <div lang=\"en\">   Bid adjustment rate.<br>   Can be specified between  0.10 to 10.00.<br>   When specified &#39;0&#39;, the ad will not be delivered.<br>   Bid adjustment rate can be specified up to two decimal places.<br>   This field is optional. The default value will be 1.0. </div> ")
  @JsonProperty(JSON_PROPERTY_BID_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getBidMultiplier() {
    return bidMultiplier;
  }


  @JsonProperty(JSON_PROPERTY_BID_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }


  public CampaignRetargetingList campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt;このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt;This field is required in any cases.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br>This field is required in any cases.</div> ")
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


  public CampaignRetargetingList campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン名称です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of campaign.&lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名称です。</div> <div lang=\"en\">Name of campaign.</div> ")
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


  public CampaignRetargetingList criterionTargetList(CampaignRetargetingListServiceCriterionTargetList criterionTargetList) {
    
    this.criterionTargetList = criterionTargetList;
    return this;
  }

   /**
   * Get criterionTargetList
   * @return criterionTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CRITERION_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignRetargetingListServiceCriterionTargetList getCriterionTargetList() {
    return criterionTargetList;
  }


  @JsonProperty(JSON_PROPERTY_CRITERION_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriterionTargetList(CampaignRetargetingListServiceCriterionTargetList criterionTargetList) {
    this.criterionTargetList = criterionTargetList;
  }


  public CampaignRetargetingList excludedType(CampaignRetargetingListServiceExcludedType excludedType) {
    
    this.excludedType = excludedType;
    return this;
  }

   /**
   * Get excludedType
   * @return excludedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignRetargetingListServiceExcludedType getExcludedType() {
    return excludedType;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludedType(CampaignRetargetingListServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRetargetingList campaignRetargetingList = (CampaignRetargetingList) o;
    return Objects.equals(this.accountId, campaignRetargetingList.accountId) &&
        Objects.equals(this.bidMultiplier, campaignRetargetingList.bidMultiplier) &&
        Objects.equals(this.campaignId, campaignRetargetingList.campaignId) &&
        Objects.equals(this.campaignName, campaignRetargetingList.campaignName) &&
        Objects.equals(this.criterionTargetList, campaignRetargetingList.criterionTargetList) &&
        Objects.equals(this.excludedType, campaignRetargetingList.excludedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bidMultiplier, campaignId, campaignName, criterionTargetList, excludedType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRetargetingList {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    criterionTargetList: ").append(toIndentedString(criterionTargetList)).append("\n");
    sb.append("    excludedType: ").append(toIndentedString(excludedType)).append("\n");
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

