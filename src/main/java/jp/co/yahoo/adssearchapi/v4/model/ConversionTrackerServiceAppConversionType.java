package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceAppConversionTypeは、アプリのコンバージョンの種別を表します。<br> このフィールドは、ADD時に必須となります。</div> <div lang=\"en\">ConversionTrackerServiceAppConversionType describes App conversion type.<br> This field is required in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">DOWNLOAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリダウンロード時のコンバージョンです。</span><span lang=\"en\">App download conversion.</span></dd>   <dt class=\"term__item\">IN_APP_PURCHASE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリ内行動コンバージョンです。<br>※IN_APP_PURCHASEの登録と更新は廃止され、現在設定できません。</span><span lang=\"en\">In-app action conversion.<br>*Adding and editing IN_APP_PURCHASE is obsolete. Currently not available.</span></dd>   <dt class=\"term__item\">FIRST_OPEN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリ初回起動コンバージョンです。<br>※FIRST_OPENの登録と更新は廃止され、現在設定できません。</span><span lang=\"en\">App first open conversion.<br>*Adding and editing FIRST_OPEN is obsolete. Currently not available.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceAppConversionType {
  
  DOWNLOAD("DOWNLOAD"),
  
  IN_APP_PURCHASE("IN_APP_PURCHASE"),
  
  FIRST_OPEN("FIRST_OPEN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceAppConversionType(String value) {
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
  public static ConversionTrackerServiceAppConversionType fromValue(String value) {
    for (ConversionTrackerServiceAppConversionType b : ConversionTrackerServiceAppConversionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

