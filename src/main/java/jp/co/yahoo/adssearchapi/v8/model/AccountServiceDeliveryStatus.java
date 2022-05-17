/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountServiceDeliveryStatusは、アカウントの配信状況を表します。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt; MCCアカウントの場合、このフィールドは返却されず、リクエストの際も無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Delivery status.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; If isManagerAccount is \&quot;TRUE\&quot;, this field will not be returned and will be ignored on request.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PAUSED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;配信状況はオフです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Not active.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACTIVE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;配信状況はオンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Active&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AccountServiceDeliveryStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountServiceDeliveryStatus(String value) {
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
  public static AccountServiceDeliveryStatus fromValue(String value) {
    for (AccountServiceDeliveryStatus b : AccountServiceDeliveryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

