package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SharedCriterionServiceSelectorオブジェクトは、検索条件を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SharedCriterionServiceSelector object holds search criteria.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SharedCriterionServiceSelectorオブジェクトは、検索条件を保持します。</div> <div lang=\"en\">SharedCriterionServiceSelector object holds search criteria.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SharedCriterionServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.11";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("criterionIds")
  @Valid
  private List<Long> criterionIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("sharedListIds")
  @Valid
  private List<Long> sharedListIds = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public SharedCriterionServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public SharedCriterionServiceSelector criterionIds(List<Long> criterionIds) {
    this.criterionIds = criterionIds;
    return this;
  }

  public SharedCriterionServiceSelector addCriterionIdsItem(Long criterionIdsItem) {
    if (this.criterionIds == null) {
      this.criterionIds = new ArrayList<>();
    }
    this.criterionIds.add(criterionIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">クライテリオンIDです。</div> <div lang=\"en\">Criterion ID.</div> 
   * @return criterionIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリオンIDです。</div> <div lang=\"en\">Criterion ID.</div> ")

@Size(max=1000) 
  public List<Long> getCriterionIds() {
    return criterionIds;
  }

  public void setCriterionIds(List<Long> criterionIds) {
    this.criterionIds = criterionIds;
  }

  public SharedCriterionServiceSelector numberResults(Integer numberResults) {
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

  public SharedCriterionServiceSelector sharedListIds(List<Long> sharedListIds) {
    this.sharedListIds = sharedListIds;
    return this;
  }

  public SharedCriterionServiceSelector addSharedListIdsItem(Long sharedListIdsItem) {
    if (this.sharedListIds == null) {
      this.sharedListIds = new ArrayList<>();
    }
    this.sharedListIds.add(sharedListIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">共有リストのIDです。</div> <div lang=\"en\">Share list ID.</div> 
   * @return sharedListIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">共有リストのIDです。</div> <div lang=\"en\">Share list ID.</div> ")

@Size(max=20) 
  public List<Long> getSharedListIds() {
    return sharedListIds;
  }

  public void setSharedListIds(List<Long> sharedListIds) {
    this.sharedListIds = sharedListIds;
  }

  public SharedCriterionServiceSelector startIndex(Integer startIndex) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedCriterionServiceSelector sharedCriterionServiceSelector = (SharedCriterionServiceSelector) o;
    return Objects.equals(this.accountId, sharedCriterionServiceSelector.accountId) &&
        Objects.equals(this.criterionIds, sharedCriterionServiceSelector.criterionIds) &&
        Objects.equals(this.numberResults, sharedCriterionServiceSelector.numberResults) &&
        Objects.equals(this.sharedListIds, sharedCriterionServiceSelector.sharedListIds) &&
        Objects.equals(this.startIndex, sharedCriterionServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, criterionIds, numberResults, sharedListIds, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedCriterionServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    criterionIds: ").append(toIndentedString(criterionIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    sharedListIds: ").append(toIndentedString(sharedListIds)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

