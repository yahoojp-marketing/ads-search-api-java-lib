/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.DictionaryServiceGeographicLocationStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceGeographicLocationオブジェクトは、地域情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocation contains geographic location information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceGeographicLocationオブジェクトは、地域情報を格納します。</div> <div lang=\"en\">DictionaryServiceGeographicLocation contains geographic location information.</div> ")
@JsonPropertyOrder({
  DictionaryServiceGeographicLocation.JSON_PROPERTY_CHILD,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_CODE,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_FULL_NAME,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_GEOGRAPHIC_LOCATION_STATUS,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_NAME,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_ORDER,
  DictionaryServiceGeographicLocation.JSON_PROPERTY_PARENT
})
@JsonTypeName("DictionaryServiceGeographicLocation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DictionaryServiceGeographicLocation {
  public static final String JSON_PROPERTY_CHILD = "child";
  private List<DictionaryServiceGeographicLocation> child = null;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_GEOGRAPHIC_LOCATION_STATUS = "geographicLocationStatus";
  private DictionaryServiceGeographicLocationStatus geographicLocationStatus;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORDER = "order";
  private String order;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private String parent;

  public DictionaryServiceGeographicLocation() { 
  }

  public DictionaryServiceGeographicLocation child(List<DictionaryServiceGeographicLocation> child) {
    
    this.child = child;
    return this;
  }

  public DictionaryServiceGeographicLocation addChildItem(DictionaryServiceGeographicLocation childItem) {
    if (this.child == null) {
      this.child = new ArrayList<>();
    }
    this.child.add(childItem);
    return this;
  }

   /**
   * Get child
   * @return child
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DictionaryServiceGeographicLocation> getChild() {
    return child;
  }


  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChild(List<DictionaryServiceGeographicLocation> child) {
    this.child = child;
  }


  public DictionaryServiceGeographicLocation code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;地域コードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Geographic code&lt;/div&gt; 
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">地域コードです。</div> <div lang=\"en\">Geographic code</div> ")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public DictionaryServiceGeographicLocation fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;地域名(都道府県名からすべて)です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of places (Prefecture and all)&lt;/div&gt; 
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">地域名(都道府県名からすべて)です。</div> <div lang=\"en\">Name of places (Prefecture and all)</div> ")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public DictionaryServiceGeographicLocation geographicLocationStatus(DictionaryServiceGeographicLocationStatus geographicLocationStatus) {
    
    this.geographicLocationStatus = geographicLocationStatus;
    return this;
  }

   /**
   * Get geographicLocationStatus
   * @return geographicLocationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEOGRAPHIC_LOCATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DictionaryServiceGeographicLocationStatus getGeographicLocationStatus() {
    return geographicLocationStatus;
  }


  @JsonProperty(JSON_PROPERTY_GEOGRAPHIC_LOCATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeographicLocationStatus(DictionaryServiceGeographicLocationStatus geographicLocationStatus) {
    this.geographicLocationStatus = geographicLocationStatus;
  }


  public DictionaryServiceGeographicLocation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;地域名(市区町村のみ)です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Name of places (City Only)&lt;/div&gt; 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">地域名(市区町村のみ)です。</div> <div lang=\"en\">Name of places (City Only)</div> ")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public DictionaryServiceGeographicLocation order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;並び順です。&lt;br&gt;下記の順序に基づいた連番となります。&lt;br&gt; 都道府県は北海道、青森、・・・・沖縄の順&lt;br&gt;都道府県配下の市区町村は五十音順&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Order of list&lt;br&gt;&lt;br&gt;Sequential number based on the order below.&lt;br&gt;&lt;br&gt; - Prefecture is in order of Hokkaido, Aomori to Okinawa. (North to South)&lt;br&gt;&lt;br&gt; - Cities under prefecture are listed in the order of the 50-character Japanese kana syllabary.&lt;/div&gt; 
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">並び順です。<br>下記の順序に基づいた連番となります。<br> 都道府県は北海道、青森、・・・・沖縄の順<br>都道府県配下の市区町村は五十音順</div> <div lang=\"en\">Order of list<br><br>Sequential number based on the order below.<br><br> - Prefecture is in order of Hokkaido, Aomori to Okinawa. (North to South)<br><br> - Cities under prefecture are listed in the order of the 50-character Japanese kana syllabary.</div> ")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(String order) {
    this.order = order;
  }


  public DictionaryServiceGeographicLocation parent(String parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;上位地域コードです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Parent geographic code&lt;/div&gt; 
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">上位地域コードです。</div> <div lang=\"en\">Parent geographic code</div> ")
  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParent() {
    return parent;
  }


  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParent(String parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceGeographicLocation dictionaryServiceGeographicLocation = (DictionaryServiceGeographicLocation) o;
    return Objects.equals(this.child, dictionaryServiceGeographicLocation.child) &&
        Objects.equals(this.code, dictionaryServiceGeographicLocation.code) &&
        Objects.equals(this.fullName, dictionaryServiceGeographicLocation.fullName) &&
        Objects.equals(this.geographicLocationStatus, dictionaryServiceGeographicLocation.geographicLocationStatus) &&
        Objects.equals(this.name, dictionaryServiceGeographicLocation.name) &&
        Objects.equals(this.order, dictionaryServiceGeographicLocation.order) &&
        Objects.equals(this.parent, dictionaryServiceGeographicLocation.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(child, code, fullName, geographicLocationStatus, name, order, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceGeographicLocation {\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    geographicLocationStatus: ").append(toIndentedString(geographicLocationStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

