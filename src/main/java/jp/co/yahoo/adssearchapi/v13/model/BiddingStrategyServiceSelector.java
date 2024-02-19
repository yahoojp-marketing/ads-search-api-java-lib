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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v13.model.BiddingStrategyServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceSelectorオブジェクトは、自動入札設定の検索条件に関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceSelector object displays the details of search results of auto bidding setting .&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceSelectorオブジェクトは、自動入札設定の検索条件に関する情報を表します。</div> <div lang=\"en\">BiddingStrategyServiceSelector object displays the details of search results of auto bidding setting .</div> ")
@JsonPropertyOrder({
  BiddingStrategyServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  BiddingStrategyServiceSelector.JSON_PROPERTY_PORTFOLIO_BIDDING_IDS,
  BiddingStrategyServiceSelector.JSON_PROPERTY_BIDDING_STRATEGY_TYPES,
  BiddingStrategyServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  BiddingStrategyServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("BiddingStrategyServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BiddingStrategyServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_PORTFOLIO_BIDDING_IDS = "portfolioBiddingIds";
  private List<Long> portfolioBiddingIds = null;

  public static final String JSON_PROPERTY_BIDDING_STRATEGY_TYPES = "biddingStrategyTypes";
  private List<BiddingStrategyServiceType> biddingStrategyTypes = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public BiddingStrategyServiceSelector() { 
  }

  public BiddingStrategyServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> ")
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


  public BiddingStrategyServiceSelector portfolioBiddingIds(List<Long> portfolioBiddingIds) {
    
    this.portfolioBiddingIds = portfolioBiddingIds;
    return this;
  }

  public BiddingStrategyServiceSelector addPortfolioBiddingIdsItem(Long portfolioBiddingIdsItem) {
    if (this.portfolioBiddingIds == null) {
      this.portfolioBiddingIds = new ArrayList<>();
    }
    this.portfolioBiddingIds.add(portfolioBiddingIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ポートフォリオ入札ID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Portfolio bidding ID.&lt;/div&gt; 
   * @return portfolioBiddingIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ポートフォリオ入札ID</div> <div lang=\"en\">Portfolio bidding ID.</div> ")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO_BIDDING_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getPortfolioBiddingIds() {
    return portfolioBiddingIds;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO_BIDDING_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortfolioBiddingIds(List<Long> portfolioBiddingIds) {
    this.portfolioBiddingIds = portfolioBiddingIds;
  }


  public BiddingStrategyServiceSelector biddingStrategyTypes(List<BiddingStrategyServiceType> biddingStrategyTypes) {
    
    this.biddingStrategyTypes = biddingStrategyTypes;
    return this;
  }

  public BiddingStrategyServiceSelector addBiddingStrategyTypesItem(BiddingStrategyServiceType biddingStrategyTypesItem) {
    if (this.biddingStrategyTypes == null) {
      this.biddingStrategyTypes = new ArrayList<>();
    }
    this.biddingStrategyTypes.add(biddingStrategyTypesItem);
    return this;
  }

   /**
   * Get biddingStrategyTypes
   * @return biddingStrategyTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BiddingStrategyServiceType> getBiddingStrategyTypes() {
    return biddingStrategyTypes;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingStrategyTypes(List<BiddingStrategyServiceType> biddingStrategyTypes) {
    this.biddingStrategyTypes = biddingStrategyTypes;
  }


  public BiddingStrategyServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
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


  public BiddingStrategyServiceSelector startIndex(Integer startIndex) {
    
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
    BiddingStrategyServiceSelector biddingStrategyServiceSelector = (BiddingStrategyServiceSelector) o;
    return Objects.equals(this.accountId, biddingStrategyServiceSelector.accountId) &&
        Objects.equals(this.portfolioBiddingIds, biddingStrategyServiceSelector.portfolioBiddingIds) &&
        Objects.equals(this.biddingStrategyTypes, biddingStrategyServiceSelector.biddingStrategyTypes) &&
        Objects.equals(this.numberResults, biddingStrategyServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, biddingStrategyServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, portfolioBiddingIds, biddingStrategyTypes, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    portfolioBiddingIds: ").append(toIndentedString(portfolioBiddingIds)).append("\n");
    sb.append("    biddingStrategyTypes: ").append(toIndentedString(biddingStrategyTypes)).append("\n");
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

