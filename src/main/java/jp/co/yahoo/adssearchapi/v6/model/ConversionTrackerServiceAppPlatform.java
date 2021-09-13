package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceAppPlatformは、アプリのプラットフォームです。<br> このフィールドは、ADD時に必須となります。</div> <div lang=\"en\">ConversionTrackerServiceAppPlatform is App platform.<br> This field is required in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">ANDROID_MARKET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Androidマーケットのプラットフォームです。</span><span lang=\"en\">Android market</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceAppPlatform {
  
  ANDROID_MARKET("ANDROID_MARKET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceAppPlatform(String value) {
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
  public static ConversionTrackerServiceAppPlatform fromValue(String value) {
    for (ConversionTrackerServiceAppPlatform b : ConversionTrackerServiceAppPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

