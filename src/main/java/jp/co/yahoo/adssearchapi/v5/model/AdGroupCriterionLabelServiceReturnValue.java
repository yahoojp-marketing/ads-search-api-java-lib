package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionLabelServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionLabelServiceReturnValueオブジェクトは、広告グループのクライテリアラベル情報を含む操作結果として戻される値を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionLabelServiceReturnValue object describes value returned as the operation result including ad group criterion label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionLabelServiceReturnValueオブジェクトは、広告グループのクライテリアラベル情報を含む操作結果として戻される値を表します。</div> <div lang=\"en\">AdGroupCriterionLabelServiceReturnValue object describes value returned as the operation result including ad group criterion label information.</div> ")

public class AdGroupCriterionLabelServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<AdGroupCriterionLabelServiceValue>> values = JsonNullable.undefined();

  public AdGroupCriterionLabelServiceReturnValue values(List<AdGroupCriterionLabelServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public AdGroupCriterionLabelServiceReturnValue addValuesItem(AdGroupCriterionLabelServiceValue valuesItem) {
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

  public JsonNullable<List<AdGroupCriterionLabelServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<AdGroupCriterionLabelServiceValue>> values) {
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
    AdGroupCriterionLabelServiceReturnValue adGroupCriterionLabelServiceReturnValue = (AdGroupCriterionLabelServiceReturnValue) o;
    return Objects.equals(this.values, adGroupCriterionLabelServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionLabelServiceReturnValue {\n");
    
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

