package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">SharedCriterionServiceUseは、キーワードの種別を表示します。</div> <div lang=\"en\">SharedCriterionServiceUse describes keyword type.</div> <dl class=term>   <dt class=\"term__item\">NEGATIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外キーワードです。</span><span lang=\"en\">Negative keyword list.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum SharedCriterionServiceUse {
  
  NEGATIVE("NEGATIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  SharedCriterionServiceUse(String value) {
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
  public static SharedCriterionServiceUse fromValue(String value) {
    for (SharedCriterionServiceUse b : SharedCriterionServiceUse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

