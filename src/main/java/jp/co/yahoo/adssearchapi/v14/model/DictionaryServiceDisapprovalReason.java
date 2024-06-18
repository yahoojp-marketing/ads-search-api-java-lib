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
import jp.co.yahoo.adssearchapi.v14.model.DictionaryServiceLang;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceDisapprovalReason オブジェクトは、 EditorialReason一覧を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceDisapprovalReason object is a container which stored the Description of disapproval reason and the Recommended solution.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  DictionaryServiceDisapprovalReason.JSON_PROPERTY_DESCRIPTION,
  DictionaryServiceDisapprovalReason.JSON_PROPERTY_DISAPPROVAL_REASON_CODE,
  DictionaryServiceDisapprovalReason.JSON_PROPERTY_LANG,
  DictionaryServiceDisapprovalReason.JSON_PROPERTY_RECOMMENDATION,
  DictionaryServiceDisapprovalReason.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceDisapprovalReason {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODE = "disapprovalReasonCode";
  private String disapprovalReasonCode;

  public static final String JSON_PROPERTY_LANG = "lang";
  private DictionaryServiceLang lang;

  public static final String JSON_PROPERTY_RECOMMENDATION = "recommendation";
  private String recommendation;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public DictionaryServiceDisapprovalReason() {
  }

  public DictionaryServiceDisapprovalReason description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由の内容です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description of disapproval reason.&lt;/div&gt; 
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public DictionaryServiceDisapprovalReason disapprovalReasonCode(String disapprovalReasonCode) {
    
    this.disapprovalReasonCode = disapprovalReasonCode;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査コードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Editorial code.&lt;/div&gt; 
   * @return disapprovalReasonCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisapprovalReasonCode() {
    return disapprovalReasonCode;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReasonCode(String disapprovalReasonCode) {
    this.disapprovalReasonCode = disapprovalReasonCode;
  }


  public DictionaryServiceDisapprovalReason lang(DictionaryServiceLang lang) {
    
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DictionaryServiceLang getLang() {
    return lang;
  }


  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLang(DictionaryServiceLang lang) {
    this.lang = lang;
  }


  public DictionaryServiceDisapprovalReason recommendation(String recommendation) {
    
    this.recommendation = recommendation;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;推奨する対応方法です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Recommended solution.&lt;/div&gt; 
   * @return recommendation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecommendation() {
    return recommendation;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }


  public DictionaryServiceDisapprovalReason title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由のタイトルです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Title of disapproval reason.&lt;/div&gt; 
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceDisapprovalReason dictionaryServiceDisapprovalReason = (DictionaryServiceDisapprovalReason) o;
    return Objects.equals(this.description, dictionaryServiceDisapprovalReason.description) &&
        Objects.equals(this.disapprovalReasonCode, dictionaryServiceDisapprovalReason.disapprovalReasonCode) &&
        Objects.equals(this.lang, dictionaryServiceDisapprovalReason.lang) &&
        Objects.equals(this.recommendation, dictionaryServiceDisapprovalReason.recommendation) &&
        Objects.equals(this.title, dictionaryServiceDisapprovalReason.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, disapprovalReasonCode, lang, recommendation, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceDisapprovalReason {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disapprovalReasonCode: ").append(toIndentedString(disapprovalReasonCode)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

