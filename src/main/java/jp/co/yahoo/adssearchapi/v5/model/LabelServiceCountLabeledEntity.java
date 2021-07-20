package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">LabelServiceCountLabeledEntityは、ラベル件数集計フラグの設定です。</div> <div lang=\"en\">LabelServiceCountLabeledEntity is setting of Label number count flag.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">集計する</span><span lang=\"en\">counting</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">集計しない</span><span lang=\"en\">not count</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum LabelServiceCountLabeledEntity {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  LabelServiceCountLabeledEntity(String value) {
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
  public static LabelServiceCountLabeledEntity fromValue(String value) {
    for (LabelServiceCountLabeledEntity b : LabelServiceCountLabeledEntity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

