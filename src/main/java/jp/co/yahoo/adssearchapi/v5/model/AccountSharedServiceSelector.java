package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountSharedServiceSelectorオブジェクトは、検索条件（実行パラメータ）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountSharedServiceSelector object holds search criteria (exec parameter).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountSharedServiceSelectorオブジェクトは、検索条件（実行パラメータ）を保持します。</div> <div lang=\"en\">AccountSharedServiceSelector object holds search criteria (exec parameter).</div> ")

public class AccountSharedServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("sharedListIds")
  @Valid
  private JsonNullable<List<Long>> sharedListIds = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public AccountSharedServiceSelector accountId(Long accountId) {
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

  public AccountSharedServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 20
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(20) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public AccountSharedServiceSelector sharedListIds(List<Long> sharedListIds) {
    this.sharedListIds = JsonNullable.of(sharedListIds);
    return this;
  }

  public AccountSharedServiceSelector addSharedListIdsItem(Long sharedListIdsItem) {
    if (this.sharedListIds == null || !this.sharedListIds.isPresent()) {
      this.sharedListIds = JsonNullable.of(new ArrayList<>());
    }
    this.sharedListIds.get().add(sharedListIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索対象外キーワードリストIDです。</div> <div lang=\"en\">Negative keyword list ID.</div> 
   * @return sharedListIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索対象外キーワードリストIDです。</div> <div lang=\"en\">Negative keyword list ID.</div> ")

@Size(max=20) 
  public JsonNullable<List<Long>> getSharedListIds() {
    return sharedListIds;
  }

  public void setSharedListIds(JsonNullable<List<Long>> sharedListIds) {
    this.sharedListIds = sharedListIds;
  }

  public AccountSharedServiceSelector startIndex(Integer startIndex) {
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
    AccountSharedServiceSelector accountSharedServiceSelector = (AccountSharedServiceSelector) o;
    return Objects.equals(this.accountId, accountSharedServiceSelector.accountId) &&
        Objects.equals(this.numberResults, accountSharedServiceSelector.numberResults) &&
        Objects.equals(this.sharedListIds, accountSharedServiceSelector.sharedListIds) &&
        Objects.equals(this.startIndex, accountSharedServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, numberResults, sharedListIds, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSharedServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    sharedListIds: ").append(toIndentedString(sharedListIds)).append("\n");
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

