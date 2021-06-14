package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignWebpageServiceWebpageParameter;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignWebpageServiceWebpageオブジェクトは、除外設定するCampaignWebpageServiceWebpageの条件を保持します。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignWebpageServiceWebpage object contains the rules of webpage to be excluded.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignWebpageServiceWebpageオブジェクトは、除外設定するCampaignWebpageServiceWebpageの条件を保持します。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">CampaignWebpageServiceWebpage object contains the rules of webpage to be excluded.<br> This field is required in any cases.</div> ")

public class CampaignWebpageServiceWebpage   {
  @JsonProperty("parameter")
  private JsonNullable<CampaignWebpageServiceWebpageParameter> parameter = JsonNullable.undefined();

  @JsonProperty("targetId")
  private JsonNullable<Long> targetId = JsonNullable.undefined();

  @JsonProperty("targetTrackId")
  private JsonNullable<Long> targetTrackId = JsonNullable.undefined();

  public CampaignWebpageServiceWebpage parameter(CampaignWebpageServiceWebpageParameter parameter) {
    this.parameter = JsonNullable.of(parameter);
    return this;
  }

  /**
   * Get parameter
   * @return parameter
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignWebpageServiceWebpageParameter> getParameter() {
    return parameter;
  }

  public void setParameter(JsonNullable<CampaignWebpageServiceWebpageParameter> parameter) {
    this.parameter = parameter;
  }

  public CampaignWebpageServiceWebpage targetId(Long targetId) {
    this.targetId = JsonNullable.of(targetId);
    return this;
  }

  /**
   * <div lang=\"ja\">CampaignWebpageServiceWebpageを識別するIDです。 <br> このフィールドは、REMOVE時に必須となり、ADD時は無視されます。</div> <div lang=\"en\">Unique ID for each webpage.<br> This field is required in REMOVE operation, and will be ignored in ADD operation.</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">CampaignWebpageServiceWebpageを識別するIDです。 <br> このフィールドは、REMOVE時に必須となり、ADD時は無視されます。</div> <div lang=\"en\">Unique ID for each webpage.<br> This field is required in REMOVE operation, and will be ignored in ADD operation.</div> ")


  public JsonNullable<Long> getTargetId() {
    return targetId;
  }

  public void setTargetId(JsonNullable<Long> targetId) {
    this.targetId = targetId;
  }

  public CampaignWebpageServiceWebpage targetTrackId(Long targetTrackId) {
    this.targetTrackId = JsonNullable.of(targetTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">CampaignWebpageServiceWebpageを識別するトラッキングIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Unique tracking ID for each CampaignWebpageServiceWebpage.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return targetTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">CampaignWebpageServiceWebpageを識別するトラッキングIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Unique tracking ID for each CampaignWebpageServiceWebpage.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getTargetTrackId() {
    return targetTrackId;
  }

  public void setTargetTrackId(JsonNullable<Long> targetTrackId) {
    this.targetTrackId = targetTrackId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignWebpageServiceWebpage campaignWebpageServiceWebpage = (CampaignWebpageServiceWebpage) o;
    return Objects.equals(this.parameter, campaignWebpageServiceWebpage.parameter) &&
        Objects.equals(this.targetId, campaignWebpageServiceWebpage.targetId) &&
        Objects.equals(this.targetTrackId, campaignWebpageServiceWebpage.targetTrackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter, targetId, targetTrackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignWebpageServiceWebpage {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

