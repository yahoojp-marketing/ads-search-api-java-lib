package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ReportDefinitionServiceReportDateRangeTypeは、レポートの集計対象期間を表します。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">ReportDefinitionServiceReportDateRangeType displays a date range of the report.<br> This field is required in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">TODAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">本日です。</span><span lang=\"en\">Reports are generated for today only.</span></dd>   <dt class=\"term__item\">YESTERDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">昨日です。</span><span lang=\"en\">Reports are generated for yesterday only.</span></dd>   <dt class=\"term__item\">LAST_7_DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">本日を除く、過去7日間です。</span><span lang=\"en\">Reports are generated for the last 7 days not including today.</span></dd>   <dt class=\"term__item\">LAST_WEEK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">先週の月曜日から日曜日です。</span><span lang=\"en\">Reports are generated for the 7 day period, starting from previous Monday.</span></dd>   <dt class=\"term__item\">LAST_14_DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">本日を除く、過去14日間です。</span><span lang=\"en\">Reports are generated for the last 14 days, not including today.</span></dd>   <dt class=\"term__item\">LAST_30_DAYS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">本日を除く、過去30日間です。</span><span lang=\"en\">Reports are generated for the last 30 days, not including today.</span></dd>   <dt class=\"term__item\">LAST_BUSINESS_WEEK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">先週の月曜日から5営業日です。</span><span lang=\"en\">Reports are generated for the 5 business day, starting from previous Monday.</span></dd>   <dt class=\"term__item\">THIS_MONTH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">本日を含む、当月です。</span><span lang=\"en\">Reports are generated for all days of current month.</span></dd>   <dt class=\"term__item\">LAST_MONTH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">前月です。</span><span lang=\"en\">Reports are generated for all days of previous month.</span></dd>   <dt class=\"term__item\">ALL_TIME</dt>   <dd class=\"term__desc\"><span lang=\"ja\">取得可能な全期間です。</span><span lang=\"en\">Reports are generated for all available time range.</span></dd>   <dt class=\"term__item\">CUSTOM_DATE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ユーザーにより指定される期間です。<br>こちらには集計対象期間の指定が必要です。</span><span lang=\"en\">Reports are generated for specified date range.<br>Specific date must be input through DateRange.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
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
  
  LAST_MONTH("LAST_MONTH"),
  
  ALL_TIME("ALL_TIME"),
  
  CUSTOM_DATE("CUSTOM_DATE"),
  
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

