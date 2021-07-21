package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceIsAllVisitorRuleは、すべての訪問者に対するルールか定義します。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceIsAllVisitorRule define the rule of visitors.<br> This field is required in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべての訪問者へのターゲットリストです。</span><span lang=\"en\">Target list to all visitors.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">通常の条件によるターゲットリストです。</span><span lang=\"en\">Target list in standard condition.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceIsAllVisitorRule {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceIsAllVisitorRule(String value) {
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
  public static RetargetingListServiceIsAllVisitorRule fromValue(String value) {
    for (RetargetingListServiceIsAllVisitorRule b : RetargetingListServiceIsAllVisitorRule.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

