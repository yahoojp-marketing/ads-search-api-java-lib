package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">KeywordForecastMetricsServiceMatchTypeは、キーワードのマッチタイプを表します。</div> <div lang=\"en\">KeywordForecastMetricsServiceMatchType describes keyword match type.</div> <dl class=term>   <dt class=\"term__item\">EXACT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">完全一致です。</span><span lang=\"en\">Exact match.</span></dd>   <dt class=\"term__item\">PHRASE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">フレーズ一致です。</span><span lang=\"en\">Phrase match.</span></dd>   <dt class=\"term__item\">BROAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">部分一致です。</span><span lang=\"en\">Broad match.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=ja>未知の値です。</span><span lang=en>Unknown Value.</span></dd> </dl> 
 */
public enum KeywordForecastMetricsServiceMatchType {
  
  EXACT("EXACT"),
  
  PHRASE("PHRASE"),
  
  BROAD("BROAD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  KeywordForecastMetricsServiceMatchType(String value) {
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
  public static KeywordForecastMetricsServiceMatchType fromValue(String value) {
    for (KeywordForecastMetricsServiceMatchType b : KeywordForecastMetricsServiceMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

