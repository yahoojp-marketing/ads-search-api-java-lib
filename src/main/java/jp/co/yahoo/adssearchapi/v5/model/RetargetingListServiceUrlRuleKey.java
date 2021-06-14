package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceUrlRuleKeyは、URLルールに設定する評価項目です。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceUrlRuleKey is the evaluation to set URL rules.<br> This field is required in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">URLです。</span><span lang=\"en\">URL.</span></dd>   <dt class=\"term__item\">REFFER_URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">リファラURLです。</span><span lang=\"en\">Refer URL.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceUrlRuleKey {
  
  URL("URL"),
  
  REFFER_URL("REFFER_URL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceUrlRuleKey(String value) {
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
  public static RetargetingListServiceUrlRuleKey fromValue(String value) {
    for (RetargetingListServiceUrlRuleKey b : RetargetingListServiceUrlRuleKey.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

