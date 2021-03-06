/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.PageFeedItemServiceMatchType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServicePageFeedUrlオブジェクトは、ページフィードURL検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServicePageFeedUrl object stores search condition of page feed URL.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServicePageFeedUrlオブジェクトは、ページフィードURL検索条件を格納します。</div> <div lang=\"en\">PageFeedItemServicePageFeedUrl object stores search condition of page feed URL.</div> ")
@JsonPropertyOrder({
  PageFeedItemServicePageFeedUrl.JSON_PROPERTY_MATCH_TYPE,
  PageFeedItemServicePageFeedUrl.JSON_PROPERTY_TEXT
})
@JsonTypeName("PageFeedItemServicePageFeedUrl")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedItemServicePageFeedUrl {
  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private PageFeedItemServiceMatchType matchType;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public PageFeedItemServicePageFeedUrl() { 
  }

  public PageFeedItemServicePageFeedUrl matchType(PageFeedItemServiceMatchType matchType) {
    
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

  public PageFeedItemServiceMatchType getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchType(PageFeedItemServiceMatchType matchType) {
    this.matchType = matchType;
  }


  public PageFeedItemServicePageFeedUrl text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードURL&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Page feed URL&lt;/div&gt; 
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードURL</div> <div lang=\"en\">Page feed URL</div> ")
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
    PageFeedItemServicePageFeedUrl pageFeedItemServicePageFeedUrl = (PageFeedItemServicePageFeedUrl) o;
    return Objects.equals(this.matchType, pageFeedItemServicePageFeedUrl.matchType) &&
        Objects.equals(this.text, pageFeedItemServicePageFeedUrl.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServicePageFeedUrl {\n");
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

