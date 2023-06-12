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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetrics オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetrics object contains the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetrics オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetrics object contains the estimate request.</div> ")
@JsonPropertyOrder({
  KeywordForecastMetrics.JSON_PROPERTY_KEYWORD,
  KeywordForecastMetrics.JSON_PROPERTY_IMPRESSIONS,
  KeywordForecastMetrics.JSON_PROPERTY_CTR,
  KeywordForecastMetrics.JSON_PROPERTY_AVERAGE_CPC,
  KeywordForecastMetrics.JSON_PROPERTY_CLICKS,
  KeywordForecastMetrics.JSON_PROPERTY_COST
})
@JsonTypeName("KeywordForecastMetrics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordForecastMetrics {
  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private String keyword;

  public static final String JSON_PROPERTY_IMPRESSIONS = "impressions";
  private Double impressions;

  public static final String JSON_PROPERTY_CTR = "ctr";
  private Double ctr;

  public static final String JSON_PROPERTY_AVERAGE_CPC = "averageCpc";
  private Double averageCpc;

  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Double clicks;

  public static final String JSON_PROPERTY_COST = "cost";
  private Double cost;

  public KeywordForecastMetrics() { 
  }

  public KeywordForecastMetrics keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Keywords.&lt;/div&gt; 
   * @return keyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords.</div> ")
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyword() {
    return keyword;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public KeywordForecastMetrics impressions(Double impressions) {
    
    this.impressions = impressions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;インプレッション数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of impression.&lt;/div&gt; 
   * @return impressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッション数です。</div> <div lang=\"en\">Number of impression.</div> ")
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


  public KeywordForecastMetrics ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クリック率です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Click rate.&lt;/div&gt; 
   * @return ctr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">クリック率です。</div> <div lang=\"en\">Click rate.</div> ")
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


  public KeywordForecastMetrics averageCpc(Double averageCpc) {
    
    this.averageCpc = averageCpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;平均CPCです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Average CPC.&lt;/div&gt; 
   * @return averageCpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">平均CPCです。</div> <div lang=\"en\">Average CPC.</div> ")
  @JsonProperty(JSON_PROPERTY_AVERAGE_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageCpc() {
    return averageCpc;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageCpc(Double averageCpc) {
    this.averageCpc = averageCpc;
  }


  public KeywordForecastMetrics clicks(Double clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クリック数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of click.&lt;/div&gt; 
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">クリック数です。</div> <div lang=\"en\">Number of click.</div> ")
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


  public KeywordForecastMetrics cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コストです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Cost.&lt;/div&gt; 
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コストです。</div> <div lang=\"en\">Cost.</div> ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordForecastMetrics keywordForecastMetrics = (KeywordForecastMetrics) o;
    return Objects.equals(this.keyword, keywordForecastMetrics.keyword) &&
        Objects.equals(this.impressions, keywordForecastMetrics.impressions) &&
        Objects.equals(this.ctr, keywordForecastMetrics.ctr) &&
        Objects.equals(this.averageCpc, keywordForecastMetrics.averageCpc) &&
        Objects.equals(this.clicks, keywordForecastMetrics.clicks) &&
        Objects.equals(this.cost, keywordForecastMetrics.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, impressions, ctr, averageCpc, clicks, cost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetrics {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    averageCpc: ").append(toIndentedString(averageCpc)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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

