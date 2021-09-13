package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AuditLogServiceEncodingは、操作履歴ファイルのエンコーディング形式（文字コード）を表します。<br> このフィールドは、省略可能となります。その際、デフォルト値はSJISとなります。</div> <div lang=\"en\">AuditLogServiceEncoding describes the encoding type (character encoding) for Operation History file.<br> This field is optional. The default value will be SJIS.</div> <dl class=term>   <dt class=\"term__item\">SJIS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">SJIS形式です。</span><span lang=\"en\">SJIS</span></dd>   <dt class=\"term__item\">UTF8</dt>   <dd class=\"term__desc\"><span lang=\"ja\">UTF8形式です。</span><span lang=\"en\">UTF8</span></dd>   <dt class=\"term__item\">UTF16LE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">UTF16LE形式です。</span><span lang=\"en\">UTF16LE</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AuditLogServiceEncoding {
  
  SJIS("SJIS"),
  
  UTF8("UTF8"),
  
  UTF16LE("UTF16LE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AuditLogServiceEncoding(String value) {
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
  public static AuditLogServiceEncoding fromValue(String value) {
    for (AuditLogServiceEncoding b : AuditLogServiceEncoding.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

