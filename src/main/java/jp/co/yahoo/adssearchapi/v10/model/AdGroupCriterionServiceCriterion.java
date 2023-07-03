/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupCriterionServiceCriterionType;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupCriterionServiceKeyword;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceCriterionオブジェクトは、クライテリアを表します。※広告グループ用クライテリアです。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceCriterion object displays criteria information. *Ad group criteria.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupCriterionServiceCriterion.JSON_PROPERTY_CRITERION_ID,
  AdGroupCriterionServiceCriterion.JSON_PROPERTY_CRITERION_TRACK_ID,
  AdGroupCriterionServiceCriterion.JSON_PROPERTY_CRITERION_TYPE,
  AdGroupCriterionServiceCriterion.JSON_PROPERTY_KEYWORD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupCriterionServiceCriterion {
  public static final String JSON_PROPERTY_CRITERION_ID = "criterionId";
  private Long criterionId;

  public static final String JSON_PROPERTY_CRITERION_TRACK_ID = "criterionTrackId";
  private Long criterionTrackId;

  public static final String JSON_PROPERTY_CRITERION_TYPE = "criterionType";
  private AdGroupCriterionServiceCriterionType criterionType;

  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private AdGroupCriterionServiceKeyword keyword;

  public AdGroupCriterionServiceCriterion() {
  }

  public AdGroupCriterionServiceCriterion criterionId(Long criterionId) {
    
    this.criterionId = criterionId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;クライテリアIDです。&lt;br&gt; SETおよびREMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceCriterion ID.&lt;br&gt; This field is required in SET and REMOVE operation.&lt;/div&gt; 
   * @return criterionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITERION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCriterionId() {
    return criterionId;
  }


  @JsonProperty(JSON_PROPERTY_CRITERION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriterionId(Long criterionId) {
    this.criterionId = criterionId;
  }


  public AdGroupCriterionServiceCriterion criterionTrackId(Long criterionTrackId) {
    
    this.criterionTrackId = criterionTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用クライテリアIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceCriterion ID for tracking.&lt;/div&gt; 
   * @return criterionTrackId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITERION_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCriterionTrackId() {
    return criterionTrackId;
  }


  @JsonProperty(JSON_PROPERTY_CRITERION_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriterionTrackId(Long criterionTrackId) {
    this.criterionTrackId = criterionTrackId;
  }


  public AdGroupCriterionServiceCriterion criterionType(AdGroupCriterionServiceCriterionType criterionType) {
    
    this.criterionType = criterionType;
    return this;
  }

   /**
   * Get criterionType
   * @return criterionType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRITERION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupCriterionServiceCriterionType getCriterionType() {
    return criterionType;
  }


  @JsonProperty(JSON_PROPERTY_CRITERION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriterionType(AdGroupCriterionServiceCriterionType criterionType) {
    this.criterionType = criterionType;
  }


  public AdGroupCriterionServiceCriterion keyword(AdGroupCriterionServiceKeyword keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupCriterionServiceKeyword getKeyword() {
    return keyword;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyword(AdGroupCriterionServiceKeyword keyword) {
    this.keyword = keyword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceCriterion adGroupCriterionServiceCriterion = (AdGroupCriterionServiceCriterion) o;
    return Objects.equals(this.criterionId, adGroupCriterionServiceCriterion.criterionId) &&
        Objects.equals(this.criterionTrackId, adGroupCriterionServiceCriterion.criterionTrackId) &&
        Objects.equals(this.criterionType, adGroupCriterionServiceCriterion.criterionType) &&
        Objects.equals(this.keyword, adGroupCriterionServiceCriterion.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criterionId, criterionTrackId, criterionType, keyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceCriterion {\n");
    sb.append("    criterionId: ").append(toIndentedString(criterionId)).append("\n");
    sb.append("    criterionTrackId: ").append(toIndentedString(criterionTrackId)).append("\n");
    sb.append("    criterionType: ").append(toIndentedString(criterionType)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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

