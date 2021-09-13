package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AccountServiceIsManagerAccountは、MCCアカウントかどうかを表します。</div> <div lang=\"en\">AccountServiceIsManagerAccount describes whether it is an MCC account.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">MCCアカウントです。</span><span lang=\"en\">MCC Account.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">通常アカウントです。</span><span lang=\"en\">Client Account.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AccountServiceIsManagerAccount {
  
  FALSE("FALSE"),
  
  TRUE("TRUE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AccountServiceIsManagerAccount(String value) {
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
  public static AccountServiceIsManagerAccount fromValue(String value) {
    for (AccountServiceIsManagerAccount b : AccountServiceIsManagerAccount.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

