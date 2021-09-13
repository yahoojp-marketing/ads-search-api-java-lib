package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupAdServiceDevicePreferenceは、広告を優先的に配信するデバイスを選択します。<br> ADD時、このフィールドは省略可能となります。※adTypeがEXTENDED_TEXT_ADの場合は無視されます。</div> <div lang=\"en\">AdGroupAdServiceDevicePreference then select a device delivering an advertisement with precedence.<br> This field is optional in ADD operation. *If adType is EXTENDED_TEXT_AD, this field will be ignored.</div> <dl class=term>   <dt class=\"term__item\">SMART_PHONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スマートフォンを優先的に配信します。<br>作成（add）時のみご利用いただけます。<br>※優先デバイスの変更（set）・削除（remove）は実施できません。</span><span lang=\"en\">Deliver ads to Smartphone in higher priority<br>Available for add operation only<br>It cannot be used in set or remove operation</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceDevicePreference {
  
  SMART_PHONE("SMART_PHONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceDevicePreference(String value) {
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
  public static AdGroupAdServiceDevicePreference fromValue(String value) {
    for (AdGroupAdServiceDevicePreference b : AdGroupAdServiceDevicePreference.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

