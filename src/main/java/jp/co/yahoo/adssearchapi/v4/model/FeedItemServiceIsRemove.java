package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedItemServiceIsRemoveは、カスタムパラメータの削除フラグです。<br> customParametersおよびreviewCustomParameters配下の場合、このフィールドはSET時に省略可能となります。<br> locationオブジェクト配下の場合、このフィールドは、ADDおよびREMOVE時に無視され、SET時に省略可能となります。<br> ※地域設定を解除する場合は、locationオブジェクトのisRemoveにTRUEを指定します。<br> 地域設定解除後は、geoTargetingRestrictionにNONEが設定されます。</div> <div lang=\"en\">FeedItemServiceIsRemove is Delete flag.<br> Under customParameters and reviewCustomParameters, this field is optional in SET operation.<br> Under location object, this field will be ignored in ADD and REMOVE operation, and is optional in SET operation.<br> *To deactivate the location restriction, set isRemove of location object to TRUE.<br> After the deactivation, geoTargetingRestriction will be set to NONE.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムパラメータの削除フラグがオンです。</span><span lang=\"en\">Delete flag is on.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムパラメータの削除フラグがオフです。</span><span lang=\"en\">Delete flag is off.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedItemServiceIsRemove {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServiceIsRemove(String value) {
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
  public static FeedItemServiceIsRemove fromValue(String value) {
    for (FeedItemServiceIsRemove b : FeedItemServiceIsRemove.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

