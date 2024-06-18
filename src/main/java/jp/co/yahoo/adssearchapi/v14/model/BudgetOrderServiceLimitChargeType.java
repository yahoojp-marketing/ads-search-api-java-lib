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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; BudgetOrderServiceLimitChargeTypeは、アカウントの予算種別を表します。&lt;br&gt; SET時、このフィールドは省略可能となります。また、月額予算を変更する場合は&lt;code&gt;MONTHLY&lt;/code&gt;を指定します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; BudgetOrderServiceLimitChargeType serves the account&#39;s budget allotment.&lt;br&gt; This field is optional in SET operation. Specify &lt;code&gt;MONTHLY&lt;/code&gt; to change the monthly budget. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SUM&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;総額アカウントです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Total amount.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;MONTHLY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;月額アカウントです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Monthly amount.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum BudgetOrderServiceLimitChargeType {
  
  SUM("SUM"),
  
  MONTHLY("MONTHLY"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  BudgetOrderServiceLimitChargeType(String value) {
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
  public static BudgetOrderServiceLimitChargeType fromValue(String value) {
    for (BudgetOrderServiceLimitChargeType b : BudgetOrderServiceLimitChargeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

