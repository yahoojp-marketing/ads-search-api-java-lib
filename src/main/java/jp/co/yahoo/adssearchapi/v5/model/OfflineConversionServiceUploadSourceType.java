package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">OfflineConversionServiceUploadSourceTypeは、操作履歴における操作者を表します。</div> <div lang=\"en\">OfflineConversionServiceUploadSourceType desribes the operator information of operation history data.</div> <dl class=term>   <dt class=\"term__item\">API</dt>   <dd class=\"term__desc\"><span lang=\"ja\">APIアカウントによる操作です。</span><span lang=\"en\">Operated by API account.</span></dd>   <dt class=\"term__item\">YAHOO_JAPAN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Yahoo!広告システムによる操作です。</span><span lang=\"en\">Operated by the system of Yahoo! JAPAN Ads.</span></dd>   <dt class=\"term__item\">CAMPAIGN_MANAGEMENT_TOOL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告管理ツールによる操作です。</span><span lang=\"en\">Operated by Campaign Management Tool.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl> 
 */
public enum OfflineConversionServiceUploadSourceType {
  
  API("API"),
  
  YAHOO_JAPAN("YAHOO_JAPAN"),
  
  CAMPAIGN_MANAGEMENT_TOOL("CAMPAIGN_MANAGEMENT_TOOL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OfflineConversionServiceUploadSourceType(String value) {
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
  public static OfflineConversionServiceUploadSourceType fromValue(String value) {
    for (OfflineConversionServiceUploadSourceType b : OfflineConversionServiceUploadSourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

