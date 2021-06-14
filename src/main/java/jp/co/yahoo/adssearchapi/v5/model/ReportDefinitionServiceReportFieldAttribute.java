package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceReportFieldAttributeオブジェクトは、レポート定義の作成に使用できるフィールドを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ReportDefinitionServiceReportFieldAttribute object describes the available field to create report definition.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceReportFieldAttributeオブジェクトは、レポート定義の作成に使用できるフィールドを表します。</div> <div lang=\"en\">ReportDefinitionServiceReportFieldAttribute object describes the available field to create report definition.</div> ")

public class ReportDefinitionServiceReportFieldAttribute   {
  @JsonProperty("canFilter")
  private JsonNullable<Boolean> canFilter = JsonNullable.undefined();

  @JsonProperty("canSelect")
  private JsonNullable<Boolean> canSelect = JsonNullable.undefined();

  @JsonProperty("displayFieldNameEN")
  private JsonNullable<String> displayFieldNameEN = JsonNullable.undefined();

  @JsonProperty("displayFieldNameJA")
  private JsonNullable<String> displayFieldNameJA = JsonNullable.undefined();

  @JsonProperty("fieldName")
  private JsonNullable<String> fieldName = JsonNullable.undefined();

  @JsonProperty("fieldType")
  private JsonNullable<String> fieldType = JsonNullable.undefined();

  @JsonProperty("impossibleCombinationFields")
  @Valid
  private JsonNullable<List<String>> impossibleCombinationFields = JsonNullable.undefined();

  @JsonProperty("xmlAttributeName")
  private JsonNullable<String> xmlAttributeName = JsonNullable.undefined();

  public ReportDefinitionServiceReportFieldAttribute canFilter(Boolean canFilter) {
    this.canFilter = JsonNullable.of(canFilter);
    return this;
  }

