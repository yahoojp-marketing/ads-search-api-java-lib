package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.CampaignTargetServiceTarget;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetオブジェクトは、キャンペーンの各種ターゲティング設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTarget describes each type of targeting setting of Campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetオブジェクトは、キャンペーンの各種ターゲティング設定を表します。</div> <div lang=\"en\">CampaignTarget describes each type of targeting setting of Campaign.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignTarget   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("bidMultiplier")
  private Double bidMultiplier = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("target")
  private CampaignTargetServiceTarget target = null;

  public CampaignTarget accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required in any cases.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required in any cases.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignTarget bidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

  /**
   * <div lang=\"ja\">   入札価格調整率です。0.10～10.00まで指定できます。<br>   0を指定した場合、広告は配信されません。<br>   また、入札価格調整率の値は小数点第二位まで指定可能です。<br>   このフィールドは省略可能となります。その際、デフォルト設定値は1.0となります。 </div> <div lang=\"en\">   Bid adjustment rate.<br>   Can be specified between  0.10 to 10.00.<br>   When specified &#39;0&#39;, the ad will not be delivered.<br>   Bid adjustment rate can be specified up to two decimal places.<br>   This field is optional. The default value will be 1.0. </div> 
   * @return bidMultiplier
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   入札価格調整率です。0.10～10.00まで指定できます。<br>   0を指定した場合、広告は配信されません。<br>   また、入札価格調整率の値は小数点第二位まで指定可能です。<br>   このフィールドは省略可能となります。その際、デフォルト設定値は1.0となります。 </div> <div lang=\"en\">   Bid adjustment rate.<br>   Can be specified between  0.10 to 10.00.<br>   When specified &#39;0&#39;, the ad will not be delivered.<br>   Bid adjustment rate can be specified up to two decimal places.<br>   This field is optional. The default value will be 1.0. </div> ")


  public Double getBidMultiplier() {
    return bidMultiplier;
  }

  public void setBidMultiplier(Double bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  public CampaignTarget campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignTarget campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign Name.</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign Name.</div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignTarget target(CampaignTargetServiceTarget target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignTargetServiceTarget getTarget() {
    return target;
  }

  public void setTarget(CampaignTargetServiceTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTarget campaignTarget = (CampaignTarget) o;
    return Objects.equals(this.accountId, campaignTarget.accountId) &&
        Objects.equals(this.bidMultiplier, campaignTarget.bidMultiplier) &&
        Objects.equals(this.campaignId, campaignTarget.campaignId) &&
        Objects.equals(this.campaignName, campaignTarget.campaignName) &&
        Objects.equals(this.target, campaignTarget.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bidMultiplier, campaignId, campaignName, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTarget {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

