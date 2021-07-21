package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ReportDefinitionServiceReportLanguageは、レポート定義の言語選択を表します。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">ReportDefinitionServiceReportLanguage is a language selection for report definition.<br> This field is optional in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">JA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">言語：日本語です。<br>※デフォルトに設定されます。</span><span lang=\"en\">Language: Japanese.<br> *Default setting.</span></dd>   <dt class=\"term__item\">EN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">言語：英語です。</span><span lang=\"en\">Language: English.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportLanguage {
  
  JA("JA"),
  
  EN("EN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportLanguage(String value) {
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
  public static ReportDefinitionServiceReportLanguage fromValue(String value) {
    for (ReportDefinitionServiceReportLanguage b : ReportDefinitionServiceReportLanguage.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

