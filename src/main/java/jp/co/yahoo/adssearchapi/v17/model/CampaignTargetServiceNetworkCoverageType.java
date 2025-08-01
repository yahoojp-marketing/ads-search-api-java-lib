/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceNetworkCoverageTypeは、広告を表示する検索画面を表します。 この指定は、キャンペーンのPlatformTypeがWAP_MOBILEの場合、指定できません。&lt;br&gt; このフィールドは、ADD時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServiceNetworkCoverageType represents a search screen that displays an ad. This cannot be specified if the campaign&#39;s platformType is specified as WAP MOBILE.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;YAHOO_SEARCH&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告はYahoo!検索の検索画面にのみ表示されます。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ads are only displayed in the search of Yahoo! JAPAN Search.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SEARCH_NETWORK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告はYahoo!検索を含むすべての検索画面に配信されます。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ads are delivered in all search including Yahoo! JAPAN Search.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum CampaignTargetServiceNetworkCoverageType {
  
  YAHOO_SEARCH("YAHOO_SEARCH"),
  
  SEARCH_NETWORK("SEARCH_NETWORK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignTargetServiceNetworkCoverageType(String value) {
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
  public static CampaignTargetServiceNetworkCoverageType fromValue(String value) {
    for (CampaignTargetServiceNetworkCoverageType b : CampaignTargetServiceNetworkCoverageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

