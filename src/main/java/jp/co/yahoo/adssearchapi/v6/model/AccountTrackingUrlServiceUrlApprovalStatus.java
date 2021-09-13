package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AccountTrackingUrlServiceUrlApprovalStatusは、URLの審査状況を表します。</div> <div lang=\"en\">AccountTrackingUrlServiceUrlApprovalStatus is a review status of URL.</div> <dl class=term>   <dt class=\"term__item\">DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">事前審査で否認となりました。<br>掲載不可です。</span><span lang=\"en\">It has been disapproved.<br>Ad cannot be displayed.</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未審査です。</span><span lang=\"en\">Not in review.</span></dd>   <dt class=\"term__item\">APPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査で承認済です。</span><span lang=\"en\">Approved.<br>Ad can be displayed.</span></dd>   <dt class=\"term__item\">APPROVED_WITH_REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信審査中です。</span><span lang=\"en\">Approved with in process of review.<br>Ad will stop displaying if disapproved.</span></dd>   <dt class=\"term__item\">REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査中です。</span><span lang=\"en\">In review status.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountTrackingUrlServiceUrlApprovalStatus {
  
  NONE("NONE"),
  
  APPROVED("APPROVED"),
  
  APPROVED_WITH_REVIEW("APPROVED_WITH_REVIEW"),
  
  REVIEW("REVIEW"),
  
  DISAPPROVED("DISAPPROVED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountTrackingUrlServiceUrlApprovalStatus(String value) {
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
  public static AccountTrackingUrlServiceUrlApprovalStatus fromValue(String value) {
    for (AccountTrackingUrlServiceUrlApprovalStatus b : AccountTrackingUrlServiceUrlApprovalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

