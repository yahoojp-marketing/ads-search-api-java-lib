package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceRuleOperatorは、ルールの評価条件で設定する評価式の種別です。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceRuleOperator is the evaluation type to set evaluation condition of rules.<br> This field is required in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未指定です。<br>※読み取り専用で設定はできなくなります。</span><span lang=\"en\">Unknown, or not been set.<br>*Cannot set for read only.</span></dd>   <dt class=\"term__item\">EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">一致します。</span><span lang=\"en\">Equals or match.</span></dd>   <dt class=\"term__item\">NOT_EQUAL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">一致しません。</span><span lang=\"en\">Do not equal nor match.</span></dd>   <dt class=\"term__item\">CONTAINS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">（指定した文字列を）含みます。</span><span lang=\"en\">Contains or include (the specified string).</span></dd>   <dt class=\"term__item\">NOT_CONTAIN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">（指定した文字列を）含みません。</span><span lang=\"en\">Does not contain nor include (the specified string).</span></dd>   <dt class=\"term__item\">STARTS_WITH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">（指定した文字列で）始まります。</span><span lang=\"en\">Starts with (the specified string).</span></dd>   <dt class=\"term__item\">NOT_START_WITH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">（指定した文字列で）始まりません。</span><span lang=\"en\">Does not start with (the specified string).</span></dd>   <dt class=\"term__item\">ENDS_WITH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">（指定した文字列で）終わります。</span><span lang=\"en\">Ends with (the specified string).</span></dd>   <dt class=\"term__item\">NOT_END_WITH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">（指定した文字列で）終わりません。</span><span lang=\"en\">Does not end with (the specified string).</span></dd> </dl> 
 */
public enum RetargetingListServiceRuleOperator {
  
  UNKNOWN("UNKNOWN"),
  
  EQUALS("EQUALS"),
  
  NOT_EQUAL("NOT_EQUAL"),
  
  CONTAINS("CONTAINS"),
  
  NOT_CONTAIN("NOT_CONTAIN"),
  
  STARTS_WITH("STARTS_WITH"),
  
  NOT_START_WITH("NOT_START_WITH"),
  
  ENDS_WITH("ENDS_WITH"),
  
  NOT_END_WITH("NOT_END_WITH");

  private String value;

  RetargetingListServiceRuleOperator(String value) {
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
  public static RetargetingListServiceRuleOperator fromValue(String value) {
    for (RetargetingListServiceRuleOperator b : RetargetingListServiceRuleOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

