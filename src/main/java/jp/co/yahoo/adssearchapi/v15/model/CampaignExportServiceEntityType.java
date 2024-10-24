/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceEntityTypeは、対象となるエンティティを表します。&lt;br&gt; このフィールドは、省略可能となります。※リクエスト時はCampaignExportServiceEntityTypeで定義されている値をString型で指定します。 ※レスポンスの値はenumとして返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceEntityType object describes target entities.&lt;br&gt; This field is optional.* When requesting, specify the value defined on CampaignExportServiceEntityType in string. * Response value is returned in enum type.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NEGATIVE_CAMPAIGN_CRITERION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;対象外キーワード（キャンペーンレベル）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Negative keyword (campaign level).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_GROUP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告グループ&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BIDDABLE_AD_GROUP_CRITERION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;入札キーワード&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Biddable keyword.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NEGATIVE_AD_GROUP_CRITERION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;対象外キーワード（広告グループレベル）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Negative keyword (ad group level).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;すべてのアセット（広告表示アセット）&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;All assets (Ad display asset).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;QUICKLINK_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;クイックリンクアセットのアセット&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Quick link asset.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CALLOUT_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;テキスト補足アセットのアセット&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Callout asset.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;STRUCTURED_SNIPPET_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カテゴリ補足アセットのアセット&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Category snippet asset.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CALLEXTENSION_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;電話番号アセットのアセット&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Call asset asset.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;IMAGE_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;画像アセットのアセット&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Image asset assets.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ALL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;すべての広告エンティティ&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;All entities.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum CampaignExportServiceEntityType {
  
  CAMPAIGN("CAMPAIGN"),
  
  NEGATIVE_CAMPAIGN_CRITERION("NEGATIVE_CAMPAIGN_CRITERION"),
  
  AD_GROUP("AD_GROUP"),
  
  BIDDABLE_AD_GROUP_CRITERION("BIDDABLE_AD_GROUP_CRITERION"),
  
  NEGATIVE_AD_GROUP_CRITERION("NEGATIVE_AD_GROUP_CRITERION"),
  
  AD("AD"),
  
  ASSET("ASSET"),
  
  QUICKLINK_ASSET("QUICKLINK_ASSET"),
  
  CALLOUT_ASSET("CALLOUT_ASSET"),
  
  STRUCTURED_SNIPPET_ASSET("STRUCTURED_SNIPPET_ASSET"),
  
  CALLEXTENSION_ASSET("CALLEXTENSION_ASSET"),
  
  IMAGE_ASSET("IMAGE_ASSET"),
  
  ALL("ALL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignExportServiceEntityType(String value) {
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
  public static CampaignExportServiceEntityType fromValue(String value) {
    for (CampaignExportServiceEntityType b : CampaignExportServiceEntityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

