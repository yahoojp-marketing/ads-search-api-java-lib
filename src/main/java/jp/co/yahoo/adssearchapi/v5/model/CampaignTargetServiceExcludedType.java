package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignTargetServiceExcludedTypeは、配信対象、および除外対象の設定を表します。<br> このフィールドは、ADD時に省略可能となり、SETおよびREMOVE時は無視されます。</div> <div lang=\"en\">CampaignTargetServiceExcludedType selects the setting type which delivers ads or do not deliver ads.<br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation.</div> <dl class=term>   <dt class=\"term__item\">INCLUDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信対象です。</span><span lang=\"en\">Ads to be delivered</span></dd>   <dt class=\"term__item\">EXCLUDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">除外対象です。</span><span lang=\"en\">Ads not to be delivered</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignTargetServiceExcludedType {
  
  INCLUDED("INCLUDED"),
  
  EXCLUDED("EXCLUDED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignTargetServiceExcludedType(String value) {
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
  public static CampaignTargetServiceExcludedType fromValue(String value) {
    for (CampaignTargetServiceExcludedType b : CampaignTargetServiceExcludedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

