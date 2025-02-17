/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; BaseAccountServiceIncludeSsaAccountオブジェクトは、取得するアカウントにSSAアカウントを含むかどうかを表します。&lt;br&gt; このフィールドは、省略可能となります。その際、GET時のデフォルト設定値はEXCLUDE_SSAとなります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; BaseAccountServiceIncludeSsaAccount object represents whether the account to be retrieved includes an SSA account.&lt;br&gt; This field is optional. The default value in GET operation will be EXCLUDE_SSA. &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ONLY_SSA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;SSAアカウントのみ&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;SSA account only.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;EXCLUDE_SSA&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;SSAアカウントを除外&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Exclude SSA accounts.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ALL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;全てのアカウント&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;All accounts.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum BaseAccountServiceIncludeSsaAccount {
  
  ONLY_SSA("ONLY_SSA"),
  
  EXCLUDE_SSA("EXCLUDE_SSA"),
  
  ALL("ALL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  BaseAccountServiceIncludeSsaAccount(String value) {
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
  public static BaseAccountServiceIncludeSsaAccount fromValue(String value) {
    for (BaseAccountServiceIncludeSsaAccount b : BaseAccountServiceIncludeSsaAccount.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

