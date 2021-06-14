package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">処理ステータスです。</div> <div lang=\"en\">Processing status.</div> <dl class=term> <dt class=\"term__item\">PROCESSING</dt> <dd class=\"term__desc\"><span lang=\"ja\">処理中です。</span><span lang=\"en\">Currently in progress of creating.</span></dd> <dt class=\"term__item\">DONE</dt> <dd class=\"term__desc\"><span lang=\"ja\">正常終了です。</span><span lang=\"en\">Job has completed.</span></dd> <dt class=\"term__item\">DONE_WITH_ERROR</dt> <dd class=\"term__desc\"><span lang=\"ja\">エラーあり終了です。</span><span lang=\"en\">Job has completed with error.</span></dd> <dt class=\"term__item\">ERROR</dt> <dd class=\"term__desc\"><span lang=\"ja\">エラーです。</span><span lang=\"en\">Error occurred.</span></dd> <dt class=\"term__item\">UNKNOWN</dt> <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl>
 */
public enum OfflineConversionServiceProcessStatus {
  
  PROCESSING("PROCESSING"),
  
  DONE("DONE"),
  
  DONE_WITH_ERROR("DONE_WITH_ERROR"),
  
  ERROR("ERROR"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OfflineConversionServiceProcessStatus(String value) {
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
  public static OfflineConversionServiceProcessStatus fromValue(String value) {
    for (OfflineConversionServiceProcessStatus b : OfflineConversionServiceProcessStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

