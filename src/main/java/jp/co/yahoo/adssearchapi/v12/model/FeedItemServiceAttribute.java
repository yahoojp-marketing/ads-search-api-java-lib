/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceMultipleFeedItemAttribute;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServicePlaceholderField;
import jp.co.yahoo.adssearchapi.v12.model.FeedItemServiceSimpleFeedItemAttribute;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceAttributeオブジェクトは、フィードアイテムの属性情報の値を格納します。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; SET時にfeedItemAttributeを指定するとすべて上書きされます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceAttribute object holds the value of Feed Item information.&lt;br&gt; This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation.&lt;br&gt; If feedItemAttribute is specified in SET operation, it will be overwritten. &lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedItemServiceAttribute.JSON_PROPERTY_FEED_ATTRIBUTE_ID,
  FeedItemServiceAttribute.JSON_PROPERTY_MULTIPLE_FEED_ITEM_ATTRIBUTE,
  FeedItemServiceAttribute.JSON_PROPERTY_PLACEHOLDER_FIELD,
  FeedItemServiceAttribute.JSON_PROPERTY_SIMPLE_FEED_ITEM_ATTRIBUTE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItemServiceAttribute {
  public static final String JSON_PROPERTY_FEED_ATTRIBUTE_ID = "feedAttributeId";
  private Long feedAttributeId;

  public static final String JSON_PROPERTY_MULTIPLE_FEED_ITEM_ATTRIBUTE = "multipleFeedItemAttribute";
  private FeedItemServiceMultipleFeedItemAttribute multipleFeedItemAttribute;

  public static final String JSON_PROPERTY_PLACEHOLDER_FIELD = "placeholderField";
  private FeedItemServicePlaceholderField placeholderField;

  public static final String JSON_PROPERTY_SIMPLE_FEED_ITEM_ATTRIBUTE = "simpleFeedItemAttribute";
  private FeedItemServiceSimpleFeedItemAttribute simpleFeedItemAttribute;

  public FeedItemServiceAttribute() {
  }

  public FeedItemServiceAttribute feedAttributeId(Long feedAttributeId) {
    
    this.feedAttributeId = feedAttributeId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィード属性IDです。&lt;br&gt; このフィールドは、ADDおよびSET時に無視されます。&lt;br&gt; ※アドカスタマイザーの場合は、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed attribute ID.&lt;br&gt; This field will be ignored in ADD and SET operation.&lt;br&gt; *For AD_CUSTOMIZER, this field is required in ADD and SET operation.&lt;/div&gt; 
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


  public FeedItemServiceAttribute multipleFeedItemAttribute(FeedItemServiceMultipleFeedItemAttribute multipleFeedItemAttribute) {
    
    this.multipleFeedItemAttribute = multipleFeedItemAttribute;
    return this;
  }

   /**
   * Get multipleFeedItemAttribute
   * @return multipleFeedItemAttribute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTIPLE_FEED_ITEM_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceMultipleFeedItemAttribute getMultipleFeedItemAttribute() {
    return multipleFeedItemAttribute;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLE_FEED_ITEM_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServicePlaceholderField getPlaceholderField() {
    return placeholderField;
  }


  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIMPLE_FEED_ITEM_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceSimpleFeedItemAttribute getSimpleFeedItemAttribute() {
    return simpleFeedItemAttribute;
  }


  @JsonProperty(JSON_PROPERTY_SIMPLE_FEED_ITEM_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

