package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceKeywordMatchType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceKeywordオブジェクトは、キーワードに関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceKeyword object displays keyword information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceKeywordオブジェクトは、キーワードに関する情報を表します。</div> <div lang=\"en\">AdGroupCriterionServiceKeyword object displays keyword information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionServiceKeyword   {
  @JsonProperty("keywordMatchType")
  private AdGroupCriterionServiceKeywordMatchType keywordMatchType = null;

  @JsonProperty("text")
  private String text = null;

  public AdGroupCriterionServiceKeyword keywordMatchType(AdGroupCriterionServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
    return this;
  }

  /**
   * Get keywordMatchType
   * @return keywordMatchType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionServiceKeywordMatchType getKeywordMatchType() {
    return keywordMatchType;
  }

  public void setKeywordMatchType(AdGroupCriterionServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }

  public AdGroupCriterionServiceKeyword text(String text) {
    this.text = text;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードの内容です。<br> ※最大80文字、10ワードです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupCriterionServiceKeyword element.<br> *Maximum of 80 letters, 10 words.<br> This field is required in ADD operation.</div> 
   * @return text
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードの内容です。<br> ※最大80文字、10ワードです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupCriterionServiceKeyword element.<br> *Maximum of 80 letters, 10 words.<br> This field is required in ADD operation.</div> ")


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
    AdGroupCriterionServiceKeyword adGroupCriterionServiceKeyword = (AdGroupCriterionServiceKeyword) o;
    return Objects.equals(this.keywordMatchType, adGroupCriterionServiceKeyword.keywordMatchType) &&
        Objects.equals(this.text, adGroupCriterionServiceKeyword.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordMatchType, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceKeyword {\n");
    
    sb.append("    keywordMatchType: ").append(toIndentedString(keywordMatchType)).append("\n");
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
