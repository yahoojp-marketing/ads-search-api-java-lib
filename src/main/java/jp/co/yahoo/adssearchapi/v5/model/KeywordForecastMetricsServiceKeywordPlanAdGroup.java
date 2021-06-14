package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanAdGroup オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanAdGroup object is a container for the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetricsServiceKeywordPlanAdGroup オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetricsServiceKeywordPlanAdGroup object is a container for the estimate request.</div> ")

public class KeywordForecastMetricsServiceKeywordPlanAdGroup   {
  @JsonProperty("maxCpc")
  private JsonNullable<Long> maxCpc = JsonNullable.undefined();

  @JsonProperty("keywordPlanAdGroupKeywords")
  @Valid
  private JsonNullable<List<KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword>> keywordPlanAdGroupKeywords = JsonNullable.undefined();

  public KeywordForecastMetricsServiceKeywordPlanAdGroup maxCpc(Long maxCpc) {
    this.maxCpc = JsonNullable.of(maxCpc);
    return this;
  }

  /**
   * <div lang=\"ja\">最大クリック単価です。</div> <div lang=\"en\">Maximum CPC.</div> 
   * @return maxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最大クリック単価です。</div> <div lang=\"en\">Maximum CPC.</div> ")


  public JsonNullable<Long> getMaxCpc() {
    return maxCpc;
  }

  public void setMaxCpc(JsonNullable<Long> maxCpc) {
    this.maxCpc = maxCpc;
  }

  public KeywordForecastMetricsServiceKeywordPlanAdGroup keywordPlanAdGroupKeywords(List<KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword> keywordPlanAdGroupKeywords) {
    this.keywordPlanAdGroupKeywords = JsonNullable.of(keywordPlanAdGroupKeywords);
    return this;
  }

  public KeywordForecastMetricsServiceKeywordPlanAdGroup addKeywordPlanAdGroupKeywordsItem(KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword keywordPlanAdGroupKeywordsItem) {
    this.keywordPlanAdGroupKeywords.get().add(keywordPlanAdGroupKeywordsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">見積もりを行うキーワードのコンテナです。</div> <div lang=\"en\">A container for the keywords to estimate</div> 
   * @return keywordPlanAdGroupKeywords
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">見積もりを行うキーワードのコンテナです。</div> <div lang=\"en\">A container for the keywords to estimate</div> ")
  @NotNull

  @Valid

  public JsonNullable<List<KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword>> getKeywordPlanAdGroupKeywords() {
    return keywordPlanAdGroupKeywords;
  }

  public void setKeywordPlanAdGroupKeywords(JsonNullable<List<KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword>> keywordPlanAdGroupKeywords) {
    this.keywordPlanAdGroupKeywords = keywordPlanAdGroupKeywords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordForecastMetricsServiceKeywordPlanAdGroup keywordForecastMetricsServiceKeywordPlanAdGroup = (KeywordForecastMetricsServiceKeywordPlanAdGroup) o;
    return Objects.equals(this.maxCpc, keywordForecastMetricsServiceKeywordPlanAdGroup.maxCpc) &&
        Objects.equals(this.keywordPlanAdGroupKeywords, keywordForecastMetricsServiceKeywordPlanAdGroup.keywordPlanAdGroupKeywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCpc, keywordPlanAdGroupKeywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetricsServiceKeywordPlanAdGroup {\n");
    
    sb.append("    maxCpc: ").append(toIndentedString(maxCpc)).append("\n");
    sb.append("    keywordPlanAdGroupKeywords: ").append(toIndentedString(keywordPlanAdGroupKeywords)).append("\n");
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

