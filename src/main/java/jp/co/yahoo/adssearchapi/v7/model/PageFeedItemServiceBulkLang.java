package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">PageFeedItemServiceBulkLangは、ページフィードアイテムファイルの言語設定を表します。<br> このフィールドは省略可能です。<br> デフォルト設定値はJAとなります。</div> <div lang=\"en\">PageFeedItemServiceBulkLang displays language setting of Page feed item file.<br> This field is optional.<br> The default value will be JA.</div> <dl class=term>   <dt class=\"term__item\">JA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日本語</span><span lang=\"en\">Language:Japanese</span></dd>   <dt class=\"term__item\">EN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">英語</span><span lang=\"en\">Language:English</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum PageFeedItemServiceBulkLang {
  
  JA("JA"),
  
  EN("EN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  PageFeedItemServiceBulkLang(String value) {
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
  public static PageFeedItemServiceBulkLang fromValue(String value) {
    for (PageFeedItemServiceBulkLang b : PageFeedItemServiceBulkLang.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

