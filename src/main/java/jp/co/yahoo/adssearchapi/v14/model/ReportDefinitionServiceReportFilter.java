/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v14.model.ReportDefinitionServiceFilterOperator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReportFilterオブジェクトは、レポートのフィルタ条件を表します。フィルタ条件は最大6つまで設定が可能です。&lt;br&gt; ADD時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceReportFilter object displays filtering report conditions. Filter condition can set up to 6.&lt;br&gt; This field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceReportFilterオブジェクトは、レポートのフィルタ条件を表します。フィルタ条件は最大6つまで設定が可能です。<br> ADD時、このフィールドは省略可能となります。 </div> <div lang=\"en\">ReportDefinitionServiceReportFilter object displays filtering report conditions. Filter condition can set up to 6.<br> This field is optional in ADD operation.</div> ")
@JsonPropertyOrder({
  ReportDefinitionServiceReportFilter.JSON_PROPERTY_FIELD,
  ReportDefinitionServiceReportFilter.JSON_PROPERTY_FILTER_OPERATOR,
  ReportDefinitionServiceReportFilter.JSON_PROPERTY_VALUES
})
@JsonTypeName("ReportDefinitionServiceReportFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceReportFilter {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_FILTER_OPERATOR = "filterOperator";
  private ReportDefinitionServiceFilterOperator filterOperator;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public ReportDefinitionServiceReportFilter() { 
  }

  public ReportDefinitionServiceReportFilter field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィルタ条件を設定する表示項目です。&lt;br&gt; ADD時、このフィールドは必須となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Field which you set filtering.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">フィルタ条件を設定する表示項目です。<br> ADD時、このフィールドは必須となります。 </div> <div lang=\"en\">Field which you set filtering.<br> This field is required in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportDefinitionServiceFilterOperator getFilterOperator() {
    return filterOperator;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;表示項目の条件値です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Condition values to filter the field.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">表示項目の条件値です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Condition values to filter the field.<br> This field is required in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

