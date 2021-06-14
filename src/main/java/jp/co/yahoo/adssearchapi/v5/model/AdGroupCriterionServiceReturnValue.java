package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceReturnValueオブジェクトは、処理結果を含む広告グループのクライテリアに関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceReturnValue object is a container which has ad group criteria information including its operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceReturnValueオブジェクトは、処理結果を含む広告グループのクライテリアに関する情報を表します。</div> <div lang=\"en\">AdGroupCriterionServiceReturnValue object is a container which has ad group criteria information including its operation results.</div> ")

public class AdGroupCriterionServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<AdGroupCriterionServiceValue>> values = JsonNullable.undefined();

  public AdGroupCriterionServiceReturnValue values(List<AdGroupCriterionServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public AdGroupCriterionServiceReturnValue addValuesItem(AdGroupCriterionServiceValue valuesItem) {
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

  public JsonNullable<List<AdGroupCriterionServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<AdGroupCriterionServiceValue>> values) {
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
    AdGroupCriterionServiceReturnValue adGroupCriterionServiceReturnValue = (AdGroupCriterionServiceReturnValue) o;
    return Objects.equals(this.values, adGroupCriterionServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceReturnValue {\n");
    
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

