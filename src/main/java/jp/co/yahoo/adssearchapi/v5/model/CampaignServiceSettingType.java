/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceSettingTypeは、キャンペーンのターゲティング設定情報を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はGEO_TARGET_TYPE_SETTINGとなります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceSettingType describes the setting information of Target on the campaign.&lt;br&gt; This field is optional in ADD operation. The default value will be GEO_TARGET_TYPE_SETTING.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GEO_TARGET_TYPE_SETTING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンの地域ターゲットの設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Setting of Geographic Targeting on the Campaign.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TARGET_LIST_SETTING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;サイトリターゲティングの設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Setting of Site Retargeting.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DYNAMIC_ADS_FOR_SEARCH_SETTING&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;動的検索連動型広告の設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Setting of Dynamic ads for search.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum CampaignServiceSettingType {
  
  GEO_TARGET_TYPE_SETTING("GEO_TARGET_TYPE_SETTING"),
  
  TARGET_LIST_SETTING("TARGET_LIST_SETTING"),
  
  DYNAMIC_ADS_FOR_SEARCH_SETTING("DYNAMIC_ADS_FOR_SEARCH_SETTING"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceSettingType(String value) {
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
  public static CampaignServiceSettingType fromValue(String value) {
    for (CampaignServiceSettingType b : CampaignServiceSettingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

