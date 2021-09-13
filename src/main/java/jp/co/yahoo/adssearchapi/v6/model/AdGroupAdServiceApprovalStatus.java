package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupAdServiceApprovalStatusは、審査状況を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">AdGroupAdServiceApprovalStatus displays Editorial Status.<br> Although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">APPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">承認済です。</span><span lang=\"en\">The item is approved</span></dd>   <dt class=\"term__item\">APPROVED_WITH_REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">承認済です。<br>すでに掲載中のキーワード・広告を再編集し、審査中となり、編集前の広告が掲載されています。</span><span lang=\"en\">The item is approved<br>Updated items are under review</span></dd>   <dt class=\"term__item\">REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査中です。<br>新しく追加したキーワード・広告が審査中となり、広告は未掲載です。</span><span lang=\"en\">Under editorial review<br>Newly added keywords/ads are under review, and not displayed yet</span></dd>   <dt class=\"term__item\">PRE_DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">掲載不可です。<br>新しく追加したキーワード・広告が審査で承認されず非掲載です。</span><span lang=\"en\">The item was rejected<br>Newly added keywords/ads have been rejected, so it cannot be displayed</span></dd>   <dt class=\"term__item\">POST_DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">掲載停止です。<br>すでに掲載中のキーワード・広告について審査が行われた結果、承認されず非掲載です。</span><span lang=\"en\">The item was rejected<br>Ads already displayed have been taken offline due to a result from post review</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceApprovalStatus {
  
  APPROVED("APPROVED"),
  
  APPROVED_WITH_REVIEW("APPROVED_WITH_REVIEW"),
  
  REVIEW("REVIEW"),
  
  PRE_DISAPPROVED("PRE_DISAPPROVED"),
  
  POST_DISAPPROVED("POST_DISAPPROVED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceApprovalStatus(String value) {
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
  public static AdGroupAdServiceApprovalStatus fromValue(String value) {
    for (AdGroupAdServiceApprovalStatus b : AdGroupAdServiceApprovalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

