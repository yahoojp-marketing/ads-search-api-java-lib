package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.CampaignTargetServiceExcludedType;
import jp.co.yahoo.adssearchapi.v7.model.CampaignTargetServiceTargetingStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceLocationTargetオブジェクトは、地域ターゲティング設定です。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※targetTypeがLOCATIONの場合、このフィールドはADD時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServiceLocationTarget object is a location target setting.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If targetType is LOCATION,  this field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetServiceLocationTargetオブジェクトは、地域ターゲティング設定です。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※targetTypeがLOCATIONの場合、このフィールドはADD時に必須となります。</div> <div lang=\"en\">CampaignTargetServiceLocationTarget object is a location target setting.<br> This field is optional in ADD and SET operation.<br> *If targetType is LOCATION,  this field is required in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignTargetServiceLocationTarget   {
  @JsonProperty("cityNameEN")
  private String cityNameEN = null;

  @JsonProperty("cityNameJA")
  private String cityNameJA = null;

  @JsonProperty("excludedType")
  private CampaignTargetServiceExcludedType excludedType = null;

  @JsonProperty("provinceNameEN")
  private String provinceNameEN = null;

  @JsonProperty("provinceNameJA")
  private String provinceNameJA = null;

  @JsonProperty("targetingStatus")
  private CampaignTargetServiceTargetingStatus targetingStatus = null;

  public CampaignTargetServiceLocationTarget cityNameEN(String cityNameEN) {
    this.cityNameEN = cityNameEN;
    return this;
  }

  /**
   * <div lang=\"ja\">市区町村名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">City(English).<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return cityNameEN
  */
  @ApiModelProperty(value = "<div lang=\"ja\">市区町村名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">City(English).<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getCityNameEN() {
    return cityNameEN;
  }

  public void setCityNameEN(String cityNameEN) {
    this.cityNameEN = cityNameEN;
  }

  public CampaignTargetServiceLocationTarget cityNameJA(String cityNameJA) {
    this.cityNameJA = cityNameJA;
    return this;
  }

  /**
   * <div lang=\"ja\">市区町村名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">City(Japanese).<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return cityNameJA
  */
  @ApiModelProperty(value = "<div lang=\"ja\">市区町村名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">City(Japanese).<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getCityNameJA() {
    return cityNameJA;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignTargetServiceExcludedType getExcludedType() {
    return excludedType;
  }

  public void setExcludedType(CampaignTargetServiceExcludedType excludedType) {
    this.excludedType = excludedType;
  }

  public CampaignTargetServiceLocationTarget provinceNameEN(String provinceNameEN) {
    this.provinceNameEN = provinceNameEN;
    return this;
  }

  /**
   * <div lang=\"ja\">都道府県名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Prefecture(English).<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return provinceNameEN
  */
  @ApiModelProperty(value = "<div lang=\"ja\">都道府県名（英語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Prefecture(English).<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getProvinceNameEN() {
    return provinceNameEN;
  }

  public void setProvinceNameEN(String provinceNameEN) {
    this.provinceNameEN = provinceNameEN;
  }

  public CampaignTargetServiceLocationTarget provinceNameJA(String provinceNameJA) {
    this.provinceNameJA = provinceNameJA;
    return this;
  }

  /**
   * <div lang=\"ja\">都道府県名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Prefecture(Japanese).<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return provinceNameJA
  */
  @ApiModelProperty(value = "<div lang=\"ja\">都道府県名（日本語）です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Prefecture(Japanese).<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getProvinceNameJA() {
    return provinceNameJA;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignTargetServiceTargetingStatus getTargetingStatus() {
    return targetingStatus;
  }

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

