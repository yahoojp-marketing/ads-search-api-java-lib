/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

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
import jp.co.yahoo.adssearchapi.v11.model.AdGroupCustomizer;
import jp.co.yahoo.adssearchapi.v11.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCustomizerServiceValueオブジェクトは、広告グループとカスタマイザー属性間の設定情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCustomizerServiceValue object contains the configuration information between the adgroup and the customizer attribute.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCustomizerServiceValueオブジェクトは、広告グループとカスタマイザー属性間の設定情報を格納します。</div> <div lang=\"en\">AdGroupCustomizerServiceValue object contains the configuration information between the adgroup and the customizer attribute.</div> ")
@JsonPropertyOrder({
  AdGroupCustomizerServiceValue.JSON_PROPERTY_ERRORS,
  AdGroupCustomizerServiceValue.JSON_PROPERTY_AD_GROUP_CUSTOMIZER,
  AdGroupCustomizerServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("AdGroupCustomizerServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupCustomizerServiceValue {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_AD_GROUP_CUSTOMIZER = "adGroupCustomizer";
  private AdGroupCustomizer adGroupCustomizer;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public AdGroupCustomizerServiceValue() { 
  }

  public AdGroupCustomizerServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public AdGroupCustomizerServiceValue addErrorsItem(Error errorsItem) {
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


  public AdGroupCustomizerServiceValue adGroupCustomizer(AdGroupCustomizer adGroupCustomizer) {
    
    this.adGroupCustomizer = adGroupCustomizer;
    return this;
  }

   /**
   * Get adGroupCustomizer
   * @return adGroupCustomizer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_CUSTOMIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupCustomizer getAdGroupCustomizer() {
    return adGroupCustomizer;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_CUSTOMIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupCustomizer(AdGroupCustomizer adGroupCustomizer) {
    this.adGroupCustomizer = adGroupCustomizer;
  }


  public AdGroupCustomizerServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Result of process.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Result of process.</div> ")
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
    AdGroupCustomizerServiceValue adGroupCustomizerServiceValue = (AdGroupCustomizerServiceValue) o;
    return Objects.equals(this.errors, adGroupCustomizerServiceValue.errors) &&
        Objects.equals(this.adGroupCustomizer, adGroupCustomizerServiceValue.adGroupCustomizer) &&
        Objects.equals(this.operationSucceeded, adGroupCustomizerServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, adGroupCustomizer, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCustomizerServiceValue {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    adGroupCustomizer: ").append(toIndentedString(adGroupCustomizer)).append("\n");
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

