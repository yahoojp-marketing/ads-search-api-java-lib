package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupCriterionServiceUseは、選択するクライテリアを示します。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">AdGroupCriterionServiceUse describes criterion to be selected.<br> This field is required in any cases.</div> <dl class=term>   <dt class=\"term__item\">BIDDABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">入札キーワードです。<br>※この項目は、CampaignCriterionServiceでは設定できません。</span><span lang=\"en\">Biddable criterion. *This item is not specifiable at CampaignCriterionService.</span></dd>   <dt class=\"term__item\">NEGATIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">検索対象外キーワード（広告を表示させないためのターゲット条件）です。</span><span lang=\"en\">Negative criterion (Target condition for not to display ad )</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupCriterionServiceUse {
  
  BIDDABLE("BIDDABLE"),
  
  NEGATIVE("NEGATIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupCriterionServiceUse(String value) {
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
  public static AdGroupCriterionServiceUse fromValue(String value) {
    for (AdGroupCriterionServiceUse b : AdGroupCriterionServiceUse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

