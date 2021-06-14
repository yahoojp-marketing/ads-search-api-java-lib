package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import jp.co.yahoo.adssearchapi.v5.model.OfflineConversionServiceUploadReturnValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfflineConversionServiceUploadResponse
 */

public class OfflineConversionServiceUploadResponse   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("rid")
  private JsonNullable<String> rid = JsonNullable.undefined();

  @JsonProperty("rval")
  private JsonNullable<OfflineConversionServiceUploadReturnValue> rval = JsonNullable.undefined();

  public OfflineConversionServiceUploadResponse errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public OfflineConversionServiceUploadResponse addErrorsItem(Error errorsItem) {
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

  public OfflineConversionServiceUploadResponse rid(String rid) {
    this.rid = JsonNullable.of(rid);
    return this;
  }

  /**
   * Get rid
   * @return rid
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getRid() {
    return rid;
  }

  public void setRid(JsonNullable<String> rid) {
    this.rid = rid;
  }

  public OfflineConversionServiceUploadResponse rval(OfflineConversionServiceUploadReturnValue rval) {
    this.rval = JsonNullable.of(rval);
    return this;
  }

  /**
   * Get rval
   * @return rval
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<OfflineConversionServiceUploadReturnValue> getRval() {
    return rval;
  }

  public void setRval(JsonNullable<OfflineConversionServiceUploadReturnValue> rval) {
    this.rval = rval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineConversionServiceUploadResponse offlineConversionServiceUploadResponse = (OfflineConversionServiceUploadResponse) o;
    return Objects.equals(this.errors, offlineConversionServiceUploadResponse.errors) &&
        Objects.equals(this.rid, offlineConversionServiceUploadResponse.rid) &&
        Objects.equals(this.rval, offlineConversionServiceUploadResponse.rval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, rid, rval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineConversionServiceUploadResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
    sb.append("    rval: ").append(toIndentedString(rval)).append("\n");
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

