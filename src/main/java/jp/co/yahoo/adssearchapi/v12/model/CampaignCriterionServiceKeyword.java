/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v12.model.CampaignCriterionServiceKeywordMatchType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionServiceKeywordオブジェクトは、キーワードに関する情報を表します。&lt;br&gt; ADD時、このフィールドは省略可能です。※criterionTypeがKEYWORDの場合、必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterionServiceKeyword object displays keyword information.&lt;br&gt; This field is optional in ADD operation. *This field is required when criterionType is &#39;KEYWORD&#39;.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCriterionServiceKeywordオブジェクトは、キーワードに関する情報を表します。<br> ADD時、このフィールドは省略可能です。※criterionTypeがKEYWORDの場合、必須です。</div> <div lang=\"en\">CampaignCriterionServiceKeyword object displays keyword information.<br> This field is optional in ADD operation. *This field is required when criterionType is 'KEYWORD'.</div> ")
@JsonPropertyOrder({
  CampaignCriterionServiceKeyword.JSON_PROPERTY_KEYWORD_MATCH_TYPE,
  CampaignCriterionServiceKeyword.JSON_PROPERTY_TEXT
})
@JsonTypeName("CampaignCriterionServiceKeyword")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignCriterionServiceKeyword {
  public static final String JSON_PROPERTY_KEYWORD_MATCH_TYPE = "keywordMatchType";
  private CampaignCriterionServiceKeywordMatchType keywordMatchType;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public CampaignCriterionServiceKeyword() { 
  }

  public CampaignCriterionServiceKeyword keywordMatchType(CampaignCriterionServiceKeywordMatchType keywordMatchType) {
    
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

  public CampaignCriterionServiceKeywordMatchType getKeywordMatchType() {
    return keywordMatchType;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordMatchType(CampaignCriterionServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }


  public CampaignCriterionServiceKeyword text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードの内容です。&lt;br&gt; ADD時、このフィールドは必須です。&lt;br&gt; ※最大80文字、10ワードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterionServiceKeyword element.&lt;br&gt; This field is required in ADD operation.&lt;br&gt; * Maximum of 80 letters, 10 word.&lt;/div&gt; 
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードの内容です。<br> ADD時、このフィールドは必須です。<br> ※最大80文字、10ワードです。</div> <div lang=\"en\">CampaignCriterionServiceKeyword element.<br> This field is required in ADD operation.<br> * Maximum of 80 letters, 10 word.</div> ")
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

