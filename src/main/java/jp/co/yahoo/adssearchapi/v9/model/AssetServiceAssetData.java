/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v9.model.AssetServiceCallAsset;
import jp.co.yahoo.adssearchapi.v9.model.AssetServiceCalloutAsset;
import jp.co.yahoo.adssearchapi.v9.model.AssetServiceQuickLinkAsset;
import jp.co.yahoo.adssearchapi.v9.model.AssetServiceStructuredSnippetAsset;
import jp.co.yahoo.adssearchapi.v9.model.AssetServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceAssetDataオブジェクトは、アセットの詳細情報を格納します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceAssetData object contains the details of Asset.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceAssetDataオブジェクトは、アセットの詳細情報を格納します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">AssetServiceAssetData object contains the details of Asset.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
@JsonPropertyOrder({
  AssetServiceAssetData.JSON_PROPERTY_TYPE,
  AssetServiceAssetData.JSON_PROPERTY_QUICK_LINK_ASSET,
  AssetServiceAssetData.JSON_PROPERTY_CALL_ASSET,
  AssetServiceAssetData.JSON_PROPERTY_CALLOUT_ASSET,
  AssetServiceAssetData.JSON_PROPERTY_STRUCTURED_SNIPPET_ASSET
})
@JsonTypeName("AssetServiceAssetData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetServiceAssetData {
  public static final String JSON_PROPERTY_TYPE = "type";
  private AssetServiceType type;

  public static final String JSON_PROPERTY_QUICK_LINK_ASSET = "quickLinkAsset";
  private AssetServiceQuickLinkAsset quickLinkAsset;

  public static final String JSON_PROPERTY_CALL_ASSET = "callAsset";
  private AssetServiceCallAsset callAsset;

  public static final String JSON_PROPERTY_CALLOUT_ASSET = "calloutAsset";
  private AssetServiceCalloutAsset calloutAsset;

  public static final String JSON_PROPERTY_STRUCTURED_SNIPPET_ASSET = "structuredSnippetAsset";
  private AssetServiceStructuredSnippetAsset structuredSnippetAsset;

  public AssetServiceAssetData() { 
  }

  public AssetServiceAssetData type(AssetServiceType type) {
    
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

  public AssetServiceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUICK_LINK_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssetServiceQuickLinkAsset getQuickLinkAsset() {
    return quickLinkAsset;
  }


  @JsonProperty(JSON_PROPERTY_QUICK_LINK_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssetServiceCallAsset getCallAsset() {
    return callAsset;
  }


  @JsonProperty(JSON_PROPERTY_CALL_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALLOUT_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssetServiceCalloutAsset getCalloutAsset() {
    return calloutAsset;
  }


  @JsonProperty(JSON_PROPERTY_CALLOUT_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRUCTURED_SNIPPET_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssetServiceStructuredSnippetAsset getStructuredSnippetAsset() {
    return structuredSnippetAsset;
  }


  @JsonProperty(JSON_PROPERTY_STRUCTURED_SNIPPET_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

