package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.CampaignRetargetingListServiceExcludedType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignRetargetingListServiceSelectorオブジェクトは、キャンペーン階層におけるターゲットリストの設定情報を取得するための検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignRetargetingListServiceSelector object holds search conditions (exec parameters) to get Target List settings on the campaign level.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignRetargetingListServiceSelectorオブジェクトは、キャンペーン階層におけるターゲットリストの設定情報を取得するための検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">CampaignRetargetingListServiceSelector object holds search conditions (exec parameters) to get Target List settings on the campaign level.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignRetargetingListServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("excludedType")
  private CampaignRetargetingListServiceExcludedType excludedType = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("targetListIds")
  @Valid
  private List<Long> targetListIds = null;

  public CampaignRetargetingListServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Search conditon: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Search conditon: Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignRetargetingListServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignRetargetingListServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Search conditon: Campaign ID.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Search conditon: Campaign ID.</div> ")

@Size(max=1000) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public CampaignRetargetingListServiceSelector excludedType(CampaignRetargetingListServiceExcludedType excludedType) {
    this.excludedType = excludedType;
    return this;
  }

  /**
   * Get excludedType
   * @return excludedType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignRetargetingListServiceExcludedType getExcludedType() {
    return excludedType;
  }

  public void setExcludedType(CampaignRetargetingListServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }

  public CampaignRetargetingListServiceSelector numberResults(Integer numberResults) {
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

  public CampaignRetargetingListServiceSelector startIndex(Integer startIndex) {
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

  public CampaignRetargetingListServiceSelector targetListIds(List<Long> targetListIds) {
    this.targetListIds = targetListIds;
    return this;
  }

  public CampaignRetargetingListServiceSelector addTargetListIdsItem(Long targetListIdsItem) {
    if (this.targetListIds == null) {
      this.targetListIds = new ArrayList<>();
    }
    this.targetListIds.add(targetListIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストIDです。</div> <div lang=\"en\">Search conditon: Target List ID.</div> 
   * @return targetListIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストIDです。</div> <div lang=\"en\">Search conditon: Target List ID.</div> ")

@Size(max=1000) 
  public List<Long> getTargetListIds() {
    return targetListIds;
  }

  public void setTargetListIds(List<Long> targetListIds) {
    this.targetListIds = targetListIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRetargetingListServiceSelector campaignRetargetingListServiceSelector = (CampaignRetargetingListServiceSelector) o;
    return Objects.equals(this.accountId, campaignRetargetingListServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, campaignRetargetingListServiceSelector.campaignIds) &&
        Objects.equals(this.excludedType, campaignRetargetingListServiceSelector.excludedType) &&
        Objects.equals(this.numberResults, campaignRetargetingListServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, campaignRetargetingListServiceSelector.startIndex) &&
        Objects.equals(this.targetListIds, campaignRetargetingListServiceSelector.targetListIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, excludedType, numberResults, startIndex, targetListIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRetargetingListServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

