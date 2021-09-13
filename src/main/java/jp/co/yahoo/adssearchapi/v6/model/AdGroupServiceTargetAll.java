package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupServiceTargetAllは、サイトリターゲティングにおける配信対象ユーザーの設定内容を表します。<br> ADDおよびSET時、このフィールドは必須となります。<br> ※TargetingSettingが未設定の場合、ADD時のデフォルト設定値はACTIVEとなります。</div> <div lang=\"en\">AdGroupServiceTargetAll describes the setting of target(include) users on Site Retargeting.<br> This field is required in ADD and SET operation.<br> *The default value in ADD operation for the case of no setting 'TargetingSetting' is ACTIVE.</div> <dl class=term>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべてのユーザーを配信対象とします。<br>ターゲットリストのユーザーは入札価格調整率の適用のみ行います。</span><span lang=\"en\">All users are target of ad delivery.<br>Only applying bid adjustment rate is done for users on the Target List.</span></dd>   <dt class=\"term__item\">DEACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲットリストのユーザーのみを配信対象とします。<br>また、ターゲットリストのユーザーに対して入札価格調整率を適用します。</span><span lang=\"en\">Users on the Target List are target of ad delivery.<br>And bid adjustment rate is applied to users on the Target List.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceTargetAll {
  
  ACTIVE("ACTIVE"),
  
  DEACTIVE("DEACTIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceTargetAll(String value) {
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
  public static AdGroupServiceTargetAll fromValue(String value) {
    for (AdGroupServiceTargetAll b : AdGroupServiceTargetAll.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

