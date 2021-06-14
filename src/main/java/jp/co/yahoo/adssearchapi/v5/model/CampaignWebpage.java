package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignWebpageServiceWebpage;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignWebpageオブジェクトは、キャンペーンに関連付けた除外設定の情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignWebpage object contains information of excluded settings setup to campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignWebpageオブジェクトは、キャンペーンに関連付けた除外設定の情報を保持します。</div> <div lang=\"en\">CampaignWebpage object contains information of excluded settings setup to campaign.</div> ")

public class CampaignWebpage   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignTrackId")
  private JsonNullable<Long> campaignTrackId = JsonNullable.undefined();

  @JsonProperty("webpage")
  private JsonNullable<CampaignWebpageServiceWebpage> webpage = JsonNullable.undefined();

  public CampaignWebpage accountId(Long accountId) {
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

  public CampaignWebpage campaignId(Long campaignId) {
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

  public CampaignWebpage campaignTrackId(Long campaignTrackId) {
    this.campaignTrackId = JsonNullable.of(campaignTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーントラッキングIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign Tracking ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return campaignTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーントラッキングIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign Tracking ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getCampaignTrackId() {
    return campaignTrackId;
  }

  public void setCampaignTrackId(JsonNullable<Long> campaignTrackId) {
    this.campaignTrackId = campaignTrackId;
  }

  public CampaignWebpage webpage(CampaignWebpageServiceWebpage webpage) {
    this.webpage = JsonNullable.of(webpage);
    return this;
  }

  /**
   * Get webpage
   * @return webpage
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignWebpageServiceWebpage> getWebpage() {
    return webpage;
  }

  public void setWebpage(JsonNullable<CampaignWebpageServiceWebpage> webpage) {
    this.webpage = webpage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignWebpage campaignWebpage = (CampaignWebpage) o;
    return Objects.equals(this.accountId, campaignWebpage.accountId) &&
        Objects.equals(this.campaignId, campaignWebpage.campaignId) &&
        Objects.equals(this.campaignTrackId, campaignWebpage.campaignTrackId) &&
        Objects.equals(this.webpage, campaignWebpage.webpage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, campaignTrackId, webpage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignWebpage {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignTrackId: ").append(toIndentedString(campaignTrackId)).append("\n");
    sb.append("    webpage: ").append(toIndentedString(webpage)).append("\n");
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

