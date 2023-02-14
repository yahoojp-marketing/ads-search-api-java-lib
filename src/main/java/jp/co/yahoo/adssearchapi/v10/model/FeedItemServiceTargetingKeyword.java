/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v10.model.FeedItemServiceKeywordMatchType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceTargetingKeywordオブジェクトは、データ自動挿入のターゲットキーワードを表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※アドカスタマイザーの場合は、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceTargetingKeyword contains keyword setting for Data Auto Insertion.&lt;br&gt; Although this field will be returned in the response, it will be  ignored on input.&lt;br&gt; *For AD_CUSTOMIZER, this field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceTargetingKeywordオブジェクトは、データ自動挿入のターゲットキーワードを表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※アドカスタマイザーの場合は、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">FeedItemServiceTargetingKeyword contains keyword setting for Data Auto Insertion.<br> Although this field will be returned in the response, it will be  ignored on input.<br> *For AD_CUSTOMIZER, this field is optional in ADD and SET operation.</div> ")
@JsonPropertyOrder({
  FeedItemServiceTargetingKeyword.JSON_PROPERTY_KEYWORD_MATCH_TYPE,
  FeedItemServiceTargetingKeyword.JSON_PROPERTY_TARGETING_KEYWORD_ID,
  FeedItemServiceTargetingKeyword.JSON_PROPERTY_TEXT
})
@JsonTypeName("FeedItemServiceTargetingKeyword")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItemServiceTargetingKeyword {
  public static final String JSON_PROPERTY_KEYWORD_MATCH_TYPE = "keywordMatchType";
  private FeedItemServiceKeywordMatchType keywordMatchType;

  public static final String JSON_PROPERTY_TARGETING_KEYWORD_ID = "targetingKeywordId";
  private Long targetingKeywordId;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public FeedItemServiceTargetingKeyword() { 
  }

  public FeedItemServiceTargetingKeyword keywordMatchType(FeedItemServiceKeywordMatchType keywordMatchType) {
    
    this.keywordMatchType = keywordMatchType;
    return this;
  }

   /**
   * Get keywordMatchType
   * @return keywordMatchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceKeywordMatchType getKeywordMatchType() {
    return keywordMatchType;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordMatchType(FeedItemServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }


  public FeedItemServiceTargetingKeyword targetingKeywordId(Long targetingKeywordId) {
    
    this.targetingKeywordId = targetingKeywordId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;指定したキーワード（text）を識別する IDになります。&lt;br&gt; ※設定を解除する場合は「0」を指定 してください。&lt;br&gt; このフィールドは、SET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ID to identify the Targeting keyword (text).&lt;br&gt; * To deactive, set &amp;#34;0&amp;#34;.&lt;br&gt; This field is optional in SET operation.&lt;/div&gt; 
   * @return targetingKeywordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">指定したキーワード（text）を識別する IDになります。<br> ※設定を解除する場合は「0」を指定 してください。<br> このフィールドは、SET時に省略可能となります。</div> <div lang=\"en\">ID to identify the Targeting keyword (text).<br> * To deactive, set &#34;0&#34;.<br> This field is optional in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_TARGETING_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetingKeywordId() {
    return targetingKeywordId;
  }


  @JsonProperty(JSON_PROPERTY_TARGETING_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetingKeywordId(Long targetingKeywordId) {
    this.targetingKeywordId = targetingKeywordId;
  }


  public FeedItemServiceTargetingKeyword text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;指定するキーワードです。&lt;br&gt;※入力制限：80文字、10ワード までです。&lt;br&gt; このフィールドはADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Keyword text.&lt;br&gt; * Insert limit: Up to 80 characters and/or 10 words.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">指定するキーワードです。<br>※入力制限：80文字、10ワード までです。<br> このフィールドはADDおよびSET時に必須となります。</div> <div lang=\"en\">Keyword text.<br> * Insert limit: Up to 80 characters and/or 10 words.<br> This field is required in ADD and SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceTargetingKeyword feedItemServiceTargetingKeyword = (FeedItemServiceTargetingKeyword) o;
    return Objects.equals(this.keywordMatchType, feedItemServiceTargetingKeyword.keywordMatchType) &&
        Objects.equals(this.targetingKeywordId, feedItemServiceTargetingKeyword.targetingKeywordId) &&
        Objects.equals(this.text, feedItemServiceTargetingKeyword.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordMatchType, targetingKeywordId, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceTargetingKeyword {\n");
    sb.append("    keywordMatchType: ").append(toIndentedString(keywordMatchType)).append("\n");
    sb.append("    targetingKeywordId: ").append(toIndentedString(targetingKeywordId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

