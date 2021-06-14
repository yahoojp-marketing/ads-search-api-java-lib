package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.FeedServicePlaceholderType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedServiceSelectorオブジェクトは、自動データ挿入のリストの基本情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedServiceSelector describes the basic information of list of Data auto insertion.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedServiceSelectorオブジェクトは、自動データ挿入のリストの基本情報を格納します。</div> <div lang=\"en\">FeedServiceSelector describes the basic information of list of Data auto insertion.</div> ")

public class FeedServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("feedIds")
  @Valid
  private JsonNullable<List<Long>> feedIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("placeholderTypes")
  @Valid
  private JsonNullable<List<FeedServicePlaceholderType>> placeholderTypes = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public FeedServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public FeedServiceSelector feedIds(List<Long> feedIds) {
    this.feedIds = JsonNullable.of(feedIds);
    return this;
  }

  public FeedServiceSelector addFeedIdsItem(Long feedIdsItem) {
    if (this.feedIds == null || !this.feedIds.isPresent()) {
      this.feedIds = JsonNullable.of(new ArrayList<>());
    }
    this.feedIds.get().add(feedIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">自動データ挿入のリストのIDです。</div> <div lang=\"en\">List ID of Feed.</div> 
   * @return feedIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動データ挿入のリストのIDです。</div> <div lang=\"en\">List ID of Feed.</div> ")

@Size(max=200) 
  public JsonNullable<List<Long>> getFeedIds() {
    return feedIds;
  }

  public void setFeedIds(JsonNullable<List<Long>> feedIds) {
    this.feedIds = feedIds;
  }

  public FeedServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 50
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(50) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public FeedServiceSelector placeholderTypes(List<FeedServicePlaceholderType> placeholderTypes) {
    this.placeholderTypes = JsonNullable.of(placeholderTypes);
    return this;
  }

  public FeedServiceSelector addPlaceholderTypesItem(FeedServicePlaceholderType placeholderTypesItem) {
    if (this.placeholderTypes == null || !this.placeholderTypes.isPresent()) {
      this.placeholderTypes = JsonNullable.of(new ArrayList<>());
    }
    this.placeholderTypes.get().add(placeholderTypesItem);
    return this;
  }

  /**
   * Get placeholderTypes
   * @return placeholderTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public JsonNullable<List<FeedServicePlaceholderType>> getPlaceholderTypes() {
    return placeholderTypes;
  }

  public void setPlaceholderTypes(JsonNullable<List<FeedServicePlaceholderType>> placeholderTypes) {
    this.placeholderTypes = placeholderTypes;
  }

  public FeedServiceSelector startIndex(Integer startIndex) {
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
    FeedServiceSelector feedServiceSelector = (FeedServiceSelector) o;
    return Objects.equals(this.accountId, feedServiceSelector.accountId) &&
        Objects.equals(this.feedIds, feedServiceSelector.feedIds) &&
        Objects.equals(this.numberResults, feedServiceSelector.numberResults) &&
        Objects.equals(this.placeholderTypes, feedServiceSelector.placeholderTypes) &&
        Objects.equals(this.startIndex, feedServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, feedIds, numberResults, placeholderTypes, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    feedIds: ").append(toIndentedString(feedIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    placeholderTypes: ").append(toIndentedString(placeholderTypes)).append("\n");
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

