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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceLogicalRuleOperandは、組合せ対象のターゲットリストを保持するオブジェクトです。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceLogicalRuleOperand is an object that holds target list of combination.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RetargetingListServiceLogicalRuleOperand.JSON_PROPERTY_TARGET_LIST_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceLogicalRuleOperand {
  public static final String JSON_PROPERTY_TARGET_LIST_ID = "targetListId";
  private Long targetListId;

  public RetargetingListServiceLogicalRuleOperand() {
  }

  public RetargetingListServiceLogicalRuleOperand targetListId(Long targetListId) {
    
    this.targetListId = targetListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリストIDです。&lt;br&gt;組合せのターゲットリストは設定できません。&lt;br&gt; このフィールドは、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target list ID.&lt;br&gt;Cannot set the combination target list.&lt;br&gt; This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return targetListId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetListId() {
    return targetListId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListId(Long targetListId) {
    this.targetListId = targetListId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceLogicalRuleOperand retargetingListServiceLogicalRuleOperand = (RetargetingListServiceLogicalRuleOperand) o;
    return Objects.equals(this.targetListId, retargetingListServiceLogicalRuleOperand.targetListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetListId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceLogicalRuleOperand {\n");
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
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

