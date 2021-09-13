package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignExportServiceEncodingは、エクスポートするデータのエンコーディング設定です。<br> このフィールドは、必須です。</div> <div lang=\"en\">CampaignExportServiceEncoding is an encoding setting for exporting data.<br> This field is required.</div> <dl class=term>   <dt class=\"term__item\">UTF8</dt>   <dd class=\"term__desc\"><span lang=\"ja\">UTF8です。</span><span lang=\"en\">UTF8 encode.</span></dd>   <dt class=\"term__item\">SJIS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Shift-JISです。</span><span lang=\"en\">Shift-JIS encode.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignExportServiceEncoding {
  
  UTF8("UTF8"),
  
  SJIS("SJIS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignExportServiceEncoding(String value) {
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
  public static CampaignExportServiceEncoding fromValue(String value) {
    for (CampaignExportServiceEncoding b : CampaignExportServiceEncoding.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

