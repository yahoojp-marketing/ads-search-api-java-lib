package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceCallAsset;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceCalloutAsset;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceQuickLinkAsset;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceStructuredSnippetAsset;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceAssetDataオブジェクトは、アセットの詳細情報を格納します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceAssetData object contains the details of Asset.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceAssetDataオブジェクトは、アセットの詳細情報を格納します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">AssetServiceAssetData object contains the details of Asset.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AssetServiceAssetData   {
  @JsonProperty("type")
  private AssetServiceType type = null;

  @JsonProperty("quickLinkAsset")
  private AssetServiceQuickLinkAsset quickLinkAsset = null;

  @JsonProperty("callAsset")
  private AssetServiceCallAsset callAsset = null;

  @JsonProperty("calloutAsset")
  private AssetServiceCalloutAsset calloutAsset = null;

  @JsonProperty("structuredSnippetAsset")
  private AssetServiceStructuredSnippetAsset structuredSnippetAsset = null;

  public AssetServiceAssetData type(AssetServiceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceType getType() {
    return type;
  }

  public void setType(AssetServiceType type) {
    this.type = type;
  }

  public AssetServiceAssetData quickLinkAsset(AssetServiceQuickLinkAsset quickLinkAsset) {
    this.quickLinkAsset = quickLinkAsset;
    return this;
  }

  /**
   * Get quickLinkAsset
   * @return quickLinkAsset
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceQuickLinkAsset getQuickLinkAsset() {
    return quickLinkAsset;
  }

  public void setQuickLinkAsset(AssetServiceQuickLinkAsset quickLinkAsset) {
    this.quickLinkAsset = quickLinkAsset;
  }

  public AssetServiceAssetData callAsset(AssetServiceCallAsset callAsset) {
    this.callAsset = callAsset;
    return this;
  }

  /**
   * Get callAsset
   * @return callAsset
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceCallAsset getCallAsset() {
    return callAsset;
  }

  public void setCallAsset(AssetServiceCallAsset callAsset) {
    this.callAsset = callAsset;
  }

  public AssetServiceAssetData calloutAsset(AssetServiceCalloutAsset calloutAsset) {
    this.calloutAsset = calloutAsset;
    return this;
  }

  /**
   * Get calloutAsset
   * @return calloutAsset
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceCalloutAsset getCalloutAsset() {
    return calloutAsset;
  }

  public void setCalloutAsset(AssetServiceCalloutAsset calloutAsset) {
    this.calloutAsset = calloutAsset;
  }

  public AssetServiceAssetData structuredSnippetAsset(AssetServiceStructuredSnippetAsset structuredSnippetAsset) {
    this.structuredSnippetAsset = structuredSnippetAsset;
    return this;
  }

  /**
   * Get structuredSnippetAsset
   * @return structuredSnippetAsset
  */
  @ApiModelProperty(value = "")

  @Valid

  public AssetServiceStructuredSnippetAsset getStructuredSnippetAsset() {
    return structuredSnippetAsset;
  }

  public void setStructuredSnippetAsset(AssetServiceStructuredSnippetAsset structuredSnippetAsset) {
    this.structuredSnippetAsset = structuredSnippetAsset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetServiceAssetData assetServiceAssetData = (AssetServiceAssetData) o;
    return Objects.equals(this.type, assetServiceAssetData.type) &&
        Objects.equals(this.quickLinkAsset, assetServiceAssetData.quickLinkAsset) &&
        Objects.equals(this.callAsset, assetServiceAssetData.callAsset) &&
        Objects.equals(this.calloutAsset, assetServiceAssetData.calloutAsset) &&
        Objects.equals(this.structuredSnippetAsset, assetServiceAssetData.structuredSnippetAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, quickLinkAsset, callAsset, calloutAsset, structuredSnippetAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceAssetData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quickLinkAsset: ").append(toIndentedString(quickLinkAsset)).append("\n");
    sb.append("    callAsset: ").append(toIndentedString(callAsset)).append("\n");
    sb.append("    calloutAsset: ").append(toIndentedString(calloutAsset)).append("\n");
    sb.append("    structuredSnippetAsset: ").append(toIndentedString(structuredSnippetAsset)).append("\n");
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

