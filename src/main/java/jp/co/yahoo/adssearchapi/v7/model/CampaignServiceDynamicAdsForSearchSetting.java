/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.CampaignServiceDasUseUrlsType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   CampaignServiceDynamicAdsForSearchSettingは、動的検索連動型広告に関する検索条件を表します。&lt;br&gt;   ADD時、settingTypeがDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、必須となり、それ以外では省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   CampaignServiceDynamicAdsForSearchSetting displays search condition for Dynamic ads for search.&lt;br&gt;   This field is optional. However, in ADD operation, this field is required only when settingType is &#39;DYNAMIC_ADS_FOR_SEARCH_SETTING&#39;, and it is optional when settingType is the others. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">   CampaignServiceDynamicAdsForSearchSettingは、動的検索連動型広告に関する検索条件を表します。<br>   ADD時、settingTypeがDYNAMIC_ADS_FOR_SEARCH_SETTINGの場合、必須となり、それ以外では省略可能となります。 </div> <div lang=\"en\">   CampaignServiceDynamicAdsForSearchSetting displays search condition for Dynamic ads for search.<br>   This field is optional. However, in ADD operation, this field is required only when settingType is 'DYNAMIC_ADS_FOR_SEARCH_SETTING', and it is optional when settingType is the others. </div> ")
@JsonPropertyOrder({
  CampaignServiceDynamicAdsForSearchSetting.JSON_PROPERTY_FEED_IDS,
  CampaignServiceDynamicAdsForSearchSetting.JSON_PROPERTY_DOMAIN,
  CampaignServiceDynamicAdsForSearchSetting.JSON_PROPERTY_DAS_USE_URLS_TYPE
})
@JsonTypeName("CampaignServiceDynamicAdsForSearchSetting")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceDynamicAdsForSearchSetting {
  public static final String JSON_PROPERTY_FEED_IDS = "feedIds";
  private List<Long> feedIds = null;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_DAS_USE_URLS_TYPE = "dasUseUrlsType";
  private CampaignServiceDasUseUrlsType dasUseUrlsType;

  public CampaignServiceDynamicAdsForSearchSetting() { 
  }

  public CampaignServiceDynamicAdsForSearchSetting feedIds(List<Long> feedIds) {
    
    this.feedIds = feedIds;
    return this;
  }

  public CampaignServiceDynamicAdsForSearchSetting addFeedIdsItem(Long feedIdsItem) {
    if (this.feedIds == null) {
      this.feedIds = new ArrayList<>();
    }
    this.feedIds.add(feedIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   キャンペーンで使用するページフィードIDです。&lt;br&gt;   ADD時およびSET時、DasUseUrlsTypeがUSE_SUPPLIED_URLS_ONLYまたはDOMAIN_AND_SUPPLIED_URLSの場合、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Page Feed ID for campaign.&lt;br&gt;   If DasUseUrlsType is USE_SUPPLIED_URLS_ONLY or DOMAIN_AND_SUPPLIED_URLS, this field is required in ADD and SET operation. &lt;/div&gt; 
   * @return feedIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">   キャンペーンで使用するページフィードIDです。<br>   ADD時およびSET時、DasUseUrlsTypeがUSE_SUPPLIED_URLS_ONLYまたはDOMAIN_AND_SUPPLIED_URLSの場合、このフィールドは必須となります。 </div> <div lang=\"en\">   Page Feed ID for campaign.<br>   If DasUseUrlsType is USE_SUPPLIED_URLS_ONLY or DOMAIN_AND_SUPPLIED_URLS, this field is required in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getFeedIds() {
    return feedIds;
  }


  @JsonProperty(JSON_PROPERTY_FEED_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedIds(List<Long> feedIds) {
    this.feedIds = feedIds;
  }


  public CampaignServiceDynamicAdsForSearchSetting domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   ドメインです。&lt;br&gt;   ADDおよびSET時、DasUseUrlsTypeがTOP_DOMAIN_ONLYまたはDOMAIN_AND_SUPPLIED_URLSの場合、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   Domain.&lt;br&gt;   If DasUseUrlsType is TOP_DOMAIN_ONLY or DOMAIN_AND_SUPPLIED_URLS, this field is required in ADD and SET operation. &lt;/div&gt; 
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">   ドメインです。<br>   ADDおよびSET時、DasUseUrlsTypeがTOP_DOMAIN_ONLYまたはDOMAIN_AND_SUPPLIED_URLSの場合、このフィールドは必須となります。 </div> <div lang=\"en\">   Domain.<br>   If DasUseUrlsType is TOP_DOMAIN_ONLY or DOMAIN_AND_SUPPLIED_URLS, this field is required in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public CampaignServiceDynamicAdsForSearchSetting dasUseUrlsType(CampaignServiceDasUseUrlsType dasUseUrlsType) {
    
    this.dasUseUrlsType = dasUseUrlsType;
    return this;
  }

   /**
   * Get dasUseUrlsType
   * @return dasUseUrlsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAS_USE_URLS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceDasUseUrlsType getDasUseUrlsType() {
    return dasUseUrlsType;
  }


  @JsonProperty(JSON_PROPERTY_DAS_USE_URLS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDasUseUrlsType(CampaignServiceDasUseUrlsType dasUseUrlsType) {
    this.dasUseUrlsType = dasUseUrlsType;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

