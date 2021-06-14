package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignServiceEnhancedCpcEnabledは、コンバージョン数の最大化設定フラグを指定します。<br> このフィールドは省略可能となります。その際、デフォルト設定値はFALSEとなります。</div> <div lang=\"en\">CampaignServiceEnhancedCpcEnabled specifies flag of Maximize Conversions.<br> This field is optional. The default value will be FALSE.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">入札設定にコンバージョンの最大化を設定する</span><span lang=\"en\">Activate the setting of Maximize Conversions</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">入札設定からコンバージョンの最大化を解除する</span><span lang=\"en\">Invalidate the setting of Maximize Conversions</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceEnhancedCpcEnabled {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceEnhancedCpcEnabled(String value) {
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
  public static CampaignServiceEnhancedCpcEnabled fromValue(String value) {
    for (CampaignServiceEnhancedCpcEnabled b : CampaignServiceEnhancedCpcEnabled.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

