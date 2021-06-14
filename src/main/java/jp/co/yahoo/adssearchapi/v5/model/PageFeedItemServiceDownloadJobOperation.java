package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceDownloadJob;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceDownloadJobOperationオブジェクトは、ページフィードアイテムを一括でダウンロードするための処理の内容を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceDownloadJobOperation object displays content of page feed item for download collectively.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceDownloadJobOperationオブジェクトは、ページフィードアイテムを一括でダウンロードするための処理の内容を表します。</div> <div lang=\"en\">PageFeedItemServiceDownloadJobOperation object displays content of page feed item for download collectively.</div> ")

public class PageFeedItemServiceDownloadJobOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private JsonNullable<List<PageFeedItemServiceDownloadJob>> operand = JsonNullable.undefined();

  public PageFeedItemServiceDownloadJobOperation accountId(Long accountId) {
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

  public PageFeedItemServiceDownloadJobOperation operand(List<PageFeedItemServiceDownloadJob> operand) {
    this.operand = JsonNullable.of(operand);
    return this;
  }

  public PageFeedItemServiceDownloadJobOperation addOperandItem(PageFeedItemServiceDownloadJob operandItem) {
    this.operand.get().add(operandItem);
    return this;
  }

  /**
   * Get operand
   * @return operand
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1,max=1) 
  public JsonNullable<List<PageFeedItemServiceDownloadJob>> getOperand() {
    return operand;
  }

  public void setOperand(JsonNullable<List<PageFeedItemServiceDownloadJob>> operand) {
    this.operand = operand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedItemServiceDownloadJobOperation pageFeedItemServiceDownloadJobOperation = (PageFeedItemServiceDownloadJobOperation) o;
    return Objects.equals(this.accountId, pageFeedItemServiceDownloadJobOperation.accountId) &&
        Objects.equals(this.operand, pageFeedItemServiceDownloadJobOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceDownloadJobOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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

