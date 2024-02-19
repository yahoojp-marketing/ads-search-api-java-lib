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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceSetTrademarkStatusオブジェクトは、アセットの情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceSetTrademarkStatus object holds asset information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceSetTrademarkStatusオブジェクトは、アセットの情報を格納します。</div> <div lang=\"en\">AssetServiceSetTrademarkStatus object holds asset information.</div> ")
@JsonPropertyOrder({
  AssetServiceSetTrademarkStatus.JSON_PROPERTY_ASSET_ID
})
@JsonTypeName("AssetServiceSetTrademarkStatus")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetServiceSetTrademarkStatus {
  public static final String JSON_PROPERTY_ASSET_ID = "assetId";
  private Long assetId;

  public AssetServiceSetTrademarkStatus() { 
  }

  public AssetServiceSetTrademarkStatus assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アセットIDです。&lt;br&gt; このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Asset ID.&lt;br&gt;This field is required.&lt;/div&gt; 
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アセットIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Asset ID.<br>This field is required.</div> ")
  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAssetId() {
    return assetId;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetServiceSetTrademarkStatus assetServiceSetTrademarkStatus = (AssetServiceSetTrademarkStatus) o;
    return Objects.equals(this.assetId, assetServiceSetTrademarkStatus.assetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceSetTrademarkStatus {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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

