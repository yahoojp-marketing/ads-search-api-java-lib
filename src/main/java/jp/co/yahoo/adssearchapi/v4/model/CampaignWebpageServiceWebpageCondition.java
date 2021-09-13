package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.CampaignWebpageServiceWebpageConditionType;
import jp.co.yahoo.adssearchapi.v4.model.CampaignWebpageServiceWebpageOperator;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignWebpageServiceWebpageConditionオブジェクトは、Webpageの条件を保持します。&lt;br&gt; このフィールドは、ADD時に必須となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignWebpageServiceWebpageCondition object contains the rules of webpage.&lt;br&gt; This field is required in ADD operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignWebpageServiceWebpageConditionオブジェクトは、Webpageの条件を保持します。<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。</div> <div lang=\"en\">CampaignWebpageServiceWebpageCondition object contains the rules of webpage.<br> This field is required in ADD operation, and will be ignored in REMOVE operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignWebpageServiceWebpageCondition   {
  @JsonProperty("argument")
  private String argument = null;

  @JsonProperty("type")
  private CampaignWebpageServiceWebpageConditionType type = null;

  @JsonProperty("operator")
  private CampaignWebpageServiceWebpageOperator operator = null;

  public CampaignWebpageServiceWebpageCondition argument(String argument) {
    this.argument = argument;
    return this;
  }

  /**
   * <div lang=\"ja\">条件の設定値(正規表現の指定可)です。<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。</div> <div lang=\"en\">Value of rule setting. ∗ Can specify regular expression.<br> This field is required in ADD operation, and will be ignored in REMOVE operation.</div> 
   * @return argument
  */
  @ApiModelProperty(value = "<div lang=\"ja\">条件の設定値(正規表現の指定可)です。<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。</div> <div lang=\"en\">Value of rule setting. ∗ Can specify regular expression.<br> This field is required in ADD operation, and will be ignored in REMOVE operation.</div> ")


  public String getArgument() {
    return argument;
  }

  public void setArgument(String argument) {
    this.argument = argument;
  }

  public CampaignWebpageServiceWebpageCondition type(CampaignWebpageServiceWebpageConditionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignWebpageServiceWebpageConditionType getType() {
    return type;
  }

  public void setType(CampaignWebpageServiceWebpageConditionType type) {
    this.type = type;
  }

  public CampaignWebpageServiceWebpageCondition operator(CampaignWebpageServiceWebpageOperator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignWebpageServiceWebpageOperator getOperator() {
    return operator;
  }

  public void setOperator(CampaignWebpageServiceWebpageOperator operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignWebpageServiceWebpageCondition campaignWebpageServiceWebpageCondition = (CampaignWebpageServiceWebpageCondition) o;
    return Objects.equals(this.argument, campaignWebpageServiceWebpageCondition.argument) &&
        Objects.equals(this.type, campaignWebpageServiceWebpageCondition.type) &&
        Objects.equals(this.operator, campaignWebpageServiceWebpageCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argument, type, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignWebpageServiceWebpageCondition {\n");
    
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

