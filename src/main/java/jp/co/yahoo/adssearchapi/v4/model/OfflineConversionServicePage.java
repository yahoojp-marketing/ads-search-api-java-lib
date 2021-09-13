package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.OfflineConversionServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfflineConversionServicePage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OfflineConversionServicePage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries = null;

  @JsonProperty("values")
  @Valid
  private List<OfflineConversionServiceValue> values = null;

  public OfflineConversionServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * Get totalNumEntries
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public OfflineConversionServicePage values(List<OfflineConversionServiceValue> values) {
    this.values = values;
    return this;
  }

  public OfflineConversionServicePage addValuesItem(OfflineConversionServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OfflineConversionServiceValue> getValues() {
    return values;
  }

  public void setValues(List<OfflineConversionServiceValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineConversionServicePage offlineConversionServicePage = (OfflineConversionServicePage) o;
    return Objects.equals(this.totalNumEntries, offlineConversionServicePage.totalNumEntries) &&
        Objects.equals(this.values, offlineConversionServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineConversionServicePage {\n");
    
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

