package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.Error;
import jp.co.yahoo.adssearchapi.v4.model.SharedCriterion;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SharedCriterionServiceValueは、実行結果（1エンティティ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SharedCriterionServiceValue object holds exec result (1 entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SharedCriterionServiceValueは、実行結果（1エンティティ）を保持するオブジェクトです。</div> <div lang=\"en\">SharedCriterionServiceValue object holds exec result (1 entity).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SharedCriterionServiceValue   {
  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  @JsonProperty("sharedCriterion")
  private SharedCriterion sharedCriterion = null;

  public SharedCriterionServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public SharedCriterionServiceValue addErrorsItem(Error errorsItem) {
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

  public SharedCriterionServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation result.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation result.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }

  public SharedCriterionServiceValue sharedCriterion(SharedCriterion sharedCriterion) {
    this.sharedCriterion = sharedCriterion;
    return this;
  }

  /**
   * Get sharedCriterion
   * @return sharedCriterion
  */
  @ApiModelProperty(value = "")

  @Valid

  public SharedCriterion getSharedCriterion() {
    return sharedCriterion;
  }

  public void setSharedCriterion(SharedCriterion sharedCriterion) {
    this.sharedCriterion = sharedCriterion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedCriterionServiceValue sharedCriterionServiceValue = (SharedCriterionServiceValue) o;
    return Objects.equals(this.errors, sharedCriterionServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, sharedCriterionServiceValue.operationSucceeded) &&
        Objects.equals(this.sharedCriterion, sharedCriterionServiceValue.sharedCriterion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, sharedCriterion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedCriterionServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    sharedCriterion: ").append(toIndentedString(sharedCriterion)).append("\n");
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

