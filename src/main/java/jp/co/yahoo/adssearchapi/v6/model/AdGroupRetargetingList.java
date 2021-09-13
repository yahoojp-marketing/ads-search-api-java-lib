package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupRetargetingListServiceCriterionTargetList;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupRetargetingListServiceExcludedType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupRetargetingListは、広告グループレベルでのターゲットリスト設定を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupRetargetingList is an object that holds ad group user list information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupRetargetingListは、広告グループレベルでのターゲットリスト設定を保持するオブジェクトです。</div> <div lang=\"en\">AdGroupRetargetingList is an object that holds ad group user list information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupRetargetingList   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("adGroupName")
  private String adGroupName = null;

  @JsonProperty("bidMultiplier")
  private Double bidMultiplier = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("criterionTargetList")
  private AdGroupRetargetingListServiceCriterionTargetList criterionTargetList = null;

  @JsonProperty("excludedType")
  private AdGroupRetargetingListServiceExcludedType excludedType = null;

  public AdGroupRetargetingList accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdGroupRetargetingList adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupRetargetingList adGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad group name.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return adGroupName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Ad group name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getAdGroupName() {
    return adGroupName;
  }

  public void setAdGroupName(String adGroupName) {
    this.adGroupName = adGroupName;
  }

  public AdGroupRetargetingList bidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

  /**
   * <div lang=\"ja\">   MaxCPC上昇値です。<br>   0.10～10.00まで指定できます。<br>   また、0を指定した場合、広告は配信されません。<br>   MaxCPC上昇値の値は小数点第二位まで指定可能です。<br>   このフィールドは省略可能となります。その際、デフォルト設定値は1.0となります。 </div> <div lang=\"en\">   Maximum CPC increase value.<br>   Can be specified between  0.10 to 10.00.<br>   When specified &#39;0&#39;, the ad will not be delivered.<br>   Maximum CPC increase value can be specified up to two decimal places.<br>   This field is optional. The default value will be 1.0. </div> 
   * @return bidMultiplier
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   MaxCPC上昇値です。<br>   0.10～10.00まで指定できます。<br>   また、0を指定した場合、広告は配信されません。<br>   MaxCPC上昇値の値は小数点第二位まで指定可能です。<br>   このフィールドは省略可能となります。その際、デフォルト設定値は1.0となります。 </div> <div lang=\"en\">   Maximum CPC increase value.<br>   Can be specified between  0.10 to 10.00.<br>   When specified &#39;0&#39;, the ad will not be delivered.<br>   Maximum CPC increase value can be specified up to two decimal places.<br>   This field is optional. The default value will be 1.0. </div> ")


  public Double getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public AdGroupRetargetingList campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupRetargetingList campaignName(String campaignName) {
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

  public AdGroupRetargetingList criterionTargetList(AdGroupRetargetingListServiceCriterionTargetList criterionTargetList) {
    this.criterionTargetList = criterionTargetList;
    return this;
  }

  /**
   * Get criterionTargetList
   * @return criterionTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupRetargetingListServiceCriterionTargetList getCriterionTargetList() {
    return criterionTargetList;
  }

  public void setCriterionTargetList(AdGroupRetargetingListServiceCriterionTargetList criterionTargetList) {
    this.criterionTargetList = criterionTargetList;
  }

  public AdGroupRetargetingList excludedType(AdGroupRetargetingListServiceExcludedType excludedType) {
    this.excludedType = excludedType;
    return this;
  }

  /**
   * Get excludedType
   * @return excludedType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupRetargetingListServiceExcludedType getExcludedType() {
    return excludedType;
  }

  public void setExcludedType(AdGroupRetargetingListServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

