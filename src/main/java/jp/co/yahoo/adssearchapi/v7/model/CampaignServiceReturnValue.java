package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.CampaignServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceReturnValueオブジェクトは、キャンペーンの情報を含む操作結果として戻される値を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceReturnValue object is a container which has campaign information including its operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceReturnValueオブジェクトは、キャンペーンの情報を含む操作結果として戻される値を表します。</div> <div lang=\"en\">CampaignServiceReturnValue object is a container which has campaign information including its operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<CampaignServiceValue> values = null;

  public CampaignServiceReturnValue values(List<CampaignServiceValue> values) {
    this.values = values;
    return this;
  }

  public CampaignServiceReturnValue addValuesItem(CampaignServiceValue valuesItem) {
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

  public List<CampaignServiceValue> getValues() {
    return values;
  }

  public void setValues(List<CampaignServiceValue> values) {
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
    CampaignServiceReturnValue campaignServiceReturnValue = (CampaignServiceReturnValue) o;
    return Objects.equals(this.values, campaignServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceReturnValue {\n");
    
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

