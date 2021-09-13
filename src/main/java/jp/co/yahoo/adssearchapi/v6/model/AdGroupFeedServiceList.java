package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupFeed;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupFeedServicePlaceholderType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupFeedServiceListオブジェクトは、広告グループに関連付けられたFeedItem情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupFeedServiceList object describes the FeedItem information connected to ad group.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupFeedServiceListオブジェクトは、広告グループに関連付けられたFeedItem情報を表します。</div> <div lang=\"en\">AdGroupFeedServiceList object describes the FeedItem information connected to ad group.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupFeedServiceList   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adGroupFeed")
  @Valid
  private List<AdGroupFeed> adGroupFeed = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("placeholderType")
  private AdGroupFeedServicePlaceholderType placeholderType = null;

  public AdGroupFeedServiceList accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required in SET operation.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required in SET operation.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdGroupFeedServiceList adGroupFeed(List<AdGroupFeed> adGroupFeed) {
    this.adGroupFeed = adGroupFeed;
    return this;
  }

  public AdGroupFeedServiceList addAdGroupFeedItem(AdGroupFeed adGroupFeedItem) {
    if (this.adGroupFeed == null) {
      this.adGroupFeed = new ArrayList<>();
    }
    this.adGroupFeed.add(adGroupFeedItem);
    return this;
  }

  /**
   * Get adGroupFeed
   * @return adGroupFeed
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupFeed> getAdGroupFeed() {
    return adGroupFeed;
  }

  public void setAdGroupFeed(List<AdGroupFeed> adGroupFeed) {
    this.adGroupFeed = adGroupFeed;
  }

  public AdGroupFeedServiceList adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Ad Group ID.<br> This field is required in SET operation.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Ad Group ID.<br> This field is required in SET operation.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupFeedServiceList campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in SET operation.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupFeedServiceList placeholderType(AdGroupFeedServicePlaceholderType placeholderType) {
    this.placeholderType = placeholderType;
    return this;
  }

  /**
   * Get placeholderType
   * @return placeholderType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupFeedServicePlaceholderType getPlaceholderType() {
    return placeholderType;
  }

  public void setPlaceholderType(AdGroupFeedServicePlaceholderType placeholderType) {
    this.placeholderType = placeholderType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupFeedServiceList adGroupFeedServiceList = (AdGroupFeedServiceList) o;
    return Objects.equals(this.accountId, adGroupFeedServiceList.accountId) &&
        Objects.equals(this.adGroupFeed, adGroupFeedServiceList.adGroupFeed) &&
        Objects.equals(this.adGroupId, adGroupFeedServiceList.adGroupId) &&
        Objects.equals(this.campaignId, adGroupFeedServiceList.campaignId) &&
        Objects.equals(this.placeholderType, adGroupFeedServiceList.placeholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupFeed, adGroupId, campaignId, placeholderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupFeedServiceList {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupFeed: ").append(toIndentedString(adGroupFeed)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    placeholderType: ").append(toIndentedString(placeholderType)).append("\n");
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

