/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementServiceEnterpriseTypePositionは、企業形態の位置を表します。&lt;br&gt; このフィールドは、ADD時に省略可能となり、SET時は無視されます。&lt;br&gt; ※ADD時、enterpriseTypeがKOJIN（個人事業主）またはOTHER（その他法人）の場合は設定できません。&lt;br&gt; ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。&lt;br&gt; ※このフィールドは、レスポンスの際に返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagementServiceEnterpriseTypePosition describes the position of enterprise type.&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET operation.&lt;br&gt; * Cannot be set when enterpriseType is KOJIN or OTHER in ADD operation.&lt;br&gt; * When clientType is \&quot;SELF\&quot;, this field will be ignored in ADD and SET operations.&lt;br&gt; * This field is not returned in the response.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FRONT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;会社名の前です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Enterprise type is placed before the company name.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BACK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;会社名の後ろです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Enterprise type is placed after the company name.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AccountManagementServiceEnterpriseTypePosition {
  
  FRONT("FRONT"),
  
  BACK("BACK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountManagementServiceEnterpriseTypePosition(String value) {
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
  public static AccountManagementServiceEnterpriseTypePosition fromValue(String value) {
    for (AccountManagementServiceEnterpriseTypePosition b : AccountManagementServiceEnterpriseTypePosition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

