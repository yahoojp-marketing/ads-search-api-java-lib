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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaオブジェクトは、提案結果のキーワードを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;A container of keywords related to specified keyword.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaオブジェクトは、提案結果のキーワードを格納するコンテナです。</div> <div lang=\"en\">A container of keywords related to specified keyword.</div> ")

public class KeywordPlanIdea   {
  @JsonProperty("text")
  private JsonNullable<String> text = JsonNullable.undefined();

  public KeywordPlanIdea text(String text) {
    this.text = JsonNullable.of(text);
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keyword</div> 
   * @return text
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keyword</div> ")


  public JsonNullable<String> getText() {
    return text;
  }

  public void setText(JsonNullable<String> text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordPlanIdea keywordPlanIdea = (KeywordPlanIdea) o;
    return Objects.equals(this.text, keywordPlanIdea.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdea {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

