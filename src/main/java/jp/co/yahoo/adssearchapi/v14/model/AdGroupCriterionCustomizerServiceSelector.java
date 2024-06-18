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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v14.model.AdGroupCriterionCustomizerServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionCustomizerServiceSelectorオブジェクトは、カスタマイザー属性の情報を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionCustomizerServiceSelector describes the AdGroupCriterionCustomizer information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionCustomizerServiceSelectorオブジェクトは、カスタマイザー属性の情報を指定します。</div> <div lang=\"en\">AdGroupCriterionCustomizerServiceSelector describes the AdGroupCriterionCustomizer information.</div> ")
@JsonPropertyOrder({
  AdGroupCriterionCustomizerServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupCriterionCustomizerServiceSelector.JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_IDS,
  AdGroupCriterionCustomizerServiceSelector.JSON_PROPERTY_CAMPAIGN_IDS,
  AdGroupCriterionCustomizerServiceSelector.JSON_PROPERTY_AD_GROUP_IDS,
  AdGroupCriterionCustomizerServiceSelector.JSON_PROPERTY_CRITERION_IDS,
  AdGroupCriterionCustomizerServiceSelector.JSON_PROPERTY_TYPES,
  AdGroupCriterionCustomizerServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AdGroupCriterionCustomizerServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("AdGroupCriterionCustomizerServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupCriterionCustomizerServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_IDS = "customizerAttributeIds";
  private List<Long> customizerAttributeIds = null;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_AD_GROUP_IDS = "adGroupIds";
  private List<Long> adGroupIds = null;

  public static final String JSON_PROPERTY_CRITERION_IDS = "criterionIds";
  private List<Long> criterionIds = null;

  public static final String JSON_PROPERTY_TYPES = "types";
  private List<AdGroupCriterionCustomizerServiceType> types = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public AdGroupCriterionCustomizerServiceSelector() { 
  }

  public AdGroupCriterionCustomizerServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
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


  public AdGroupCriterionCustomizerServiceSelector customizerAttributeIds(List<Long> customizerAttributeIds) {
    
    this.customizerAttributeIds = customizerAttributeIds;
    return this;
  }

  public AdGroupCriterionCustomizerServiceSelector addCustomizerAttributeIdsItem(Long customizerAttributeIdsItem) {
    if (this.customizerAttributeIds == null) {
      this.customizerAttributeIds = new ArrayList<>();
    }
    this.customizerAttributeIds.add(customizerAttributeIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：カスタマイザー属性ID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Customizer attribute ID&lt;/div&gt; 
   * @return customizerAttributeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：カスタマイザー属性ID</div> <div lang=\"en\">Search condition: Customizer attribute ID</div> ")
  @JsonProperty(JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCustomizerAttributeIds() {
    return customizerAttributeIds;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomizerAttributeIds(List<Long> customizerAttributeIds) {
    this.customizerAttributeIds = customizerAttributeIds;
  }


  public AdGroupCriterionCustomizerServiceSelector campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public AdGroupCriterionCustomizerServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：キャンペーンID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Campaign ID.&lt;/div&gt; 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンID</div> <div lang=\"en\">Search condition: Campaign ID.</div> ")
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


  public AdGroupCriterionCustomizerServiceSelector adGroupIds(List<Long> adGroupIds) {
    
    this.adGroupIds = adGroupIds;
    return this;
  }

  public AdGroupCriterionCustomizerServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：広告グループID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Ad group ID&lt;/div&gt; 
   * @return adGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループID</div> <div lang=\"en\">Search condition: Ad group ID</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }


  public AdGroupCriterionCustomizerServiceSelector criterionIds(List<Long> criterionIds) {
    
    this.criterionIds = criterionIds;
    return this;
  }

  public AdGroupCriterionCustomizerServiceSelector addCriterionIdsItem(Long criterionIdsItem) {
    if (this.criterionIds == null) {
      this.criterionIds = new ArrayList<>();
    }
    this.criterionIds.add(criterionIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：クライテリアID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Criterion ID&lt;/div&gt; 
   * @return criterionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：クライテリアID</div> <div lang=\"en\">Search condition: Criterion ID</div> ")
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


  public AdGroupCriterionCustomizerServiceSelector types(List<AdGroupCriterionCustomizerServiceType> types) {
    
    this.types = types;
    return this;
  }

  public AdGroupCriterionCustomizerServiceSelector addTypesItem(AdGroupCriterionCustomizerServiceType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupCriterionCustomizerServiceType> getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(List<AdGroupCriterionCustomizerServiceType> types) {
    this.types = types;
  }


  public AdGroupCriterionCustomizerServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 2000
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.</div> ")
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


  public AdGroupCriterionCustomizerServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The position within the result set where retrieval begins. This field must be greater than or equal to 1.</div> ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionCustomizerServiceSelector adGroupCriterionCustomizerServiceSelector = (AdGroupCriterionCustomizerServiceSelector) o;
    return Objects.equals(this.accountId, adGroupCriterionCustomizerServiceSelector.accountId) &&
        Objects.equals(this.customizerAttributeIds, adGroupCriterionCustomizerServiceSelector.customizerAttributeIds) &&
        Objects.equals(this.campaignIds, adGroupCriterionCustomizerServiceSelector.campaignIds) &&
        Objects.equals(this.adGroupIds, adGroupCriterionCustomizerServiceSelector.adGroupIds) &&
        Objects.equals(this.criterionIds, adGroupCriterionCustomizerServiceSelector.criterionIds) &&
        Objects.equals(this.types, adGroupCriterionCustomizerServiceSelector.types) &&
        Objects.equals(this.numberResults, adGroupCriterionCustomizerServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, adGroupCriterionCustomizerServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customizerAttributeIds, campaignIds, adGroupIds, criterionIds, types, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionCustomizerServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customizerAttributeIds: ").append(toIndentedString(customizerAttributeIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    criterionIds: ").append(toIndentedString(criterionIds)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

