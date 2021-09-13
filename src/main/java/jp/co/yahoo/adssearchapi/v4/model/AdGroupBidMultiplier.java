package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupBidMultiplierServicePlatformType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupBidMultiplierオブジェクトは、入札価格調整率を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Container for bid multiplier.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupBidMultiplierオブジェクトは、入札価格調整率を表します。</div> <div lang=\"en\">Container for bid multiplier.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupBidMultiplier   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("bidMultiplier")
  private Double bidMultiplier = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("platformType")
  private AdGroupBidMultiplierServicePlatformType platformType = null;

  public AdGroupBidMultiplier accountId(Long accountId) {
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

  public AdGroupBidMultiplier adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in SET and REMOVE operation.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in SET and REMOVE operation.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupBidMultiplier bidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格調整率です。0～10.00まで指定できます。0を指定した場合、広告は配信されません。<br> また、入札価格調整率の値は小数点第二位まで指定可能です。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Bid adjustment rate.<br> Can be specified between  0 to 10.00.<br> When specified &#39;0&#39;, the ad will not be delivered.<br> Bid adjustment rate can be specified up to two decimal places.<br> This field is required in SET operation.</div> 
   * @return bidMultiplier
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格調整率です。0～10.00まで指定できます。0を指定した場合、広告は配信されません。<br> また、入札価格調整率の値は小数点第二位まで指定可能です。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Bid adjustment rate.<br> Can be specified between  0 to 10.00.<br> When specified &#39;0&#39;, the ad will not be delivered.<br> Bid adjustment rate can be specified up to two decimal places.<br> This field is required in SET operation.</div> ")


  public Double getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public AdGroupBidMultiplier campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET and REMOVE operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET and REMOVE operation.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupBidMultiplier platformType(AdGroupBidMultiplierServicePlatformType platformType) {
    this.platformType = platformType;
    return this;
  }

  /**
   * Get platformType
   * @return platformType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupBidMultiplierServicePlatformType getPlatformType() {
    return platformType;
  }

  public void setPlatformType(AdGroupBidMultiplierServicePlatformType platformType) {
    this.platformType = platformType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupBidMultiplier adGroupBidMultiplier = (AdGroupBidMultiplier) o;
    return Objects.equals(this.accountId, adGroupBidMultiplier.accountId) &&
        Objects.equals(this.adGroupId, adGroupBidMultiplier.adGroupId) &&
        Objects.equals(this.bidMultiplier, adGroupBidMultiplier.bidMultiplier) &&
        Objects.equals(this.campaignId, adGroupBidMultiplier.campaignId) &&
        Objects.equals(this.platformType, adGroupBidMultiplier.platformType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, bidMultiplier, campaignId, platformType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupBidMultiplier {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
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

