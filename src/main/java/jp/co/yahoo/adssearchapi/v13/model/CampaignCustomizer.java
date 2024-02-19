/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

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
import jp.co.yahoo.adssearchapi.v13.model.CampaignCustomizerServiceApprovalStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCustomizerオブジェクトは、キャンペーンとカスタマイザー属性間の設定情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCustomizer object contains the configuration information between the campaign and the customizer attribute.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCustomizerオブジェクトは、キャンペーンとカスタマイザー属性間の設定情報を格納します。</div> <div lang=\"en\">CampaignCustomizer object contains the configuration information between the campaign and the customizer attribute.</div> ")
@JsonPropertyOrder({
  CampaignCustomizer.JSON_PROPERTY_ACCOUNT_ID,
  CampaignCustomizer.JSON_PROPERTY_CAMPAIGN_ID,
  CampaignCustomizer.JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_ID,
  CampaignCustomizer.JSON_PROPERTY_VALUE,
  CampaignCustomizer.JSON_PROPERTY_APPROVAL_STATUS,
  CampaignCustomizer.JSON_PROPERTY_DISAPPROVAL_REASON_CODES
})
@JsonTypeName("CampaignCustomizer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignCustomizer {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_ID = "customizerAttributeId";
  private Long customizerAttributeId;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "approvalStatus";
  private CampaignCustomizerServiceApprovalStatus approvalStatus;

  public static final String JSON_PROPERTY_DISAPPROVAL_REASON_CODES = "disapprovalReasonCodes";
  private List<String> disapprovalReasonCodes = null;

  public CampaignCustomizer() { 
  }

  public CampaignCustomizer accountId(Long accountId) {
    
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


  public CampaignCustomizer campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; ADDおよびREMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in ADD and REMOVE operation.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> ADDおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in ADD and REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public CampaignCustomizer customizerAttributeId(Long customizerAttributeId) {
    
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


  public CampaignCustomizer value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;属性値です。挿入用広告に挿入されます。&lt;br&gt; 入力仕様の詳細は以下のヘルプを参照してください。&lt;br&gt; ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044225?language&#x3D;ja\&quot;&gt;アドカスタマイザー属性を関連付ける&lt;/a&gt;&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The attribute value. It will be inserted into the ad for insertion.&lt;br&gt; See also the help below.&lt;br&gt; * &lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044225?language&#x3D;en_US\&quot;&gt;Associate ad customizer attributes&lt;/a&gt;&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">属性値です。挿入用広告に挿入されます。<br> 入力仕様の詳細は以下のヘルプを参照してください。<br> ・<a href=\"https://ads-help.yahoo-net.jp/s/article/H000044225?language=ja\">アドカスタマイザー属性を関連付ける</a><br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">The attribute value. It will be inserted into the ad for insertion.<br> See also the help below.<br> * <a href=\"https://ads-help.yahoo-net.jp/s/article/H000044225?language=en_US\">Associate ad customizer attributes</a><br> This field is required in ADD operation.</div> ")
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


  public CampaignCustomizer approvalStatus(CampaignCustomizerServiceApprovalStatus approvalStatus) {
    
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

  public CampaignCustomizerServiceApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalStatus(CampaignCustomizerServiceApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public CampaignCustomizer disapprovalReasonCodes(List<String> disapprovalReasonCodes) {
    
    this.disapprovalReasonCodes = disapprovalReasonCodes;
    return this;
  }

  public CampaignCustomizer addDisapprovalReasonCodesItem(String disapprovalReasonCodesItem) {
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
    CampaignCustomizer campaignCustomizer = (CampaignCustomizer) o;
    return Objects.equals(this.accountId, campaignCustomizer.accountId) &&
        Objects.equals(this.campaignId, campaignCustomizer.campaignId) &&
        Objects.equals(this.customizerAttributeId, campaignCustomizer.customizerAttributeId) &&
        Objects.equals(this.value, campaignCustomizer.value) &&
        Objects.equals(this.approvalStatus, campaignCustomizer.approvalStatus) &&
        Objects.equals(this.disapprovalReasonCodes, campaignCustomizer.disapprovalReasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, customizerAttributeId, value, approvalStatus, disapprovalReasonCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCustomizer {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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

