package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AuditLogServiceSourceTypeは、操作履歴における操作者を表します。<br> このフィールドは、省略可能となります。その際、デフォルト値はAPIとなります。</div> <div lang=\"en\">AuditLogServiceSourceType desribes the operator information of operation history data.<br> This field is optional. The default value will be API.</div> <dl class=term>   <dt class=\"term__item\">API</dt>   <dd class=\"term__desc\"><span lang=\"ja\">APIアカウントによる操作です。</span><span lang=\"en\">Operated by API account.</span></dd>   <dt class=\"term__item\">YAHOO_JAPAN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Yahoo!広告システムによる操作です。</span><span lang=\"en\">Operated by the system of Yahoo! JAPAN Ads.</span></dd>   <dt class=\"term__item\">CAMPAIGN_MANAGEMENT_TOOL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告管理ツールからの履歴です。</span><span lang=\"en\">Campaign Management Tool</span></dd>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべての操作者による操作です。</span><span lang=\"en\">Operated by all of operators.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AuditLogServiceSourceType {
  
  API("API"),
  
  YAHOO_JAPAN("YAHOO_JAPAN"),
  
  CAMPAIGN_MANAGEMENT_TOOL("CAMPAIGN_MANAGEMENT_TOOL"),
  
  ALL("ALL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AuditLogServiceSourceType(String value) {
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
  public static AuditLogServiceSourceType fromValue(String value) {
    for (AuditLogServiceSourceType b : AuditLogServiceSourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

