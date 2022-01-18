package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupFeedServicePlaceholderTypeは、FeedItem情報の種類を選択します。<br> SET時、adGroupFeedList配下では必須となり、adGroupFeed配下では無視されます。</div> <div lang=\"en\">AdGroupFeedServicePlaceholderType selects the type of FeedItem information.<br> In SET operation, this field is required under 'adGroupFeedList', and it will be ignored under 'adGroupFeed'.</div> <dl class=term>   <dt class=\"term__item\">QUICKLINK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションのクイックリンクオプションです。</span><span lang=\"en\">QuickLinks of Ad Display Options.</span></dd>   <dt class=\"term__item\">CALLEXTENSION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションの電話番号オプションです。</span><span lang=\"en\">Call Extensions of Ad Display Options.</span></dd>   <dt class=\"term__item\">CALLOUT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">テキスト補足オプションです。</span><span lang=\"en\">Callout option.</span></dd>   <dt class=\"term__item\">STRUCTURED_SNIPPET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カテゴリ補足オプションです。</span><span lang=\"en\">Structured snippet option.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupFeedServicePlaceholderType {
  
  QUICKLINK("QUICKLINK"),
  
  CALLEXTENSION("CALLEXTENSION"),
  
  CALLOUT("CALLOUT"),
  
  STRUCTURED_SNIPPET("STRUCTURED_SNIPPET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupFeedServicePlaceholderType(String value) {
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
  public static AdGroupFeedServicePlaceholderType fromValue(String value) {
    for (AdGroupFeedServicePlaceholderType b : AdGroupFeedServicePlaceholderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

