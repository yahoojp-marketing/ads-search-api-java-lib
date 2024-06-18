/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ソートフィールド名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Sort field name.&lt;/div&gt; &lt;dl class&#x3D;term&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UPLOAD_ID&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アップロードIDです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Upload ID.&lt;/span&gt;&lt;/dd&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UPLOAD_FILE_NAME&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アップロードファイル名です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Upload file name.&lt;/span&gt;&lt;/dd&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PROCESS_STATUS&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ステータスです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Processing status.&lt;/span&gt;&lt;/dd&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UPLOADED_DATE&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アップロード日時です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Upload date and time.&lt;/span&gt;&lt;/dd&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UPLOAD_TYPE&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アップロード種別です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Upload type.&lt;/span&gt;&lt;/dd&gt; &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt; &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt;
 */
public enum OfflineConversionServiceSortField {
  
  UPLOAD_ID("UPLOAD_ID"),
  
  UPLOAD_FILE_NAME("UPLOAD_FILE_NAME"),
  
  PROCESS_STATUS("PROCESS_STATUS"),
  
  UPLOADED_DATE("UPLOADED_DATE"),
  
  UPLOAD_TYPE("UPLOAD_TYPE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OfflineConversionServiceSortField(String value) {
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
  public static OfflineConversionServiceSortField fromValue(String value) {
    for (OfflineConversionServiceSortField b : OfflineConversionServiceSortField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

