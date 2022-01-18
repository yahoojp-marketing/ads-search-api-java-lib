package jp.co.yahoo.adssearchapi.v7.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceKeywordSeedオブジェクトは、キーワード候補作成条件としてキーワードを指定するオブジェクトです。&lt;br&gt;seedTypeが&lt;code&gt;KEYWORD&lt;/code&gt;の場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceKeywordSeed object is for specifying keywords as related keywords creation conditions.&lt;br&gt;If seedType is &lt;code&gt;KEYWORD&lt;/code&gt;, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaServiceKeywordSeedオブジェクトは、キーワード候補作成条件としてキーワードを指定するオブジェクトです。<br>seedTypeが<code>KEYWORD</code>の場合は必須です。</div> <div lang=\"en\">KeywordPlanIdeaServiceKeywordSeed object is for specifying keywords as related keywords creation conditions.<br>If seedType is <code>KEYWORD</code>, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordPlanIdeaServiceKeywordSeed   {
  @JsonProperty("keywords")
  @Valid
  private List<String> keywords = null;

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

