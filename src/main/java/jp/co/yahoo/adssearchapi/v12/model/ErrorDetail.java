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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ErrorDetailオブジェクトは、エラーの詳細な内容を表します。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;Detailed information of error.&lt;/div&gt;
 */
@JsonPropertyOrder({
  ErrorDetail.JSON_PROPERTY_REQUEST_KEY,
  ErrorDetail.JSON_PROPERTY_REQUEST_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ErrorDetail {
  public static final String JSON_PROPERTY_REQUEST_KEY = "requestKey";
  private String requestKey;

  public static final String JSON_PROPERTY_REQUEST_VALUE = "requestValue";
  private String requestValue;

  public ErrorDetail() {
  }

  public ErrorDetail requestKey(String requestKey) {
    
    this.requestKey = requestKey;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;エラーが発生したフィールドです。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The file that occurred the error.&lt;/div&gt;
   * @return requestKey
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestKey() {
    return requestKey;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestKey(String requestKey) {
    this.requestKey = requestKey;
  }


  public ErrorDetail requestValue(String requestValue) {
    
    this.requestValue = requestValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;エラーが発生した値です。&lt;/div&gt;&lt;div lang&#x3D;\&quot;en\&quot;&gt;The data that caused the error.&lt;/div&gt;
   * @return requestValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestValue() {
    return requestValue;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestValue(String requestValue) {
    this.requestValue = requestValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetail errorDetail = (ErrorDetail) o;
    return Objects.equals(this.requestKey, errorDetail.requestKey) &&
        Objects.equals(this.requestValue, errorDetail.requestValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestKey, requestValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetail {\n");
    sb.append("    requestKey: ").append(toIndentedString(requestKey)).append("\n");
    sb.append("    requestValue: ").append(toIndentedString(requestValue)).append("\n");
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

