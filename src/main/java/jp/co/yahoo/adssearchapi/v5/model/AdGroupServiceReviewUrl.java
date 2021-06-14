package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceCustomParameter;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceReviewUrlオブジェクトは、トラッキングURLとカスタムパラメータを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceReviewUrl object siplays the Tracking URL and Custom Parameter.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceReviewUrlオブジェクトは、トラッキングURLとカスタムパラメータを表します。</div> <div lang=\"en\">AdGroupServiceReviewUrl object siplays the Tracking URL and Custom Parameter.</div> ")

public class AdGroupServiceReviewUrl   {
  @JsonProperty("parameters")
  @Valid
  private JsonNullable<List<AdGroupServiceCustomParameter>> parameters = JsonNullable.undefined();

  @JsonProperty("trackingUrl")
  private JsonNullable<String> trackingUrl = JsonNullable.undefined();

  public AdGroupServiceReviewUrl parameters(List<AdGroupServiceCustomParameter> parameters) {
    this.parameters = JsonNullable.of(parameters);
    return this;
  }

  public AdGroupServiceReviewUrl addParametersItem(AdGroupServiceCustomParameter parametersItem) {
    if (this.parameters == null || !this.parameters.isPresent()) {
      this.parameters = JsonNullable.of(new ArrayList<>());
    }
    this.parameters.get().add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<AdGroupServiceCustomParameter>> getParameters() {
    return parameters;
  }

  public void setParameters(JsonNullable<List<AdGroupServiceCustomParameter>> parameters) {
    this.parameters = parameters;
  }

  public AdGroupServiceReviewUrl trackingUrl(String trackingUrl) {
    this.trackingUrl = JsonNullable.of(trackingUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。</div> <div lang=\"en\">Tracking URL.</div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。</div> <div lang=\"en\">Tracking URL.</div> ")


  public JsonNullable<String> getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(JsonNullable<String> trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceReviewUrl adGroupServiceReviewUrl = (AdGroupServiceReviewUrl) o;
    return Objects.equals(this.parameters, adGroupServiceReviewUrl.parameters) &&
        Objects.equals(this.trackingUrl, adGroupServiceReviewUrl.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, trackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceReviewUrl {\n");
    
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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

