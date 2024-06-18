/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v14.model.AdGroupAdServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v14.model.AdGroupAdServiceHeadlinePinnedField;
import jp.co.yahoo.adssearchapi.v14.model.AdGroupAdServiceTextAssetActiveStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AdGroupAdServiceHeadlineTextAsset
 */
@JsonPropertyOrder({
  AdGroupAdServiceHeadlineTextAsset.JSON_PROPERTY_TEXT,
  AdGroupAdServiceHeadlineTextAsset.JSON_PROPERTY_PINNED_FIELD,
  AdGroupAdServiceHeadlineTextAsset.JSON_PROPERTY_ACTIVE_STATUS,
  AdGroupAdServiceHeadlineTextAsset.JSON_PROPERTY_APPROVAL_STATUS,
  AdGroupAdServiceHeadlineTextAsset.JSON_PROPERTY_DISAPPROVAL_REASON_CODES
})
@JsonTypeName("AdGroupAdServiceHeadlineTextAsset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceHeadlineTextAsset {
  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_PINNED_FIELD = "pinnedField";
  private AdGroupAdServiceHeadlinePinnedField pinnedField;

  public static final String JSON_PROPERTY_ACTIVE_STATUS = "activeStatus";
  private AdGroupAdServiceTextAssetActiveStatus activeStatus;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private AdGroupAdServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes = null;

  public AdGroupAdServiceHeadlineTextAsset() { 
  }

  public AdGroupAdServiceHeadlineTextAsset text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;テキストです。&lt;br&gt;ADDおよびSET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Text of parameter.&lt;br&gt;This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">テキストです。<br>ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Text of parameter.<br>This field is required in ADD and SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PINNED_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceHeadlinePinnedField getPinnedField() {
    return pinnedField;
  }


  @JsonProperty(JSON_PROPERTY_PINNED_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPinnedField(AdGroupAdServiceHeadlinePinnedField pinnedField) {
    this.pinnedField = pinnedField;
  }


  public AdGroupAdServiceHeadlineTextAsset activeStatus(AdGroupAdServiceTextAssetActiveStatus activeStatus) {
    
    this.activeStatus = activeStatus;
    return this;
  }

   /**
   * Get activeStatus
   * @return activeStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceTextAssetActiveStatus getActiveStatus() {
    return activeStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveStatus(AdGroupAdServiceTextAssetActiveStatus activeStatus) {
    this.activeStatus = activeStatus;
  }


  public AdGroupAdServiceHeadlineTextAsset approvalStatus(AdGroupAdServiceApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(AdGroupAdServiceApprovalStatus approvalStatus) {
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認の理由コードです。&lt;br&gt; (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Code of disapproval reason.&lt;br&gt; (Refer to DictionaryService getDisapprovalReason response for details) &lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認の理由コードです。<br> (コード詳細は、DictionaryServiceのgetDisapprovalReasonのレスポンスを参照)<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Code of disapproval reason.<br> (Refer to DictionaryService getDisapprovalReason response for details) <br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDisapprovalReasonCodes() {
    return disapprovalReasonCodes;
  }


  @JsonProperty(JSON_PROPERTY_DISAPPROVAL_REASON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        Objects.equals(this.activeStatus, adGroupAdServiceHeadlineTextAsset.activeStatus) &&
        Objects.equals(this.approvalStatus, adGroupAdServiceHeadlineTextAsset.approvalStatus) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupAdServiceHeadlineTextAsset.disapprovalReasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, pinnedField, activeStatus, approvalStatus, disapprovalReasonCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceHeadlineTextAsset {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    pinnedField: ").append(toIndentedString(pinnedField)).append("\n");
    sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
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

