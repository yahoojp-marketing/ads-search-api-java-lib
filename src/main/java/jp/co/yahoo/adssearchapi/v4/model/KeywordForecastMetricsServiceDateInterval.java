package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">KeywordForecastMetricsServiceDateIntervalは、予測期間を表します。<br> CUSTOM_DATEのとき、startDateとendDateは必須です。</div> <div lang=\"en\">KeywordForecastMetricsServiceDateInterval describes the forecast period.<br> startDate and endDate is required if CUSTOM_DATE is specified.</div> <dl class=term>   <dt class=\"term__item\">NEXT_WEEK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">翌週です。</span><span lang=\"en\">Next week.</span></dd>   <dt class=\"term__item\">NEXT_MONTH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">翌月です。</span><span lang=\"en\">Next month.</span></dd>   <dt class=\"term__item\">NEXT_QUARTER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">翌四半期です。</span><span lang=\"en\">Next quarter.</span></dd>   <dt class=\"term__item\">CUSTOM_DATE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">任意期間です。</span><span lang=\"en\">Any period.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum KeywordForecastMetricsServiceDateInterval {
  
  NEXT_WEEK("NEXT_WEEK"),
  
  NEXT_MONTH("NEXT_MONTH"),
  
  NEXT_QUARTER("NEXT_QUARTER"),
  
  CUSTOM_DATE("CUSTOM_DATE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  KeywordForecastMetricsServiceDateInterval(String value) {
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
  public static KeywordForecastMetricsServiceDateInterval fromValue(String value) {
    for (KeywordForecastMetricsServiceDateInterval b : KeywordForecastMetricsServiceDateInterval.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

