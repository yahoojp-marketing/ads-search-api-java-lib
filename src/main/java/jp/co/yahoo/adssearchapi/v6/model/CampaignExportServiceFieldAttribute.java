package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceFieldAttribute オブジェクトは、ジョブ作成に使用できるフィールドを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceFieldAttribute object displays available fields for creating jobs.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignExportServiceFieldAttribute オブジェクトは、ジョブ作成に使用できるフィールドを表します。</div> <div lang=\"en\">CampaignExportServiceFieldAttribute object displays available fields for creating jobs.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignExportServiceFieldAttribute   {
  @JsonProperty("displayFieldNameEN")
  private String displayFieldNameEN = null;

  @JsonProperty("displayFieldNameJA")
  private String displayFieldNameJA = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  public CampaignExportServiceFieldAttribute displayFieldNameEN(String displayFieldNameEN) {
    this.displayFieldNameEN = displayFieldNameEN;
    return this;
  }

  /**
   * <div lang=\"ja\">フィールドの英語表示名です。</div> <div lang=\"en\">Display name (EN)</div> 
   * @return displayFieldNameEN
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールドの英語表示名です。</div> <div lang=\"en\">Display name (EN)</div> ")


  public String getDisplayFieldNameEN() {
    return displayFieldNameEN;
  }

  public void setDisplayFieldNameEN(String displayFieldNameEN) {
    this.displayFieldNameEN = displayFieldNameEN;
  }

  public CampaignExportServiceFieldAttribute displayFieldNameJA(String displayFieldNameJA) {
    this.displayFieldNameJA = displayFieldNameJA;
    return this;
  }

  /**
   * <div lang=\"ja\">フィールドの日本語表示名です。</div> <div lang=\"en\">Display name (JA)</div> 
   * @return displayFieldNameJA
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールドの日本語表示名です。</div> <div lang=\"en\">Display name (JA)</div> ")


  public String getDisplayFieldNameJA() {
    return displayFieldNameJA;
  }

  public void setDisplayFieldNameJA(String displayFieldNameJA) {
    this.displayFieldNameJA = displayFieldNameJA;
  }

  public CampaignExportServiceFieldAttribute fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * <div lang=\"ja\">フィールド名です。</div> <div lang=\"en\">Field name</div> 
   * @return fieldName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">フィールド名です。</div> <div lang=\"en\">Field name</div> ")


  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignExportServiceFieldAttribute campaignExportServiceFieldAttribute = (CampaignExportServiceFieldAttribute) o;
    return Objects.equals(this.displayFieldNameEN, campaignExportServiceFieldAttribute.displayFieldNameEN) &&
        Objects.equals(this.displayFieldNameJA, campaignExportServiceFieldAttribute.displayFieldNameJA) &&
        Objects.equals(this.fieldName, campaignExportServiceFieldAttribute.fieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayFieldNameEN, displayFieldNameJA, fieldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignExportServiceFieldAttribute {\n");
    
    sb.append("    displayFieldNameEN: ").append(toIndentedString(displayFieldNameEN)).append("\n");
    sb.append("    displayFieldNameJA: ").append(toIndentedString(displayFieldNameJA)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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

