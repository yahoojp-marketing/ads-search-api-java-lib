package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceTagは、サイトリターゲティングのタグを保持するオブジェクトです。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceTag is an object that holds tag of Site Retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceTagは、サイトリターゲティングのタグを保持するオブジェクトです。</div><div lang=\"en\">RetargetingListServiceTag is an object that holds tag of Site Retargeting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceTag   {
  @JsonProperty("snippet")
  private String snippet = null;

  @JsonProperty("advancedSnippet")
  private String advancedSnippet = null;

  public RetargetingListServiceTag snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * <div lang=\"ja\">サイトリターゲティングのタグです。</div> <div lang=\"en\">RetargetingListServiceTag of Site Retargeting.</div> 
   * @return snippet
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サイトリターゲティングのタグです。</div> <div lang=\"en\">RetargetingListServiceTag of Site Retargeting.</div> ")


  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }

  public RetargetingListServiceTag advancedSnippet(String advancedSnippet) {
    this.advancedSnippet = advancedSnippet;
    return this;
  }

  /**
   * <div lang=\"ja\">   リニューアル版のサイトリターゲティングタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットのタグです。 <br/>   詳細は以下のヘルプを参照してください。<br>   ・<a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=ja&aid=7460\">サイトリターゲティング用タグの取得とサイトへの設置</a> </div> <div lang=\"en\">   The new format of site retargeting tag avoids the impacts such as changes made to the browser. <br/>   See also the help below.<br>   * <a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=en&aid=6133\">Acquire Site Retargeting Tag and Tagging on Site</a> </div> 
   * @return advancedSnippet
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   リニューアル版のサイトリターゲティングタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットのタグです。 <br/>   詳細は以下のヘルプを参照してください。<br>   ・<a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=ja&aid=7460\">サイトリターゲティング用タグの取得とサイトへの設置</a> </div> <div lang=\"en\">   The new format of site retargeting tag avoids the impacts such as changes made to the browser. <br/>   See also the help below.<br>   * <a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=en&aid=6133\">Acquire Site Retargeting Tag and Tagging on Site</a> </div> ")


  public String getAdvancedSnippet() {
    return advancedSnippet;
  }

  public void setAdvancedSnippet(String advancedSnippet) {
    this.advancedSnippet = advancedSnippet;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

