package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupCriterionServiceCriterionTypeは、クライテリアを表します。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">AdGroupCriterionServiceCriterionType displays the type of criteria.<br> This field is required in any cases.</div> <dl class=term>   <dt class=\"term__item\">KEYWORD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードです。</span><span lang=\"en\">Keyword.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupCriterionServiceCriterionType {
  
  KEYWORD("KEYWORD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupCriterionServiceCriterionType(String value) {
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
  public static AdGroupCriterionServiceCriterionType fromValue(String value) {
    for (AdGroupCriterionServiceCriterionType b : AdGroupCriterionServiceCriterionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

