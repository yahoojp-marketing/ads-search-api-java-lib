/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReportIncludeDeletedオブジェクトは、削除済みの項目をレポートに出力するかを選択します。&lt;br&gt; レポートタイプがCAMPAIGN, ADGROUP, AD, KEYWORDS, FEED_ITEM, AD_CUSTOMIZERS, WEBPAGE_CRITERIONの場合のみ、ADD時にこのフィールドは省略可能となります。&lt;br&gt; それ以外のレポートタイプの場合、ADD時、このフィールドは無視されます。&lt;br&gt; reportIncludeDeletedがFALSEの場合、以下エンティティはレポートに出力されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceReportIncludeDeleted object describes whether to output deleted items on the report or not.&lt;br&gt; If the report type is CAMPAIGN, ADGROUP, AD, KEYWORDS, FEED_ITEM, AD_CUSTOMIZERS or WEBPAGE_CRITERION, this field is optional in ADD operation.&lt;br&gt; For other report type, this field will be ignored in ADD operation.&lt;br&gt; If reportIncludeDeleted is \&quot;FALSE\&quot;, the following entities will not be output in the report. &lt;/div&gt; &lt;table border&#x3D;\&quot;1\&quot;&gt; &lt;tr&gt;&lt;th&gt;reportType&lt;/th&gt;&lt;th&gt;entity&lt;/th&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;CAMPAIGN&lt;/td&gt;&lt;td&gt;CAMPAIGN&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;ADGROUP&lt;/td&gt;&lt;td&gt;CAMPAIGN, ADGROUP&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;AD&lt;/td&gt;&lt;td&gt;CAMPAIGN, ADGROUP, AD&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;KEYWORD&lt;/td&gt;&lt;td&gt;CAMPAIGN, ADGROUP, KEYWORD&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;FEED_ITEM&lt;/td&gt;&lt;td&gt;FEED_ITEM&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;AD_CUSTOMIZERS&lt;/td&gt;&lt;td&gt;FEED_ITEM&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;WEBPAGE_CRITERION&lt;/td&gt;&lt;td&gt;CAMPAIGN, ADGROUP, CRITERION&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;出力します。&lt;br&gt;※デフォルトに設定されます。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Output.&lt;br&gt;*Default setting.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FALSE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;出力しません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Do not output.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ReportDefinitionServiceReportIncludeDeleted {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportIncludeDeleted(String value) {
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
  public static ReportDefinitionServiceReportIncludeDeleted fromValue(String value) {
    for (ReportDefinitionServiceReportIncludeDeleted b : ReportDefinitionServiceReportIncludeDeleted.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

