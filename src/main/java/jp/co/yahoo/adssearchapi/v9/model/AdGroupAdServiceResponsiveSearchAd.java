/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v9.model.AdGroupAdServiceDescriptionTextAsset;
import jp.co.yahoo.adssearchapi.v9.model.AdGroupAdServiceHeadlineTextAsset;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceResponsiveSearchAdオブジェクトは、レスポンシブ広告を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがRESPONSIVE_SEARCH_ADの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceResponsiveSearchAd object is Responsive ads.&lt;br&gt; This field is optional in ADD operation. *If adType is RESPONSIVE_SEARCH_AD, this field is required.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_HEADLINES,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_DESCRIPTIONS,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_PATH1,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_PATH2
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceResponsiveSearchAd {
  public static final String JSON_PROPERTY_HEADLINES = "headlines";
  private List<AdGroupAdServiceHeadlineTextAsset> headlines;

  public static final String JSON_PROPERTY_DESCRIPTIONS = "descriptions";
  private List<AdGroupAdServiceDescriptionTextAsset> descriptions;

  public static final String JSON_PROPERTY_PATH1 = "path1";
  private String path1;

  public static final String JSON_PROPERTY_PATH2 = "path2";
  private String path2;

  public AdGroupAdServiceResponsiveSearchAd() {
  }

  public AdGroupAdServiceResponsiveSearchAd headlines(List<AdGroupAdServiceHeadlineTextAsset> headlines) {
    
    this.headlines = headlines;
    return this;
  }

  public AdGroupAdServiceResponsiveSearchAd addHeadlinesItem(AdGroupAdServiceHeadlineTextAsset headlinesItem) {
    if (this.headlines == null) {
      this.headlines = new ArrayList<>();
    }
    this.headlines.add(headlinesItem);
    return this;
  }

   /**
   * Get headlines
   * @return headlines
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADLINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceHeadlineTextAsset> getHeadlines() {
    return headlines;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadlines(List<AdGroupAdServiceHeadlineTextAsset> headlines) {
    this.headlines = headlines;
  }


  public AdGroupAdServiceResponsiveSearchAd descriptions(List<AdGroupAdServiceDescriptionTextAsset> descriptions) {
    
    this.descriptions = descriptions;
    return this;
  }

  public AdGroupAdServiceResponsiveSearchAd addDescriptionsItem(AdGroupAdServiceDescriptionTextAsset descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * Get descriptions
   * @return descriptions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceDescriptionTextAsset> getDescriptions() {
    return descriptions;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescriptions(List<AdGroupAdServiceDescriptionTextAsset> descriptions) {
    this.descriptions = descriptions;
  }


  public AdGroupAdServiceResponsiveSearchAd path1(String path1) {
    
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


  public AdGroupAdServiceResponsiveSearchAd path2(String path2) {
    
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
    AdGroupAdServiceResponsiveSearchAd adGroupAdServiceResponsiveSearchAd = (AdGroupAdServiceResponsiveSearchAd) o;
    return Objects.equals(this.headlines, adGroupAdServiceResponsiveSearchAd.headlines) &&
        Objects.equals(this.descriptions, adGroupAdServiceResponsiveSearchAd.descriptions) &&
        Objects.equals(this.path1, adGroupAdServiceResponsiveSearchAd.path1) &&
        Objects.equals(this.path2, adGroupAdServiceResponsiveSearchAd.path2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headlines, descriptions, path1, path2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceResponsiveSearchAd {\n");
    sb.append("    headlines: ").append(toIndentedString(headlines)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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

