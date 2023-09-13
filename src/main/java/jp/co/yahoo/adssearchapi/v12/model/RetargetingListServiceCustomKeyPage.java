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
import jp.co.yahoo.adssearchapi.v12.model.RetargetingListServiceCustomKey;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceCustomKeyPageは、ターゲットリストのカスタムキー情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceCustomKeyPage is an object that holds custom key information of target list.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  RetargetingListServiceCustomKeyPage.JSON_PROPERTY_CUSTOM_KEYS,
  RetargetingListServiceCustomKeyPage.JSON_PROPERTY_TOTAL_NUM_ENTRIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceCustomKeyPage {
  public static final String JSON_PROPERTY_CUSTOM_KEYS = "customKeys";
  private RetargetingListServiceCustomKey customKeys;

  public static final String JSON_PROPERTY_TOTAL_NUM_ENTRIES = "totalNumEntries";
  private Integer totalNumEntries;

  public RetargetingListServiceCustomKeyPage() {
  }

  public RetargetingListServiceCustomKeyPage customKeys(RetargetingListServiceCustomKey customKeys) {
    
    this.customKeys = customKeys;
    return this;
  }

   /**
   * Get customKeys
   * @return customKeys
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceCustomKey getCustomKeys() {
    return customKeys;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomKeys(RetargetingListServiceCustomKey customKeys) {
    this.customKeys = customKeys;
  }


  public RetargetingListServiceCustomKeyPage totalNumEntries(Integer totalNumEntries) {
    
    this.totalNumEntries = totalNumEntries;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得される項目の総件数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total number of entries in the result that this page is a part of.&lt;/div&gt; 
   * @return totalNumEntries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_NUM_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUM_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceCustomKeyPage retargetingListServiceCustomKeyPage = (RetargetingListServiceCustomKeyPage) o;
    return Objects.equals(this.customKeys, retargetingListServiceCustomKeyPage.customKeys) &&
        Objects.equals(this.totalNumEntries, retargetingListServiceCustomKeyPage.totalNumEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customKeys, totalNumEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceCustomKeyPage {\n");
    sb.append("    customKeys: ").append(toIndentedString(customKeys)).append("\n");
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
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

