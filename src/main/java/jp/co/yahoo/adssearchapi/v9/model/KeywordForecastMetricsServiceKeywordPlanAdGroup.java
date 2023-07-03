/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v9.model.KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanAdGroup オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanAdGroup object is a container for the estimate request.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  KeywordForecastMetricsServiceKeywordPlanAdGroup.JSON_PROPERTY_CPC,
  KeywordForecastMetricsServiceKeywordPlanAdGroup.JSON_PROPERTY_KEYWORD_PLAN_AD_GROUP_KEYWORDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordForecastMetricsServiceKeywordPlanAdGroup {
  public static final String JSON_PROPERTY_CPC = "cpc";
  private Long cpc;

  public static final String JSON_PROPERTY_KEYWORD_PLAN_AD_GROUP_KEYWORDS = "keywordPlanAdGroupKeywords";
  private List<KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword> keywordPlanAdGroupKeywords;

  public KeywordForecastMetricsServiceKeywordPlanAdGroup() {
  }

  public KeywordForecastMetricsServiceKeywordPlanAdGroup cpc(Long cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最大クリック単価です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum CPC.&lt;/div&gt; 
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


  public KeywordForecastMetricsServiceKeywordPlanAdGroup keywordPlanAdGroupKeywords(List<KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword> keywordPlanAdGroupKeywords) {
    
    this.keywordPlanAdGroupKeywords = keywordPlanAdGroupKeywords;
    return this;
  }

  public KeywordForecastMetricsServiceKeywordPlanAdGroup addKeywordPlanAdGroupKeywordsItem(KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword keywordPlanAdGroupKeywordsItem) {
    if (this.keywordPlanAdGroupKeywords == null) {
      this.keywordPlanAdGroupKeywords = new ArrayList<>();
    }
    this.keywordPlanAdGroupKeywords.add(keywordPlanAdGroupKeywordsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;見積もりを行うキーワードのコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;A container for the keywords to estimate&lt;/div&gt; 
   * @return keywordPlanAdGroupKeywords
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD_PLAN_AD_GROUP_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword> getKeywordPlanAdGroupKeywords() {
    return keywordPlanAdGroupKeywords;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_PLAN_AD_GROUP_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeywordPlanAdGroupKeywords(List<KeywordForecastMetricsServiceKeywordPlanAdGroupKeyword> keywordPlanAdGroupKeywords) {
    this.keywordPlanAdGroupKeywords = keywordPlanAdGroupKeywords;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordForecastMetricsServiceKeywordPlanAdGroup keywordForecastMetricsServiceKeywordPlanAdGroup = (KeywordForecastMetricsServiceKeywordPlanAdGroup) o;
    return Objects.equals(this.cpc, keywordForecastMetricsServiceKeywordPlanAdGroup.cpc) &&
        Objects.equals(this.keywordPlanAdGroupKeywords, keywordForecastMetricsServiceKeywordPlanAdGroup.keywordPlanAdGroupKeywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpc, keywordPlanAdGroupKeywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetricsServiceKeywordPlanAdGroup {\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
    sb.append("    keywordPlanAdGroupKeywords: ").append(toIndentedString(keywordPlanAdGroupKeywords)).append("\n");
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

