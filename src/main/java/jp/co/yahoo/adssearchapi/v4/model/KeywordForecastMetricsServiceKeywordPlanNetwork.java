package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">KeywordForecastMetricsServiceKeywordPlanNetworkは、予測対象を表します。<br> デフォルト値はYAHOO_SEARCHです。</div> <div lang=\"en\">KeywordForecastMetricsServiceKeywordPlanNetwork describes the forecast target.<br> Default value will be \"YAHOO_SEARCH\".</div> <dl class=term>   <dt class=\"term__item\">YAHOO_SEARCH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">検索のみです。</span><span lang=\"en\">Search only.</span></dd>   <dt class=\"term__item\">SEARCH_NETWORK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">検索を含むすべての広告掲載方式です。</span><span lang=\"en\">All ad distribution, including search.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum KeywordForecastMetricsServiceKeywordPlanNetwork {
  
  YAHOO_SEARCH("YAHOO_SEARCH"),
  
  SEARCH_NETWORK("SEARCH_NETWORK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  KeywordForecastMetricsServiceKeywordPlanNetwork(String value) {
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
  public static KeywordForecastMetricsServiceKeywordPlanNetwork fromValue(String value) {
    for (KeywordForecastMetricsServiceKeywordPlanNetwork b : KeywordForecastMetricsServiceKeywordPlanNetwork.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

