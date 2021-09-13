package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">DictionaryServiceGeographicLocationStatusは、対象地域のステータスを示します。</div> <div lang=\"en\">Status of geographic location.</div> <dl class=term>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲティング可能な状態。</span><span lang=\"en\">Status when targeting is possible</span></dd>   <dt class=\"term__item\">OBSOLETE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">廃止のためターゲティング不可能な状態。</span><span lang=\"en\">Status when targeting is not possible, because it is abolished</span></dd>   <dt class=\"term__item\">PHASING_OUT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">まもなく廃止またはターゲティング不可能になる状態。</span><span lang=\"en\">Status when it soon be abolished, or targeting will become impossible</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum DictionaryServiceGeographicLocationStatus {
  
  ACTIVE("ACTIVE"),
  
  OBSOLETE("OBSOLETE"),
  
  PHASING_OUT("PHASING_OUT"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  DictionaryServiceGeographicLocationStatus(String value) {
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
  public static DictionaryServiceGeographicLocationStatus fromValue(String value) {
    for (DictionaryServiceGeographicLocationStatus b : DictionaryServiceGeographicLocationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

