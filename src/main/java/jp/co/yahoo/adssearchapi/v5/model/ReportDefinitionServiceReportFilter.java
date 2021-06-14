package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.ReportDefinitionServiceFilterOperator;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReportFilterオブジェクトは、レポートのフィルタ条件を表します。フィルタ条件は最大6つまで設定が可能です。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceReportFilter object displays filtering report conditions. Filter condition can set up to 6.&lt;br&gt; This field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceReportFilterオブジェクトは、レポートのフィルタ条件を表します。フィルタ条件は最大6つまで設定が可能です。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\">ReportDefinitionServiceReportFilter object displays filtering report conditions. Filter condition can set up to 6.<br> This field is optional in ADD operation.</div> ")

public class ReportDefinitionServiceReportFilter   {
  @JsonProperty("field")
  private JsonNullable<String> field = JsonNullable.undefined();

  @JsonProperty("filterOperator")
  private JsonNullable<ReportDefinitionServiceFilterOperator> filterOperator = JsonNullable.undefined();

  @JsonProperty("values")
  @Valid
  private JsonNullable<List<String>> values = JsonNullable.undefined();

  public ReportDefinitionServiceReportFilter field(String field) {
    this.field = JsonNullable.of(field);
    return this;
  }

  /**
   * <div lang=\"ja\">フィルタ条件を設定する表示項目です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\">Field which you set filtering.<br> This field is required in ADD operation.</div> 
   * @return field
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィルタ条件を設定する表示項目です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\">Field which you set filtering.<br> This field is required in ADD operation.</div> ")


  public JsonNullable<String> getField() {
    return field;
  }

  public void setField(JsonNullable<String> field) {
    this.field = field;
  }

  public ReportDefinitionServiceReportFilter filterOperator(ReportDefinitionServiceFilterOperator filterOperator) {
    this.filterOperator = JsonNullable.of(filterOperator);
    return this;
  }

  /**
   * Get filterOperator
   * @return filterOperator
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ReportDefinitionServiceFilterOperator> getFilterOperator() {
    return filterOperator;
  }

  public void setFilterOperator(JsonNullable<ReportDefinitionServiceFilterOperator> filterOperator) {
    this.filterOperator = filterOperator;
  }

  public ReportDefinitionServiceReportFilter values(List<String> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public ReportDefinitionServiceReportFilter addValuesItem(String valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">表示項目の条件値です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Condition values to filter the field.<br> This field is required in ADD operation.</div> 
   * @return values
  */
  @ApiModelProperty(value = "<div lang=\"ja\">表示項目の条件値です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Condition values to filter the field.<br> This field is required in ADD operation.</div> ")


  public JsonNullable<List<String>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<String>> values) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

