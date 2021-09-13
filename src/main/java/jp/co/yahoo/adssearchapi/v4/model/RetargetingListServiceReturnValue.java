package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceReturnValueは、ターゲットリストの実行結果（全Entityのリスト）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceReturnValue is an object that holds results (list of all entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceReturnValueは、ターゲットリストの実行結果（全Entityのリスト）を保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceReturnValue is an object that holds results (list of all entity).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<RetargetingListServiceValue> values = null;

  public RetargetingListServiceReturnValue values(List<RetargetingListServiceValue> values) {
    this.values = values;
    return this;
  }

  public RetargetingListServiceReturnValue addValuesItem(RetargetingListServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RetargetingListServiceValue> getValues() {
    return values;
  }

  public void setValues(List<RetargetingListServiceValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceReturnValue retargetingListServiceReturnValue = (RetargetingListServiceReturnValue) o;
    return Objects.equals(this.values, retargetingListServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

