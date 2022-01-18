package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceStructuredSnippetAssetオブジェクトは、カテゴリ補足オプションのアセット情報を格納します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※typeがSTRUCTURED_SNIPPETの場合は必須です。&lt;br&gt; 詳細は以下のヘルプを参照してください。&lt;br&gt; ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan&#x3D;ja&amp;aid&#x3D;22635\&quot;&gt;補足カテゴリーと補足内容の入力例（カテゴリ補足オプション）&lt;/a&gt;&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceStructuredSnippetAsset contains Asset value information for structured snippet options.&lt;br&gt; This field is optional in ADD operation. *If type is STRUCTURED_SNIPPET, this field is required.&lt;br&gt; See also the help below.&lt;br&gt; * &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan&#x3D;en&amp;aid&#x3D;16235\&quot;&gt;Example of Category and Text (Category Text)&lt;/a&gt;&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceStructuredSnippetAssetオブジェクトは、カテゴリ補足オプションのアセット情報を格納します。<br> ADD時、このフィールドは省略可能となります。※typeがSTRUCTURED_SNIPPETの場合は必須です。<br> 詳細は以下のヘルプを参照してください。<br> ・<a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=ja&aid=22635\">補足カテゴリーと補足内容の入力例（カテゴリ補足オプション）</a></div> <div lang=\"en\">AssetServiceStructuredSnippetAsset contains Asset value information for structured snippet options.<br> This field is optional in ADD operation. *If type is STRUCTURED_SNIPPET, this field is required.<br> See also the help below.<br> * <a href=\"https://ads-help.yahoo.co.jp/yahooads/ss/articledetail?lan=en&aid=16235\">Example of Category and Text (Category Text)</a></div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AssetServiceStructuredSnippetAsset   {
  @JsonProperty("header")
  private String header = null;

  @JsonProperty("reviewHeader")
  private String reviewHeader = null;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  @JsonProperty("reviewValues")
  @Valid
  private List<String> reviewValues = null;

  public AssetServiceStructuredSnippetAsset header(String header) {
    this.header = header;
    return this;
  }

  /**
   * <div lang=\"ja\">ヘッダーです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">header.<br> This field is required in ADD operation.</div> 
   * @return header
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ヘッダーです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">header.<br> This field is required in ADD operation.</div> ")


  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public AssetServiceStructuredSnippetAsset reviewHeader(String reviewHeader) {
    this.reviewHeader = reviewHeader;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中のヘッダーです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">header on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> 
   * @return reviewHeader
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のヘッダーです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">header on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")


  public String getReviewHeader() {
    return reviewHeader;
  }

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
   * <div lang=\"ja\">バリューです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">value.<br> This field is required in ADD operation.</div> 
   * @return values
  */
  @ApiModelProperty(value = "<div lang=\"ja\">バリューです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">value.<br> This field is required in ADD operation.</div> ")


  public List<String> getValues() {
    return values;
  }

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
   * <div lang=\"ja\">レビュー中のバリューです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">value on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> 
   * @return reviewValues
  */
  @ApiModelProperty(value = "<div lang=\"ja\">レビュー中のバリューです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">value on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")


  public List<String> getReviewValues() {
    return reviewValues;
  }

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

