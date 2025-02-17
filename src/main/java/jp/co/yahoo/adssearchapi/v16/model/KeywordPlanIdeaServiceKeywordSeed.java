/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceKeywordSeedオブジェクトは、キーワード候補作成条件としてキーワードを指定するオブジェクトです。&lt;br&gt;seedTypeが&lt;code&gt;KEYWORD&lt;/code&gt;の場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceKeywordSeed object is for specifying keywords as related keywords creation conditions.&lt;br&gt;If seedType is &lt;code&gt;KEYWORD&lt;/code&gt;, this field is required.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  KeywordPlanIdeaServiceKeywordSeed.JSON_PROPERTY_KEYWORDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordPlanIdeaServiceKeywordSeed {
  public static final String JSON_PROPERTY_KEYWORDS = "keywords";
  private List<String> keywords;

  public KeywordPlanIdeaServiceKeywordSeed() {
  }

  public KeywordPlanIdeaServiceKeywordSeed keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public KeywordPlanIdeaServiceKeywordSeed addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Keyword.&lt;/div&gt; 
   * @return keywords
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKeywords() {
    return keywords;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordPlanIdeaServiceKeywordSeed keywordPlanIdeaServiceKeywordSeed = (KeywordPlanIdeaServiceKeywordSeed) o;
    return Objects.equals(this.keywords, keywordPlanIdeaServiceKeywordSeed.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdeaServiceKeywordSeed {\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

