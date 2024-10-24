/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupRetargetingListServiceCriterionTargetListは、ターゲットリスト情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupRetargetingListServiceCriterionTargetList is an object that holds target list information.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupRetargetingListServiceCriterionTargetList.JSON_PROPERTY_RETARGETING_TRACK_ID,
  AdGroupRetargetingListServiceCriterionTargetList.JSON_PROPERTY_TARGET_LIST_ID,
  AdGroupRetargetingListServiceCriterionTargetList.JSON_PROPERTY_TARGET_LIST_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupRetargetingListServiceCriterionTargetList {
  public static final String JSON_PROPERTY_RETARGETING_TRACK_ID = "retargetingTrackId";
  private Long retargetingTrackId;

  public static final String JSON_PROPERTY_TARGET_LIST_ID = "targetListId";
  private Long targetListId;

  public static final String JSON_PROPERTY_TARGET_LIST_NAME = "targetListName";
  private String targetListName;

  public AdGroupRetargetingListServiceCriterionTargetList() {
  }

  public AdGroupRetargetingListServiceCriterionTargetList retargetingTrackId(Long retargetingTrackId) {
    
    this.retargetingTrackId = retargetingTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;リターゲティングトラックIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Retargeting track ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return retargetingTrackId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETARGETING_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRetargetingTrackId() {
    return retargetingTrackId;
  }


  @JsonProperty(JSON_PROPERTY_RETARGETING_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetargetingTrackId(Long retargetingTrackId) {
    this.retargetingTrackId = retargetingTrackId;
  }


  public AdGroupRetargetingListServiceCriterionTargetList targetListId(Long targetListId) {
    
    this.targetListId = targetListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリストIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target list ID.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
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


  public AdGroupRetargetingListServiceCriterionTargetList targetListName(String targetListName) {
    
    this.targetListName = targetListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリスト名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target list name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return targetListName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetListName() {
    return targetListName;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListName(String targetListName) {
    this.targetListName = targetListName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupRetargetingListServiceCriterionTargetList adGroupRetargetingListServiceCriterionTargetList = (AdGroupRetargetingListServiceCriterionTargetList) o;
    return Objects.equals(this.retargetingTrackId, adGroupRetargetingListServiceCriterionTargetList.retargetingTrackId) &&
        Objects.equals(this.targetListId, adGroupRetargetingListServiceCriterionTargetList.targetListId) &&
        Objects.equals(this.targetListName, adGroupRetargetingListServiceCriterionTargetList.targetListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retargetingTrackId, targetListId, targetListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupRetargetingListServiceCriterionTargetList {\n");
    sb.append("    retargetingTrackId: ").append(toIndentedString(retargetingTrackId)).append("\n");
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
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

