/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v17.model.SsaReportDefinitionServiceReportSortType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SsaReportDefinitionServiceReportSortFieldオブジェクトは、レポート定義のソート詳細を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SsaReportDefinitionServiceReportSortField object describes sort details of report definition.&lt;br&gt; This field is optional in ADD operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  SsaReportDefinitionServiceReportSortField.JSON_PROPERTY_FIELD,
  SsaReportDefinitionServiceReportSortField.JSON_PROPERTY_REPORT_SORT_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SsaReportDefinitionServiceReportSortField {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_REPORT_SORT_TYPE = "reportSortType";
  private SsaReportDefinitionServiceReportSortType reportSortType;

  public SsaReportDefinitionServiceReportSortField() {
  }

  public SsaReportDefinitionServiceReportSortField field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;レポート定義のソート対象です。&lt;br&gt;ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Sort object (field) of report definition.&lt;br&gt;This field is required in ADD operation.&lt;/div&gt; 
   * @return field
  **/
  @jakarta.annotation.Nullable
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


  public SsaReportDefinitionServiceReportSortField reportSortType(SsaReportDefinitionServiceReportSortType reportSortType) {
    
    this.reportSortType = reportSortType;
    return this;
  }

   /**
   * Get reportSortType
   * @return reportSortType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_SORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SsaReportDefinitionServiceReportSortType getReportSortType() {
    return reportSortType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_SORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportSortType(SsaReportDefinitionServiceReportSortType reportSortType) {
    this.reportSortType = reportSortType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsaReportDefinitionServiceReportSortField ssaReportDefinitionServiceReportSortField = (SsaReportDefinitionServiceReportSortField) o;
    return Objects.equals(this.field, ssaReportDefinitionServiceReportSortField.field) &&
        Objects.equals(this.reportSortType, ssaReportDefinitionServiceReportSortField.reportSortType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, reportSortType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsaReportDefinitionServiceReportSortField {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    reportSortType: ").append(toIndentedString(reportSortType)).append("\n");
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

