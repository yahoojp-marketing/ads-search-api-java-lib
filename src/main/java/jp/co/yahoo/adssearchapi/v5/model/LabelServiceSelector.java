package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.LabelServiceCountLabeledEntity;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;LabelServiceSelectorオブジェクトは、操作の対象とするラベルの情報およびフィルタ条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;LabelServiceSelector object describes the information of label to be operated and filter conditions.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">LabelServiceSelectorオブジェクトは、操作の対象とするラベルの情報およびフィルタ条件を表します。</div> <div lang=\"en\">LabelServiceSelector object describes the information of label to be operated and filter conditions.</div> ")

public class LabelServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("countLabeledEntity")
  private JsonNullable<LabelServiceCountLabeledEntity> countLabeledEntity = JsonNullable.undefined();

  @JsonProperty("labelIds")
  @Valid
  private JsonNullable<List<Long>> labelIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public LabelServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public LabelServiceSelector countLabeledEntity(LabelServiceCountLabeledEntity countLabeledEntity) {
    this.countLabeledEntity = JsonNullable.of(countLabeledEntity);
    return this;
  }

  /**
   * Get countLabeledEntity
   * @return countLabeledEntity
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<LabelServiceCountLabeledEntity> getCountLabeledEntity() {
    return countLabeledEntity;
  }

  public void setCountLabeledEntity(JsonNullable<LabelServiceCountLabeledEntity> countLabeledEntity) {
    this.countLabeledEntity = countLabeledEntity;
  }

  public LabelServiceSelector labelIds(List<Long> labelIds) {
    this.labelIds = JsonNullable.of(labelIds);
    return this;
  }

  public LabelServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null || !this.labelIds.isPresent()) {
      this.labelIds = JsonNullable.of(new ArrayList<>());
    }
    this.labelIds.get().add(labelIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">ラベルID<br>指定しない場合は、フィルタ条件に すべてのラベルが含まれます。</div> <div lang=\"en\">Label ID.<br>If not specified, the filter condition includes all labels.</div> 
   * @return labelIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルID<br>指定しない場合は、フィルタ条件に すべてのラベルが含まれます。</div> <div lang=\"en\">Label ID.<br>If not specified, the filter condition includes all labels.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getLabelIds() {
    return labelIds;
  }

  public void setLabelIds(JsonNullable<List<Long>> labelIds) {
    this.labelIds = labelIds;
  }

  public LabelServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 2000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(2000) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public LabelServiceSelector startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelServiceSelector labelServiceSelector = (LabelServiceSelector) o;
    return Objects.equals(this.accountId, labelServiceSelector.accountId) &&
        Objects.equals(this.countLabeledEntity, labelServiceSelector.countLabeledEntity) &&
        Objects.equals(this.labelIds, labelServiceSelector.labelIds) &&
        Objects.equals(this.numberResults, labelServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, labelServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, countLabeledEntity, labelIds, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    countLabeledEntity: ").append(toIndentedString(countLabeledEntity)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

