package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupServiceReviewUrl;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupServiceUrlApprovalStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceUrlReviewDataオブジェクトは、URLの審査状況を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceUrlReviewData object displays review status of URL.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceUrlReviewDataオブジェクトは、URLの審査状況を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">AdGroupServiceUrlReviewData object displays review status of URL.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceUrlReviewData   {
  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  @JsonProperty("disapprovalReviewUrl")
  private AdGroupServiceReviewUrl disapprovalReviewUrl = null;

  @JsonProperty("inReviewUrl")
  private AdGroupServiceReviewUrl inReviewUrl = null;

  @JsonProperty("urlApprovalStatus")
  private AdGroupServiceUrlApprovalStatus urlApprovalStatus = null;

  public AdGroupServiceUrlReviewData disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AdGroupServiceUrlReviewData addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Code of Disapproval reason.<br></div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Code of Disapproval reason.<br></div> ")


  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public AdGroupServiceUrlReviewData disapprovalReviewUrl(AdGroupServiceReviewUrl disapprovalReviewUrl) {
    this.disapprovalReviewUrl = disapprovalReviewUrl;
    return this;
  }

  /**
   * Get disapprovalReviewUrl
   * @return disapprovalReviewUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceReviewUrl getDisapprovalReviewUrl() {
    return disapprovalReviewUrl;
  }

  public void setDisapprovalReviewUrl(AdGroupServiceReviewUrl disapprovalReviewUrl) {
    this.disapprovalReviewUrl = disapprovalReviewUrl;
  }

  public AdGroupServiceUrlReviewData inReviewUrl(AdGroupServiceReviewUrl inReviewUrl) {
    this.inReviewUrl = inReviewUrl;
    return this;
  }

  /**
   * Get inReviewUrl
   * @return inReviewUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceReviewUrl getInReviewUrl() {
    return inReviewUrl;
  }

  public void setInReviewUrl(AdGroupServiceReviewUrl inReviewUrl) {
    this.inReviewUrl = inReviewUrl;
  }

  public AdGroupServiceUrlReviewData urlApprovalStatus(AdGroupServiceUrlApprovalStatus urlApprovalStatus) {
    this.urlApprovalStatus = urlApprovalStatus;
    return this;
  }

  /**
   * Get urlApprovalStatus
   * @return urlApprovalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceUrlApprovalStatus getUrlApprovalStatus() {
    return urlApprovalStatus;
  }

  public void setUrlApprovalStatus(AdGroupServiceUrlApprovalStatus urlApprovalStatus) {
    this.urlApprovalStatus = urlApprovalStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceUrlReviewData adGroupServiceUrlReviewData = (AdGroupServiceUrlReviewData) o;
    return Objects.equals(this.disapprovalReasonCodes, adGroupServiceUrlReviewData.disapprovalReasonCodes) &&
        Objects.equals(this.disapprovalReviewUrl, adGroupServiceUrlReviewData.disapprovalReviewUrl) &&
        Objects.equals(this.inReviewUrl, adGroupServiceUrlReviewData.inReviewUrl) &&
        Objects.equals(this.urlApprovalStatus, adGroupServiceUrlReviewData.urlApprovalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disapprovalReasonCodes, disapprovalReviewUrl, inReviewUrl, urlApprovalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceUrlReviewData {\n");
    
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    disapprovalReviewUrl: ").append(toIndentedString(disapprovalReviewUrl)).append("\n");
    sb.append("    inReviewUrl: ").append(toIndentedString(inReviewUrl)).append("\n");
    sb.append("    urlApprovalStatus: ").append(toIndentedString(urlApprovalStatus)).append("\n");
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

