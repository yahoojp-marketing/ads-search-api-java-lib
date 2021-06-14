package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupServiceCriterionTypeは、クライテリアを表します。<br> ADDおよびSET時、このフィールドは必須となります。<br> ※TargetingSettingが未設定の場合、ADD時のデフォルト設定値はTARGET_LISTとなります。</div> <div lang=\"en\">AdGroupServiceCriterionType displays the type of criteria.<br> This field is required in ADD and SET operation.<br> *The default value in ADD operation for the case of no setting 'TargetingSetting' is TARGET_LIST.</div> <dl class=term>   <dt class=\"term__item\">TARGET_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲットリストです。</span><span lang=\"en\">Target list</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceCriterionType {
  
  TARGET_LIST("TARGET_LIST"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceCriterionType(String value) {
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
  public static AdGroupServiceCriterionType fromValue(String value) {
    for (AdGroupServiceCriterionType b : AdGroupServiceCriterionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

