package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupWebpageServiceWebpageCondition;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceWebpageParameterオブジェクトは、配信/除外設定するWebpageの条件リストを保持します。 条件リストはAND条件で適用されます。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceWebpageParameter contains the rule list of webpage to be allowed or excluded. The rule list is applied in the AND condition.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageServiceWebpageParameterオブジェクトは、配信/除外設定するWebpageの条件リストを保持します。 条件リストはAND条件で適用されます。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。</div> <div lang=\"en\">AdGroupWebpageServiceWebpageParameter contains the rule list of webpage to be allowed or excluded. The rule list is applied in the AND condition.<br> This field is required in ADD operation, and will be ignored in SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupWebpageServiceWebpageParameter   {
  @JsonProperty("conditions")
  @Valid
  private List<AdGroupWebpageServiceWebpageCondition> conditions = null;

  public AdGroupWebpageServiceWebpageParameter conditions(List<AdGroupWebpageServiceWebpageCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public AdGroupWebpageServiceWebpageParameter addConditionsItem(AdGroupWebpageServiceWebpageCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Get conditions
   * @return conditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupWebpageServiceWebpageCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<AdGroupWebpageServiceWebpageCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupWebpageServiceWebpageParameter adGroupWebpageServiceWebpageParameter = (AdGroupWebpageServiceWebpageParameter) o;
    return Objects.equals(this.conditions, adGroupWebpageServiceWebpageParameter.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceWebpageParameter {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

