/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceTargetingAdGroupオブジェクトは、データ自動挿入の広告グループとの紐付けを表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※アドカスタマイザーの場合、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceTargetingAdGroup contains ad group setting for Data Auto Insertion.&lt;br&gt; Although this field will be returned in the response, it will be  ignored on input.&lt;br&gt; *For AD_CUSTOMIZER, this field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  FeedItemServiceTargetingAdGroup.JSON_PROPERTY_TARGETING_AD_GROUP_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItemServiceTargetingAdGroup {
  public static final String JSON_PROPERTY_TARGETING_AD_GROUP_ID = "targetingAdGroupId";
  private Long targetingAdGroupId;

  public FeedItemServiceTargetingAdGroup() {
  }

  public FeedItemServiceTargetingAdGroup targetingAdGroupId(Long targetingAdGroupId) {
    
    this.targetingAdGroupId = targetingAdGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;配信に使用する広告グループIDです。&lt;br&gt; ※設定を解除する場合は「0」を指定してください。&lt;br&gt; ※addのリクエストで、「0」指定は未 指定と同じ扱いになります。&lt;br&gt; データ自動挿入の場合、このフィールドはADDおよびSET時に省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Targeting Ad group ID.&lt;br&gt; * To deactive, insert &amp;#34;0&amp;#34;.&lt;br&gt; * It would be &amp;#34;no setting&amp;#34;, if &amp;#34;0&amp;#34; is set in add request.&lt;br&gt; For AD_CUSTOMIZER, this field is optional in ADD and SET operation.&lt;/div&gt; 
   * @return targetingAdGroupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetingAdGroupId() {
    return targetingAdGroupId;
  }


  @JsonProperty(JSON_PROPERTY_TARGETING_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetingAdGroupId(Long targetingAdGroupId) {
    this.targetingAdGroupId = targetingAdGroupId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceTargetingAdGroup feedItemServiceTargetingAdGroup = (FeedItemServiceTargetingAdGroup) o;
    return Objects.equals(this.targetingAdGroupId, feedItemServiceTargetingAdGroup.targetingAdGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetingAdGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceTargetingAdGroup {\n");
    sb.append("    targetingAdGroupId: ").append(toIndentedString(targetingAdGroupId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

