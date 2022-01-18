package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.ReportDefinitionServiceFilterOperator;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReportFilterオブジェクトは、レポートのフィルタ条件を表します。フィルタ条件は最大6つまで設定が可能です。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceReportFilter object displays filtering report conditions. Filter condition can set up to 6.&lt;br&gt; This field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceReportFilterオブジェクトは、レポートのフィルタ条件を表します。フィルタ条件は最大6つまで設定が可能です。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\">ReportDefinitionServiceReportFilter object displays filtering report conditions. Filter condition can set up to 6.<br> This field is optional in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceReportFilter   {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("filterOperator")
  private ReportDefinitionServiceFilterOperator filterOperator = null;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  public ReportDefinitionServiceReportFilter field(String field) {
    this.field = field;
    return this;
  }

  /**
   * <div lang=\"ja\">フィルタ条件を設定する表示項目です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\">Field which you set filtering.<br> This field is required in ADD operation.</div> 
   * @return field
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィルタ条件を設定する表示項目です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\">Field which you set filtering.<br> This field is required in ADD operation.</div> ")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ReportDefinitionServiceReportFilter filterOperator(ReportDefinitionServiceFilterOperator filterOperator) {
    this.filterOperator = filterOperator;
    return this;
  }

  /**
   * Get filterOperator
   * @return filterOperator
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReportDefinitionServiceFilterOperator getFilterOperator() {
    return filterOperator;
  }

  public void setFilterOperator(ReportDefinitionServiceFilterOperator filterOperator) {
    this.filterOperator = filterOperator;
  }

  public ReportDefinitionServiceReportFilter values(List<String> values) {
    this.values = values;
    return this;
  }

  public ReportDefinitionServiceReportFilter addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">表示項目の条件値です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Condition values to filter the field.<br> This field is required in ADD operation.</div> 
   * @return values
  */
  @ApiModelProperty(value = "<div lang=\"ja\">表示項目の条件値です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Condition values to filter the field.<br> This field is required in ADD operation.</div> ")


  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
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
    ReportDefinitionServiceReportFilter reportDefinitionServiceReportFilter = (ReportDefinitionServiceReportFilter) o;
    return Objects.equals(this.field, reportDefinitionServiceReportFilter.field) &&
        Objects.equals(this.filterOperator, reportDefinitionServiceReportFilter.filterOperator) &&
        Objects.equals(this.values, reportDefinitionServiceReportFilter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, filterOperator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceReportFilter {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    filterOperator: ").append(toIndentedString(filterOperator)).append("\n");
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

