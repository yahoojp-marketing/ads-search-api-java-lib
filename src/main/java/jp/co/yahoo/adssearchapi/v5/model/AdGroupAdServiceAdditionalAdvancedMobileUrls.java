package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceAdditionalAdvancedMobileUrlsは、2件目以降の最終リンク先URL（スマートフォン）を保持するオブジェクトです。&lt;br&gt; ※こちらのフィールドは、現在利用できません。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがDYNAMIC_SEARCH_LINKED_ADの場合は無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceAdditionalAdvancedMobileUrls is object to hold the 2nd and later Landing Page URLs (Smartphone).&lt;br&gt; *This field is currently unavailable.&lt;br&gt; This field is optional in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD, this field will be ignored.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceAdditionalAdvancedMobileUrlsは、2件目以降の最終リンク先URL（スマートフォン）を保持するオブジェクトです。<br> ※こちらのフィールドは、現在利用できません。<br> ADD時、このフィールドは省略可能となります。※adTypeがDYNAMIC_SEARCH_LINKED_ADの場合は無視されます。</div> <div lang=\"en\">AdGroupAdServiceAdditionalAdvancedMobileUrls is object to hold the 2nd and later Landing Page URLs (Smartphone).<br> *This field is currently unavailable.<br> This field is optional in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD, this field will be ignored.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceAdditionalAdvancedMobileUrls   {
  @JsonProperty("advancedMobileUrl")
  private String advancedMobileUrl = null;

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  public AdGroupAdServiceAdditionalAdvancedMobileUrls advancedMobileUrl(String advancedMobileUrl) {
    this.advancedMobileUrl = advancedMobileUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">スマートフォン向けURLです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Smartphone final URL.<br> This field is required in ADD operation.</div> 
   * @return advancedMobileUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">スマートフォン向けURLです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Smartphone final URL.<br> This field is required in ADD operation.</div> ")


  public String getAdvancedMobileUrl() {
    return advancedMobileUrl;
  }

  public void setAdvancedMobileUrl(String advancedMobileUrl) {
    this.advancedMobileUrl = advancedMobileUrl;
  }

  public AdGroupAdServiceAdditionalAdvancedMobileUrls disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AdGroupAdServiceAdditionalAdvancedMobileUrls addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)</div> <div lang=\"en\">Reject reason code<br> (Refer to DictionaryService getDisapprovalReason response for details)</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)</div> <div lang=\"en\">Reject reason code<br> (Refer to DictionaryService getDisapprovalReason response for details)</div> ")


  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }

  public void setDisapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceAdditionalAdvancedMobileUrls adGroupAdServiceAdditionalAdvancedMobileUrls = (AdGroupAdServiceAdditionalAdvancedMobileUrls) o;
    return Objects.equals(this.advancedMobileUrl, adGroupAdServiceAdditionalAdvancedMobileUrls.advancedMobileUrl) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupAdServiceAdditionalAdvancedMobileUrls.disapprovalReasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedMobileUrl, disapprovalReasonCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceAdditionalAdvancedMobileUrls {\n");
    
    sb.append("    advancedMobileUrl: ").append(toIndentedString(advancedMobileUrl)).append("\n");
    sb.append("    disapprovalReasonCodes: ").append(toIndentedString(disapprovalReasonCodes)).append("\n");
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

