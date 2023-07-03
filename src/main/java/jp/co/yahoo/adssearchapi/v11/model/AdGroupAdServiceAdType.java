/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceAdTypeは、広告タイプを表します。&lt;br&gt; ADDおよびSET時、このフィールドは必須となります。&lt;br&gt; 現在、SET時はRESPONSIVE_SEARCH_ADのみ指定可能です。&lt;br&gt; なお、選択した配信先デバイスにより、指定可能な広告の文字数は異なります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceAdType describes the type of ad.&lt;br&gt; This field is required in ADD and Set operation.&lt;br&gt; Currently, only RESPONSIVE_SEARCH_AD can be specified in SET operation.&lt;br&gt; The number of character vary from the device type you choose.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;EXTENDED_TEXT_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「タイトル15文字-15文字、説明文40文字」のテキスト広告です。&lt;br&gt;PC、スマートフォン・タブレット端末の場合にご利用いただけます。&lt;br&gt;※現在、こちらの広告タイプでは入稿できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Text ads for “Title: 15 - 15 characters, Description: 40 characters”.&lt;br&gt;It is available for PC, Smartphone and Tablet.&lt;br&gt;*Currently this ad type is not available for ad creation.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DYNAMIC_SEARCH_LINKED_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;動的検索連動型広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Dynamic Search Ads&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TEXT_AD2&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;「タイトル15文字、説明文19文字-19文字」のテキスト広告です。&lt;br&gt;PC、スマートフォン・タブレット端末の場合にご利用いただけます。&lt;br&gt;※現在、こちらの広告タイプでは入稿できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Text ads for “Title: 15 characters, Description: 19 characters / 19 characters”.&lt;br&gt;It is available for PC, Smartphone and Tablet.&lt;br&gt;*Currently this ad type is not available for ad creation.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APP_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アプリ用広告です。&lt;br&gt;スマートフォン・タブレット端末の場合にご利用いただけます。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ads for Mobile App Ads.&lt;br&gt;It is available for Smartphone or Tablet.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;RESPONSIVE_SEARCH_AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;レスポンシブ検索広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Responsive Ads for Search.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
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

