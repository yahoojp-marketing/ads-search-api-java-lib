/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v8.model.OfflineConversionServiceSortField;
import jp.co.yahoo.adssearchapi.v8.model.OfflineConversionServiceSortType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索結果のソート指定です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Specify sorting of search results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">検索結果のソート指定です。</div> <div lang=\"en\">Specify sorting of search results.</div> ")
@JsonPropertyOrder({
  OfflineConversionServiceSort.JSON_PROPERTY_SORT_TYPE,
  OfflineConversionServiceSort.JSON_PROPERTY_SORT_FIELD
})
@JsonTypeName("OfflineConversionServiceSort")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OfflineConversionServiceSort {
  public static final String JSON_PROPERTY_SORT_TYPE = "sortType";
  private OfflineConversionServiceSortType sortType;

  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private OfflineConversionServiceSortField sortField;

  public OfflineConversionServiceSort() { 
  }

  public OfflineConversionServiceSort sortType(OfflineConversionServiceSortType sortType) {
    
    this.sortType = sortType;
    return this;
  }

   /**
   * Get sortType
   * @return sortType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OfflineConversionServiceSortType getSortType() {
    return sortType;
  }


  @JsonProperty(JSON_PROPERTY_SORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortType(OfflineConversionServiceSortType sortType) {
    this.sortType = sortType;
  }


  public OfflineConversionServiceSort sortField(OfflineConversionServiceSortField sortField) {
    
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OfflineConversionServiceSortField getSortField() {
    return sortField;
  }


  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortField(OfflineConversionServiceSortField sortField) {
    this.sortField = sortField;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

