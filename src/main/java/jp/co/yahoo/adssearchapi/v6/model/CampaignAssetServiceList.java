package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.CampaignAsset;
import jp.co.yahoo.adssearchapi.v6.model.CampaignAssetServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignAssetServiceListオブジェクトは、キャンペーンとアセット間の設定情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignAssetServiceList object describes configuration information between campaign and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignAssetServiceListオブジェクトは、キャンペーンとアセット間の設定情報を表します。</div> <div lang=\"en\">CampaignAssetServiceList object describes configuration information between campaign and assets.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignAssetServiceList   {
  @JsonProperty("campaignAssets")
  @Valid
  private List<CampaignAsset> campaignAssets = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("type")
  private CampaignAssetServiceType type = null;

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CampaignAsset> getCampaignAssets() {
    return campaignAssets;
  }

  public void setCampaignAssets(List<CampaignAsset> campaignAssets) {
    this.campaignAssets = campaignAssets;
  }

  public CampaignAssetServiceList campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> REPLACE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in REPLACE operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> REPLACE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in REPLACE operation.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignAssetServiceType getType() {
    return type;
  }

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

