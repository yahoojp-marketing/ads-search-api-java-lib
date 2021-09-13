package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceReviewStatusは、ターゲットリストの審査状態を表します。</div> <div lang=\"en\">RetargetingListServiceReviewStatus is the review status of target list.</div> <dl class=term>   <dt class=\"term__item\">APPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">利用可能です。<br>※初回作成時のデフォルト設定です。</span><span lang=\"en\">Target list is available to use.<br>*Default setting when list is created.</span></dd>   <dt class=\"term__item\">DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">利用不可です。<br>プライバシーポリシーの違反などで強制停止されている状態です。</span><span lang=\"en\">Target list is not available.<br>It has been stopped for violation of privacy policy or other reasons.</span></dd>   <dt class=\"term__item\">DISAPPROVED_WITH_REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査中です。<br>審査上問題なければ、一度利用不可になった ターゲットリストを利用可能に戻ります。</span><span lang=\"en\">Re-examining.<br>If there is no problem, the target list can be used again.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceReviewStatus {
  
  APPROVED("APPROVED"),
  
  DISAPPROVED("DISAPPROVED"),
  
  DISAPPROVED_WITH_REVIEW("DISAPPROVED_WITH_REVIEW"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceReviewStatus(String value) {
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
  public static RetargetingListServiceReviewStatus fromValue(String value) {
    for (RetargetingListServiceReviewStatus b : RetargetingListServiceReviewStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

