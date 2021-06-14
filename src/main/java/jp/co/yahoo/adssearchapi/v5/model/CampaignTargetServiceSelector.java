package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignTargetServiceExcludedType;
import jp.co.yahoo.adssearchapi.v5.model.CampaignTargetServicePlatformType;
import jp.co.yahoo.adssearchapi.v5.model.CampaignTargetServiceTargetType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceSelectorオブジェクトは、操作の対象とするキャンペーンのターゲティング設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetSelector object describes the targeting settings on the campaign to be operated.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetServiceSelectorオブジェクトは、操作の対象とするキャンペーンのターゲティング設定を表します。</div> <div lang=\"en\">CampaignTargetSelector object describes the targeting settings on the campaign to be operated.</div> ")

public class CampaignTargetServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignIds")
  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.undefined();

  @JsonProperty("excludedType")
  private JsonNullable<CampaignTargetServiceExcludedType> excludedType = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("platformTypes")
  @Valid
  private JsonNullable<List<CampaignTargetServicePlatformType>> platformTypes = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("targetIds")
  @Valid
  private JsonNullable<List<String>> targetIds = JsonNullable.undefined();

  @JsonProperty("targetTypes")
  @Valid
  private JsonNullable<List<CampaignTargetServiceTargetType>> targetTypes = JsonNullable.undefined();

  public CampaignTargetServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignTargetServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public CampaignTargetServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public CampaignTargetServiceSelector excludedType(CampaignTargetServiceExcludedType excludedType) {
    this.excludedType = JsonNullable.of(excludedType);
    return this;
  }

  /**
   * Get excludedType
   * @return excludedType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignTargetServiceExcludedType> getExcludedType() {
    return excludedType;
  }

  public void setExcludedType(JsonNullable<CampaignTargetServiceExcludedType> excludedType) {
    this.excludedType = excludedType;
  }

  public CampaignTargetServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public CampaignTargetServiceSelector platformTypes(List<CampaignTargetServicePlatformType> platformTypes) {
    this.platformTypes = JsonNullable.of(platformTypes);
    return this;
  }

  public CampaignTargetServiceSelector addPlatformTypesItem(CampaignTargetServicePlatformType platformTypesItem) {
    if (this.platformTypes == null || !this.platformTypes.isPresent()) {
      this.platformTypes = JsonNullable.of(new ArrayList<>());
    }
    this.platformTypes.get().add(platformTypesItem);
    return this;
  }

  /**
   * Get platformTypes
   * @return platformTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=3) 
  public JsonNullable<List<CampaignTargetServicePlatformType>> getPlatformTypes() {
    return platformTypes;
  }

  public void setPlatformTypes(JsonNullable<List<CampaignTargetServicePlatformType>> platformTypes) {
    this.platformTypes = platformTypes;
  }

  public CampaignTargetServiceSelector startIndex(Integer startIndex) {
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

  public CampaignTargetServiceSelector targetIds(List<String> targetIds) {
    this.targetIds = JsonNullable.of(targetIds);
    return this;
  }

  public CampaignTargetServiceSelector addTargetIdsItem(String targetIdsItem) {
    if (this.targetIds == null || !this.targetIds.isPresent()) {
      this.targetIds = JsonNullable.of(new ArrayList<>());
    }
    this.targetIds.get().add(targetIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットIDです。</div> <div lang=\"en\">Target ID.</div> 
   * @return targetIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットIDです。</div> <div lang=\"en\">Target ID.</div> ")

@Size(max=500) 
  public JsonNullable<List<String>> getTargetIds() {
    return targetIds;
  }

  public void setTargetIds(JsonNullable<List<String>> targetIds) {
    this.targetIds = targetIds;
  }

  public CampaignTargetServiceSelector targetTypes(List<CampaignTargetServiceTargetType> targetTypes) {
    this.targetTypes = JsonNullable.of(targetTypes);
    return this;
  }

  public CampaignTargetServiceSelector addTargetTypesItem(CampaignTargetServiceTargetType targetTypesItem) {
    if (this.targetTypes == null || !this.targetTypes.isPresent()) {
      this.targetTypes = JsonNullable.of(new ArrayList<>());
    }
    this.targetTypes.get().add(targetTypesItem);
    return this;
  }

  /**
   * Get targetTypes
   * @return targetTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=4) 
  public JsonNullable<List<CampaignTargetServiceTargetType>> getTargetTypes() {
    return targetTypes;
  }

  public void setTargetTypes(JsonNullable<List<CampaignTargetServiceTargetType>> targetTypes) {
    this.targetTypes = targetTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargetServiceSelector campaignTargetServiceSelector = (CampaignTargetServiceSelector) o;
    return Objects.equals(this.accountId, campaignTargetServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, campaignTargetServiceSelector.campaignIds) &&
        Objects.equals(this.excludedType, campaignTargetServiceSelector.excludedType) &&
        Objects.equals(this.numberResults, campaignTargetServiceSelector.numberResults) &&
        Objects.equals(this.platformTypes, campaignTargetServiceSelector.platformTypes) &&
        Objects.equals(this.startIndex, campaignTargetServiceSelector.startIndex) &&
        Objects.equals(this.targetIds, campaignTargetServiceSelector.targetIds) &&
        Objects.equals(this.targetTypes, campaignTargetServiceSelector.targetTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, excludedType, numberResults, platformTypes, startIndex, targetIds, targetTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    excludedType: ").append(toIndentedString(excludedType)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    platformTypes: ").append(toIndentedString(platformTypes)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    targetIds: ").append(toIndentedString(targetIds)).append("\n");
    sb.append("    targetTypes: ").append(toIndentedString(targetTypes)).append("\n");
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

