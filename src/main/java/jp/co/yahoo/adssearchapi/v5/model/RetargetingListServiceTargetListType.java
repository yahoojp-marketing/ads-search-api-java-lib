package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceTargetListTypeは、ターゲットリストの種別です。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">RetargetingListServiceTargetListType is the type of target list.<br> This field is required in any cases.</div> <dl class=term>   <dt class=\"term__item\">DEFAULT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">デフォルトリストです。</span><span lang=\"en\">Default list</span></dd>   <dt class=\"term__item\">RULE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">URL条件リストです。</span><span lang=\"en\">URL Condition list</span></dd>   <dt class=\"term__item\">LOGICAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">組み合わせリストです。</span><span lang=\"en\">Combination list</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceTargetListType {
  
  DEFAULT("DEFAULT"),
  
  RULE("RULE"),
  
  LOGICAL("LOGICAL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceTargetListType(String value) {
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
  public static RetargetingListServiceTargetListType fromValue(String value) {
    for (RetargetingListServiceTargetListType b : RetargetingListServiceTargetListType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

