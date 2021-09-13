package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceAppEventTypePage;
import jp.co.yahoo.adssearchapi.v4.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConversionTrackerServiceGetAppEventTypeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceGetAppEventTypeResponse   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("rid")
  private String rid;

  @JsonProperty("rval")
  private ConversionTrackerServiceAppEventTypePage rval = null;

  public ConversionTrackerServiceGetAppEventTypeResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ConversionTrackerServiceGetAppEventTypeResponse addErrorsItem(Error errorsItem) {
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

  public ConversionTrackerServiceGetAppEventTypeResponse rid(String rid) {
    this.rid = rid;
    return this;
  }

  /**
   * Get rid
   * @return rid
  */
  @ApiModelProperty(value = "")


  public String getRid() {
    return rid;
  }

  public void setRid(String rid) {
    this.rid = rid;
  }

  public ConversionTrackerServiceGetAppEventTypeResponse rval(ConversionTrackerServiceAppEventTypePage rval) {
    this.rval = rval;
    return this;
  }

  /**
   * Get rval
   * @return rval
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceAppEventTypePage getRval() {
    return rval;
  }

  public void setRval(ConversionTrackerServiceAppEventTypePage rval) {
    this.rval = rval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceGetAppEventTypeResponse conversionTrackerServiceGetAppEventTypeResponse = (ConversionTrackerServiceGetAppEventTypeResponse) o;
    return Objects.equals(this.errors, conversionTrackerServiceGetAppEventTypeResponse.errors) &&
        Objects.equals(this.rid, conversionTrackerServiceGetAppEventTypeResponse.rid) &&
        Objects.equals(this.rval, conversionTrackerServiceGetAppEventTypeResponse.rval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, rid, rval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceGetAppEventTypeResponse {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

