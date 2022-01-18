package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignAssetServiceTypeは、アセット情報の種類を選択します。<br> REPLACE時、CampaignAsset配下では無視され、CampaignAssetServiceList配下では必須です。</div> <div lang=\"en\">CampaignAssetServiceType selects the type of Asset information.<br> In REPLACE operation, this field will be ignored under 'CampaignAsset', and this field is required under 'CampaignAssetServiceList'.</div> <dl class=term>   <dt class=\"term__item\">QUICKLINK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションのクイックリンクオプションです。</span><span lang=\"en\">QuickLink option from Ad Display Option.</span></dd>   <dt class=\"term__item\">CALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションの電話番号オプションです。</span><span lang=\"en\">Phone Number option from Ad Display Option.</span></dd>   <dt class=\"term__item\">CALLOUT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションのテキスト補足オプションです。</span><span lang=\"en\">Callout option from Ad Display Option.</span></dd>   <dt class=\"term__item\">STRUCTURED_SNIPPET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションのカテゴリ補足オプションです。</span><span lang=\"en\">Structured snippet option from Ad Display Option.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignAssetServiceType {
  
  QUICKLINK("QUICKLINK"),
  
  CALL("CALL"),
  
  CALLOUT("CALLOUT"),
  
  STRUCTURED_SNIPPET("STRUCTURED_SNIPPET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignAssetServiceType(String value) {
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
  public static CampaignAssetServiceType fromValue(String value) {
    for (CampaignAssetServiceType b : CampaignAssetServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

