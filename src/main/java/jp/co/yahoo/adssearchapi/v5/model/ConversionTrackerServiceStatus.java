package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceStatusは、コンバージョントラッカー情報のステータスを表します。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">It shows ConversionTracker status.<br> This field is required in ADD operation, and is optional in SET operation.</div> <dl class=term>   <dt class=\"term__item\">ENABLED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンページへのアクセスが記録されます。</span><span lang=\"en\">It records access to Conversion page.</span></dd>   <dt class=\"term__item\">DISABLED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンページへのアクセスが記録されません。</span><span lang=\"en\">It does not record access to Conversion page.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceStatus {
  
  ENABLED("ENABLED"),
  
  DISABLED("DISABLED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceStatus(String value) {
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
  public static ConversionTrackerServiceStatus fromValue(String value) {
    for (ConversionTrackerServiceStatus b : ConversionTrackerServiceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

