package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">PageFeedItemServiceDownloadJobStatusは、ページフィードアイテムダウンロードジョブの実行状況を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">PageFeedItemServiceDownloadJobStatus displays status of page feed item download jobs.<br> Although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">IN_PROGRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理中</span><span lang=\"en\">Currently in progress of creating.</span></dd>   <dt class=\"term__item\">COMPLETED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理完了</span><span lang=\"en\">Job has completed.</span></dd>   <dt class=\"term__item\">FIELDS_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ダウンロード不可能なフィールドの組み合わせを指定した場合のエラー</span><span lang=\"en\">Error if invalid conbination.</span></dd>   <dt class=\"term__item\">TIMEOUT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タイムアウト</span><span lang=\"en\">Timeout occured.</span></dd>   <dt class=\"term__item\">SYSTEM_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">エラー</span><span lang=\"en\">System error occured.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum PageFeedItemServiceDownloadJobStatus {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  COMPLETED("COMPLETED"),
  
  FIELDS_ERROR("FIELDS_ERROR"),
  
  TIMEOUT("TIMEOUT"),
  
  SYSTEM_ERROR("SYSTEM_ERROR"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  PageFeedItemServiceDownloadJobStatus(String value) {
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
  public static PageFeedItemServiceDownloadJobStatus fromValue(String value) {
    for (PageFeedItemServiceDownloadJobStatus b : PageFeedItemServiceDownloadJobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

