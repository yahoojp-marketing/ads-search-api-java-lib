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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupBidMultiplierServiceReturnValueオブジェクトは、入札価格調整率を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Container for bid multiplier.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupBidMultiplierServiceReturnValueオブジェクトは、入札価格調整率を格納するコンテナです。</div> <div lang=\"en\">Container for bid multiplier.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupBidMultiplierServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<AdGroupBidMultiplierServiceValue> values = null;

  public AdGroupBidMultiplierServiceReturnValue values(List<AdGroupBidMultiplierServiceValue> values) {
    this.values = values;
    return this;
  }

  public AdGroupBidMultiplierServiceReturnValue addValuesItem(AdGroupBidMultiplierServiceValue valuesItem) {
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
    AdGroupBidMultiplierServiceReturnValue adGroupBidMultiplierServiceReturnValue = (AdGroupBidMultiplierServiceReturnValue) o;
    return Objects.equals(this.values, adGroupBidMultiplierServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupBidMultiplierServiceReturnValue {\n");
    
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

