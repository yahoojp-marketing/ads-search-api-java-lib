package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ソートフィールド名です。</div> <div lang=\"en\">Sort field name.</div> <dl class=term> <dt class=\"term__item\">UPLOAD_ID</dt> <dd class=\"term__desc\"><span lang=\"ja\">アップロードIDです。</span><span lang=\"en\">Upload ID.</span></dd> <dt class=\"term__item\">UPLOAD_FILE_NAME</dt> <dd class=\"term__desc\"><span lang=\"ja\">アップロードファイル名です。</span><span lang=\"en\">Upload file name.</span></dd> <dt class=\"term__item\">PROCESS_STATUS</dt> <dd class=\"term__desc\"><span lang=\"ja\">ステータスです。</span><span lang=\"en\">Processing status.</span></dd> <dt class=\"term__item\">UPLOADED_DATE</dt> <dd class=\"term__desc\"><span lang=\"ja\">アップロード日時です。</span><span lang=\"en\">Uproad date and time.</span></dd> <dt class=\"term__item\">UPLOAD_TYPE</dt> <dd class=\"term__desc\"><span lang=\"ja\">アップロード種別です。</span><span lang=\"en\">Upload type.</span></dd> <dt class=\"term__item\">UNKNOWN</dt> <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl>
 */
public enum OfflineConversionServiceSortField {
  
  UPLOAD_ID("UPLOAD_ID"),
  
  UPLOAD_FILE_NAME("UPLOAD_FILE_NAME"),
  
  PROCESS_STATUS("PROCESS_STATUS"),
  
  UPLOADED_DATE("UPLOADED_DATE"),
  
  UPLOAD_TYPE("UPLOAD_TYPE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OfflineConversionServiceSortField(String value) {
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
  public static OfflineConversionServiceSortField fromValue(String value) {
    for (OfflineConversionServiceSortField b : OfflineConversionServiceSortField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

