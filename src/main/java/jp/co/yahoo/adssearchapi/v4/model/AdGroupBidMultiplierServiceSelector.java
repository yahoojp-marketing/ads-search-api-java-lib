package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupBidMultiplierServicePlatformType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupBidMultiplierServiceSelectorオブジェクトは、入札価格調整率を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Container for bid multiplier.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupBidMultiplierServiceSelectorオブジェクトは、入札価格調整率を格納するコンテナです。</div> <div lang=\"en\">Container for bid multiplier.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupBidMultiplierServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("adGroupIds")
  @Valid
  private List<Long> adGroupIds = null;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("platformTypes")
  @Valid
  private List<AdGroupBidMultiplierServicePlatformType> platformTypes = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public AdGroupBidMultiplierServiceSelector accountId(Long accountId) {
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

  public AdGroupBidMultiplierServiceSelector adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public AdGroupBidMultiplierServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。</div> <div lang=\"en\">Ad group ID.</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。</div> <div lang=\"en\">Ad group ID.</div> ")

@Size(max=1000) 
  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdGroupBidMultiplierServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public AdGroupBidMultiplierServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
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

@Size(max=1000) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdGroupBidMultiplierServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 10000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(10000) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public AdGroupBidMultiplierServiceSelector platformTypes(List<AdGroupBidMultiplierServicePlatformType> platformTypes) {
    this.platformTypes = platformTypes;
    return this;
  }

  public AdGroupBidMultiplierServiceSelector addPlatformTypesItem(AdGroupBidMultiplierServicePlatformType platformTypesItem) {
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
  public List<AdGroupBidMultiplierServicePlatformType> getPlatformTypes() {
    return platformTypes;
  }

  public void setPlatformTypes(List<AdGroupBidMultiplierServicePlatformType> platformTypes) {
    this.platformTypes = platformTypes;
  }

  public AdGroupBidMultiplierServiceSelector startIndex(Integer startIndex) {
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
    AdGroupBidMultiplierServiceSelector adGroupBidMultiplierServiceSelector = (AdGroupBidMultiplierServiceSelector) o;
    return Objects.equals(this.accountId, adGroupBidMultiplierServiceSelector.accountId) &&
        Objects.equals(this.adGroupIds, adGroupBidMultiplierServiceSelector.adGroupIds) &&
        Objects.equals(this.campaignIds, adGroupBidMultiplierServiceSelector.campaignIds) &&
        Objects.equals(this.numberResults, adGroupBidMultiplierServiceSelector.numberResults) &&
        Objects.equals(this.platformTypes, adGroupBidMultiplierServiceSelector.platformTypes) &&
        Objects.equals(this.startIndex, adGroupBidMultiplierServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupIds, campaignIds, numberResults, platformTypes, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupBidMultiplierServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    platformTypes: ").append(toIndentedString(platformTypes)).append("\n");
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

