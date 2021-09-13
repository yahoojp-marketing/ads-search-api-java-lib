package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceCustomParameterは、カスタムパラメータの内容を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;br&gt; SET時、このフィールドは既存の項目を置き換えます。&lt;br&gt; ※削除フラグを立てた場合(isRemove&#x3D;TRUE)、このフィールドは無視され、こちらの項目関係なく、全項目が削除されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceCustomParameter displays the element of custom parameters.&lt;br&gt; This field is required in ADD and SET operation.&lt;br&gt; This field replaces the  current items in SET operation.&lt;br&gt; *If the delete flag is set (isRemove&#x3D;TRUE), this field will be ignored and all items will  be deleted.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceCustomParameterは、カスタムパラメータの内容を表します。<br> このフィールドは、ADDおよびSET時に必須となります。<br> SET時、このフィールドは既存の項目を置き換えます。<br> ※削除フラグを立てた場合(isRemove=TRUE)、このフィールドは無視され、こちらの項目関係なく、全項目が削除されます。</div> <div lang=\"en\">FeedItemServiceCustomParameter displays the element of custom parameters.<br> This field is required in ADD and SET operation.<br> This field replaces the  current items in SET operation.<br> *If the delete flag is set (isRemove=TRUE), this field will be ignored and all items will  be deleted.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceCustomParameter   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public FeedItemServiceCustomParameter key(String key) {
    this.key = key;
    return this;
  }

  /**
   * <div lang=\"ja\">キーです。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">Key of parameter.<br> This field is required in ADD and SET operation.</div> 
   * @return key
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーです。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">Key of parameter.<br> This field is required in ADD and SET operation.</div> ")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FeedItemServiceCustomParameter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <div lang=\"ja\">値です。<br> このフィールドは、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">Value of parameter.<br> This field is optional in ADD and SET operation.<br></div> 
   * @return value
  */
  @ApiModelProperty(value = "<div lang=\"ja\">値です。<br> このフィールドは、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">Value of parameter.<br> This field is optional in ADD and SET operation.<br></div> ")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceCustomParameter feedItemServiceCustomParameter = (FeedItemServiceCustomParameter) o;
    return Objects.equals(this.key, feedItemServiceCustomParameter.key) &&
        Objects.equals(this.value, feedItemServiceCustomParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceCustomParameter {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

