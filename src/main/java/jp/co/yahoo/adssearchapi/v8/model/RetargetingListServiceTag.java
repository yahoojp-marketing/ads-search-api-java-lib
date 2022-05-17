/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceTagは、サイトリターゲティングのタグを保持するオブジェクトです。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceTag is an object that holds tag of Site Retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceTagは、サイトリターゲティングのタグを保持するオブジェクトです。</div><div lang=\"en\">RetargetingListServiceTag is an object that holds tag of Site Retargeting.</div> ")
@JsonPropertyOrder({
  RetargetingListServiceTag.JSON_PROPERTY_SNIPPET,
  RetargetingListServiceTag.JSON_PROPERTY_ADVANCED_SNIPPET
})
@JsonTypeName("RetargetingListServiceTag")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceTag {
  public static final String JSON_PROPERTY_SNIPPET = "snippet";
  private String snippet;

  public static final String JSON_PROPERTY_ADVANCED_SNIPPET = "advancedSnippet";
  private String advancedSnippet;

  public RetargetingListServiceTag() { 
  }

  public RetargetingListServiceTag snippet(String snippet) {
    
    this.snippet = snippet;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サイトリターゲティングのタグです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceTag of Site Retargeting.&lt;/div&gt; 
   * @return snippet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">サイトリターゲティングのタグです。</div> <div lang=\"en\">RetargetingListServiceTag of Site Retargeting.</div> ")
  @JsonProperty(JSON_PROPERTY_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSnippet() {
    return snippet;
  }


  @JsonProperty(JSON_PROPERTY_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  public RetargetingListServiceTag advancedSnippet(String advancedSnippet) {
    
    this.advancedSnippet = advancedSnippet;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   リニューアル版のサイトリターゲティングタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットのタグです。 &lt;br/&gt;   詳細は以下のヘルプを参照してください。&lt;br&gt;   ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan&#x3D;ja&amp;aid&#x3D;7460\&quot;&gt;サイトリターゲティング用タグの取得とサイトへの設置&lt;/a&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   The new format of site retargeting tag avoids the impacts such as changes made to the browser. &lt;br/&gt;   See also the help below.&lt;br&gt;   * &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan&#x3D;en&amp;aid&#x3D;6133\&quot;&gt;Acquire Site Retargeting Tag and Tagging on Site&lt;/a&gt; &lt;/div&gt; 
   * @return advancedSnippet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">   リニューアル版のサイトリターゲティングタグは、従来のタグよりもブラウザーなどの環境の影響を受けづらい新しいフォーマットのタグです。 <br/>   詳細は以下のヘルプを参照してください。<br>   ・<a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=ja&aid=7460\">サイトリターゲティング用タグの取得とサイトへの設置</a> </div> <div lang=\"en\">   The new format of site retargeting tag avoids the impacts such as changes made to the browser. <br/>   See also the help below.<br>   * <a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=en&aid=6133\">Acquire Site Retargeting Tag and Tagging on Site</a> </div> ")
  @JsonProperty(JSON_PROPERTY_ADVANCED_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdvancedSnippet() {
    return advancedSnippet;
  }


  @JsonProperty(JSON_PROPERTY_ADVANCED_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

