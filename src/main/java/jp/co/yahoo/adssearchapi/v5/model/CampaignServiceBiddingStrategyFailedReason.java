package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignServiceBiddingStrategyFailedReasonは、自動入札設定の結果（失敗原因）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">CampaignServiceBiddingStrategyFailedReason object displays the failure reason of Auto Bidding setting.<br> Although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">FAILURE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">原因不明です。</span><span lang=\"en\">Failed [Cause unknown]</span></dd>   <dt class=\"term__item\">CONVERSION_TRACKING_NOT_ENABLED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョン測定タグが発行されていません。</span><span lang=\"en\">Failed [Invalid conversion tracking]</span></dd>   <dt class=\"term__item\">NOT_ENOUGH_CONVERSIONS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンの情報が十分でありません。</span><span lang=\"en\">Failed [Not enough conversion information]</span></dd>   <dt class=\"term__item\">CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョンオプティマイザーの情報は作成不可です。</span><span lang=\"en\">Failed [Cannot create conversion optimizer information]</span></dd>   <dt class=\"term__item\">BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">自動入札設定の上書きができません。</span><span lang=\"en\">Failed [Cannot override Auto bidding]</span></dd>   <dt class=\"term__item\">NOT_CPC_CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">手動入札ではありません。</span><span lang=\"en\">Failed [Not CPC Campaign]</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceBiddingStrategyFailedReason {
  
  FAILURE("FAILURE"),
  
  CONVERSION_TRACKING_NOT_ENABLED("CONVERSION_TRACKING_NOT_ENABLED"),
  
  NOT_ENOUGH_CONVERSIONS("NOT_ENOUGH_CONVERSIONS"),
  
  CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER("CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER"),
  
  BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN("BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN"),
  
  NOT_CPC_CAMPAIGN("NOT_CPC_CAMPAIGN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceBiddingStrategyFailedReason(String value) {
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
  public static CampaignServiceBiddingStrategyFailedReason fromValue(String value) {
    for (CampaignServiceBiddingStrategyFailedReason b : CampaignServiceBiddingStrategyFailedReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

