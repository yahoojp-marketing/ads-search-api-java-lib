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
import jp.co.yahoo.adssearchapi.v8.model.Error;
import jp.co.yahoo.adssearchapi.v8.model.SharedCriterion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SharedCriterionServiceValueは、実行結果（1エンティティ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SharedCriterionServiceValue object holds exec result (1 entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SharedCriterionServiceValueは、実行結果（1エンティティ）を保持するオブジェクトです。</div> <div lang=\"en\">SharedCriterionServiceValue object holds exec result (1 entity).</div> ")
@JsonPropertyOrder({
  SharedCriterionServiceValue.JSON_PROPERTY_ERRORS,
  SharedCriterionServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED,
  SharedCriterionServiceValue.JSON_PROPERTY_SHARED_CRITERION
})
@JsonTypeName("SharedCriterionServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SharedCriterionServiceValue {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public static final String JSON_PROPERTY_SHARED_CRITERION = "sharedCriterion";
  private SharedCriterion sharedCriterion;

  public SharedCriterionServiceValue() { 
  }

  public SharedCriterionServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public SharedCriterionServiceValue addErrorsItem(Error errorsItem) {
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


  public SharedCriterionServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果を表示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Showing operation result.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation result.</div> ")
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


  public SharedCriterionServiceValue sharedCriterion(SharedCriterion sharedCriterion) {
    
    this.sharedCriterion = sharedCriterion;
    return this;
  }

   /**
   * Get sharedCriterion
   * @return sharedCriterion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARED_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SharedCriterion getSharedCriterion() {
    return sharedCriterion;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedCriterion(SharedCriterion sharedCriterion) {
    this.sharedCriterion = sharedCriterion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedCriterionServiceValue sharedCriterionServiceValue = (SharedCriterionServiceValue) o;
    return Objects.equals(this.errors, sharedCriterionServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, sharedCriterionServiceValue.operationSucceeded) &&
        Objects.equals(this.sharedCriterion, sharedCriterionServiceValue.sharedCriterion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, sharedCriterion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedCriterionServiceValue {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    sharedCriterion: ").append(toIndentedString(sharedCriterion)).append("\n");
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

