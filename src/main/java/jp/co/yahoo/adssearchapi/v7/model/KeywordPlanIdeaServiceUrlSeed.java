package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceUrlSeedオブジェクトは、キーワード候補作成条件としてURLを指定するオブジェクトです。&lt;br&gt;seedTypeが&lt;code&gt;URL&lt;/code&gt;の場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceUrlSeed object is for specifying URL as related keywords creation conditions.&lt;br&gt;If seedType is &lt;code&gt;URL&lt;/code&gt;, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaServiceUrlSeedオブジェクトは、キーワード候補作成条件としてURLを指定するオブジェクトです。<br>seedTypeが<code>URL</code>の場合は必須です。</div> <div lang=\"en\">KeywordPlanIdeaServiceUrlSeed object is for specifying URL as related keywords creation conditions.<br>If seedType is <code>URL</code>, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordPlanIdeaServiceUrlSeed   {
  @JsonProperty("url")
  private String url = null;

  public KeywordPlanIdeaServiceUrlSeed url(String url) {
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
    KeywordPlanIdeaServiceUrlSeed keywordPlanIdeaServiceUrlSeed = (KeywordPlanIdeaServiceUrlSeed) o;
    return Objects.equals(this.url, keywordPlanIdeaServiceUrlSeed.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdeaServiceUrlSeed {\n");
    
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

