/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

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
import jp.co.yahoo.adssearchapi.v10.model.AccountCustomizer;
import jp.co.yahoo.adssearchapi.v10.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountCustomizerServiceValueオブジェクトは、アカウントとカスタマイザー属性間の設定情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountCustomizerServiceValue object contains the configuration information between the account and the customizer attribute.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountCustomizerServiceValueオブジェクトは、アカウントとカスタマイザー属性間の設定情報を格納します。</div> <div lang=\"en\">AccountCustomizerServiceValue object contains the configuration information between the account and the customizer attribute.</div> ")
@JsonPropertyOrder({
  AccountCustomizerServiceValue.JSON_PROPERTY_ERRORS,
  AccountCustomizerServiceValue.JSON_PROPERTY_ACCOUNT_CUSTOMIZER,
  AccountCustomizerServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@JsonTypeName("AccountCustomizerServiceValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountCustomizerServiceValue {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_ACCOUNT_CUSTOMIZER = "accountCustomizer";
  private AccountCustomizer accountCustomizer;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public AccountCustomizerServiceValue() { 
  }

  public AccountCustomizerServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public AccountCustomizerServiceValue addErrorsItem(Error errorsItem) {
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


  public AccountCustomizerServiceValue accountCustomizer(AccountCustomizer accountCustomizer) {
    
    this.accountCustomizer = accountCustomizer;
    return this;
  }

   /**
   * Get accountCustomizer
   * @return accountCustomizer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_CUSTOMIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountCustomizer getAccountCustomizer() {
    return accountCustomizer;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_CUSTOMIZER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountCustomizer(AccountCustomizer accountCustomizer) {
    this.accountCustomizer = accountCustomizer;
  }


  public AccountCustomizerServiceValue operationSucceeded(Boolean operationSucceeded) {
    
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
    AccountCustomizerServiceValue accountCustomizerServiceValue = (AccountCustomizerServiceValue) o;
    return Objects.equals(this.errors, accountCustomizerServiceValue.errors) &&
        Objects.equals(this.accountCustomizer, accountCustomizerServiceValue.accountCustomizer) &&
        Objects.equals(this.operationSucceeded, accountCustomizerServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, accountCustomizer, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCustomizerServiceValue {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    accountCustomizer: ").append(toIndentedString(accountCustomizer)).append("\n");
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

