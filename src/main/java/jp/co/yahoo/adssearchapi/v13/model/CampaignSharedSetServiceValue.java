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
import jp.co.yahoo.adssearchapi.v13.model.CampaignSharedSet;
import jp.co.yahoo.adssearchapi.v13.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignSharedSetServiceValueは、実行結果（1エンティティ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignSharedSetServiceValue is object to hold execution result (1 entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignSharedSetServiceValueは、実行結果（1エンティティ）を保持するオブジェクトです。</div> <div lang=\"en\">CampaignSharedSetServiceValue is object to hold execution result (1 entity).</div> ")
@JsonPropertyOrder({
  CampaignSharedSetServiceValue.JSON_PROPERTY_CAMPAIGN_SHARED_SET,
  CampaignSharedSetServiceValue.JSON_PROPERTY_ERRORS,
  CampaignSharedSetServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("CampaignSharedSetServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignSharedSetServiceValue {
  public static final String JSON_PROPERTY_CAMPAIGN_SHARED_SET = "campaignSharedSet";
  private CampaignSharedSet campaignSharedSet;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public CampaignSharedSetServiceValue() { 
  }

  public CampaignSharedSetServiceValue campaignSharedSet(CampaignSharedSet campaignSharedSet) {
    
    this.campaignSharedSet = campaignSharedSet;
    return this;
  }

   /**
   * Get campaignSharedSet
   * @return campaignSharedSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_SHARED_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignSharedSet getCampaignSharedSet() {
    return campaignSharedSet;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_SHARED_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignSharedSet(CampaignSharedSet campaignSharedSet) {
    this.campaignSharedSet = campaignSharedSet;
  }


  public CampaignSharedSetServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public CampaignSharedSetServiceValue addErrorsItem(Error errorsItem) {
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


  public CampaignSharedSetServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果を表示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Showing operation results.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results.</div> ")
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
    CampaignSharedSetServiceValue campaignSharedSetServiceValue = (CampaignSharedSetServiceValue) o;
    return Objects.equals(this.campaignSharedSet, campaignSharedSetServiceValue.campaignSharedSet) &&
        Objects.equals(this.errors, campaignSharedSetServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignSharedSetServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignSharedSet, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSharedSetServiceValue {\n");
    sb.append("    campaignSharedSet: ").append(toIndentedString(campaignSharedSet)).append("\n");
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

