package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceDasUseUrlsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   CampaignServiceDynamicAdsForSearchSettingは、動的検索連動型広告に関する検索条件を表します。&lt;br&gt;   ADD時、settingTypeがDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、必須となり、それ以外では省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   CampaignServiceDynamicAdsForSearchSetting displays search condition for Dynamic ads for search.&lt;br&gt;   This field is optional. However, in ADD operation, this field is required only when settingType is &#39;DYNAMIC_ADS_FOR_SEARCH_SETTING&#39;, and it is optional when settingType is the others. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   CampaignServiceDynamicAdsForSearchSettingは、動的検索連動型広告に関する検索条件を表します。<br>   ADD時、settingTypeがDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、必須となり、それ以外では省略可能となります。 </div> <div lang=\"en\">   CampaignServiceDynamicAdsForSearchSetting displays search condition for Dynamic ads for search.<br>   This field is optional. However, in ADD operation, this field is required only when settingType is 'DYNAMIC_ADS_FOR_SEARCH_SETTING', and it is optional when settingType is the others. </div> ")

public class CampaignServiceDynamicAdsForSearchSetting   {
  @JsonProperty("feedIds")
  @Valid
  private JsonNullable<List<Long>> feedIds = JsonNullable.undefined();

  @JsonProperty("domain")
  private JsonNullable<String> domain = JsonNullable.undefined();

  @JsonProperty("dasUseUrlsType")
  private JsonNullable<CampaignServiceDasUseUrlsType> dasUseUrlsType = JsonNullable.undefined();

  public CampaignServiceDynamicAdsForSearchSetting feedIds(List<Long> feedIds) {
    this.feedIds = JsonNullable.of(feedIds);
    return this;
  }

  public CampaignServiceDynamicAdsForSearchSetting addFeedIdsItem(Long feedIdsItem) {
    if (this.feedIds == null || !this.feedIds.isPresent()) {
      this.feedIds = JsonNullable.of(new ArrayList<>());
    }
    this.feedIds.get().add(feedIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">   キャンペーンで使用するページフィードIDです。<br>   ADD時およびSET時、DasUseUrlsTypeがUSE_SUPPLIED_URLS_ONLYまたはDOMAIN_AND_SUPPLIED_URLSの場合、このフィールドは必須となります。 </div> <div lang=\"en\">   Page Feed ID for campaign.<br>   If DasUseUrlsType is USE_SUPPLIED_URLS_ONLY or DOMAIN_AND_SUPPLIED_URLS, this field is required in ADD and SET operation. </div> 
   * @return feedIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   キャンペーンで使用するページフィードIDです。<br>   ADD時およびSET時、DasUseUrlsTypeがUSE_SUPPLIED_URLS_ONLYまたはDOMAIN_AND_SUPPLIED_URLSの場合、このフィールドは必須となります。 </div> <div lang=\"en\">   Page Feed ID for campaign.<br>   If DasUseUrlsType is USE_SUPPLIED_URLS_ONLY or DOMAIN_AND_SUPPLIED_URLS, this field is required in ADD and SET operation. </div> ")


  public JsonNullable<List<Long>> getFeedIds() {
    return feedIds;
  }

  public void setFeedIds(JsonNullable<List<Long>> feedIds) {
    this.feedIds = feedIds;
  }

  public CampaignServiceDynamicAdsForSearchSetting domain(String domain) {
    this.domain = JsonNullable.of(domain);
    return this;
  }

  /**
   * <div lang=\"ja\">   ドメインです。<br>   ADDおよびSET時、DasUseUrlsTypeがTOP_DOMAIN_ONLYまたはDOMAIN_AND_SUPPLIED_URLSの場合、このフィールドは必須となります。 </div> <div lang=\"en\">   Domain.<br>   If DasUseUrlsType is TOP_DOMAIN_ONLY or DOMAIN_AND_SUPPLIED_URLS, this field is required in ADD and SET operation. </div> 
   * @return domain
  */
  @ApiModelProperty(value = "<div lang=\"ja\">   ドメインです。<br>   ADDおよびSET時、DasUseUrlsTypeがTOP_DOMAIN_ONLYまたはDOMAIN_AND_SUPPLIED_URLSの場合、このフィールドは必須となります。 </div> <div lang=\"en\">   Domain.<br>   If DasUseUrlsType is TOP_DOMAIN_ONLY or DOMAIN_AND_SUPPLIED_URLS, this field is required in ADD and SET operation. </div> ")


  public JsonNullable<String> getDomain() {
    return domain;
  }

  public void setDomain(JsonNullable<String> domain) {
    this.domain = domain;
  }

  public CampaignServiceDynamicAdsForSearchSetting dasUseUrlsType(CampaignServiceDasUseUrlsType dasUseUrlsType) {
    this.dasUseUrlsType = JsonNullable.of(dasUseUrlsType);
    return this;
  }

  /**
   * Get dasUseUrlsType
   * @return dasUseUrlsType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceDasUseUrlsType> getDasUseUrlsType() {
    return dasUseUrlsType;
  }

  public void setDasUseUrlsType(JsonNullable<CampaignServiceDasUseUrlsType> dasUseUrlsType) {
    this.dasUseUrlsType = dasUseUrlsType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceDynamicAdsForSearchSetting campaignServiceDynamicAdsForSearchSetting = (CampaignServiceDynamicAdsForSearchSetting) o;
    return Objects.equals(this.feedIds, campaignServiceDynamicAdsForSearchSetting.feedIds) &&
        Objects.equals(this.domain, campaignServiceDynamicAdsForSearchSetting.domain) &&
        Objects.equals(this.dasUseUrlsType, campaignServiceDynamicAdsForSearchSetting.dasUseUrlsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedIds, domain, dasUseUrlsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceDynamicAdsForSearchSetting {\n");
    
    sb.append("    feedIds: ").append(toIndentedString(feedIds)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    dasUseUrlsType: ").append(toIndentedString(dasUseUrlsType)).append("\n");
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

