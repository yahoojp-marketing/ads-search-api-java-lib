package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AuditLogServiceJobStatusは、操作履歴取得ジョブの実行状況を表します。<br> このフィールドは、job配下ではレスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">AuditLogServiceJobStatus describes the job status of acquiring operation history data.<br> Under 'job', although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">SYSTEM_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">エラーです。</span><span lang=\"en\">It&#39;s error.</span></dd>   <dt class=\"term__item\">IN_PROGRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理中です。</span><span lang=\"en\">The process is in progress.</span></dd>   <dt class=\"term__item\">COMPLETED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理完了です。</span><span lang=\"en\">The process has been completed.</span></dd>   <dt class=\"term__item\">TIMEOUT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タイムアウトです。</span><span lang=\"en\">Timeout occurred.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AuditLogServiceJobStatus {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  COMPLETED("COMPLETED"),
  
  TIMEOUT("TIMEOUT"),
  
  SYSTEM_ERROR("SYSTEM_ERROR"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AuditLogServiceJobStatus(String value) {
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
  public static AuditLogServiceJobStatus fromValue(String value) {
    for (AuditLogServiceJobStatus b : AuditLogServiceJobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

