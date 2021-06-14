package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceBiddableAdGroupCriterion;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceCriterion;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceLabel;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceTrademarkStatus;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceUse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionオブジェクトは、広告グループのクライテリアを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterion object describes ad group criteria information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionオブジェクトは、広告グループのクライテリアを表します。</div> <div lang=\"en\">AdGroupCriterion object describes ad group criteria information.</div> ")

public class AdGroupCriterion   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("adGroupName")
  private JsonNullable<String> adGroupName = JsonNullable.undefined();

  @JsonProperty("adGroupTrackId")
  private JsonNullable<Long> adGroupTrackId = JsonNullable.undefined();

  @JsonProperty("biddableAdGroupCriterion")
  private JsonNullable<AdGroupCriterionServiceBiddableAdGroupCriterion> biddableAdGroupCriterion = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("campaignTrackId")
  private JsonNullable<Long> campaignTrackId = JsonNullable.undefined();

  @JsonProperty("criterion")
  private JsonNullable<AdGroupCriterionServiceCriterion> criterion = JsonNullable.undefined();

  @JsonProperty("labels")
  @Valid
  private JsonNullable<List<AdGroupCriterionServiceLabel>> labels = JsonNullable.undefined();

  @JsonProperty("use")
  private JsonNullable<AdGroupCriterionServiceUse> use = JsonNullable.undefined();

  @JsonProperty("trademarkStatus")
  private JsonNullable<AdGroupCriterionServiceTrademarkStatus> trademarkStatus = JsonNullable.undefined();

  @JsonProperty("invalidedTrademarks")
  @Valid
  private JsonNullable<List<String>> invalidedTrademarks = JsonNullable.undefined();

  public AdGroupCriterion accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public AdGroupCriterion adGroupId(Long adGroupId) {
    this.adGroupId = JsonNullable.of(adGroupId);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> ")


  public JsonNullable<Long> getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(JsonNullable<Long> adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupCriterion adGroupName(String adGroupName) {
    this.adGroupName = JsonNullable.of(adGroupName);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループ名です。</div> <div lang=\"en\">Ad group name.</div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名です。</div> <div lang=\"en\">Ad group name.</div> ")


  public JsonNullable<String> getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(JsonNullable<String> adGroupName) {
    this.adGroupName = adGroupName;
  }

  public AdGroupCriterion adGroupTrackId(Long adGroupTrackId) {
    this.adGroupTrackId = JsonNullable.of(adGroupTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用広告グループIDです。</div> <div lang=\"en\">Ad group ID for tracking.</div> 
   * @return adGroupTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用広告グループIDです。</div> <div lang=\"en\">Ad group ID for tracking.</div> ")


  public JsonNullable<Long> getAdGroupTrackId() {
    return adGroupTrackId;
  }

  public void setAdGroupTrackId(JsonNullable<Long> adGroupTrackId) {
    this.adGroupTrackId = adGroupTrackId;
  }

  public AdGroupCriterion biddableAdGroupCriterion(AdGroupCriterionServiceBiddableAdGroupCriterion biddableAdGroupCriterion) {
    this.biddableAdGroupCriterion = JsonNullable.of(biddableAdGroupCriterion);
    return this;
  }

  /**
   * Get biddableAdGroupCriterion
   * @return biddableAdGroupCriterion
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceBiddableAdGroupCriterion> getBiddableAdGroupCriterion() {
    return biddableAdGroupCriterion;
  }

  public void setBiddableAdGroupCriterion(JsonNullable<AdGroupCriterionServiceBiddableAdGroupCriterion> biddableAdGroupCriterion) {
    this.biddableAdGroupCriterion = biddableAdGroupCriterion;
  }

  public AdGroupCriterion campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupCriterion campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign name.</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign name.</div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public AdGroupCriterion campaignTrackId(Long campaignTrackId) {
    this.campaignTrackId = JsonNullable.of(campaignTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用キャンペーンIDです。</div> <div lang=\"en\">Campaign ID for tracking.</div> 
   * @return campaignTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用キャンペーンIDです。</div> <div lang=\"en\">Campaign ID for tracking.</div> ")


  public JsonNullable<Long> getCampaignTrackId() {
    return campaignTrackId;
  }

  public void setCampaignTrackId(JsonNullable<Long> campaignTrackId) {
    this.campaignTrackId = campaignTrackId;
  }

  public AdGroupCriterion criterion(AdGroupCriterionServiceCriterion criterion) {
    this.criterion = JsonNullable.of(criterion);
    return this;
  }

  /**
   * Get criterion
   * @return criterion
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceCriterion> getCriterion() {
    return criterion;
  }

  public void setCriterion(JsonNullable<AdGroupCriterionServiceCriterion> criterion) {
    this.criterion = criterion;
  }

  public AdGroupCriterion labels(List<AdGroupCriterionServiceLabel> labels) {
    this.labels = JsonNullable.of(labels);
    return this;
  }

  public AdGroupCriterion addLabelsItem(AdGroupCriterionServiceLabel labelsItem) {
    if (this.labels == null || !this.labels.isPresent()) {
      this.labels = JsonNullable.of(new ArrayList<>());
    }
    this.labels.get().add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<AdGroupCriterionServiceLabel>> getLabels() {
    return labels;
  }

  public void setLabels(JsonNullable<List<AdGroupCriterionServiceLabel>> labels) {
    this.labels = labels;
  }

  public AdGroupCriterion use(AdGroupCriterionServiceUse use) {
    this.use = JsonNullable.of(use);
    return this;
  }

  /**
   * Get use
   * @return use
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceUse> getUse() {
    return use;
  }

  public void setUse(JsonNullable<AdGroupCriterionServiceUse> use) {
    this.use = use;
  }

  public AdGroupCriterion trademarkStatus(AdGroupCriterionServiceTrademarkStatus trademarkStatus) {
    this.trademarkStatus = JsonNullable.of(trademarkStatus);
    return this;
  }

  /**
   * Get trademarkStatus
   * @return trademarkStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceTrademarkStatus> getTrademarkStatus() {
    return trademarkStatus;
  }

  public void setTrademarkStatus(JsonNullable<AdGroupCriterionServiceTrademarkStatus> trademarkStatus) {
    this.trademarkStatus = trademarkStatus;
  }

  public AdGroupCriterion invalidedTrademarks(List<String> invalidedTrademarks) {
    this.invalidedTrademarks = JsonNullable.of(invalidedTrademarks);
    return this;
  }

  public AdGroupCriterion addInvalidedTrademarksItem(String invalidedTrademarksItem) {
    if (this.invalidedTrademarks == null || !this.invalidedTrademarks.isPresent()) {
      this.invalidedTrademarks = JsonNullable.of(new ArrayList<>());
    }
    this.invalidedTrademarks.get().add(invalidedTrademarksItem);
    return this;
  }

  /**
   * <div lang=\"ja\">制限された商標です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Invalided trademarks.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return invalidedTrademarks
  */
  @ApiModelProperty(value = "<div lang=\"ja\">制限された商標です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。 </div> <div lang=\"en\">Invalided trademarks.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<List<String>> getInvalidedTrademarks() {
    return invalidedTrademarks;
  }

  public void setInvalidedTrademarks(JsonNullable<List<String>> invalidedTrademarks) {
    this.invalidedTrademarks = invalidedTrademarks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterion adGroupCriterion = (AdGroupCriterion) o;
    return Objects.equals(this.accountId, adGroupCriterion.accountId) &&
        Objects.equals(this.adGroupId, adGroupCriterion.adGroupId) &&
        Objects.equals(this.adGroupName, adGroupCriterion.adGroupName) &&
        Objects.equals(this.adGroupTrackId, adGroupCriterion.adGroupTrackId) &&
        Objects.equals(this.biddableAdGroupCriterion, adGroupCriterion.biddableAdGroupCriterion) &&
        Objects.equals(this.campaignId, adGroupCriterion.campaignId) &&
        Objects.equals(this.campaignName, adGroupCriterion.campaignName) &&
        Objects.equals(this.campaignTrackId, adGroupCriterion.campaignTrackId) &&
        Objects.equals(this.criterion, adGroupCriterion.criterion) &&
        Objects.equals(this.labels, adGroupCriterion.labels) &&
        Objects.equals(this.use, adGroupCriterion.use) &&
        Objects.equals(this.trademarkStatus, adGroupCriterion.trademarkStatus) &&
        Objects.equals(this.invalidedTrademarks, adGroupCriterion.invalidedTrademarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, adGroupName, adGroupTrackId, biddableAdGroupCriterion, campaignId, campaignName, campaignTrackId, criterion, labels, use, trademarkStatus, invalidedTrademarks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterion {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
    sb.append("    adGroupTrackId: ").append(toIndentedString(adGroupTrackId)).append("\n");
    sb.append("    biddableAdGroupCriterion: ").append(toIndentedString(biddableAdGroupCriterion)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignTrackId: ").append(toIndentedString(campaignTrackId)).append("\n");
    sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    trademarkStatus: ").append(toIndentedString(trademarkStatus)).append("\n");
    sb.append("    invalidedTrademarks: ").append(toIndentedString(invalidedTrademarks)).append("\n");
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

