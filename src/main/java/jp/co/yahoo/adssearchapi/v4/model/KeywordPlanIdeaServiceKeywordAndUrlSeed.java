package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceKeywordAndUrlSeedオブジェクトは、キーワード候補作成条件としてキーワードとURLを指定するオブジェクトです。&lt;br&gt;seedTypeが&lt;code&gt;KEYWORD_AND_URL&lt;/code&gt;の場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceKeywordAndUrlSeed object is for specifying keywords and URL as related keywords creation conditions.&lt;br&gt;If seedType is &lt;code&gt;KEYWORD_AND_URL&lt;/code&gt;, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaServiceKeywordAndUrlSeedオブジェクトは、キーワード候補作成条件としてキーワードとURLを指定するオブジェクトです。<br>seedTypeが<code>KEYWORD_AND_URL</code>の場合は必須です。</div> <div lang=\"en\">KeywordPlanIdeaServiceKeywordAndUrlSeed object is for specifying keywords and URL as related keywords creation conditions.<br>If seedType is <code>KEYWORD_AND_URL</code>, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordPlanIdeaServiceKeywordAndUrlSeed   {
  @JsonProperty("keywords")
  @Valid
  private List<String> keywords = null;

  @JsonProperty("url")
  private String url = null;

  public KeywordPlanIdeaServiceKeywordAndUrlSeed keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public KeywordPlanIdeaServiceKeywordAndUrlSeed addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keyword.</div> 
   * @return keywords
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keyword.</div> ")


  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public KeywordPlanIdeaServiceKeywordAndUrlSeed url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\">URLです。</div> <div lang=\"en\">URL.</div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\">URLです。</div> <div lang=\"en\">URL.</div> ")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordPlanIdeaServiceKeywordAndUrlSeed keywordPlanIdeaServiceKeywordAndUrlSeed = (KeywordPlanIdeaServiceKeywordAndUrlSeed) o;
    return Objects.equals(this.keywords, keywordPlanIdeaServiceKeywordAndUrlSeed.keywords) &&
        Objects.equals(this.url, keywordPlanIdeaServiceKeywordAndUrlSeed.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdeaServiceKeywordAndUrlSeed {\n");
    
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

