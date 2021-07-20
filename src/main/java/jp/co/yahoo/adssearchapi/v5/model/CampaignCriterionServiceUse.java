package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignCriterionServiceUseは、選択するクライテリアを示します。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">CampaignCriterionServiceUse describes the criteria to be selected.<br> This field is required in ADD and REMOVE operation.</div> <dl class=term>   <dt class=\"term__item\">NEGATIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">除外クライテリア（広告を表示させないためのターゲット条件）です。</span><span lang=\"en\">Negative criteria (a part of target condition not to display ads).</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignCriterionServiceUse {
  
  NEGATIVE("NEGATIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignCriterionServiceUse(String value) {
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
  public static CampaignCriterionServiceUse fromValue(String value) {
    for (CampaignCriterionServiceUse b : CampaignCriterionServiceUse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

