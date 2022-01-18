package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupAsset;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupAssetServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAssetServiceListオブジェクトは、広告グループとアセット間の設定情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAssetServiceList object describes configuration information between ad groups and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAssetServiceListオブジェクトは、広告グループとアセット間の設定情報を表します。</div> <div lang=\"en\">AdGroupAssetServiceList object describes configuration information between ad groups and assets.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAssetServiceList   {
  @JsonProperty("adGroupAssets")
  @Valid
  private List<AdGroupAsset> adGroupAssets = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("type")
  private AdGroupAssetServiceType type = null;

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupAsset> getAdGroupAssets() {
    return adGroupAssets;
  }

  public void setAdGroupAssets(List<AdGroupAsset> adGroupAssets) {
    this.adGroupAssets = adGroupAssets;
  }

  public AdGroupAssetServiceList adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> REPLACE時、このフィールドは必須となります。</div> <div lang=\"en\">Ad Group ID.<br> This field is required in REPLACE operation.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> REPLACE時、このフィールドは必須となります。</div> <div lang=\"en\">Ad Group ID.<br> This field is required in REPLACE operation.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupAssetServiceList campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> REPLACE時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in REPLACE operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> REPLACE時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in REPLACE operation.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAssetServiceType getType() {
    return type;
  }

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

