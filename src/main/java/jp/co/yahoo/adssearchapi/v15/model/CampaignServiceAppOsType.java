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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceAppOsType、ユーザーにより広告配信の有無を調整できる設定です。&lt;br&gt; ADD時、campaignTypeがSTANDARD、またはDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、無視され、MOBILE_APPの場合、必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceAppOsType is a setting that allows you to adjust ads to be served or not, depending on the user.&lt;br&gt; In ADD operation, this field will be ignored when campaignType is &#39;STANDARD&#39; or &#39;DYNAMIC_ADS_FOR_SEARCH_SETTING&#39;, and is required when campaignType is MOBILE_APP.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;IOS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;iOS（App Store）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;iOS(App Store)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ANDROID&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;Android（Google Play）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Android(Google Play)&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum CampaignServiceAppOsType {
  
  IOS("IOS"),
  
  ANDROID("ANDROID"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceAppOsType(String value) {
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
  public static CampaignServiceAppOsType fromValue(String value) {
    for (CampaignServiceAppOsType b : CampaignServiceAppOsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

