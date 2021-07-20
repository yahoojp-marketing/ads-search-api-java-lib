package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupWebpageServiceOperator;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupWebpageServiceWebpageConditionType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceWebpageConditionオブジェクトは、Webpageの条件を保持します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceWebpageCondition object contains the rules of webpage.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageServiceWebpageConditionオブジェクトは、Webpageの条件を保持します。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。</div> <div lang=\"en\">AdGroupWebpageServiceWebpageCondition object contains the rules of webpage.<br> This field is required in ADD operation, and will be ignored in SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupWebpageServiceWebpageCondition   {
  @JsonProperty("argument")
  private String argument = null;

  @JsonProperty("webpageConditionType")
  private AdGroupWebpageServiceWebpageConditionType webpageConditionType = null;

  @JsonProperty("operator")
  private AdGroupWebpageServiceOperator operator = null;

  public AdGroupWebpageServiceWebpageCondition argument(String argument) {
    this.argument = argument;
    return this;
  }

  /**
   * <div lang=\"ja\">条件の設定値(正規表現の指定可)です。<br>ADD時、このフィールドは必須です。※typeがALL_PAGESの場合は省略可能となります。SET時、このフィールドは無視されます。</div> <div lang=\"en\">Value of rule setting (Can specify regular expression)<br>This field is required in ADD operation, and will be ignored in SET operation. *If type is 'ALL_PAGES', this field is optional in ADD operation.</div> 
   * @return argument
  */
  @ApiModelProperty(value = "<div lang=\"ja\">条件の設定値(正規表現の指定可)です。<br>ADD時、このフィールドは必須です。※typeがALL_PAGESの場合は省略可能となります。SET時、このフィールドは無視されます。</div> <div lang=\"en\">Value of rule setting (Can specify regular expression)<br>This field is required in ADD operation, and will be ignored in SET operation. *If type is 'ALL_PAGES', this field is optional in ADD operation.</div> ")


  public String getArgument() {
    return argument;
  }

  public void setArgument(String argument) {
    this.argument = argument;
  }

  public AdGroupWebpageServiceWebpageCondition webpageConditionType(AdGroupWebpageServiceWebpageConditionType webpageConditionType) {
    this.webpageConditionType = webpageConditionType;
    return this;
  }

  /**
   * Get webpageConditionType
   * @return webpageConditionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupWebpageServiceWebpageConditionType getWebpageConditionType() {
    return webpageConditionType;
  }

  public void setWebpageConditionType(AdGroupWebpageServiceWebpageConditionType webpageConditionType) {
    this.webpageConditionType = webpageConditionType;
  }

  public AdGroupWebpageServiceWebpageCondition operator(AdGroupWebpageServiceOperator operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupWebpageServiceOperator getOperator() {
    return operator;
  }

  public void setOperator(AdGroupWebpageServiceOperator operator) {
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
    AdGroupWebpageServiceWebpageCondition adGroupWebpageServiceWebpageCondition = (AdGroupWebpageServiceWebpageCondition) o;
    return Objects.equals(this.argument, adGroupWebpageServiceWebpageCondition.argument) &&
        Objects.equals(this.webpageConditionType, adGroupWebpageServiceWebpageCondition.webpageConditionType) &&
        Objects.equals(this.operator, adGroupWebpageServiceWebpageCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(argument, webpageConditionType, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceWebpageCondition {\n");
    
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    webpageConditionType: ").append(toIndentedString(webpageConditionType)).append("\n");
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

