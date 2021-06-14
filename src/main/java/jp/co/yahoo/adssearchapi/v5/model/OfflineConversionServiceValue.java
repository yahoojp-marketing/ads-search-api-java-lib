package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import jp.co.yahoo.adssearchapi.v5.model.OfflineConversionFile;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfflineConversionServiceValue
 */

public class OfflineConversionServiceValue   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("offlineConversion")
  private JsonNullable<OfflineConversionFile> offlineConversion = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public OfflineConversionServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public OfflineConversionServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public OfflineConversionServiceValue offlineConversion(OfflineConversionFile offlineConversion) {
    this.offlineConversion = JsonNullable.of(offlineConversion);
    return this;
  }

  /**
   * Get offlineConversion
   * @return offlineConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<OfflineConversionFile> getOfflineConversion() {
    return offlineConversion;
  }

  public void setOfflineConversion(JsonNullable<OfflineConversionFile> offlineConversion) {
    this.offlineConversion = offlineConversion;
  }

  public OfflineConversionServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * Get operationSucceeded
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineConversionServiceValue offlineConversionServiceValue = (OfflineConversionServiceValue) o;
    return Objects.equals(this.errors, offlineConversionServiceValue.errors) &&
        Objects.equals(this.offlineConversion, offlineConversionServiceValue.offlineConversion) &&
        Objects.equals(this.operationSucceeded, offlineConversionServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, offlineConversion, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineConversionServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    offlineConversion: ").append(toIndentedString(offlineConversion)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

