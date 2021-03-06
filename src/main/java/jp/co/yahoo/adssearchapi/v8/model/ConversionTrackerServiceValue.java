/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

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
import jp.co.yahoo.adssearchapi.v8.model.ConversionTracker;
import jp.co.yahoo.adssearchapi.v8.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceValueオブジェクトは、操作結果を含むコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceValue object shows ConversionTracker information includes operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceValueオブジェクトは、操作結果を含むコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionTrackerServiceValue object shows ConversionTracker information includes operation results.</div> ")
@JsonPropertyOrder({
  ConversionTrackerServiceValue.JSON_PROPERTY_CONVERSION_TRACKER,
  ConversionTrackerServiceValue.JSON_PROPERTY_ERRORS,
  ConversionTrackerServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("ConversionTrackerServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceValue {
  public static final String JSON_PROPERTY_CONVERSION_TRACKER = "conversionTracker";
  private ConversionTracker conversionTracker;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public ConversionTrackerServiceValue() { 
  }

  public ConversionTrackerServiceValue conversionTracker(ConversionTracker conversionTracker) {
    
    this.conversionTracker = conversionTracker;
    return this;
  }

   /**
   * Get conversionTracker
   * @return conversionTracker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTracker getConversionTracker() {
    return conversionTracker;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTracker(ConversionTracker conversionTracker) {
    this.conversionTracker = conversionTracker;
  }


  public ConversionTrackerServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public ConversionTrackerServiceValue addErrorsItem(Error errorsItem) {
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


  public ConversionTrackerServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Operation result&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div><div lang=\"en\">Operation result</div> ")
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
    ConversionTrackerServiceValue conversionTrackerServiceValue = (ConversionTrackerServiceValue) o;
    return Objects.equals(this.conversionTracker, conversionTrackerServiceValue.conversionTracker) &&
        Objects.equals(this.errors, conversionTrackerServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, conversionTrackerServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionTracker, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceValue {\n");
    sb.append("    conversionTracker: ").append(toIndentedString(conversionTracker)).append("\n");
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

