package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AccountShared;
import jp.co.yahoo.adssearchapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountSharedServiceValueオブジェクトは、検索結果（1エンティティ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountSharedServiceValue object holds search result (1 entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountSharedServiceValueオブジェクトは、検索結果（1エンティティ）を保持します。</div> <div lang=\"en\">AccountSharedServiceValue object holds search result (1 entity).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountSharedServiceValue   {
  @JsonProperty("accountShared")
  private AccountShared accountShared = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AccountSharedServiceValue accountShared(AccountShared accountShared) {
    this.accountShared = accountShared;
    return this;
  }

  /**
   * Get accountShared
   * @return accountShared
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountShared getAccountShared() {
    return accountShared;
  }

  public void setAccountShared(AccountShared accountShared) {
    this.accountShared = accountShared;
  }

  public AccountSharedServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AccountSharedServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public AccountSharedServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

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
    AccountSharedServiceValue accountSharedServiceValue = (AccountSharedServiceValue) o;
    return Objects.equals(this.accountShared, accountSharedServiceValue.accountShared) &&
        Objects.equals(this.errors, accountSharedServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, accountSharedServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountShared, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSharedServiceValue {\n");
    
    sb.append("    accountShared: ").append(toIndentedString(accountShared)).append("\n");
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

