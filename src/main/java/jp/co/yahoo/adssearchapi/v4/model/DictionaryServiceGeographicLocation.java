package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.DictionaryServiceGeographicLocationStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceGeographicLocationオブジェクトは、地域情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocation contains geographic location information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceGeographicLocationオブジェクトは、地域情報を格納します。</div> <div lang=\"en\">DictionaryServiceGeographicLocation contains geographic location information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceGeographicLocation   {
  @JsonProperty("child")
  @Valid
  private List<DictionaryServiceGeographicLocation> child = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("geographicLocationStatus")
  private DictionaryServiceGeographicLocationStatus geographicLocationStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("parent")
  private String parent = null;

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DictionaryServiceGeographicLocation> getChild() {
    return child;
  }

  public void setChild(List<DictionaryServiceGeographicLocation> child) {
    this.child = child;
  }

  public DictionaryServiceGeographicLocation code(String code) {
    this.code = code;
    return this;
  }

  /**
   * <div lang=\"ja\">地域コードです。</div> <div lang=\"en\">Geographic code</div> 
   * @return code
  */
  @ApiModelProperty(value = "<div lang=\"ja\">地域コードです。</div> <div lang=\"en\">Geographic code</div> ")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DictionaryServiceGeographicLocation fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * <div lang=\"ja\">地域名(都道府県名からすべて)です。</div> <div lang=\"en\">Name of places (Prefecture and all)</div> 
   * @return fullName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">地域名(都道府県名からすべて)です。</div> <div lang=\"en\">Name of places (Prefecture and all)</div> ")


  public String getFullName() {
    return fullName;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryServiceGeographicLocationStatus getGeographicLocationStatus() {
    return geographicLocationStatus;
  }

  public void setGeographicLocationStatus(DictionaryServiceGeographicLocationStatus geographicLocationStatus) {
    this.geographicLocationStatus = geographicLocationStatus;
  }

  public DictionaryServiceGeographicLocation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <div lang=\"ja\">地域名(市区町村のみ)です。</div> <div lang=\"en\">Name of places (City Only)</div> 
   * @return name
  */
  @ApiModelProperty(value = "<div lang=\"ja\">地域名(市区町村のみ)です。</div> <div lang=\"en\">Name of places (City Only)</div> ")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DictionaryServiceGeographicLocation order(String order) {
    this.order = order;
    return this;
  }

  /**
   * <div lang=\"ja\">並び順です。<br>下記の順序に基づいた連番となります。<br> 都道府県は北海道、青森、・・・・沖縄の順<br>都道府県配下の市区町村は五十音順</div> <div lang=\"en\">Order of list<br><br>Sequential number based on the order below.<br><br> - Prefecture is in order of Hokkaido, Aomori to Okinawa. (North to South)<br><br> - Cities under prefecture are listed in the order of the 50-character Japanese kana syllabary.</div> 
   * @return order
  */
  @ApiModelProperty(value = "<div lang=\"ja\">並び順です。<br>下記の順序に基づいた連番となります。<br> 都道府県は北海道、青森、・・・・沖縄の順<br>都道府県配下の市区町村は五十音順</div> <div lang=\"en\">Order of list<br><br>Sequential number based on the order below.<br><br> - Prefecture is in order of Hokkaido, Aomori to Okinawa. (North to South)<br><br> - Cities under prefecture are listed in the order of the 50-character Japanese kana syllabary.</div> ")


  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public DictionaryServiceGeographicLocation parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * <div lang=\"ja\">上位地域コードです。</div> <div lang=\"en\">Parent geographic code</div> 
   * @return parent
  */
  @ApiModelProperty(value = "<div lang=\"ja\">上位地域コードです。</div> <div lang=\"en\">Parent geographic code</div> ")


  public String getParent() {
    return parent;
  }

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

