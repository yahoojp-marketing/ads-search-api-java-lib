package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AppLinkServiceSyncStatusは、リンクID同期ステータスを表します。</div> <div lang=\"en\">Sync Status.</div> <dl class=term>   <dt class=\"term__item\">IN_PROGRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">同期中です。</span><span lang=\"en\">Synchronization is in progress.</span></dd>   <dt class=\"term__item\">COMPLETED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">同期済みです。</span><span lang=\"en\">Synchronization is complete.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AppLinkServiceSyncStatus {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  COMPLETED("COMPLETED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AppLinkServiceSyncStatus(String value) {
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
  public static AppLinkServiceSyncStatus fromValue(String value) {
    for (AppLinkServiceSyncStatus b : AppLinkServiceSyncStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

