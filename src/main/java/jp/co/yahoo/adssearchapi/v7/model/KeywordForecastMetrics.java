package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetrics オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetrics object contains the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetrics オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetrics object contains the estimate request.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordForecastMetrics   {
  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("impressions")
  private Double impressions = null;

  @JsonProperty("ctr")
  private Double ctr = null;

  @JsonProperty("averageCpc")
  private Double averageCpc = null;

  @JsonProperty("clicks")
  private Double clicks = null;

  @JsonProperty("cost")
  private Double cost = null;

  public KeywordForecastMetrics keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords.</div> 
   * @return keyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords.</div> ")


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public KeywordForecastMetrics impressions(Double impressions) {
    this.impressions = impressions;
    return this;
  }

  /**
   * <div lang=\"ja\">インプレッション数です。</div> <div lang=\"en\">Number of impression.</div> 
   * @return impressions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">インプレッション数です。</div> <div lang=\"en\">Number of impression.</div> ")


  public Double getImpressions() {
    return impressions;
  }

  public void setImpressions(Double impressions) {
    this.impressions = impressions;
  }

  public KeywordForecastMetrics ctr(Double ctr) {
    this.ctr = ctr;
    return this;
  }

  /**
   * <div lang=\"ja\">クリック率です。</div> <div lang=\"en\">Click rate.</div> 
   * @return ctr
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クリック率です。</div> <div lang=\"en\">Click rate.</div> ")


  public Double getCtr() {
    return ctr;
  }

  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }

  public KeywordForecastMetrics averageCpc(Double averageCpc) {
    this.averageCpc = averageCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">平均CPCです。</div> <div lang=\"en\">Average CPC.</div> 
   * @return averageCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">平均CPCです。</div> <div lang=\"en\">Average CPC.</div> ")


  public Double getAverageCpc() {
    return averageCpc;
  }

  public void setAverageCpc(Double averageCpc) {
    this.averageCpc = averageCpc;
  }

  public KeywordForecastMetrics clicks(Double clicks) {
    this.clicks = clicks;
    return this;
  }

  /**
   * <div lang=\"ja\">クリック数です。</div> <div lang=\"en\">Number of click.</div> 
   * @return clicks
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クリック数です。</div> <div lang=\"en\">Number of click.</div> ")


  public Double getClicks() {
    return clicks;
  }

  public void setClicks(Double clicks) {
    this.clicks = clicks;
  }

  public KeywordForecastMetrics cost(Double cost) {
    this.cost = cost;
    return this;
  }

  /**
   * <div lang=\"ja\">コストです。</div> <div lang=\"en\">Cost.</div> 
   * @return cost
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コストです。</div> <div lang=\"en\">Cost.</div> ")


  public Double getCost() {
    return cost;
  }

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

