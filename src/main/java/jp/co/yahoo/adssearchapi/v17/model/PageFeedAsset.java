/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v17.model.PageFeedAssetServiceApprovalStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetオブジェクトは、ページフィードアセット情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAsset object retains page feed asset.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  PageFeedAsset.JSON_PROPERTY_ACCOUNT_ID,
  PageFeedAsset.JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID,
  PageFeedAsset.JSON_PROPERTY_PAGE_FEED_ASSET_ID,
  PageFeedAsset.JSON_PROPERTY_APPROVAL_STATUS,
  PageFeedAsset.JSON_PROPERTY_DISAPPROVAL_REASON_CODES,
  PageFeedAsset.JSON_PROPERTY_DISAPPROVAL_REASON_COMMENT,
  PageFeedAsset.JSON_PROPERTY_PAGE_FEED_ASSET_CUSTOM_LABEL,
  PageFeedAsset.JSON_PROPERTY_PAGE_FEED_ASSET_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAsset {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_SET_ID = "pageFeedAssetSetId";
  private Long pageFeedAssetSetId;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_ID = "pageFeedAssetId";
  private Long pageFeedAssetId;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private PageFeedAssetServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_COMMENT = "disapprovalReasonComment";
  private String disapprovalReasonComment;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_CUSTOM_LABEL = "pageFeedAssetCustomLabel";
  private String pageFeedAssetCustomLabel;

  public static final String JSON_PROPERTY_PAGE_FEED_ASSET_URL = "pageFeedAssetUrl";
  private String pageFeedAssetUrl;

  public PageFeedAsset() {
  }

  public PageFeedAsset accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
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


  public PageFeedAsset pageFeedAssetSetId(Long pageFeedAssetSetId) {
    
    this.pageFeedAssetSetId = pageFeedAssetSetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットセットID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetSet ID.&lt;/div&gt; 
   * @return pageFeedAssetSetId
  **/
  @jakarta.annotation.Nullable
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


  public PageFeedAsset pageFeedAssetId(Long pageFeedAssetId) {
    
    this.pageFeedAssetId = pageFeedAssetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAsset ID.&lt;/div&gt; 
   * @return pageFeedAssetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPageFeedAssetId() {
    return pageFeedAssetId;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetId(Long pageFeedAssetId) {
    this.pageFeedAssetId = pageFeedAssetId;
  }


  public PageFeedAsset approvalStatus(PageFeedAssetServiceApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedAssetServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(PageFeedAssetServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public PageFeedAsset disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public PageFeedAsset addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由コード&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Codes of disapproval reason.&lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @jakarta.annotation.Nullable
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


  public PageFeedAsset disapprovalReasonComment(String disapprovalReasonComment) {
    
    this.disapprovalReasonComment = disapprovalReasonComment;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由のコメント&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Comment of disapproval reason.&lt;/div&gt; 
   * @return disapprovalReasonComment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisapprovalReasonComment() {
    return disapprovalReasonComment;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisapprovalReasonComment(String disapprovalReasonComment) {
    this.disapprovalReasonComment = disapprovalReasonComment;
  }


  public PageFeedAsset pageFeedAssetCustomLabel(String pageFeedAssetCustomLabel) {
    
    this.pageFeedAssetCustomLabel = pageFeedAssetCustomLabel;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットのカスタムラベル&lt;br&gt; 複数ある場合はカンマ区切り&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Custom label of page feed asset.&lt;br&gt; If multiple, comma separated.&lt;/div&gt; 
   * @return pageFeedAssetCustomLabel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_CUSTOM_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageFeedAssetCustomLabel() {
    return pageFeedAssetCustomLabel;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_CUSTOM_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetCustomLabel(String pageFeedAssetCustomLabel) {
    this.pageFeedAssetCustomLabel = pageFeedAssetCustomLabel;
  }


  public PageFeedAsset pageFeedAssetUrl(String pageFeedAssetUrl) {
    
    this.pageFeedAssetUrl = pageFeedAssetUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットのURL&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Url of page feed asset.&lt;/div&gt; 
   * @return pageFeedAssetUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageFeedAssetUrl() {
    return pageFeedAssetUrl;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_FEED_ASSET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageFeedAssetUrl(String pageFeedAssetUrl) {
    this.pageFeedAssetUrl = pageFeedAssetUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedAsset pageFeedAsset = (PageFeedAsset) o;
    return Objects.equals(this.accountId, pageFeedAsset.accountId) &&
        Objects.equals(this.pageFeedAssetSetId, pageFeedAsset.pageFeedAssetSetId) &&
        Objects.equals(this.pageFeedAssetId, pageFeedAsset.pageFeedAssetId) &&
        Objects.equals(this.approvalStatus, pageFeedAsset.approvalStatus) &&
        Objects.equals(this.disapprovalReasonCodes, pageFeedAsset.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReasonComment, pageFeedAsset.disapprovalReasonComment) &&
        Objects.equals(this.pageFeedAssetCustomLabel, pageFeedAsset.pageFeedAssetCustomLabel) &&
        Objects.equals(this.pageFeedAssetUrl, pageFeedAsset.pageFeedAssetUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, pageFeedAssetSetId, pageFeedAssetId, approvalStatus, disapprovalReasonCodes, disapprovalReasonComment, pageFeedAssetCustomLabel, pageFeedAssetUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAsset {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    pageFeedAssetSetId: ").append(toIndentedString(pageFeedAssetSetId)).append("\n");
    sb.append("    pageFeedAssetId: ").append(toIndentedString(pageFeedAssetId)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReasonComment: ").append(toIndentedString(disapprovalReasonComment)).append("\n");
    sb.append("    pageFeedAssetCustomLabel: ").append(toIndentedString(pageFeedAssetCustomLabel)).append("\n");
    sb.append("    pageFeedAssetUrl: ").append(toIndentedString(pageFeedAssetUrl)).append("\n");
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

