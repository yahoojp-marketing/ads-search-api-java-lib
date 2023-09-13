/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v12.model.CampaignTargetServiceExcludedType;
import jp.co.yahoo.adssearchapi.v12.model.CampaignTargetServicePlatformType;
import jp.co.yahoo.adssearchapi.v12.model.CampaignTargetServiceTargetType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceSelectorオブジェクトは、操作の対象とするキャンペーンのターゲティング設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetSelector object describes the targeting settings on the campaign to be operated.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignTargetServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  CampaignTargetServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  CampaignTargetServiceSelector.JSON_PROPERTY_EXCLUDED_TYPE,
  CampaignTargetServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  CampaignTargetServiceSelector.JSON_PROPERTY_PLATFORM_TYPES,
  CampaignTargetServiceSelector.JSON_PROPERTY_START_INDEX,
  CampaignTargetServiceSelector.JSON_PROPERTY_TARGET_IDS,
  CampaignTargetServiceSelector.JSON_PROPERTY_TARGET_TYPES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignTargetServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds;

  public static final String JSON_PROPERTY_EXCLUDED_TYPE = "excludedType";
  private CampaignTargetServiceExcludedType excludedType;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_PLATFORM_TYPES = "platformTypes";
  private List<CampaignTargetServicePlatformType> platformTypes;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_TARGET_IDS = "targetIds";
  private List<String> targetIds;

  public static final String JSON_PROPERTY_TARGET_TYPES = "targetTypes";
  private List<CampaignTargetServiceTargetType> targetTypes;

  public CampaignTargetServiceSelector() {
  }

  public CampaignTargetServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public CampaignTargetServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignTargetServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;/div&gt; 
   * @return campaignIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public CampaignTargetServiceSelector excludedType(CampaignTargetServiceExcludedType excludedType) {
    
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

  public CampaignTargetServiceExcludedType getExcludedType() {
    return excludedType;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludedType(CampaignTargetServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }


  public CampaignTargetServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public CampaignTargetServiceSelector platformTypes(List<CampaignTargetServicePlatformType> platformTypes) {
    
    this.platformTypes = platformTypes;
    return this;
  }

  public CampaignTargetServiceSelector addPlatformTypesItem(CampaignTargetServicePlatformType platformTypesItem) {
    if (this.platformTypes == null) {
      this.platformTypes = new ArrayList<>();
    }
    this.platformTypes.add(platformTypesItem);
    return this;
  }

   /**
   * Get platformTypes
   * @return platformTypes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignTargetServicePlatformType> getPlatformTypes() {
    return platformTypes;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformTypes(List<CampaignTargetServicePlatformType> platformTypes) {
    this.platformTypes = platformTypes;
  }


  public CampaignTargetServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public CampaignTargetServiceSelector targetIds(List<String> targetIds) {
    
    this.targetIds = targetIds;
    return this;
  }

  public CampaignTargetServiceSelector addTargetIdsItem(String targetIdsItem) {
    if (this.targetIds == null) {
      this.targetIds = new ArrayList<>();
    }
    this.targetIds.add(targetIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target ID.&lt;/div&gt; 
   * @return targetIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTargetIds() {
    return targetIds;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetIds(List<String> targetIds) {
    this.targetIds = targetIds;
  }


  public CampaignTargetServiceSelector targetTypes(List<CampaignTargetServiceTargetType> targetTypes) {
    
    this.targetTypes = targetTypes;
    return this;
  }

  public CampaignTargetServiceSelector addTargetTypesItem(CampaignTargetServiceTargetType targetTypesItem) {
    if (this.targetTypes == null) {
      this.targetTypes = new ArrayList<>();
    }
    this.targetTypes.add(targetTypesItem);
    return this;
  }

   /**
   * Get targetTypes
   * @return targetTypes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignTargetServiceTargetType> getTargetTypes() {
    return targetTypes;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetTypes(List<CampaignTargetServiceTargetType> targetTypes) {
    this.targetTypes = targetTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargetServiceSelector campaignTargetServiceSelector = (CampaignTargetServiceSelector) o;
    return Objects.equals(this.accountId, campaignTargetServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, campaignTargetServiceSelector.campaignIds) &&
        Objects.equals(this.excludedType, campaignTargetServiceSelector.excludedType) &&
        Objects.equals(this.numberResults, campaignTargetServiceSelector.numberResults) &&
        Objects.equals(this.platformTypes, campaignTargetServiceSelector.platformTypes) &&
        Objects.equals(this.startIndex, campaignTargetServiceSelector.startIndex) &&
        Objects.equals(this.targetIds, campaignTargetServiceSelector.targetIds) &&
        Objects.equals(this.targetTypes, campaignTargetServiceSelector.targetTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, excludedType, numberResults, platformTypes, startIndex, targetIds, targetTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    excludedType: ").append(toIndentedString(excludedType)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    platformTypes: ").append(toIndentedString(platformTypes)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    targetIds: ").append(toIndentedString(targetIds)).append("\n");
    sb.append("    targetTypes: ").append(toIndentedString(targetTypes)).append("\n");
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
