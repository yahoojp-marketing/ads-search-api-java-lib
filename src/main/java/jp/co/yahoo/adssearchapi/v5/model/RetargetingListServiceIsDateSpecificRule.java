package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceIsDateSpecificRuleは、期限付きルールか定義します。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">RetargetingListServiceIsDateSpecificRule defines the rule with deadline.<br> This field is optional in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">期限が付くルールとして定義します。</span><span lang=\"en\">Rule with deadline.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">期限を付けないルールとして定義します。</span><span lang=\"en\">Rule without deadline.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceIsDateSpecificRule {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceIsDateSpecificRule(String value) {
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
  public static RetargetingListServiceIsDateSpecificRule fromValue(String value) {
    for (RetargetingListServiceIsDateSpecificRule b : RetargetingListServiceIsDateSpecificRule.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

