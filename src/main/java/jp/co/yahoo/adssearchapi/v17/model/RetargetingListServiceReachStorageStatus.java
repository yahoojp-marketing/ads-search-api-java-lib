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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceReachStorageStatusは、ターゲットリストの種別です。&lt;br&gt; このフィールドは省略可能となります。&lt;br&gt; ※LogicalTargetListの場合、このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※SET時、ruleBaseTargetList.isDateSpecificRule &#x3D; TRUEの場合には、変更は出来ません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceReachStorageStatus is the flag status to store Cookie reach.&lt;br&gt; This field is optional.&lt;br&gt; *For logicalTargetList, this field will be returned  in the response, but it will be ignored on input.&lt;br&gt; In SET operation, if ruleBaseTargetList.isDateSpecificRule &#x3D; TRUE, it is can not change.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;OPEN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;有効です。&lt;br&gt;リーチを蓄積します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Valid status.&lt;br&gt;Reach will be stored.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CLOSED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;無効です。&lt;br&gt;リーチを蓄積しません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Invalid status.&lt;br&gt;Reach will not be stored.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum RetargetingListServiceReachStorageStatus {
  
  OPEN("OPEN"),
  
  CLOSED("CLOSED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceReachStorageStatus(String value) {
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
  public static RetargetingListServiceReachStorageStatus fromValue(String value) {
    for (RetargetingListServiceReachStorageStatus b : RetargetingListServiceReachStorageStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

