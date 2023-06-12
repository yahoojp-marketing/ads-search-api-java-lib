/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v11.model.FeedItemServiceCustomParameter;
import jp.co.yahoo.adssearchapi.v11.model.FeedItemServiceIsRemove;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。&lt;br&gt; CustomParametersおよびReviewCustomParameters配下では、このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※CustomParameters配下でのみ、クイックリンクオプションの場合、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceCustomParameters displays the setting of custom parameters.&lt;br&gt; Under customParameters and ReviewCustomParameters, this field will be  returned in the response, but it will be ignored on input.&lt;br&gt; *Under customParameters, this field will be optional  in ADD and SET operation for QUICKLINK option.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceCustomParametersオブジェクトは、カスタムパラメータの設定を表します。<br> CustomParametersおよびReviewCustomParameters配下では、このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※CustomParameters配下でのみ、クイックリンクオプションの場合、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">FeedItemServiceCustomParameters displays the setting of custom parameters.<br> Under customParameters and ReviewCustomParameters, this field will be  returned in the response, but it will be ignored on input.<br> *Under customParameters, this field will be optional  in ADD and SET operation for QUICKLINK option.</div> ")
@JsonPropertyOrder({
  FeedItemServiceCustomParameters.JSON_PROPERTY_IS_REMOVE,
  FeedItemServiceCustomParameters.JSON_PROPERTY_PARAMETERS
})
@JsonTypeName("FeedItemServiceCustomParameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItemServiceCustomParameters {
  public static final String JSON_PROPERTY_IS_REMOVE = "isRemove";
  private FeedItemServiceIsRemove isRemove;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<FeedItemServiceCustomParameter> parameters = null;

  public FeedItemServiceCustomParameters() { 
  }

  public FeedItemServiceCustomParameters isRemove(FeedItemServiceIsRemove isRemove) {
    
    this.isRemove = isRemove;
    return this;
  }

   /**
   * Get isRemove
   * @return isRemove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceIsRemove getIsRemove() {
    return isRemove;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeedItemServiceCustomParameter> getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

