package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceReviewUrl;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupServiceUrlApprovalStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceUrlReviewDataオブジェクトは、URLの審査状況を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceUrlReviewData object displays review status of URL.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceUrlReviewDataオブジェクトは、URLの審査状況を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">AdGroupServiceUrlReviewData object displays review status of URL.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")

public class AdGroupServiceUrlReviewData   {
  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  @JsonProperty("disapprovalReviewUrl")
  private JsonNullable<AdGroupServiceReviewUrl> disapprovalReviewUrl = JsonNullable.undefined();

  @JsonProperty("inReviewUrl")
  private JsonNullable<AdGroupServiceReviewUrl> inReviewUrl = JsonNullable.undefined();

  @JsonProperty("urlApprovalStatus")
  private JsonNullable<AdGroupServiceUrlApprovalStatus> urlApprovalStatus = JsonNullable.undefined();

  public AdGroupServiceUrlReviewData disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public AdGroupServiceUrlReviewData addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Code of Disapproval reason.<br></div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コードです。</div> <div lang=\"en\">Code of Disapproval reason.<br></div> ")


  public JsonNullable<List<String>> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(JsonNullable<List<String>> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public AdGroupServiceUrlReviewData disapprovalReviewUrl(AdGroupServiceReviewUrl disapprovalReviewUrl) {
    this.disapprovalReviewUrl = JsonNullable.of(disapprovalReviewUrl);
    return this;
  }

  /**
   * Get disapprovalReviewUrl
   * @return disapprovalReviewUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceReviewUrl> getDisapprovalReviewUrl() {
    return disapprovalReviewUrl;
  }

  public void setDisapprovalReviewUrl(JsonNullable<AdGroupServiceReviewUrl> disapprovalReviewUrl) {
    this.disapprovalReviewUrl = disapprovalReviewUrl;
  }

  public AdGroupServiceUrlReviewData inReviewUrl(AdGroupServiceReviewUrl inReviewUrl) {
    this.inReviewUrl = JsonNullable.of(inReviewUrl);
    return this;
  }

  /**
   * Get inReviewUrl
   * @return inReviewUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceReviewUrl> getInReviewUrl() {
    return inReviewUrl;
  }

  public void setInReviewUrl(JsonNullable<AdGroupServiceReviewUrl> inReviewUrl) {
    this.inReviewUrl = inReviewUrl;
  }

  public AdGroupServiceUrlReviewData urlApprovalStatus(AdGroupServiceUrlApprovalStatus urlApprovalStatus) {
    this.urlApprovalStatus = JsonNullable.of(urlApprovalStatus);
    return this;
  }

  /**
   * Get urlApprovalStatus
   * @return urlApprovalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupServiceUrlApprovalStatus> getUrlApprovalStatus() {
    return urlApprovalStatus;
  }

  public void setUrlApprovalStatus(JsonNullable<AdGroupServiceUrlApprovalStatus> urlApprovalStatus) {
    this.urlApprovalStatus = urlApprovalStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

