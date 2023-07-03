/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v9/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v9.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceBiddingKeywordCpcRangeは、入札価格による検索対象範囲を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceBiddingKeywordCpcRange represents the search range by bid price.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupCriterionServiceBiddingKeywordCpcRange.JSON_PROPERTY_MIN,
  AdGroupCriterionServiceBiddingKeywordCpcRange.JSON_PROPERTY_MAX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupCriterionServiceBiddingKeywordCpcRange {
  public static final String JSON_PROPERTY_MIN = "min";
  private Long min;

  public static final String JSON_PROPERTY_MAX = "max";
  private Long max;

  public AdGroupCriterionServiceBiddingKeywordCpcRange() {
  }

  public AdGroupCriterionServiceBiddingKeywordCpcRange min(Long min) {
    
    this.min = min;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索対象範囲の最小値です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This is the minimum value of the search range.&lt;/div&gt; 
   * @return min
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMin() {
    return min;
  }


  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMin(Long min) {
    this.min = min;
  }


  public AdGroupCriterionServiceBiddingKeywordCpcRange max(Long max) {
    
    this.max = max;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索対象範囲の最大値です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This is the maximum value of the search range.&lt;/div&gt; 
   * @return max
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMax() {
    return max;
  }


  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMax(Long max) {
    this.max = max;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceBiddingKeywordCpcRange adGroupCriterionServiceBiddingKeywordCpcRange = (AdGroupCriterionServiceBiddingKeywordCpcRange) o;
    return Objects.equals(this.min, adGroupCriterionServiceBiddingKeywordCpcRange.min) &&
        Objects.equals(this.max, adGroupCriterionServiceBiddingKeywordCpcRange.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceBiddingKeywordCpcRange {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

