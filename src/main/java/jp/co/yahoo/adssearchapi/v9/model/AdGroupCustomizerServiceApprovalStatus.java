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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCustomizerServiceApprovalStatusは、審査状況を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCustomizerServiceApprovalStatus displays Editorial Status.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APPROVED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;承認済です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;The item is approved&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;APPROVED_WITH_REVIEW&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;承認済です。&lt;br&gt;すでに設定済みの情報を再編集した場合の再審査中です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;The item is approved.&lt;br&gt;Updated items are under review.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REVIEW&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;審査中です。&lt;br&gt;新しく追加した設定情報の審査中です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Under editorial review.&lt;br&gt;Newly added configuration information are under review.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PRE_DISAPPROVED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;掲載不可です。&lt;br&gt;新しく追加した設定情報は審査で承認されず、設定されていません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;The item was rejected.&lt;br&gt;Newly added configuration information have been rejected.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;POST_DISAPPROVED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;掲載停止です。&lt;br&gt;すでに設定中の設定情報について審査が行われた結果、否認されました。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;As a result of the review of the setting information that has already been set, it was rejected.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AdGroupCustomizerServiceApprovalStatus {
  
  APPROVED("APPROVED"),
  
  APPROVED_WITH_REVIEW("APPROVED_WITH_REVIEW"),
  
  REVIEW("REVIEW"),
  
  PRE_DISAPPROVED("PRE_DISAPPROVED"),
  
  POST_DISAPPROVED("POST_DISAPPROVED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupCustomizerServiceApprovalStatus(String value) {
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
  public static AdGroupCustomizerServiceApprovalStatus fromValue(String value) {
    for (AdGroupCustomizerServiceApprovalStatus b : AdGroupCustomizerServiceApprovalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

