package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.OfflineConversionServiceSort;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;OfflineConversionServiceSelectorオブジェクトは、登録したオフラインコンバージョンデータを照会するための検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;OfflineConversionServiceSelector object contains search condition to inquire about registered offline conversion data.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">OfflineConversionServiceSelectorオブジェクトは、登録したオフラインコンバージョンデータを照会するための検索条件を格納します。</div> <div lang=\"en\">OfflineConversionServiceSelector object contains search condition to inquire about registered offline conversion data.</div> ")

public class OfflineConversionServiceSelector   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("uploadIds")
  @Valid
  private JsonNullable<List<Long>> uploadIds = JsonNullable.undefined();

  @JsonProperty("sorts")
  @Valid
  private JsonNullable<List<OfflineConversionServiceSort>> sorts = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public OfflineConversionServiceSelector accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search conditon: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search conditon: Account ID.</div> ")
  @NotNull


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public OfflineConversionServiceSelector uploadIds(List<Long> uploadIds) {
    this.uploadIds = JsonNullable.of(uploadIds);
    return this;
  }

  public OfflineConversionServiceSelector addUploadIdsItem(Long uploadIdsItem) {
    if (this.uploadIds == null || !this.uploadIds.isPresent()) {
      this.uploadIds = JsonNullable.of(new ArrayList<>());
    }
    this.uploadIds.get().add(uploadIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アップロードIDです。</div> <div lang=\"en\">Search conditon: Upload ID.</div> 
   * @return uploadIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アップロードIDです。</div> <div lang=\"en\">Search conditon: Upload ID.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getUploadIds() {
    return uploadIds;
  }

  public void setUploadIds(JsonNullable<List<Long>> uploadIds) {
    this.uploadIds = uploadIds;
  }

  public OfflineConversionServiceSelector sorts(List<OfflineConversionServiceSort> sorts) {
    this.sorts = JsonNullable.of(sorts);
    return this;
  }

  public OfflineConversionServiceSelector addSortsItem(OfflineConversionServiceSort sortsItem) {
    if (this.sorts == null || !this.sorts.isPresent()) {
      this.sorts = JsonNullable.of(new ArrayList<>());
    }
    this.sorts.get().add(sortsItem);
    return this;
  }

  /**
   * Get sorts
   * @return sorts
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<OfflineConversionServiceSort>> getSorts() {
    return sorts;
  }

  public void setSorts(JsonNullable<List<OfflineConversionServiceSort>> sorts) {
    this.sorts = sorts;
  }

  public OfflineConversionServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 1000
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(1000) 
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public OfflineConversionServiceSelector startIndex(Integer startIndex) {
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
    OfflineConversionServiceSelector offlineConversionServiceSelector = (OfflineConversionServiceSelector) o;
    return Objects.equals(this.accountId, offlineConversionServiceSelector.accountId) &&
        Objects.equals(this.uploadIds, offlineConversionServiceSelector.uploadIds) &&
        Objects.equals(this.sorts, offlineConversionServiceSelector.sorts) &&
        Objects.equals(this.numberResults, offlineConversionServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, offlineConversionServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, uploadIds, sorts, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineConversionServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    uploadIds: ").append(toIndentedString(uploadIds)).append("\n");
    sb.append("    sorts: ").append(toIndentedString(sorts)).append("\n");
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

