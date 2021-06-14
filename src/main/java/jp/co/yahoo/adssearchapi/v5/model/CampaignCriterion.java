package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignCriterionServiceCriterion;
import jp.co.yahoo.adssearchapi.v5.model.CampaignCriterionServiceUse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionオブジェクトは、キャンペーンのクライテリアを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterion object describes campaign criteria.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCriterionオブジェクトは、キャンペーンのクライテリアを表します。</div> <div lang=\"en\">CampaignCriterion object describes campaign criteria.</div> ")

public class CampaignCriterion   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("criterion")
  private JsonNullable<CampaignCriterionServiceCriterion> criterion = JsonNullable.undefined();

  @JsonProperty("use")
  private JsonNullable<CampaignCriterionServiceUse> use = JsonNullable.undefined();

  public CampaignCriterion accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br> This field is required in ADD and REMOVE operation.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br> This field is required in ADD and REMOVE operation.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public CampaignCriterion campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in ADD and REMOVE operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in ADD and REMOVE operation.</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignCriterion campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignCriterion criterion(CampaignCriterionServiceCriterion criterion) {
    this.criterion = JsonNullable.of(criterion);
    return this;
  }

  /**
   * Get criterion
   * @return criterion
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignCriterionServiceCriterion> getCriterion() {
    return criterion;
  }

  public void setCriterion(JsonNullable<CampaignCriterionServiceCriterion> criterion) {
    this.criterion = criterion;
  }

  public CampaignCriterion use(CampaignCriterionServiceUse use) {
    this.use = JsonNullable.of(use);
    return this;
  }

  /**
   * Get use
   * @return use
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignCriterionServiceUse> getUse() {
    return use;
  }

  public void setUse(JsonNullable<CampaignCriterionServiceUse> use) {
    this.use = use;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

