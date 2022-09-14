/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

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
import jp.co.yahoo.adssearchapi.v9.model.AdGroupCustomizerServiceApprovalStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCustomizerオブジェクトは、広告グループとカスタマイザー属性間の設定情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCustomizer object contains the configuration information between the adgroup and the customizer attribute.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCustomizerオブジェクトは、広告グループとカスタマイザー属性間の設定情報を格納します。</div> <div lang=\"en\">AdGroupCustomizer object contains the configuration information between the adgroup and the customizer attribute.</div> ")
@JsonPropertyOrder({
  AdGroupCustomizer.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupCustomizer.JSON_PROPERTY_AD_GROUP_ID,
  AdGroupCustomizer.JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_ID,
  AdGroupCustomizer.JSON_PROPERTY_VALUE,
  AdGroupCustomizer.JSON_PROPERTY_APPROVAL_STATUS,
  AdGroupCustomizer.JSON_PROPERTY_DISAPPROVAL_REASON_CODES
})
@JsonTypeName("AdGroupCustomizer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupCustomizer {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_AD_GROUP_ID = "adGroupId";
  private Long adGroupId;

  public static final String JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_ID = "customizerAttributeId";
  private Long customizerAttributeId;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private AdGroupCustomizerServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes = null;

  public AdGroupCustomizer() { 
  }

  public AdGroupCustomizer accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AdGroupCustomizer adGroupId(Long adGroupId) {
    
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループIDです。&lt;br&gt; ADDおよびREMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroup ID.&lt;br&gt; This field is required in ADD and REMOVE operation.&lt;/div&gt; 
   * @return adGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> ADDおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroup ID.<br> This field is required in ADD and REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdGroupId() {
    return adGroupId;
  }


  @JsonProperty(JSON_PROPERTY_AD_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }


  public AdGroupCustomizer customizerAttributeId(Long customizerAttributeId) {
    
    this.customizerAttributeId = customizerAttributeId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カスタマイザー属性IDです。&lt;br&gt; ADDおよびREMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CustomizerAttribute ID.&lt;br&gt; This field is required in ADD and REMOVE operation.&lt;/div&gt; 
   * @return customizerAttributeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">カスタマイザー属性IDです。<br> ADDおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">CustomizerAttribute ID.<br> This field is required in ADD and REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCustomizerAttributeId() {
    return customizerAttributeId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomizerAttributeId(Long customizerAttributeId) {
    this.customizerAttributeId = customizerAttributeId;
  }


  public AdGroupCustomizer value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;属性値です。挿入用広告に挿入されます。&lt;br&gt; 入力仕様の詳細は以下のヘルプを参照してください。&lt;br&gt; ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/search/articledetail?lan&#x3D;ja&amp;aid&#x3D;114459\&quot;&gt;アドカスタマイザー属性を関連付ける&lt;/a&gt;&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The attribute value. It will be inserted into the ad for insertion.&lt;br&gt; See also the help below.&lt;br&gt; * &lt;a href&#x3D;\&quot;https://ads-help.yahoo.co.jp/yahooads/search/articledetail?lan&#x3D;en&amp;aid&#x3D;61568\&quot;&gt;Associate ad customizer attributes&lt;/a&gt;&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">属性値です。挿入用広告に挿入されます。<br> 入力仕様の詳細は以下のヘルプを参照してください。<br> ・<a href=\"https://ads-help.yahoo.co.jp/yahooads/search/articledetail?lan=ja&aid=114459\">アドカスタマイザー属性を関連付ける</a><br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">The attribute value. It will be inserted into the ad for insertion.<br> See also the help below.<br> * <a href=\"https://ads-help.yahoo.co.jp/yahooads/search/articledetail?lan=en&aid=61568\">Associate ad customizer attributes</a><br> This field is required in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public AdGroupCustomizer approvalStatus(AdGroupCustomizerServiceApprovalStatus approvalStatus) {
    
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

  public AdGroupCustomizerServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(AdGroupCustomizerServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public AdGroupCustomizer disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public AdGroupCustomizer addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
    if (this.disapprovalReasonCodes == null) {
      this.disapprovalReasonCodes = new ArrayList<>();
    }
    this.disapprovalReasonCodes.add(disapprovalReasonCodesItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査否認理由です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Reject reason on editorial review.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return disapprovalReasonCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">審査否認理由です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Reject reason on editorial review.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
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
    AdGroupCustomizer adGroupCustomizer = (AdGroupCustomizer) o;
    return Objects.equals(this.accountId, adGroupCustomizer.accountId) &&
        Objects.equals(this.adGroupId, adGroupCustomizer.adGroupId) &&
        Objects.equals(this.customizerAttributeId, adGroupCustomizer.customizerAttributeId) &&
        Objects.equals(this.value, adGroupCustomizer.value) &&
        Objects.equals(this.approvalStatus, adGroupCustomizer.approvalStatus) &&
        Objects.equals(this.disapprovalReasonCodes, adGroupCustomizer.disapprovalReasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, customizerAttributeId, value, approvalStatus, disapprovalReasonCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCustomizer {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    customizerAttributeId: ").append(toIndentedString(customizerAttributeId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

