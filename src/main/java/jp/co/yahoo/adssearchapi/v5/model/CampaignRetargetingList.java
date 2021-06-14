package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignRetargetingListServiceCriterionTargetList;
import jp.co.yahoo.adssearchapi.v5.model.CampaignRetargetingListServiceExcludedType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignRetargetingListオブジェクトは、キャンペーン階層におけるターゲットリストの設定情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignRetargetingList object holds the setting information of Target List on campaign level.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignRetargetingListオブジェクトは、キャンペーン階層におけるターゲットリストの設定情報を保持するオブジェクトです。</div> <div lang=\"en\">CampaignRetargetingList object holds the setting information of Target List on campaign level.</div> ")

public class CampaignRetargetingList   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("bidMultiplier")
  private JsonNullable<Double> bidMultiplier = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("criterionTargetList")
  private JsonNullable<CampaignRetargetingListServiceCriterionTargetList> criterionTargetList = JsonNullable.undefined();

  @JsonProperty("excludedType")
  private JsonNullable<CampaignRetargetingListServiceExcludedType> excludedType = JsonNullable.undefined();

  public CampaignRetargetingList accountId(Long accountId) {
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

  public CampaignRetargetingList bidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = JsonNullable.of(bidMultiplier);
    return this;
  }

  /**
   * <div lang=\"ja\">   入札価格調整率です。0.10～10.00まで指定できます。<br>   0を指定した場合、広告は配信されません。<br>   また、入札価格調整率の値は小数点第二位まで指定可能です。<br>   このフィールドは省略可能となります。その際、デフォルト設定値は1.0となります。 </div> <div lang=\"en\">   Bid adjustment rate.<br>   Can be specified between  0.10 to 10.00.<br>   When specified &#39;0&#39;, the ad will not be delivered.<br>   Bid adjustment rate can be specified up to two decimal places.<br>   This field is optional. The default value will be 1.0. </div> 
   * @return bidMultiplier
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   入札価格調整率です。0.10～10.00まで指定できます。<br>   0を指定した場合、広告は配信されません。<br>   また、入札価格調整率の値は小数点第二位まで指定可能です。<br>   このフィールドは省略可能となります。その際、デフォルト設定値は1.0となります。 </div> <div lang=\"en\">   Bid adjustment rate.<br>   Can be specified between  0.10 to 10.00.<br>   When specified &#39;0&#39;, the ad will not be delivered.<br>   Bid adjustment rate can be specified up to two decimal places.<br>   This field is optional. The default value will be 1.0. </div> ")


  public JsonNullable<Double> getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(JsonNullable<Double> bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public CampaignRetargetingList campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br>This field is required in any cases.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br>このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br>This field is required in any cases.</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignRetargetingList campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名称です。</div> <div lang=\"en\">Name of campaign.</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名称です。</div> <div lang=\"en\">Name of campaign.</div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignRetargetingList criterionTargetList(CampaignRetargetingListServiceCriterionTargetList criterionTargetList) {
    this.criterionTargetList = JsonNullable.of(criterionTargetList);
    return this;
  }

  /**
   * Get criterionTargetList
   * @return criterionTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignRetargetingListServiceCriterionTargetList> getCriterionTargetList() {
    return criterionTargetList;
  }

  public void setCriterionTargetList(JsonNullable<CampaignRetargetingListServiceCriterionTargetList> criterionTargetList) {
    this.criterionTargetList = criterionTargetList;
  }

  public CampaignRetargetingList excludedType(CampaignRetargetingListServiceExcludedType excludedType) {
    this.excludedType = JsonNullable.of(excludedType);
    return this;
  }

  /**
   * Get excludedType
   * @return excludedType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignRetargetingListServiceExcludedType> getExcludedType() {
    return excludedType;
  }

  public void setExcludedType(JsonNullable<CampaignRetargetingListServiceExcludedType> excludedType) {
    this.excludedType = excludedType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRetargetingList campaignRetargetingList = (CampaignRetargetingList) o;
    return Objects.equals(this.accountId, campaignRetargetingList.accountId) &&
        Objects.equals(this.bidMultiplier, campaignRetargetingList.bidMultiplier) &&
        Objects.equals(this.campaignId, campaignRetargetingList.campaignId) &&
        Objects.equals(this.campaignName, campaignRetargetingList.campaignName) &&
        Objects.equals(this.criterionTargetList, campaignRetargetingList.criterionTargetList) &&
        Objects.equals(this.excludedType, campaignRetargetingList.excludedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bidMultiplier, campaignId, campaignName, criterionTargetList, excludedType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRetargetingList {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    criterionTargetList: ").append(toIndentedString(criterionTargetList)).append("\n");
    sb.append("    excludedType: ").append(toIndentedString(excludedType)).append("\n");
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

