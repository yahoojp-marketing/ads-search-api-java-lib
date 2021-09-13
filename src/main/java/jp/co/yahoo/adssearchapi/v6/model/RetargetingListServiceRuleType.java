package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceRuleTypeは、ターゲットリストのルール種別です。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceRuleType is the rule type of target list.<br> This field is required in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">URL_RULE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">URLルール</span><span lang=\"en\">URL rules.</span></dd>   <dt class=\"term__item\">CUSTOM_KEY_RULE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムキールール</span><span lang=\"en\">Custom key rules.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceRuleType {
  
  URL_RULE("URL_RULE"),
  
  CUSTOM_KEY_RULE("CUSTOM_KEY_RULE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceRuleType(String value) {
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
  public static RetargetingListServiceRuleType fromValue(String value) {
    for (RetargetingListServiceRuleType b : RetargetingListServiceRuleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

