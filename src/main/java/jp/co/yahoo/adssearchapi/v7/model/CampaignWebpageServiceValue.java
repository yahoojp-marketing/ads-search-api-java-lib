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
import jp.co.yahoo.adssearchapi.v7.model.CampaignWebpage;
import jp.co.yahoo.adssearchapi.v7.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignWebpageServiceValueオブジェクトは、操作結果を含むPageFeedAssetの除外設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignWebpageServiceValue object describes excluded settings including operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignWebpageServiceValueオブジェクトは、操作結果を含むPageFeedAssetの除外設定を表します。</div> <div lang=\"en\">CampaignWebpageServiceValue object describes excluded settings including operation result.</div> ")
@JsonPropertyOrder({
  CampaignWebpageServiceValue.JSON_PROPERTY_CAMPAIGN_WEBPAGE,
  CampaignWebpageServiceValue.JSON_PROPERTY_ERRORS,
  CampaignWebpageServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("CampaignWebpageServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignWebpageServiceValue {
  public static final String JSON_PROPERTY_CAMPAIGN_WEBPAGE = "campaignWebpage";
  private CampaignWebpage campaignWebpage;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public CampaignWebpageServiceValue() { 
  }

  public CampaignWebpageServiceValue campaignWebpage(CampaignWebpage campaignWebpage) {
    
    this.campaignWebpage = campaignWebpage;
    return this;
  }

   /**
   * Get campaignWebpage
   * @return campaignWebpage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_WEBPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignWebpage getCampaignWebpage() {
    return campaignWebpage;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_WEBPAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignWebpage(CampaignWebpage campaignWebpage) {
    this.campaignWebpage = campaignWebpage;
  }


  public CampaignWebpageServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public CampaignWebpageServiceValue addErrorsItem(Error errorsItem) {
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


  public CampaignWebpageServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Operation result&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果</div> <div lang=\"en\">Operation result</div> ")
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
    CampaignWebpageServiceValue campaignWebpageServiceValue = (CampaignWebpageServiceValue) o;
    return Objects.equals(this.campaignWebpage, campaignWebpageServiceValue.campaignWebpage) &&
        Objects.equals(this.errors, campaignWebpageServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignWebpageServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignWebpage, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignWebpageServiceValue {\n");
    sb.append("    campaignWebpage: ").append(toIndentedString(campaignWebpage)).append("\n");
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

