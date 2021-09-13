package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignExportServiceOutputは、エクスポートするデータの形式設定です。<br> このフィールドは、必須です。</div> <div lang=\"en\">CampaignExportServiceOutput is an output format for exporting data.<br> This field is required.</div> <dl class=term>   <dt class=\"term__item\">CSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">CSVフォーマットです。</span><span lang=\"en\">CSV format.</span></dd>   <dt class=\"term__item\">ZIPPED_CSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ZIP圧縮されたCSVフォーマットです。</span><span lang=\"en\">ZIP filed CSV format.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignExportServiceOutput {
  
  CSV("CSV"),
  
  ZIPPED_CSV("ZIPPED_CSV"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignExportServiceOutput(String value) {
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
  public static CampaignExportServiceOutput fromValue(String value) {
    for (CampaignExportServiceOutput b : CampaignExportServiceOutput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

