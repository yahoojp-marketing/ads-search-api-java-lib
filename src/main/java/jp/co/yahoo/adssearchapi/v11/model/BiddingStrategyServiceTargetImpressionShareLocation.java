/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceTargetImpressionShareは、インプレッションシェアの目標割合を達成するための検索結果掲載位置を指定します。&lt;br&gt; このフィールドは省略可能となります。その際、デフォルト設定値は&lt;code&gt;ANYWHERE_ON_PAGE&lt;/code&gt;となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceTargetImpressionShare specifies search result posting position to achieve the target ratio of impression share.&lt;br&gt; This field is optional. The default value will be &lt;code&gt;ANYWHERE_ON_PAGE&lt;/code&gt;. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ANYWHERE_ON_PAGE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;任意の位置です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Arbitrary position.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TOP_OF_PAGE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ページ上部です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Top part of a page.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ABSOLUTE_TOP_OF_PAGE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ページ最上部です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Absolute top of a page.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum BiddingStrategyServiceTargetImpressionShareLocation {
  
  ANYWHERE_ON_PAGE("ANYWHERE_ON_PAGE"),
  
  TOP_OF_PAGE("TOP_OF_PAGE"),
  
  ABSOLUTE_TOP_OF_PAGE("ABSOLUTE_TOP_OF_PAGE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  BiddingStrategyServiceTargetImpressionShareLocation(String value) {
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
  public static BiddingStrategyServiceTargetImpressionShareLocation fromValue(String value) {
    for (BiddingStrategyServiceTargetImpressionShareLocation b : BiddingStrategyServiceTargetImpressionShareLocation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

