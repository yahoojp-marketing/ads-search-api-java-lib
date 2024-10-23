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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v15.model.RetargetingListServiceTargetListOwner;
import jp.co.yahoo.adssearchapi.v15.model.RetargetingListServiceTargetListType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceSelectorは、ターゲットリストの検索条件（実行パラメータ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceSelector is an object that holds search condition (parameter).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceSelectorは、ターゲットリストの検索条件（実行パラメータ）を保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceSelector is an object that holds search condition (parameter).</div> ")
@JsonPropertyOrder({
  RetargetingListServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  RetargetingListServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  RetargetingListServiceSelector.JSON_PROPERTY_START_INDEX,
  RetargetingListServiceSelector.JSON_PROPERTY_TARGET_LIST_IDS,
  RetargetingListServiceSelector.JSON_PROPERTY_TARGET_LIST_OWNER,
  RetargetingListServiceSelector.JSON_PROPERTY_TARGET_LIST_TYPES
})
@JsonTypeName("RetargetingListServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_TARGET_LIST_IDS = "targetListIds";
  private List<Long> targetListIds = null;

  public static final String JSON_PROPERTY_TARGET_LIST_OWNER = "targetListOwner";
  private RetargetingListServiceTargetListOwner targetListOwner;

  public static final String JSON_PROPERTY_TARGET_LIST_TYPES = "targetListTypes";
  private List<RetargetingListServiceTargetListType> targetListTypes = null;

  public RetargetingListServiceSelector() { 
  }

  public RetargetingListServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public RetargetingListServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public RetargetingListServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The position within the result set where retrieval begins. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public RetargetingListServiceSelector targetListIds(List<Long> targetListIds) {
    
    this.targetListIds = targetListIds;
    return this;
  }

  public RetargetingListServiceSelector addTargetListIdsItem(Long targetListIdsItem) {
    if (this.targetListIds == null) {
      this.targetListIds = new ArrayList<>();
    }
    this.targetListIds.add(targetListIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：ターゲットリストIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Target List ID.&lt;/div&gt; 
   * @return targetListIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ターゲットリストIDです。</div> <div lang=\"en\">Search condition: Target List ID.</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getTargetListIds() {
    return targetListIds;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListIds(List<Long> targetListIds) {
    this.targetListIds = targetListIds;
  }


  public RetargetingListServiceSelector targetListOwner(RetargetingListServiceTargetListOwner targetListOwner) {
    
    this.targetListOwner = targetListOwner;
    return this;
  }

   /**
   * Get targetListOwner
   * @return targetListOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceTargetListOwner getTargetListOwner() {
    return targetListOwner;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListOwner(RetargetingListServiceTargetListOwner targetListOwner) {
    this.targetListOwner = targetListOwner;
  }


  public RetargetingListServiceSelector targetListTypes(List<RetargetingListServiceTargetListType> targetListTypes) {
    
    this.targetListTypes = targetListTypes;
    return this;
  }

  public RetargetingListServiceSelector addTargetListTypesItem(RetargetingListServiceTargetListType targetListTypesItem) {
    if (this.targetListTypes == null) {
      this.targetListTypes = new ArrayList<>();
    }
    this.targetListTypes.add(targetListTypesItem);
    return this;
  }

   /**
   * Get targetListTypes
   * @return targetListTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RetargetingListServiceTargetListType> getTargetListTypes() {
    return targetListTypes;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListTypes(List<RetargetingListServiceTargetListType> targetListTypes) {
    this.targetListTypes = targetListTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceSelector retargetingListServiceSelector = (RetargetingListServiceSelector) o;
    return Objects.equals(this.accountId, retargetingListServiceSelector.accountId) &&
        Objects.equals(this.numberResults, retargetingListServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, retargetingListServiceSelector.startIndex) &&
        Objects.equals(this.targetListIds, retargetingListServiceSelector.targetListIds) &&
        Objects.equals(this.targetListOwner, retargetingListServiceSelector.targetListOwner) &&
        Objects.equals(this.targetListTypes, retargetingListServiceSelector.targetListTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, numberResults, startIndex, targetListIds, targetListOwner, targetListTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    targetListIds: ").append(toIndentedString(targetListIds)).append("\n");
    sb.append("    targetListOwner: ").append(toIndentedString(targetListOwner)).append("\n");
    sb.append("    targetListTypes: ").append(toIndentedString(targetListTypes)).append("\n");
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

