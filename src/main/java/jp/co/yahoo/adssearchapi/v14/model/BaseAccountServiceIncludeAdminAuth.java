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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; BaseAccountServiceIncludeAdminAuthオブジェクトは、取得するアカウントに管理権限のアカウントを含むかどうかを表します。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; リクエスト時にauthTypeフィールドでREFERABLEを指定した場合、このフィールドは無視されます。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; BaseAccountServiceIncludeAdminAuth indicates whether to include accounts with admin access for accounts you get. This field is optional. If it is specified REFERABLE in authType on request, this field will be ignored. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ONLY_ADMIN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;管理権限のアカウントのみを取得します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Retrieve only accounts with admin access.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;EXCLUDE_ADMIN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;管理権限のアカウントを除外します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Exclude accounts without admin access.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum BaseAccountServiceIncludeAdminAuth {
  
  ONLY_ADMIN("ONLY_ADMIN"),
  
  EXCLUDE_ADMIN("EXCLUDE_ADMIN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  BaseAccountServiceIncludeAdminAuth(String value) {
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
  public static BaseAccountServiceIncludeAdminAuth fromValue(String value) {
    for (BaseAccountServiceIncludeAdminAuth b : BaseAccountServiceIncludeAdminAuth.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
