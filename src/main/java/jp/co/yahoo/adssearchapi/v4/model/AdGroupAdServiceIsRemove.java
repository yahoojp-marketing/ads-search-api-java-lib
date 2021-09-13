package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupAdServiceIsRemoveは、カスタムパラメータの削除フラグです。<br> SET時、このフィールドは無視されます。</div> <div lang=\"en\">AdGroupAdServiceIsRemove is Delete flag.<br> This field will be ignored in SET operation.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムパラメータの削除フラグがオンです。</span><span lang=\"en\">Delete flag is on.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムパラメータの削除フラグがオフです。</span><span lang=\"en\">Delete flag is off.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceIsRemove {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceIsRemove(String value) {
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
  public static AdGroupAdServiceIsRemove fromValue(String value) {
    for (AdGroupAdServiceIsRemove b : AdGroupAdServiceIsRemove.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

