/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignExportServiceFieldAttribute オブジェクトは、ジョブ作成に使用できるフィールドを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignExportServiceFieldAttribute object displays available fields for creating jobs.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignExportServiceFieldAttribute.JSON_PROPERTY_DISPLAY_FIELD_NAME_E_N,
  CampaignExportServiceFieldAttribute.JSON_PROPERTY_DISPLAY_FIELD_NAME_J_A,
  CampaignExportServiceFieldAttribute.JSON_PROPERTY_FIELD_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignExportServiceFieldAttribute {
  public static final String JSON_PROPERTY_DISPLAY_FIELD_NAME_E_N = "displayFieldNameEN";
  private String displayFieldNameEN;

  public static final String JSON_PROPERTY_DISPLAY_FIELD_NAME_J_A = "displayFieldNameJA";
  private String displayFieldNameJA;

  public static final String JSON_PROPERTY_FIELD_NAME = "fieldName";
  private String fieldName;

  public CampaignExportServiceFieldAttribute() {
  }

  public CampaignExportServiceFieldAttribute displayFieldNameEN(String displayFieldNameEN) {
    
    this.displayFieldNameEN = displayFieldNameEN;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィールドの英語表示名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Display name (EN).&lt;/div&gt; 
   * @return displayFieldNameEN
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_E_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayFieldNameEN() {
    return displayFieldNameEN;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_E_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayFieldNameEN(String displayFieldNameEN) {
    this.displayFieldNameEN = displayFieldNameEN;
  }


  public CampaignExportServiceFieldAttribute displayFieldNameJA(String displayFieldNameJA) {
    
    this.displayFieldNameJA = displayFieldNameJA;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィールドの日本語表示名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Display name (JA).&lt;/div&gt; 
   * @return displayFieldNameJA
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_J_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayFieldNameJA() {
    return displayFieldNameJA;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_FIELD_NAME_J_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayFieldNameJA(String displayFieldNameJA) {
    this.displayFieldNameJA = displayFieldNameJA;
  }


  public CampaignExportServiceFieldAttribute fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;フィールド名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Field name.&lt;/div&gt; 
   * @return fieldName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldName() {
    return fieldName;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignExportServiceFieldAttribute campaignExportServiceFieldAttribute = (CampaignExportServiceFieldAttribute) o;
    return Objects.equals(this.displayFieldNameEN, campaignExportServiceFieldAttribute.displayFieldNameEN) &&
        Objects.equals(this.displayFieldNameJA, campaignExportServiceFieldAttribute.displayFieldNameJA) &&
        Objects.equals(this.fieldName, campaignExportServiceFieldAttribute.fieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayFieldNameEN, displayFieldNameJA, fieldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignExportServiceFieldAttribute {\n");
    sb.append("    displayFieldNameEN: ").append(toIndentedString(displayFieldNameEN)).append("\n");
    sb.append("    displayFieldNameJA: ").append(toIndentedString(displayFieldNameJA)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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

