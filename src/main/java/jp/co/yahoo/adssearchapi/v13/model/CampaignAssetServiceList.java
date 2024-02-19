/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

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
import jp.co.yahoo.adssearchapi.v13.model.CampaignAsset;
import jp.co.yahoo.adssearchapi.v13.model.CampaignAssetServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignAssetServiceListオブジェクトは、キャンペーンとアセット間の設定情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignAssetServiceList object describes configuration information between campaign and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignAssetServiceListオブジェクトは、キャンペーンとアセット間の設定情報を表します。</div> <div lang=\"en\">CampaignAssetServiceList object describes configuration information between campaign and assets.</div> ")
@JsonPropertyOrder({
  CampaignAssetServiceList.JSON_PROPERTY_CAMPAIGN_ASSETS,
  CampaignAssetServiceList.JSON_PROPERTY_CAMPAIGN_ID,
  CampaignAssetServiceList.JSON_PROPERTY_TYPE
})
@JsonTypeName("CampaignAssetServiceList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignAssetServiceList {
  public static final String JSON_PROPERTY_CAMPAIGN_ASSETS = "campaignAssets";
  private List<CampaignAsset> campaignAssets = null;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CampaignAssetServiceType type;

  public CampaignAssetServiceList() { 
  }

  public CampaignAssetServiceList campaignAssets(List<CampaignAsset> campaignAssets) {
    
    this.campaignAssets = campaignAssets;
    return this;
  }

  public CampaignAssetServiceList addCampaignAssetsItem(CampaignAsset campaignAssetsItem) {
    if (this.campaignAssets == null) {
      this.campaignAssets = new ArrayList<>();
    }
    this.campaignAssets.add(campaignAssetsItem);
    return this;
  }

   /**
   * Get campaignAssets
   * @return campaignAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignAsset> getCampaignAssets() {
    return campaignAssets;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignAssets(List<CampaignAsset> campaignAssets) {
    this.campaignAssets = campaignAssets;
  }


  public CampaignAssetServiceList campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; REPLACE時、このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in REPLACE operation.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> REPLACE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in REPLACE operation.</div> ")
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


  public CampaignAssetServiceList type(CampaignAssetServiceType type) {
    
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

  public CampaignAssetServiceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(CampaignAssetServiceType type) {
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
    CampaignAssetServiceList campaignAssetServiceList = (CampaignAssetServiceList) o;
    return Objects.equals(this.campaignAssets, campaignAssetServiceList.campaignAssets) &&
        Objects.equals(this.campaignId, campaignAssetServiceList.campaignId) &&
        Objects.equals(this.type, campaignAssetServiceList.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignAssets, campaignId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAssetServiceList {\n");
    sb.append("    campaignAssets: ").append(toIndentedString(campaignAssets)).append("\n");
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

