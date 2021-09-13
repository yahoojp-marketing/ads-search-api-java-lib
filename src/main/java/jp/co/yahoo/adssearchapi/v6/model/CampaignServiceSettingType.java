package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignServiceSettingTypeは、キャンペーンのターゲティング設定情報を表します。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はGEO_TARGET_TYPE_SETTINGとなります。</div> <div lang=\"en\">CampaignServiceSettingType describes the setting information of Target on the campaign.<br> This field is optional in ADD operation. The default value will be GEO_TARGET_TYPE_SETTING.</div> <dl class=term>   <dt class=\"term__item\">GEO_TARGET_TYPE_SETTING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンの地域ターゲットの設定です。</span><span lang=\"en\">Setting of Geographic Targeting on the Campaign.</span></dd>   <dt class=\"term__item\">TARGET_LIST_SETTING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトリターゲティングの設定です。</span><span lang=\"en\">Setting of Site Retargeting.</span></dd>   <dt class=\"term__item\">DYNAMIC_ADS_FOR_SEARCH_SETTING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動的検索連動型広告の設定です。</span><span lang=\"en\">Setting of Dynamic ads for search.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceSettingType {
  
  GEO_TARGET_TYPE_SETTING("GEO_TARGET_TYPE_SETTING"),
  
  TARGET_LIST_SETTING("TARGET_LIST_SETTING"),
  
  DYNAMIC_ADS_FOR_SEARCH_SETTING("DYNAMIC_ADS_FOR_SEARCH_SETTING"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceSettingType(String value) {
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
  public static CampaignServiceSettingType fromValue(String value) {
    for (CampaignServiceSettingType b : CampaignServiceSettingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

