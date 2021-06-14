package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.SharedCriterionServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SharedCriterionServiceReturnValueは、実行結果（全エンティティのリスト）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SharedCriterionServiceReturnValue object holds exec results (all entities list).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SharedCriterionServiceReturnValueは、実行結果（全エンティティのリスト）を保持するオブジェクトです。</div> <div lang=\"en\">SharedCriterionServiceReturnValue object holds exec results (all entities list).</div> ")

public class SharedCriterionServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<SharedCriterionServiceValue>> values = JsonNullable.undefined();

  public SharedCriterionServiceReturnValue values(List<SharedCriterionServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public SharedCriterionServiceReturnValue addValuesItem(SharedCriterionServiceValue valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<SharedCriterionServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<SharedCriterionServiceValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedCriterionServiceReturnValue sharedCriterionServiceReturnValue = (SharedCriterionServiceReturnValue) o;
    return Objects.equals(this.values, sharedCriterionServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedCriterionServiceReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

