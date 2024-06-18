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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReportFieldAttributeオブジェクトは、レポート定義の作成に使用できるフィールドを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceReportFieldAttribute object describes the available field to create report definition.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  ReportDefinitionServiceReportFieldAttribute.JSON_PROPERTY_FILTERABLE,
  ReportDefinitionServiceReportFieldAttribute.JSON_PROPERTY_SELECTABLE,
  ReportDefinitionServiceReportFieldAttribute.JSON_PROPERTY_DISPLAY_FIELD_NAME_EN,
  ReportDefinitionServiceReportFieldAttribute.JSON_PROPERTY_DISPLAY_FIELD_NAME_JA,
  ReportDefinitionServiceReportFieldAttribute.JSON_PROPERTY_FIELD_NAME,
  ReportDefinitionServiceReportFieldAttribute.JSON_PROPERTY_FIELD_TYPE,
  ReportDefinitionServiceReportFieldAttribute.JSON_PROPERTY_IMPOSSIBLE_COMBINATION_FIELDS,
  ReportDefinitionServiceReportFieldAttribute.JSON_PROPERTY_XML_ATTRIBUTE_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportDefinitionServiceReportFieldAttribute {
  public static final String JSON_PROPERTY_FILTERABLE = "filterable";
  private Boolean filterable;

  public static final String JSON_PROPERTY_SELECTABLE = "selectable";
  private Boolean selectable;

  public static final String JSON_PROPERTY_DISPLAY_FIELD_NAME_EN = "displayFieldNameEn";
  private String displayFieldNameEn;

  public static final String JSON_PROPERTY_DISPLAY_FIELD_NAME_JA = "displayFieldNameJa";
  private String displayFieldNameJa;

  public static final String JSON_PROPERTY_FIELD_NAME = "fieldName";
  private String fieldName;

  public static final String JSON_PROPERTY_FIELD_TYPE = "fieldType";
  private String fieldType;

  public static final String JSON_PROPERTY_IMPOSSIBLE_COMBINATION_FIELDS = "impossibleCombinationFields";
  private List<String> impossibleCombinationFields;

  public static final String JSON_PROPERTY_XML_ATTRIBUTE_NAME = "xmlAttributeName";
  private String xmlAttributeName;

  public ReportDefinitionServiceReportFieldAttribute() {
  }

  public ReportDefinitionServiceReportFieldAttribute filterable(Boolean filterable) {
    
    this.filterable = filterable;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ユーザーがこのフィールドにフィルタを 適用できるかどうかを示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Indicate if use can filter the fields.&lt;/div&gt; 
   * @return filterable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFilterable() {
    return filterable;
  }


  @JsonProperty(JSON_PROPERTY_FILTERABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterable(Boolean filterable) {
    this.filterable = filterable;
  }


  public ReportDefinitionServiceReportFieldAttribute selectable(Boolean selectable) {
    
    this.selectable = selectable;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ユーザーがこのフィールドを 選択できるかどうかを示します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Indicate if user can select the fields.&lt;/div&gt; 
   * @return selectable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSelectable() {
    return selectable;
  }


  @JsonProperty(JSON_PROPERTY_SELECTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelectable(Boolean selectable) {
    this.selectable = selectable;
  }


  public ReportDefinitionServiceReportFieldAttribute displayFieldNameEn(String displayFieldNameEn) {
    
    this.displayFieldNameEn = displayFieldNameEn;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ダウンロードされたレポートに 表示される英語名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Field name displayed in downloaded report (in English).&lt;/div&gt; 
   * @return displayFieldNameEn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayFieldNameEn() {
    return displayFieldNameEn;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_EN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayFieldNameEn(String displayFieldNameEn) {
    this.displayFieldNameEn = displayFieldNameEn;
  }


  public ReportDefinitionServiceReportFieldAttribute displayFieldNameJa(String displayFieldNameJa) {
    
    this.displayFieldNameJa = displayFieldNameJa;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ダウンロードされたレポートに 表示される日本語名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Field name displayed in downloaded report (in Japanese).&lt;/div&gt; 
   * @return displayFieldNameJa
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayFieldNameJa() {
    return displayFieldNameJa;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_JA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayFieldNameJa(String displayFieldNameJa) {
    this.displayFieldNameJa = displayFieldNameJa;
  }


  public ReportDefinitionServiceReportFieldAttribute fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィールド名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Field name.&lt;/div&gt; 
   * @return fieldName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldName() {
    return fieldName;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public ReportDefinitionServiceReportFieldAttribute fieldType(String fieldType) {
    
    this.fieldType = fieldType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィールドの種類です。&lt;br&gt; 数字、文字列、Enum値等を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Type of field.&lt;br&gt; Displays int, string, Enum, etc.&lt;/div&gt; 
   * @return fieldType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldType() {
    return fieldType;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }


  public ReportDefinitionServiceReportFieldAttribute impossibleCombinationFields(List<String> impossibleCombinationFields) {
    
    this.impossibleCombinationFields = impossibleCombinationFields;
    return this;
  }

  public ReportDefinitionServiceReportFieldAttribute addImpossibleCombinationFieldsItem(String impossibleCombinationFieldsItem) {
    if (this.impossibleCombinationFields == null) {
      this.impossibleCombinationFields = new ArrayList<>();
    }
    this.impossibleCombinationFields.add(impossibleCombinationFieldsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;組み合わせができないレポートフィールドです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Report fields which cannot be combined.&lt;/div&gt; 
   * @return impossibleCombinationFields
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPOSSIBLE_COMBINATION_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getImpossibleCombinationFields() {
    return impossibleCombinationFields;
  }


  @JsonProperty(JSON_PROPERTY_IMPOSSIBLE_COMBINATION_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpossibleCombinationFields(List<String> impossibleCombinationFields) {
    this.impossibleCombinationFields = impossibleCombinationFields;
  }


  public ReportDefinitionServiceReportFieldAttribute xmlAttributeName(String xmlAttributeName) {
    
    this.xmlAttributeName = xmlAttributeName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ダウンロードしたレポートの XMLアトリビュートです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;XML attribute name displayed in downloaded report.&lt;/div&gt; 
   * @return xmlAttributeName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XML_ATTRIBUTE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getXmlAttributeName() {
    return xmlAttributeName;
  }


  @JsonProperty(JSON_PROPERTY_XML_ATTRIBUTE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXmlAttributeName(String xmlAttributeName) {
    this.xmlAttributeName = xmlAttributeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceReportFieldAttribute reportDefinitionServiceReportFieldAttribute = (ReportDefinitionServiceReportFieldAttribute) o;
    return Objects.equals(this.filterable, reportDefinitionServiceReportFieldAttribute.filterable) &&
        Objects.equals(this.selectable, reportDefinitionServiceReportFieldAttribute.selectable) &&
        Objects.equals(this.displayFieldNameEn, reportDefinitionServiceReportFieldAttribute.displayFieldNameEn) &&
        Objects.equals(this.displayFieldNameJa, reportDefinitionServiceReportFieldAttribute.displayFieldNameJa) &&
        Objects.equals(this.fieldName, reportDefinitionServiceReportFieldAttribute.fieldName) &&
        Objects.equals(this.fieldType, reportDefinitionServiceReportFieldAttribute.fieldType) &&
        Objects.equals(this.impossibleCombinationFields, reportDefinitionServiceReportFieldAttribute.impossibleCombinationFields) &&
        Objects.equals(this.xmlAttributeName, reportDefinitionServiceReportFieldAttribute.xmlAttributeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterable, selectable, displayFieldNameEn, displayFieldNameJa, fieldName, fieldType, impossibleCombinationFields, xmlAttributeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceReportFieldAttribute {\n");
    sb.append("    filterable: ").append(toIndentedString(filterable)).append("\n");
    sb.append("    selectable: ").append(toIndentedString(selectable)).append("\n");
    sb.append("    displayFieldNameEn: ").append(toIndentedString(displayFieldNameEn)).append("\n");
    sb.append("    displayFieldNameJa: ").append(toIndentedString(displayFieldNameJa)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    impossibleCombinationFields: ").append(toIndentedString(impossibleCombinationFields)).append("\n");
    sb.append("    xmlAttributeName: ").append(toIndentedString(xmlAttributeName)).append("\n");
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

