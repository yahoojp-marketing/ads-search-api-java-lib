package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceUrlSeedオブジェクトは、キーワード候補作成条件としてURLを指定するオブジェクトです。&lt;br&gt;seedTypeが&lt;code&gt;URL&lt;/code&gt;の場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceUrlSeed object is for specifying URL as related keywords creation conditions.&lt;br&gt;If seedType is &lt;code&gt;URL&lt;/code&gt;, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaServiceUrlSeedオブジェクトは、キーワード候補作成条件としてURLを指定するオブジェクトです。<br>seedTypeが<code>URL</code>の場合は必須です。</div> <div lang=\"en\">KeywordPlanIdeaServiceUrlSeed object is for specifying URL as related keywords creation conditions.<br>If seedType is <code>URL</code>, this field is required.</div> ")

public class KeywordPlanIdeaServiceUrlSeed   {
  @JsonProperty("url")
  private JsonNullable<String> url = JsonNullable.undefined();

  public KeywordPlanIdeaServiceUrlSeed url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * <div lang=\"ja\">URLです。</div> <div lang=\"en\">URL.</div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\">URLです。</div> <div lang=\"en\">URL.</div> ")


  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

