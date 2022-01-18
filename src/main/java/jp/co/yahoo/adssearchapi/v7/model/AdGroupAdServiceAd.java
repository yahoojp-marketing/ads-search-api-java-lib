package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceAdType;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceAppAd;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceCustomParameters;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceDevicePreference;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceDynamicSearchLinkedAd;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceExtendedTextAd;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceResponsiveSearchAd;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceTextAd2;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceAdオブジェクトは、広告に関する情報を表します。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceAd object describes ad information.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceAdオブジェクトは、広告に関する情報を表します。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupAdServiceAd object describes ad information.<br> This field is required in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceAd   {
  @JsonProperty("adType")
  private AdGroupAdServiceAdType adType = null;

  @JsonProperty("smartphoneFinalUrl")
  private String smartphoneFinalUrl = null;

  @JsonProperty("finalUrl")
  private String finalUrl = null;

  @JsonProperty("appAd")
  private AdGroupAdServiceAppAd appAd = null;

  @JsonProperty("customParameters")
  private AdGroupAdServiceCustomParameters customParameters = null;

  @JsonProperty("description1")
  private String description1 = null;

  @JsonProperty("devicePreference")
  private AdGroupAdServiceDevicePreference devicePreference = null;

  @JsonProperty("displayUrl")
  private String displayUrl = null;

  @JsonProperty("extendedTextAd")
  private AdGroupAdServiceExtendedTextAd extendedTextAd = null;

  @JsonProperty("responsiveSearchAd")
  private AdGroupAdServiceResponsiveSearchAd responsiveSearchAd = null;

  @JsonProperty("headline1")
  private String headline1 = null;

  @JsonProperty("textAd2")
  private AdGroupAdServiceTextAd2 textAd2 = null;

  @JsonProperty("dynamicSearchLinkedAd")
  private AdGroupAdServiceDynamicSearchLinkedAd dynamicSearchLinkedAd = null;

  @JsonProperty("trackingUrl")
  private String trackingUrl = null;

  @JsonProperty("url")
  private String url = null;

  public AdGroupAdServiceAd adType(AdGroupAdServiceAdType adType) {
    this.adType = adType;
    return this;
  }

  /**
   * Get adType
   * @return adType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceAdType getAdType() {
    return adType;
  }

  public void setAdType(AdGroupAdServiceAdType adType) {
    this.adType = adType;
  }

  public AdGroupAdServiceAd smartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URL（スマートフォン）です。<br> ADD時、このフィールドは省略可能となります。※adTypeがDYNAMIC_SEARCH_LINKED_ADの場合は無視されます。</div> <div lang=\"en\">Landing Page URL (Smartphone).<br> This field is optional in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD, this field will be ignored.</div> 
   * @return smartphoneFinalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URL（スマートフォン）です。<br> ADD時、このフィールドは省略可能となります。※adTypeがDYNAMIC_SEARCH_LINKED_ADの場合は無視されます。</div> <div lang=\"en\">Landing Page URL (Smartphone).<br> This field is optional in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD, this field will be ignored.</div> ")


  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }

  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }

  public AdGroupAdServiceAd finalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">最終リンク先URLです。<br> ADD時、このフィールドは必須となります。※adTypeがDYNAMIC_SEARCH_LINKED_ADの場合は無視されます。</div> <div lang=\"en\">Landing Page URL.<br> This field is required in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD, this field will be ignored.</div> 
   * @return finalUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最終リンク先URLです。<br> ADD時、このフィールドは必須となります。※adTypeがDYNAMIC_SEARCH_LINKED_ADの場合は無視されます。</div> <div lang=\"en\">Landing Page URL.<br> This field is required in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD, this field will be ignored.</div> ")


  public String getFinalUrl() {
    return finalUrl;
  }

  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }

  public AdGroupAdServiceAd appAd(AdGroupAdServiceAppAd appAd) {
    this.appAd = appAd;
    return this;
  }

  /**
   * Get appAd
   * @return appAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceAppAd getAppAd() {
    return appAd;
  }

  public void setAppAd(AdGroupAdServiceAppAd appAd) {
    this.appAd = appAd;
  }

  public AdGroupAdServiceAd customParameters(AdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
    return this;
  }

  /**
   * Get customParameters
   * @return customParameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceCustomParameters getCustomParameters() {
    return customParameters;
  }

  public void setCustomParameters(AdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }

  public AdGroupAdServiceAd description1(String description1) {
    this.description1 = description1;
    return this;
  }

  /**
   * <div lang=\"ja\">説明文です。<br> ADD時、このフィールドは必須となります。※adTypeがRESPONSIVE_SEARCH_ADの場合は無視されます。</div> <div lang=\"en\">Description of ad.<br> This field is required in ADD operation. *If adType is RESPONSIVE_SEARCH_AD, this field will be ignored.</div> 
   * @return description1
  */
  @ApiModelProperty(value = "<div lang=\"ja\">説明文です。<br> ADD時、このフィールドは必須となります。※adTypeがRESPONSIVE_SEARCH_ADの場合は無視されます。</div> <div lang=\"en\">Description of ad.<br> This field is required in ADD operation. *If adType is RESPONSIVE_SEARCH_AD, this field will be ignored.</div> ")


  public String getDescription1() {
    return description1;
  }

  public void setDescription1(String description1) {
    this.description1 = description1;
  }

  public AdGroupAdServiceAd devicePreference(AdGroupAdServiceDevicePreference devicePreference) {
    this.devicePreference = devicePreference;
    return this;
  }

  /**
   * Get devicePreference
   * @return devicePreference
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceDevicePreference getDevicePreference() {
    return devicePreference;
  }

  public void setDevicePreference(AdGroupAdServiceDevicePreference devicePreference) {
    this.devicePreference = devicePreference;
  }

  public AdGroupAdServiceAd displayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">表示URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Display URL.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return displayUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">表示URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Display URL.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getDisplayUrl() {
    return displayUrl;
  }

  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }

  public AdGroupAdServiceAd extendedTextAd(AdGroupAdServiceExtendedTextAd extendedTextAd) {
    this.extendedTextAd = extendedTextAd;
    return this;
  }

  /**
   * Get extendedTextAd
   * @return extendedTextAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceExtendedTextAd getExtendedTextAd() {
    return extendedTextAd;
  }

  public void setExtendedTextAd(AdGroupAdServiceExtendedTextAd extendedTextAd) {
    this.extendedTextAd = extendedTextAd;
  }

  public AdGroupAdServiceAd responsiveSearchAd(AdGroupAdServiceResponsiveSearchAd responsiveSearchAd) {
    this.responsiveSearchAd = responsiveSearchAd;
    return this;
  }

  /**
   * Get responsiveSearchAd
   * @return responsiveSearchAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceResponsiveSearchAd getResponsiveSearchAd() {
    return responsiveSearchAd;
  }

  public void setResponsiveSearchAd(AdGroupAdServiceResponsiveSearchAd responsiveSearchAd) {
    this.responsiveSearchAd = responsiveSearchAd;
  }

  public AdGroupAdServiceAd headline1(String headline1) {
    this.headline1 = headline1;
    return this;
  }

  /**
   * <div lang=\"ja\">タイトル文です。<br> ADD時、このフィールドは必須となります。※adTypeがDYNAMIC_SEARCH_LINKED_AD、またはRESPONSIVE_SEARCH_ADの場合は無視されます。</div> <div lang=\"en\">Title of ad.<br> This field is required in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD or RESPONSIVE_SEARCH_AD, this field will be ignored.</div> 
   * @return headline1
  */
  @ApiModelProperty(value = "<div lang=\"ja\">タイトル文です。<br> ADD時、このフィールドは必須となります。※adTypeがDYNAMIC_SEARCH_LINKED_AD、またはRESPONSIVE_SEARCH_ADの場合は無視されます。</div> <div lang=\"en\">Title of ad.<br> This field is required in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD or RESPONSIVE_SEARCH_AD, this field will be ignored.</div> ")


  public String getHeadline1() {
    return headline1;
  }

  public void setHeadline1(String headline1) {
    this.headline1 = headline1;
  }

  public AdGroupAdServiceAd textAd2(AdGroupAdServiceTextAd2 textAd2) {
    this.textAd2 = textAd2;
    return this;
  }

  /**
   * Get textAd2
   * @return textAd2
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceTextAd2 getTextAd2() {
    return textAd2;
  }

  public void setTextAd2(AdGroupAdServiceTextAd2 textAd2) {
    this.textAd2 = textAd2;
  }

  public AdGroupAdServiceAd dynamicSearchLinkedAd(AdGroupAdServiceDynamicSearchLinkedAd dynamicSearchLinkedAd) {
    this.dynamicSearchLinkedAd = dynamicSearchLinkedAd;
    return this;
  }

  /**
   * Get dynamicSearchLinkedAd
   * @return dynamicSearchLinkedAd
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceDynamicSearchLinkedAd getDynamicSearchLinkedAd() {
    return dynamicSearchLinkedAd;
  }

  public void setDynamicSearchLinkedAd(AdGroupAdServiceDynamicSearchLinkedAd dynamicSearchLinkedAd) {
    this.dynamicSearchLinkedAd = dynamicSearchLinkedAd;
  }

  public AdGroupAdServiceAd trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.</div> 
   * @return trackingUrl
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキングURLです。<br> ADD時、このフィールドは省略可能となります。</div> <div lang=\"en\">Tracking URL.<br> This field is optional in ADD operation.</div> ")


  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public AdGroupAdServiceAd url(String url) {
    this.url = url;
    return this;
  }

  /**
   * <div lang=\"ja\">移行前のリンク先URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Destination URL before upgrading. <br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return url
  */
  @ApiModelProperty(value = "<div lang=\"ja\">移行前のリンク先URLです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Destination URL before upgrading. <br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceAd adGroupAdServiceAd = (AdGroupAdServiceAd) o;
    return Objects.equals(this.adType, adGroupAdServiceAd.adType) &&
        Objects.equals(this.smartphoneFinalUrl, adGroupAdServiceAd.smartphoneFinalUrl) &&
        Objects.equals(this.finalUrl, adGroupAdServiceAd.finalUrl) &&
        Objects.equals(this.appAd, adGroupAdServiceAd.appAd) &&
        Objects.equals(this.customParameters, adGroupAdServiceAd.customParameters) &&
        Objects.equals(this.description1, adGroupAdServiceAd.description1) &&
        Objects.equals(this.devicePreference, adGroupAdServiceAd.devicePreference) &&
        Objects.equals(this.displayUrl, adGroupAdServiceAd.displayUrl) &&
        Objects.equals(this.extendedTextAd, adGroupAdServiceAd.extendedTextAd) &&
        Objects.equals(this.responsiveSearchAd, adGroupAdServiceAd.responsiveSearchAd) &&
        Objects.equals(this.headline1, adGroupAdServiceAd.headline1) &&
        Objects.equals(this.textAd2, adGroupAdServiceAd.textAd2) &&
        Objects.equals(this.dynamicSearchLinkedAd, adGroupAdServiceAd.dynamicSearchLinkedAd) &&
        Objects.equals(this.trackingUrl, adGroupAdServiceAd.trackingUrl) &&
        Objects.equals(this.url, adGroupAdServiceAd.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, smartphoneFinalUrl, finalUrl, appAd, customParameters, description1, devicePreference, displayUrl, extendedTextAd, responsiveSearchAd, headline1, textAd2, dynamicSearchLinkedAd, trackingUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceAd {\n");
    
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    appAd: ").append(toIndentedString(appAd)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    description1: ").append(toIndentedString(description1)).append("\n");
    sb.append("    devicePreference: ").append(toIndentedString(devicePreference)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    extendedTextAd: ").append(toIndentedString(extendedTextAd)).append("\n");
    sb.append("    responsiveSearchAd: ").append(toIndentedString(responsiveSearchAd)).append("\n");
    sb.append("    headline1: ").append(toIndentedString(headline1)).append("\n");
    sb.append("    textAd2: ").append(toIndentedString(textAd2)).append("\n");
    sb.append("    dynamicSearchLinkedAd: ").append(toIndentedString(dynamicSearchLinkedAd)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

