package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ReportDefinitionServiceReportIncludeZeroImpressionsオブジェクトは、レポートに0インプレッションの行を含めるかを選択します。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">ReportDefinitionServiceReportIncludeZeroImpressions object describes whether including \"0 impression\" line in the report or not.<br> This field is optional in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">含めます</span><span lang=\"en\">Include.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">含めません <br>※デフォルトに設定されます。</span><span lang=\"en\">Exclude.<br>*Default setting.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportIncludeZeroImpressions {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportIncludeZeroImpressions(String value) {
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
  public static ReportDefinitionServiceReportIncludeZeroImpressions fromValue(String value) {
    for (ReportDefinitionServiceReportIncludeZeroImpressions b : ReportDefinitionServiceReportIncludeZeroImpressions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

