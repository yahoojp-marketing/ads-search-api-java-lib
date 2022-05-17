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
import jp.co.yahoo.adssearchapi.v8.model.DictionaryServiceLang;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceGeographicLocationSelectorオブジェクトは、取得したい地域情報に必要な情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocationSelector contain information to retrieve geographic location information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceGeographicLocationSelectorオブジェクトは、取得したい地域情報に必要な情報を格納します。</div> <div lang=\"en\">DictionaryServiceGeographicLocationSelector contain information to retrieve geographic location information.</div> ")
@JsonPropertyOrder({
  DictionaryServiceGeographicLocationSelector.JSON_PROPERTY_LANG
})
@JsonTypeName("DictionaryServiceGeographicLocationSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceGeographicLocationSelector {
  public static final String JSON_PROPERTY_LANG = "lang";
  private DictionaryServiceLang lang;

  public DictionaryServiceGeographicLocationSelector() { 
  }

  public DictionaryServiceGeographicLocationSelector lang(DictionaryServiceLang lang) {
    
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DictionaryServiceLang getLang() {
    return lang;
  }


  @JsonProperty(JSON_PROPERTY_LANG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLang(DictionaryServiceLang lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceGeographicLocationSelector dictionaryServiceGeographicLocationSelector = (DictionaryServiceGeographicLocationSelector) o;
    return Objects.equals(this.lang, dictionaryServiceGeographicLocationSelector.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceGeographicLocationSelector {\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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

