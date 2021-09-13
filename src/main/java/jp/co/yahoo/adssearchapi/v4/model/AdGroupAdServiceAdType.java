package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupAdServiceAdTypeは、広告の配信先デバイスと配信先に応じたタイトル・説明文の文字数を表します。<br> ADD時、このフィールドは必須となります。<br>なお、選択した配信先デバイスにより、指定可能な広告の文字数は異なります。</div> <div lang=\"en\">AdGroupAdServiceAdType is device type and number of title and description character.<br>This field is required in ADD operation.<br> The number of character vary from the device type you choose.</div> <dl class=term>   <dt class=\"term__item\">EXTENDED_TEXT_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「タイトル15文字-15文字、説明文40文字」のテキスト広告です。<br>PC、スマートフォン・タブレット端末の場合にご利用いただけます。</span><span lang=\"en\">Text ads for “Title: 15 - 15 characters, Description: 40 characters”.<br>It is available for PC, Smartphone and Tablet.</span></dd>   <dt class=\"term__item\">DYNAMIC_SEARCH_LINKED_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動的検索連動型広告です。</span><span lang=\"en\">Dynamic Search Ads</span></dd>   <dt class=\"term__item\">TEXT_AD2</dt>   <dd class=\"term__desc\"><span lang=\"ja\">「タイトル15文字、説明文19文字-19文字」のテキスト広告です。<br>PC、スマートフォン・タブレット端末の場合にご利用いただけます。<br>※現在、こちらの広告タイプでは入稿できません。</span><span lang=\"en\">Text ads for “Title: 15 characters, Description: 19 characters / 19 characters”.<br>It is available for PC, Smartphone and Tablet.<br>*Currently this ad type is not available for ad creation.</span></dd>   <dt class=\"term__item\">APP_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリ用広告です。<br>スマートフォン・タブレット端末の場合にご利用いただけます。</span><span lang=\"en\">Ads for Mobile App Ads.<br>It is available for Smartphone or Tablet.</span></dd>   <dt class=\"term__item\">RESPONSIVE_SEARCH_AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">レスポンシブ広告です。</span><span lang=\"en\">Responsive Ads.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceAdType {
  
  TEXT_AD2("TEXT_AD2"),
  
  APP_AD("APP_AD"),
  
  EXTENDED_TEXT_AD("EXTENDED_TEXT_AD"),
  
  DYNAMIC_SEARCH_LINKED_AD("DYNAMIC_SEARCH_LINKED_AD"),
  
  RESPONSIVE_SEARCH_AD("RESPONSIVE_SEARCH_AD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceAdType(String value) {
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
  public static AdGroupAdServiceAdType fromValue(String value) {
    for (AdGroupAdServiceAdType b : AdGroupAdServiceAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

