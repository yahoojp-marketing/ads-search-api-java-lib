package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.FeedServiceAttribute;
import jp.co.yahoo.adssearchapi.v5.model.FeedServicePlaceholderType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedオブジェクトは、自動データ挿入のリストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed object is the list of Data elements on auto data insertion.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Feedオブジェクトは、自動データ挿入のリストを格納します。</div> <div lang=\"en\">Feed object is the list of Data elements on auto data insertion.</div> ")

public class Feed   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("domain")
  private JsonNullable<String> domain = JsonNullable.undefined();

  @JsonProperty("feedAttribute")
  @Valid
  private JsonNullable<List<FeedServiceAttribute>> feedAttribute = JsonNullable.undefined();

  @JsonProperty("feedId")
  private JsonNullable<Long> feedId = JsonNullable.undefined();

  @JsonProperty("feedName")
  private JsonNullable<String> feedName = JsonNullable.undefined();

  @JsonProperty("feedTrackId")
  private JsonNullable<Long> feedTrackId = JsonNullable.undefined();

  @JsonProperty("placeholderType")
  private JsonNullable<FeedServicePlaceholderType> placeholderType = JsonNullable.undefined();

  public Feed accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> ※入稿の仕様変更により不要になりました。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> *Not required by design change on editorials.　<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> ※入稿の仕様変更により不要になりました。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> *Not required by design change on editorials.　<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public Feed domain(String domain) {
    this.domain = JsonNullable.of(domain);
    return this;
  }

  /**
   * <div lang=\"ja\">ドメインです。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">Domain.　<br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.</div> 
   * @return domain
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ドメインです。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">Domain.　<br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.</div> ")


  public JsonNullable<String> getDomain() {
    return domain;
  }

  public void setDomain(JsonNullable<String> domain) {
    this.domain = domain;
  }

  public Feed feedAttribute(List<FeedServiceAttribute> feedAttribute) {
    this.feedAttribute = JsonNullable.of(feedAttribute);
    return this;
  }

  public Feed addFeedAttributeItem(FeedServiceAttribute feedAttributeItem) {
    if (this.feedAttribute == null || !this.feedAttribute.isPresent()) {
      this.feedAttribute = JsonNullable.of(new ArrayList<>());
    }
    this.feedAttribute.get().add(feedAttributeItem);
    return this;
  }

  /**
   * Get feedAttribute
   * @return feedAttribute
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<FeedServiceAttribute>> getFeedAttribute() {
    return feedAttribute;
  }

  public void setFeedAttribute(JsonNullable<List<FeedServiceAttribute>> feedAttribute) {
    this.feedAttribute = feedAttribute;
  }

  public Feed feedId(Long feedId) {
    this.feedId = JsonNullable.of(feedId);
    return this;
  }

  /**
   * <div lang=\"ja\">FeedIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時は無視されます。</div> <div lang=\"en\">Feed ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">FeedIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時は無視されます。</div> <div lang=\"en\">Feed ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> ")


  public JsonNullable<Long> getFeedId() {
    return feedId;
  }

  public void setFeedId(JsonNullable<Long> feedId) {
    this.feedId = feedId;
  }

  public Feed feedName(String feedName) {
    this.feedName = JsonNullable.of(feedName);
    return this;
  }

  /**
   * <div lang=\"ja\">Feedのリスト名です。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">List name of Feed.<br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation.</div> 
   * @return feedName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Feedのリスト名です。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">List name of Feed.<br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation.</div> ")


  public JsonNullable<String> getFeedName() {
    return feedName;
  }

  public void setFeedName(JsonNullable<String> feedName) {
    this.feedName = feedName;
  }

  public Feed feedTrackId(Long feedTrackId) {
    this.feedTrackId = JsonNullable.of(feedTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">Feedのトラッキング用IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Tracking ID of Feed.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return feedTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Feedのトラッキング用IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Tracking ID of Feed.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getFeedTrackId() {
    return feedTrackId;
  }

  public void setFeedTrackId(JsonNullable<Long> feedTrackId) {
    this.feedTrackId = feedTrackId;
  }

  public Feed placeholderType(FeedServicePlaceholderType placeholderType) {
    this.placeholderType = JsonNullable.of(placeholderType);
    return this;
  }

  /**
   * Get placeholderType
   * @return placeholderType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedServicePlaceholderType> getPlaceholderType() {
    return placeholderType;
  }

  public void setPlaceholderType(JsonNullable<FeedServicePlaceholderType> placeholderType) {
    this.placeholderType = placeholderType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

