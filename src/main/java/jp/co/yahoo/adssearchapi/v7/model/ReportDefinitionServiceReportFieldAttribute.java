package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReportFieldAttributeオブジェクトは、レポート定義の作成に使用できるフィールドを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceReportFieldAttribute object describes the available field to create report definition.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceReportFieldAttributeオブジェクトは、レポート定義の作成に使用できるフィールドを表します。</div> <div lang=\"en\">ReportDefinitionServiceReportFieldAttribute object describes the available field to create report definition.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceReportFieldAttribute   {
  @JsonProperty("canFilter")
  private Boolean canFilter = null;

  @JsonProperty("canSelect")
  private Boolean canSelect = null;

  @JsonProperty("displayFieldNameEN")
  private String displayFieldNameEN = null;

  @JsonProperty("displayFieldNameJA")
  private String displayFieldNameJA = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("fieldType")
  private String fieldType = null;

  @JsonProperty("impossibleCombinationFields")
  @Valid
  private List<String> impossibleCombinationFields = null;

  @JsonProperty("xmlAttributeName")
  private String xmlAttributeName = null;

  public ReportDefinitionServiceReportFieldAttribute canFilter(Boolean canFilter) {
    this.canFilter = canFilter;
    return this;
  }

  /**
   * <div lang=\"ja\">ユーザーがこのフィールドにフィルタを 適用できるかどうかを示します。</div> <div lang=\"en\">Indicate if use can filter the fields.</div> 
   * @return canFilter
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ユーザーがこのフィールドにフィルタを 適用できるかどうかを示します。</div> <div lang=\"en\">Indicate if use can filter the fields.</div> ")


  public Boolean getCanFilter() {
    return canFilter;
  }

  public void setCanFilter(Boolean canFilter) {
    this.canFilter = canFilter;
  }

  public ReportDefinitionServiceReportFieldAttribute canSelect(Boolean canSelect) {
    this.canSelect = canSelect;
    return this;
  }

  /**
   * <div lang=\"ja\">ユーザーがこのフィールドを 選択できるかどうかを示します。</div> <div lang=\"en\">Indicate if user can select the fields.</div> 
   * @return canSelect
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ユーザーがこのフィールドを 選択できるかどうかを示します。</div> <div lang=\"en\">Indicate if user can select the fields.</div> ")


  public Boolean getCanSelect() {
    return canSelect;
  }

  public void setCanSelect(Boolean canSelect) {
    this.canSelect = canSelect;
  }

  public ReportDefinitionServiceReportFieldAttribute displayFieldNameEN(String displayFieldNameEN) {
    this.displayFieldNameEN = displayFieldNameEN;
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードされたレポートに 表示される英語名です。</div> <div lang=\"en\">Field name displayed in downloaded report (in English).</div> 
   * @return displayFieldNameEN
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードされたレポートに 表示される英語名です。</div> <div lang=\"en\">Field name displayed in downloaded report (in English).</div> ")


  public String getDisplayFieldNameEN() {
    return displayFieldNameEN;
  }

  public void setDisplayFieldNameEN(String displayFieldNameEN) {
    this.displayFieldNameEN = displayFieldNameEN;
  }

  public ReportDefinitionServiceReportFieldAttribute displayFieldNameJA(String displayFieldNameJA) {
    this.displayFieldNameJA = displayFieldNameJA;
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードされたレポートに 表示される日本語名です。</div> <div lang=\"en\">Field name displayed in downloaded report (in Japanese).</div> 
   * @return displayFieldNameJA
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードされたレポートに 表示される日本語名です。</div> <div lang=\"en\">Field name displayed in downloaded report (in Japanese).</div> ")


  public String getDisplayFieldNameJA() {
    return displayFieldNameJA;
  }

  public void setDisplayFieldNameJA(String displayFieldNameJA) {
    this.displayFieldNameJA = displayFieldNameJA;
  }

  public ReportDefinitionServiceReportFieldAttribute fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * <div lang=\"ja\">フィールド名です。</div> <div lang=\"en\">Field name.</div> 
   * @return fieldName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールド名です。</div> <div lang=\"en\">Field name.</div> ")


  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public ReportDefinitionServiceReportFieldAttribute fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * <div lang=\"ja\">フィールドの種類です。<br> 数字、文字列、Enum値等を表します。</div> <div lang=\"en\">Type of field.<br> Displays int, string, Enum, etc.</div> 
   * @return fieldType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールドの種類です。<br> 数字、文字列、Enum値等を表します。</div> <div lang=\"en\">Type of field.<br> Displays int, string, Enum, etc.</div> ")


  public String getFieldType() {
    return fieldType;
  }

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
   * <div lang=\"ja\">組み合わせができないレポートフィールドです。</div> <div lang=\"en\">Report fields which cannot be combined.</div> 
   * @return impossibleCombinationFields
  */
  @ApiModelProperty(value = "<div lang=\"ja\">組み合わせができないレポートフィールドです。</div> <div lang=\"en\">Report fields which cannot be combined.</div> ")


  public List<String> getImpossibleCombinationFields() {
    return impossibleCombinationFields;
  }

  public void setImpossibleCombinationFields(List<String> impossibleCombinationFields) {
    this.impossibleCombinationFields = impossibleCombinationFields;
  }

  public ReportDefinitionServiceReportFieldAttribute xmlAttributeName(String xmlAttributeName) {
    this.xmlAttributeName = xmlAttributeName;
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードしたレポートの XMLアトリビュートです。</div> <div lang=\"en\">XML attribute name displayed in downloaded report.</div> 
   * @return xmlAttributeName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードしたレポートの XMLアトリビュートです。</div> <div lang=\"en\">XML attribute name displayed in downloaded report.</div> ")


  public String getXmlAttributeName() {
    return xmlAttributeName;
  }

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
    return Objects.equals(this.canFilter, reportDefinitionServiceReportFieldAttribute.canFilter) &&
        Objects.equals(this.canSelect, reportDefinitionServiceReportFieldAttribute.canSelect) &&
        Objects.equals(this.displayFieldNameEN, reportDefinitionServiceReportFieldAttribute.displayFieldNameEN) &&
        Objects.equals(this.displayFieldNameJA, reportDefinitionServiceReportFieldAttribute.displayFieldNameJA) &&
        Objects.equals(this.fieldName, reportDefinitionServiceReportFieldAttribute.fieldName) &&
        Objects.equals(this.fieldType, reportDefinitionServiceReportFieldAttribute.fieldType) &&
        Objects.equals(this.impossibleCombinationFields, reportDefinitionServiceReportFieldAttribute.impossibleCombinationFields) &&
        Objects.equals(this.xmlAttributeName, reportDefinitionServiceReportFieldAttribute.xmlAttributeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canFilter, canSelect, displayFieldNameEN, displayFieldNameJA, fieldName, fieldType, impossibleCombinationFields, xmlAttributeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceReportFieldAttribute {\n");
    
    sb.append("    canFilter: ").append(toIndentedString(canFilter)).append("\n");
    sb.append("    canSelect: ").append(toIndentedString(canSelect)).append("\n");
    sb.append("    displayFieldNameEN: ").append(toIndentedString(displayFieldNameEN)).append("\n");
    sb.append("    displayFieldNameJA: ").append(toIndentedString(displayFieldNameJA)).append("\n");
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

