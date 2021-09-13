package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.FeedServiceAttribute;
import jp.co.yahoo.adssearchapi.v4.model.FeedServicePlaceholderType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Feedオブジェクトは、自動データ挿入のリストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed object is the list of Data elements on auto data insertion.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Feedオブジェクトは、自動データ挿入のリストを格納します。</div> <div lang=\"en\">Feed object is the list of Data elements on auto data insertion.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Feed   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("feedAttribute")
  @Valid
  private List<FeedServiceAttribute> feedAttribute = null;

  @JsonProperty("feedId")
  private Long feedId = null;

  @JsonProperty("feedName")
  private String feedName = null;

  @JsonProperty("feedTrackId")
  private Long feedTrackId = null;

  @JsonProperty("placeholderType")
  private FeedServicePlaceholderType placeholderType = null;

  public Feed accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> ※入稿の仕様変更により不要になりました。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> *Not required by design change on editorials.　<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> ※入稿の仕様変更により不要になりました。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> *Not required by design change on editorials.　<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public Feed domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * <div lang=\"ja\">ドメインです。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">Domain.　<br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.</div> 
   * @return domain
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ドメインです。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">Domain.　<br> This field is optional in ADD operation, and will be ignored in SET and REMOVE operation.</div> ")


  public String getDomain() {
    return domain;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FeedServiceAttribute> getFeedAttribute() {
    return feedAttribute;
  }

  public void setFeedAttribute(List<FeedServiceAttribute> feedAttribute) {
    this.feedAttribute = feedAttribute;
  }

  public Feed feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * <div lang=\"ja\">FeedIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時は無視されます。</div> <div lang=\"en\">Feed ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">FeedIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時は無視されます。</div> <div lang=\"en\">Feed ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> ")


  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public Feed feedName(String feedName) {
    this.feedName = feedName;
    return this;
  }

  /**
   * <div lang=\"ja\">Feedのリスト名です。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">List name of Feed.<br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation.</div> 
   * @return feedName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Feedのリスト名です。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">List name of Feed.<br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation.</div> ")


  public String getFeedName() {
    return feedName;
  }

  public void setFeedName(String feedName) {
    this.feedName = feedName;
  }

  public Feed feedTrackId(Long feedTrackId) {
    this.feedTrackId = feedTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">Feedのトラッキング用IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Tracking ID of Feed.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return feedTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Feedのトラッキング用IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Tracking ID of Feed.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getFeedTrackId() {
    return feedTrackId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedServicePlaceholderType getPlaceholderType() {
    return placeholderType;
  }

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

