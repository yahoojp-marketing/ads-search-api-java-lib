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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceExtendedTextAdオブジェクトは、拡大テキスト広告に関する情報を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがEXTENDED_TEXT_ADの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceExtendedTextAd object describes the information of Extended Text Ad.&lt;br&gt; This field is optional in ADD operation. *If adType is EXTENDED_TEXT_AD, this field is required.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupAdServiceExtendedTextAd.JSON_PROPERTY_HEADLINE,
  AdGroupAdServiceExtendedTextAd.JSON_PROPERTY_HEADLINE2,
  AdGroupAdServiceExtendedTextAd.JSON_PROPERTY_HEADLINE3,
  AdGroupAdServiceExtendedTextAd.JSON_PROPERTY_DESCRIPTION,
  AdGroupAdServiceExtendedTextAd.JSON_PROPERTY_DESCRIPTION2,
  AdGroupAdServiceExtendedTextAd.JSON_PROPERTY_PATH1,
  AdGroupAdServiceExtendedTextAd.JSON_PROPERTY_PATH2
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceExtendedTextAd {
  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_HEADLINE2 = "headline2";
  private String headline2;

  public static final String JSON_PROPERTY_HEADLINE3 = "headline3";
  private String headline3;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DESCRIPTION2 = "description2";
  private String description2;

  public static final String JSON_PROPERTY_PATH1 = "path1";
  private String path1;

  public static final String JSON_PROPERTY_PATH2 = "path2";
  private String path2;

  public AdGroupAdServiceExtendedTextAd() {
  }

  public AdGroupAdServiceExtendedTextAd headline(String headline) {
    
    this.headline = headline;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;タイトル文です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Title of ad.&lt;br&gt; This field is required in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD or RESPONSIVE_SEARCH_AD, this field will be ignored.&lt;/div&gt; 
   * @return headline
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public AdGroupAdServiceExtendedTextAd headline2(String headline2) {
    
    this.headline2 = headline2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;2行目のタイトルです。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Title on the second line.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return headline2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADLINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline2() {
    return headline2;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline2(String headline2) {
    this.headline2 = headline2;
  }


  public AdGroupAdServiceExtendedTextAd headline3(String headline3) {
    
    this.headline3 = headline3;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;3行目のタイトルです。&lt;br&gt; ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Title on the second line.&lt;br&gt; This field is optional in ADD operation. The default value will be null.&lt;/div&gt; 
   * @return headline3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADLINE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline3() {
    return headline3;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline3(String headline3) {
    this.headline3 = headline3;
  }


  public AdGroupAdServiceExtendedTextAd description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;説明文です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;br&gt;自動挿入をサポートしていません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description of ad.&lt;br&gt; This field is required in ADD operation. *If adType is RESPONSIVE_SEARCH_AD, this field will be ignored.&lt;br&gt;Does not support Data Auto Insertion.&lt;/div&gt; 
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AdGroupAdServiceExtendedTextAd description2(String description2) {
    
    this.description2 = description2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;2行目の説明文です。&lt;br&gt; ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description on the second line.&lt;br&gt; This field is optional in ADD operation. The default value will be null.&lt;/div&gt; 
   * @return description2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription2() {
    return description2;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription2(String description2) {
    this.description2 = description2;
  }


  public AdGroupAdServiceExtendedTextAd path1(String path1) {
    
    this.path1 = path1;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動作成される表示URLを補足するパスです。&lt;br&gt; ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。&lt;br&gt;※path2を指定する場合は、path1は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The path information which complements display URL generated automatically.&lt;br&gt; This field is optional in ADD operation. The default value will be null.&lt;br&gt;*To specify path2, path1 is required.&lt;/div&gt; 
   * @return path1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath1() {
    return path1;
  }


  @JsonProperty(JSON_PROPERTY_PATH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath1(String path1) {
    this.path1 = path1;
  }


  public AdGroupAdServiceExtendedTextAd path2(String path2) {
    
    this.path2 = path2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動作成される表示URLを補足するパスです。&lt;br&gt; ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。&lt;br&gt;※path1を指定していない場合、path2は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The path information which complements display URL generated automatically.&lt;br&gt; This field is optional in ADD operation. The default value will be null.&lt;br&gt;*If path1 is not specified, path2 will be ignored.&lt;/div&gt; 
   * @return path2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath2() {
    return path2;
  }


  @JsonProperty(JSON_PROPERTY_PATH2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath2(String path2) {
    this.path2 = path2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceExtendedTextAd adGroupAdServiceExtendedTextAd = (AdGroupAdServiceExtendedTextAd) o;
    return Objects.equals(this.headline, adGroupAdServiceExtendedTextAd.headline) &&
        Objects.equals(this.headline2, adGroupAdServiceExtendedTextAd.headline2) &&
        Objects.equals(this.headline3, adGroupAdServiceExtendedTextAd.headline3) &&
        Objects.equals(this.description, adGroupAdServiceExtendedTextAd.description) &&
        Objects.equals(this.description2, adGroupAdServiceExtendedTextAd.description2) &&
        Objects.equals(this.path1, adGroupAdServiceExtendedTextAd.path1) &&
        Objects.equals(this.path2, adGroupAdServiceExtendedTextAd.path2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, headline2, headline3, description, description2, path1, path2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceExtendedTextAd {\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    headline2: ").append(toIndentedString(headline2)).append("\n");
    sb.append("    headline3: ").append(toIndentedString(headline3)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    path1: ").append(toIndentedString(path1)).append("\n");
    sb.append("    path2: ").append(toIndentedString(path2)).append("\n");
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

