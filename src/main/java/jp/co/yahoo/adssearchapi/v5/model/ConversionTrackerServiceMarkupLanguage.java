package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceMarkupLanguageは、スニペットの記述に使用するマークアップ言語を表します。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">ConversionTrackerServiceMarkupLanguage shows ConversionTrackerServiceMarkupLanguage for Snipet.<br> This field is required in ADD operation, and is optional in SET operation.</div> <dl class=term>   <dt class=\"term__item\">HTML</dt>   <dd class=\"term__desc\"><span lang=\"ja\">HTML言語です。</span><span lang=\"en\">HTML</span></dd>   <dt class=\"term__item\">CHTML</dt>   <dd class=\"term__desc\"><span lang=\"ja\">CHTML言語です。参照のみ可能です。</span><span lang=\"en\">CHTML. Reference only.</span></dd>   <dt class=\"term__item\">XHTML</dt>   <dd class=\"term__desc\"><span lang=\"ja\">XHTML言語です。参照のみ可能です。<br>※XHTMLの登録・更新は2016年6月15日で終了しました。</span><span lang=\"en\">XHTML. Reference only.<br>* Add/Update XHTML has been sunset on June15, 2016.</span></dd>   <dt class=\"term__item\">WML</dt>   <dd class=\"term__desc\"><span lang=\"ja\">WML言語です。参照のみ可能です。</span><span lang=\"en\">WML. Reference only.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceMarkupLanguage {
  
  HTML("HTML"),
  
  CHTML("CHTML"),
  
  XHTML("XHTML"),
  
  WML("WML"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceMarkupLanguage(String value) {
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
  public static ConversionTrackerServiceMarkupLanguage fromValue(String value) {
    for (ConversionTrackerServiceMarkupLanguage b : ConversionTrackerServiceMarkupLanguage.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

