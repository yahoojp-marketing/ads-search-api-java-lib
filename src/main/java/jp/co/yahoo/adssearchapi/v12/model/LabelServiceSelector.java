/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

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
import jp.co.yahoo.adssearchapi.v12.model.LabelServiceCountLabeledEntity;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;LabelServiceSelectorオブジェクトは、操作の対象とするラベルの情報およびフィルタ条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;LabelServiceSelector object describes the information of label to be operated and filter conditions.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">LabelServiceSelectorオブジェクトは、操作の対象とするラベルの情報およびフィルタ条件を表します。</div> <div lang=\"en\">LabelServiceSelector object describes the information of label to be operated and filter conditions.</div> ")
@JsonPropertyOrder({
  LabelServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  LabelServiceSelector.JSON_PROPERTY_COUNT_LABELED_ENTITY,
  LabelServiceSelector.JSON_PROPERTY_LABEL_IDS,
  LabelServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  LabelServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("LabelServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LabelServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_COUNT_LABELED_ENTITY = "countLabeledEntity";
  private LabelServiceCountLabeledEntity countLabeledEntity;

  public static final String JSON_PROPERTY_LABEL_IDS = "labelIds";
  private List<Long> labelIds = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 2000;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public LabelServiceSelector() { 
  }

  public LabelServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public LabelServiceSelector countLabeledEntity(LabelServiceCountLabeledEntity countLabeledEntity) {
    
    this.countLabeledEntity = countLabeledEntity;
    return this;
  }

   /**
   * Get countLabeledEntity
   * @return countLabeledEntity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNT_LABELED_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LabelServiceCountLabeledEntity getCountLabeledEntity() {
    return countLabeledEntity;
  }


  @JsonProperty(JSON_PROPERTY_COUNT_LABELED_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountLabeledEntity(LabelServiceCountLabeledEntity countLabeledEntity) {
    this.countLabeledEntity = countLabeledEntity;
  }


  public LabelServiceSelector labelIds(List<Long> labelIds) {
    
    this.labelIds = labelIds;
    return this;
  }

  public LabelServiceSelector addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null) {
      this.labelIds = new ArrayList<>();
    }
    this.labelIds.add(labelIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベルID&lt;br&gt;指定しない場合は、フィルタ条件に すべてのラベルが含まれます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Label ID.&lt;br&gt;If not specified, the filter condition includes all labels.&lt;/div&gt; 
   * @return labelIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルID<br>指定しない場合は、フィルタ条件に すべてのラベルが含まれます。</div> <div lang=\"en\">Label ID.<br>If not specified, the filter condition includes all labels.</div> ")
  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getLabelIds() {
    return labelIds;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
  }


  public LabelServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 2000
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public LabelServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

