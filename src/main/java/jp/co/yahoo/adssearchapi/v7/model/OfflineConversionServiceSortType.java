package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">OfflineConversionServiceSortTypeは、ソート条件を表します。</div> <div lang=\"en\">OfflineConversionServiceSortType is a sort condition type.</div> <dl class=term> <dt class=\"term__item\">ASC</dt> <dd class=\"term__desc\"><span lang=\"ja\">昇順にソートされます。</span><span lang=\"en\">Sort in ascending order.</span></dd> <dt class=\"term__item\">DESC</dt> <dd class=\"term__desc\"><span lang=\"ja\">降順にソートされます。</span><span lang=\"en\">Sort in descending order.</span></dd> <dt class=\"term__item\">UNKNOWN</dt> <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value.</span></dd> </dl>
 */
public enum OfflineConversionServiceSortType {
  
  ASC("ASC"),
  
  DESC("DESC"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  OfflineConversionServiceSortType(String value) {
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
  public static OfflineConversionServiceSortType fromValue(String value) {
    for (OfflineConversionServiceSortType b : OfflineConversionServiceSortType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

