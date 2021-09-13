package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupCriterionServiceKeywordMatchTypeは、キーワードのマッチタイプを表します。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupCriterionServiceKeywordMatchType describes keyword match type.<br> This field is required in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">EXACT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">完全一致です。</span><span lang=\"en\">Exact match.</span></dd>   <dt class=\"term__item\">PHRASE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">フレーズ一致です。</span><span lang=\"en\">Phrase match.</span></dd>   <dt class=\"term__item\">BROAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">部分一致です。</span><span lang=\"en\">Broad match.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupCriterionServiceKeywordMatchType {
  
  EXACT("EXACT"),
  
  PHRASE("PHRASE"),
  
  BROAD("BROAD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupCriterionServiceKeywordMatchType(String value) {
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
  public static AdGroupCriterionServiceKeywordMatchType fromValue(String value) {
    for (AdGroupCriterionServiceKeywordMatchType b : AdGroupCriterionServiceKeywordMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

