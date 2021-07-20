package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignServiceAppStore、ユーザーにより広告配信の有無を調整できる設定です。<br> ADD時、campaignTypeがSTANDARD、またはDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、無視され、MOBILE_APPの場合、必須となります。</div> <div lang=\"en\">CampaignServiceAppStore is the type of app store.<br> In ADD operation, this field will be ignored when campaignType is 'STANDARD' or 'DYNAMIC_ADS_FOR_SEARCH_SETTING', and is required when campaignType is MOBILE_APP.</div> <dl class=term>   <dt class=\"term__item\">IOS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">iOS（App Store）です。</span><span lang=\"en\">iOS(App Store)</span></dd>   <dt class=\"term__item\">ANDROID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Android（Google Play）です。</span><span lang=\"en\">Android(Google Play)</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceAppStore {
  
  IOS("IOS"),
  
  ANDROID("ANDROID"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceAppStore(String value) {
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
  public static CampaignServiceAppStore fromValue(String value) {
    for (CampaignServiceAppStore b : CampaignServiceAppStore.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

