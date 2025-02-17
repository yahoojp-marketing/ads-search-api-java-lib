/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理ステータスです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Processing status.&lt;/div&gt; &lt;dl class&#x3D;term&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PROCESSING&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;処理中です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Currently in progress of creating.&lt;/span&gt;&lt;/dd&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DONE&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;正常終了です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Job has completed.&lt;/span&gt;&lt;/dd&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DONE_WITH_ERROR&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;エラーあり終了です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Job has completed with error.&lt;/span&gt;&lt;/dd&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ERROR&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;エラーです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Error occurred.&lt;/span&gt;&lt;/dd&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt;
 */
public enum OfflineConversionServiceProcessStatus {
  
  PROCESSING("PROCESSING"),
  
  DONE("DONE"),
  
  DONE_WITH_ERROR("DONE_WITH_ERROR"),
  
  ERROR("ERROR"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OfflineConversionServiceProcessStatus(String value) {
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
  public static OfflineConversionServiceProcessStatus fromValue(String value) {
    for (OfflineConversionServiceProcessStatus b : OfflineConversionServiceProcessStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

