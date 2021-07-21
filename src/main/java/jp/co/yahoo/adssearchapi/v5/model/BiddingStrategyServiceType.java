package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">BiddingStrategyServiceTypeは、自動入札タイプを表します。<br> このフィールドは、biddingScheme配下ではADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">BiddingStrategyServiceType displays the Auto Bidding type.<br> Under biddingScheme, this field is required in ADD operation, and will be optional in SET operation.</div> <dl class=term>   <dt class=\"term__item\">TARGET_ROAS</dt>   <dd class=\"term__desc\"><span lang=\"ja\"\">広告費用対効果の目標値です。<br>※キャンペーンの更新時のみ適用可能です。広告グループには現在設定できません。</span><span lang=\"en\">Target ROAS.<br>* Available on updating campaign process. Currently not available for ad group.</span></dd>   <dt class=\"term__item\">TARGET_SPEND</dt>   <dd class=\"term__desc\"><span lang=\"ja\"\">クリック数を最大化します。<br>※キャンペーンに適用可能です。広告グループには現在設定できません。</span><span lang=\"en\">Maximize Clicks.<br>* Applicable for campaign. Currently not available for ad group.</span></dd>   <dt class=\"term__item\">TARGET_CPA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン単価の目標値です。<br>※キャンペーンの更新時のみ適用可能です。広告グループには現在設定できません。</span><span lang=\"en\">Target conversion spend (CPA).<br>* Available on updating campaign process. Currently not available for ad group.</span></dd>   <dt class=\"term__item\">TARGET_IMPRESSION_SHARE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">インプレッションシェアの目標値です。<br>※キャンペーンの更新時のみ適用可能です。広告グループには現在設定できません。</span><span lang=\"en\">Target value of impression share. <br> * Available on updating campaign process. Currently not available for ad group. </span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\"\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum BiddingStrategyServiceType {
  
  TARGET_ROAS("TARGET_ROAS"),
  
  TARGET_SPEND("TARGET_SPEND"),
  
  TARGET_CPA("TARGET_CPA"),
  
  TARGET_IMPRESSION_SHARE("TARGET_IMPRESSION_SHARE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  BiddingStrategyServiceType(String value) {
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
  public static BiddingStrategyServiceType fromValue(String value) {
    for (BiddingStrategyServiceType b : BiddingStrategyServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

