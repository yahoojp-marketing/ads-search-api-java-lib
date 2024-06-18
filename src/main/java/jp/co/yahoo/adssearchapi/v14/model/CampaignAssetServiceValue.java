/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

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
import jp.co.yahoo.adssearchapi.v14.model.CampaignAsset;
import jp.co.yahoo.adssearchapi.v14.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignAssetServiceValueオブジェクトは、キャンペーンとアセット間の設定情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignAssetServiceValue is a container of configuration information between campaign and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignAssetServiceValueオブジェクトは、キャンペーンとアセット間の設定情報を格納するコンテナです。</div> <div lang=\"en\">CampaignAssetServiceValue is a container of configuration information between campaign and assets.</div> ")
@JsonPropertyOrder({
  CampaignAssetServiceValue.JSON_PROPERTY_CAMPAIGN_ASSET,
  CampaignAssetServiceValue.JSON_PROPERTY_ERRORS,
  CampaignAssetServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("CampaignAssetServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignAssetServiceValue {
  public static final String JSON_PROPERTY_CAMPAIGN_ASSET = "campaignAsset";
  private CampaignAsset campaignAsset;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public CampaignAssetServiceValue() { 
  }

  public CampaignAssetServiceValue campaignAsset(CampaignAsset campaignAsset) {
    
    this.campaignAsset = campaignAsset;
    return this;
  }

   /**
   * Get campaignAsset
   * @return campaignAsset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignAsset getCampaignAsset() {
    return campaignAsset;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignAsset(CampaignAsset campaignAsset) {
    this.campaignAsset = campaignAsset;
  }


  public CampaignAssetServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public CampaignAssetServiceValue addErrorsItem(Error errorsItem) {
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


  public CampaignAssetServiceValue operationSucceeded(Boolean operationSucceeded) {
    
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
    CampaignAssetServiceValue campaignAssetServiceValue = (CampaignAssetServiceValue) o;
    return Objects.equals(this.campaignAsset, campaignAssetServiceValue.campaignAsset) &&
        Objects.equals(this.errors, campaignAssetServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignAssetServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignAsset, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAssetServiceValue {\n");
    sb.append("    campaignAsset: ").append(toIndentedString(campaignAsset)).append("\n");
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

