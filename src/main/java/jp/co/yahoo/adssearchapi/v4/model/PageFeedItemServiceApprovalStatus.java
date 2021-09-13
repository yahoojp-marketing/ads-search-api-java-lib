package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">PageFeedItemServiceApprovalStatusは、審査ステータスを表します。</div> <div lang=\"en\">PageFeedItemServiceApprovalStatus displays Editorial Status.</div> <dl class=term>   <dt class=\"term__item\">APPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">承認済</span><span lang=\"en\">The item is approved</span></dd>   <dt class=\"term__item\">APPROVED_WITH_REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">編集内容審査中</span><span lang=\"en\">The item is approved<br>Updated items are under review</span></dd>   <dt class=\"term__item\">REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査中</span><span lang=\"en\">Under editorial review<br>Newly added keywords/ads are under review, and not displayed yet</span></dd>   <dt class=\"term__item\">PRE_DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">掲載不可</span><span lang=\"en\">The item was rejected<br>Newly added keywords/ads have been rejected, so it cannot be displayed</span></dd>   <dt class=\"term__item\">POST_DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">掲載停止</span><span lang=\"en\">The item was rejected<br>Ads already displayed have been taken offline due to a result from post review</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum PageFeedItemServiceApprovalStatus {
  
  APPROVED("APPROVED"),
  
  APPROVED_WITH_REVIEW("APPROVED_WITH_REVIEW"),
  
  REVIEW("REVIEW"),
  
  PRE_DISAPPROVED("PRE_DISAPPROVED"),
  
  POST_DISAPPROVED("POST_DISAPPROVED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  PageFeedItemServiceApprovalStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PageFeedItemServiceApprovalStatus fromValue(String value) {
    for (PageFeedItemServiceApprovalStatus b : PageFeedItemServiceApprovalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

