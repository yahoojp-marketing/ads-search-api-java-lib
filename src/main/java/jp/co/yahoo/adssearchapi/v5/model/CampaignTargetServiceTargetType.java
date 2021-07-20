package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignTargetServiceTargetTypeは、キャンペーンのターゲティング設定を表します。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Type of target setting.<br> This field is required in any cases.</div> <dl class=term>   <dt class=\"term__item\">LOCATION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">地域ターゲットです。</span><span lang=\"en\">LocationTarget.</span></dd>   <dt class=\"term__item\">SCHEDULE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">時間帯ターゲットです。</span><span lang=\"en\">ScheduleTarget.</span></dd>   <dt class=\"term__item\">NETWORK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ネットワークターゲットです。</span><span lang=\"en\">NetworkTarget.</span></dd>   <dt class=\"term__item\">PLATFORM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">デバイスターゲットです。</span><span lang=\"en\">PlatformTarget.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignTargetServiceTargetType {
  
  LOCATION("LOCATION"),
  
  SCHEDULE("SCHEDULE"),
  
  NETWORK("NETWORK"),
  
  PLATFORM("PLATFORM"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignTargetServiceTargetType(String value) {
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
  public static CampaignTargetServiceTargetType fromValue(String value) {
    for (CampaignTargetServiceTargetType b : CampaignTargetServiceTargetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

