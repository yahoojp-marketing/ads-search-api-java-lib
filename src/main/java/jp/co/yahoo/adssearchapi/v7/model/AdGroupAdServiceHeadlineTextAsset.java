package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceHeadlinePinnedField;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceTextAssetApprovalStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceHeadlineTextAssetは、レスポンシブ広告で指定するタイトルのテキストアセットを表します。&lt;br&gt; headlines[]には、3~15件の指定が可能です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceHeadlineTextAsset displays the text asset for the headline that specify in responsive ad.&lt;br&gt; 3 to 15 items can be specified for headlines[].&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceHeadlineTextAssetは、レスポンシブ広告で指定するタイトルのテキストアセットを表します。<br> headlines[]には、3~15件の指定が可能です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupAdServiceHeadlineTextAsset displays the text asset for the headline that specify in responsive ad.<br> 3 to 15 items can be specified for headlines[].<br> This field is required in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceHeadlineTextAsset   {
  @JsonProperty("text")
  private String text = null;

  @JsonProperty("pinnedField")
  private AdGroupAdServiceHeadlinePinnedField pinnedField = null;

  @JsonProperty("approvalStatus")
  private AdGroupAdServiceTextAssetApprovalStatus approvalStatus = null;

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private List<String> disapprovalReasonCodes = null;

  public AdGroupAdServiceHeadlineTextAsset text(String text) {
    this.text = text;
    return this;
  }

  /**
   * <div lang=\"ja\">テキストです。<br>このフィールドは、ADD時は必須となり、SET時は無視されます。</div> <div lang=\"en\">Text of parameter.<br>This field is required in ADD operation, and will be ignored in SET operation.</div> 
   * @return text
  */
  @ApiModelProperty(value = "<div lang=\"ja\">テキストです。<br>このフィールドは、ADD時は必須となり、SET時は無視されます。</div> <div lang=\"en\">Text of parameter.<br>This field is required in ADD operation, and will be ignored in SET operation.</div> ")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public AdGroupAdServiceHeadlineTextAsset pinnedField(AdGroupAdServiceHeadlinePinnedField pinnedField) {
    this.pinnedField = pinnedField;
    return this;
  }

  /**
   * Get pinnedField
   * @return pinnedField
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceHeadlinePinnedField getPinnedField() {
    return pinnedField;
  }

  public void setPinnedField(AdGroupAdServiceHeadlinePinnedField pinnedField) {
    this.pinnedField = pinnedField;
  }

  public AdGroupAdServiceHeadlineTextAsset approvalStatus(AdGroupAdServiceTextAssetApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceTextAssetApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(AdGroupAdServiceTextAssetApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AdGroupAdServiceHeadlineTextAsset disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AdGroupAdServiceHeadlineTextAsset addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認の理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Code of Disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details) <br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認の理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Code of Disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details) <br> Although this field will be returned in the response, it will be ignored on input.</div> ")


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
    AdGroupAdServiceHeadlineTextAsset adGroupAdServiceHeadlineTextAsset = (AdGroupAdServiceHeadlineTextAsset) o;
    return Objects.equals(this.text, adGroupAdServiceHeadlineTextAsset.text) &&
        Objects.equals(this.pinnedField, adGroupAdServiceHeadlineTextAsset.pinnedField) &&
        Objects.equals(this.approvalStatus, adGroupAdServiceHeadlineTextAsset.approvalStatus) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupAdServiceHeadlineTextAsset.disapprovalReasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, pinnedField, approvalStatus, disapprovalReasonCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceHeadlineTextAsset {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    pinnedField: ").append(toIndentedString(pinnedField)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
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

