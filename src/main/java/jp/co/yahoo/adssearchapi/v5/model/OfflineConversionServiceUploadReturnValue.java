package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.OfflineConversionServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfflineConversionServiceUploadReturnValue
 */

public class OfflineConversionServiceUploadReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<OfflineConversionServiceValue>> values = JsonNullable.undefined();

  public OfflineConversionServiceUploadReturnValue values(List<OfflineConversionServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public OfflineConversionServiceUploadReturnValue addValuesItem(OfflineConversionServiceValue valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<OfflineConversionServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<OfflineConversionServiceValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineConversionServiceUploadReturnValue offlineConversionServiceUploadReturnValue = (OfflineConversionServiceUploadReturnValue) o;
    return Objects.equals(this.values, offlineConversionServiceUploadReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineConversionServiceUploadReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

