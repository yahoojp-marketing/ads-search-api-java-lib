/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DSAのURL使用タイプです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DSA URL usage type.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;USE_SUPPLIED_URLS_ONLY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;PageFeedで指定されたURLのみを使用します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Uses only the URL specified in PageFeed.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_DOMAIN_ONLY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;TopDomainからAdWordsに自動クローリングします。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Automatically crawl from TopDomain to AdWords.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DOMAIN_AND_SUPPLIED_URLS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;TopDomainからの自動クローリングと、PageFeedで指定されたURLの双方に配信します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;It will be delivered to both the automatic crawling from the TopDomain and the URL specified in PageFeed.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum CampaignServiceDasUseUrlsType {
  
  USE_SUPPLIED_URLS_ONLY("USE_SUPPLIED_URLS_ONLY"),
  
  TOP_DOMAIN_ONLY("TOP_DOMAIN_ONLY"),
  
  DOMAIN_AND_SUPPLIED_URLS("DOMAIN_AND_SUPPLIED_URLS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceDasUseUrlsType(String value) {
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
  public static CampaignServiceDasUseUrlsType fromValue(String value) {
    for (CampaignServiceDasUseUrlsType b : CampaignServiceDasUseUrlsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

