package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.CampaignServiceCustomParameter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceReviewUrlオブジェクトは、トラッキングURLとカスタムパラメータを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceReviewUrl object siplays the Tracking URL and Custom Parameter.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceReviewUrlオブジェクトは、トラッキングURLとカスタムパラメータを表します。</div> <div lang=\"en\">CampaignServiceReviewUrl object siplays the Tracking URL and Custom Parameter.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignServiceReviewUrl   {
  @JsonProperty("parameters")
  @Valid
  private List<CampaignServiceCustomParameter> parameters = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  public CampaignServiceReviewUrl parameters(List<CampaignServiceCustomParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public CampaignServiceReviewUrl addParametersItem(CampaignServiceCustomParameter parametersItem) {
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

  public List<CampaignServiceCustomParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<CampaignServiceCustomParameter> parameters) {
    this.parameters = parameters;
  }

  public CampaignServiceReviewUrl trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADD時およびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.</div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADD時およびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD and SET operation.</div> ")


  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceReviewUrl campaignServiceReviewUrl = (CampaignServiceReviewUrl) o;
    return Objects.equals(this.parameters, campaignServiceReviewUrl.parameters) &&
        Objects.equals(this.trackingUrl, campaignServiceReviewUrl.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, trackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceReviewUrl {\n");
    
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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

