package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceFeedAttributeValueオブジェクトは、フィードアイテムの属性値を表示します。&lt;br&gt; 更新時にfeedAttributeValueを指定するとすべて上書きされ、未指定のfeedAttributeValueの属性情報は削除されます。&lt;br&gt; feedAttributeValueに空文字を指定すると、下記の場合のみフィードアイテムの属性情報は削除されます。   &lt;table border&#x3D;\&quot;1\&quot;&gt;     &lt;thead&gt;       &lt;tr&gt;         &lt;th&gt;placeholderType&lt;/th&gt;         &lt;th&gt;placeholderField&lt;/th&gt;       &lt;/tr&gt;     &lt;/thead&gt;     &lt;tbody&gt;       &lt;tr&gt;         &lt;td&gt;QUICKLINK&lt;/td&gt;         &lt;td&gt;ADVANCED_MOBILE_URL&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;QUICKLINK&lt;/td&gt;         &lt;td&gt;TRACKING_URL&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;AD_CUTOMIZER&lt;/td&gt;         &lt;td&gt;any&lt;/td&gt;       &lt;/tr&gt;     &lt;/tbody&gt;   &lt;/table&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceFeedAttributeValue object describes FeedItem attribute value.&lt;br&gt;   Upon updating, if feedAttributeValue is specified, the attribute information will be overwritten, but if feedAttributeValue is not specified, it will be deleted.&lt;br&gt;   If an empty string is specified in feedAttributeValue, the attribute information of the feed item will be deleted only for the following cases.   &lt;table border&#x3D;\&quot;1\&quot;&gt;     &lt;thead&gt;       &lt;tr&gt;         &lt;th&gt;placeholderType&lt;/th&gt;         &lt;th&gt;placeholderField&lt;/th&gt;       &lt;/tr&gt;     &lt;/thead&gt;     &lt;tbody&gt;       &lt;tr&gt;         &lt;td&gt;QUICKLINK&lt;/td&gt;         &lt;td&gt;ADVANCED_MOBILE_URL&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;QUICKLINK&lt;/td&gt;         &lt;td&gt;TRACKING_URL&lt;/td&gt;       &lt;/tr&gt;       &lt;tr&gt;         &lt;td&gt;AD_CUTOMIZER&lt;/td&gt;         &lt;td&gt;any&lt;/td&gt;       &lt;/tr&gt;     &lt;/tbody&gt;   &lt;/table&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceFeedAttributeValueオブジェクトは、フィードアイテムの属性値を表示します。<br> 更新時にfeedAttributeValueを指定するとすべて上書きされ、未指定のfeedAttributeValueの属性情報は削除されます。<br> feedAttributeValueに空文字を指定すると、下記の場合のみフィードアイテムの属性情報は削除されます。   <table border=\"1\">     <thead>       <tr>         <th>placeholderType</th>         <th>placeholderField</th>       </tr>     </thead>     <tbody>       <tr>         <td>QUICKLINK</td>         <td>ADVANCED_MOBILE_URL</td>       </tr>       <tr>         <td>QUICKLINK</td>         <td>TRACKING_URL</td>       </tr>       <tr>         <td>AD_CUTOMIZER</td>         <td>any</td>       </tr>     </tbody>   </table> </div> <div lang=\"en\">FeedItemServiceFeedAttributeValue object describes FeedItem attribute value.<br>   Upon updating, if feedAttributeValue is specified, the attribute information will be overwritten, but if feedAttributeValue is not specified, it will be deleted.<br>   If an empty string is specified in feedAttributeValue, the attribute information of the feed item will be deleted only for the following cases.   <table border=\"1\">     <thead>       <tr>         <th>placeholderType</th>         <th>placeholderField</th>       </tr>     </thead>     <tbody>       <tr>         <td>QUICKLINK</td>         <td>ADVANCED_MOBILE_URL</td>       </tr>       <tr>         <td>QUICKLINK</td>         <td>TRACKING_URL</td>       </tr>       <tr>         <td>AD_CUTOMIZER</td>         <td>any</td>       </tr>     </tbody>   </table> </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceFeedAttributeValue   {
  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  @JsonProperty("feedAttributeValue")
  private String feedAttributeValue = null;

  @JsonProperty("reviewFeedAttributeValue")
  private String reviewFeedAttributeValue = null;

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
   * <div lang=\"ja\">審査の否認理由コードです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Reject reason code of editorial review.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査の否認理由コードです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Reject reason code of editorial review.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public FeedItemServiceFeedAttributeValue feedAttributeValue(String feedAttributeValue) {
    this.feedAttributeValue = feedAttributeValue;
    return this;
  }

  /**
   * <div lang=\"ja\">フィードアイテムの属性値です。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時は無視されます。</div> <div lang=\"en\">FeedItem attribute value.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.</div> 
   * @return feedAttributeValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードアイテムの属性値です。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時は無視されます。</div> <div lang=\"en\">FeedItem attribute value.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")


  public String getFeedAttributeValue() {
    return feedAttributeValue;
  }

  public void setFeedAttributeValue(String feedAttributeValue) {
    this.feedAttributeValue = feedAttributeValue;
  }

  public FeedItemServiceFeedAttributeValue reviewFeedAttributeValue(String reviewFeedAttributeValue) {
    this.reviewFeedAttributeValue = reviewFeedAttributeValue;
    return this;
  }

  /**
   * <div lang=\"ja\">レビュー中のフィードアイテムの属性値です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">FeedItem attribute value in review.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return reviewFeedAttributeValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">レビュー中のフィードアイテムの属性値です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">FeedItem attribute value in review.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getReviewFeedAttributeValue() {
    return reviewFeedAttributeValue;
  }

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

