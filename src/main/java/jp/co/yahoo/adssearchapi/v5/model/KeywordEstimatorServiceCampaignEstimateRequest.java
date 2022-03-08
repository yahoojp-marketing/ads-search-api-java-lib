/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v5.model;

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
import jp.co.yahoo.adssearchapi.v5.model.KeywordEstimatorServiceAdGroupEstimateRequest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordEstimatorServiceCampaignEstimateRequestオブジェクトは、見積もりを行うキャンペーンを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordEstimatorServiceCampaignEstimateRequest object is a container for a campaign to estimate.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordEstimatorServiceCampaignEstimateRequestオブジェクトは、見積もりを行うキャンペーンを格納するコンテナです。</div> <div lang=\"en\">KeywordEstimatorServiceCampaignEstimateRequest object is a container for a campaign to estimate.</div> ")
@JsonPropertyOrder({
  KeywordEstimatorServiceCampaignEstimateRequest.JSON_PROPERTY_AD_GROUP_ESTIMATE_REQUESTS,
  KeywordEstimatorServiceCampaignEstimateRequest.JSON_PROPERTY_CAMPAIGN_ID,
  KeywordEstimatorServiceCampaignEstimateRequest.JSON_PROPERTY_DAILY_BUDGET,
  KeywordEstimatorServiceCampaignEstimateRequest.JSON_PROPERTY_PROVINCES
})
@JsonTypeName("KeywordEstimatorServiceCampaignEstimateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordEstimatorServiceCampaignEstimateRequest {
  public static final String JSON_PROPERTY_AD_GROUP_ESTIMATE_REQUESTS = "adGroupEstimateRequests";
  private List<KeywordEstimatorServiceAdGroupEstimateRequest> adGroupEstimateRequests = new ArrayList<>();

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_DAILY_BUDGET = "dailyBudget";
  private Long dailyBudget;

  public static final String JSON_PROPERTY_PROVINCES = "provinces";
  private List<String> provinces = null;

  public KeywordEstimatorServiceCampaignEstimateRequest() { 
  }

  public KeywordEstimatorServiceCampaignEstimateRequest adGroupEstimateRequests(List<KeywordEstimatorServiceAdGroupEstimateRequest> adGroupEstimateRequests) {
    
    this.adGroupEstimateRequests = adGroupEstimateRequests;
    return this;
  }

  public KeywordEstimatorServiceCampaignEstimateRequest addAdGroupEstimateRequestsItem(KeywordEstimatorServiceAdGroupEstimateRequest adGroupEstimateRequestsItem) {
    this.adGroupEstimateRequests.add(adGroupEstimateRequestsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;見積もりを行う広告グループを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;A container for the Ad Group to estimate&lt;/div&gt; 
   * @return adGroupEstimateRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">見積もりを行う広告グループを格納するコンテナです。</div> <div lang=\"en\">A container for the Ad Group to estimate</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_ESTIMATE_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<KeywordEstimatorServiceAdGroupEstimateRequest> getAdGroupEstimateRequests() {
    return adGroupEstimateRequests;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_ESTIMATE_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdGroupEstimateRequests(List<KeywordEstimatorServiceAdGroupEstimateRequest> adGroupEstimateRequests) {
    this.adGroupEstimateRequests = adGroupEstimateRequests;
  }


  public KeywordEstimatorServiceCampaignEstimateRequest campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID</div> ")
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


  public KeywordEstimatorServiceCampaignEstimateRequest dailyBudget(Long dailyBudget) {
    
    this.dailyBudget = dailyBudget;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;見積もりで使用するキャンペーンの一日あたりの予算です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Daily campaign budget used to estimate&lt;/div&gt; 
   * @return dailyBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">見積もりで使用するキャンペーンの一日あたりの予算です。</div> <div lang=\"en\">Daily campaign budget used to estimate</div> ")
  @JsonProperty(JSON_PROPERTY_DAILY_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDailyBudget() {
    return dailyBudget;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
  }


  public KeywordEstimatorServiceCampaignEstimateRequest provinces(List<String> provinces) {
    
    this.provinces = provinces;
    return this;
  }

  public KeywordEstimatorServiceCampaignEstimateRequest addProvincesItem(String provincesItem) {
    if (this.provinces == null) {
      this.provinces = new ArrayList<>();
    }
    this.provinces.add(provincesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;見積もりで使用する広告配信する指定地域（都道府県）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Province to serve Ads used to estimate&lt;/div&gt; 
   * @return provinces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">見積もりで使用する広告配信する指定地域（都道府県）です。</div> <div lang=\"en\">Province to serve Ads used to estimate</div> ")
  @JsonProperty(JSON_PROPERTY_PROVINCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProvinces() {
    return provinces;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvinces(List<String> provinces) {
    this.provinces = provinces;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceCampaignEstimateRequest keywordEstimatorServiceCampaignEstimateRequest = (KeywordEstimatorServiceCampaignEstimateRequest) o;
    return Objects.equals(this.adGroupEstimateRequests, keywordEstimatorServiceCampaignEstimateRequest.adGroupEstimateRequests) &&
        Objects.equals(this.campaignId, keywordEstimatorServiceCampaignEstimateRequest.campaignId) &&
        Objects.equals(this.dailyBudget, keywordEstimatorServiceCampaignEstimateRequest.dailyBudget) &&
        Objects.equals(this.provinces, keywordEstimatorServiceCampaignEstimateRequest.provinces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupEstimateRequests, campaignId, dailyBudget, provinces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceCampaignEstimateRequest {\n");
    sb.append("    adGroupEstimateRequests: ").append(toIndentedString(adGroupEstimateRequests)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    dailyBudget: ").append(toIndentedString(dailyBudget)).append("\n");
    sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
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

