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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※placeholderFieldがSTRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, ADDITIONAL_ADVANCED_MOBILE_URLSの場合、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; If the placeholderField is STRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, or ADDITIONAL_ADVANCED_MOBILE_URLS, this field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※placeholderFieldがSTRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, ADDITIONAL_ADVANCED_MOBILE_URLSの場合、ADDおよびSET時に必須となります。</div> <div lang=\"en\">This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> If the placeholderField is STRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, or ADDITIONAL_ADVANCED_MOBILE_URLS, this field is required in ADD and SET operation.</div> ")
@JsonPropertyOrder({
  FeedItemServiceSimpleFeedItemAttribute.JSON_PROPERTY_FEED_ATTRIBUTE_VALUE,
  FeedItemServiceSimpleFeedItemAttribute.JSON_PROPERTY_REVIEW_FEED_ATTRIBUTE_VALUE
})
@JsonTypeName("FeedItemServiceSimpleFeedItemAttribute")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItemServiceSimpleFeedItemAttribute {
  public static final String JSON_PROPERTY_FEED_ATTRIBUTE_VALUE = "feedAttributeValue";
  private String feedAttributeValue;

  public static final String JSON_PROPERTY_REVIEW_FEED_ATTRIBUTE_VALUE = "reviewFeedAttributeValue";
  private String reviewFeedAttributeValue;

  public FeedItemServiceSimpleFeedItemAttribute() { 
  }

  public FeedItemServiceSimpleFeedItemAttribute feedAttributeValue(String feedAttributeValue) {
    
    this.feedAttributeValue = feedAttributeValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードアイテム情報の値です。&lt;br&gt;&lt;br&gt; ※データ自動挿入の利用時は、属性は以下のように入力してください：&lt;br&gt; ・AD_CUSTOMIZER_INTEGER&lt;br&gt; ex) 99999999&lt;br&gt;・AD_CUSTOMIZER_PRICE&lt;br&gt; ex) 19800 or 19,800&lt;br&gt; ・AD_CUSTOMIZER_DATE&lt;br&gt; ex) 20151231 235959&lt;br&gt; ・AD_CUSTOMIZER_STRING&lt;br&gt; ex) home&lt;br&gt; ・STRUCTURED_SNIPPET_HEADER&lt;br&gt; ex) ブランド&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Value of feed item information.&lt;br&gt;&lt;br&gt; *When using data insertion, you need to enter attribution as follows:&lt;br&gt; ・AD_CUSTOMIZER_INTEGER&lt;br&gt; ex) 99999999&lt;br&gt; ・AD_CUSTOMIZER_PRICE&lt;br&gt; ex) 19800 or 19,800&lt;br&gt; ・AD_CUSTOMIZER_DATE&lt;br&gt; ex) 20151231 235959&lt;br&gt; ・AD_CUSTOMIZER_STRING&lt;br&gt; ex) home&lt;br&gt; ・STRUCTURED_SNIPPET_HEADER&lt;br&gt; ex) brand&lt;/div&gt; 
   * @return feedAttributeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">フィードアイテム情報の値です。<br><br> ※データ自動挿入の利用時は、属性は以下のように入力してください：<br> ・AD_CUSTOMIZER_INTEGER<br> ex) 99999999<br>・AD_CUSTOMIZER_PRICE<br> ex) 19800 or 19,800<br> ・AD_CUSTOMIZER_DATE<br> ex) 20151231 235959<br> ・AD_CUSTOMIZER_STRING<br> ex) home<br> ・STRUCTURED_SNIPPET_HEADER<br> ex) ブランド</div> <div lang=\"en\">Value of feed item information.<br><br> *When using data insertion, you need to enter attribution as follows:<br> ・AD_CUSTOMIZER_INTEGER<br> ex) 99999999<br> ・AD_CUSTOMIZER_PRICE<br> ex) 19800 or 19,800<br> ・AD_CUSTOMIZER_DATE<br> ex) 20151231 235959<br> ・AD_CUSTOMIZER_STRING<br> ex) home<br> ・STRUCTURED_SNIPPET_HEADER<br> ex) brand</div> ")
  @JsonProperty(JSON_PROPERTY_FEED_ATTRIBUTE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeedAttributeValue() {
    return feedAttributeValue;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ATTRIBUTE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedAttributeValue(String feedAttributeValue) {
    this.feedAttributeValue = feedAttributeValue;
  }


  public FeedItemServiceSimpleFeedItemAttribute reviewFeedAttributeValue(String reviewFeedAttributeValue) {
    
    this.reviewFeedAttributeValue = reviewFeedAttributeValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中のフィードアイテム情報です。&lt;br&gt; ※審査中の間のみ、レスポンス時に表示されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The feed item information on editorial review.&lt;br&gt; *It is displayed for response only on Editorial Review.&lt;/div&gt; 
   * @return reviewFeedAttributeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のフィードアイテム情報です。<br> ※審査中の間のみ、レスポンス時に表示されます。</div> <div lang=\"en\">The feed item information on editorial review.<br> *It is displayed for response only on Editorial Review.</div> ")
  @JsonProperty(JSON_PROPERTY_REVIEW_FEED_ATTRIBUTE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewFeedAttributeValue() {
    return reviewFeedAttributeValue;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_FEED_ATTRIBUTE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewFeedAttributeValue(String reviewFeedAttributeValue) {
    this.reviewFeedAttributeValue = reviewFeedAttributeValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceSimpleFeedItemAttribute feedItemServiceSimpleFeedItemAttribute = (FeedItemServiceSimpleFeedItemAttribute) o;
    return Objects.equals(this.feedAttributeValue, feedItemServiceSimpleFeedItemAttribute.feedAttributeValue) &&
        Objects.equals(this.reviewFeedAttributeValue, feedItemServiceSimpleFeedItemAttribute.reviewFeedAttributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedAttributeValue, reviewFeedAttributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceSimpleFeedItemAttribute {\n");
    sb.append("    feedAttributeValue: ").append(toIndentedString(feedAttributeValue)).append("\n");
    sb.append("    reviewFeedAttributeValue: ").append(toIndentedString(reviewFeedAttributeValue)).append("\n");
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

