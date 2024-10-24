/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Labelオブジェクトは、ラベルの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Label object describes label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">Labelオブジェクトは、ラベルの情報を表します。</div> <div lang=\"en\">Label object describes label information.</div> ")
@JsonPropertyOrder({
  Label.JSON_PROPERTY_ACCOUNT_ID,
  Label.JSON_PROPERTY_COLOR,
  Label.JSON_PROPERTY_DESCRIPTION,
  Label.JSON_PROPERTY_LABEL_ID,
  Label.JSON_PROPERTY_LABEL_NAME,
  Label.JSON_PROPERTY_LABELED_AD_GROUP,
  Label.JSON_PROPERTY_LABELED_AD_GROUP_AD,
  Label.JSON_PROPERTY_LABELED_AD_GROUP_CRITERION,
  Label.JSON_PROPERTY_LABELED_CAMPAIGN
})
@JsonTypeName("Label")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Label {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABEL_ID = "labelId";
  private Long labelId;

  public static final String JSON_PROPERTY_LABEL_NAME = "labelName";
  private String labelName;

  public static final String JSON_PROPERTY_LABELED_AD_GROUP = "labeledAdGroup";
  private Long labeledAdGroup;

  public static final String JSON_PROPERTY_LABELED_AD_GROUP_AD = "labeledAdGroupAd";
  private Long labeledAdGroupAd;

  public static final String JSON_PROPERTY_LABELED_AD_GROUP_CRITERION = "labeledAdGroupCriterion";
  private Long labeledAdGroupCriterion;

  public static final String JSON_PROPERTY_LABELED_CAMPAIGN = "labeledCampaign";
  private Long labeledCampaign;

  public Label() { 
  }

  public Label accountId(Long accountId) {
    
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


  public Label color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カラーコードです。例：#FFFFFF&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Color code. e.g. #FFFFFF&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">カラーコードです。例：#FFFFFF<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">Color code. e.g. #FFFFFF<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


  public Label description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;説明文です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description.&lt;br&gt; This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">説明文です。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">Description.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Label labelId(Long labelId) {
    
    this.labelId = labelId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベルIDです。&lt;br&gt; このフィールドは、SETおよびREMOVE時に必須となり、ADD時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Label ID.&lt;br&gt; This field is required in SET and REMOVE operation, and will be ignored in ADD operation.&lt;/div&gt; 
   * @return labelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルIDです。<br> このフィールドは、SETおよびREMOVE時に必須となり、ADD時に無視されます。</div> <div lang=\"en\">Label ID.<br> This field is required in SET and REMOVE operation, and will be ignored in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLabelId() {
    return labelId;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }


  public Label labelName(String labelName) {
    
    this.labelName = labelName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベル名です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Label name.&lt;br&gt; This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return labelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ラベル名です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">Label name.<br> This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_LABEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabelName() {
    return labelName;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  public Label labeledAdGroup(Long labeledAdGroup) {
    
    this.labeledAdGroup = labeledAdGroup;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告グループの紐付け数です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of labeled ad group.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return labeledAdGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループの紐付け数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Number of labeled ad group.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_LABELED_AD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLabeledAdGroup() {
    return labeledAdGroup;
  }


  @JsonProperty(JSON_PROPERTY_LABELED_AD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabeledAdGroup(Long labeledAdGroup) {
    this.labeledAdGroup = labeledAdGroup;
  }


  public Label labeledAdGroupAd(Long labeledAdGroupAd) {
    
    this.labeledAdGroupAd = labeledAdGroupAd;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告の紐付け数です。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of labeled ad.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return labeledAdGroupAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">広告の紐付け数です。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Number of labeled ad.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_LABELED_AD_GROUP_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLabeledAdGroupAd() {
    return labeledAdGroupAd;
  }


  @JsonProperty(JSON_PROPERTY_LABELED_AD_GROUP_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabeledAdGroupAd(Long labeledAdGroupAd) {
    this.labeledAdGroupAd = labeledAdGroupAd;
  }


  public Label labeledAdGroupCriterion(Long labeledAdGroupCriterion) {
    
    this.labeledAdGroupCriterion = labeledAdGroupCriterion;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードの紐付け数です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of labeled ad group criterion.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return labeledAdGroupCriterion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードの紐付け数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Number of labeled ad group criterion.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_LABELED_AD_GROUP_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLabeledAdGroupCriterion() {
    return labeledAdGroupCriterion;
  }


  @JsonProperty(JSON_PROPERTY_LABELED_AD_GROUP_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabeledAdGroupCriterion(Long labeledAdGroupCriterion) {
    this.labeledAdGroupCriterion = labeledAdGroupCriterion;
  }


  public Label labeledCampaign(Long labeledCampaign) {
    
    this.labeledCampaign = labeledCampaign;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンの紐付け数です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of labeled campaign.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return labeledCampaign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンの紐付け数です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Number of labeled campaign.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_LABELED_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLabeledCampaign() {
    return labeledCampaign;
  }


  @JsonProperty(JSON_PROPERTY_LABELED_CAMPAIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabeledCampaign(Long labeledCampaign) {
    this.labeledCampaign = labeledCampaign;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.accountId, label.accountId) &&
        Objects.equals(this.color, label.color) &&
        Objects.equals(this.description, label.description) &&
        Objects.equals(this.labelId, label.labelId) &&
        Objects.equals(this.labelName, label.labelName) &&
        Objects.equals(this.labeledAdGroup, label.labeledAdGroup) &&
        Objects.equals(this.labeledAdGroupAd, label.labeledAdGroupAd) &&
        Objects.equals(this.labeledAdGroupCriterion, label.labeledAdGroupCriterion) &&
        Objects.equals(this.labeledCampaign, label.labeledCampaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, color, description, labelId, labelName, labeledAdGroup, labeledAdGroupAd, labeledAdGroupCriterion, labeledCampaign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
    sb.append("    labeledAdGroup: ").append(toIndentedString(labeledAdGroup)).append("\n");
    sb.append("    labeledAdGroupAd: ").append(toIndentedString(labeledAdGroupAd)).append("\n");
    sb.append("    labeledAdGroupCriterion: ").append(toIndentedString(labeledAdGroupCriterion)).append("\n");
    sb.append("    labeledCampaign: ").append(toIndentedString(labeledCampaign)).append("\n");
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

