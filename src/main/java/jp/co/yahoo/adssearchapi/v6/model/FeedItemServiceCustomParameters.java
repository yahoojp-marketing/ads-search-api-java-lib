package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.FeedItemServiceCustomParameter;
import jp.co.yahoo.adssearchapi.v6.model.FeedItemServiceIsRemove;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。&lt;br&gt; CustomParametersおよびReviewCustomParameters配下では、このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※CustomParameters配下でのみ、クイックリンクオプションの場合、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; Under customParameters and ReviewCustomParameters, this field will be  returned in the response, but it will be ignored on input.&lt;br&gt; *Under customParameters, this field will be optional  in ADD and SET operation for QUICKLINK option.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。<br> CustomParametersおよびReviewCustomParameters配下では、このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※CustomParameters配下でのみ、クイックリンクオプションの場合、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">FeedItemServiceCustomParameters displays the setting of custom parameters.<br> Under customParameters and ReviewCustomParameters, this field will be  returned in the response, but it will be ignored on input.<br> *Under customParameters, this field will be optional  in ADD and SET operation for QUICKLINK option.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceCustomParameters   {
  @JsonProperty("isRemove")
  private FeedItemServiceIsRemove isRemove = null;

  @JsonProperty("parameters")
  @Valid
  private List<FeedItemServiceCustomParameter> parameters = null;

  public FeedItemServiceCustomParameters isRemove(FeedItemServiceIsRemove isRemove) {
    this.isRemove = isRemove;
    return this;
  }

  /**
   * Get isRemove
   * @return isRemove
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedItemServiceIsRemove getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(FeedItemServiceIsRemove isRemove) {
    this.isRemove = isRemove;
  }

  public FeedItemServiceCustomParameters parameters(List<FeedItemServiceCustomParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public FeedItemServiceCustomParameters addParametersItem(FeedItemServiceCustomParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FeedItemServiceCustomParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<FeedItemServiceCustomParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceCustomParameters feedItemServiceCustomParameters = (FeedItemServiceCustomParameters) o;
    return Objects.equals(this.isRemove, feedItemServiceCustomParameters.isRemove) &&
        Objects.equals(this.parameters, feedItemServiceCustomParameters.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRemove, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceCustomParameters {\n");
    
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

