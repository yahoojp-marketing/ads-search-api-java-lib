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
import jp.co.yahoo.adssearchapi.v12.model.CampaignTargetServiceExcludedType;
import jp.co.yahoo.adssearchapi.v12.model.CampaignTargetServiceTargetingStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceLocationTargetオブジェクトは、地域ターゲティング設定です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※targetTypeがLOCATIONの場合、このフィールドはADD時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServiceLocationTarget object is a location target setting.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If targetType is LOCATION,  this field is required in ADD operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignTargetServiceLocationTarget.JSON_PROPERTY_CITY_NAME_E_N,
  CampaignTargetServiceLocationTarget.JSON_PROPERTY_CITY_NAME_J_A,
  CampaignTargetServiceLocationTarget.JSON_PROPERTY_EXCLUDED_TYPE,
  CampaignTargetServiceLocationTarget.JSON_PROPERTY_PROVINCE_NAME_E_N,
  CampaignTargetServiceLocationTarget.JSON_PROPERTY_PROVINCE_NAME_J_A,
  CampaignTargetServiceLocationTarget.JSON_PROPERTY_TARGETING_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignTargetServiceLocationTarget {
  public static final String JSON_PROPERTY_CITY_NAME_E_N = "cityNameEN";
  private String cityNameEN;

  public static final String JSON_PROPERTY_CITY_NAME_J_A = "cityNameJA";
  private String cityNameJA;

  public static final String JSON_PROPERTY_EXCLUDED_TYPE = "excludedType";
  private CampaignTargetServiceExcludedType excludedType;

  public static final String JSON_PROPERTY_PROVINCE_NAME_E_N = "provinceNameEN";
  private String provinceNameEN;

  public static final String JSON_PROPERTY_PROVINCE_NAME_J_A = "provinceNameJA";
  private String provinceNameJA;

  public static final String JSON_PROPERTY_TARGETING_STATUS = "targetingStatus";
  private CampaignTargetServiceTargetingStatus targetingStatus;

  public CampaignTargetServiceLocationTarget() {
  }

  public CampaignTargetServiceLocationTarget cityNameEN(String cityNameEN) {
    
    this.cityNameEN = cityNameEN;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;市区町村名（英語）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;City(English).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return cityNameEN
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY_NAME_E_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCityNameEN() {
    return cityNameEN;
  }


  @JsonProperty(JSON_PROPERTY_CITY_NAME_E_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCityNameEN(String cityNameEN) {
    this.cityNameEN = cityNameEN;
  }


  public CampaignTargetServiceLocationTarget cityNameJA(String cityNameJA) {
    
    this.cityNameJA = cityNameJA;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;市区町村名（日本語）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;City(Japanese).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return cityNameJA
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY_NAME_J_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCityNameJA() {
    return cityNameJA;
  }


  @JsonProperty(JSON_PROPERTY_CITY_NAME_J_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCityNameJA(String cityNameJA) {
    this.cityNameJA = cityNameJA;
  }


  public CampaignTargetServiceLocationTarget excludedType(CampaignTargetServiceExcludedType excludedType) {
    
    this.excludedType = excludedType;
    return this;
  }

   /**
   * Get excludedType
   * @return excludedType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceExcludedType getExcludedType() {
    return excludedType;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludedType(CampaignTargetServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }


  public CampaignTargetServiceLocationTarget provinceNameEN(String provinceNameEN) {
    
    this.provinceNameEN = provinceNameEN;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;都道府県名（英語）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Prefecture(English).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return provinceNameEN
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVINCE_NAME_E_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvinceNameEN() {
    return provinceNameEN;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCE_NAME_E_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvinceNameEN(String provinceNameEN) {
    this.provinceNameEN = provinceNameEN;
  }


  public CampaignTargetServiceLocationTarget provinceNameJA(String provinceNameJA) {
    
    this.provinceNameJA = provinceNameJA;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;都道府県名（日本語）です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Prefecture(Japanese).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return provinceNameJA
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVINCE_NAME_J_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProvinceNameJA() {
    return provinceNameJA;
  }


  @JsonProperty(JSON_PROPERTY_PROVINCE_NAME_J_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvinceNameJA(String provinceNameJA) {
    this.provinceNameJA = provinceNameJA;
  }


  public CampaignTargetServiceLocationTarget targetingStatus(CampaignTargetServiceTargetingStatus targetingStatus) {
    
    this.targetingStatus = targetingStatus;
    return this;
  }

   /**
   * Get targetingStatus
   * @return targetingStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceTargetingStatus getTargetingStatus() {
    return targetingStatus;
  }


  @JsonProperty(JSON_PROPERTY_TARGETING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetingStatus(CampaignTargetServiceTargetingStatus targetingStatus) {
    this.targetingStatus = targetingStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargetServiceLocationTarget campaignTargetServiceLocationTarget = (CampaignTargetServiceLocationTarget) o;
    return Objects.equals(this.cityNameEN, campaignTargetServiceLocationTarget.cityNameEN) &&
        Objects.equals(this.cityNameJA, campaignTargetServiceLocationTarget.cityNameJA) &&
        Objects.equals(this.excludedType, campaignTargetServiceLocationTarget.excludedType) &&
        Objects.equals(this.provinceNameEN, campaignTargetServiceLocationTarget.provinceNameEN) &&
        Objects.equals(this.provinceNameJA, campaignTargetServiceLocationTarget.provinceNameJA) &&
        Objects.equals(this.targetingStatus, campaignTargetServiceLocationTarget.targetingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityNameEN, cityNameJA, excludedType, provinceNameEN, provinceNameJA, targetingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServiceLocationTarget {\n");
    sb.append("    cityNameEN: ").append(toIndentedString(cityNameEN)).append("\n");
    sb.append("    cityNameJA: ").append(toIndentedString(cityNameJA)).append("\n");
    sb.append("    excludedType: ").append(toIndentedString(excludedType)).append("\n");
    sb.append("    provinceNameEN: ").append(toIndentedString(provinceNameEN)).append("\n");
    sb.append("    provinceNameJA: ").append(toIndentedString(provinceNameJA)).append("\n");
    sb.append("    targetingStatus: ").append(toIndentedString(targetingStatus)).append("\n");
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

