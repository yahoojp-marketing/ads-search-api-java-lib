package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordEstimatorServiceEstimateResult オブジェクトは、見積もりリクエストを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;EstimateKeyword object is a container for the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordEstimatorServiceEstimateResult オブジェクトは、見積もりリクエストを格納するコンテナです。</div> <div lang=\"en\">EstimateKeyword object is a container for the estimate request.</div> ")

public class KeywordEstimatorServiceEstimateResult   {
  @JsonProperty("clicks")
  private JsonNullable<Double> clicks = JsonNullable.undefined();

  @JsonProperty("cost")
  private JsonNullable<Double> cost = JsonNullable.undefined();

  @JsonProperty("cpc")
  private JsonNullable<Double> cpc = JsonNullable.undefined();

  @JsonProperty("ctr")
  private JsonNullable<Double> ctr = JsonNullable.undefined();

  @JsonProperty("impressions")
  private JsonNullable<Double> impressions = JsonNullable.undefined();

  @JsonProperty("rank")
  private JsonNullable<Double> rank = JsonNullable.undefined();

  public KeywordEstimatorServiceEstimateResult clicks(Double clicks) {
    this.clicks = JsonNullable.of(clicks);
    return this;
  }

  /**
   * <div lang=\"ja\">1日あたりのクリック数です。</div> <div lang=\"en\">Number of clicks per day</div> 
   * @return clicks
  */
  @ApiModelProperty(value = "<div lang=\"ja\">1日あたりのクリック数です。</div> <div lang=\"en\">Number of clicks per day</div> ")


  public JsonNullable<Double> getClicks() {
    return clicks;
  }

  public void setClicks(JsonNullable<Double> clicks) {
    this.clicks = clicks;
  }

  public KeywordEstimatorServiceEstimateResult cost(Double cost) {
    this.cost = JsonNullable.of(cost);
    return this;
  }

  /**
   * <div lang=\"ja\">1日あたりの推定合計費用です。</div> <div lang=\"en\">Total amount of CPC cost per day</div> 
   * @return cost
  */
  @ApiModelProperty(value = "<div lang=\"ja\">1日あたりの推定合計費用です。</div> <div lang=\"en\">Total amount of CPC cost per day</div> ")


  public JsonNullable<Double> getCost() {
    return cost;
  }

  public void setCost(JsonNullable<Double> cost) {
    this.cost = cost;
  }

  public KeywordEstimatorServiceEstimateResult cpc(Double cpc) {
    this.cpc = JsonNullable.of(cpc);
    return this;
  }

  /**
   * <div lang=\"ja\">推定平均クリック単価です。</div> <div lang=\"en\">Assumed average CPC</div> 
   * @return cpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">推定平均クリック単価です。</div> <div lang=\"en\">Assumed average CPC</div> ")


  public JsonNullable<Double> getCpc() {
    return cpc;
  }

  public void setCpc(JsonNullable<Double> cpc) {
    this.cpc = cpc;
  }

  public KeywordEstimatorServiceEstimateResult ctr(Double ctr) {
    this.ctr = JsonNullable.of(ctr);
    return this;
  }

  /**
   * <div lang=\"ja\">推定CTRです。</div> <div lang=\"en\">Estimation of CTR.</div> 
   * @return ctr
  */
  @ApiModelProperty(value = "<div lang=\"ja\">推定CTRです。</div> <div lang=\"en\">Estimation of CTR.</div> ")


  public JsonNullable<Double> getCtr() {
    return ctr;
  }

  public void setCtr(JsonNullable<Double> ctr) {
    this.ctr = ctr;
  }

  public KeywordEstimatorServiceEstimateResult impressions(Double impressions) {
    this.impressions = JsonNullable.of(impressions);
    return this;
  }

  /**
   * <div lang=\"ja\">1日当たりの推定インプレッション数です。</div> <div lang=\"en\">Estimation of impression per day.</div> 
   * @return impressions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">1日当たりの推定インプレッション数です。</div> <div lang=\"en\">Estimation of impression per day.</div> ")


  public JsonNullable<Double> getImpressions() {
    return impressions;
  }

  public void setImpressions(JsonNullable<Double> impressions) {
    this.impressions = impressions;
  }

  public KeywordEstimatorServiceEstimateResult rank(Double rank) {
    this.rank = JsonNullable.of(rank);
    return this;
  }

  /**
   * <div lang=\"ja\">推定平均掲載順位です。</div> <div lang=\"en\">Assumed average display rank</div> 
   * @return rank
  */
  @ApiModelProperty(value = "<div lang=\"ja\">推定平均掲載順位です。</div> <div lang=\"en\">Assumed average display rank</div> ")


  public JsonNullable<Double> getRank() {
    return rank;
  }

  public void setRank(JsonNullable<Double> rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

