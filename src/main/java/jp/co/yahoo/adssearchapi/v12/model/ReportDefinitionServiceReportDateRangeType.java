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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReportDateRangeTypeは、レポートの集計対象期間を表します。&lt;br&gt; ADD時、reportTypeがBID_MODIFIER以外の場合、このフィールドは必須となります。&lt;br&gt; ※reportTypeがBID_MODIFIERの場合、このフィールドは、レスポンスの際にNO_RANGEが返却されますが、リクエストの際には指定できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceReportDateRangeType displays a date range of the report.&lt;br&gt; In ADD operation, this field is required if reportType is other than BID_MODIFIER.&lt;br&gt; *If reportType is BID_MODIFIER, this field will return NO_RANGE in response, but cannot be specified in request.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TODAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for today only.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;YESTERDAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;昨日です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for yesterday only.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_7_DAYS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日を除く、過去7日間です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the last 7 days not including today.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_WEEK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;先週の月曜日から日曜日です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the 7 day period, starting from previous Monday.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_14_DAYS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日を除く、過去14日間です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the last 14 days, not including today.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_30_DAYS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日を除く、過去30日間です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the last 30 days, not including today.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_BUSINESS_WEEK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;先週の月曜日から5営業日です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for the 5 business day, starting from previous Monday.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;THIS_MONTH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日を含む、当月です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for all days of current month.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;THIS_MONTH_EXCEPT_TODAY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;本日を除く、当月です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for current month except today.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LAST_MONTH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;前月です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for all days of previous month.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ALL_TIME&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;取得可能な全期間です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for all available time range.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CUSTOM_DATE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ユーザーにより指定される期間です。&lt;br&gt;こちらには集計対象期間の指定が必要です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reports are generated for specified date range.&lt;br&gt;Specific date must be input through DateRange.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NO_RANGE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;期間指定なしです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;No period is specified.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ReportDefinitionServiceReportDateRangeType {
  
  TODAY("TODAY"),
  
  YESTERDAY("YESTERDAY"),
  
  LAST_7_DAYS("LAST_7_DAYS"),
  
  LAST_WEEK("LAST_WEEK"),
  
  LAST_14_DAYS("LAST_14_DAYS"),
  
  LAST_30_DAYS("LAST_30_DAYS"),
  
  LAST_BUSINESS_WEEK("LAST_BUSINESS_WEEK"),
  
  THIS_MONTH("THIS_MONTH"),
  
  THIS_MONTH_EXCEPT_TODAY("THIS_MONTH_EXCEPT_TODAY"),
  
  LAST_MONTH("LAST_MONTH"),
  
  ALL_TIME("ALL_TIME"),
  
  CUSTOM_DATE("CUSTOM_DATE"),
  
  NO_RANGE("NO_RANGE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportDateRangeType(String value) {
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
  public static ReportDefinitionServiceReportDateRangeType fromValue(String value) {
    for (ReportDefinitionServiceReportDateRangeType b : ReportDefinitionServiceReportDateRangeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

