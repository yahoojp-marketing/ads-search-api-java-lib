package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceSetTrademarkStatusオブジェクトは、フィードアイテムの情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceSetTrademarkStatus object holds feed item information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceSetTrademarkStatusオブジェクトは、フィードアイテムの情報を格納します。</div> <div lang=\"en\">FeedItemServiceSetTrademarkStatus object holds feed item information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceSetTrademarkStatus   {
  @JsonProperty("feedItemId")
  private Long feedItemId = null;

  public FeedItemServiceSetTrademarkStatus feedItemId(Long feedItemId) {
    this.feedItemId = feedItemId;
    return this;
  }

  /**
   * <div lang=\"ja\">フィードアイテムIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">FeedItem ID.<br>This field is required.</div> 
   * @return feedItemId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードアイテムIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">FeedItem ID.<br>This field is required.</div> ")


  public Long getFeedItemId() {
    return feedItemId;
  }

  public void setFeedItemId(Long feedItemId) {
    this.feedItemId = feedItemId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceSetTrademarkStatus feedItemServiceSetTrademarkStatus = (FeedItemServiceSetTrademarkStatus) o;
    return Objects.equals(this.feedItemId, feedItemServiceSetTrademarkStatus.feedItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedItemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceSetTrademarkStatus {\n");
    
    sb.append("    feedItemId: ").append(toIndentedString(feedItemId)).append("\n");
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

