/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceBiddingStrategyFailedReasonは、自動入札設定の結果（失敗原因）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceBiddingStrategyFailedReason object displays the failure reason of auto bidding setting.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FAILURE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;原因不明です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Failed [Cause unknown].&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONVERSION_TRACKING_NOT_ENABLED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン測定タグが発行されていません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Failed [Invalid conversion tracking].&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NOT_ENOUGH_CONVERSIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョンの情報が十分でありません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Failed [Not enough conversion information].&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョンオプティマイザーの情報は作成不可です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Failed [Cannot create conversion optimizer information].&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定の上書きができません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Failed [Cannot override Auto bidding].&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NOT_CPC_CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;手動入札ではありません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Failed [Not CPC Campaign].&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
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

