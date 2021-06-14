package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ReportDefinitionServiceReportTypeは、レポートの種類を表します。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">ReportDefinitionServiceReportType displays a type of available report.<br> This field is required in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">ACCOUNT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アカウントレポートです。</span><span lang=\"en\">Account Report.<br>Performance data of selected account.</span></dd>   <dt class=\"term__item\">CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンレポートです。</span><span lang=\"en\">Campaign Report.<br>Performance data for selected campaigns.</span></dd>   <dt class=\"term__item\">ADGROUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループレポートです。</span><span lang=\"en\">Ad Group Report.<br>Performance data for selected ad group for one or more of campaigns.</span></dd>   <dt class=\"term__item\">AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告レポートです。</span><span lang=\"en\">Ad Report.<br>Performance data for selected ads.</span></dd>   <dt class=\"term__item\">KEYWORDS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードレポートです。</span><span lang=\"en\">Keyword Report.<br>Performance data for selected keywords.</span></dd>   <dt class=\"term__item\">SEARCH_QUERY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">検索クエリレポートです。</span><span lang=\"en\">Search Query Report.<br>Performance data for search queries which triggered the ad and received the clicks.</span></dd>   <dt class=\"term__item\">GEO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">地域別レポートです。</span><span lang=\"en\">Geo Report.<br>Performance data by selected location.</span></dd>   <dt class=\"term__item\">FEED_ITEM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションレポートです。</span><span lang=\"en\">Ad Display Option Report.<br>Performance data for selected Quick Links and/or Call Extension.</span></dd>   <dt class=\"term__item\">GEO_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">地域ターゲティングレポートです。</span><span lang=\"en\">Geo Targeting Report.<br>Performance data for location targeting.</span></dd>   <dt class=\"term__item\">SCHEDULE_TARGET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">曜日・時間帯ターゲティングレポートです。</span><span lang=\"en\">Schedule Targeting Report.<br>Performance data in Day of Week / Hours.</span></dd>   <dt class=\"term__item\">BID_STRATEGY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">自動入札レポートです。</span><span lang=\"en\">Auto Bidding Report.<br>Performance data for selected Auto Bidding.</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZERS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入レポートです。</span><span lang=\"en\">Data Auto Insertion Report.<br>Performance data for selected Data Auto Insertion.</span></dd>   <dt class=\"term__item\">TARGET_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲットリスト設定レポートです。</span><span lang=\"en\">Target List Report.<br>Performance data for selected target list.</span></dd>   <dt class=\"term__item\">LANDING_PAGE_URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最終リンク先URLレポートです。</span><span lang=\"en\">Landing Page Report.<br>Performance data for the final URL.</span></dd>   <dt class=\"term__item\">KEYWORDLESS_QUERY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">検索クエリーレポート（動的検索連動型広告）です。</span><span lang=\"en\">Search Query Report(DAS).</span></dd>   <dt class=\"term__item\">WEBPAGE_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ページフィードターゲティングレポートです。</span><span lang=\"en\">Page Feed Targeting Report.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
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
  
  AD_CUSTOMIZERS("AD_CUSTOMIZERS"),
  
  TARGET_LIST("TARGET_LIST"),
  
  LANDING_PAGE_URL("LANDING_PAGE_URL"),
  
  KEYWORDLESS_QUERY("KEYWORDLESS_QUERY"),
  
  WEBPAGE_CRITERION("WEBPAGE_CRITERION"),
  
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

