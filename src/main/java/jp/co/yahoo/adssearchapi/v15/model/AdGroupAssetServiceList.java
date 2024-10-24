/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

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
import jp.co.yahoo.adssearchapi.v15.model.AdGroupAsset;
import jp.co.yahoo.adssearchapi.v15.model.AdGroupAssetServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAssetServiceListオブジェクトは、広告グループとアセット間の設定情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAssetServiceList object describes configuration information between ad groups and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAssetServiceListオブジェクトは、広告グループとアセット間の設定情報を表します。</div> <div lang=\"en\">AdGroupAssetServiceList object describes configuration information between ad groups and assets.</div> ")
@JsonPropertyOrder({
  AdGroupAssetServiceList.JSON_PROPERTY_AD_GROUP_ASSETS,
  AdGroupAssetServiceList.JSON_PROPERTY_AD_GROUP_ID,
  AdGroupAssetServiceList.JSON_PROPERTY_CAMPAIGN_ID,
  AdGroupAssetServiceList.JSON_PROPERTY_TYPE
})
@JsonTypeName("AdGroupAssetServiceList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAssetServiceList {
  public static final String JSON_PROPERTY_AD_GROUP_ASSETS = "adGroupAssets";
  private List<AdGroupAsset> adGroupAssets = null;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AdGroupAssetServiceType type;

  public AdGroupAssetServiceList() { 
  }

  public AdGroupAssetServiceList adGroupAssets(List<AdGroupAsset> adGroupAssets) {
    
    this.adGroupAssets = adGroupAssets;
    return this;
  }

  public AdGroupAssetServiceList addAdGroupAssetsItem(AdGroupAsset adGroupAssetsItem) {
    if (this.adGroupAssets == null) {
      this.adGroupAssets = new ArrayList<>();
    }
    this.adGroupAssets.add(adGroupAssetsItem);
    return this;
  }

   /**
   * Get adGroupAssets
   * @return adGroupAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdGroupAsset> getAdGroupAssets() {
    return adGroupAssets;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupAssets(List<AdGroupAsset> adGroupAssets) {
    this.adGroupAssets = adGroupAssets;
  }


  public AdGroupAssetServiceList adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループIDです。&lt;br&gt; REPLACE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Ad group ID.&lt;br&gt; This field is required in REPLACE operation.&lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> REPLACE時、このフィールドは必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in REPLACE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupId() {
    return adGroupId;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }


  public AdGroupAssetServiceList campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; REPLACE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in REPLACE operation.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> REPLACE時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in REPLACE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public AdGroupAssetServiceList type(AdGroupAssetServiceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAssetServiceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(AdGroupAssetServiceType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAssetServiceList adGroupAssetServiceList = (AdGroupAssetServiceList) o;
    return Objects.equals(this.adGroupAssets, adGroupAssetServiceList.adGroupAssets) &&
        Objects.equals(this.adGroupId, adGroupAssetServiceList.adGroupId) &&
        Objects.equals(this.campaignId, adGroupAssetServiceList.campaignId) &&
        Objects.equals(this.type, adGroupAssetServiceList.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupAssets, adGroupId, campaignId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAssetServiceList {\n");
    sb.append("    adGroupAssets: ").append(toIndentedString(adGroupAssets)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

