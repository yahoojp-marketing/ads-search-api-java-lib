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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceTagは、サイトリターゲティングのタグを保持するオブジェクトです。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceTag is an object that holds tag of Site Retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceTagは、サイトリターゲティングのタグを保持するオブジェクトです。</div><div lang=\"en\">RetargetingListServiceTag is an object that holds tag of Site Retargeting.</div> ")

public class RetargetingListServiceTag   {
  @JsonProperty("snippet")
  private JsonNullable<String> snippet = JsonNullable.undefined();

  @JsonProperty("advancedSnippet")
  private JsonNullable<String> advancedSnippet = JsonNullable.undefined();

  public RetargetingListServiceTag snippet(String snippet) {
    this.snippet = JsonNullable.of(snippet);
    return this;
  }

  /**
   * <div lang=\"ja\">サイトリターゲティングのタグです。</div> <div lang=\"en\">RetargetingListServiceTag of Site Retargeting.</div> 
   * @return snippet
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サイトリターゲティングのタグです。</div> <div lang=\"en\">RetargetingListServiceTag of Site Retargeting.</div> ")


  public JsonNullable<String> getSnippet() {
    return snippet;
  }

  public void setSnippet(JsonNullable<String> snippet) {
    this.snippet = snippet;
  }

  public RetargetingListServiceTag advancedSnippet(String advancedSnippet) {
    this.advancedSnippet = JsonNullable.of(advancedSnippet);
    return this;
  }

  /**
   * <div lang=\"ja\">リニューアル版のサイトリターゲティングタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットのタグです。 <br/> 詳細は[ヘルプ](https://support-marketing.yahoo.co.jp/promotionalads/ss/articledetail?lan=ja&aid=7460)を参照</div> <div lang=\"en\">The new format of site retargeting tag avoids the impacts such as changes made to the browser. <br/> [Help Page](https://support-marketing.yahoo.co.jp/promotionalads/ss/articledetail?lan=en&aid=6133)</div> 
   * @return advancedSnippet
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リニューアル版のサイトリターゲティングタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットのタグです。 <br/> 詳細は[ヘルプ](https://support-marketing.yahoo.co.jp/promotionalads/ss/articledetail?lan=ja&aid=7460)を参照</div> <div lang=\"en\">The new format of site retargeting tag avoids the impacts such as changes made to the browser. <br/> [Help Page](https://support-marketing.yahoo.co.jp/promotionalads/ss/articledetail?lan=en&aid=6133)</div> ")


  public JsonNullable<String> getAdvancedSnippet() {
    return advancedSnippet;
  }

  public void setAdvancedSnippet(JsonNullable<String> advancedSnippet) {
    this.advancedSnippet = advancedSnippet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceTag retargetingListServiceTag = (RetargetingListServiceTag) o;
    return Objects.equals(this.snippet, retargetingListServiceTag.snippet) &&
        Objects.equals(this.advancedSnippet, retargetingListServiceTag.advancedSnippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snippet, advancedSnippet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceTag {\n");
    
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    advancedSnippet: ").append(toIndentedString(advancedSnippet)).append("\n");
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

