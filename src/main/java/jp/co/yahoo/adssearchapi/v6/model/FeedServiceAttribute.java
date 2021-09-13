package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.FeedServicePlaceholderField;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedServiceAttributeオブジェクトは、自動データ挿入のリストの属性を格納します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedServiceAttribute object contains the attribute of auto data insertion list.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedServiceAttributeオブジェクトは、自動データ挿入のリストの属性を格納します。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">FeedServiceAttribute object contains the attribute of auto data insertion list.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedServiceAttribute   {
  @JsonProperty("feedAttributeId")
  private Long feedAttributeId = null;

  @JsonProperty("feedAttributeName")
  private String feedAttributeName = null;

  @JsonProperty("placeholderField")
  private FeedServicePlaceholderField placeholderField = null;

  public FeedServiceAttribute feedAttributeId(Long feedAttributeId) {
    this.feedAttributeId = feedAttributeId;
    return this;
  }

  /**
   * <div lang=\"ja\">自動データ挿入のリストの属性（カラム）IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Attribute ID (column ID) of auto data insertion list.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return feedAttributeId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動データ挿入のリストの属性（カラム）IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Attribute ID (column ID) of auto data insertion list.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getFeedAttributeId() {
    return feedAttributeId;
  }

  public void setFeedAttributeId(Long feedAttributeId) {
    this.feedAttributeId = feedAttributeId;
  }

  public FeedServiceAttribute feedAttributeName(String feedAttributeName) {
    this.feedAttributeName = feedAttributeName;
    return this;
  }

  /**
   * <div lang=\"ja\">自動データ挿入のリストの属性（カラム）名です。<br> このフィールドはADDおよびSET時に必須となり、REMOVE時に無視されます。</div> <div lang=\"en\">Attribute name (column name) of auto data insertion list.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.</div> 
   * @return feedAttributeName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動データ挿入のリストの属性（カラム）名です。<br> このフィールドはADDおよびSET時に必須となり、REMOVE時に無視されます。</div> <div lang=\"en\">Attribute name (column name) of auto data insertion list.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")


  public String getFeedAttributeName() {
    return feedAttributeName;
  }

  public void setFeedAttributeName(String feedAttributeName) {
    this.feedAttributeName = feedAttributeName;
  }

  public FeedServiceAttribute placeholderField(FeedServicePlaceholderField placeholderField) {
    this.placeholderField = placeholderField;
    return this;
  }

  /**
   * Get placeholderField
   * @return placeholderField
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedServicePlaceholderField getPlaceholderField() {
    return placeholderField;
  }

  public void setPlaceholderField(FeedServicePlaceholderField placeholderField) {
    this.placeholderField = placeholderField;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedServiceAttribute feedServiceAttribute = (FeedServiceAttribute) o;
    return Objects.equals(this.feedAttributeId, feedServiceAttribute.feedAttributeId) &&
        Objects.equals(this.feedAttributeName, feedServiceAttribute.feedAttributeName) &&
        Objects.equals(this.placeholderField, feedServiceAttribute.placeholderField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedAttributeId, feedAttributeName, placeholderField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedServiceAttribute {\n");
    
    sb.append("    feedAttributeId: ").append(toIndentedString(feedAttributeId)).append("\n");
    sb.append("    feedAttributeName: ").append(toIndentedString(feedAttributeName)).append("\n");
    sb.append("    placeholderField: ").append(toIndentedString(placeholderField)).append("\n");
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

