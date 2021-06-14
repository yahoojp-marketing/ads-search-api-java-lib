package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.OfflineConversionServiceSortField;
import jp.co.yahoo.adssearchapi.v5.model.OfflineConversionServiceSortType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索結果のソート指定です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Specify sorting of search results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">検索結果のソート指定です。</div> <div lang=\"en\">Specify sorting of search results.</div> ")

public class OfflineConversionServiceSort   {
  @JsonProperty("sortType")
  private JsonNullable<OfflineConversionServiceSortType> sortType = JsonNullable.undefined();

  @JsonProperty("sortField")
  private JsonNullable<OfflineConversionServiceSortField> sortField = JsonNullable.undefined();

  public OfflineConversionServiceSort sortType(OfflineConversionServiceSortType sortType) {
    this.sortType = JsonNullable.of(sortType);
    return this;
  }

  /**
   * Get sortType
   * @return sortType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<OfflineConversionServiceSortType> getSortType() {
    return sortType;
  }

  public void setSortType(JsonNullable<OfflineConversionServiceSortType> sortType) {
    this.sortType = sortType;
  }

  public OfflineConversionServiceSort sortField(OfflineConversionServiceSortField sortField) {
    this.sortField = JsonNullable.of(sortField);
    return this;
  }

  /**
   * Get sortField
   * @return sortField
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<OfflineConversionServiceSortField> getSortField() {
    return sortField;
  }

  public void setSortField(JsonNullable<OfflineConversionServiceSortField> sortField) {
    this.sortField = sortField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineConversionServiceSort offlineConversionServiceSort = (OfflineConversionServiceSort) o;
    return Objects.equals(this.sortType, offlineConversionServiceSort.sortType) &&
        Objects.equals(this.sortField, offlineConversionServiceSort.sortField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortType, sortField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineConversionServiceSort {\n");
    
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
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

