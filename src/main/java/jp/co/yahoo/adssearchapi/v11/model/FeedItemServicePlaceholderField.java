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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServicePlaceholderFieldは、FeedItem情報の内容を選択します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。&lt;br&gt; ※アドカスタマイザーの場合は、ADDおよびSET時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServicePlaceholderField object selects FeedItem information details.&lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; *For AD_CUSTOMIZER,  this field will be ignored in ADD and SET operation.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LINK_TEXT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;クイックリンクアセットのテキストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Quick link asset text.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LINK_DESCRIPTION_1&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;クイックリンク説明文1&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Quick link description 1. &lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LINK_DESCRIPTION_2&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;クイックリンク説明文2&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Quick link description 2. &lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADVANCED_URL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Landing Page URL.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADVANCED_MOBILE_URL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;スマートフォン向けURLです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Smartphone Landing Page URL.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRACKING_URL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CALL_PHONE_NUMBER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;電話番号アセットの電話番号です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Phone number of Call assets.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_CUSTOMIZER_INTEGER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;データ自動挿入（INTEGERタイプの入力定義）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Auto data insertion (INTEGER type defined).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_CUSTOMIZER_PRICE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;データ自動挿入（PRICEタイプの入力定義）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Auto data insertion (PRICE type defined).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_CUSTOMIZER_DATE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;データ自動挿入（DATEタイプの入力定義）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Auto data insertion (DATE type defined).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_CUSTOMIZER_STRING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;データ自動挿入（STRINGタイプの入力定義）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Auto data insertion (STRING type defined.).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CALLOUT_TEXT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;テキスト補足アセットのテキストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Text for Callout asset.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADDITIONAL_ADVANCED_URLS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLを2件以上設定する場合の入力定義です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Define when multiple Landing Page URLs are set.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADDITIONAL_ADVANCED_MOBILE_URLS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;スマートフォン向けURLを2件以上設定する場合の入力定義です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Define when multiple smartphone landing page URLs are set.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;STRUCTURED_SNIPPET_HEADER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ補足アセット（ヘッダ）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Category snippet asset (header)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;STRUCTURED_SNIPPET_VALUES&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ補足アセット（バリュー）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Category snippet asset (value)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum FeedItemServicePlaceholderField {
  
  LINK_TEXT("LINK_TEXT"),
  
  LINK_DESCRIPTION_1("LINK_DESCRIPTION_1"),
  
  LINK_DESCRIPTION_2("LINK_DESCRIPTION_2"),
  
  ADVANCED_URL("ADVANCED_URL"),
  
  ADVANCED_MOBILE_URL("ADVANCED_MOBILE_URL"),
  
  TRACKING_URL("TRACKING_URL"),
  
  CALL_PHONE_NUMBER("CALL_PHONE_NUMBER"),
  
  AD_CUSTOMIZER_INTEGER("AD_CUSTOMIZER_INTEGER"),
  
  AD_CUSTOMIZER_PRICE("AD_CUSTOMIZER_PRICE"),
  
  AD_CUSTOMIZER_DATE("AD_CUSTOMIZER_DATE"),
  
  AD_CUSTOMIZER_STRING("AD_CUSTOMIZER_STRING"),
  
  CALLOUT_TEXT("CALLOUT_TEXT"),
  
  ADDITIONAL_ADVANCED_URLS("ADDITIONAL_ADVANCED_URLS"),
  
  ADDITIONAL_ADVANCED_MOBILE_URLS("ADDITIONAL_ADVANCED_MOBILE_URLS"),
  
  STRUCTURED_SNIPPET_HEADER("STRUCTURED_SNIPPET_HEADER"),
  
  STRUCTURED_SNIPPET_VALUES("STRUCTURED_SNIPPET_VALUES"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServicePlaceholderField(String value) {
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
  public static FeedItemServicePlaceholderField fromValue(String value) {
    for (FeedItemServicePlaceholderField b : FeedItemServicePlaceholderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

