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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceCustomParameterは、カスタムパラメータの内容を表します。&lt;br&gt; ADDおよびSET時、customParameters配下では必須となります。&lt;br&gt; ※SET時、既存の項目を置き換えます。また、このフィールドはisRemoveの設定値がTRUEの場合は無視され、全項目が削除されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceCustomParameter displays the element of custom parameters.&lt;br&gt; In ADD and SET operation,this field is required under &#39;customParameters&#39;.&lt;br&gt; *In SET operation, it will replace the current items. In addition, it will be ignored and all item will be deleted if &#39;isRemove&#39;  is set TRUE.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceCustomParameterは、カスタムパラメータの内容を表します。<br> ADDおよびSET時、customParameters配下では必須となります。<br> ※SET時、既存の項目を置き換えます。また、このフィールドはisRemoveの設定値がTRUEの場合は無視され、全項目が削除されます。</div> <div lang=\"en\">AdGroupServiceCustomParameter displays the element of custom parameters.<br> In ADD and SET operation,this field is required under 'customParameters'.<br> *In SET operation, it will replace the current items. In addition, it will be ignored and all item will be deleted if 'isRemove'  is set TRUE.</div> ")

public class AdGroupServiceCustomParameter   {
  @JsonProperty("key")
  private JsonNullable<String> key = JsonNullable.undefined();

  @JsonProperty("value")
  private JsonNullable<String> value = JsonNullable.undefined();

  public AdGroupServiceCustomParameter key(String key) {
    this.key = JsonNullable.of(key);
    return this;
  }

  /**
   * <div lang=\"ja\">キーです。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Key of parameter.<br> This field is required in ADD and SET operation.</div> 
   * @return key
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーです。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Key of parameter.<br> This field is required in ADD and SET operation.</div> ")


  public JsonNullable<String> getKey() {
    return key;
  }

  public void setKey(JsonNullable<String> key) {
    this.key = key;
  }

  public AdGroupServiceCustomParameter value(String value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * <div lang=\"ja\">値です。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Value of parameter.<br> This field is optional in ADD and SET operation.<br></div> 
   * @return value
  */
  @ApiModelProperty(value = "<div lang=\"ja\">値です。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Value of parameter.<br> This field is optional in ADD and SET operation.<br></div> ")


  public JsonNullable<String> getValue() {
    return value;
  }

  public void setValue(JsonNullable<String> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceCustomParameter adGroupServiceCustomParameter = (AdGroupServiceCustomParameter) o;
    return Objects.equals(this.key, adGroupServiceCustomParameter.key) &&
        Objects.equals(this.value, adGroupServiceCustomParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceCustomParameter {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

