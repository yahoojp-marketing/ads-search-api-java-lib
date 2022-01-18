package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.CampaignCriterionServiceCriterion;
import jp.co.yahoo.adssearchapi.v7.model.CampaignCriterionServiceUse;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionオブジェクトは、キャンペーンのクライテリアを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterion object describes campaign criteria.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCriterionオブジェクトは、キャンペーンのクライテリアを表します。</div> <div lang=\"en\">CampaignCriterion object describes campaign criteria.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignCriterion   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("criterion")
  private CampaignCriterionServiceCriterion criterion = null;

  @JsonProperty("use")
  private CampaignCriterionServiceUse use = null;

  public CampaignCriterion accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br> This field is required in ADD and REMOVE operation.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br> This field is required in ADD and REMOVE operation.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignCriterion campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in ADD and REMOVE operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in ADD and REMOVE operation.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignCriterion campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignCriterion criterion(CampaignCriterionServiceCriterion criterion) {
    this.criterion = criterion;
    return this;
  }

  /**
   * Get criterion
   * @return criterion
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignCriterionServiceCriterion getCriterion() {
    return criterion;
  }

  public void setCriterion(CampaignCriterionServiceCriterion criterion) {
    this.criterion = criterion;
  }

  public CampaignCriterion use(CampaignCriterionServiceUse use) {
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
    CampaignCriterion campaignCriterion = (CampaignCriterion) o;
    return Objects.equals(this.accountId, campaignCriterion.accountId) &&
        Objects.equals(this.campaignId, campaignCriterion.campaignId) &&
        Objects.equals(this.campaignName, campaignCriterion.campaignName) &&
        Objects.equals(this.criterion, campaignCriterion.criterion) &&
        Objects.equals(this.use, campaignCriterion.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, campaignName, criterion, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCriterion {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
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

