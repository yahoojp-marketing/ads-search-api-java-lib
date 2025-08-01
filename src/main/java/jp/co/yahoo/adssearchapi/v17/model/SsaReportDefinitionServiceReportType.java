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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SsaReportDefinitionServiceReportTypeは、レポートの種類を表します。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SsaReportDefinitionServiceReportType displays a type of available report.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACCOUNT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アカウントレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Account report.&lt;br&gt;Performance data of selected account.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign report.&lt;br&gt;Performance data for selected campaigns.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADGROUP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告グループレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad group report.&lt;br&gt;Performance data for selected ad group for one or more of campaigns.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SEARCH_QUERY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;検索クエリレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Search query report.&lt;br&gt;Performance data for search queries which triggered the ad and received the clicks.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PRODUCT_GROUP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;商品グループレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Product group report.&lt;br&gt;Performance data for selected product group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PRODUCT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;商品レポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Product report.&lt;br&gt;Performance data for selected product.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum SsaReportDefinitionServiceReportType {
  
  ACCOUNT("ACCOUNT"),
  
  CAMPAIGN("CAMPAIGN"),
  
  ADGROUP("ADGROUP"),
  
  SEARCH_QUERY("SEARCH_QUERY"),
  
  PRODUCT_GROUP("PRODUCT_GROUP"),
  
  PRODUCT("PRODUCT"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SsaReportDefinitionServiceReportType(String value) {
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
  public static SsaReportDefinitionServiceReportType fromValue(String value) {
    for (SsaReportDefinitionServiceReportType b : SsaReportDefinitionServiceReportType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

