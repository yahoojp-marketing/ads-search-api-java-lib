package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignWebpageServiceSelectorオブジェクトは、取得する条件を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignWebpageServiceSelector object contains the rules to be acquired.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignWebpageServiceSelectorオブジェクトは、取得する条件を保持します。</div> <div lang=\"en\">CampaignWebpageServiceSelector object contains the rules to be acquired.</div> ")

public class CampaignWebpageServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignIds")
  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  @JsonProperty("targetIds")
  @Valid
  private JsonNullable<List<Long>> targetIds = JsonNullable.undefined();

  public CampaignWebpageServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignWebpageServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public CampaignWebpageServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンID</div> <div lang=\"en\">Campaign ID</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンID</div> <div lang=\"en\">Campaign ID</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public CampaignWebpageServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 2000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(2000) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public CampaignWebpageServiceSelector startIndex(Integer startIndex) {
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

  public CampaignWebpageServiceSelector targetIds(List<Long> targetIds) {
    this.targetIds = JsonNullable.of(targetIds);
    return this;
  }

  public CampaignWebpageServiceSelector addTargetIdsItem(Long targetIdsItem) {
    if (this.targetIds == null || !this.targetIds.isPresent()) {
      this.targetIds = JsonNullable.of(new ArrayList<>());
    }
    this.targetIds.get().add(targetIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">除外設定を識別するID</div> <div lang=\"en\">Unique ID for each identify excluded settings</div> 
   * @return targetIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">除外設定を識別するID</div> <div lang=\"en\">Unique ID for each identify excluded settings</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getTargetIds() {
    return targetIds;
  }

  public void setTargetIds(JsonNullable<List<Long>> targetIds) {
    this.targetIds = targetIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignWebpageServiceSelector campaignWebpageServiceSelector = (CampaignWebpageServiceSelector) o;
    return Objects.equals(this.accountId, campaignWebpageServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, campaignWebpageServiceSelector.campaignIds) &&
        Objects.equals(this.numberResults, campaignWebpageServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, campaignWebpageServiceSelector.startIndex) &&
        Objects.equals(this.targetIds, campaignWebpageServiceSelector.targetIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, numberResults, startIndex, targetIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignWebpageServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    targetIds: ").append(toIndentedString(targetIds)).append("\n");
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

