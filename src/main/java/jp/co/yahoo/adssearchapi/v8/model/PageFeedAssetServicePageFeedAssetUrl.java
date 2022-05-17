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
import jp.co.yahoo.adssearchapi.v8.model.PageFeedAssetServiceMatchType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetServicePageFeedAssetUrlオブジェクトは、ページフィードアセットURL検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetServicePageFeedAssetUrl object stores search condition of page feed asset URL.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedAssetServicePageFeedAssetUrlオブジェクトは、ページフィードアセットURL検索条件を格納します。</div> <div lang=\"en\">PageFeedAssetServicePageFeedAssetUrl object stores search condition of page feed asset URL.</div> ")
@JsonPropertyOrder({
  PageFeedAssetServicePageFeedAssetUrl.JSON_PROPERTY_MATCH_TYPE,
  PageFeedAssetServicePageFeedAssetUrl.JSON_PROPERTY_TEXT
})
@JsonTypeName("PageFeedAssetServicePageFeedAssetUrl")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAssetServicePageFeedAssetUrl {
  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private PageFeedAssetServiceMatchType matchType;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public PageFeedAssetServicePageFeedAssetUrl() { 
  }

  public PageFeedAssetServicePageFeedAssetUrl matchType(PageFeedAssetServiceMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedAssetServiceMatchType getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchType(PageFeedAssetServiceMatchType matchType) {
    this.matchType = matchType;
  }


  public PageFeedAssetServicePageFeedAssetUrl text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットのURL&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Url of page feed asset.&lt;/div&gt; 
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードアセットのURL</div> <div lang=\"en\">Url of page feed asset.</div> ")
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
    PageFeedAssetServicePageFeedAssetUrl pageFeedAssetServicePageFeedAssetUrl = (PageFeedAssetServicePageFeedAssetUrl) o;
    return Objects.equals(this.matchType, pageFeedAssetServicePageFeedAssetUrl.matchType) &&
        Objects.equals(this.text, pageFeedAssetServicePageFeedAssetUrl.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAssetServicePageFeedAssetUrl {\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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

