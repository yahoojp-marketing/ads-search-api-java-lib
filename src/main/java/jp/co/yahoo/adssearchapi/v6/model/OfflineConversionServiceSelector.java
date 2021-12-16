package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.OfflineConversionServiceSort;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;OfflineConversionServiceSelectorオブジェクトは、登録したオフラインコンバージョンデータを照会するための検索条件を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;OfflineConversionServiceSelector object contains search condition to inquire about registered offline conversion data.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">OfflineConversionServiceSelectorオブジェクトは、登録したオフラインコンバージョンデータを照会するための検索条件を格納します。</div> <div lang=\"en\">OfflineConversionServiceSelector object contains search condition to inquire about registered offline conversion data.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OfflineConversionServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.11";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("uploadIds")
  @Valid
  private List<Long> uploadIds = null;

  @JsonProperty("sorts")
  @Valid
  private List<OfflineConversionServiceSort> sorts = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  public OfflineConversionServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search conditon: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search conditon: Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public OfflineConversionServiceSelector uploadIds(List<Long> uploadIds) {
    this.uploadIds = uploadIds;
    return this;
  }

  public OfflineConversionServiceSelector addUploadIdsItem(Long uploadIdsItem) {
    if (this.uploadIds == null) {
      this.uploadIds = new ArrayList<>();
    }
    this.uploadIds.add(uploadIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アップロードIDです。</div> <div lang=\"en\">Search conditon: Upload ID.</div> 
   * @return uploadIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アップロードIDです。</div> <div lang=\"en\">Search conditon: Upload ID.</div> ")

@Size(max=1000) 
  public List<Long> getUploadIds() {
    return uploadIds;
  }

  public void setUploadIds(List<Long> uploadIds) {
    this.uploadIds = uploadIds;
  }

  public OfflineConversionServiceSelector sorts(List<OfflineConversionServiceSort> sorts) {
    this.sorts = sorts;
    return this;
  }

  public OfflineConversionServiceSelector addSortsItem(OfflineConversionServiceSort sortsItem) {
    if (this.sorts == null) {
      this.sorts = new ArrayList<>();
    }
    this.sorts.add(sortsItem);
    return this;
  }

  /**
   * Get sorts
   * @return sorts
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OfflineConversionServiceSort> getSorts() {
    return sorts;
  }

  public void setSorts(List<OfflineConversionServiceSort> sorts) {
    this.sorts = sorts;
  }

  public OfflineConversionServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
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
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public OfflineConversionServiceSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

