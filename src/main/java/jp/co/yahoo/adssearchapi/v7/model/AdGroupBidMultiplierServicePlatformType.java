package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupBidMultiplierServicePlatformTypeは、広告を配信するデバイスの種類です。<br> SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupBidMultiplierServicePlatformType is a platform of the selected device.<br> This field is required in SET and REMOVE operation.</div> <dl class=term>   <dt class=\"term__item\">SMART_PHONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スマートフォンです。</span><span lang=\"en\">Smartphone.</span></dd>   <dt class=\"term__item\">TABLET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タブレットです。</span><span lang=\"en\">Tablet.</span></dd>   <dt class=\"term__item\">DESKTOP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">パソコンです。</span><span lang=\"en\">PC.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupBidMultiplierServicePlatformType {
  
  SMART_PHONE("SMART_PHONE"),
  
  TABLET("TABLET"),
  
  DESKTOP("DESKTOP"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupBidMultiplierServicePlatformType(String value) {
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
  public static AdGroupBidMultiplierServicePlatformType fromValue(String value) {
    for (AdGroupBidMultiplierServicePlatformType b : AdGroupBidMultiplierServicePlatformType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

