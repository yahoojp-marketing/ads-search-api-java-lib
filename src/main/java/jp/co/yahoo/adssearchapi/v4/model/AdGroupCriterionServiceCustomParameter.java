package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceCustomParameterは、カスタムパラメータの内容を表します。&lt;br&gt; ADDおよびSET時、このフィールドは必須となります。&lt;br&gt; ※SET時、既存の項目を置き換えます。また、isRemoveの設定値がTRUEの場合は無視され、全項目が削除されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceCustomParameter displays the element of custom parameters.&lt;br&gt; This field is required in ADD and SET operation.&lt;br&gt; *In SET operation, it will replace the current items. In addition, it will be ignored and all item will be deleted if &#39;isRemove&#39;  is set to TRUE.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceCustomParameterは、カスタムパラメータの内容を表します。<br> ADDおよびSET時、このフィールドは必須となります。<br> ※SET時、既存の項目を置き換えます。また、isRemoveの設定値がTRUEの場合は無視され、全項目が削除されます。</div> <div lang=\"en\">AdGroupCriterionServiceCustomParameter displays the element of custom parameters.<br> This field is required in ADD and SET operation.<br> *In SET operation, it will replace the current items. In addition, it will be ignored and all item will be deleted if 'isRemove'  is set to TRUE.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionServiceCustomParameter   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public AdGroupCriterionServiceCustomParameter key(String key) {
    this.key = key;
    return this;
  }

  /**
   * <div lang=\"ja\">キーです。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Key of parameter.<br> This field is required in ADD and SET operation.</div> 
   * @return key
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーです。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Key of parameter.<br> This field is required in ADD and SET operation.</div> ")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AdGroupCriterionServiceCustomParameter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * <div lang=\"ja\">値です。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Value of parameter.<br> This field is optional in ADD and SET operation.</div> 
   * @return value
  */
  @ApiModelProperty(value = "<div lang=\"ja\">値です。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Value of parameter.<br> This field is optional in ADD and SET operation.</div> ")


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
    AdGroupCriterionServiceCustomParameter adGroupCriterionServiceCustomParameter = (AdGroupCriterionServiceCustomParameter) o;
    return Objects.equals(this.key, adGroupCriterionServiceCustomParameter.key) &&
        Objects.equals(this.value, adGroupCriterionServiceCustomParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceCustomParameter {\n");
    
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

