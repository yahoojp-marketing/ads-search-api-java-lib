/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetSetオブジェクトは、ページフィードアセットセットの情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetSet object stores page feed asset set information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedAssetSetオブジェクトは、ページフィードアセットセットの情報を格納します。</div> <div lang=\"en\">PageFeedAssetSet object stores page feed asset set information.</div> ")
@JsonPropertyOrder({
  PageFeedAssetSet.JSON_PROPERTY_ACCOUNT_ID,
  PageFeedAssetSet.JSON_PROPERTY_FEED_ID,
  PageFeedAssetSet.JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID,
  PageFeedAssetSet.JSON_PROPERTY_PAGE_FEED_ASSET_SET_NAME,
  PageFeedAssetSet.JSON_PROPERTY_DOMAIN
})
@JsonTypeName("PageFeedAssetSet")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAssetSet {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_FEED_ID = "feedId";
  private Long feedId;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID = "pageFeedAssetSetId";
  private Long pageFeedAssetSetId;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_SET_NAME = "pageFeedAssetSetName";
  private String pageFeedAssetSetName;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public PageFeedAssetSet() { 
  }

  public PageFeedAssetSet accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
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


  public PageFeedAssetSet feedId(Long feedId) {
    
    this.feedId = feedId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィードIDです。&lt;br&gt; 旧形式から自動移行されたページフィードの場合、旧形式のページフィードのIDが返却されます。&lt;br&gt; ※現在、こちらのフィールドは返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Feed ID.&lt;br&gt; If the page feed is auto-migrated, the old-style page feed ID will be returned.&lt;br&gt; *Currently this field will not be returned.&lt;/div&gt; 
   * @return feedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">フィードIDです。<br> 旧形式から自動移行されたページフィードの場合、旧形式のページフィードのIDが返却されます。<br> ※現在、こちらのフィールドは返却されません。</div> <div lang=\"en\">Feed ID.<br> If the page feed is auto-migrated, the old-style page feed ID will be returned.<br> *Currently this field will not be returned.</div> ")
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


  public PageFeedAssetSet pageFeedAssetSetId(Long pageFeedAssetSetId) {
    
    this.pageFeedAssetSetId = pageFeedAssetSetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットセットIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となり、ADD時は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetSet ID.&lt;br&gt; This field is required in SET and REMOVE operation, and will be ignored in ADD operation.&lt;/div&gt; 
   * @return pageFeedAssetSetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードアセットセットIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時は無視されます。</div> <div lang=\"en\">PageFeedAssetSet ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPageFeedAssetSetId() {
    return pageFeedAssetSetId;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetSetId(Long pageFeedAssetSetId) {
    this.pageFeedAssetSetId = pageFeedAssetSetId;
  }


  public PageFeedAssetSet pageFeedAssetSetName(String pageFeedAssetSetName) {
    
    this.pageFeedAssetSetName = pageFeedAssetSetName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットセット名です。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetSet name.&lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return pageFeedAssetSetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードアセットセット名です。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。</div> <div lang=\"en\">PageFeedAssetSet name.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_SET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageFeedAssetSetName() {
    return pageFeedAssetSetName;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_SET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetSetName(String pageFeedAssetSetName) {
    this.pageFeedAssetSetName = pageFeedAssetSetName;
  }


  public PageFeedAssetSet domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ドメインです。&lt;br&gt; このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Domain.　&lt;br&gt; This field is required in ADD operation, and will be ignored in SET and REMOVE operation.&lt;/div&gt; 
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ドメインです。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">Domain.　<br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation.</div> ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedAssetSet pageFeedAssetSet = (PageFeedAssetSet) o;
    return Objects.equals(this.accountId, pageFeedAssetSet.accountId) &&
        Objects.equals(this.feedId, pageFeedAssetSet.feedId) &&
        Objects.equals(this.pageFeedAssetSetId, pageFeedAssetSet.pageFeedAssetSetId) &&
        Objects.equals(this.pageFeedAssetSetName, pageFeedAssetSet.pageFeedAssetSetName) &&
        Objects.equals(this.domain, pageFeedAssetSet.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, feedId, pageFeedAssetSetId, pageFeedAssetSetName, domain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAssetSet {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    pageFeedAssetSetId: ").append(toIndentedString(pageFeedAssetSetId)).append("\n");
    sb.append("    pageFeedAssetSetName: ").append(toIndentedString(pageFeedAssetSetName)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

