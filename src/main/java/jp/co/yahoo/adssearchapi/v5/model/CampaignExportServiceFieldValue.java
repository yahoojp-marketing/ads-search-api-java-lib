package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignExportServiceFieldAttribute;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceFieldValue オブジェクトは、実行結果(全Entityのリスト)を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceFieldValue object contains the results (list of all entities).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignExportServiceFieldValue オブジェクトは、実行結果(全Entityのリスト)を保持します。</div> <div lang=\"en\">CampaignExportServiceFieldValue object contains the results (list of all entities).</div> ")

public class CampaignExportServiceFieldValue   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("fieldAttributes")
  @Valid
  private JsonNullable<List<CampaignExportServiceFieldAttribute>> fieldAttributes = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public CampaignExportServiceFieldValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public CampaignExportServiceFieldValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public CampaignExportServiceFieldValue fieldAttributes(List<CampaignExportServiceFieldAttribute> fieldAttributes) {
    this.fieldAttributes = JsonNullable.of(fieldAttributes);
    return this;
  }

  public CampaignExportServiceFieldValue addFieldAttributesItem(CampaignExportServiceFieldAttribute fieldAttributesItem) {
    if (this.fieldAttributes == null || !this.fieldAttributes.isPresent()) {
      this.fieldAttributes = JsonNullable.of(new ArrayList<>());
    }
    this.fieldAttributes.get().add(fieldAttributesItem);
    return this;
  }

  /**
   * Get fieldAttributes
   * @return fieldAttributes
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<CampaignExportServiceFieldAttribute>> getFieldAttributes() {
    return fieldAttributes;
  }

  public void setFieldAttributes(JsonNullable<List<CampaignExportServiceFieldAttribute>> fieldAttributes) {
    this.fieldAttributes = fieldAttributes;
  }

  public CampaignExportServiceFieldValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

