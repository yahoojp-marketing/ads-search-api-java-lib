package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ReportDefinitionServiceFilterOperatorは、フィルタ条件を表します。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">ReportDefinitionServiceFilterOperator displays filtering conditions for the report.<br> This field is required in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定の値と一致します。</span><span lang=\"en\">Equal to selected value.</span></dd>   <dt class=\"term__item\">NOT_EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定の値と一致しません。</span><span lang=\"en\">Does not equals to selected value.</span></dd>   <dt class=\"term__item\">GREATER_THAN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定の値を超えます。</span><span lang=\"en\">Greater than selected value.</span></dd>   <dt class=\"term__item\">GREATER_THAN_EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定の値以上です。</span><span lang=\"en\">Greater than equals to selected value.</span></dd>   <dt class=\"term__item\">LESS_THAN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定の値未満です。</span><span lang=\"en\">Less than selected value.</span></dd>   <dt class=\"term__item\">LESS_THAN_EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定の値以下です。</span><span lang=\"en\">Less than equals to selected value.</span></dd>   <dt class=\"term__item\">CONTAINS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定の値を含みます。</span><span lang=\"en\">Contains the selected value.</span></dd>   <dt class=\"term__item\">IN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">いずれかに一致します。</span><span lang=\"en\">Equals to whichever of selected value.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceFilterOperator {
  
  EQUALS("EQUALS"),
  
  NOT_EQUALS("NOT_EQUALS"),
  
  GREATER_THAN("GREATER_THAN"),
  
  GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
  
  LESS_THAN("LESS_THAN"),
  
  LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
  
  CONTAINS("CONTAINS"),
  
  IN("IN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceFilterOperator(String value) {
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
  public static ReportDefinitionServiceFilterOperator fromValue(String value) {
    for (ReportDefinitionServiceFilterOperator b : ReportDefinitionServiceFilterOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

