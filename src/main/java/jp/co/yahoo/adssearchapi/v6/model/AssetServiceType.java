package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AssetServiceTypeは、Asset情報の種類を選択します。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">AssetServiceType selects Asset information type.<br> This field is required in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">QUICKLINK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションのクイックリンクオプションです。</span><span lang=\"en\">QuickLink option from Ad Display Option</span></dd>   <dt class=\"term__item\">CALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションの電話番号オプションです。</span><span lang=\"en\">Phone Number option from Ad Display Option.</span></dd>   <dt class=\"term__item\">CALLOUT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションのテキスト補足オプションです。</span><span lang=\"en\">Callout option from Ad Display Option</span></dd>   <dt class=\"term__item\">STRUCTURED_SNIPPET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションのカテゴリ補足オプションです。</span><span lang=\"en\">Structured snippet option from Ad Display Option</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AssetServiceType {
  
  QUICKLINK("QUICKLINK"),
  
  CALL("CALL"),
  
  CALLOUT("CALLOUT"),
  
  STRUCTURED_SNIPPET("STRUCTURED_SNIPPET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AssetServiceType(String value) {
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
  public static AssetServiceType fromValue(String value) {
    for (AssetServiceType b : AssetServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

