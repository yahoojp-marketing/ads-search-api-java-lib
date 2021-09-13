package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionLabelオブジェクトは、広告グループのクライテリアラベルの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionLabel object describes ad group criterion label information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionLabelオブジェクトは、広告グループのクライテリアラベルの情報を表します。</div> <div lang=\"en\">AdGroupCriterionLabel object describes ad group criterion label information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionLabel   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("criterionId")
  private Long criterionId = null;

  @JsonProperty("labelId")
  private Long labelId = null;

  public AdGroupCriterionLabel accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AdGroupCriterionLabel adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Ad group ID.<br> This field is required in any cases.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdGroupCriterionLabel campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Campaign ID.<br> This field is required in any cases.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public AdGroupCriterionLabel criterionId(Long criterionId) {
    this.criterionId = criterionId;
    return this;
  }

  /**
   * <div lang=\"ja\">クライテリアIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Criterion ID.<br> This field is required in any cases.</div> 
   * @return criterionId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリアIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Criterion ID.<br> This field is required in any cases.</div> ")


  public Long getCriterionId() {
    return criterionId;
  }

  public void setCriterionId(Long criterionId) {
    this.criterionId = criterionId;
  }

  public AdGroupCriterionLabel labelId(Long labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * <div lang=\"ja\">ラベルIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Label ID.<br> This field is required in any cases.</div> 
   * @return labelId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Label ID.<br> This field is required in any cases.</div> ")


  public Long getLabelId() {
    return labelId;
  }

  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionLabel adGroupCriterionLabel = (AdGroupCriterionLabel) o;
    return Objects.equals(this.accountId, adGroupCriterionLabel.accountId) &&
        Objects.equals(this.adGroupId, adGroupCriterionLabel.adGroupId) &&
        Objects.equals(this.campaignId, adGroupCriterionLabel.campaignId) &&
        Objects.equals(this.criterionId, adGroupCriterionLabel.criterionId) &&
        Objects.equals(this.labelId, adGroupCriterionLabel.labelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupId, campaignId, criterionId, labelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionLabel {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    criterionId: ").append(toIndentedString(criterionId)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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
