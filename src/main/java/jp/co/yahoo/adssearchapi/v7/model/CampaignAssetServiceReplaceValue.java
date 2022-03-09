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
import jp.co.yahoo.adssearchapi.v7.model.CampaignAsset;
import jp.co.yahoo.adssearchapi.v7.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignAssetServiceReplaceValueオブジェクトは、キャンペーンとアセット間の設定情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignAssetServiceReplaceValue is a container of configuration information between campaign and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignAssetServiceReplaceValueオブジェクトは、キャンペーンとアセット間の設定情報を格納するコンテナです。</div> <div lang=\"en\">CampaignAssetServiceReplaceValue is a container of configuration information between campaign and assets.</div> ")
@JsonPropertyOrder({
  CampaignAssetServiceReplaceValue.JSON_PROPERTY_CAMPAIGN_ASSETS,
  CampaignAssetServiceReplaceValue.JSON_PROPERTY_ERRORS,
  CampaignAssetServiceReplaceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("CampaignAssetServiceReplaceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignAssetServiceReplaceValue {
  public static final String JSON_PROPERTY_CAMPAIGN_ASSETS = "campaignAssets";
  private List<CampaignAsset> campaignAssets = null;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public CampaignAssetServiceReplaceValue() { 
  }

  public CampaignAssetServiceReplaceValue campaignAssets(List<CampaignAsset> campaignAssets) {
    
    this.campaignAssets = campaignAssets;
    return this;
  }

  public CampaignAssetServiceReplaceValue addCampaignAssetsItem(CampaignAsset campaignAssetsItem) {
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


  public CampaignAssetServiceReplaceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public CampaignAssetServiceReplaceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public CampaignAssetServiceReplaceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")
  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignAssetServiceReplaceValue campaignAssetServiceReplaceValue = (CampaignAssetServiceReplaceValue) o;
    return Objects.equals(this.campaignAssets, campaignAssetServiceReplaceValue.campaignAssets) &&
        Objects.equals(this.errors, campaignAssetServiceReplaceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignAssetServiceReplaceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignAssets, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAssetServiceReplaceValue {\n");
    sb.append("    campaignAssets: ").append(toIndentedString(campaignAssets)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

