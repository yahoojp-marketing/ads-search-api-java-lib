package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceSetTrademarkStatusオブジェクトは、広告の情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceSetTrademarkStatus object holds ads information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceSetTrademarkStatusオブジェクトは、広告の情報を格納します。</div> <div lang=\"en\">AdGroupAdServiceSetTrademarkStatus object holds ads information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceSetTrademarkStatus   {
  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("adId")
  private Long adId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  public AdGroupAdServiceSetTrademarkStatus adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupAdServiceSetTrademarkStatus adId(Long adId) {
    this.adId = adId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告IDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Ad ID.<br> This field is required.</div> 
   * @return adId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告IDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Ad ID.<br> This field is required.</div> ")


  public Long getAdId() {
    return adId;
  }

  public void setAdId(Long adId) {
    this.adId = adId;
  }

  public AdGroupAdServiceSetTrademarkStatus campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceSetTrademarkStatus adGroupAdServiceSetTrademarkStatus = (AdGroupAdServiceSetTrademarkStatus) o;
    return Objects.equals(this.adGroupId, adGroupAdServiceSetTrademarkStatus.adGroupId) &&
        Objects.equals(this.adId, adGroupAdServiceSetTrademarkStatus.adId) &&
        Objects.equals(this.campaignId, adGroupAdServiceSetTrademarkStatus.campaignId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, adId, campaignId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceSetTrademarkStatus {\n");
    
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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

