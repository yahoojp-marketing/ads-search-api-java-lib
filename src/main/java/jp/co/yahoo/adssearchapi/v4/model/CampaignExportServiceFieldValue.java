package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.CampaignExportServiceFieldAttribute;
import jp.co.yahoo.adssearchapi.v4.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceFieldValue オブジェクトは、実行結果(全Entityのリスト)を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceFieldValue object contains the results (list of all entities).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignExportServiceFieldValue オブジェクトは、実行結果(全Entityのリスト)を保持します。</div> <div lang=\"en\">CampaignExportServiceFieldValue object contains the results (list of all entities).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignExportServiceFieldValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("fieldAttributes")
  @Valid
  private List<CampaignExportServiceFieldAttribute> fieldAttributes = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public CampaignExportServiceFieldValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CampaignExportServiceFieldValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public CampaignExportServiceFieldValue fieldAttributes(List<CampaignExportServiceFieldAttribute> fieldAttributes) {
    this.fieldAttributes = fieldAttributes;
    return this;
  }

  public CampaignExportServiceFieldValue addFieldAttributesItem(CampaignExportServiceFieldAttribute fieldAttributesItem) {
    if (this.fieldAttributes == null) {
      this.fieldAttributes = new ArrayList<>();
    }
    this.fieldAttributes.add(fieldAttributesItem);
    return this;
  }

  /**
   * Get fieldAttributes
   * @return fieldAttributes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CampaignExportServiceFieldAttribute> getFieldAttributes() {
    return fieldAttributes;
  }

  public void setFieldAttributes(List<CampaignExportServiceFieldAttribute> fieldAttributes) {
    this.fieldAttributes = fieldAttributes;
  }

  public CampaignExportServiceFieldValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignExportServiceFieldValue campaignExportServiceFieldValue = (CampaignExportServiceFieldValue) o;
    return Objects.equals(this.errors, campaignExportServiceFieldValue.errors) &&
        Objects.equals(this.fieldAttributes, campaignExportServiceFieldValue.fieldAttributes) &&
        Objects.equals(this.operationSucceeded, campaignExportServiceFieldValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, fieldAttributes, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignExportServiceFieldValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    fieldAttributes: ").append(toIndentedString(fieldAttributes)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

