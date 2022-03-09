/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.KeywordEstimatorServiceEstimateKeyword;
import jp.co.yahoo.adssearchapi.v7.model.KeywordEstimatorServiceIsNegativeBool;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * KeywordEstimatorServiceKeywordEstimateRequest
 */
@JsonPropertyOrder({
  KeywordEstimatorServiceKeywordEstimateRequest.JSON_PROPERTY_ESTIMATE_KEYWORD,
  KeywordEstimatorServiceKeywordEstimateRequest.JSON_PROPERTY_IS_NEGATIVE_BOOL,
  KeywordEstimatorServiceKeywordEstimateRequest.JSON_PROPERTY_CPC
})
@JsonTypeName("KeywordEstimatorServiceKeywordEstimateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordEstimatorServiceKeywordEstimateRequest {
  public static final String JSON_PROPERTY_ESTIMATE_KEYWORD = "estimateKeyword";
  private KeywordEstimatorServiceEstimateKeyword estimateKeyword;

  public static final String JSON_PROPERTY_IS_NEGATIVE_BOOL = "isNegativeBool";
  private KeywordEstimatorServiceIsNegativeBool isNegativeBool;

  public static final String JSON_PROPERTY_CPC = "cpc";
  private Long cpc;

  public KeywordEstimatorServiceKeywordEstimateRequest() { 
  }

  public KeywordEstimatorServiceKeywordEstimateRequest estimateKeyword(KeywordEstimatorServiceEstimateKeyword estimateKeyword) {
    
    this.estimateKeyword = estimateKeyword;
    return this;
  }

   /**
   * Get estimateKeyword
   * @return estimateKeyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ESTIMATE_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeywordEstimatorServiceEstimateKeyword getEstimateKeyword() {
    return estimateKeyword;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATE_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEstimateKeyword(KeywordEstimatorServiceEstimateKeyword estimateKeyword) {
    this.estimateKeyword = estimateKeyword;
  }


  public KeywordEstimatorServiceKeywordEstimateRequest isNegativeBool(KeywordEstimatorServiceIsNegativeBool isNegativeBool) {
    
    this.isNegativeBool = isNegativeBool;
    return this;
  }

   /**
   * Get isNegativeBool
   * @return isNegativeBool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_NEGATIVE_BOOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeywordEstimatorServiceIsNegativeBool getIsNegativeBool() {
    return isNegativeBool;
  }


  @JsonProperty(JSON_PROPERTY_IS_NEGATIVE_BOOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsNegativeBool(KeywordEstimatorServiceIsNegativeBool isNegativeBool) {
    this.isNegativeBool = isNegativeBool;
  }


  public KeywordEstimatorServiceKeywordEstimateRequest cpc(Long cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キーワードの見積もりに使用する上限クリック単価です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;cpc for the keyword&lt;/div&gt; 
   * @return cpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードの見積もりに使用する上限クリック単価です。</div> <div lang=\"en\">cpc for the keyword</div> ")
  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCpc() {
    return cpc;
  }


  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpc(Long cpc) {
    this.cpc = cpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceKeywordEstimateRequest keywordEstimatorServiceKeywordEstimateRequest = (KeywordEstimatorServiceKeywordEstimateRequest) o;
    return Objects.equals(this.estimateKeyword, keywordEstimatorServiceKeywordEstimateRequest.estimateKeyword) &&
        Objects.equals(this.isNegativeBool, keywordEstimatorServiceKeywordEstimateRequest.isNegativeBool) &&
        Objects.equals(this.cpc, keywordEstimatorServiceKeywordEstimateRequest.cpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateKeyword, isNegativeBool, cpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceKeywordEstimateRequest {\n");
    sb.append("    estimateKeyword: ").append(toIndentedString(estimateKeyword)).append("\n");
    sb.append("    isNegativeBool: ").append(toIndentedString(isNegativeBool)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
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

