package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.ConversionTrackerServiceAppEventTypeValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceAppEventTypePageオブジェクトは、取得されるコンバージョントラッカー情報のエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceAppEventTypePage object shows entry of ConversionTracker.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceAppEventTypePageオブジェクトは、取得されるコンバージョントラッカー情報のエントリーを表します。</div> <div lang=\"en\">ConversionTrackerServiceAppEventTypePage object shows entry of ConversionTracker.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceAppEventTypePage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<ConversionTrackerServiceAppEventTypeValue> values = null;

  public ConversionTrackerServiceAppEventTypePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result that this page is a part of.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result that this page is a part of.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public ConversionTrackerServiceAppEventTypePage values(List<ConversionTrackerServiceAppEventTypeValue> values) {
    this.values = values;
    return this;
  }

  public ConversionTrackerServiceAppEventTypePage addValuesItem(ConversionTrackerServiceAppEventTypeValue valuesItem) {
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

  public List<ConversionTrackerServiceAppEventTypeValue> getValues() {
    return values;
  }

  public void setValues(List<ConversionTrackerServiceAppEventTypeValue> values) {
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
    ConversionTrackerServiceAppEventTypePage conversionTrackerServiceAppEventTypePage = (ConversionTrackerServiceAppEventTypePage) o;
    return Objects.equals(this.totalNumEntries, conversionTrackerServiceAppEventTypePage.totalNumEntries) &&
        Objects.equals(this.values, conversionTrackerServiceAppEventTypePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceAppEventTypePage {\n");
    
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

