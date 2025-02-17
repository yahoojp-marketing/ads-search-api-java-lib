/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceConversionOptimizerEligibilityは、コンバージョンオプティマイザーが利用可能であるか判定します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceConversionOptimizerEligibility object is to determine if it is possible to use conversion optimizer.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ENABLE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;利用可能です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Can use conversion optimizer.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DISABLE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;利用できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Cannot use conversion optimizer.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN_IS_NOT_ACTIVE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンがアクティブではありません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign is not active.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NOT_CPC_CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョンオプティマイザーは、手動入札の場合にのみ有効です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Valid when it is in manual bidding.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONVERSION_TRACKING_NOT_ENABLED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン測定タグが発行されていません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Conversion tracking tag is not enabled yet.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NOT_ENOUGH_CONVERSIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョンの実績が十分ではありません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Conversion performance is not enough.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
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

