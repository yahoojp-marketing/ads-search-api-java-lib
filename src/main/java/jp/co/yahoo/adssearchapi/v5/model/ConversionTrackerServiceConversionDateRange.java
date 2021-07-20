package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceConversionDateRangeオブジェクトは、コンバージョンの取得期間を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceConversionDateRange object is used to specify a period to obtain conversion.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceConversionDateRangeオブジェクトは、コンバージョンの取得期間を指定します。</div> <div lang=\"en\">ConversionTrackerServiceConversionDateRange object is used to specify a period to obtain conversion.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceConversionDateRange   {
  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("startDate")
  private String startDate = null;

  public ConversionTrackerServiceConversionDateRange endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン実績集計終了期間です。</div> <div lang=\"en\">Conversion performance aggregation period end</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン実績集計終了期間です。</div> <div lang=\"en\">Conversion performance aggregation period end</div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ConversionTrackerServiceConversionDateRange startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン実績集計開始期間です。</div> <div lang=\"en\">Conversion performance aggregation period start</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン実績集計開始期間です。</div> <div lang=\"en\">Conversion performance aggregation period start</div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceConversionDateRange conversionTrackerServiceConversionDateRange = (ConversionTrackerServiceConversionDateRange) o;
    return Objects.equals(this.endDate, conversionTrackerServiceConversionDateRange.endDate) &&
        Objects.equals(this.startDate, conversionTrackerServiceConversionDateRange.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceConversionDateRange {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

