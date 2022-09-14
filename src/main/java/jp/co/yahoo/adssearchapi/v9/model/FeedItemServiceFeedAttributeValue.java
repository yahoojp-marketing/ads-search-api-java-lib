/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceFeedAttributeValueオブジェクトは、フィードアイテムの属性値を表示します。&lt;br&gt; 更新時にfeedAttributeValueを指定するとすべて上書きされ、未指定のfeedAttributeValueの属性情報は削除されます。&lt;br&gt; feedAttributeValueに空文字を指定すると、下記の場合のみフィードアイテムの属性情報は削除されます。   &lt;table border&#x3D;\&quot;1\&quot;&gt;     &lt;thead&gt;       &lt;tr&gt;         &lt;th&gt;placeholderType&lt;/th&gt;         &lt;th&gt;placeholderField&lt;/th&gt;       &lt;/tr&gt;     &lt;/thead&gt;     &lt;tbody&gt;       &lt;tr&gt;         &lt;td&gt;QUICKLINK&lt;/td&gt;         &lt;td&gt;ADVANCED_MOBILE_URL&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;QUICKLINK&lt;/td&gt;         &lt;td&gt;TRACKING_URL&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;AD_CUTOMIZER&lt;/td&gt;         &lt;td&gt;any&lt;/td&gt;       &lt;/tr&gt;     &lt;/tbody&gt;   &lt;/table&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceFeedAttributeValue object describes FeedItem attribute value.&lt;br&gt;   Upon updating, if feedAttributeValue is specified, the attribute information will be overwritten, but if feedAttributeValue is not specified, it will be deleted.&lt;br&gt;   If an empty string is specified in feedAttributeValue, the attribute information of the feed item will be deleted only for the following cases.   &lt;table border&#x3D;\&quot;1\&quot;&gt;     &lt;thead&gt;       &lt;tr&gt;         &lt;th&gt;placeholderType&lt;/th&gt;         &lt;th&gt;placeholderField&lt;/th&gt;       &lt;/tr&gt;     &lt;/thead&gt;     &lt;tbody&gt;       &lt;tr&gt;         &lt;td&gt;QUICKLINK&lt;/td&gt;         &lt;td&gt;ADVANCED_MOBILE_URL&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;QUICKLINK&lt;/td&gt;         &lt;td&gt;TRACKING_URL&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;AD_CUTOMIZER&lt;/td&gt;         &lt;td&gt;any&lt;/td&gt;       &lt;/tr&gt;     &lt;/tbody&gt;   &lt;/table&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceFeedAttributeValueオブジェクトは、フィードアイテムの属性値を表示します。<br> 更新時にfeedAttributeValueを指定するとすべて上書きされ、未指定のfeedAttributeValueの属性情報は削除されます。<br> feedAttributeValueに空文字を指定すると、下記の場合のみフィードアイテムの属性情報は削除されます。   <table border=\"1\">     <thead>       <tr>         <th>placeholderType</th>         <th>placeholderField</th>       </tr>     </thead>     <tbody>       <tr>         <td>QUICKLINK</td>         <td>ADVANCED_MOBILE_URL</td>       </tr>       <tr>         <td>QUICKLINK</td>         <td>TRACKING_URL</td>       </tr>       <tr>         <td>AD_CUTOMIZER</td>         <td>any</td>       </tr>     </tbody>   </table> </div> <div lang=\"en\">FeedItemServiceFeedAttributeValue object describes FeedItem attribute value.<br>   Upon updating, if feedAttributeValue is specified, the attribute information will be overwritten, but if feedAttributeValue is not specified, it will be deleted.<br>   If an empty string is specified in feedAttributeValue, the attribute information of the feed item will be deleted only for the following cases.   <table border=\"1\">     <thead>       <tr>         <th>placeholderType</th>         <th>placeholderField</th>       </tr>     </thead>     <tbody>       <tr>         <td>QUICKLINK</td>         <td>ADVANCED_MOBILE_URL</td>       </tr>       <tr>         <td>QUICKLINK</td>         <td>TRACKING_URL</td>       </tr>       <tr>         <td>AD_CUTOMIZER</td>         <td>any</td>       </tr>     </tbody>   </table> </div> ")
@JsonPropertyOrder({
  FeedItemServiceFeedAttributeValue.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  FeedItemServiceFeedAttributeValue.JSON_PROPERTY_FEED_ATTRIBUTE_VALUE,
  FeedItemServiceFeedAttributeValue.JSON_PROPERTY_REVIEW_FEED_ATTRIBUTE_VALUE
})
@JsonTypeName("FeedItemServiceFeedAttributeValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItemServiceFeedAttributeValue {
  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes = null;

  public static final String JSON_PROPERTY_FEED_ATTRIBUTE_VALUE = "feedAttributeValue";
  private String feedAttributeValue;

  public static final String JSON_PROPERTY_REVIEW_FEED_ATTRIBUTE_VALUE = "reviewFeedAttributeValue";
  private String reviewFeedAttributeValue;

  public FeedItemServiceFeedAttributeValue() { 
  }

  public FeedItemServiceFeedAttributeValue disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public FeedItemServiceFeedAttributeValue addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査の否認理由コードです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Reject reason code of editorial review.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査の否認理由コードです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Reject reason code of editorial review.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  public FeedItemServiceFeedAttributeValue feedAttributeValue(String feedAttributeValue) {
    
    this.feedAttributeValue = feedAttributeValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードアイテムの属性値です。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItem attribute value.&lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return feedAttributeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">フィードアイテムの属性値です。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時は無視されます。</div> <div lang=\"en\">FeedItem attribute value.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")
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


  public FeedItemServiceFeedAttributeValue reviewFeedAttributeValue(String reviewFeedAttributeValue) {
    
    this.reviewFeedAttributeValue = reviewFeedAttributeValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;レビュー中のフィードアイテムの属性値です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItem attribute value in review.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return reviewFeedAttributeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">レビュー中のフィードアイテムの属性値です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">FeedItem attribute value in review.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
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
    FeedItemServiceFeedAttributeValue feedItemServiceFeedAttributeValue = (FeedItemServiceFeedAttributeValue) o;
    return Objects.equals(this.disapprovalReasonCodes, feedItemServiceFeedAttributeValue.disapprovalReasonCodes) &&
        Objects.equals(this.feedAttributeValue, feedItemServiceFeedAttributeValue.feedAttributeValue) &&
        Objects.equals(this.reviewFeedAttributeValue, feedItemServiceFeedAttributeValue.reviewFeedAttributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disapprovalReasonCodes, feedAttributeValue, reviewFeedAttributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceFeedAttributeValue {\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
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

