/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v17.model.CampaignTarget;
import jp.co.yahoo.adssearchapi.v17.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceValueオブジェクトは、処理結果を含むキャンペーンのターゲティング設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign target settings including operation results.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignTargetServiceValue.JSON_PROPERTY_CAMPAIGN_TARGET,
  CampaignTargetServiceValue.JSON_PROPERTY_ERRORS,
  CampaignTargetServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignTargetServiceValue {
  public static final String JSON_PROPERTY_CAMPAIGN_TARGET = "campaignTarget";
  private CampaignTarget campaignTarget;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public CampaignTargetServiceValue() {
  }

  public CampaignTargetServiceValue campaignTarget(CampaignTarget campaignTarget) {
    
    this.campaignTarget = campaignTarget;
    return this;
  }

   /**
   * Get campaignTarget
   * @return campaignTarget
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTarget getCampaignTarget() {
    return campaignTarget;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignTarget(CampaignTarget campaignTarget) {
    this.campaignTarget = campaignTarget;
  }


  public CampaignTargetServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public CampaignTargetServiceValue addErrorsItem(Error errorsItem) {
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
  @jakarta.annotation.Nullable
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


  public CampaignTargetServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The operation.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @jakarta.annotation.Nullable
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
    CampaignTargetServiceValue campaignTargetServiceValue = (CampaignTargetServiceValue) o;
    return Objects.equals(this.campaignTarget, campaignTargetServiceValue.campaignTarget) &&
        Objects.equals(this.errors, campaignTargetServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignTargetServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignTarget, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServiceValue {\n");
    sb.append("    campaignTarget: ").append(toIndentedString(campaignTarget)).append("\n");
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

