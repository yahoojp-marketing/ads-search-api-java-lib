package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ReportDefinitionServiceReportJobStatusは、定義されたレポートの処理状況です。</div> <div lang=\"en\">A status of the requested report.</div> <dl class=term>   <dt class=\"term__item\">WAIT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">待機中です。</span><span lang=\"en\">Please wait for report request to complete.</span></dd>   <dt class=\"term__item\">COMPLETED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">正常に終了しました。</span><span lang=\"en\">Report request completed successfully.</span></dd>   <dt class=\"term__item\">IN_PROGRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">レポートは作成中です。</span><span lang=\"en\">Report is in creating process.</span></dd>   <dt class=\"term__item\">FAILED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">処理が失敗しました。</span><span lang=\"en\">Report request failed.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportJobStatus {
  
  WAIT("WAIT"),
  
  COMPLETED("COMPLETED"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  FAILED("FAILED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportJobStatus(String value) {
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
  public static ReportDefinitionServiceReportJobStatus fromValue(String value) {
    for (ReportDefinitionServiceReportJobStatus b : ReportDefinitionServiceReportJobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

