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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceIsRemoveは、カスタムパラメータの削除フラグです。&lt;br&gt; customParametersおよびreviewCustomParameters配下の場合、このフィールドはSET時に省略可能となります。&lt;br&gt; locationオブジェクト配下の場合、このフィールドは、ADDおよびREMOVE時に無視され、SET時に省略可能となります。&lt;br&gt; ※地域設定を解除する場合は、locationオブジェクトのisRemoveにTRUEを指定します。&lt;br&gt; 地域設定解除後は、geoTargetingRestrictionにNONEが設定されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceIsRemove is Delete flag.&lt;br&gt; Under customParameters and reviewCustomParameters, this field is optional in SET operation.&lt;br&gt; Under location object, this field will be ignored in ADD and REMOVE operation, and is optional in SET operation.&lt;br&gt; *To deactivate the location restriction, set isRemove of location object to TRUE.&lt;br&gt; After the deactivation, geoTargetingRestriction will be set to NONE.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TRUE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カスタムパラメータの削除フラグがオンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Delete flag is on.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FALSE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カスタムパラメータの削除フラグがオフです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Delete flag is off.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown Value&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum FeedItemServiceIsRemove {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServiceIsRemove(String value) {
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
  public static FeedItemServiceIsRemove fromValue(String value) {
    for (FeedItemServiceIsRemove b : FeedItemServiceIsRemove.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

