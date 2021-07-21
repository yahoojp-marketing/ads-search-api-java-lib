package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupWebpageServiceWebpageParameter;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceWebpageオブジェクトは、配信/除外設定するAdGroupWebpageServiceWebpageの条件を保持します。&lt;br&gt; このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceWebpage object contains the rules of webpage to be allowed or excluded.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageServiceWebpageオブジェクトは、配信/除外設定するAdGroupWebpageServiceWebpageの条件を保持します。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">AdGroupWebpageServiceWebpage object contains the rules of webpage to be allowed or excluded.<br> This field is required in any cases.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupWebpageServiceWebpage   {
  @JsonProperty("parameter")
  private AdGroupWebpageServiceWebpageParameter parameter = null;

  @JsonProperty("targetId")
  private Long targetId = null;

  @JsonProperty("targetTrackId")
  private Long targetTrackId = null;

  public AdGroupWebpageServiceWebpage parameter(AdGroupWebpageServiceWebpageParameter parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * Get parameter
   * @return parameter
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupWebpageServiceWebpageParameter getParameter() {
    return parameter;
  }

  public void setParameter(AdGroupWebpageServiceWebpageParameter parameter) {
    this.parameter = parameter;
  }

  public AdGroupWebpageServiceWebpage targetId(Long targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * <div lang=\"ja\">AdGroupWebpageServiceWebpageを識別するIDです。<br>このフィールドは、ADD時は無視され、SET時は必須となります。</div> <div lang=\"en\">Unique ID for each identify webpage.<br>This field will be ignored in ADD operation, and is required in SET operation.</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">AdGroupWebpageServiceWebpageを識別するIDです。<br>このフィールドは、ADD時は無視され、SET時は必須となります。</div> <div lang=\"en\">Unique ID for each identify webpage.<br>This field will be ignored in ADD operation, and is required in SET operation.</div> ")


  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }

  public AdGroupWebpageServiceWebpage targetTrackId(Long targetTrackId) {
    this.targetTrackId = targetTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">AdGroupWebpageServiceWebpageを識別するトラッキングIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Tracking ID for each identify webpage.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return targetTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">AdGroupWebpageServiceWebpageを識別するトラッキングIDです。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Tracking ID for each identify webpage.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getTargetTrackId() {
    return targetTrackId;
  }

  public void setTargetTrackId(Long targetTrackId) {
    this.targetTrackId = targetTrackId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupWebpageServiceWebpage adGroupWebpageServiceWebpage = (AdGroupWebpageServiceWebpage) o;
    return Objects.equals(this.parameter, adGroupWebpageServiceWebpage.parameter) &&
        Objects.equals(this.targetId, adGroupWebpageServiceWebpage.targetId) &&
        Objects.equals(this.targetTrackId, adGroupWebpageServiceWebpage.targetTrackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter, targetId, targetTrackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceWebpage {\n");
    
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetTrackId: ").append(toIndentedString(targetTrackId)).append("\n");
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

