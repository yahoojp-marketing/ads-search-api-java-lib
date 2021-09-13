package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignTargetServiceDayOfWeekは、曜日を表します。<br> このフィールドは、ADD時に必須となります。</div> <div lang=\"en\">A day of the week.<br> This field is required in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">MONDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">月曜日です。</span><span lang=\"en\">For Monday of the week</span></dd>   <dt class=\"term__item\">TUESDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">火曜日です。</span><span lang=\"en\">For Tuesday of the week</span></dd>   <dt class=\"term__item\">WEDNESDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">水曜日です。</span><span lang=\"en\">For Wednesday of the week</span></dd>   <dt class=\"term__item\">THURSDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">木曜日です。</span><span lang=\"en\">For Thursday of the week</span></dd>   <dt class=\"term__item\">FRIDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">金曜日です。</span><span lang=\"en\">For Friday of the week</span></dd>   <dt class=\"term__item\">SATURDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">土曜日です。</span><span lang=\"en\">For Saturday of the week</span></dd>   <dt class=\"term__item\">SUNDAY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">日曜日です。</span><span lang=\"en\">For Sunday of the week</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignTargetServiceDayOfWeek {
  
  MONDAY("MONDAY"),
  
  TUESDAY("TUESDAY"),
  
  WEDNESDAY("WEDNESDAY"),
  
  THURSDAY("THURSDAY"),
  
  FRIDAY("FRIDAY"),
  
  SATURDAY("SATURDAY"),
  
  SUNDAY("SUNDAY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignTargetServiceDayOfWeek(String value) {
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
  public static CampaignTargetServiceDayOfWeek fromValue(String value) {
    for (CampaignTargetServiceDayOfWeek b : CampaignTargetServiceDayOfWeek.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

