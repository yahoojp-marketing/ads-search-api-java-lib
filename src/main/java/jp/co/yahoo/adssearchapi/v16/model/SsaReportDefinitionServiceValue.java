/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v16.model.Error;
import jp.co.yahoo.adssearchapi.v16.model.SsaReportDefinition;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SsaReportDefinitionServiceValueオブジェクトは、処理結果を含むレポートの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SsaReportDefinitionServiceValue is an information of the report including operation result.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  SsaReportDefinitionServiceValue.JSON_PROPERTY_ERRORS,
  SsaReportDefinitionServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED,
  SsaReportDefinitionServiceValue.JSON_PROPERTY_REPORT_DEFINITION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SsaReportDefinitionServiceValue {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public static final String JSON_PROPERTY_REPORT_DEFINITION = "reportDefinition";
  private SsaReportDefinition reportDefinition;

  public SsaReportDefinitionServiceValue() {
  }

  public SsaReportDefinitionServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public SsaReportDefinitionServiceValue addErrorsItem(Error errorsItem) {
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


  public SsaReportDefinitionServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
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


  public SsaReportDefinitionServiceValue reportDefinition(SsaReportDefinition reportDefinition) {
    
    this.reportDefinition = reportDefinition;
    return this;
  }

   /**
   * Get reportDefinition
   * @return reportDefinition
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsaReportDefinition getReportDefinition() {
    return reportDefinition;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportDefinition(SsaReportDefinition reportDefinition) {
    this.reportDefinition = reportDefinition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsaReportDefinitionServiceValue ssaReportDefinitionServiceValue = (SsaReportDefinitionServiceValue) o;
    return Objects.equals(this.errors, ssaReportDefinitionServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, ssaReportDefinitionServiceValue.operationSucceeded) &&
        Objects.equals(this.reportDefinition, ssaReportDefinitionServiceValue.reportDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, reportDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsaReportDefinitionServiceValue {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    reportDefinition: ").append(toIndentedString(reportDefinition)).append("\n");
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

