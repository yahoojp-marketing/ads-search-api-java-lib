package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedItemServicePlaceholderTypeは、FeedItem情報の種類を選択します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">FeedItemServicePlaceholderType selects FeeItem information type.<br> Although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">QUICKLINK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションのクイックリンクオプションです。</span><span lang=\"en\">QuickLink option from Ad Display Option</span></dd>   <dt class=\"term__item\">CALLEXTENSION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションの電話番号オプションです。</span><span lang=\"en\">Call Extension (Phone Number) option from Ad Display Option</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入です。</span><span lang=\"en\">Data Auto Insertion</span></dd>   <dt class=\"term__item\">CALLOUT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">テキスト補足オプションです。</span><span lang=\"en\">Callout option from Ad Display Option</span></dd>   <dt class=\"term__item\">STRUCTURED_SNIPPET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カテゴリ補足オプションです。</span><span lang=\"en\">Structured snippet option from Ad Display Option</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedItemServicePlaceholderType {
  
  QUICKLINK("QUICKLINK"),
  
  CALLEXTENSION("CALLEXTENSION"),
  
  AD_CUSTOMIZER("AD_CUSTOMIZER"),
  
  CALLOUT("CALLOUT"),
  
  STRUCTURED_SNIPPET("STRUCTURED_SNIPPET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServicePlaceholderType(String value) {
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
  public static FeedItemServicePlaceholderType fromValue(String value) {
    for (FeedItemServicePlaceholderType b : FeedItemServicePlaceholderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

