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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceStructuredSnippetAssetオブジェクトは、カテゴリ補足アセットのアセット情報を格納します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※typeがSTRUCTURED_SNIPPETの場合は必須です。&lt;br&gt; 詳細は以下のヘルプを参照してください。&lt;br&gt; ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan&#x3D;ja&amp;aid&#x3D;22635\&quot;&gt;補足カテゴリーと補足内容の入力例（カテゴリ補足アセット）&lt;/a&gt;&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceStructuredSnippetAsset contains Asset value information for category snippet asset.&lt;br&gt; This field is optional in ADD operation. *If type is STRUCTURED_SNIPPET, this field is required.&lt;br&gt; See also the help below.&lt;br&gt; * &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan&#x3D;en&amp;aid&#x3D;16235\&quot;&gt;Example of supplemental category and supplemental text (Category snippet asset)&lt;/a&gt;&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceStructuredSnippetAssetオブジェクトは、カテゴリ補足アセットのアセット情報を格納します。<br> ADD時、このフィールドは省略可能となります。※typeがSTRUCTURED_SNIPPETの場合は必須です。<br> 詳細は以下のヘルプを参照してください。<br> ・<a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=ja&aid=22635\">補足カテゴリーと補足内容の入力例（カテゴリ補足アセット）</a></div> <div lang=\"en\">AssetServiceStructuredSnippetAsset contains Asset value information for category snippet asset.<br> This field is optional in ADD operation. *If type is STRUCTURED_SNIPPET, this field is required.<br> See also the help below.<br> * <a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=en&aid=16235\">Example of supplemental category and supplemental text (Category snippet asset)</a></div> ")
@JsonPropertyOrder({
  AssetServiceStructuredSnippetAsset.JSON_PROPERTY_HEADER,
  AssetServiceStructuredSnippetAsset.JSON_PROPERTY_REVIEW_HEADER,
  AssetServiceStructuredSnippetAsset.JSON_PROPERTY_VALUES,
  AssetServiceStructuredSnippetAsset.JSON_PROPERTY_REVIEW_VALUES
})
@JsonTypeName("AssetServiceStructuredSnippetAsset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetServiceStructuredSnippetAsset {
  public static final String JSON_PROPERTY_HEADER = "header";
  private String header;

  public static final String JSON_PROPERTY_REVIEW_HEADER = "reviewHeader";
  private String reviewHeader;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public static final String JSON_PROPERTY_REVIEW_VALUES = "reviewValues";
  private List<String> reviewValues = null;

  public AssetServiceStructuredSnippetAsset() { 
  }

  public AssetServiceStructuredSnippetAsset header(String header) {
    
    this.header = header;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ヘッダーです。&lt;br&gt; ADDおよびSET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;header.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ヘッダーです。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">header.<br> This field is required in ADD and SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeader() {
    return header;
  }


  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeader(String header) {
    this.header = header;
  }


  public AssetServiceStructuredSnippetAsset reviewHeader(String reviewHeader) {
    
    this.reviewHeader = reviewHeader;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中のヘッダーです。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;header on editorial review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のヘッダーです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">header on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")
  @JsonProperty(JSON_PROPERTY_REVIEW_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewHeader() {
    return reviewHeader;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewHeader(String reviewHeader) {
    this.reviewHeader = reviewHeader;
  }


  public AssetServiceStructuredSnippetAsset values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public AssetServiceStructuredSnippetAsset addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;バリューです。&lt;br&gt; ADDおよびSET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;value.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">バリューです。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">value.<br> This field is required in ADD and SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(List<String> values) {
    this.values = values;
  }


  public AssetServiceStructuredSnippetAsset reviewValues(List<String> reviewValues) {
    
    this.reviewValues = reviewValues;
    return this;
  }

  public AssetServiceStructuredSnippetAsset addReviewValuesItem(String reviewValuesItem) {
    if (this.reviewValues == null) {
      this.reviewValues = new ArrayList<>();
    }
    this.reviewValues.add(reviewValuesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;レビュー中のバリューです。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;value on editorial review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">レビュー中のバリューです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">value on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")
  @JsonProperty(JSON_PROPERTY_REVIEW_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getReviewValues() {
    return reviewValues;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewValues(List<String> reviewValues) {
    this.reviewValues = reviewValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetServiceStructuredSnippetAsset assetServiceStructuredSnippetAsset = (AssetServiceStructuredSnippetAsset) o;
    return Objects.equals(this.header, assetServiceStructuredSnippetAsset.header) &&
        Objects.equals(this.reviewHeader, assetServiceStructuredSnippetAsset.reviewHeader) &&
        Objects.equals(this.values, assetServiceStructuredSnippetAsset.values) &&
        Objects.equals(this.reviewValues, assetServiceStructuredSnippetAsset.reviewValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, reviewHeader, values, reviewValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceStructuredSnippetAsset {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    reviewHeader: ").append(toIndentedString(reviewHeader)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    reviewValues: ").append(toIndentedString(reviewValues)).append("\n");
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

