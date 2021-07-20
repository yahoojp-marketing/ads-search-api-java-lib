package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceKeywordMatchType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceTargetingKeywordオブジェクトは、データ自動挿入のターゲットキーワードを表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※アドカスタマイザーの場合は、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceTargetingKeyword contains keyword setting for Data Auto Insertion.&lt;br&gt; Although this field will be returned in the response, it will be  ignored on input.&lt;br&gt; *For AD_CUSTOMIZER, this field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceTargetingKeywordオブジェクトは、データ自動挿入のターゲットキーワードを表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※アドカスタマイザーの場合は、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">FeedItemServiceTargetingKeyword contains keyword setting for Data Auto Insertion.<br> Although this field will be returned in the response, it will be  ignored on input.<br> *For AD_CUSTOMIZER, this field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceTargetingKeyword   {
  @JsonProperty("keywordMatchType")
  private FeedItemServiceKeywordMatchType keywordMatchType = null;

  @JsonProperty("targetingKeywordId")
  private Long targetingKeywordId = null;

  @JsonProperty("text")
  private String text = null;

  public FeedItemServiceTargetingKeyword keywordMatchType(FeedItemServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
    return this;
  }

  /**
   * Get keywordMatchType
   * @return keywordMatchType
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedItemServiceKeywordMatchType getKeywordMatchType() {
    return keywordMatchType;
  }

  public void setKeywordMatchType(FeedItemServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }

  public FeedItemServiceTargetingKeyword targetingKeywordId(Long targetingKeywordId) {
    this.targetingKeywordId = targetingKeywordId;
    return this;
  }

  /**
   * <div lang=\"ja\">指定したキーワード（text）を識別する IDになります。<br> ※設定を解除する場合は「0」を指定 してください。<br> このフィールドは、SET時に省略可能となります。</div> <div lang=\"en\">ID to identify the Targeting keyword (text).<br> * To deactive, set &#34;0&#34;.<br> This field is optional in SET operation.</div> 
   * @return targetingKeywordId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">指定したキーワード（text）を識別する IDになります。<br> ※設定を解除する場合は「0」を指定 してください。<br> このフィールドは、SET時に省略可能となります。</div> <div lang=\"en\">ID to identify the Targeting keyword (text).<br> * To deactive, set &#34;0&#34;.<br> This field is optional in SET operation.</div> ")


  public Long getTargetingKeywordId() {
    return targetingKeywordId;
  }

  public void setTargetingKeywordId(Long targetingKeywordId) {
    this.targetingKeywordId = targetingKeywordId;
  }

  public FeedItemServiceTargetingKeyword text(String text) {
    this.text = text;
    return this;
  }

  /**
   * <div lang=\"ja\">指定するキーワードです。<br>※入力制限：80文字、10ワード までです。<br> このフィールドはADDおよびSET時に必須となります。</div> <div lang=\"en\">Keyword text.<br> * Insert limit: Up to 80 characters and/or 10 words.<br> This field is required in ADD and SET operation.</div> 
   * @return text
  */
  @ApiModelProperty(value = "<div lang=\"ja\">指定するキーワードです。<br>※入力制限：80文字、10ワード までです。<br> このフィールドはADDおよびSET時に必須となります。</div> <div lang=\"en\">Keyword text.<br> * Insert limit: Up to 80 characters and/or 10 words.<br> This field is required in ADD and SET operation.</div> ")


  public String getText() {
    return text;
  }

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

