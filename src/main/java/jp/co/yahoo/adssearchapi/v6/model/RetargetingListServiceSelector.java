package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.RetargetingListServiceTargetListOwner;
import jp.co.yahoo.adssearchapi.v6.model.RetargetingListServiceTargetListType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceSelectorは、ターゲットリストの検索条件（実行パラメータ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceSelector is an object that holds search condition (parameter).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceSelectorは、ターゲットリストの検索条件（実行パラメータ）を保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceSelector is an object that holds search condition (parameter).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("targetListIds")
  @Valid
  private List<Long> targetListIds = null;

  @JsonProperty("targetListOwner")
  private RetargetingListServiceTargetListOwner targetListOwner = null;

  @JsonProperty("targetListTypes")
  @Valid
  private List<RetargetingListServiceTargetListType> targetListTypes = null;

  public RetargetingListServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search conditon: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search conditon: Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public RetargetingListServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(1000) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public RetargetingListServiceSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

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
   * <div lang=\"ja\">検索条件：ターゲットリストIDです。</div> <div lang=\"en\">Search conditon: Target List ID.</div> 
   * @return targetListIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ターゲットリストIDです。</div> <div lang=\"en\">Search conditon: Target List ID.</div> ")

@Size(max=1000) 
  public List<Long> getTargetListIds() {
    return targetListIds;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceTargetListOwner getTargetListOwner() {
    return targetListOwner;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=3) 
  public List<RetargetingListServiceTargetListType> getTargetListTypes() {
    return targetListTypes;
  }

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

