package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignExportServiceLangは、エクスポートするデータの言語設定です。<br> このフィールドは、必須です。</div> <div lang=\"en\">CampaignExportServiceLang is a language setting for exporting data.<br> This field is required.</div> <dl class=term>   <dt class=\"term__item\">JA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日本語です。</span><span lang=\"en\">Japanese.</span></dd>   <dt class=\"term__item\">EN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">英語です。</span><span lang=\"en\">English.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignExportServiceLang {
  
  JA("JA"),
  
  EN("EN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignExportServiceLang(String value) {
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
  public static CampaignExportServiceLang fromValue(String value) {
    for (CampaignExportServiceLang b : CampaignExportServiceLang.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

