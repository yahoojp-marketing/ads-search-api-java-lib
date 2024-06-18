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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceTargetAllは、サイトリターゲティングにおける配信対象ユーザーの設定内容を表します。&lt;br&gt; ADDおよびSET時、このフィールドは必須となります。&lt;br&gt; ※TargetingSettingが未設定の場合、ADD時のデフォルト設定値はACTIVEとなります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceTargetAll describes the setting of target(include) users on Site Retargeting.&lt;br&gt; This field is required in ADD and SET operation.&lt;br&gt; *The default value in ADD operation for the case of no setting &#39;TargetingSetting&#39; is ACTIVE.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACTIVE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;すべてのユーザーを配信対象とします。&lt;br&gt;ターゲットリストのユーザーは入札価格調整率の適用のみ行います。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;All users are target of ad delivery.&lt;br&gt;Only applying bid adjustment rate is done for users on the Target List.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEACTIVE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリストのユーザーのみを配信対象とします。&lt;br&gt;また、ターゲットリストのユーザーに対して入札価格調整率を適用します。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Users on the target list are target of ad delivery.&lt;br&gt;And bid adjustment rate is applied to users on the target list.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum AdGroupServiceTargetAll {
  
  ACTIVE("ACTIVE"),
  
  DEACTIVE("DEACTIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceTargetAll(String value) {
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
  public static AdGroupServiceTargetAll fromValue(String value) {
    for (AdGroupServiceTargetAll b : AdGroupServiceTargetAll.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

