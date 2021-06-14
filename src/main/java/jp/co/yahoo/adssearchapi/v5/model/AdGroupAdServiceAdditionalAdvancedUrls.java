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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceAdditionalAdvancedUrlsは、2件目以降の最終リンク先URLを保持するオブジェクトです。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがDYNAMIC_SEARCH_LINKED_ADの場合は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceAdditionalAdvancedUrls is object to hold the 2nd and later Landing Page URLs.&lt;br&gt; This field is optional in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD, this field will be ignored.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceAdditionalAdvancedUrlsは、2件目以降の最終リンク先URLを保持するオブジェクトです。<br> ADD時、このフィールドは省略可能となります。※adTypeがDYNAMIC_SEARCH_LINKED_ADの場合は無視されます。</div> <div lang=\"en\">AdGroupAdServiceAdditionalAdvancedUrls is object to hold the 2nd and later Landing Page URLs.<br> This field is optional in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD, this field will be ignored.</div> ")

public class AdGroupAdServiceAdditionalAdvancedUrls   {
  @JsonProperty("advancedUrl")
  private JsonNullable<String> advancedUrl = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  public AdGroupAdServiceAdditionalAdvancedUrls advancedUrl(String advancedUrl) {
    this.advancedUrl = JsonNullable.of(advancedUrl);
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Landing Page URL.<br> This field is required in ADD operation.</div> 
   * @return advancedUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Landing Page URL.<br> This field is required in ADD operation.</div> ")


  public JsonNullable<String> getAdvancedUrl() {
    return advancedUrl;
  }

  public void setAdvancedUrl(JsonNullable<String> advancedUrl) {
    this.advancedUrl = advancedUrl;
  }

  public AdGroupAdServiceAdditionalAdvancedUrls disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public AdGroupAdServiceAdditionalAdvancedUrls addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)</div> <div lang=\"en\">Reject reason code.<br> (Refer to DictionaryService getDisapprovalReason response for details)</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)</div> <div lang=\"en\">Reject reason code.<br> (Refer to DictionaryService getDisapprovalReason response for details)</div> ")


  public JsonNullable<List<String>> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(JsonNullable<List<String>> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceAdditionalAdvancedUrls adGroupAdServiceAdditionalAdvancedUrls = (AdGroupAdServiceAdditionalAdvancedUrls) o;
    return Objects.equals(this.advancedUrl, adGroupAdServiceAdditionalAdvancedUrls.advancedUrl) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupAdServiceAdditionalAdvancedUrls.disapprovalReasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedUrl, disapprovalReasonCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceAdditionalAdvancedUrls {\n");
    
    sb.append("    advancedUrl: ").append(toIndentedString(advancedUrl)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
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

