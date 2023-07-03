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
import jp.co.yahoo.adssearchapi.v11.model.FeedServicePlaceholderField;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedServiceAttributeオブジェクトは、自動データ挿入のリストの属性を格納します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedServiceAttribute object contains the attribute of auto data insertion list.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedServiceAttribute.JSON_PROPERTY_FEED_ATTRIBUTE_ID,
  FeedServiceAttribute.JSON_PROPERTY_FEED_ATTRIBUTE_NAME,
  FeedServiceAttribute.JSON_PROPERTY_PLACEHOLDER_FIELD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedServiceAttribute {
  public static final String JSON_PROPERTY_FEED_ATTRIBUTE_ID = "feedAttributeId";
  private Long feedAttributeId;

  public static final String JSON_PROPERTY_FEED_ATTRIBUTE_NAME = "feedAttributeName";
  private String feedAttributeName;

  public static final String JSON_PROPERTY_PLACEHOLDER_FIELD = "placeholderField";
  private FeedServicePlaceholderField placeholderField;

  public FeedServiceAttribute() {
  }

  public FeedServiceAttribute feedAttributeId(Long feedAttributeId) {
    
    this.feedAttributeId = feedAttributeId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動データ挿入のリストの属性（カラム）IDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Attribute ID (column ID) of auto data insertion list.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return feedAttributeId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ATTRIBUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedAttributeId() {
    return feedAttributeId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ATTRIBUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedAttributeId(Long feedAttributeId) {
    this.feedAttributeId = feedAttributeId;
  }


  public FeedServiceAttribute feedAttributeName(String feedAttributeName) {
    
    this.feedAttributeName = feedAttributeName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動データ挿入のリストの属性（カラム）名です。&lt;br&gt; このフィールドはADDおよびSET時に必須となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Attribute name (column name) of auto data insertion list.&lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return feedAttributeName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ATTRIBUTE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeedAttributeName() {
    return feedAttributeName;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ATTRIBUTE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedServicePlaceholderField getPlaceholderField() {
    return placeholderField;
  }


  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

