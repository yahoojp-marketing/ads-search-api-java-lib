package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.CampaignCriterionServiceKeywordMatchType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionServiceKeywordオブジェクトは、キーワードに関する情報を表します。&lt;br&gt; ADD時、このフィールドは省略可能です。※criterionTypeがKEYWORDの場合、必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterionServiceKeyword object displays keyword information.&lt;br&gt; This field is optional in ADD operation. *This field is required when criterionType is &#39;KEYWORD&#39;.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCriterionServiceKeywordオブジェクトは、キーワードに関する情報を表します。<br> ADD時、このフィールドは省略可能です。※criterionTypeがKEYWORDの場合、必須です。</div> <div lang=\"en\">CampaignCriterionServiceKeyword object displays keyword information.<br> This field is optional in ADD operation. *This field is required when criterionType is 'KEYWORD'.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignCriterionServiceKeyword   {
  @JsonProperty("keywordMatchType")
  private CampaignCriterionServiceKeywordMatchType keywordMatchType = null;

  @JsonProperty("text")
  private String text = null;

  public CampaignCriterionServiceKeyword keywordMatchType(CampaignCriterionServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
    return this;
  }

  /**
   * Get keywordMatchType
   * @return keywordMatchType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignCriterionServiceKeywordMatchType getKeywordMatchType() {
    return keywordMatchType;
  }

  public void setKeywordMatchType(CampaignCriterionServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }

  public CampaignCriterionServiceKeyword text(String text) {
    this.text = text;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードの内容です。<br> ADD時、このフィールドは必須です。<br> ※最大80文字、10ワードです。</div> <div lang=\"en\">CampaignCriterionServiceKeyword element.<br> This field is required in ADD operation.<br> * Maximum of 80 letters, 10 word.</div> 
   * @return text
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードの内容です。<br> ADD時、このフィールドは必須です。<br> ※最大80文字、10ワードです。</div> <div lang=\"en\">CampaignCriterionServiceKeyword element.<br> This field is required in ADD operation.<br> * Maximum of 80 letters, 10 word.</div> ")


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
    CampaignCriterionServiceKeyword campaignCriterionServiceKeyword = (CampaignCriterionServiceKeyword) o;
    return Objects.equals(this.keywordMatchType, campaignCriterionServiceKeyword.keywordMatchType) &&
        Objects.equals(this.text, campaignCriterionServiceKeyword.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordMatchType, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCriterionServiceKeyword {\n");
    
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

