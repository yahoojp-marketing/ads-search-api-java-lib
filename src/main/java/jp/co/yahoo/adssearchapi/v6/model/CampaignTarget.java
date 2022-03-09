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
import jp.co.yahoo.adssearchapi.v6.model.CampaignTargetServiceTarget;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetオブジェクトは、キャンペーンの各種ターゲティング設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTarget describes each type of targeting setting of Campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetオブジェクトは、キャンペーンの各種ターゲティング設定を表します。</div> <div lang=\"en\">CampaignTarget describes each type of targeting setting of Campaign.</div> ")
@JsonPropertyOrder({
  CampaignTarget.JSON_PROPERTY_ACCOUNT_ID,
  CampaignTarget.JSON_PROPERTY_BID_MULTIPLIER,
  CampaignTarget.JSON_PROPERTY_CAMPAIGN_ID,
  CampaignTarget.JSON_PROPERTY_CAMPAIGN_NAME,
  CampaignTarget.JSON_PROPERTY_TARGET
})
@JsonTypeName("CampaignTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignTarget {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_BID_MULTIPLIER = "bidMultiplier";
  private Double bidMultiplier;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_TARGET = "target";
  private CampaignTargetServiceTarget target;

  public CampaignTarget() { 
  }

  public CampaignTarget accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required in any cases.</div> ")
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


  public CampaignTarget bidMultiplier(Double bidMultiplier) {
    
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


  public CampaignTarget campaignId(Long campaignId) {
    
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


  public CampaignTarget campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign Name.&lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign Name.</div> ")
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


  public CampaignTarget target(CampaignTargetServiceTarget target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceTarget getTarget() {
    return target;
  }


  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTarget(CampaignTargetServiceTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTarget campaignTarget = (CampaignTarget) o;
    return Objects.equals(this.accountId, campaignTarget.accountId) &&
        Objects.equals(this.bidMultiplier, campaignTarget.bidMultiplier) &&
        Objects.equals(this.campaignId, campaignTarget.campaignId) &&
        Objects.equals(this.campaignName, campaignTarget.campaignName) &&
        Objects.equals(this.target, campaignTarget.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bidMultiplier, campaignId, campaignName, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTarget {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

