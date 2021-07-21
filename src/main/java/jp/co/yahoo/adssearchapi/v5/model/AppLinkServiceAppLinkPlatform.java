package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AppLinkServiceAppLinkPlatformは、アプリケーションプラットフォームを表します。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">App Link Platform.<br> This field is required in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">ANDROID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ANDROID</span><span lang=\"en\">ANDROID</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AppLinkServiceAppLinkPlatform {
  
  ANDROID("ANDROID"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AppLinkServiceAppLinkPlatform(String value) {
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
  public static AppLinkServiceAppLinkPlatform fromValue(String value) {
    for (AppLinkServiceAppLinkPlatform b : AppLinkServiceAppLinkPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

