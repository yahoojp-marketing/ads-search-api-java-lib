package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupRetargetingListServiceExcludedType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupRetargetingListServiceSelector、広告グループレベルでのターゲットリスト設定の検索条件（実行パラメータ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupRetargetingListServiceSelector is an object that holds search condition (parameter).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupRetargetingListServiceSelector、広告グループレベルでのターゲットリスト設定の検索条件（実行パラメータ）を保持するオブジェクトです。</div> <div lang=\"en\">AdGroupRetargetingListServiceSelector is an object that holds search condition (parameter).</div> ")

public class AdGroupRetargetingListServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("adGroupIds")
  @Valid
  private JsonNullable<List<Long>> adGroupIds = JsonNullable.undefined();

  @JsonProperty("campaignIds")
  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.undefined();

  @JsonProperty("excludedType")
  private JsonNullable<AdGroupRetargetingListServiceExcludedType> excludedType = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("targetListIds")
  @Valid
  private JsonNullable<List<Long>> targetListIds = JsonNullable.undefined();

  public AdGroupRetargetingListServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdGroupRetargetingListServiceSelector adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = JsonNullable.of(adGroupIds);
    return this;
  }

  public AdGroupRetargetingListServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null || !this.adGroupIds.isPresent()) {
      this.adGroupIds = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupIds.get().add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：広告グループIDです。</div> <div lang=\"en\">Ad group ID.</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：広告グループIDです。</div> <div lang=\"en\">Ad group ID.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(JsonNullable<List<Long>> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdGroupRetargetingListServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public AdGroupRetargetingListServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdGroupRetargetingListServiceSelector excludedType(AdGroupRetargetingListServiceExcludedType excludedType) {
    this.excludedType = JsonNullable.of(excludedType);
    return this;
  }

  /**
   * Get excludedType
   * @return excludedType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupRetargetingListServiceExcludedType> getExcludedType() {
    return excludedType;
  }

  public void setExcludedType(JsonNullable<AdGroupRetargetingListServiceExcludedType> excludedType) {
    this.excludedType = excludedType;
  }

  public AdGroupRetargetingListServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
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
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public AdGroupRetargetingListServiceSelector startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }

  public AdGroupRetargetingListServiceSelector targetListIds(List<Long> targetListIds) {
    this.targetListIds = JsonNullable.of(targetListIds);
    return this;
  }

  public AdGroupRetargetingListServiceSelector addTargetListIdsItem(Long targetListIdsItem) {
    if (this.targetListIds == null || !this.targetListIds.isPresent()) {
      this.targetListIds = JsonNullable.of(new ArrayList<>());
    }
    this.targetListIds.get().add(targetListIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：ターゲットリストIDです。</div> <div lang=\"en\">Target list ID.</div> 
   * @return targetListIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：ターゲットリストIDです。</div> <div lang=\"en\">Target list ID.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getTargetListIds() {
    return targetListIds;
  }

  public void setTargetListIds(JsonNullable<List<Long>> targetListIds) {
    this.targetListIds = targetListIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupRetargetingListServiceSelector adGroupRetargetingListServiceSelector = (AdGroupRetargetingListServiceSelector) o;
    return Objects.equals(this.accountId, adGroupRetargetingListServiceSelector.accountId) &&
        Objects.equals(this.adGroupIds, adGroupRetargetingListServiceSelector.adGroupIds) &&
        Objects.equals(this.campaignIds, adGroupRetargetingListServiceSelector.campaignIds) &&
        Objects.equals(this.excludedType, adGroupRetargetingListServiceSelector.excludedType) &&
        Objects.equals(this.numberResults, adGroupRetargetingListServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, adGroupRetargetingListServiceSelector.startIndex) &&
        Objects.equals(this.targetListIds, adGroupRetargetingListServiceSelector.targetListIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupIds, campaignIds, excludedType, numberResults, startIndex, targetListIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupRetargetingListServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    excludedType: ").append(toIndentedString(excludedType)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    targetListIds: ").append(toIndentedString(targetListIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

