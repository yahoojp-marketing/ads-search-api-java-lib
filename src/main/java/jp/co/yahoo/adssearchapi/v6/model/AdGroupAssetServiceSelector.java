package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupAssetServiceType;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupAssetServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAssetServiceSelectorオブジェクトは、アセット情報を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAssetServiceSelector describes the Asset information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAssetServiceSelectorオブジェクトは、アセット情報を指定します。</div> <div lang=\"en\">AdGroupAssetServiceSelector describes the Asset information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAssetServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("adGroupIds")
  @Valid
  private List<Long> adGroupIds = null;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("assetIds")
  @Valid
  private List<Long> assetIds = null;

  @JsonProperty("types")
  @Valid
  private List<AdGroupAssetServiceType> types = null;

  @JsonProperty("userStatuses")
  @Valid
  private List<AdGroupAssetServiceUserStatus> userStatuses = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public AdGroupAssetServiceSelector accountId(Long accountId) {
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

  public AdGroupAssetServiceSelector adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public AdGroupAssetServiceSelector addAdGroupIdsItem(Long adGroupIdsItem) {
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

@Size(max=500) 
  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdGroupAssetServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public AdGroupAssetServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
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

  public AdGroupAssetServiceSelector assetIds(List<Long> assetIds) {
    this.assetIds = assetIds;
    return this;
  }

  public AdGroupAssetServiceSelector addAssetIdsItem(Long assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">アセット情報のIDです。</div> <div lang=\"en\">Asset information ID.</div> 
   * @return assetIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アセット情報のIDです。</div> <div lang=\"en\">Asset information ID.</div> ")

@Size(max=500) 
  public List<Long> getAssetIds() {
    return assetIds;
  }

  public void setAssetIds(List<Long> assetIds) {
    this.assetIds = assetIds;
  }

  public AdGroupAssetServiceSelector types(List<AdGroupAssetServiceType> types) {
    this.types = types;
    return this;
  }

  public AdGroupAssetServiceSelector addTypesItem(AdGroupAssetServiceType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=4) 
  public List<AdGroupAssetServiceType> getTypes() {
    return types;
  }

  public void setTypes(List<AdGroupAssetServiceType> types) {
    this.types = types;
  }

  public AdGroupAssetServiceSelector userStatuses(List<AdGroupAssetServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
    return this;
  }

  public AdGroupAssetServiceSelector addUserStatusesItem(AdGroupAssetServiceUserStatus userStatusesItem) {
    if (this.userStatuses == null) {
      this.userStatuses = new ArrayList<>();
    }
    this.userStatuses.add(userStatusesItem);
    return this;
  }

  /**
   * Get userStatuses
   * @return userStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<AdGroupAssetServiceUserStatus> getUserStatuses() {
    return userStatuses;
  }

  public void setUserStatuses(List<AdGroupAssetServiceUserStatus> userStatuses) {
    this.userStatuses = userStatuses;
  }

  public AdGroupAssetServiceSelector numberResults(Integer numberResults) {
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

  public AdGroupAssetServiceSelector startIndex(Integer startIndex) {
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
    AdGroupAssetServiceSelector adGroupAssetServiceSelector = (AdGroupAssetServiceSelector) o;
    return Objects.equals(this.accountId, adGroupAssetServiceSelector.accountId) &&
        Objects.equals(this.adGroupIds, adGroupAssetServiceSelector.adGroupIds) &&
        Objects.equals(this.campaignIds, adGroupAssetServiceSelector.campaignIds) &&
        Objects.equals(this.assetIds, adGroupAssetServiceSelector.assetIds) &&
        Objects.equals(this.types, adGroupAssetServiceSelector.types) &&
        Objects.equals(this.userStatuses, adGroupAssetServiceSelector.userStatuses) &&
        Objects.equals(this.numberResults, adGroupAssetServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, adGroupAssetServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupIds, campaignIds, assetIds, types, userStatuses, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAssetServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    userStatuses: ").append(toIndentedString(userStatuses)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
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

