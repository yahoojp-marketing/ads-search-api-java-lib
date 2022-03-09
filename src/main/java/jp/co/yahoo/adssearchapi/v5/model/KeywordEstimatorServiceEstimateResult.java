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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordEstimatorServiceEstimateResult オブジェクトは、見積もりリクエストを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;EstimateKeyword object is a container for the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordEstimatorServiceEstimateResult オブジェクトは、見積もりリクエストを格納するコンテナです。</div> <div lang=\"en\">EstimateKeyword object is a container for the estimate request.</div> ")
@JsonPropertyOrder({
  KeywordEstimatorServiceEstimateResult.JSON_PROPERTY_CLICKS,
  KeywordEstimatorServiceEstimateResult.JSON_PROPERTY_COST,
  KeywordEstimatorServiceEstimateResult.JSON_PROPERTY_CPC,
  KeywordEstimatorServiceEstimateResult.JSON_PROPERTY_CTR,
  KeywordEstimatorServiceEstimateResult.JSON_PROPERTY_IMPRESSIONS,
  KeywordEstimatorServiceEstimateResult.JSON_PROPERTY_RANK
})
@JsonTypeName("KeywordEstimatorServiceEstimateResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordEstimatorServiceEstimateResult {
  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Double clicks;

  public static final String JSON_PROPERTY_COST = "cost";
  private Double cost;

  public static final String JSON_PROPERTY_CPC = "cpc";
  private Double cpc;

  public static final String JSON_PROPERTY_CTR = "ctr";
  private Double ctr;

  public static final String JSON_PROPERTY_IMPRESSIONS = "impressions";
  private Double impressions;

  public static final String JSON_PROPERTY_RANK = "rank";
  private Double rank;

  public KeywordEstimatorServiceEstimateResult() { 
  }

  public KeywordEstimatorServiceEstimateResult clicks(Double clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;1日あたりのクリック数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of clicks per day&lt;/div&gt; 
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">1日あたりのクリック数です。</div> <div lang=\"en\">Number of clicks per day</div> ")
  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getClicks() {
    return clicks;
  }


  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClicks(Double clicks) {
    this.clicks = clicks;
  }


  public KeywordEstimatorServiceEstimateResult cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;1日あたりの推定合計費用です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total amount of CPC cost per day&lt;/div&gt; 
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">1日あたりの推定合計費用です。</div> <div lang=\"en\">Total amount of CPC cost per day</div> ")
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCost(Double cost) {
    this.cost = cost;
  }


  public KeywordEstimatorServiceEstimateResult cpc(Double cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;推定平均クリック単価です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Assumed average CPC&lt;/div&gt; 
   * @return cpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">推定平均クリック単価です。</div> <div lang=\"en\">Assumed average CPC</div> ")
  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCpc() {
    return cpc;
  }


  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpc(Double cpc) {
    this.cpc = cpc;
  }


  public KeywordEstimatorServiceEstimateResult ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;推定CTRです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Estimation of CTR.&lt;/div&gt; 
   * @return ctr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">推定CTRです。</div> <div lang=\"en\">Estimation of CTR.</div> ")
  @JsonProperty(JSON_PROPERTY_CTR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCtr() {
    return ctr;
  }


  @JsonProperty(JSON_PROPERTY_CTR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public KeywordEstimatorServiceEstimateResult impressions(Double impressions) {
    
    this.impressions = impressions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;1日当たりの推定インプレッション数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Estimation of impression per day.&lt;/div&gt; 
   * @return impressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">1日当たりの推定インプレッション数です。</div> <div lang=\"en\">Estimation of impression per day.</div> ")
  @JsonProperty(JSON_PROPERTY_IMPRESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getImpressions() {
    return impressions;
  }


  @JsonProperty(JSON_PROPERTY_IMPRESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpressions(Double impressions) {
    this.impressions = impressions;
  }


  public KeywordEstimatorServiceEstimateResult rank(Double rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;推定平均掲載順位です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Assumed average display rank&lt;/div&gt; 
   * @return rank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">推定平均掲載順位です。</div> <div lang=\"en\">Assumed average display rank</div> ")
  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRank() {
    return rank;
  }


  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRank(Double rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceEstimateResult keywordEstimatorServiceEstimateResult = (KeywordEstimatorServiceEstimateResult) o;
    return Objects.equals(this.clicks, keywordEstimatorServiceEstimateResult.clicks) &&
        Objects.equals(this.cost, keywordEstimatorServiceEstimateResult.cost) &&
        Objects.equals(this.cpc, keywordEstimatorServiceEstimateResult.cpc) &&
        Objects.equals(this.ctr, keywordEstimatorServiceEstimateResult.ctr) &&
        Objects.equals(this.impressions, keywordEstimatorServiceEstimateResult.impressions) &&
        Objects.equals(this.rank, keywordEstimatorServiceEstimateResult.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clicks, cost, cpc, ctr, impressions, rank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceEstimateResult {\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

