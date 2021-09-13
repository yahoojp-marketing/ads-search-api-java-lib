package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignServiceBiddingStrategyTypeは、自動入札タイプを表します。<br> ADD時、標準入札設定の場合、このフィールドは必須となり、ポートフォリオ入札設定の場合、省略可能となります。</div> <div lang=\"en\">CampaignServiceBiddingStrategyType displays the Auto Bidding type.<br> This field is required when Standard bidding is setting, and is optional when Portfolio bidding is setting in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">MANUAL_CPC</dt>   <dd class=\"term__desc\"><span lang=\"ja\">手動で入札を行います。<br>※キャンペーンに適用可能です。広告グループには現在設定できません。</span><span lang=\"en\">Manual CPC settings<br>* Available in campaign level. Currently not available for ad group.</span></dd>   <dt class=\"term__item\">TARGET_ROAS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告費用対効果の目標値です。<br>※ADDおよびSET時、この値は指定できません。</span><span lang=\"en\">Target ROAS.<br>* This value cannot be specified in ADD and SET operation.</span></dd>   <dt class=\"term__item\">TARGET_SPEND</dt>   <dd class=\"term__desc\"><span lang=\"ja\">クリック数を最大化します。<br>※キャンペーンに適用可能です。広告グループには現在設定できません。</span><span lang=\"en\">Maximize Clicks.<br>* Applicable for campaign. Currently not available for ad group.</span></dd>   <dt class=\"term__item\">TARGET_CPA</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン単価の目標値です。<br>※ADDおよびSET時、この値は指定できません。</span><span lang=\"en\">Target conversion spend (CPA).<br>* This value cannot be specified in ADD and SET operation.</span></dd>   <dt class=\"term__item\">MAXIMIZE_CONVERSIONS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン数を最大化します。<br>※キャンペーンに適用可能です。広告グループには現在設定できません。</span><span lang=\"en\">Maximize Conversions.<br>* Applicable for campaign. Currently not available for ad group.</span></dd>   <dt class=\"term__item\">MAXIMIZE_CONVERSION_VALUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン価値を最大化します。<br>※こちらのタイプは、現在利用できません。</span><span lang=\"en\">Maximize Conversions Value.<br>*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">TARGET_IMPRESSION_SHARE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">インプレッションシェアの目標値です。<br>※キャンペーンに適用可能です。広告グループには現在設定できません。</span><span lang=\"en\">Target value of impression share.<br>* Applicable for campaign. Currently not available for ad group.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceBiddingStrategyType {
  
  MANUAL_CPC("MANUAL_CPC"),
  
  TARGET_ROAS("TARGET_ROAS"),
  
  TARGET_SPEND("TARGET_SPEND"),
  
  TARGET_CPA("TARGET_CPA"),
  
  MAXIMIZE_CONVERSIONS("MAXIMIZE_CONVERSIONS"),
  
  MAXIMIZE_CONVERSION_VALUE("MAXIMIZE_CONVERSION_VALUE"),
  
  TARGET_IMPRESSION_SHARE("TARGET_IMPRESSION_SHARE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceBiddingStrategyType(String value) {
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
  public static CampaignServiceBiddingStrategyType fromValue(String value) {
    for (CampaignServiceBiddingStrategyType b : CampaignServiceBiddingStrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
