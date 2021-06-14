package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceTargetingList;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceValueは、ターゲットリストのの実行結果（1 Entity）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceValue is an object that holds results (one entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceValueは、ターゲットリストのの実行結果（1 Entity）を保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceValue is an object that holds results (one entity).</div> ")

public class RetargetingListServiceValue   {
  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  @JsonProperty("targetList")
  private JsonNullable<RetargetingListServiceTargetingList> targetList = JsonNullable.undefined();

  public RetargetingListServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public RetargetingListServiceValue addErrorsItem(Error errorsItem) {
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

  public RetargetingListServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Displays process result.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Displays process result.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }

  public RetargetingListServiceValue targetList(RetargetingListServiceTargetingList targetList) {
    this.targetList = JsonNullable.of(targetList);
    return this;
  }

  /**
   * Get targetList
   * @return targetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceTargetingList> getTargetList() {
    return targetList;
  }

  public void setTargetList(JsonNullable<RetargetingListServiceTargetingList> targetList) {
    this.targetList = targetList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceValue retargetingListServiceValue = (RetargetingListServiceValue) o;
    return Objects.equals(this.errors, retargetingListServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, retargetingListServiceValue.operationSucceeded) &&
        Objects.equals(this.targetList, retargetingListServiceValue.targetList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, targetList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceValue {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    targetList: ").append(toIndentedString(targetList)).append("\n");
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

