package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceLogicalConditionは、組合せターゲットリストの連結条件です。<br> このフィールドは、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">RetargetingListServiceLogicalCondition is the conditions of combined target list.<br> This field is optional in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">NOT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">NOT条件の組合せです。</span><span lang=\"en\">NOT condition.</span></dd>   <dt class=\"term__item\">AND</dt>   <dd class=\"term__desc\"><span lang=\"ja\">AND条件の組合せです。</span><span lang=\"en\">AND condition.</span></dd>   <dt class=\"term__item\">OR</dt>   <dd class=\"term__desc\"><span lang=\"ja\">OR条件の組合せです。</span><span lang=\"en\">OR condition.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceLogicalCondition {
  
  AND("AND"),
  
  OR("OR"),
  
  NOT("NOT"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceLogicalCondition(String value) {
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
  public static RetargetingListServiceLogicalCondition fromValue(String value) {
    for (RetargetingListServiceLogicalCondition b : RetargetingListServiceLogicalCondition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

