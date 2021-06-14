package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.BiddingStrategyServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceSelectorオブジェクトは、自動入札設定の検索条件に関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceSelector object displays the details of search results of auto bidding setting .&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceSelectorオブジェクトは、自動入札設定の検索条件に関する情報を表します。</div> <div lang=\"en\">BiddingStrategyServiceSelector object displays the details of search results of auto bidding setting .</div> ")

public class BiddingStrategyServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("biddingStrategyIds")
  @Valid
  private JsonNullable<List<Long>> biddingStrategyIds = JsonNullable.undefined();

  @JsonProperty("biddingStrategyTypes")
  @Valid
  private JsonNullable<List<BiddingStrategyServiceType>> biddingStrategyTypes = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public BiddingStrategyServiceSelector accountId(Long accountId) {
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

  public BiddingStrategyServiceSelector biddingStrategyIds(List<Long> biddingStrategyIds) {
    this.biddingStrategyIds = JsonNullable.of(biddingStrategyIds);
    return this;
  }

  public BiddingStrategyServiceSelector addBiddingStrategyIdsItem(Long biddingStrategyIdsItem) {
    if (this.biddingStrategyIds == null || !this.biddingStrategyIds.isPresent()) {
      this.biddingStrategyIds = JsonNullable.of(new ArrayList<>());
    }
    this.biddingStrategyIds.get().add(biddingStrategyIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札ID</div> <div lang=\"en\">Auto bidding ID.</div> 
   * @return biddingStrategyIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札ID</div> <div lang=\"en\">Auto bidding ID.</div> ")

@Size(max=500) 
  public JsonNullable<List<Long>> getBiddingStrategyIds() {
    return biddingStrategyIds;
  }

  public void setBiddingStrategyIds(JsonNullable<List<Long>> biddingStrategyIds) {
    this.biddingStrategyIds = biddingStrategyIds;
  }

  public BiddingStrategyServiceSelector biddingStrategyTypes(List<BiddingStrategyServiceType> biddingStrategyTypes) {
    this.biddingStrategyTypes = JsonNullable.of(biddingStrategyTypes);
    return this;
  }

  public BiddingStrategyServiceSelector addBiddingStrategyTypesItem(BiddingStrategyServiceType biddingStrategyTypesItem) {
    if (this.biddingStrategyTypes == null || !this.biddingStrategyTypes.isPresent()) {
      this.biddingStrategyTypes = JsonNullable.of(new ArrayList<>());
    }
    this.biddingStrategyTypes.get().add(biddingStrategyTypesItem);
    return this;
  }

  /**
   * Get biddingStrategyTypes
   * @return biddingStrategyTypes
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=3) 
  public JsonNullable<List<BiddingStrategyServiceType>> getBiddingStrategyTypes() {
    return biddingStrategyTypes;
  }

  public void setBiddingStrategyTypes(JsonNullable<List<BiddingStrategyServiceType>> biddingStrategyTypes) {
    this.biddingStrategyTypes = biddingStrategyTypes;
  }

  public BiddingStrategyServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public BiddingStrategyServiceSelector startIndex(Integer startIndex) {
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
    BiddingStrategyServiceSelector biddingStrategyServiceSelector = (BiddingStrategyServiceSelector) o;
    return Objects.equals(this.accountId, biddingStrategyServiceSelector.accountId) &&
        Objects.equals(this.biddingStrategyIds, biddingStrategyServiceSelector.biddingStrategyIds) &&
        Objects.equals(this.biddingStrategyTypes, biddingStrategyServiceSelector.biddingStrategyTypes) &&
        Objects.equals(this.numberResults, biddingStrategyServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, biddingStrategyServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, biddingStrategyIds, biddingStrategyTypes, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    biddingStrategyIds: ").append(toIndentedString(biddingStrategyIds)).append("\n");
    sb.append("    biddingStrategyTypes: ").append(toIndentedString(biddingStrategyTypes)).append("\n");
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

