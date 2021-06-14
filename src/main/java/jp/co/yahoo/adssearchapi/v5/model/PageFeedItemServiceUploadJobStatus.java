package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">PageFeedItemServiceUploadJobStatusは、ページフィードアイテムアップロードジョブの実行状況を表します。</div> <div lang=\"en\">PageFeedItemServiceUploadJobStatus displays status of page feed item upload jobs.</div> <dl class=term>   <dt class=\"term__item\">IN_PROGRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理中</span><span lang=\"en\">Currently in progress of creating.</span></dd>   <dt class=\"term__item\">COMPLETED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理完了</span><span lang=\"en\">Job has completed.</span></dd>   <dt class=\"term__item\">COMPLETED_WITH_VALIDATION_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイル内の入力値が不正</span><span lang=\"en\">Contents written in the file are invalid.</span></dd>   <dt class=\"term__item\">FILE_FORMAT_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイルのフォーマットが不正</span><span lang=\"en\">Format of the file is invalid.</span></dd>   <dt class=\"term__item\">FILE_ENCODING_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイルのエンコードが不正</span><span lang=\"en\">Encoding of the file is invalid.</span></dd>   <dt class=\"term__item\">COLUMN_HEADER_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイルのヘッダーが不正</span><span lang=\"en\">Content header of the file is invalid.</span></dd>   <dt class=\"term__item\">EXCEED_ROW_LINES</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ファイルの最大行数が超過しています。</span><span lang=\"en\">Row count of the file exceeded the maximum.</span></dd>   <dt class=\"term__item\">EXCEED_FILE_COUNTS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">複数のファイルを圧縮しているためエラー</span><span lang=\"en\">Count of the file exceeded the maximum.</span></dd>   <dt class=\"term__item\">INVALID_FEED_ID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">フィードIDが不正</span><span lang=\"en\">Feed ID is invalid.</span></dd>   <dt class=\"term__item\">TIMEOUT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タイムアウト</span><span lang=\"en\">Timeout</span></dd>   <dt class=\"term__item\">SYSTEM_ERROR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">エラー</span><span lang=\"en\">Systen error.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum PageFeedItemServiceUploadJobStatus {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  COMPLETED("COMPLETED"),
  
  COMPLETED_WITH_VALIDATION_ERROR("COMPLETED_WITH_VALIDATION_ERROR"),
  
  FILE_FORMAT_ERROR("FILE_FORMAT_ERROR"),
  
  FILE_ENCODING_ERROR("FILE_ENCODING_ERROR"),
  
  COLUMN_HEADER_ERROR("COLUMN_HEADER_ERROR"),
  
  EXCEED_ROW_LINES("EXCEED_ROW_LINES"),
  
  EXCEED_FILE_COUNTS("EXCEED_FILE_COUNTS"),
  
  INVALID_FEED_ID("INVALID_FEED_ID"),
  
  TIMEOUT("TIMEOUT"),
  
  SYSTEM_ERROR("SYSTEM_ERROR"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  PageFeedItemServiceUploadJobStatus(String value) {
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
  public static PageFeedItemServiceUploadJobStatus fromValue(String value) {
    for (PageFeedItemServiceUploadJobStatus b : PageFeedItemServiceUploadJobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

