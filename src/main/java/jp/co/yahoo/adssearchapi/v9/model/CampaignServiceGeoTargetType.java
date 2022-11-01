/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceGeoTargetTypeは、地域ターゲティングの地域判定の詳細設定を指定します。&lt;br&gt; ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はDONT_CAREとなります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceGeoTargetType specifies Advanced Location options of Geo Targeting.&lt;br&gt; This field is optional in ADD operation. The default value will be DONT_CARE.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DONT_CARE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ターゲット地域設定の場合：&lt;br&gt;対象地域に所在する可能性があるユーザー、対象地域に関連する語句で検索したユーザー、対象地域に関心を示している可能性のあるユーザーに広告を配信します。&lt;br&gt;除外ターゲット地域設定の場合：&lt;br&gt;対象地域に所在する可能性があるユーザー、対象地域に関連する語句で検索したユーザー、対象地域に関心を示している可能性のあるユーザーには広告を配信しません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Positive Geo Target (Advanced location options):&lt;br&gt;Your ads will be displayed to users who may be in the target areas, to users who searched with queries including the targeted locations, to users who may be interested in the target area.&lt;br&gt;Negative Geo Target (Location exclusion options):&lt;br&gt;Your ads will not be displayed to users who may stay in the targeted area, who searched with queries including the targeted locations, to users who may be interested in the area.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AREA_OF_INTENT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ターゲット地域設定の場合：&lt;br&gt;対象地域に関連する語句で検索したユーザーや、対象地域に関心を示している可能性のあるユーザーのみに広告を配信します。&lt;br&gt;※除外ターゲット地域設定の場合は選択できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Positive Geo Target (Advanced location options):&lt;br&gt;Your ads will be displayed to users who searched with queries including the targeted locations, to users who may be interested in the target area.&lt;br&gt;* This is not selectable with Negative Geo Target (Location exclusion options).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LOCATION_OF_PRESENCE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ターゲット地域設定の場合：&lt;br&gt;対象地域に所在する可能性があるユーザーにのみ、広告を配信します。&lt;br&gt;除外ターゲット地域設定の場合：対象地域に所在する可能性があるユーザーには、広告は配信されません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Positive Geo Target (Advanced location options):&lt;br&gt;Your ads will be displayed only to users who may be in the targeted area.&lt;br&gt;Negative Geo Target (Location Exclusion options):&lt;br&gt;Your ads will not be displayed to users who may be in the targeted areas.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum CampaignServiceGeoTargetType {
  
  DONT_CARE("DONT_CARE"),
  
  AREA_OF_INTENT("AREA_OF_INTENT"),
  
  LOCATION_OF_PRESENCE("LOCATION_OF_PRESENCE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceGeoTargetType(String value) {
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
  public static CampaignServiceGeoTargetType fromValue(String value) {
    for (CampaignServiceGeoTargetType b : CampaignServiceGeoTargetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
