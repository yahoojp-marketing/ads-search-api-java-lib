package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignExportServiceApprovalStatus;
import jp.co.yahoo.adssearchapi.v5.model.CampaignExportServiceEncoding;
import jp.co.yahoo.adssearchapi.v5.model.CampaignExportServiceEntityType;
import jp.co.yahoo.adssearchapi.v5.model.CampaignExportServiceLang;
import jp.co.yahoo.adssearchapi.v5.model.CampaignExportServiceOutput;
import jp.co.yahoo.adssearchapi.v5.model.CampaignExportServiceUserStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceExportSetting オブジェクトは、エクスポートする条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceExportSetting object describes the condition for exports.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignExportServiceExportSetting オブジェクトは、エクスポートする条件を表します。</div> <div lang=\"en\">CampaignExportServiceExportSetting object describes the condition for exports.</div> ")

public class CampaignExportServiceExportSetting   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("adGroupAdApprovalStatuses")
  @Valid
  private JsonNullable<List<CampaignExportServiceApprovalStatus>> adGroupAdApprovalStatuses = JsonNullable.undefined();

  @JsonProperty("adGroupAdUserStatuses")
  @Valid
  private JsonNullable<List<CampaignExportServiceUserStatus>> adGroupAdUserStatuses = JsonNullable.undefined();

  @JsonProperty("adGroupCriterionApprovalStatuses")
  @Valid
  private JsonNullable<List<CampaignExportServiceApprovalStatus>> adGroupCriterionApprovalStatuses = JsonNullable.undefined();

  @JsonProperty("adGroupCriterionIds")
  @Valid
  private JsonNullable<List<Long>> adGroupCriterionIds = JsonNullable.undefined();

  @JsonProperty("adGroupCriterionUserStatuses")
  @Valid
  private JsonNullable<List<CampaignExportServiceUserStatus>> adGroupCriterionUserStatuses = JsonNullable.undefined();

  @JsonProperty("adGroupIds")
  @Valid
  private JsonNullable<List<Long>> adGroupIds = JsonNullable.undefined();

  @JsonProperty("adGroupUserStatuses")
  @Valid
  private JsonNullable<List<CampaignExportServiceUserStatus>> adGroupUserStatuses = JsonNullable.undefined();

  @JsonProperty("adIds")
  @Valid
  private JsonNullable<List<Long>> adIds = JsonNullable.undefined();

  @JsonProperty("campaignCriterionIds")
  @Valid
  private JsonNullable<List<Long>> campaignCriterionIds = JsonNullable.undefined();

  @JsonProperty("campaignIds")
  @Valid
  private JsonNullable<List<Long>> campaignIds = JsonNullable.undefined();

  @JsonProperty("campaignUserStatuses")
  @Valid
  private JsonNullable<List<CampaignExportServiceUserStatus>> campaignUserStatuses = JsonNullable.undefined();

  @JsonProperty("encoding")
  private JsonNullable<CampaignExportServiceEncoding> encoding = JsonNullable.undefined();

  @JsonProperty("entityTypes")
  @Valid
  private JsonNullable<List<CampaignExportServiceEntityType>> entityTypes = JsonNullable.undefined();

  @JsonProperty("exportFields")
  @Valid
  private JsonNullable<List<String>> exportFields = JsonNullable.undefined();

  @JsonProperty("jobName")
  private JsonNullable<String> jobName = JsonNullable.undefined();

  @JsonProperty("lang")
  private JsonNullable<CampaignExportServiceLang> lang = JsonNullable.undefined();

  @JsonProperty("output")
  private JsonNullable<CampaignExportServiceOutput> output = JsonNullable.undefined();

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
    this.adGroupAdApprovalStatuses = JsonNullable.of(adGroupAdApprovalStatuses);
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupAdApprovalStatusesItem(CampaignExportServiceApprovalStatus adGroupAdApprovalStatusesItem) {
    if (this.adGroupAdApprovalStatuses == null || !this.adGroupAdApprovalStatuses.isPresent()) {
      this.adGroupAdApprovalStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupAdApprovalStatuses.get().add(adGroupAdApprovalStatusesItem);
    return this;
  }

  /**
   * Get adGroupAdApprovalStatuses
   * @return adGroupAdApprovalStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public JsonNullable<List<CampaignExportServiceApprovalStatus>> getAdGroupAdApprovalStatuses() {
    return adGroupAdApprovalStatuses;
  }

  public void setAdGroupAdApprovalStatuses(JsonNullable<List<CampaignExportServiceApprovalStatus>> adGroupAdApprovalStatuses) {
    this.adGroupAdApprovalStatuses = adGroupAdApprovalStatuses;
  }

  public CampaignExportServiceExportSetting adGroupAdUserStatuses(List<CampaignExportServiceUserStatus> adGroupAdUserStatuses) {
    this.adGroupAdUserStatuses = JsonNullable.of(adGroupAdUserStatuses);
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupAdUserStatusesItem(CampaignExportServiceUserStatus adGroupAdUserStatusesItem) {
    if (this.adGroupAdUserStatuses == null || !this.adGroupAdUserStatuses.isPresent()) {
      this.adGroupAdUserStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupAdUserStatuses.get().add(adGroupAdUserStatusesItem);
    return this;
  }

  /**
   * Get adGroupAdUserStatuses
   * @return adGroupAdUserStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public JsonNullable<List<CampaignExportServiceUserStatus>> getAdGroupAdUserStatuses() {
    return adGroupAdUserStatuses;
  }

  public void setAdGroupAdUserStatuses(JsonNullable<List<CampaignExportServiceUserStatus>> adGroupAdUserStatuses) {
    this.adGroupAdUserStatuses = adGroupAdUserStatuses;
  }

  public CampaignExportServiceExportSetting adGroupCriterionApprovalStatuses(List<CampaignExportServiceApprovalStatus> adGroupCriterionApprovalStatuses) {
    this.adGroupCriterionApprovalStatuses = JsonNullable.of(adGroupCriterionApprovalStatuses);
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupCriterionApprovalStatusesItem(CampaignExportServiceApprovalStatus adGroupCriterionApprovalStatusesItem) {
    if (this.adGroupCriterionApprovalStatuses == null || !this.adGroupCriterionApprovalStatuses.isPresent()) {
      this.adGroupCriterionApprovalStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupCriterionApprovalStatuses.get().add(adGroupCriterionApprovalStatusesItem);
    return this;
  }

  /**
   * Get adGroupCriterionApprovalStatuses
   * @return adGroupCriterionApprovalStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=5) 
  public JsonNullable<List<CampaignExportServiceApprovalStatus>> getAdGroupCriterionApprovalStatuses() {
    return adGroupCriterionApprovalStatuses;
  }

  public void setAdGroupCriterionApprovalStatuses(JsonNullable<List<CampaignExportServiceApprovalStatus>> adGroupCriterionApprovalStatuses) {
    this.adGroupCriterionApprovalStatuses = adGroupCriterionApprovalStatuses;
  }

  public CampaignExportServiceExportSetting adGroupCriterionIds(List<Long> adGroupCriterionIds) {
    this.adGroupCriterionIds = JsonNullable.of(adGroupCriterionIds);
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupCriterionIdsItem(Long adGroupCriterionIdsItem) {
    if (this.adGroupCriterionIds == null || !this.adGroupCriterionIds.isPresent()) {
      this.adGroupCriterionIds = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupCriterionIds.get().add(adGroupCriterionIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループクライテリアIDです。<br>このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad group criteria ID.<br>This field is optional.</div> 
   * @return adGroupCriterionIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループクライテリアIDです。<br>このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad group criteria ID.<br>This field is optional.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getAdGroupCriterionIds() {
    return adGroupCriterionIds;
  }

  public void setAdGroupCriterionIds(JsonNullable<List<Long>> adGroupCriterionIds) {
    this.adGroupCriterionIds = adGroupCriterionIds;
  }

  public CampaignExportServiceExportSetting adGroupCriterionUserStatuses(List<CampaignExportServiceUserStatus> adGroupCriterionUserStatuses) {
    this.adGroupCriterionUserStatuses = JsonNullable.of(adGroupCriterionUserStatuses);
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupCriterionUserStatusesItem(CampaignExportServiceUserStatus adGroupCriterionUserStatusesItem) {
    if (this.adGroupCriterionUserStatuses == null || !this.adGroupCriterionUserStatuses.isPresent()) {
      this.adGroupCriterionUserStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupCriterionUserStatuses.get().add(adGroupCriterionUserStatusesItem);
    return this;
  }

  /**
   * Get adGroupCriterionUserStatuses
   * @return adGroupCriterionUserStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public JsonNullable<List<CampaignExportServiceUserStatus>> getAdGroupCriterionUserStatuses() {
    return adGroupCriterionUserStatuses;
  }

  public void setAdGroupCriterionUserStatuses(JsonNullable<List<CampaignExportServiceUserStatus>> adGroupCriterionUserStatuses) {
    this.adGroupCriterionUserStatuses = adGroupCriterionUserStatuses;
  }

  public CampaignExportServiceExportSetting adGroupIds(List<Long> adGroupIds) {
    this.adGroupIds = JsonNullable.of(adGroupIds);
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupIdsItem(Long adGroupIdsItem) {
    if (this.adGroupIds == null || !this.adGroupIds.isPresent()) {
      this.adGroupIds = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupIds.get().add(adGroupIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロード対象の広告グループIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad group ID of export objective.<br> This field is optional.</div> 
   * @return adGroupIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロード対象の広告グループIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad group ID of export objective.<br> This field is optional.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(JsonNullable<List<Long>> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public CampaignExportServiceExportSetting adGroupUserStatuses(List<CampaignExportServiceUserStatus> adGroupUserStatuses) {
    this.adGroupUserStatuses = JsonNullable.of(adGroupUserStatuses);
    return this;
  }

  public CampaignExportServiceExportSetting addAdGroupUserStatusesItem(CampaignExportServiceUserStatus adGroupUserStatusesItem) {
    if (this.adGroupUserStatuses == null || !this.adGroupUserStatuses.isPresent()) {
      this.adGroupUserStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.adGroupUserStatuses.get().add(adGroupUserStatusesItem);
    return this;
  }

  /**
   * Get adGroupUserStatuses
   * @return adGroupUserStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public JsonNullable<List<CampaignExportServiceUserStatus>> getAdGroupUserStatuses() {
    return adGroupUserStatuses;
  }

  public void setAdGroupUserStatuses(JsonNullable<List<CampaignExportServiceUserStatus>> adGroupUserStatuses) {
    this.adGroupUserStatuses = adGroupUserStatuses;
  }

  public CampaignExportServiceExportSetting adIds(List<Long> adIds) {
    this.adIds = JsonNullable.of(adIds);
    return this;
  }

  public CampaignExportServiceExportSetting addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null || !this.adIds.isPresent()) {
      this.adIds = JsonNullable.of(new ArrayList<>());
    }
    this.adIds.get().add(adIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロード対象の広告IDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad ID of export objective.<br> This field is optional.</div> 
   * @return adIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロード対象の広告IDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Ad ID of export objective.<br> This field is optional.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getAdIds() {
    return adIds;
  }

  public void setAdIds(JsonNullable<List<Long>> adIds) {
    this.adIds = adIds;
  }

  public CampaignExportServiceExportSetting campaignCriterionIds(List<Long> campaignCriterionIds) {
    this.campaignCriterionIds = JsonNullable.of(campaignCriterionIds);
    return this;
  }

  public CampaignExportServiceExportSetting addCampaignCriterionIdsItem(Long campaignCriterionIdsItem) {
    if (this.campaignCriterionIds == null || !this.campaignCriterionIds.isPresent()) {
      this.campaignCriterionIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignCriterionIds.get().add(campaignCriterionIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンクライテリアIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Campaign criteria ID.<br> This field is optional.</div> 
   * @return campaignCriterionIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンクライテリアIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Campaign criteria ID.<br> This field is optional.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getCampaignCriterionIds() {
    return campaignCriterionIds;
  }

  public void setCampaignCriterionIds(JsonNullable<List<Long>> campaignCriterionIds) {
    this.campaignCriterionIds = campaignCriterionIds;
  }

  public CampaignExportServiceExportSetting campaignIds(List<Long> campaignIds) {
    this.campaignIds = JsonNullable.of(campaignIds);
    return this;
  }

  public CampaignExportServiceExportSetting addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null || !this.campaignIds.isPresent()) {
      this.campaignIds = JsonNullable.of(new ArrayList<>());
    }
    this.campaignIds.get().add(campaignIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロード対象のキャンペーンIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Campaign ID of export objective.<br> This field is optional.</div> 
   * @return campaignIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロード対象のキャンペーンIDです。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Campaign ID of export objective.<br> This field is optional.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(JsonNullable<List<Long>> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public CampaignExportServiceExportSetting campaignUserStatuses(List<CampaignExportServiceUserStatus> campaignUserStatuses) {
    this.campaignUserStatuses = JsonNullable.of(campaignUserStatuses);
    return this;
  }

  public CampaignExportServiceExportSetting addCampaignUserStatusesItem(CampaignExportServiceUserStatus campaignUserStatusesItem) {
    if (this.campaignUserStatuses == null || !this.campaignUserStatuses.isPresent()) {
      this.campaignUserStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.campaignUserStatuses.get().add(campaignUserStatusesItem);
    return this;
  }

  /**
   * Get campaignUserStatuses
   * @return campaignUserStatuses
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public JsonNullable<List<CampaignExportServiceUserStatus>> getCampaignUserStatuses() {
    return campaignUserStatuses;
  }

  public void setCampaignUserStatuses(JsonNullable<List<CampaignExportServiceUserStatus>> campaignUserStatuses) {
    this.campaignUserStatuses = campaignUserStatuses;
  }

  public CampaignExportServiceExportSetting encoding(CampaignExportServiceEncoding encoding) {
    this.encoding = JsonNullable.of(encoding);
    return this;
  }

  /**
   * Get encoding
   * @return encoding
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignExportServiceEncoding> getEncoding() {
    return encoding;
  }

  public void setEncoding(JsonNullable<CampaignExportServiceEncoding> encoding) {
    this.encoding = encoding;
  }

  public CampaignExportServiceExportSetting entityTypes(List<CampaignExportServiceEntityType> entityTypes) {
    this.entityTypes = JsonNullable.of(entityTypes);
    return this;
  }

  public CampaignExportServiceExportSetting addEntityTypesItem(CampaignExportServiceEntityType entityTypesItem) {
    if (this.entityTypes == null || !this.entityTypes.isPresent()) {
      this.entityTypes = JsonNullable.of(new ArrayList<>());
    }
    this.entityTypes.get().add(entityTypesItem);
    return this;
  }

  /**
   * Get entityTypes
   * @return entityTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=6) 
  public JsonNullable<List<CampaignExportServiceEntityType>> getEntityTypes() {
    return entityTypes;
  }

  public void setEntityTypes(JsonNullable<List<CampaignExportServiceEntityType>> entityTypes) {
    this.entityTypes = entityTypes;
  }

  public CampaignExportServiceExportSetting exportFields(List<String> exportFields) {
    this.exportFields = JsonNullable.of(exportFields);
    return this;
  }

  public CampaignExportServiceExportSetting addExportFieldsItem(String exportFieldsItem) {
    if (this.exportFields == null || !this.exportFields.isPresent()) {
      this.exportFields = JsonNullable.of(new ArrayList<>());
    }
    this.exportFields.get().add(exportFieldsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">エクスポートするフィールドを指定します。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Select which field to export.<br> This field is optional.</div> 
   * @return exportFields
  */
  @ApiModelProperty(value = "<div lang=\"ja\">エクスポートするフィールドを指定します。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Select which field to export.<br> This field is optional.</div> ")


  public JsonNullable<List<String>> getExportFields() {
    return exportFields;
  }

  public void setExportFields(JsonNullable<List<String>> exportFields) {
    this.exportFields = exportFields;
  }

  public CampaignExportServiceExportSetting jobName(String jobName) {
    this.jobName = JsonNullable.of(jobName);
    return this;
  }

  /**
   * <div lang=\"ja\">ダウンロードするジョブの名称です。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Job information for export.<br> This field is optional.</div> 
   * @return jobName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ダウンロードするジョブの名称です。<br> このフィールドは、省略可能となります。</div> <div lang=\"en\">Job information for export.<br> This field is optional.</div> ")


  public JsonNullable<String> getJobName() {
    return jobName;
  }

  public void setJobName(JsonNullable<String> jobName) {
    this.jobName = jobName;
  }

  public CampaignExportServiceExportSetting lang(CampaignExportServiceLang lang) {
    this.lang = JsonNullable.of(lang);
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignExportServiceLang> getLang() {
    return lang;
  }

  public void setLang(JsonNullable<CampaignExportServiceLang> lang) {
    this.lang = lang;
  }

  public CampaignExportServiceExportSetting output(CampaignExportServiceOutput output) {
    this.output = JsonNullable.of(output);
    return this;
  }

  /**
   * Get output
   * @return output
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignExportServiceOutput> getOutput() {
    return output;
  }

  public void setOutput(JsonNullable<CampaignExportServiceOutput> output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

