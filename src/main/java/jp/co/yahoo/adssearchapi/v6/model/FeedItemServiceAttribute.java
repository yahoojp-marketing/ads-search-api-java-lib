package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.FeedItemServiceMultipleFeedItemAttribute;
import jp.co.yahoo.adssearchapi.v6.model.FeedItemServicePlaceholderField;
import jp.co.yahoo.adssearchapi.v6.model.FeedItemServiceSimpleFeedItemAttribute;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceAttributeオブジェクトは、フィードアイテムの属性情報の値を格納します。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; SET時にfeedItemAttributeを指定するとすべて上書きされます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceAttribute object holds the value of Feed Item information.&lt;br&gt; This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation.&lt;br&gt; If feedItemAttribute is specified in SET operation, it will be overwritten. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceAttributeオブジェクトは、フィードアイテムの属性情報の値を格納します。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となり、REMOVE時に無視されます。<br> SET時にfeedItemAttributeを指定するとすべて上書きされます。 </div> <div lang=\"en\">FeedItemServiceAttribute object holds the value of Feed Item information.<br> This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation.<br> If feedItemAttribute is specified in SET operation, it will be overwritten. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceAttribute   {
  @JsonProperty("feedAttributeId")
  private Long feedAttributeId = null;

  @JsonProperty("multipleFeedItemAttribute")
  private FeedItemServiceMultipleFeedItemAttribute multipleFeedItemAttribute = null;

  @JsonProperty("placeholderField")
  private FeedItemServicePlaceholderField placeholderField = null;

  @JsonProperty("simpleFeedItemAttribute")
  private FeedItemServiceSimpleFeedItemAttribute simpleFeedItemAttribute = null;

  public FeedItemServiceAttribute feedAttributeId(Long feedAttributeId) {
    this.feedAttributeId = feedAttributeId;
    return this;
  }

  /**
   * <div lang=\"ja\">フィード属性IDです。<br> このフィールドは、ADDおよびSET時に無視されます。<br> ※アドカスタマイザーの場合は、ADDおよびSET時に必須となります。</div> <div lang=\"en\">Feed attribute ID.<br> This field will be ignored in ADD and SET operation.<br> *For AD_CUSTOMIZER, this field is required in ADD and SET operation.</div> 
   * @return feedAttributeId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィード属性IDです。<br> このフィールドは、ADDおよびSET時に無視されます。<br> ※アドカスタマイザーの場合は、ADDおよびSET時に必須となります。</div> <div lang=\"en\">Feed attribute ID.<br> This field will be ignored in ADD and SET operation.<br> *For AD_CUSTOMIZER, this field is required in ADD and SET operation.</div> ")


  public Long getFeedAttributeId() {
    return feedAttributeId;
  }

  public void setFeedAttributeId(Long feedAttributeId) {
    this.feedAttributeId = feedAttributeId;
  }

  public FeedItemServiceAttribute multipleFeedItemAttribute(FeedItemServiceMultipleFeedItemAttribute multipleFeedItemAttribute) {
    this.multipleFeedItemAttribute = multipleFeedItemAttribute;
    return this;
  }

  /**
   * Get multipleFeedItemAttribute
   * @return multipleFeedItemAttribute
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedItemServiceMultipleFeedItemAttribute getMultipleFeedItemAttribute() {
    return multipleFeedItemAttribute;
  }

  public void setMultipleFeedItemAttribute(FeedItemServiceMultipleFeedItemAttribute multipleFeedItemAttribute) {
    this.multipleFeedItemAttribute = multipleFeedItemAttribute;
  }

  public FeedItemServiceAttribute placeholderField(FeedItemServicePlaceholderField placeholderField) {
    this.placeholderField = placeholderField;
    return this;
  }

  /**
   * Get placeholderField
   * @return placeholderField
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedItemServicePlaceholderField getPlaceholderField() {
    return placeholderField;
  }

  public void setPlaceholderField(FeedItemServicePlaceholderField placeholderField) {
    this.placeholderField = placeholderField;
  }

  public FeedItemServiceAttribute simpleFeedItemAttribute(FeedItemServiceSimpleFeedItemAttribute simpleFeedItemAttribute) {
    this.simpleFeedItemAttribute = simpleFeedItemAttribute;
    return this;
  }

  /**
   * Get simpleFeedItemAttribute
   * @return simpleFeedItemAttribute
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedItemServiceSimpleFeedItemAttribute getSimpleFeedItemAttribute() {
    return simpleFeedItemAttribute;
  }

  public void setSimpleFeedItemAttribute(FeedItemServiceSimpleFeedItemAttribute simpleFeedItemAttribute) {
    this.simpleFeedItemAttribute = simpleFeedItemAttribute;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceAttribute feedItemServiceAttribute = (FeedItemServiceAttribute) o;
    return Objects.equals(this.feedAttributeId, feedItemServiceAttribute.feedAttributeId) &&
        Objects.equals(this.multipleFeedItemAttribute, feedItemServiceAttribute.multipleFeedItemAttribute) &&
        Objects.equals(this.placeholderField, feedItemServiceAttribute.placeholderField) &&
        Objects.equals(this.simpleFeedItemAttribute, feedItemServiceAttribute.simpleFeedItemAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedAttributeId, multipleFeedItemAttribute, placeholderField, simpleFeedItemAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceAttribute {\n");
    
    sb.append("    feedAttributeId: ").append(toIndentedString(feedAttributeId)).append("\n");
    sb.append("    multipleFeedItemAttribute: ").append(toIndentedString(multipleFeedItemAttribute)).append("\n");
    sb.append("    placeholderField: ").append(toIndentedString(placeholderField)).append("\n");
    sb.append("    simpleFeedItemAttribute: ").append(toIndentedString(simpleFeedItemAttribute)).append("\n");
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

