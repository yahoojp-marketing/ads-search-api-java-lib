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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v14.model.RetargetingListServiceLogicalGroup;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceLogicalTargetListは、組合せターゲットリストの情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※targetListTypeがLOGICALの場合、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceLogicalTargetList is an object that holds the combination target list information.&lt;br&gt; This field is optional.&lt;br&gt; If the targetListType is LOGICAL, this field is required.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RetargetingListServiceLogicalTargetList.JSON_PROPERTY_LOGICAL_GROUP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceLogicalTargetList {
  public static final String JSON_PROPERTY_LOGICAL_GROUP = "logicalGroup";
  private List<RetargetingListServiceLogicalGroup> logicalGroup;

  public RetargetingListServiceLogicalTargetList() {
  }

  public RetargetingListServiceLogicalTargetList logicalGroup(List<RetargetingListServiceLogicalGroup> logicalGroup) {
    
    this.logicalGroup = logicalGroup;
    return this;
  }

  public RetargetingListServiceLogicalTargetList addLogicalGroupItem(RetargetingListServiceLogicalGroup logicalGroupItem) {
    if (this.logicalGroup == null) {
      this.logicalGroup = new ArrayList<>();
    }
    this.logicalGroup.add(logicalGroupItem);
    return this;
  }

   /**
   * Get logicalGroup
   * @return logicalGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGICAL_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetargetingListServiceLogicalGroup> getLogicalGroup() {
    return logicalGroup;
  }


  @JsonProperty(JSON_PROPERTY_LOGICAL_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogicalGroup(List<RetargetingListServiceLogicalGroup> logicalGroup) {
    this.logicalGroup = logicalGroup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceLogicalTargetList retargetingListServiceLogicalTargetList = (RetargetingListServiceLogicalTargetList) o;
    return Objects.equals(this.logicalGroup, retargetingListServiceLogicalTargetList.logicalGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceLogicalTargetList {\n");
    sb.append("    logicalGroup: ").append(toIndentedString(logicalGroup)).append("\n");
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