  /**
   * <div lang=\"ja\">ユーザーがこのフィールドにフィルタを 適用できるかどうかを示します。</div> <div lang=\"en\">Indicate if use can filter the fields.</div> 
   * @return canFilter
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ユーザーがこのフィールドにフィルタを 適用できるかどうかを示します。</div> <div lang=\"en\">Indicate if use can filter the fields.</div> ")


  public JsonNullable<Boolean> getCanFilter() {
    return canFilter;
  }

  public void setCanFilter(JsonNullable<Boolean> canFilter) {
    this.canFilter = canFilter;
  }

  public ReportDefinitionServiceReportFieldAttribute canSelect(Boolean canSelect) {
    this.canSelect = JsonNullable.of(canSelect);
    return this;
  }

  /**
   * <div lang=\"ja\">ユーザーがこのフィールドを 選択できるかどうかを示します。</div> <div lang=\"en\">Indicate if user can select the fields.</div> 
   * @return canSelect
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ユーザーがこのフィールドを 選択できるかどうかを示します。</div> <div lang=\"en\">Indicate if user can select the fields.</div> ")


  public JsonNullable<Boolean> getCanSelect() {
    return canSelect;
  }

  public void setCanSelect(JsonNullable<Boolean> canSelect) {
    this.canSelect = canSelect;
  }

  public ReportDefinitionServiceReportFieldAttribute displayFieldNameEN(String displayFieldNameEN) {
    this.displayFieldNameEN = JsonNullable.of(displayFieldNameEN);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードされたレポートに 表示される英語名です。</div> <div lang=\"en\">Field name displayed in downloaded report (in English).</div> 
   * @return displayFieldNameEN
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードされたレポートに 表示される英語名です。</div> <div lang=\"en\">Field name displayed in downloaded report (in English).</div> ")


  public JsonNullable<String> getDisplayFieldNameEN() {
    return displayFieldNameEN;
  }

  public void setDisplayFieldNameEN(JsonNullable<String> displayFieldNameEN) {
    this.displayFieldNameEN = displayFieldNameEN;
  }

  public ReportDefinitionServiceReportFieldAttribute displayFieldNameJA(String displayFieldNameJA) {
    this.displayFieldNameJA = JsonNullable.of(displayFieldNameJA);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードされたレポートに 表示される日本語名です。</div> <div lang=\"en\">Field name displayed in downloaded report (in Japanese).</div> 
   * @return displayFieldNameJA
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードされたレポートに 表示される日本語名です。</div> <div lang=\"en\">Field name displayed in downloaded report (in Japanese).</div> ")


  public JsonNullable<String> getDisplayFieldNameJA() {
    return displayFieldNameJA;
  }

  public void setDisplayFieldNameJA(JsonNullable<String> displayFieldNameJA) {
    this.displayFieldNameJA = displayFieldNameJA;
  }

  public ReportDefinitionServiceReportFieldAttribute fieldName(String fieldName) {
    this.fieldName = JsonNullable.of(fieldName);
    return this;
  }

  /**
   * <div lang=\"ja\">フィールド名です。</div> <div lang=\"en\">Field name.</div> 
   * @return fieldName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールド名です。</div> <div lang=\"en\">Field name.</div> ")


  public JsonNullable<String> getFieldName() {
    return fieldName;
  }

  public void setFieldName(JsonNullable<String> fieldName) {
    this.fieldName = fieldName;
  }

  public ReportDefinitionServiceReportFieldAttribute fieldType(String fieldType) {
    this.fieldType = JsonNullable.of(fieldType);
    return this;
  }

  /**
   * <div lang=\"ja\">フィールドの種類です。<br> 数字、文字列、Enum値等を表します。</div> <div lang=\"en\">Type of field.<br> Displays int, string, Enum, etc.</div> 
   * @return fieldType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールドの種類です。<br> 数字、文字列、Enum値等を表します。</div> <div lang=\"en\">Type of field.<br> Displays int, string, Enum, etc.</div> ")


  public JsonNullable<String> getFieldType() {
    return fieldType;
  }

  public void setFieldType(JsonNullable<String> fieldType) {
    this.fieldType = fieldType;
  }

  public ReportDefinitionServiceReportFieldAttribute impossibleCombinationFields(List<String> impossibleCombinationFields) {
    this.impossibleCombinationFields = JsonNullable.of(impossibleCombinationFields);
    return this;
  }

  public ReportDefinitionServiceReportFieldAttribute addImpossibleCombinationFieldsItem(String impossibleCombinationFieldsItem) {
    if (this.impossibleCombinationFields == null || !this.impossibleCombinationFields.isPresent()) {
      this.impossibleCombinationFields = JsonNullable.of(new ArrayList<>());
    }
    this.impossibleCombinationFields.get().add(impossibleCombinationFieldsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">組み合わせができないレポートフィールドです。</div> <div lang=\"en\">Report fields which cannot be combined.</div> 
   * @return impossibleCombinationFields
  */
  @ApiModelProperty(value = "<div lang=\"ja\">組み合わせができないレポートフィールドです。</div> <div lang=\"en\">Report fields which cannot be combined.</div> ")


  public JsonNullable<List<String>> getImpossibleCombinationFields() {
    return impossibleCombinationFields;
  }

  public void setImpossibleCombinationFields(JsonNullable<List<String>> impossibleCombinationFields) {
    this.impossibleCombinationFields = impossibleCombinationFields;
  }

  public ReportDefinitionServiceReportFieldAttribute xmlAttributeName(String xmlAttributeName) {
    this.xmlAttributeName = JsonNullable.of(xmlAttributeName);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードしたレポートの XMLアトリビュートです。</div> <div lang=\"en\">XML attribute name displayed in downloaded report.</div> 
   * @return xmlAttributeName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードしたレポートの XMLアトリビュートです。</div> <div lang=\"en\">XML attribute name displayed in downloaded report.</div> ")


  public JsonNullable<String> getXmlAttributeName() {
    return xmlAttributeName;
  }

  public void setXmlAttributeName(JsonNullable<String> xmlAttributeName) {
    this.xmlAttributeName = xmlAttributeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

