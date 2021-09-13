package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">KeywordEstimatorServiceIsNegativeBoolは、対象外キーワードの対象有無を表します。</div> <div lang=\"en\">KeywordEstimatorServiceIsNegativeBool expresses it whether you include Negative Keywords in data.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外キーワードを対象にする。</span><span lang=\"en\">Intend for Negative Keywords</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外キーワードを対象にしない。</span><span lang=\"en\">Not intend for Negative Keywords</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=ja>未知の値です。</span><span lang=en>Unknown Value.</span></dd> </dl> 
 */
public enum KeywordEstimatorServiceIsNegativeBool {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  KeywordEstimatorServiceIsNegativeBool(String value) {
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
  public static KeywordEstimatorServiceIsNegativeBool fromValue(String value) {
    for (KeywordEstimatorServiceIsNegativeBool b : KeywordEstimatorServiceIsNegativeBool.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

