package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignServiceBudgetPeriodは、予算の設定期間を表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">CampaignServiceBudgetPeriod displays the period for budget.<br>This field is required in ADD operation, and is optional in SET operation.</div> <dl class=term>   <dt class=\"term__item\">DAILY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">1日単位です。</span><span lang=\"en\">daily</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceBudgetPeriod {
  
  DAILY("DAILY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceBudgetPeriod(String value) {
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
  public static CampaignServiceBudgetPeriod fromValue(String value) {
    for (CampaignServiceBudgetPeriod b : CampaignServiceBudgetPeriod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

