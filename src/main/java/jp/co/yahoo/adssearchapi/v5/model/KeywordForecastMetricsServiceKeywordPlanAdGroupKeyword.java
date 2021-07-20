package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.KeywordForecastMetricsServiceMatchType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword object contains the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword object contains the estimate request.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("matchType")
  private KeywordForecastMetricsServiceMatchType matchType = null;

  @JsonProperty("maxCpc")
  private Long maxCpc = null;

  @JsonProperty("isNegative")
  private Boolean isNegative = null;

  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword text(String text) {
    this.text = text;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keyword</div> 
   * @return text
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keyword</div> ")
  @NotNull


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword matchType(KeywordForecastMetricsServiceMatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * Get matchType
   * @return matchType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public KeywordForecastMetricsServiceMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(KeywordForecastMetricsServiceMatchType matchType) {
    this.matchType = matchType;
  }

  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword maxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">最大クリック単価です。<br> isNegativeがTRUEのときにmaxCpcを指定することはできません。</div> <div lang=\"en\">Maximum CPC.<br> When isNegative is TRUE, maxCPC cannot be specified.</div> 
   * @return maxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最大クリック単価です。<br> isNegativeがTRUEのときにmaxCpcを指定することはできません。</div> <div lang=\"en\">Maximum CPC.<br> When isNegative is TRUE, maxCPC cannot be specified.</div> ")


  public Long getMaxCpc() {
    return maxCpc;
  }

  public void setMaxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
  }

  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword isNegative(Boolean isNegative) {
    this.isNegative = isNegative;
    return this;
  }

  /**
   * <div lang=\"ja\">除外キーワードです。<br> デフォルト値はfalseです。<br> 除外キーワードのみでのリクエストはできません。</div> <div lang=\"en\">Refine keyword.<br> The default value will be FALSE.<br> Cannot request with only refine keyword.</div> 
   * @return isNegative
  */
  @ApiModelProperty(value = "<div lang=\"ja\">除外キーワードです。<br> デフォルト値はfalseです。<br> 除外キーワードのみでのリクエストはできません。</div> <div lang=\"en\">Refine keyword.<br> The default value will be FALSE.<br> Cannot request with only refine keyword.</div> ")


  public Boolean getIsNegative() {
    return isNegative;
  }

  public void setIsNegative(Boolean isNegative) {
    this.isNegative = isNegative;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword keywordForecastMetricsServiceKeywordPlanAdGroupKeyword = (KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword) o;
    return Objects.equals(this.text, keywordForecastMetricsServiceKeywordPlanAdGroupKeyword.text) &&
        Objects.equals(this.matchType, keywordForecastMetricsServiceKeywordPlanAdGroupKeyword.matchType) &&
        Objects.equals(this.maxCpc, keywordForecastMetricsServiceKeywordPlanAdGroupKeyword.maxCpc) &&
        Objects.equals(this.isNegative, keywordForecastMetricsServiceKeywordPlanAdGroupKeyword.isNegative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, matchType, maxCpc, isNegative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    maxCpc: ").append(toIndentedString(maxCpc)).append("\n");
    sb.append("    isNegative: ").append(toIndentedString(isNegative)).append("\n");
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

