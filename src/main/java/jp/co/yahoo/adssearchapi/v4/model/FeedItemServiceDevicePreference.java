package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedItemServiceDevicePreferenceは、広告を優先的に配信するデバイスを選択します。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> 電話番号オプションの場合、ADD時に省略可能となり、SET時に無視されます。<br> ※ADD時のデフォルト設定値はSMART_PHONEとなります。 </div> <div lang=\"en\">FeedItemServiceDevicePreference is a selection of device to deliver ads in high priority.<br> This field is optional in ADD and SET operation, and will be  ignored in REMOVE operation.<br> For CALLEXTENSION, this field is optional in ADD operation, and will be ignored in SET  operation.<br> *The default value for ADD operation will be SMART_PHONE.</div> <dl class=term>   <dt class=\"term__item\">SMART_PHONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スマートフォンを優先的に配信します。<br>作成（add）時のみご利用いただけます。<br>※優先デバイスの変更（set）・削除（remove）は実施できません。</span><span lang=\"en\">Deliver ads to Smartphone in higher priority<br>Available for add operation only<br>It cannot be used in set or remove operation</span></dd>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定なし</span><span lang=\"en\">not specified</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedItemServiceDevicePreference {
  
  SMART_PHONE("SMART_PHONE"),
  
  NONE("NONE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServiceDevicePreference(String value) {
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
  public static FeedItemServiceDevicePreference fromValue(String value) {
    for (FeedItemServiceDevicePreference b : FeedItemServiceDevicePreference.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

