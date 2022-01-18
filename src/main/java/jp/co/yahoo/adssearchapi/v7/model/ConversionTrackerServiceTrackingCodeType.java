package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceTrackingCodeTypeは、ウェブページのトラッキングタイプを表します。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">ConversionTrackerServiceTrackingCodeType describes tracking type of web page.<br> This field is required in ADD operation, and is optional in SET operation.</div> <dl class=term>   <dt class=\"term__item\">WEBPAGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ウェブページでのコンバージョンです。</span><span lang=\"en\">Web page conversion</span></dd>   <dt class=\"term__item\">CLICK_TO_CALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">電話番号発信のコンバージョンです。</span><span lang=\"en\">Click to call conversion</span></dd>   <dt class=\"term__item\">IMPORT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">インポートのコンバージョンです。</span><span lang=\"en\">Import conversion</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceTrackingCodeType {
  
  WEBPAGE("WEBPAGE"),
  
  CLICK_TO_CALL("CLICK_TO_CALL"),
  
  IMPORT("IMPORT"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceTrackingCodeType(String value) {
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
  public static ConversionTrackerServiceTrackingCodeType fromValue(String value) {
    for (ConversionTrackerServiceTrackingCodeType b : ConversionTrackerServiceTrackingCodeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

