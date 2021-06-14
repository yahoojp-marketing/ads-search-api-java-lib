package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceAdditionalUrlオブジェクトは、追加する最終リンク先URLを保持します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceAdditionalUrl object holds additional Landing Page URLs.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceAdditionalUrlオブジェクトは、追加する最終リンク先URLを保持します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">AdGroupCriterionServiceAdditionalUrl object holds additional Landing Page URLs.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")

public class AdGroupCriterionServiceAdditionalUrl   {
  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  @JsonProperty("reviewUrl")
  private JsonNullable<String> reviewUrl = JsonNullable.undefined();

  @JsonProperty("url")
  private JsonNullable<String> url = JsonNullable.undefined();

  public AdGroupCriterionServiceAdditionalUrl disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public AdGroupCriterionServiceAdditionalUrl addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由のコードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Reject reason code.<br> (Refer to DictionaryService getDisapprovalReason response for details) <br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由のコードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Reject reason code.<br> (Refer to DictionaryService getDisapprovalReason response for details) <br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<List<String>> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(JsonNullable<List<String>> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }

  public AdGroupCriterionServiceAdditionalUrl reviewUrl(String reviewUrl) {
    this.reviewUrl = JsonNullable.of(reviewUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">審査中の最終リンク先URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Landing Page URL in editorial review.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return reviewUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中の最終リンク先URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Landing Page URL in editorial review.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<String> getReviewUrl() {
    return reviewUrl;
  }

  public void setReviewUrl(JsonNullable<String> reviewUrl) {
    this.reviewUrl = reviewUrl;
  }

  public AdGroupCriterionServiceAdditionalUrl url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Landing Page URL.<br> This field is required in ADD and SET operation.</div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Landing Page URL.<br> This field is required in ADD and SET operation.</div> ")


  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceAdditionalUrl adGroupCriterionServiceAdditionalUrl = (AdGroupCriterionServiceAdditionalUrl) o;
    return Objects.equals(this.disapprovalReasonCodes, adGroupCriterionServiceAdditionalUrl.disapprovalReasonCodes) &&
        Objects.equals(this.reviewUrl, adGroupCriterionServiceAdditionalUrl.reviewUrl) &&
        Objects.equals(this.url, adGroupCriterionServiceAdditionalUrl.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disapprovalReasonCodes, reviewUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceAdditionalUrl {\n");
    
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
    sb.append("    reviewUrl: ").append(toIndentedString(reviewUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

