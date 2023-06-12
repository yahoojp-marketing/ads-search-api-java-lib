/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v11.model.AdGroupAdServiceDescriptionTextAsset;
import jp.co.yahoo.adssearchapi.v11.model.AdGroupAdServiceHeadlineTextAsset;
import jp.co.yahoo.adssearchapi.v11.model.AdGroupAdServiceIsRemove;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceResponsiveSearchAdオブジェクトは、レスポンシブ検索広告を表します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。※adTypeがRESPONSIVE_SEARCH_ADの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceResponsiveSearchAd object is Responsive ads.&lt;br&gt; This field is optional in ADD and SET operation. *If adType is RESPONSIVE_SEARCH_AD, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceResponsiveSearchAdオブジェクトは、レスポンシブ検索広告を表します。<br> ADDおよびSET時、このフィールドは省略可能となります。※adTypeがRESPONSIVE_SEARCH_ADの場合は必須です。</div> <div lang=\"en\">AdGroupAdServiceResponsiveSearchAd object is Responsive ads.<br> This field is optional in ADD and SET operation. *If adType is RESPONSIVE_SEARCH_AD, this field is required.</div> ")
@JsonPropertyOrder({
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_HEADLINES,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_DESCRIPTIONS,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_PATH1,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_IS_REMOVE_PATH1,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_PATH2,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_IS_REMOVE_PATH2,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_REVIEW_HEADLINES,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_REVIEW_DESCRIPTIONS,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_REVIEW_PATH1,
  AdGroupAdServiceResponsiveSearchAd.JSON_PROPERTY_REVIEW_PATH2
})
@JsonTypeName("AdGroupAdServiceResponsiveSearchAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceResponsiveSearchAd {
  public static final String JSON_PROPERTY_HEADLINES = "headlines";
  private List<AdGroupAdServiceHeadlineTextAsset> headlines = null;

  public static final String JSON_PROPERTY_DESCRIPTIONS = "descriptions";
  private List<AdGroupAdServiceDescriptionTextAsset> descriptions = null;

  public static final String JSON_PROPERTY_PATH1 = "path1";
  private String path1;

  public static final String JSON_PROPERTY_IS_REMOVE_PATH1 = "isRemovePath1";
  private AdGroupAdServiceIsRemove isRemovePath1;

  public static final String JSON_PROPERTY_PATH2 = "path2";
  private String path2;

  public static final String JSON_PROPERTY_IS_REMOVE_PATH2 = "isRemovePath2";
  private AdGroupAdServiceIsRemove isRemovePath2;

  public static final String JSON_PROPERTY_REVIEW_HEADLINES = "reviewHeadlines";
  private List<AdGroupAdServiceHeadlineTextAsset> reviewHeadlines = null;

  public static final String JSON_PROPERTY_REVIEW_DESCRIPTIONS = "reviewDescriptions";
  private List<AdGroupAdServiceDescriptionTextAsset> reviewDescriptions = null;

  public static final String JSON_PROPERTY_REVIEW_PATH1 = "reviewPath1";
  private String reviewPath1;

  public static final String JSON_PROPERTY_REVIEW_PATH2 = "reviewPath2";
  private String reviewPath2;

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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;レスポンシブ検索広告で指定するタイトルのテキストアセットを表します。&lt;br&gt; headlines[]には、3~15件の指定が可能です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Text asset for the headline that specify in responsive ads for search.&lt;br&gt; 3 to 15 items can be specified for headlines[].&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
   * @return headlines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">レスポンシブ検索広告で指定するタイトルのテキストアセットを表します。<br> headlines[]には、3~15件の指定が可能です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Text asset for the headline that specify in responsive ads for search.<br> 3 to 15 items can be specified for headlines[].<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;レスポンシブ検索広告で指定する説明文のテキストアセットを表します。&lt;br&gt; descriptions[]には、2~4件の指定が可能です。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Text asset for the description that specify in responsive ads for search.&lt;br&gt; 2 to 4 items can be specified for descriptions[].&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
   * @return descriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">レスポンシブ検索広告で指定する説明文のテキストアセットを表します。<br> descriptions[]には、2~4件の指定が可能です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Text asset for the description that specify in responsive ads for search.<br> 2 to 4 items can be specified for descriptions[].<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動作成される表示URLを補足するパスです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。&lt;br&gt;※path2を指定する場合は、path1は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The path information which complements display URL generated automatically.&lt;br&gt; This field is optional in ADD and SET operation. The default value will be null.&lt;br&gt;*To specify path2, path1 is required.&lt;/div&gt; 
   * @return path1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動作成される表示URLを補足するパスです。<br> ADDおよびSET時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。<br>※path2を指定する場合は、path1は必須です。</div> <div lang=\"en\">The path information which complements display URL generated automatically.<br> This field is optional in ADD and SET operation. The default value will be null.<br>*To specify path2, path1 is required.</div> ")
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


  public AdGroupAdServiceResponsiveSearchAd isRemovePath1(AdGroupAdServiceIsRemove isRemovePath1) {
    
    this.isRemovePath1 = isRemovePath1;
    return this;
  }

   /**
   * Get isRemovePath1
   * @return isRemovePath1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_PATH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemove getIsRemovePath1() {
    return isRemovePath1;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_PATH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemovePath1(AdGroupAdServiceIsRemove isRemovePath1) {
    this.isRemovePath1 = isRemovePath1;
  }


  public AdGroupAdServiceResponsiveSearchAd path2(String path2) {
    
    this.path2 = path2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動作成される表示URLを補足するパスです。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。&lt;br&gt;※path1を指定していない場合、path2は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The path information which complements display URL generated automatically.&lt;br&gt; This field is optional in ADD and SET operation. The default value will be null.&lt;br&gt;*If path1 is not specified, path2 will be ignored.&lt;/div&gt; 
   * @return path2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動作成される表示URLを補足するパスです。<br> ADDおよびSET時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。<br>※path1を指定していない場合、path2は無視されます。</div> <div lang=\"en\">The path information which complements display URL generated automatically.<br> This field is optional in ADD and SET operation. The default value will be null.<br>*If path1 is not specified, path2 will be ignored.</div> ")
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


  public AdGroupAdServiceResponsiveSearchAd isRemovePath2(AdGroupAdServiceIsRemove isRemovePath2) {
    
    this.isRemovePath2 = isRemovePath2;
    return this;
  }

   /**
   * Get isRemovePath2
   * @return isRemovePath2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_PATH2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemove getIsRemovePath2() {
    return isRemovePath2;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_PATH2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemovePath2(AdGroupAdServiceIsRemove isRemovePath2) {
    this.isRemovePath2 = isRemovePath2;
  }


  public AdGroupAdServiceResponsiveSearchAd reviewHeadlines(List<AdGroupAdServiceHeadlineTextAsset> reviewHeadlines) {
    
    this.reviewHeadlines = reviewHeadlines;
    return this;
  }

  public AdGroupAdServiceResponsiveSearchAd addReviewHeadlinesItem(AdGroupAdServiceHeadlineTextAsset reviewHeadlinesItem) {
    if (this.reviewHeadlines == null) {
      this.reviewHeadlines = new ArrayList<>();
    }
    this.reviewHeadlines.add(reviewHeadlinesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中のタイトルのテキストアセットを表します。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Text asset for the headline under review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewHeadlines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のタイトルのテキストアセットを表します。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Text asset for the headline under review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")
  @JsonProperty(JSON_PROPERTY_REVIEW_HEADLINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceHeadlineTextAsset> getReviewHeadlines() {
    return reviewHeadlines;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_HEADLINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewHeadlines(List<AdGroupAdServiceHeadlineTextAsset> reviewHeadlines) {
    this.reviewHeadlines = reviewHeadlines;
  }


  public AdGroupAdServiceResponsiveSearchAd reviewDescriptions(List<AdGroupAdServiceDescriptionTextAsset> reviewDescriptions) {
    
    this.reviewDescriptions = reviewDescriptions;
    return this;
  }

  public AdGroupAdServiceResponsiveSearchAd addReviewDescriptionsItem(AdGroupAdServiceDescriptionTextAsset reviewDescriptionsItem) {
    if (this.reviewDescriptions == null) {
      this.reviewDescriptions = new ArrayList<>();
    }
    this.reviewDescriptions.add(reviewDescriptionsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中の説明文のテキストアセットを表します。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Text asset for the description under review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewDescriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査中の説明文のテキストアセットを表します。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Text asset for the description under review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")
  @JsonProperty(JSON_PROPERTY_REVIEW_DESCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAdServiceDescriptionTextAsset> getReviewDescriptions() {
    return reviewDescriptions;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_DESCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewDescriptions(List<AdGroupAdServiceDescriptionTextAsset> reviewDescriptions) {
    this.reviewDescriptions = reviewDescriptions;
  }


  public AdGroupAdServiceResponsiveSearchAd reviewPath1(String reviewPath1) {
    
    this.reviewPath1 = reviewPath1;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中の自動作成される表示URLを補足するパスです。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The path information which complements display URL generated automatically (Under review).&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewPath1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査中の自動作成される表示URLを補足するパスです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">The path information which complements display URL generated automatically (Under review).<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")
  @JsonProperty(JSON_PROPERTY_REVIEW_PATH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewPath1() {
    return reviewPath1;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_PATH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewPath1(String reviewPath1) {
    this.reviewPath1 = reviewPath1;
  }


  public AdGroupAdServiceResponsiveSearchAd reviewPath2(String reviewPath2) {
    
    this.reviewPath2 = reviewPath2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中の自動作成される表示URLを補足するパスです。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The path information which complements display URL generated automatically (Under review).&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewPath2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査中の自動作成される表示URLを補足するパスです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">The path information which complements display URL generated automatically (Under review).<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")
  @JsonProperty(JSON_PROPERTY_REVIEW_PATH2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewPath2() {
    return reviewPath2;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_PATH2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewPath2(String reviewPath2) {
    this.reviewPath2 = reviewPath2;
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
        Objects.equals(this.isRemovePath1, adGroupAdServiceResponsiveSearchAd.isRemovePath1) &&
        Objects.equals(this.path2, adGroupAdServiceResponsiveSearchAd.path2) &&
        Objects.equals(this.isRemovePath2, adGroupAdServiceResponsiveSearchAd.isRemovePath2) &&
        Objects.equals(this.reviewHeadlines, adGroupAdServiceResponsiveSearchAd.reviewHeadlines) &&
        Objects.equals(this.reviewDescriptions, adGroupAdServiceResponsiveSearchAd.reviewDescriptions) &&
        Objects.equals(this.reviewPath1, adGroupAdServiceResponsiveSearchAd.reviewPath1) &&
        Objects.equals(this.reviewPath2, adGroupAdServiceResponsiveSearchAd.reviewPath2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headlines, descriptions, path1, isRemovePath1, path2, isRemovePath2, reviewHeadlines, reviewDescriptions, reviewPath1, reviewPath2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceResponsiveSearchAd {\n");
    sb.append("    headlines: ").append(toIndentedString(headlines)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    path1: ").append(toIndentedString(path1)).append("\n");
    sb.append("    isRemovePath1: ").append(toIndentedString(isRemovePath1)).append("\n");
    sb.append("    path2: ").append(toIndentedString(path2)).append("\n");
    sb.append("    isRemovePath2: ").append(toIndentedString(isRemovePath2)).append("\n");
    sb.append("    reviewHeadlines: ").append(toIndentedString(reviewHeadlines)).append("\n");
    sb.append("    reviewDescriptions: ").append(toIndentedString(reviewDescriptions)).append("\n");
    sb.append("    reviewPath1: ").append(toIndentedString(reviewPath1)).append("\n");
    sb.append("    reviewPath2: ").append(toIndentedString(reviewPath2)).append("\n");
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

