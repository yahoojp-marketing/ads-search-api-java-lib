package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AuditLogServiceOutputは、操作履歴取得ジョブのファイル形式を指定します。<br> このフィールドは、省略可能となります。その際、デフォルト値はCSVとなります。</div> <div lang=\"en\">AuditLogServiceOutput specifies the file format of acruiqred operation history data.<br> This field is optional. The default value will be CSV.</div> <dl class=term>   <dt class=\"term__item\">ZIPPED_CSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ZIP圧縮されたCSV形式です。</span><span lang=\"en\">in zipped CSV format</span></dd>   <dt class=\"term__item\">ZIPPED_TSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ZIP圧縮されたTSV形式です。</span><span lang=\"en\">in zipped TSV format</span></dd>   <dt class=\"term__item\">CSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">CSV形式です。</span><span lang=\"en\">in CSV format</span></dd>   <dt class=\"term__item\">TSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">TSV形式です。</span><span lang=\"en\">in TSV format</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AuditLogServiceOutput {
  
  CSV("CSV"),
  
  TSV("TSV"),
  
  ZIPPED_CSV("ZIPPED_CSV"),
  
  ZIPPED_TSV("ZIPPED_TSV"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AuditLogServiceOutput(String value) {
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
  public static AuditLogServiceOutput fromValue(String value) {
    for (AuditLogServiceOutput b : AuditLogServiceOutput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

