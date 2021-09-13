package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceAppPostbackUrlClearFlagは、ポストバックURLのクリアフラグです。</div> <div lang=\"en\">AppPostbackUrlClearFlg is the clear flag of postback URL.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">フラグはONです。</span><span lang=\"en\">Flag is ON.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceAppPostbackUrlClearFlag {
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceAppPostbackUrlClearFlag(String value) {
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
  public static ConversionTrackerServiceAppPostbackUrlClearFlag fromValue(String value) {
    for (ConversionTrackerServiceAppPostbackUrlClearFlag b : ConversionTrackerServiceAppPostbackUrlClearFlag.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

