/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceCustomKeyは、カスタムキールールの評価式を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceCustomKey is an object that holds evaluation of custom key rules.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RetargetingListServiceCustomKey.JSON_PROPERTY_TEXT_KEY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceCustomKey {
  public static final String JSON_PROPERTY_TEXT_KEY = "textKey";
  private List<String> textKey;

  public RetargetingListServiceCustomKey() {
  }

  public RetargetingListServiceCustomKey textKey(List<String> textKey) {
    
    this.textKey = textKey;
    return this;
  }

  public RetargetingListServiceCustomKey addTextKeyItem(String textKeyItem) {
    if (this.textKey == null) {
      this.textKey = new ArrayList<>();
    }
    this.textKey.add(textKeyItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;評価項目&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Evaluation items.&lt;/div&gt; 
   * @return textKey
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTextKey() {
    return textKey;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextKey(List<String> textKey) {
    this.textKey = textKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceCustomKey retargetingListServiceCustomKey = (RetargetingListServiceCustomKey) o;
    return Objects.equals(this.textKey, retargetingListServiceCustomKey.textKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceCustomKey {\n");
    sb.append("    textKey: ").append(toIndentedString(textKey)).append("\n");
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

