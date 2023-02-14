/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceDevicePreferenceは、広告を優先的に配信するデバイスを選択します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;br&gt; 電話番号オプションの場合、ADD時に省略可能となり、SET時に無視されます。&lt;br&gt; ※ADD時のデフォルト設定値はSMART_PHONEとなります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceDevicePreference is a selection of device to deliver ads in high priority.&lt;br&gt; This field is optional in ADD and SET operation, and will be  ignored in REMOVE operation.&lt;br&gt; For CALLEXTENSION, this field is optional in ADD operation, and will be ignored in SET  operation.&lt;br&gt; *The default value for ADD operation will be SMART_PHONE.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SMART_PHONE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;スマートフォンを優先的に配信します。&lt;br&gt;作成（add）時のみご利用いただけます。&lt;br&gt;※優先デバイスの変更（set）・削除（remove）は実施できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Deliver ads to Smartphone in higher priority&lt;br&gt;Available for add operation only&lt;br&gt;It cannot be used in set or remove operation&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NONE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;指定なし&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;not specified&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum FeedItemServiceDevicePreference {
  
  SMART_PHONE("SMART_PHONE"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServiceDevicePreference(String value) {
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
  public static FeedItemServiceDevicePreference fromValue(String value) {
    for (FeedItemServiceDevicePreference b : FeedItemServiceDevicePreference.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

