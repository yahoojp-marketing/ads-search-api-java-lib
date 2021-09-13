package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.CampaignCriterionServiceUse;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionServiceSelectorオブジェクトは、操作の対象となるキャンペーンのクライテリアを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterionServiceSelector object describes campaign criteria for operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCriterionServiceSelectorオブジェクトは、操作の対象となるキャンペーンのクライテリアを表します。</div> <div lang=\"en\">CampaignCriterionServiceSelector object describes campaign criteria for operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignCriterionServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("criterionIds")
  @Valid
  private List<Long> criterionIds = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("use")
  private CampaignCriterionServiceUse use = null;

  public CampaignCriterionServiceSelector accountId(Long accountId) {
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

  public CampaignCriterionServiceSelector campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignCriterionServiceSelector addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDの配列です。</div> <div lang=\"en\">Campaign ID array.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDの配列です。</div> <div lang=\"en\">Campaign ID array.</div> ")

@Size(max=500) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public CampaignCriterionServiceSelector criterionIds(List<Long> criterionIds) {
    this.criterionIds = criterionIds;
    return this;
  }

  public CampaignCriterionServiceSelector addCriterionIdsItem(Long criterionIdsItem) {
    if (this.criterionIds == null) {
      this.criterionIds = new ArrayList<>();
    }
    this.criterionIds.add(criterionIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">クライテリオンIDの配列です。<br> 指定しない場合は、キャンペーンID以下のすべてのクライテリアが含まれます。</div> <div lang=\"en\">Criterion ID array.<br> If no criterionIds, all of criterionIds under the campaign ID are returned.</div> 
   * @return criterionIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリオンIDの配列です。<br> 指定しない場合は、キャンペーンID以下のすべてのクライテリアが含まれます。</div> <div lang=\"en\">Criterion ID array.<br> If no criterionIds, all of criterionIds under the campaign ID are returned.</div> ")

@Size(max=500) 
  public List<Long> getCriterionIds() {
    return criterionIds;
  }

  public void setCriterionIds(List<Long> criterionIds) {
    this.criterionIds = criterionIds;
  }

  public CampaignCriterionServiceSelector numberResults(Integer numberResults) {
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

  public CampaignCriterionServiceSelector startIndex(Integer startIndex) {
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

  public CampaignCriterionServiceSelector use(CampaignCriterionServiceUse use) {
    this.use = use;
    return this;
  }

  /**
   * Get use
   * @return use
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignCriterionServiceUse getUse() {
    return use;
  }

  public void setUse(CampaignCriterionServiceUse use) {
    this.use = use;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCriterionServiceSelector campaignCriterionServiceSelector = (CampaignCriterionServiceSelector) o;
    return Objects.equals(this.accountId, campaignCriterionServiceSelector.accountId) &&
        Objects.equals(this.campaignIds, campaignCriterionServiceSelector.campaignIds) &&
        Objects.equals(this.criterionIds, campaignCriterionServiceSelector.criterionIds) &&
        Objects.equals(this.numberResults, campaignCriterionServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, campaignCriterionServiceSelector.startIndex) &&
        Objects.equals(this.use, campaignCriterionServiceSelector.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignIds, criterionIds, numberResults, startIndex, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCriterionServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    criterionIds: ").append(toIndentedString(criterionIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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

