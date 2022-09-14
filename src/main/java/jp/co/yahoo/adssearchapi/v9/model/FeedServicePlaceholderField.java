/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedServicePlaceholderFieldは、FeedItem情報の内容を選択します。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedServicePlaceholderField object select the details of Feed Item information.&lt;br&gt; This field is required in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_CUSTOMIZER_INTEGER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;データ自動挿入（INTEGERタイプの入力定義）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Data Auto Insertion (Input of INTEGER type).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_CUSTOMIZER_PRICE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;データ自動挿入（PRICEタイプの入力定義）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Data Auto Insertion (Input of PRICE type).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_CUSTOMIZER_DATE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;データ自動挿入（DATEタイプの入力定義）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Data Auto Insertion (Input of DATE type).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_CUSTOMIZER_STRING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;データ自動挿入（STRINGタイプの入力定義）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Data Auto Insertion (Input of STRING type).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_PAGE_URL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;動的検索型連動広告ページフィードのページURLです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Page url of Dynamic ad for search page feeds.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_LABEL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;動的検索型連動広告ページフィードのラベルです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Label of Dynamic ad for search page feeds.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum FeedServicePlaceholderField {
  
  AD_CUSTOMIZER_INTEGER("AD_CUSTOMIZER_INTEGER"),
  
  AD_CUSTOMIZER_PRICE("AD_CUSTOMIZER_PRICE"),
  
  AD_CUSTOMIZER_DATE("AD_CUSTOMIZER_DATE"),
  
  AD_CUSTOMIZER_STRING("AD_CUSTOMIZER_STRING"),
  
  DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_PAGE_URL("DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_PAGE_URL"),
  
  DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_LABEL("DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_LABEL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedServicePlaceholderField(String value) {
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
  public static FeedServicePlaceholderField fromValue(String value) {
    for (FeedServicePlaceholderField b : FeedServicePlaceholderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

