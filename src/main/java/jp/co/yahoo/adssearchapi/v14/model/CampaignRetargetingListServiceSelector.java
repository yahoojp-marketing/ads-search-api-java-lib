/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v14.model.CampaignRetargetingListServiceExcludedType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignRetargetingListServiceSelectorオブジェクトは、キャンペーン階層におけるターゲットリストの設定情報を取得するための検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignRetargetingListServiceSelector object holds search conditions (exec parameters) to get Target List settings on the campaign level.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignRetargetingListServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  CampaignRetargetingListServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  CampaignRetargetingListServiceSelector.JSON_PROPERTY_EXCLUDED_TYPE,
  CampaignRetargetingListServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  CampaignRetargetingListServiceSelector.JSON_PROPERTY_START_INDEX,
  CampaignRetargetingListServiceSelector.JSON_PROPERTY_TARGET_LIST_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignRetargetingListServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds;

  public static final String JSON_PROPERTY_EXCLUDED_TYPE = "excludedType";
  private CampaignRetargetingListServiceExcludedType excludedType;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_TARGET_LIST_IDS = "targetListIds";
  private List<Long> targetListIds;

  public CampaignRetargetingListServiceSelector() {
  }

  public CampaignRetargetingListServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
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


  public CampaignRetargetingListServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignRetargetingListServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Campaign ID.&lt;/div&gt; 
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


  public CampaignRetargetingListServiceSelector excludedType(CampaignRetargetingListServiceExcludedType excludedType) {
    
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

  public CampaignRetargetingListServiceExcludedType getExcludedType() {
    return excludedType;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludedType(CampaignRetargetingListServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }


  public CampaignRetargetingListServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 1000
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


  public CampaignRetargetingListServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 1.&lt;/div&gt; 
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


  public CampaignRetargetingListServiceSelector targetListIds(List<Long> targetListIds) {
    
    this.targetListIds = targetListIds;
    return this;
  }

  public CampaignRetargetingListServiceSelector addTargetListIdsItem(Long targetListIdsItem) {
    if (this.targetListIds == null) {
      this.targetListIds = new ArrayList<>();
    }
    this.targetListIds.add(targetListIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリストIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search conditon: Target List ID.&lt;/div&gt; 
   * @return targetListIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getTargetListIds() {
    return targetListIds;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListIds(List<Long> targetListIds) {
    this.targetListIds = targetListIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRetargetingListServiceSelector campaignRetargetingListServiceSelector = (CampaignRetargetingListServiceSelector) o;
    return Objects.equals(this.accountId, campaignRetargetingListServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, campaignRetargetingListServiceSelector.campaignIds) &&
        Objects.equals(this.excludedType, campaignRetargetingListServiceSelector.excludedType) &&
        Objects.equals(this.numberResults, campaignRetargetingListServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, campaignRetargetingListServiceSelector.startIndex) &&
        Objects.equals(this.targetListIds, campaignRetargetingListServiceSelector.targetListIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, excludedType, numberResults, startIndex, targetListIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRetargetingListServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    excludedType: ").append(toIndentedString(excludedType)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    targetListIds: ").append(toIndentedString(targetListIds)).append("\n");
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

