package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignRetargetingListServiceExcludedTypeは、配信対象、および除外対象の設定を表します。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト値はINCLUDEDとなります。SET時、このフィールドは省略可能となります。</div> <div lang=\"en\">CampaignRetargetingListServiceExcludedType selects the setting type which delivers ads or do not deliver ads.<br> This field is optional in ADD operation. The default value will be INCLUDED. This field is optional in SET operation.</div> <dl class=term>   <dt class=\"term__item\">INCLUDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">配信対象です。</span><span lang=\"en\">Ads to be delivered</span></dd>   <dt class=\"term__item\">EXCLUDED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">除外対象です。</span><span lang=\"en\">Ads not to be delivered</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignRetargetingListServiceExcludedType {
  
  INCLUDED("INCLUDED"),
  
  EXCLUDED("EXCLUDED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignRetargetingListServiceExcludedType(String value) {
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
  public static CampaignRetargetingListServiceExcludedType fromValue(String value) {
    for (CampaignRetargetingListServiceExcludedType b : CampaignRetargetingListServiceExcludedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

