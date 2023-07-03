/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v11.model.AdGroupWebpageServiceWebpageParameter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceWebpageオブジェクトは、配信/除外設定するAdGroupWebpageServiceWebpageの条件を保持します。&lt;br&gt; このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceWebpage object contains the rules of webpage to be allowed or excluded.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupWebpageServiceWebpage.JSON_PROPERTY_PARAMETER,
  AdGroupWebpageServiceWebpage.JSON_PROPERTY_TARGET_ID,
  AdGroupWebpageServiceWebpage.JSON_PROPERTY_TARGET_TRACK_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupWebpageServiceWebpage {
  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private AdGroupWebpageServiceWebpageParameter parameter;

  public static final String JSON_PROPERTY_TARGET_ID = "targetId";
  private Long targetId;

  public static final String JSON_PROPERTY_TARGET_TRACK_ID = "targetTrackId";
  private Long targetTrackId;

  public AdGroupWebpageServiceWebpage() {
  }

  public AdGroupWebpageServiceWebpage parameter(AdGroupWebpageServiceWebpageParameter parameter) {
    
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupWebpageServiceWebpageParameter getParameter() {
    return parameter;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameter(AdGroupWebpageServiceWebpageParameter parameter) {
    this.parameter = parameter;
  }


  public AdGroupWebpageServiceWebpage targetId(Long targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceWebpageを識別するIDです。&lt;br&gt;このフィールドは、ADD時は無視され、SET時は必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Unique ID for each identify webpage.&lt;br&gt;This field will be ignored in ADD operation, and is required in SET operation.&lt;/div&gt; 
   * @return targetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetId() {
    return targetId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }


  public AdGroupWebpageServiceWebpage targetTrackId(Long targetTrackId) {
    
    this.targetTrackId = targetTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceWebpageを識別するトラッキングIDです。&lt;br&gt;このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking ID for each identify webpage.&lt;br&gt;Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return targetTrackId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetTrackId() {
    return targetTrackId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetTrackId(Long targetTrackId) {
    this.targetTrackId = targetTrackId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupWebpageServiceWebpage adGroupWebpageServiceWebpage = (AdGroupWebpageServiceWebpage) o;
    return Objects.equals(this.parameter, adGroupWebpageServiceWebpage.parameter) &&
        Objects.equals(this.targetId, adGroupWebpageServiceWebpage.targetId) &&
        Objects.equals(this.targetTrackId, adGroupWebpageServiceWebpage.targetTrackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameter, targetId, targetTrackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceWebpage {\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetTrackId: ").append(toIndentedString(targetTrackId)).append("\n");
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

