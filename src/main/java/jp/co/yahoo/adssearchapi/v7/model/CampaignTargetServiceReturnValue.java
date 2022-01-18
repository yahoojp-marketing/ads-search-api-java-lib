package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.CampaignTargetServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaigｎTargetReturnValueオブジェクトは、操作結果を含むキャンペーンのターゲット設定に関する情報のコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Container for campaign target setting and its operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaigｎTargetReturnValueオブジェクトは、操作結果を含むキャンペーンのターゲット設定に関する情報のコンテナです。</div> <div lang=\"en\">Container for campaign target setting and its operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignTargetServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<CampaignTargetServiceValue> values = null;

  public CampaignTargetServiceReturnValue values(List<CampaignTargetServiceValue> values) {
    this.values = values;
    return this;
  }

  public CampaignTargetServiceReturnValue addValuesItem(CampaignTargetServiceValue valuesItem) {
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

  public List<CampaignTargetServiceValue> getValues() {
    return values;
  }

  public void setValues(List<CampaignTargetServiceValue> values) {
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
    CampaignTargetServiceReturnValue campaignTargetServiceReturnValue = (CampaignTargetServiceReturnValue) o;
    return Objects.equals(this.values, campaignTargetServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServiceReturnValue {\n");
    
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

