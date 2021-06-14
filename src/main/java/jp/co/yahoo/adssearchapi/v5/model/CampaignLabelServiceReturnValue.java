package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignLabelServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignLabelServiceReturnValueオブジェクトは、キャンペーンの情報を含む操作結果として戻される値を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignLabelServiceReturnValue object describes value returned as operation result including campaign label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignLabelServiceReturnValueオブジェクトは、キャンペーンの情報を含む操作結果として戻される値を表します。</div> <div lang=\"en\">CampaignLabelServiceReturnValue object describes value returned as operation result including campaign label information.</div> ")

public class CampaignLabelServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<CampaignLabelServiceValue>> values = JsonNullable.undefined();

  public CampaignLabelServiceReturnValue values(List<CampaignLabelServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public CampaignLabelServiceReturnValue addValuesItem(CampaignLabelServiceValue valuesItem) {
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

  public JsonNullable<List<CampaignLabelServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<CampaignLabelServiceValue>> values) {
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
    CampaignLabelServiceReturnValue campaignLabelServiceReturnValue = (CampaignLabelServiceReturnValue) o;
    return Objects.equals(this.values, campaignLabelServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignLabelServiceReturnValue {\n");
    
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

