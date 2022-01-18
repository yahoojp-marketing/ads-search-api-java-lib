package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AuditLogServiceLangは、操作履歴ファイルの言語設定を表します。<br> このフィールドは、省略可能となります。その際、デフォルト値はJAとなります。</div> <div lang=\"en\">AuditLogServiceLang describes the language setting of operation history data file.<br> This field is optional. The default value will be JA.</div> <dl class=term>   <dt class=\"term__item\">EN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">英語です。</span><span lang=\"en\">English language</span></dd>   <dt class=\"term__item\">JA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日本語です。</span><span lang=\"en\">Japanese language</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AuditLogServiceLang {
  
  JA("JA"),
  
  EN("EN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AuditLogServiceLang(String value) {
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
  public static AuditLogServiceLang fromValue(String value) {
    for (AuditLogServiceLang b : AuditLogServiceLang.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

