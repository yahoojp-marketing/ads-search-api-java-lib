/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v10.model.FeedItemServiceFeedAttributeValue;
import jp.co.yahoo.adssearchapi.v10.model.FeedItemServiceIsRemove;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時には無視されます。&lt;br&gt; ※placeholderFieldがSTRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, ADDITIONAL_ADVANCED_MOBILE_URLSの場合、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; If the placeholderField is STRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, or ADDITIONAL_ADVANCED_MOBILE_URLS, this field is required in ADD and SET operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedItemServiceMultipleFeedItemAttribute.JSON_PROPERTY_FEED_ATTRIBUTE_VALUES,
  FeedItemServiceMultipleFeedItemAttribute.JSON_PROPERTY_IS_REMOVE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItemServiceMultipleFeedItemAttribute {
  public static final String JSON_PROPERTY_FEED_ATTRIBUTE_VALUES = "feedAttributeValues";
  private List<FeedItemServiceFeedAttributeValue> feedAttributeValues;

  public static final String JSON_PROPERTY_IS_REMOVE = "isRemove";
  private FeedItemServiceIsRemove isRemove;

  public FeedItemServiceMultipleFeedItemAttribute() {
  }

  public FeedItemServiceMultipleFeedItemAttribute feedAttributeValues(List<FeedItemServiceFeedAttributeValue> feedAttributeValues) {
    
    this.feedAttributeValues = feedAttributeValues;
    return this;
  }

  public FeedItemServiceMultipleFeedItemAttribute addFeedAttributeValuesItem(FeedItemServiceFeedAttributeValue feedAttributeValuesItem) {
    if (this.feedAttributeValues == null) {
      this.feedAttributeValues = new ArrayList<>();
    }
    this.feedAttributeValues.add(feedAttributeValuesItem);
    return this;
  }

   /**
   * Get feedAttributeValues
   * @return feedAttributeValues
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ATTRIBUTE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeedItemServiceFeedAttributeValue> getFeedAttributeValues() {
    return feedAttributeValues;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ATTRIBUTE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedAttributeValues(List<FeedItemServiceFeedAttributeValue> feedAttributeValues) {
    this.feedAttributeValues = feedAttributeValues;
  }


  public FeedItemServiceMultipleFeedItemAttribute isRemove(FeedItemServiceIsRemove isRemove) {
    
    this.isRemove = isRemove;
    return this;
  }

   /**
   * Get isRemove
   * @return isRemove
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceIsRemove getIsRemove() {
    return isRemove;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemove(FeedItemServiceIsRemove isRemove) {
    this.isRemove = isRemove;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceMultipleFeedItemAttribute feedItemServiceMultipleFeedItemAttribute = (FeedItemServiceMultipleFeedItemAttribute) o;
    return Objects.equals(this.feedAttributeValues, feedItemServiceMultipleFeedItemAttribute.feedAttributeValues) &&
        Objects.equals(this.isRemove, feedItemServiceMultipleFeedItemAttribute.isRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedAttributeValues, isRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceMultipleFeedItemAttribute {\n");
    sb.append("    feedAttributeValues: ").append(toIndentedString(feedAttributeValues)).append("\n");
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
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

