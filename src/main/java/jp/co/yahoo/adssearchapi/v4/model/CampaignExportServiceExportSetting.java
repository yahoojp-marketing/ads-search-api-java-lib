package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.CampaignExportServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v4.model.CampaignExportServiceEncoding;
import jp.co.yahoo.adssearchapi.v4.model.CampaignExportServiceEntityType;
import jp.co.yahoo.adssearchapi.v4.model.CampaignExportServiceLang;
import jp.co.yahoo.adssearchapi.v4.model.CampaignExportServiceOutput;
import jp.co.yahoo.adssearchapi.v4.model.CampaignExportServiceUserStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceExportSetting オブジェクトは、エクスポートする条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceExportSetting object describes the condition for exports.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignExportServiceExportSetting オブジェクトは、エクスポートする条件を表します。</div> <div lang=\"en\">CampaignExportServiceExportSetting object describes the condition for exports.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignExportServiceExportSetting   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("adGroupAdApprovalStatuses")
  @Valid
  private List<CampaignExportServiceApprovalStatus> adGroupAdApprovalStatuses = null;

  @JsonProperty("adGroupAdUserStatuses")
  @Valid
  private List<CampaignExportServiceUserStatus> adGroupAdUserStatuses = null;

  @JsonProperty("adGroupCriterionApprovalStatuses")
  @Valid
  private List<CampaignExportServiceApprovalStatus> adGroupCriterionApprovalStatuses = null;

  @JsonProperty("adGroupCriterionIds")
  @Valid
  private List<Long> adGroupCriterionIds = null;

  @JsonProperty("adGroupCriterionUserStatuses")
  @Valid
  private List<CampaignExportServiceUserStatus> adGroupCriterionUserStatuses = null;

  @JsonProperty("adGroupIds")
  @Valid
  private List<Long> adGroupIds = null;

  @JsonProperty("adGroupUserStatuses")
  @Valid
  private List<CampaignExportServiceUserStatus> adGroupUserStatuses = null;

  @JsonProperty("adIds")
  @Valid
  private List<Long> adIds = null;

  @JsonProperty("campaignCriterionIds")
  @Valid
  private List<Long> campaignCriterionIds = null;

  @JsonProperty("campaignIds")
  @Valid
  private List<Long> campaignIds = null;

  @JsonProperty("campaignUserStatuses")
  @Valid
  private List<CampaignExportServiceUserStatus> campaignUserStatuses = null;

  @JsonProperty("encoding")
  private CampaignExportServiceEncoding encoding = null;

  @JsonProperty("entityTypes")
  @Valid
  private List<CampaignExportServiceEntityType> entityTypes = null;

  @JsonProperty("exportFields")
  @Valid
  private List<String> exportFields = null;

  @JsonProperty("jobName")
  private String jobName = null;

  @JsonProperty("lang")
  private CampaignExportServiceLang lang = null;

  @JsonProperty("output")
  private CampaignExportServiceOutput output = null;

  public CampaignExportServiceExportSetting accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br>このフィールドは、必須です。</div> <div lang=\"en\">Account ID.<br>This field is required.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。<br>このフィールドは、必須です。</div> <div lang=\"en\">Account ID.<br>This field is required.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignExportServiceExportSetting adGroupAdApprovalStatuses(List<CampaignExportServiceApprovalStatus> adGroupAdApprovalStatuses) {
    this.adGroupAdApprovalStatuses = adGroupAdApprovalStatuses;
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupAdApprovalStatusesItem(CampaignExportServiceApprovalStatus adGroupAdApprovalStatusesItem) {
    if (this.adGroupAdApprovalStatuses == null) {
      this.adGroupAdApprovalStatuses = new ArrayList<>();
    }
    this.adGroupAdApprovalStatuses.add(adGroupAdApprovalStatusesItem);
    return this;
  }

  /**
   * Get adGroupAdApprovalStatuses
   * @return adGroupAdApprovalStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public List<CampaignExportServiceApprovalStatus> getAdGroupAdApprovalStatuses() {
    return adGroupAdApprovalStatuses;
  }

  public void setAdGroupAdApprovalStatuses(List<CampaignExportServiceApprovalStatus> adGroupAdApprovalStatuses) {
    this.adGroupAdApprovalStatuses = adGroupAdApprovalStatuses;
  }

  public CampaignExportServiceExportSetting adGroupAdUserStatuses(List<CampaignExportServiceUserStatus> adGroupAdUserStatuses) {
    this.adGroupAdUserStatuses = adGroupAdUserStatuses;
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupAdUserStatusesItem(CampaignExportServiceUserStatus adGroupAdUserStatusesItem) {
    if (this.adGroupAdUserStatuses == null) {
      this.adGroupAdUserStatuses = new ArrayList<>();
    }
    this.adGroupAdUserStatuses.add(adGroupAdUserStatusesItem);
    return this;
  }

  /**
   * Get adGroupAdUserStatuses
   * @return adGroupAdUserStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<CampaignExportServiceUserStatus> getAdGroupAdUserStatuses() {
    return adGroupAdUserStatuses;
  }

  public void setAdGroupAdUserStatuses(List<CampaignExportServiceUserStatus> adGroupAdUserStatuses) {
    this.adGroupAdUserStatuses = adGroupAdUserStatuses;
  }

  public CampaignExportServiceExportSetting adGroupCriterionApprovalStatuses(List<CampaignExportServiceApprovalStatus> adGroupCriterionApprovalStatuses) {
    this.adGroupCriterionApprovalStatuses = adGroupCriterionApprovalStatuses;
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupCriterionApprovalStatusesItem(CampaignExportServiceApprovalStatus adGroupCriterionApprovalStatusesItem) {
    if (this.adGroupCriterionApprovalStatuses == null) {
      this.adGroupCriterionApprovalStatuses = new ArrayList<>();
    }
    this.adGroupCriterionApprovalStatuses.add(adGroupCriterionApprovalStatusesItem);
    return this;
  }

  /**
   * Get adGroupCriterionApprovalStatuses
   * @return adGroupCriterionApprovalStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public List<CampaignExportServiceApprovalStatus> getAdGroupCriterionApprovalStatuses() {
    return adGroupCriterionApprovalStatuses;
  }

  public void setAdGroupCriterionApprovalStatuses(List<CampaignExportServiceApprovalStatus> adGroupCriterionApprovalStatuses) {
    this.adGroupCriterionApprovalStatuses = adGroupCriterionApprovalStatuses;
  }

  public CampaignExportServiceExportSetting adGroupCriterionIds(List<Long> adGroupCriterionIds) {
    this.adGroupCriterionIds = adGroupCriterionIds;
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupCriterionIdsItem(Long adGroupCriterionIdsItem) {
    if (this.adGroupCriterionIds == null) {
      this.adGroupCriterionIds = new ArrayList<>();
    }
    this.adGroupCriterionIds.add(adGroupCriterionIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループクライテリアIDです。<br>このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad group criteria ID.<br>This field is optional.</div> 
   * @return adGroupCriterionIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループクライテリアIDです。<br>このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad group criteria ID.<br>This field is optional.</div> ")

@Size(max=500) 
  public List<Long> getAdGroupCriterionIds() {
    return adGroupCriterionIds;
  }

  public void setAdGroupCriterionIds(List<Long> adGroupCriterionIds) {
    this.adGroupCriterionIds = adGroupCriterionIds;
  }

  public CampaignExportServiceExportSetting adGroupCriterionUserStatuses(List<CampaignExportServiceUserStatus> adGroupCriterionUserStatuses) {
    this.adGroupCriterionUserStatuses = adGroupCriterionUserStatuses;
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupCriterionUserStatusesItem(CampaignExportServiceUserStatus adGroupCriterionUserStatusesItem) {
    if (this.adGroupCriterionUserStatuses == null) {
      this.adGroupCriterionUserStatuses = new ArrayList<>();
    }
    this.adGroupCriterionUserStatuses.add(adGroupCriterionUserStatusesItem);
    return this;
  }

  /**
   * Get adGroupCriterionUserStatuses
   * @return adGroupCriterionUserStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<CampaignExportServiceUserStatus> getAdGroupCriterionUserStatuses() {
    return adGroupCriterionUserStatuses;
  }

  public void setAdGroupCriterionUserStatuses(List<CampaignExportServiceUserStatus> adGroupCriterionUserStatuses) {
    this.adGroupCriterionUserStatuses = adGroupCriterionUserStatuses;
  }

  public CampaignExportServiceExportSetting adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロード対象の広告グループIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad group ID of export objective.<br> This field is optional.</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロード対象の広告グループIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad group ID of export objective.<br> This field is optional.</div> ")

@Size(max=500) 
  public List<Long> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public CampaignExportServiceExportSetting adGroupUserStatuses(List<CampaignExportServiceUserStatus> adGroupUserStatuses) {
    this.adGroupUserStatuses = adGroupUserStatuses;
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupUserStatusesItem(CampaignExportServiceUserStatus adGroupUserStatusesItem) {
    if (this.adGroupUserStatuses == null) {
      this.adGroupUserStatuses = new ArrayList<>();
    }
    this.adGroupUserStatuses.add(adGroupUserStatusesItem);
    return this;
  }

  /**
   * Get adGroupUserStatuses
   * @return adGroupUserStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<CampaignExportServiceUserStatus> getAdGroupUserStatuses() {
    return adGroupUserStatuses;
  }

  public void setAdGroupUserStatuses(List<CampaignExportServiceUserStatus> adGroupUserStatuses) {
    this.adGroupUserStatuses = adGroupUserStatuses;
  }

  public CampaignExportServiceExportSetting adIds(List<Long> adIds) {
    this.adIds = adIds;
    return this;
  }

  public CampaignExportServiceExportSetting addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロード対象の広告IDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad ID of export objective.<br> This field is optional.</div> 
   * @return adIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロード対象の広告IDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad ID of export objective.<br> This field is optional.</div> ")

@Size(max=500) 
  public List<Long> getAdIds() {
    return adIds;
  }

  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }

  public CampaignExportServiceExportSetting campaignCriterionIds(List<Long> campaignCriterionIds) {
    this.campaignCriterionIds = campaignCriterionIds;
    return this;
  }

  public CampaignExportServiceExportSetting addCampaignCriterionIdsItem(Long campaignCriterionIdsItem) {
    if (this.campaignCriterionIds == null) {
      this.campaignCriterionIds = new ArrayList<>();
    }
    this.campaignCriterionIds.add(campaignCriterionIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンクライテリアIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Campaign criteria ID.<br> This field is optional.</div> 
   * @return campaignCriterionIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンクライテリアIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Campaign criteria ID.<br> This field is optional.</div> ")

@Size(max=500) 
  public List<Long> getCampaignCriterionIds() {
    return campaignCriterionIds;
  }

  public void setCampaignCriterionIds(List<Long> campaignCriterionIds) {
    this.campaignCriterionIds = campaignCriterionIds;
  }

  public CampaignExportServiceExportSetting campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignExportServiceExportSetting addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロード対象のキャンペーンIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Campaign ID of export objective.<br> This field is optional.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロード対象のキャンペーンIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Campaign ID of export objective.<br> This field is optional.</div> ")

@Size(max=500) 
  public List<Long> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public CampaignExportServiceExportSetting campaignUserStatuses(List<CampaignExportServiceUserStatus> campaignUserStatuses) {
    this.campaignUserStatuses = campaignUserStatuses;
    return this;
  }

  public CampaignExportServiceExportSetting addCampaignUserStatusesItem(CampaignExportServiceUserStatus campaignUserStatusesItem) {
    if (this.campaignUserStatuses == null) {
      this.campaignUserStatuses = new ArrayList<>();
    }
    this.campaignUserStatuses.add(campaignUserStatusesItem);
    return this;
  }

  /**
   * Get campaignUserStatuses
   * @return campaignUserStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<CampaignExportServiceUserStatus> getCampaignUserStatuses() {
    return campaignUserStatuses;
  }

  public void setCampaignUserStatuses(List<CampaignExportServiceUserStatus> campaignUserStatuses) {
    this.campaignUserStatuses = campaignUserStatuses;
  }

  public CampaignExportServiceExportSetting encoding(CampaignExportServiceEncoding encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Get encoding
   * @return encoding
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignExportServiceEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(CampaignExportServiceEncoding encoding) {
    this.encoding = encoding;
  }

  public CampaignExportServiceExportSetting entityTypes(List<CampaignExportServiceEntityType> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  public CampaignExportServiceExportSetting addEntityTypesItem(CampaignExportServiceEntityType entityTypesItem) {
    if (this.entityTypes == null) {
      this.entityTypes = new ArrayList<>();
    }
    this.entityTypes.add(entityTypesItem);
    return this;
  }

  /**
   * Get entityTypes
   * @return entityTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=6) 
  public List<CampaignExportServiceEntityType> getEntityTypes() {
    return entityTypes;
  }

  public void setEntityTypes(List<CampaignExportServiceEntityType> entityTypes) {
    this.entityTypes = entityTypes;
  }

  public CampaignExportServiceExportSetting exportFields(List<String> exportFields) {
    this.exportFields = exportFields;
    return this;
  }

  public CampaignExportServiceExportSetting addExportFieldsItem(String exportFieldsItem) {
    if (this.exportFields == null) {
      this.exportFields = new ArrayList<>();
    }
    this.exportFields.add(exportFieldsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エクスポートするフィールドを指定します。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Select which field to export.<br> This field is optional.</div> 
   * @return exportFields
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エクスポートするフィールドを指定します。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Select which field to export.<br> This field is optional.</div> ")


  public List<String> getExportFields() {
    return exportFields;
  }

  public void setExportFields(List<String> exportFields) {
    this.exportFields = exportFields;
  }

  public CampaignExportServiceExportSetting jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードするジョブの名称です。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Job information for export.<br> This field is optional.</div> 
   * @return jobName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードするジョブの名称です。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Job information for export.<br> This field is optional.</div> ")


  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public CampaignExportServiceExportSetting lang(CampaignExportServiceLang lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignExportServiceLang getLang() {
    return lang;
  }

  public void setLang(CampaignExportServiceLang lang) {
    this.lang = lang;
  }

  public CampaignExportServiceExportSetting output(CampaignExportServiceOutput output) {
    this.output = output;
    return this;
  }

  /**
   * Get output
   * @return output
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignExportServiceOutput getOutput() {
    return output;
  }

  public void setOutput(CampaignExportServiceOutput output) {
    this.output = output;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignExportServiceExportSetting campaignExportServiceExportSetting = (CampaignExportServiceExportSetting) o;
    return Objects.equals(this.accountId, campaignExportServiceExportSetting.accountId) &&
        Objects.equals(this.adGroupAdApprovalStatuses, campaignExportServiceExportSetting.adGroupAdApprovalStatuses) &&
        Objects.equals(this.adGroupAdUserStatuses, campaignExportServiceExportSetting.adGroupAdUserStatuses) &&
        Objects.equals(this.adGroupCriterionApprovalStatuses, campaignExportServiceExportSetting.adGroupCriterionApprovalStatuses) &&
        Objects.equals(this.adGroupCriterionIds, campaignExportServiceExportSetting.adGroupCriterionIds) &&
        Objects.equals(this.adGroupCriterionUserStatuses, campaignExportServiceExportSetting.adGroupCriterionUserStatuses) &&
        Objects.equals(this.adGroupIds, campaignExportServiceExportSetting.adGroupIds) &&
        Objects.equals(this.adGroupUserStatuses, campaignExportServiceExportSetting.adGroupUserStatuses) &&
        Objects.equals(this.adIds, campaignExportServiceExportSetting.adIds) &&
        Objects.equals(this.campaignCriterionIds, campaignExportServiceExportSetting.campaignCriterionIds) &&
        Objects.equals(this.campaignIds, campaignExportServiceExportSetting.campaignIds) &&
        Objects.equals(this.campaignUserStatuses, campaignExportServiceExportSetting.campaignUserStatuses) &&
        Objects.equals(this.encoding, campaignExportServiceExportSetting.encoding) &&
        Objects.equals(this.entityTypes, campaignExportServiceExportSetting.entityTypes) &&
        Objects.equals(this.exportFields, campaignExportServiceExportSetting.exportFields) &&
        Objects.equals(this.jobName, campaignExportServiceExportSetting.jobName) &&
        Objects.equals(this.lang, campaignExportServiceExportSetting.lang) &&
        Objects.equals(this.output, campaignExportServiceExportSetting.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, adGroupAdApprovalStatuses, adGroupAdUserStatuses, adGroupCriterionApprovalStatuses, adGroupCriterionIds, adGroupCriterionUserStatuses, adGroupIds, adGroupUserStatuses, adIds, campaignCriterionIds, campaignIds, campaignUserStatuses, encoding, entityTypes, exportFields, jobName, lang, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignExportServiceExportSetting {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adGroupAdApprovalStatuses: ").append(toIndentedString(adGroupAdApprovalStatuses)).append("\n");
    sb.append("    adGroupAdUserStatuses: ").append(toIndentedString(adGroupAdUserStatuses)).append("\n");
    sb.append("    adGroupCriterionApprovalStatuses: ").append(toIndentedString(adGroupCriterionApprovalStatuses)).append("\n");
    sb.append("    adGroupCriterionIds: ").append(toIndentedString(adGroupCriterionIds)).append("\n");
    sb.append("    adGroupCriterionUserStatuses: ").append(toIndentedString(adGroupCriterionUserStatuses)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    adGroupUserStatuses: ").append(toIndentedString(adGroupUserStatuses)).append("\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    campaignCriterionIds: ").append(toIndentedString(campaignCriterionIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignUserStatuses: ").append(toIndentedString(campaignUserStatuses)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
    sb.append("    exportFields: ").append(toIndentedString(exportFields)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

