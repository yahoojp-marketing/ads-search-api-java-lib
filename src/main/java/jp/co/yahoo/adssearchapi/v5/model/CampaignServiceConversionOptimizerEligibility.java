package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignServiceConversionOptimizerEligibilityは、コンバージョンオプティマイザーが利用可能であるか判定します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">CampaignServiceConversionOptimizerEligibility object is to determine if it is possible to use conversion optimizer.<br> Although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">ENABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">利用可能です。</span><span lang=\"en\">Can use conversion optimizer.</span></dd>   <dt class=\"term__item\">DISABLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">利用できません。</span><span lang=\"en\">Cannot use conversion optimizer.</span></dd>   <dt class=\"term__item\">CAMPAIGN_IS_NOT_ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンがアクティブではありません。</span><span lang=\"en\">Campaign is not active.</span></dd>   <dt class=\"term__item\">NOT_CPC_CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンオプティマイザーは、手動入札の場合にのみ有効です。</span><span lang=\"en\">Valid when it is in manual bidding.</span></dd>   <dt class=\"term__item\">CONVERSION_TRACKING_NOT_ENABLED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン測定タグが発行されていません。</span><span lang=\"en\">Conversion tracking tag is not enabled yet.</span></dd>   <dt class=\"term__item\">NOT_ENOUGH_CONVERSIONS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンの実績が十分ではありません。</span><span lang=\"en\">Conversion performance is not enough.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceConversionOptimizerEligibility {
  
  ENABLE("ENABLE"),
  
  DISABLE("DISABLE"),
  
  CAMPAIGN_IS_NOT_ACTIVE("CAMPAIGN_IS_NOT_ACTIVE"),
  
  NOT_CPC_CAMPAIGN("NOT_CPC_CAMPAIGN"),
  
  CONVERSION_TRACKING_NOT_ENABLED("CONVERSION_TRACKING_NOT_ENABLED"),
  
  NOT_ENOUGH_CONVERSIONS("NOT_ENOUGH_CONVERSIONS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceConversionOptimizerEligibility(String value) {
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
  public static CampaignServiceConversionOptimizerEligibility fromValue(String value) {
    for (CampaignServiceConversionOptimizerEligibility b : CampaignServiceConversionOptimizerEligibility.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

