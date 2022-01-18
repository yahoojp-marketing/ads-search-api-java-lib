package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">PageFeedItemServiceBulkEncodingは、ページフィードアイテムファイルのエンコーディング形式（文字コード）を表します。<br> このフィールドは省略可能です。<br> デフォルト設定値はSJISとなります。</div> <div lang=\"en\">PageFeedItemServiceBulkEncoding displays encoding(character code) of Page feed item file.<br> This field is optional.<br> The default value will be SJIS.</div> <dl class=term>   <dt class=\"term__item\">SJIS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">SJIS形式</span><span lang=\"en\">Character code:SJIS</span></dd>   <dt class=\"term__item\">UTF8</dt>   <dd class=\"term__desc\"><span lang=\"ja\">UTF8形式</span><span lang=\"en\">Character code:UTF8</span></dd>   <dt class=\"term__item\">UTF16LE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">UTF16LE形式</span><span lang=\"en\">Character code:UTF16LE</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum PageFeedItemServiceBulkEncoding {
  
  SJIS("SJIS"),
  
  UTF8("UTF8"),
  
  UTF16LE("UTF16LE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  PageFeedItemServiceBulkEncoding(String value) {
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
  public static PageFeedItemServiceBulkEncoding fromValue(String value) {
    for (PageFeedItemServiceBulkEncoding b : PageFeedItemServiceBulkEncoding.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

