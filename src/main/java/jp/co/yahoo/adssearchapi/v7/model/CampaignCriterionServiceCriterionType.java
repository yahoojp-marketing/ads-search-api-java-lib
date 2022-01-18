package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignCriterionServiceCriterionTypeは、クライテリアを表します。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">CampaignCriterionServiceCriterionType displays the type of criteria.<br> This field is required in ADD and REMOVE operation.</div> <dl class=term>   <dt class=\"term__item\">KEYWORD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードです。</span><span lang=\"en\">Keyword.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignCriterionServiceCriterionType {
  
  KEYWORD("KEYWORD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignCriterionServiceCriterionType(String value) {
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
  public static CampaignCriterionServiceCriterionType fromValue(String value) {
    for (CampaignCriterionServiceCriterionType b : CampaignCriterionServiceCriterionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

