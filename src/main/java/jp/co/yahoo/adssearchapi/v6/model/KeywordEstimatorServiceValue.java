package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.Error;
import jp.co.yahoo.adssearchapi.v6.model.KeywordEstimatorServiceResult;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeywordEstimatorServiceValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordEstimatorServiceValue   {
  @JsonProperty("data")
  private KeywordEstimatorServiceResult data = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public KeywordEstimatorServiceValue data(KeywordEstimatorServiceResult data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public KeywordEstimatorServiceResult getData() {
    return data;
  }

  public void setData(KeywordEstimatorServiceResult data) {
    this.data = data;
  }

  public KeywordEstimatorServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public KeywordEstimatorServiceValue addErrorsItem(Error errorsItem) {
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

  public KeywordEstimatorServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Operation result.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Operation result.</div> ")


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
    KeywordEstimatorServiceValue keywordEstimatorServiceValue = (KeywordEstimatorServiceValue) o;
    return Objects.equals(this.data, keywordEstimatorServiceValue.data) &&
        Objects.equals(this.errors, keywordEstimatorServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, keywordEstimatorServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceValue {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

