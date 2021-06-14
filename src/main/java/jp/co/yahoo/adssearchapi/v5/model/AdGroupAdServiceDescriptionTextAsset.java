package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceDescriptionPinnedField;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceTextAssetApprovalStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceDescriptionTextAssetは、レスポンシブ広告で指定する説明文のテキストアセットを表します。&lt;br&gt; descriptions[]には、2~4件の指定が可能です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceDescriptionTextAsset displays the text asset for the description that specify in responsive ad.&lt;br&gt; 2 to 4 items can be specified for descriptions[].&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceDescriptionTextAssetは、レスポンシブ広告で指定する説明文のテキストアセットを表します。<br> descriptions[]には、2~4件の指定が可能です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupAdServiceDescriptionTextAsset displays the text asset for the description that specify in responsive ad.<br> 2 to 4 items can be specified for descriptions[].<br> This field is required in ADD operation.</div> ")

public class AdGroupAdServiceDescriptionTextAsset   {
  @JsonProperty("text")
  private JsonNullable<String> text = JsonNullable.undefined();

  @JsonProperty("pinnedField")
  private JsonNullable<AdGroupAdServiceDescriptionPinnedField> pinnedField = JsonNullable.undefined();

  @JsonProperty("approvalStatus")
  private JsonNullable<AdGroupAdServiceTextAssetApprovalStatus> approvalStatus = JsonNullable.undefined();

  @JsonProperty("disapprovalReasonCodes")
  @Valid
  private JsonNullable<List<String>> disapprovalReasonCodes = JsonNullable.undefined();

  public AdGroupAdServiceDescriptionTextAsset text(String text) {
    this.text = JsonNullable.of(text);
    return this;
  }

  /**
   * <div lang=\"ja\">テキストです。<br>このフィールドは、ADD時は必須となり、SET時は無視されます。</div> <div lang=\"en\">Text of parameter.<br>This field is required in ADD operation, and will be ignored in SET operation.</div> 
   * @return text
  */
  @ApiModelProperty(value = "<div lang=\"ja\">テキストです。<br>このフィールドは、ADD時は必須となり、SET時は無視されます。</div> <div lang=\"en\">Text of parameter.<br>This field is required in ADD operation, and will be ignored in SET operation.</div> ")


  public JsonNullable<String> getText() {
    return text;
  }

  public void setText(JsonNullable<String> text) {
    this.text = text;
  }

  public AdGroupAdServiceDescriptionTextAsset pinnedField(AdGroupAdServiceDescriptionPinnedField pinnedField) {
    this.pinnedField = JsonNullable.of(pinnedField);
    return this;
  }

  /**
   * Get pinnedField
   * @return pinnedField
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceDescriptionPinnedField> getPinnedField() {
    return pinnedField;
  }

  public void setPinnedField(JsonNullable<AdGroupAdServiceDescriptionPinnedField> pinnedField) {
    this.pinnedField = pinnedField;
  }

  public AdGroupAdServiceDescriptionTextAsset approvalStatus(AdGroupAdServiceTextAssetApprovalStatus approvalStatus) {
    this.approvalStatus = JsonNullable.of(approvalStatus);
    return this;
  }

  /**
   * Get approvalStatus
   * @return approvalStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupAdServiceTextAssetApprovalStatus> getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(JsonNullable<AdGroupAdServiceTextAssetApprovalStatus> approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AdGroupAdServiceDescriptionTextAsset disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    this.disapprovalReasonCodes = JsonNullable.of(disapprovalReasonCodes);
    return this;
  }

  public AdGroupAdServiceDescriptionTextAsset addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null || !this.disapprovalReasonCodes.isPresent()) {
      this.disapprovalReasonCodes = JsonNullable.of(new ArrayList<>());
    }
    this.disapprovalReasonCodes.get().add(disapprovalReasonCodesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">審査否認の理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Code of Disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details) <br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return disapprovalReasonCodes
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認の理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Code of Disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details) <br> Although this field will be returned in the response, it will be ignored on input.</div> ")


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
    AdGroupAdServiceDescriptionTextAsset adGroupAdServiceDescriptionTextAsset = (AdGroupAdServiceDescriptionTextAsset) o;
    return Objects.equals(this.text, adGroupAdServiceDescriptionTextAsset.text) &&
        Objects.equals(this.pinnedField, adGroupAdServiceDescriptionTextAsset.pinnedField) &&
        Objects.equals(this.approvalStatus, adGroupAdServiceDescriptionTextAsset.approvalStatus) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupAdServiceDescriptionTextAsset.disapprovalReasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, pinnedField, approvalStatus, disapprovalReasonCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceDescriptionTextAsset {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

