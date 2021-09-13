package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupBidMultiplierServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupBidMultiplierServicePageオブジェクトは、入札価格調整率を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Container for bid multiplier.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupBidMultiplierServicePageオブジェクトは、入札価格調整率を格納するコンテナです。</div> <div lang=\"en\">Container for bid multiplier.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupBidMultiplierServicePage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<AdGroupBidMultiplierServiceValue> values = null;

  public AdGroupBidMultiplierServicePage totalNumEntries(Integer totalNumEntries) {
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

  public AdGroupBidMultiplierServicePage values(List<AdGroupBidMultiplierServiceValue> values) {
    this.values = values;
    return this;
  }

  public AdGroupBidMultiplierServicePage addValuesItem(AdGroupBidMultiplierServiceValue valuesItem) {
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

  public List<AdGroupBidMultiplierServiceValue> getValues() {
    return values;
  }

  public void setValues(List<AdGroupBidMultiplierServiceValue> values) {
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
    AdGroupBidMultiplierServicePage adGroupBidMultiplierServicePage = (AdGroupBidMultiplierServicePage) o;
    return Objects.equals(this.totalNumEntries, adGroupBidMultiplierServicePage.totalNumEntries) &&
        Objects.equals(this.values, adGroupBidMultiplierServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupBidMultiplierServicePage {\n");
    
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

