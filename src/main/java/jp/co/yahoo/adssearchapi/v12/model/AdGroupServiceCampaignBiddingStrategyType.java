/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceCampaignBiddingStrategyTypeは、自動入札タイプを表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceCampaignBiddingStrategyType displays the auto bidding type.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CPC&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;手動で入札を行います。&lt;br&gt;※キャンペーンに適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;CPC settings&lt;br&gt;* Available in adgroup level. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TARGET_ROAS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告費用対効果の目標値です。&lt;br&gt;※ADDおよびSET時、この値は指定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Target ROAS.&lt;br&gt;* This value cannot be specified in ADD and SET operation.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_CLICKS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;クリック数を最大化します。&lt;br&gt;※キャンペーンに適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Maximize Clicks.&lt;br&gt;* Applicable for adgroup. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TARGET_CPA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン単価の目標値です。&lt;br&gt;※ADDおよびSET時、この値は指定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Target conversion spend (CPA).&lt;br&gt;* This value cannot be specified in ADD and SET operation.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_CONVERSIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン数を最大化します。&lt;br&gt;※キャンペーンに適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Maximize Conversions.&lt;br&gt;* Applicable for ad group. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MAXIMIZE_CONVERSION_VALUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン価値を最大化します。&lt;br&gt;※キャンペーンに適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Maximize Conversions Value.&lt;br&gt;* Applicable for adgroup. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TARGET_IMPRESSION_SHARE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;インプレッションシェアの目標値です。&lt;br&gt;※キャンペーンに適用可能です。広告グループには現在設定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Target value of impression share.&lt;br&gt;* Applicable for ad group. Currently not available for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AdGroupServiceCampaignBiddingStrategyType {
  
  CPC("CPC"),
  
  TARGET_ROAS("TARGET_ROAS"),
  
  MAXIMIZE_CLICKS("MAXIMIZE_CLICKS"),
  
  TARGET_CPA("TARGET_CPA"),
  
  MAXIMIZE_CONVERSIONS("MAXIMIZE_CONVERSIONS"),
  
  MAXIMIZE_CONVERSION_VALUE("MAXIMIZE_CONVERSION_VALUE"),
  
  TARGET_IMPRESSION_SHARE("TARGET_IMPRESSION_SHARE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceCampaignBiddingStrategyType(String value) {
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
  public static AdGroupServiceCampaignBiddingStrategyType fromValue(String value) {
    for (AdGroupServiceCampaignBiddingStrategyType b : AdGroupServiceCampaignBiddingStrategyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

