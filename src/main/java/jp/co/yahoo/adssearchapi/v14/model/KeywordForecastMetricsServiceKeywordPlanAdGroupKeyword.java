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
import jp.co.yahoo.adssearchapi.v14.model.KeywordForecastMetricsServiceMatchType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword object contains the estimate request.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword.JSON_PROPERTY_TEXT,
  KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword.JSON_PROPERTY_MATCH_TYPE,
  KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword.JSON_PROPERTY_CPC,
  KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword.JSON_PROPERTY_IS_NEGATIVE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword {
  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private KeywordForecastMetricsServiceMatchType matchType;

  public static final String JSON_PROPERTY_CPC = "cpc";
  private Long cpc;

  public static final String JSON_PROPERTY_IS_NEGATIVE = "isNegative";
  private Boolean isNegative;

  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword() {
  }

  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Keyword.&lt;/div&gt; 
   * @return text
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeywordForecastMetricsServiceMatchType getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMatchType(KeywordForecastMetricsServiceMatchType matchType) {
    this.matchType = matchType;
  }


  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword cpc(Long cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最大クリック単価です。&lt;br&gt; isNegativeがTRUEのときにcpcを指定することはできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum CPC.&lt;br&gt; When isNegative is TRUE, CPC cannot be specified.&lt;/div&gt; 
   * @return cpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCpc() {
    return cpc;
  }


  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpc(Long cpc) {
    this.cpc = cpc;
  }


  public KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword isNegative(Boolean isNegative) {
    
    this.isNegative = isNegative;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;除外キーワードです。&lt;br&gt; デフォルト値はfalseです。&lt;br&gt; 除外キーワードのみでのリクエストはできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Refine keyword.&lt;br&gt; The default value will be FALSE.&lt;br&gt; Cannot request with only refine keyword.&lt;/div&gt; 
   * @return isNegative
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_NEGATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsNegative() {
    return isNegative;
  }


  @JsonProperty(JSON_PROPERTY_IS_NEGATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        Objects.equals(this.cpc, keywordForecastMetricsServiceKeywordPlanAdGroupKeyword.cpc) &&
        Objects.equals(this.isNegative, keywordForecastMetricsServiceKeywordPlanAdGroupKeyword.isNegative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, matchType, cpc, isNegative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
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

