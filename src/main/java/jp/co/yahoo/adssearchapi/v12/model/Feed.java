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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v12.model.FeedServiceAttribute;
import jp.co.yahoo.adssearchapi.v12.model.FeedServicePlaceholderType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedオブジェクトは、自動データ挿入のリストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed object is the list of Data elements on auto data insertion.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  Feed.JSON_PROPERTY_ACCOUNT_ID,
  Feed.JSON_PROPERTY_DOMAIN,
  Feed.JSON_PROPERTY_FEED_ATTRIBUTE,
  Feed.JSON_PROPERTY_FEED_ID,
  Feed.JSON_PROPERTY_FEED_NAME,
  Feed.JSON_PROPERTY_FEED_TRACK_ID,
  Feed.JSON_PROPERTY_PLACEHOLDER_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Feed {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_FEED_ATTRIBUTE = "feedAttribute";
  private List<FeedServiceAttribute> feedAttribute;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_FEED_NAME = "feedName";
  private String feedName;

  public static final String JSON_PROPERTY_FEED_TRACK_ID = "feedTrackId";
  private Long feedTrackId;

  public static final String JSON_PROPERTY_PLACEHOLDER_TYPE = "placeholderType";
  private FeedServicePlaceholderType placeholderType;

  public Feed() {
  }

  public Feed accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; ※入稿の仕様変更により不要になりました。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; *Not required by design change on editorials.　&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public Feed domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ドメインです。&lt;br&gt; このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Domain.&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.&lt;/div&gt; 
   * @return domain
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public Feed feedAttribute(List<FeedServiceAttribute> feedAttribute) {
    
    this.feedAttribute = feedAttribute;
    return this;
  }

  public Feed addFeedAttributeItem(FeedServiceAttribute feedAttributeItem) {
    if (this.feedAttribute == null) {
      this.feedAttribute = new ArrayList<>();
    }
    this.feedAttribute.add(feedAttributeItem);
    return this;
  }

   /**
   * Get feedAttribute
   * @return feedAttribute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeedServiceAttribute> getFeedAttribute() {
    return feedAttribute;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedAttribute(List<FeedServiceAttribute> feedAttribute) {
    this.feedAttribute = feedAttribute;
  }


  public Feed feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となり、ADD時は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID.&lt;br&gt; This field is required in SET and REMOVE operation, and will be ignored in ADD operation.&lt;/div&gt; 
   * @return feedId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedId() {
    return feedId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }


  public Feed feedName(String feedName) {
    
    this.feedName = feedName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedのリスト名です。&lt;br&gt; このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;List name of Feed.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET and REMOVE operation.&lt;/div&gt; 
   * @return feedName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeedName() {
    return feedName;
  }


  @JsonProperty(JSON_PROPERTY_FEED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedName(String feedName) {
    this.feedName = feedName;
  }


  public Feed feedTrackId(Long feedTrackId) {
    
    this.feedTrackId = feedTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedのトラッキング用IDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking ID of Feed.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return feedTrackId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEED_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFeedTrackId() {
    return feedTrackId;
  }


  @JsonProperty(JSON_PROPERTY_FEED_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedTrackId(Long feedTrackId) {
    this.feedTrackId = feedTrackId;
  }


  public Feed placeholderType(FeedServicePlaceholderType placeholderType) {
    
    this.placeholderType = placeholderType;
    return this;
  }

   /**
   * Get placeholderType
   * @return placeholderType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedServicePlaceholderType getPlaceholderType() {
    return placeholderType;
  }


  @JsonProperty(JSON_PROPERTY_PLACEHOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlaceholderType(FeedServicePlaceholderType placeholderType) {
    this.placeholderType = placeholderType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feed feed = (Feed) o;
    return Objects.equals(this.accountId, feed.accountId) &&
        Objects.equals(this.domain, feed.domain) &&
        Objects.equals(this.feedAttribute, feed.feedAttribute) &&
        Objects.equals(this.feedId, feed.feedId) &&
        Objects.equals(this.feedName, feed.feedName) &&
        Objects.equals(this.feedTrackId, feed.feedTrackId) &&
        Objects.equals(this.placeholderType, feed.placeholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, domain, feedAttribute, feedId, feedName, feedTrackId, placeholderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feed {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    feedAttribute: ").append(toIndentedString(feedAttribute)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    feedName: ").append(toIndentedString(feedName)).append("\n");
    sb.append("    feedTrackId: ").append(toIndentedString(feedTrackId)).append("\n");
    sb.append("    placeholderType: ").append(toIndentedString(placeholderType)).append("\n");
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

