package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceConversionCountingTypeは、コンバージョンの計測方法を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※ADD時のデフォルト設定値はONE_PER_CLICKとなります。<br> ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがfirst_openの場合はONE_PER_CLICKのみ指定可能となります。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">ConversionTrackerServiceConversionCountingType desribes how to count conversions.<br> This field is optional in ADD and SET operation.<br> * The default value in ADD operation will be ONE_PER_CLICK.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is first_open, Only ONE_PER_CLICK can be specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> <dl class=term>   <dt class=\"term__item\">ONE_PER_CLICK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ユニークコンバージョンです。</span><span lang=\"en\">One perticular conversion</span></dd>   <dt class=\"term__item\">MANY_PER_CLICK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">総コンバージョンです。</span><span lang=\"en\">Total conversions (greater than one_per_click).</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceConversionCountingType {
  
  ONE_PER_CLICK("ONE_PER_CLICK"),
  
  MANY_PER_CLICK("MANY_PER_CLICK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceConversionCountingType(String value) {
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
  public static ConversionTrackerServiceConversionCountingType fromValue(String value) {
    for (ConversionTrackerServiceConversionCountingType b : ConversionTrackerServiceConversionCountingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

