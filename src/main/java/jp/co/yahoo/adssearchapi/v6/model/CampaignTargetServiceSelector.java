package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.CampaignTargetServiceExcludedType;
import jp.co.yahoo.adssearchapi.v6.model.CampaignTargetServicePlatformType;
import jp.co.yahoo.adssearchapi.v6.model.CampaignTargetServiceTargetType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceSelectorオブジェクトは、操作の対象とするキャンペーンのターゲティング設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetSelector object describes the targeting settings on the campaign to be operated.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetServiceSelectorオブジェクトは、操作の対象とするキャンペーンのターゲティング設定を表します。</div> <div lang=\"en\">CampaignTargetSelector object describes the targeting settings on the campaign to be operated.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignTargetServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("excludedType")
  private CampaignTargetServiceExcludedType excludedType = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("platformTypes")
  @Valid
  private List<CampaignTargetServicePlatformType> platformTypes = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("targetIds")
  @Valid
  private List<String> targetIds = null;

  @JsonProperty("targetTypes")
  @Valid
  private List<CampaignTargetServiceTargetType> targetTypes = null;

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
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignTargetServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")

@Size(max=500) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public CampaignTargetServiceSelector excludedType(CampaignTargetServiceExcludedType excludedType) {
    this.excludedType = excludedType;
    return this;
  }

  /**
   * Get excludedType
   * @return excludedType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignTargetServiceExcludedType getExcludedType() {
    return excludedType;
  }

  public void setExcludedType(CampaignTargetServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }

  public CampaignTargetServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
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
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public CampaignTargetServiceSelector platformTypes(List<CampaignTargetServicePlatformType> platformTypes) {
    this.platformTypes = platformTypes;
    return this;
  }

  public CampaignTargetServiceSelector addPlatformTypesItem(CampaignTargetServicePlatformType platformTypesItem) {
    if (this.platformTypes == null) {
      this.platformTypes = new ArrayList<>();
    }
    this.platformTypes.add(platformTypesItem);
    return this;
  }

  /**
   * Get platformTypes
   * @return platformTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=3) 
  public List<CampaignTargetServicePlatformType> getPlatformTypes() {
    return platformTypes;
  }

  public void setPlatformTypes(List<CampaignTargetServicePlatformType> platformTypes) {
    this.platformTypes = platformTypes;
  }

  public CampaignTargetServiceSelector startIndex(Integer startIndex) {
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

  public CampaignTargetServiceSelector targetIds(List<String> targetIds) {
    this.targetIds = targetIds;
    return this;
  }

  public CampaignTargetServiceSelector addTargetIdsItem(String targetIdsItem) {
    if (this.targetIds == null) {
      this.targetIds = new ArrayList<>();
    }
    this.targetIds.add(targetIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットIDです。</div> <div lang=\"en\">Target ID.</div> 
   * @return targetIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットIDです。</div> <div lang=\"en\">Target ID.</div> ")

@Size(max=500) 
  public List<String> getTargetIds() {
    return targetIds;
  }

  public void setTargetIds(List<String> targetIds) {
    this.targetIds = targetIds;
  }

  public CampaignTargetServiceSelector targetTypes(List<CampaignTargetServiceTargetType> targetTypes) {
    this.targetTypes = targetTypes;
    return this;
  }

  public CampaignTargetServiceSelector addTargetTypesItem(CampaignTargetServiceTargetType targetTypesItem) {
    if (this.targetTypes == null) {
      this.targetTypes = new ArrayList<>();
    }
    this.targetTypes.add(targetTypesItem);
    return this;
  }

  /**
   * Get targetTypes
   * @return targetTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=4) 
  public List<CampaignTargetServiceTargetType> getTargetTypes() {
    return targetTypes;
  }

  public void setTargetTypes(List<CampaignTargetServiceTargetType> targetTypes) {
    this.targetTypes = targetTypes;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

