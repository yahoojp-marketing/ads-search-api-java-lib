package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignServiceType、キャンペーンタイプです。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はSTANDARDとなります。</div> <div lang=\"en\">CampaignServiceType is the type of campaign.<br> This field is optional in ADD operation. The default value will be STANDARD.</div> <dl class=term>   <dt class=\"term__item\">STANDARD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">標準キャンペーンです。</span><span lang=\"en\">Standard campaign.</span></dd>   <dt class=\"term__item\">MOBILE_APP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アプリキャンペーンです。</span><span lang=\"en\">Mobile app download campaign.</span></dd>   <dt class=\"term__item\">DYNAMIC_ADS_FOR_SEARCH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動的検索連動型広告用キャンペーンです。</span><span lang=\"en\">Dynamic ads for search campaign.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceType {
  
  STANDARD("STANDARD"),
  
  MOBILE_APP("MOBILE_APP"),
  
  DYNAMIC_ADS_FOR_SEARCH("DYNAMIC_ADS_FOR_SEARCH"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceType(String value) {
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
  public static CampaignServiceType fromValue(String value) {
    for (CampaignServiceType b : CampaignServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

