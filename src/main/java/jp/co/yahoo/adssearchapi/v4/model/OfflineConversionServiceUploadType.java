package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">アップロード種別です。</div> <div lang=\"en\">Upload type.</div> <dl class=term> <dt class=\"term__item\">NEW</dt> <dd class=\"term__desc\"><span lang=\"ja\">新規アップロードです。</span><span lang=\"en\">New upload.</span></dd> <dt class=\"term__item\">ADJUSTMENT</dt> <dd class=\"term__desc\"><span lang=\"ja\">調整アップロードです。</span><span lang=\"en\">Adjustment upload.</span></dd> <dt class=\"term__item\">UNKNOWN</dt> <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl>
 */
public enum OfflineConversionServiceUploadType {
  
  NEW("NEW"),
  
  ADJUSTMENT("ADJUSTMENT"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OfflineConversionServiceUploadType(String value) {
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
  public static OfflineConversionServiceUploadType fromValue(String value) {
    for (OfflineConversionServiceUploadType b : OfflineConversionServiceUploadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

