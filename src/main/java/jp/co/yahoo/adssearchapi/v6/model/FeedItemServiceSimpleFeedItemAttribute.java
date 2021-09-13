package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; ※placeholderFieldがSTRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, ADDITIONAL_ADVANCED_MOBILE_URLSの場合、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; If the placeholderField is STRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, or ADDITIONAL_ADVANCED_MOBILE_URLS, this field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※placeholderFieldがSTRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, ADDITIONAL_ADVANCED_MOBILE_URLSの場合、ADDおよびSET時に必須となります。</div> <div lang=\"en\">This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> If the placeholderField is STRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, or ADDITIONAL_ADVANCED_MOBILE_URLS, this field is required in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceSimpleFeedItemAttribute   {
  @JsonProperty("feedAttributeValue")
  private String feedAttributeValue = null;

  @JsonProperty("reviewFeedAttributeValue")
  private String reviewFeedAttributeValue = null;

  public FeedItemServiceSimpleFeedItemAttribute feedAttributeValue(String feedAttributeValue) {
    this.feedAttributeValue = feedAttributeValue;
    return this;
  }

  /**
   * <div lang=\"ja\">フィードアイテム情報の値です。<br><br> ※データ自動挿入の利用時は、属性は以下のように入力してください：<br> ・AD_CUSTOMIZER_INTEGER<br> ex) 99999999<br>・AD_CUSTOMIZER_PRICE<br> ex) 19800 or 19,800<br> ・AD_CUSTOMIZER_DATE<br> ex) 20151231 235959<br> ・AD_CUSTOMIZER_STRING<br> ex) hoge ・STRUCTURED_SNIPPET_HEADER<br> ex) ブランド</div> <div lang=\"en\">Value of feed iteim information.<br><br> *When using data insertion, you need to enter attribution as follows:<br> ・AD_CUSTOMIZER_INTEGER<br> ex) 99999999<br> ・AD_CUSTOMIZER_PRICE<br> ex) 19800 or 19,800<br> ・AD_CUSTOMIZER_DATE<br> ex) 20151231 235959<br> ・AD_CUSTOMIZER_STRING<br> ex) home<br> ・STRUCTURED_SNIPPET_HEADER<br> ex) brand</div> 
   * @return feedAttributeValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードアイテム情報の値です。<br><br> ※データ自動挿入の利用時は、属性は以下のように入力してください：<br> ・AD_CUSTOMIZER_INTEGER<br> ex) 99999999<br>・AD_CUSTOMIZER_PRICE<br> ex) 19800 or 19,800<br> ・AD_CUSTOMIZER_DATE<br> ex) 20151231 235959<br> ・AD_CUSTOMIZER_STRING<br> ex) hoge ・STRUCTURED_SNIPPET_HEADER<br> ex) ブランド</div> <div lang=\"en\">Value of feed iteim information.<br><br> *When using data insertion, you need to enter attribution as follows:<br> ・AD_CUSTOMIZER_INTEGER<br> ex) 99999999<br> ・AD_CUSTOMIZER_PRICE<br> ex) 19800 or 19,800<br> ・AD_CUSTOMIZER_DATE<br> ex) 20151231 235959<br> ・AD_CUSTOMIZER_STRING<br> ex) home<br> ・STRUCTURED_SNIPPET_HEADER<br> ex) brand</div> ")


  public String getFeedAttributeValue() {
    return feedAttributeValue;
  }

  public void setFeedAttributeValue(String feedAttributeValue) {
    this.feedAttributeValue = feedAttributeValue;
  }

  public FeedItemServiceSimpleFeedItemAttribute reviewFeedAttributeValue(String reviewFeedAttributeValue) {
    this.reviewFeedAttributeValue = reviewFeedAttributeValue;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中のフィードアイテム情報です。<br> ※審査中の間のみ、レスポンス時に表示されます。</div> <div lang=\"en\">The feed item information on editorial review.<br> *It is displayed for response only on Editorial Review.</div> 
   * @return reviewFeedAttributeValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のフィードアイテム情報です。<br> ※審査中の間のみ、レスポンス時に表示されます。</div> <div lang=\"en\">The feed item information on editorial review.<br> *It is displayed for response only on Editorial Review.</div> ")


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

