package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AssetServiceIsRemoveは、カスタムパラメータの削除フラグです。<br> このフィールドはSET時に省略可能となります。<br></div> <div lang=\"en\">AssetServiceIsRemove is Delete flag.<br> This field is optional in SET operation.<br></div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムパラメータの削除フラグがオンです。</span><span lang=\"en\">Delete flag is on.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムパラメータの削除フラグがオフです。</span><span lang=\"en\">Delete flag is off.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AssetServiceIsRemove {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AssetServiceIsRemove(String value) {
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
  public static AssetServiceIsRemove fromValue(String value) {
    for (AssetServiceIsRemove b : AssetServiceIsRemove.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

