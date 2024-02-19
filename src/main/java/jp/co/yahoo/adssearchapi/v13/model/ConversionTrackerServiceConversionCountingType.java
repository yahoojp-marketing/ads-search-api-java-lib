/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceConversionCountingTypeは、コンバージョンの計測方法を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※ADD時のデフォルト設定値はONE_PER_CLICKとなります。&lt;br&gt; ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがfirst_openの場合はONE_PER_CLICKのみ指定可能となります。&lt;br&gt; appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceConversionCountingType describes how to count conversions.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; * The default value in ADD operation will be ONE_PER_CLICK.&lt;br&gt; * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is first_open, Only ONE_PER_CLICK can be specified.&lt;br&gt; appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ONE_PER_CLICK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ユニークコンバージョンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;One particular conversion.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MANY_PER_CLICK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;総コンバージョンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Total conversions (greater than one_per_click).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ConversionTrackerServiceConversionCountingType {
  
  ONE_PER_CLICK("ONE_PER_CLICK"),
  
  MANY_PER_CLICK("MANY_PER_CLICK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceConversionCountingType(String value) {
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
  public static ConversionTrackerServiceConversionCountingType fromValue(String value) {
    for (ConversionTrackerServiceConversionCountingType b : ConversionTrackerServiceConversionCountingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

