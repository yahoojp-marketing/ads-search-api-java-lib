package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceConversionTrackerTypeは、コンバージョンの種別を表します。<br> このフィールドはADDおよびSET時に必須となります。</div> <div lang=\"en\">ConversionTrackerServiceConversionTrackerType describes conversion type.<br> This field is required in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">WEB_CONVERSION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ウェブページのコンバージョンです。</span><span lang=\"en\">Web page conversion</span></dd>   <dt class=\"term__item\">APP_CONVERSION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリのコンバージョンです。</span><span lang=\"en\">App conversion</span></dd>   <dt class=\"term__item\">APP_LINK_CONVERSION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリリンクコンバージョンです。</span><span lang=\"en\">App conversion</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceConversionTrackerType {
  
  WEB_CONVERSION("WEB_CONVERSION"),
  
  APP_CONVERSION("APP_CONVERSION"),
  
  APP_LINK_CONVERSION("APP_LINK_CONVERSION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceConversionTrackerType(String value) {
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
  public static ConversionTrackerServiceConversionTrackerType fromValue(String value) {
    for (ConversionTrackerServiceConversionTrackerType b : ConversionTrackerServiceConversionTrackerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

