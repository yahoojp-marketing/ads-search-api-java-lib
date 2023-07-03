/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v11.model.CampaignCriterionServiceUse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionServiceSelectorオブジェクトは、操作の対象となるキャンペーンのクライテリアを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterionServiceSelector object describes campaign criteria for operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignCriterionServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  CampaignCriterionServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  CampaignCriterionServiceSelector.JSON_PROPERTY_CRITERION_IDS,
  CampaignCriterionServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  CampaignCriterionServiceSelector.JSON_PROPERTY_START_INDEX,
  CampaignCriterionServiceSelector.JSON_PROPERTY_USE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignCriterionServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds;

  public static final String JSON_PROPERTY_CRITERION_IDS = "criterionIds";
  private List<Long> criterionIds;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_USE = "use";
  private CampaignCriterionServiceUse use;

  public CampaignCriterionServiceSelector() {
  }

  public CampaignCriterionServiceSelector accountId(Long accountId) {
    
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


  public CampaignCriterionServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignCriterionServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDの配列です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID array.&lt;/div&gt; 
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


  public CampaignCriterionServiceSelector criterionIds(List<Long> criterionIds) {
    
    this.criterionIds = criterionIds;
    return this;
  }

  public CampaignCriterionServiceSelector addCriterionIdsItem(Long criterionIdsItem) {
    if (this.criterionIds == null) {
      this.criterionIds = new ArrayList<>();
    }
    this.criterionIds.add(criterionIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クライテリオンIDの配列です。&lt;br&gt; 指定しない場合は、キャンペーンID以下のすべてのクライテリアが含まれます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Criterion ID array.&lt;br&gt; If no criterionIds, all of criterionIds under the campaign ID are returned.&lt;/div&gt; 
   * @return criterionIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITERION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCriterionIds() {
    return criterionIds;
  }


  @JsonProperty(JSON_PROPERTY_CRITERION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriterionIds(List<Long> criterionIds) {
    this.criterionIds = criterionIds;
  }


  public CampaignCriterionServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 10000
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


  public CampaignCriterionServiceSelector startIndex(Integer startIndex) {
    
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


  public CampaignCriterionServiceSelector use(CampaignCriterionServiceUse use) {
    
    this.use = use;
    return this;
  }

   /**
   * Get use
   * @return use
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignCriterionServiceUse getUse() {
    return use;
  }


  @JsonProperty(JSON_PROPERTY_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUse(CampaignCriterionServiceUse use) {
    this.use = use;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCriterionServiceSelector campaignCriterionServiceSelector = (CampaignCriterionServiceSelector) o;
    return Objects.equals(this.accountId, campaignCriterionServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, campaignCriterionServiceSelector.campaignIds) &&
        Objects.equals(this.criterionIds, campaignCriterionServiceSelector.criterionIds) &&
        Objects.equals(this.numberResults, campaignCriterionServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, campaignCriterionServiceSelector.startIndex) &&
        Objects.equals(this.use, campaignCriterionServiceSelector.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, criterionIds, numberResults, startIndex, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCriterionServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    criterionIds: ").append(toIndentedString(criterionIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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

