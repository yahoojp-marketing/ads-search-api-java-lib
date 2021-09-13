package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.PageFeedItemServiceApprovalStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemオブジェクトは、ページフィードアイテム情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItem object retains page feed Item.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemオブジェクトは、ページフィードアイテム情報を格納します。</div> <div lang=\"en\">PageFeedItem object retains page feed Item.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItem   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("approvalStatus")
  private PageFeedItemServiceApprovalStatus approvalStatus = null;

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  @JsonProperty("disapprovalReasonComment")
  private String disapprovalReasonComment = null;

  @JsonProperty("feedId")
  private Long feedId = null;

  @JsonProperty("pageFeedCustomLabel")
  private String pageFeedCustomLabel = null;

  @JsonProperty("pageFeedItemId")
  private Long pageFeedItemId = null;

  @JsonProperty("pageFeedUrl")
  private String pageFeedUrl = null;

  public PageFeedItem accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public PageFeedItem approvalStatus(PageFeedItemServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public PageFeedItemServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(PageFeedItemServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public PageFeedItem disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public PageFeedItem addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由コード</div> <div lang=\"en\">Codes of disapproval reason</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コード</div> <div lang=\"en\">Codes of disapproval reason</div> ")


  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public PageFeedItem disapprovalReasonComment(String disapprovalReasonComment) {
    this.disapprovalReasonComment = disapprovalReasonComment;
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由のコメント</div> <div lang=\"en\">Comment of disapproval reason</div> 
   * @return disapprovalReasonComment
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由のコメント</div> <div lang=\"en\">Comment of disapproval reason</div> ")


  public String getDisapprovalReasonComment() {
    return disapprovalReasonComment;
  }

  public void setDisapprovalReasonComment(String disapprovalReasonComment) {
    this.disapprovalReasonComment = disapprovalReasonComment;
  }

  public PageFeedItem feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * <div lang=\"ja\">フィードID</div> <div lang=\"en\">Feed ID</div> 
   * @return feedId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィードID</div> <div lang=\"en\">Feed ID</div> ")


  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public PageFeedItem pageFeedCustomLabel(String pageFeedCustomLabel) {
    this.pageFeedCustomLabel = pageFeedCustomLabel;
    return this;
  }

  /**
   * <div lang=\"ja\">ページフィードアイテムのカスタムラベル<br> 複数ある場合はカンマ区切り</div> <div lang=\"en\">Custom label of Page feed item.<br> If multiple, comma separated.</div> 
   * @return pageFeedCustomLabel
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードアイテムのカスタムラベル<br> 複数ある場合はカンマ区切り</div> <div lang=\"en\">Custom label of Page feed item.<br> If multiple, comma separated.</div> ")


  public String getPageFeedCustomLabel() {
    return pageFeedCustomLabel;
  }

  public void setPageFeedCustomLabel(String pageFeedCustomLabel) {
    this.pageFeedCustomLabel = pageFeedCustomLabel;
  }

  public PageFeedItem pageFeedItemId(Long pageFeedItemId) {
    this.pageFeedItemId = pageFeedItemId;
    return this;
  }

  /**
   * <div lang=\"ja\">ページフィードアイテムID</div> <div lang=\"en\">Page feed item ID</div> 
   * @return pageFeedItemId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードアイテムID</div> <div lang=\"en\">Page feed item ID</div> ")


  public Long getPageFeedItemId() {
    return pageFeedItemId;
  }

  public void setPageFeedItemId(Long pageFeedItemId) {
    this.pageFeedItemId = pageFeedItemId;
  }

  public PageFeedItem pageFeedUrl(String pageFeedUrl) {
    this.pageFeedUrl = pageFeedUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">ページフィードURL。</div> <div lang=\"en\">Url of page feed</div> 
   * @return pageFeedUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページフィードURL。</div> <div lang=\"en\">Url of page feed</div> ")


  public String getPageFeedUrl() {
    return pageFeedUrl;
  }

  public void setPageFeedUrl(String pageFeedUrl) {
    this.pageFeedUrl = pageFeedUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedItem pageFeedItem = (PageFeedItem) o;
    return Objects.equals(this.accountId, pageFeedItem.accountId) &&
        Objects.equals(this.approvalStatus, pageFeedItem.approvalStatus) &&
        Objects.equals(this.disapprovalReasonCodes, pageFeedItem.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReasonComment, pageFeedItem.disapprovalReasonComment) &&
        Objects.equals(this.feedId, pageFeedItem.feedId) &&
        Objects.equals(this.pageFeedCustomLabel, pageFeedItem.pageFeedCustomLabel) &&
        Objects.equals(this.pageFeedItemId, pageFeedItem.pageFeedItemId) &&
        Objects.equals(this.pageFeedUrl, pageFeedItem.pageFeedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, approvalStatus, disapprovalReasonCodes, disapprovalReasonComment, feedId, pageFeedCustomLabel, pageFeedItemId, pageFeedUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItem {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReasonComment: ").append(toIndentedString(disapprovalReasonComment)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    pageFeedCustomLabel: ").append(toIndentedString(pageFeedCustomLabel)).append("\n");
    sb.append("    pageFeedItemId: ").append(toIndentedString(pageFeedItemId)).append("\n");
    sb.append("    pageFeedUrl: ").append(toIndentedString(pageFeedUrl)).append("\n");
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

