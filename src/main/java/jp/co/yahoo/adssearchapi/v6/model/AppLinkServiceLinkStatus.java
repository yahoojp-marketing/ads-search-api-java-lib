package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AppLinkServiceLinkStatusは、リンクステータスを表します。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Link Status.<br> This field is required in SET operation.</div> <dl class=term>   <dt class=\"term__item\">ENABLED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リンクは有効です。</span><span lang=\"en\">The link is valid.</span></dd>   <dt class=\"term__item\">DISABLED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リンクは無効です。</span><span lang=\"en\">The link is invalid.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AppLinkServiceLinkStatus {
  
  ENABLED("ENABLED"),
  
  DISABLED("DISABLED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AppLinkServiceLinkStatus(String value) {
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
  public static AppLinkServiceLinkStatus fromValue(String value) {
    for (AppLinkServiceLinkStatus b : AppLinkServiceLinkStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

