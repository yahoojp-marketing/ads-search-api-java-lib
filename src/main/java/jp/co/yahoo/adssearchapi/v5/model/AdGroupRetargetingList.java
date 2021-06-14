package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupRetargetingListServiceCriterionTargetList;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupRetargetingListServiceExcludedType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupRetargetingListは、広告グループレベルでのターゲットリスト設定を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupRetargetingList is an object that holds ad group user list information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupRetargetingListは、広告グループレベルでのターゲットリスト設定を保持するオブジェクトです。</div> <div lang=\"en\">AdGroupRetargetingList is an object that holds ad group user list information.</div> ")

public class AdGroupRetargetingList   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("adGroupName")
  private JsonNullable<String> adGroupName = JsonNullable.undefined();

  @JsonProperty("bidMultiplier")
  private JsonNullable<Double> bidMultiplier = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("criterionTargetList")
  private JsonNullable<AdGroupRetargetingListServiceCriterionTargetList> criterionTargetList = JsonNullable.undefined();

  @JsonProperty("excludedType")
  private JsonNullable<AdGroupRetargetingListServiceExcludedType> excludedType = JsonNullable.undefined();

  public AdGroupRetargetingList accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public AdGroupRetargetingList adGroupId(Long adGroupId) {
    this.adGroupId = JsonNullable.of(adGroupId);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> ")


  public JsonNullable<Long> getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(JsonNullable<Long> adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupRetargetingList adGroupName(String adGroupName) {
    this.adGroupName = JsonNullable.of(adGroupName);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad group name.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad group name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<String> getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(JsonNullable<String> adGroupName) {
    this.adGroupName = adGroupName;
  }

  public AdGroupRetargetingList bidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = JsonNullable.of(bidMultiplier);
    return this;
  }

  /**
   * <div lang=\"ja\">   MaxCPC上昇値です。<br>   0.10～10.00まで指定できます。<br>   また、0を指定した場合、広告は配信されません。<br>   MaxCPC上昇値の値は小数点第二位まで指定可能です。<br>   このフィールドは省略可能となります。その際、デフォルト設定値は1.0となります。 </div> <div lang=\"en\">   Maximum CPC increase value.<br>   Can be specified between  0.10 to 10.00.<br>   When specified &#39;0&#39;, the ad will not be delivered.<br>   Maximum CPC increase value can be specified up to two decimal places.<br>   This field is optional. The default value will be 1.0. </div> 
   * @return bidMultiplier
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   MaxCPC上昇値です。<br>   0.10～10.00まで指定できます。<br>   また、0を指定した場合、広告は配信されません。<br>   MaxCPC上昇値の値は小数点第二位まで指定可能です。<br>   このフィールドは省略可能となります。その際、デフォルト設定値は1.0となります。 </div> <div lang=\"en\">   Maximum CPC increase value.<br>   Can be specified between  0.10 to 10.00.<br>   When specified &#39;0&#39;, the ad will not be delivered.<br>   Maximum CPC increase value can be specified up to two decimal places.<br>   This field is optional. The default value will be 1.0. </div> ")


  public JsonNullable<Double> getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(JsonNullable<Double> bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public AdGroupRetargetingList campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupRetargetingList campaignName(String campaignName) {
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

  public AdGroupRetargetingList criterionTargetList(AdGroupRetargetingListServiceCriterionTargetList criterionTargetList) {
    this.criterionTargetList = JsonNullable.of(criterionTargetList);
    return this;
  }

  /**
   * Get criterionTargetList
   * @return criterionTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupRetargetingListServiceCriterionTargetList> getCriterionTargetList() {
    return criterionTargetList;
  }

  public void setCriterionTargetList(JsonNullable<AdGroupRetargetingListServiceCriterionTargetList> criterionTargetList) {
    this.criterionTargetList = criterionTargetList;
  }

  public AdGroupRetargetingList excludedType(AdGroupRetargetingListServiceExcludedType excludedType) {
    this.excludedType = JsonNullable.of(excludedType);
    return this;
  }

  /**
   * Get excludedType
   * @return excludedType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupRetargetingListServiceExcludedType> getExcludedType() {
    return excludedType;
  }

  public void setExcludedType(JsonNullable<AdGroupRetargetingListServiceExcludedType> excludedType) {
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
    AdGroupRetargetingList adGroupRetargetingList = (AdGroupRetargetingList) o;
    return Objects.equals(this.accountId, adGroupRetargetingList.accountId) &&
        Objects.equals(this.adGroupId, adGroupRetargetingList.adGroupId) &&
        Objects.equals(this.adGroupName, adGroupRetargetingList.adGroupName) &&
        Objects.equals(this.bidMultiplier, adGroupRetargetingList.bidMultiplier) &&
        Objects.equals(this.campaignId, adGroupRetargetingList.campaignId) &&
        Objects.equals(this.campaignName, adGroupRetargetingList.campaignName) &&
        Objects.equals(this.criterionTargetList, adGroupRetargetingList.criterionTargetList) &&
        Objects.equals(this.excludedType, adGroupRetargetingList.excludedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, adGroupName, bidMultiplier, campaignId, campaignName, criterionTargetList, excludedType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupRetargetingList {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adGroupName: ").append(toIndentedString(adGroupName)).append("\n");
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

