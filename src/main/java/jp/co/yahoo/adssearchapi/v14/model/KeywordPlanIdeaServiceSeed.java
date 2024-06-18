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
import jp.co.yahoo.adssearchapi.v14.model.KeywordPlanIdeaServiceKeywordAndUrlSeed;
import jp.co.yahoo.adssearchapi.v14.model.KeywordPlanIdeaServiceKeywordSeed;
import jp.co.yahoo.adssearchapi.v14.model.KeywordPlanIdeaServiceSeedType;
import jp.co.yahoo.adssearchapi.v14.model.KeywordPlanIdeaServiceSiteSeed;
import jp.co.yahoo.adssearchapi.v14.model.KeywordPlanIdeaServiceUrlSeed;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceSeedオブジェクトは、キーワード候補作成条件の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceSeed object describes detailed information about related keywords creation conditions.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  KeywordPlanIdeaServiceSeed.JSON_PROPERTY_KEYWORD_AND_URL_SEED,
  KeywordPlanIdeaServiceSeed.JSON_PROPERTY_KEYWORD_SEED,
  KeywordPlanIdeaServiceSeed.JSON_PROPERTY_URL_SEED,
  KeywordPlanIdeaServiceSeed.JSON_PROPERTY_SITE_SEED,
  KeywordPlanIdeaServiceSeed.JSON_PROPERTY_SEED_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordPlanIdeaServiceSeed {
  public static final String JSON_PROPERTY_KEYWORD_AND_URL_SEED = "keywordAndUrlSeed";
  private KeywordPlanIdeaServiceKeywordAndUrlSeed keywordAndUrlSeed;

  public static final String JSON_PROPERTY_KEYWORD_SEED = "keywordSeed";
  private KeywordPlanIdeaServiceKeywordSeed keywordSeed;

  public static final String JSON_PROPERTY_URL_SEED = "urlSeed";
  private KeywordPlanIdeaServiceUrlSeed urlSeed;

  public static final String JSON_PROPERTY_SITE_SEED = "siteSeed";
  private KeywordPlanIdeaServiceSiteSeed siteSeed;

  public static final String JSON_PROPERTY_SEED_TYPE = "seedType";
  private KeywordPlanIdeaServiceSeedType seedType;

  public KeywordPlanIdeaServiceSeed() {
  }

  public KeywordPlanIdeaServiceSeed keywordAndUrlSeed(KeywordPlanIdeaServiceKeywordAndUrlSeed keywordAndUrlSeed) {
    
    this.keywordAndUrlSeed = keywordAndUrlSeed;
    return this;
  }

   /**
   * Get keywordAndUrlSeed
   * @return keywordAndUrlSeed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD_AND_URL_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeywordPlanIdeaServiceKeywordAndUrlSeed getKeywordAndUrlSeed() {
    return keywordAndUrlSeed;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_AND_URL_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordAndUrlSeed(KeywordPlanIdeaServiceKeywordAndUrlSeed keywordAndUrlSeed) {
    this.keywordAndUrlSeed = keywordAndUrlSeed;
  }


  public KeywordPlanIdeaServiceSeed keywordSeed(KeywordPlanIdeaServiceKeywordSeed keywordSeed) {
    
    this.keywordSeed = keywordSeed;
    return this;
  }

   /**
   * Get keywordSeed
   * @return keywordSeed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeywordPlanIdeaServiceKeywordSeed getKeywordSeed() {
    return keywordSeed;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordSeed(KeywordPlanIdeaServiceKeywordSeed keywordSeed) {
    this.keywordSeed = keywordSeed;
  }


  public KeywordPlanIdeaServiceSeed urlSeed(KeywordPlanIdeaServiceUrlSeed urlSeed) {
    
    this.urlSeed = urlSeed;
    return this;
  }

   /**
   * Get urlSeed
   * @return urlSeed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeywordPlanIdeaServiceUrlSeed getUrlSeed() {
    return urlSeed;
  }


  @JsonProperty(JSON_PROPERTY_URL_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlSeed(KeywordPlanIdeaServiceUrlSeed urlSeed) {
    this.urlSeed = urlSeed;
  }


  public KeywordPlanIdeaServiceSeed siteSeed(KeywordPlanIdeaServiceSiteSeed siteSeed) {
    
    this.siteSeed = siteSeed;
    return this;
  }

   /**
   * Get siteSeed
   * @return siteSeed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SITE_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeywordPlanIdeaServiceSiteSeed getSiteSeed() {
    return siteSeed;
  }


  @JsonProperty(JSON_PROPERTY_SITE_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSiteSeed(KeywordPlanIdeaServiceSiteSeed siteSeed) {
    this.siteSeed = siteSeed;
  }


  public KeywordPlanIdeaServiceSeed seedType(KeywordPlanIdeaServiceSeedType seedType) {
    
    this.seedType = seedType;
    return this;
  }

   /**
   * Get seedType
   * @return seedType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEED_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeywordPlanIdeaServiceSeedType getSeedType() {
    return seedType;
  }


  @JsonProperty(JSON_PROPERTY_SEED_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeedType(KeywordPlanIdeaServiceSeedType seedType) {
    this.seedType = seedType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordPlanIdeaServiceSeed keywordPlanIdeaServiceSeed = (KeywordPlanIdeaServiceSeed) o;
    return Objects.equals(this.keywordAndUrlSeed, keywordPlanIdeaServiceSeed.keywordAndUrlSeed) &&
        Objects.equals(this.keywordSeed, keywordPlanIdeaServiceSeed.keywordSeed) &&
        Objects.equals(this.urlSeed, keywordPlanIdeaServiceSeed.urlSeed) &&
        Objects.equals(this.siteSeed, keywordPlanIdeaServiceSeed.siteSeed) &&
        Objects.equals(this.seedType, keywordPlanIdeaServiceSeed.seedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordAndUrlSeed, keywordSeed, urlSeed, siteSeed, seedType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdeaServiceSeed {\n");
    sb.append("    keywordAndUrlSeed: ").append(toIndentedString(keywordAndUrlSeed)).append("\n");
    sb.append("    keywordSeed: ").append(toIndentedString(keywordSeed)).append("\n");
    sb.append("    urlSeed: ").append(toIndentedString(urlSeed)).append("\n");
    sb.append("    siteSeed: ").append(toIndentedString(siteSeed)).append("\n");
    sb.append("    seedType: ").append(toIndentedString(seedType)).append("\n");
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

