package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignServiceBiddingStrategySourceは、自動入札設定のソースです。<br> ADD時、このフィールドは無視されます。</div> <div lang=\"en\">CampaignServiceBiddingStrategySource is a source of Auto Bidding.<br> This field will be ignored in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンです。</span><span lang=\"en\">Campaign</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceBiddingStrategySource {
  
  CAMPAIGN("CAMPAIGN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceBiddingStrategySource(String value) {
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
  public static CampaignServiceBiddingStrategySource fromValue(String value) {
    for (CampaignServiceBiddingStrategySource b : CampaignServiceBiddingStrategySource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

