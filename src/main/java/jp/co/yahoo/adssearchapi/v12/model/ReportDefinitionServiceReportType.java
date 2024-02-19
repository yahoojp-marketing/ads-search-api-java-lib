/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReportTypeは、レポートの種類を表します。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceReportType displays a type of available report.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACCOUNT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アカウントレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Account report.&lt;br&gt;Performance data of selected account.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign report.&lt;br&gt;Performance data for selected campaigns.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADGROUP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告グループレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad group report.&lt;br&gt;Performance data for selected ad group for one or more of campaigns.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告レポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad report.&lt;br&gt;Performance data for selected ads.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;KEYWORDS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キーワードレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Keyword report.&lt;br&gt;Performance data for selected keywords.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SEARCH_QUERY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;検索クエリレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Search query report.&lt;br&gt;Performance data for search queries which triggered the ad and received the clicks.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GEO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;地域別レポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Geo report.&lt;br&gt;Performance data by selected location.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FEED_ITEM&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告表示オプションレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad display option report.&lt;br&gt;Performance data for selected Quick Links and/or Call Extension.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GEO_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;地域ターゲティングレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Geo targeting report.&lt;br&gt;Performance data for location targeting.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SCHEDULE_TARGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;曜日・時間帯ターゲティングレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Schedule targeting report.&lt;br&gt;Performance data in Day of Week / Hours.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BID_STRATEGY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札レポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Auto Bidding report.&lt;br&gt;Performance data for selected Auto Bidding.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN_TARGET_LIST&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンターゲット設定レポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign target report.&lt;br&gt;Performance data for selected target list.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADGROUP_TARGET_LIST&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告グループ設定レポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad group report.&lt;br&gt;Performance data for selected target list.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LANDING_PAGE_URL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Landing page report.&lt;br&gt;Performance data for the final URL.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;KEYWORDLESS_QUERY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;検索クエリーレポート（動的検索連動型広告）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Search query report(DAS).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;WEBPAGE_CRITERION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ページフィードターゲティングレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Page feed targeting report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BID_MODIFIER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;入札価格調整率レポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Bid modifier report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;（新）広告表示オプションレポート（キャンペーン）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;(New) Ad display option report (campaign).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADGROUP_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;（新）広告表示オプションレポート（広告グループ）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;(New) Ad display option report (ad group).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;RESPONSIVE_ADS_FOR_SEARCH_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;レスポンシブ検索広告アセットレポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Responsive Ads for search asset report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN_BUDGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;共有予算レポートです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign budget report.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ReportDefinitionServiceReportType {
  
  ACCOUNT("ACCOUNT"),
  
  CAMPAIGN("CAMPAIGN"),
  
  ADGROUP("ADGROUP"),
  
  AD("AD"),
  
  KEYWORDS("KEYWORDS"),
  
  SEARCH_QUERY("SEARCH_QUERY"),
  
  GEO("GEO"),
  
  FEED_ITEM("FEED_ITEM"),
  
  GEO_TARGET("GEO_TARGET"),
  
  SCHEDULE_TARGET("SCHEDULE_TARGET"),
  
  BID_STRATEGY("BID_STRATEGY"),
  
  CAMPAIGN_TARGET_LIST("CAMPAIGN_TARGET_LIST"),
  
  ADGROUP_TARGET_LIST("ADGROUP_TARGET_LIST"),
  
  LANDING_PAGE_URL("LANDING_PAGE_URL"),
  
  KEYWORDLESS_QUERY("KEYWORDLESS_QUERY"),
  
  WEBPAGE_CRITERION("WEBPAGE_CRITERION"),
  
  BID_MODIFIER("BID_MODIFIER"),
  
  CAMPAIGN_ASSET("CAMPAIGN_ASSET"),
  
  ADGROUP_ASSET("ADGROUP_ASSET"),
  
  RESPONSIVE_ADS_FOR_SEARCH_ASSET("RESPONSIVE_ADS_FOR_SEARCH_ASSET"),
  
  CAMPAIGN_BUDGET("CAMPAIGN_BUDGET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportType(String value) {
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
  public static ReportDefinitionServiceReportType fromValue(String value) {
    for (ReportDefinitionServiceReportType b : ReportDefinitionServiceReportType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

