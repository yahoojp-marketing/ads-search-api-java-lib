package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceCreatedDateRangeは、作成日時による検索対象期間を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupAdServiceCreatedDateRange represents the search target period by the creation date. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceCreatedDateRangeは、作成日時による検索対象期間を表します。 </div> <div lang=\"en\"> AdGroupAdServiceCreatedDateRange represents the search target period by the creation date. </div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceCreatedDateRange   {
  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("endDate")
  private String endDate = null;

  public AdGroupAdServiceCreatedDateRange startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 検索対象期間の開始日です。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> This is the start date of the search target period.<br> * Format: yyyyMMdd </div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索対象期間の開始日です。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> This is the start date of the search target period.<br> * Format: yyyyMMdd </div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public AdGroupAdServiceCreatedDateRange endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\"> 検索対象期間の終了日です。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> This is the end date of the search target period.<br> * Format: yyyyMMdd </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索対象期間の終了日です。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> This is the end date of the search target period.<br> * Format: yyyyMMdd </div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceCreatedDateRange adGroupAdServiceCreatedDateRange = (AdGroupAdServiceCreatedDateRange) o;
    return Objects.equals(this.startDate, adGroupAdServiceCreatedDateRange.startDate) &&
        Objects.equals(this.endDate, adGroupAdServiceCreatedDateRange.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceCreatedDateRange {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
