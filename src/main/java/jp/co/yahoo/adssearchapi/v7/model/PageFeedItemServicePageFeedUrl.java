package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.PageFeedItemServiceMatchType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServicePageFeedUrlオブジェクトは、ページフィードURL検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServicePageFeedUrl object stores search condition of page feed URL.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServicePageFeedUrlオブジェクトは、ページフィードURL検索条件を格納します。</div> <div lang=\"en\">PageFeedItemServicePageFeedUrl object stores search condition of page feed URL.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServicePageFeedUrl   {
  @JsonProperty("matchType")
  private PageFeedItemServiceMatchType matchType = null;

  @JsonProperty("text")
  private String text = null;

  public PageFeedItemServicePageFeedUrl matchType(PageFeedItemServiceMatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * Get matchType
   * @return matchType
  */
  @ApiModelProperty(value = "")

  @Valid

  public PageFeedItemServiceMatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(PageFeedItemServiceMatchType matchType) {
    this.matchType = matchType;
  }

  public PageFeedItemServicePageFeedUrl text(String text) {
    this.text = text;
    return this;
  }

  /**
   * <div lang=\"ja\">ページフィードURL</div> <div lang=\"en\">Page feed URL</div> 
   * @return text
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードURL</div> <div lang=\"en\">Page feed URL</div> ")


  public String getText() {
    return text;
  }

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

