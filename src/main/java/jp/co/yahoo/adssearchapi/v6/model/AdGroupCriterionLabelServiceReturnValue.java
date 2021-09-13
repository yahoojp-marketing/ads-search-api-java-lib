package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupCriterionLabelServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionLabelServiceReturnValueオブジェクトは、広告グループのクライテリアラベル情報を含む操作結果として戻される値を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionLabelServiceReturnValue object describes value returned as the operation result including ad group criterion label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionLabelServiceReturnValueオブジェクトは、広告グループのクライテリアラベル情報を含む操作結果として戻される値を表します。</div> <div lang=\"en\">AdGroupCriterionLabelServiceReturnValue object describes value returned as the operation result including ad group criterion label information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionLabelServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<AdGroupCriterionLabelServiceValue> values = null;

  public AdGroupCriterionLabelServiceReturnValue values(List<AdGroupCriterionLabelServiceValue> values) {
    this.values = values;
    return this;
  }

  public AdGroupCriterionLabelServiceReturnValue addValuesItem(AdGroupCriterionLabelServiceValue valuesItem) {
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

  public List<AdGroupCriterionLabelServiceValue> getValues() {
    return values;
  }

  public void setValues(List<AdGroupCriterionLabelServiceValue> values) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

