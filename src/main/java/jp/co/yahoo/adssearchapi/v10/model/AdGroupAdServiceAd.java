/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupAdServiceAdType;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupAdServiceAppAd;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupAdServiceCustomParameters;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupAdServiceDevicePreference;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupAdServiceDynamicSearchLinkedAd;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupAdServiceExtendedTextAd;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupAdServiceIsRemove;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupAdServiceResponsiveSearchAd;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupAdServiceTextAd2;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceAdオブジェクトは、広告に関する情報を表します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceAd object describes ad information.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AdGroupAdServiceAd.JSON_PROPERTY_AD_TYPE,
  AdGroupAdServiceAd.JSON_PROPERTY_TEXT_AD2,
  AdGroupAdServiceAd.JSON_PROPERTY_APP_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_EXTENDED_TEXT_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_DYNAMIC_SEARCH_LINKED_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_RESPONSIVE_SEARCH_AD,
  AdGroupAdServiceAd.JSON_PROPERTY_FINAL_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_REVIEW_FINAL_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_SMARTPHONE_FINAL_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_REVIEW_SMARTPHONE_FINAL_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_TRACKING_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_REVIEW_TRACKING_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_IS_REMOVE_TRACKING_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_CUSTOM_PARAMETERS,
  AdGroupAdServiceAd.JSON_PROPERTY_REVIEW_CUSTOM_PARAMETERS,
  AdGroupAdServiceAd.JSON_PROPERTY_DEVICE_PREFERENCE,
  AdGroupAdServiceAd.JSON_PROPERTY_DISPLAY_URL,
  AdGroupAdServiceAd.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceAd {
  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private AdGroupAdServiceAdType adType;

  public static final String JSON_PROPERTY_TEXT_AD2 = "textAd2";
  private AdGroupAdServiceTextAd2 textAd2;

  public static final String JSON_PROPERTY_APP_AD = "appAd";
  private AdGroupAdServiceAppAd appAd;

  public static final String JSON_PROPERTY_EXTENDED_TEXT_AD = "extendedTextAd";
  private AdGroupAdServiceExtendedTextAd extendedTextAd;

  public static final String JSON_PROPERTY_DYNAMIC_SEARCH_LINKED_AD = "dynamicSearchLinkedAd";
  private AdGroupAdServiceDynamicSearchLinkedAd dynamicSearchLinkedAd;

  public static final String JSON_PROPERTY_RESPONSIVE_SEARCH_AD = "responsiveSearchAd";
  private AdGroupAdServiceResponsiveSearchAd responsiveSearchAd;

  public static final String JSON_PROPERTY_FINAL_URL = "finalUrl";
  private String finalUrl;

  public static final String JSON_PROPERTY_REVIEW_FINAL_URL = "reviewFinalUrl";
  private String reviewFinalUrl;

  public static final String JSON_PROPERTY_SMARTPHONE_FINAL_URL = "smartphoneFinalUrl";
  private String smartphoneFinalUrl;

  public static final String JSON_PROPERTY_REVIEW_SMARTPHONE_FINAL_URL = "reviewSmartphoneFinalUrl";
  private String reviewSmartphoneFinalUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL = "isRemoveSmartphoneFinalUrl";
  private AdGroupAdServiceIsRemove isRemoveSmartphoneFinalUrl;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public static final String JSON_PROPERTY_REVIEW_TRACKING_URL = "reviewTrackingUrl";
  private String reviewTrackingUrl;

  public static final String JSON_PROPERTY_IS_REMOVE_TRACKING_URL = "isRemoveTrackingUrl";
  private AdGroupAdServiceIsRemove isRemoveTrackingUrl;

  public static final String JSON_PROPERTY_CUSTOM_PARAMETERS = "customParameters";
  private AdGroupAdServiceCustomParameters customParameters;

  public static final String JSON_PROPERTY_REVIEW_CUSTOM_PARAMETERS = "reviewCustomParameters";
  private AdGroupAdServiceCustomParameters reviewCustomParameters;

  public static final String JSON_PROPERTY_DEVICE_PREFERENCE = "devicePreference";
  private AdGroupAdServiceDevicePreference devicePreference;

  public static final String JSON_PROPERTY_DISPLAY_URL = "displayUrl";
  private String displayUrl;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public AdGroupAdServiceAd() {
  }

  public AdGroupAdServiceAd adType(AdGroupAdServiceAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceAdType getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdType(AdGroupAdServiceAdType adType) {
    this.adType = adType;
  }


  public AdGroupAdServiceAd textAd2(AdGroupAdServiceTextAd2 textAd2) {
    
    this.textAd2 = textAd2;
    return this;
  }

   /**
   * Get textAd2
   * @return textAd2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_AD2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceTextAd2 getTextAd2() {
    return textAd2;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_AD2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextAd2(AdGroupAdServiceTextAd2 textAd2) {
    this.textAd2 = textAd2;
  }


  public AdGroupAdServiceAd appAd(AdGroupAdServiceAppAd appAd) {
    
    this.appAd = appAd;
    return this;
  }

   /**
   * Get appAd
   * @return appAd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceAppAd getAppAd() {
    return appAd;
  }


  @JsonProperty(JSON_PROPERTY_APP_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppAd(AdGroupAdServiceAppAd appAd) {
    this.appAd = appAd;
  }


  public AdGroupAdServiceAd extendedTextAd(AdGroupAdServiceExtendedTextAd extendedTextAd) {
    
    this.extendedTextAd = extendedTextAd;
    return this;
  }

   /**
   * Get extendedTextAd
   * @return extendedTextAd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTENDED_TEXT_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceExtendedTextAd getExtendedTextAd() {
    return extendedTextAd;
  }


  @JsonProperty(JSON_PROPERTY_EXTENDED_TEXT_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedTextAd(AdGroupAdServiceExtendedTextAd extendedTextAd) {
    this.extendedTextAd = extendedTextAd;
  }


  public AdGroupAdServiceAd dynamicSearchLinkedAd(AdGroupAdServiceDynamicSearchLinkedAd dynamicSearchLinkedAd) {
    
    this.dynamicSearchLinkedAd = dynamicSearchLinkedAd;
    return this;
  }

   /**
   * Get dynamicSearchLinkedAd
   * @return dynamicSearchLinkedAd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DYNAMIC_SEARCH_LINKED_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceDynamicSearchLinkedAd getDynamicSearchLinkedAd() {
    return dynamicSearchLinkedAd;
  }


  @JsonProperty(JSON_PROPERTY_DYNAMIC_SEARCH_LINKED_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDynamicSearchLinkedAd(AdGroupAdServiceDynamicSearchLinkedAd dynamicSearchLinkedAd) {
    this.dynamicSearchLinkedAd = dynamicSearchLinkedAd;
  }


  public AdGroupAdServiceAd responsiveSearchAd(AdGroupAdServiceResponsiveSearchAd responsiveSearchAd) {
    
    this.responsiveSearchAd = responsiveSearchAd;
    return this;
  }

   /**
   * Get responsiveSearchAd
   * @return responsiveSearchAd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSIVE_SEARCH_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceResponsiveSearchAd getResponsiveSearchAd() {
    return responsiveSearchAd;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSIVE_SEARCH_AD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponsiveSearchAd(AdGroupAdServiceResponsiveSearchAd responsiveSearchAd) {
    this.responsiveSearchAd = responsiveSearchAd;
  }


  public AdGroupAdServiceAd finalUrl(String finalUrl) {
    
    this.finalUrl = finalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URLです。&lt;br&gt; ADD時、このフィールドは必須となります。※adTypeがDYNAMIC_SEARCH_LINKED_ADの場合は無視されます。&lt;br&gt; SET時、adTypeがRESPONSIVE_SEARCH_ADの場合のみ更新可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Landing Page URL.&lt;br&gt; This field is required in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD, this field will be ignored.&lt;/div&gt; 
   * @return finalUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinalUrl() {
    return finalUrl;
  }


  @JsonProperty(JSON_PROPERTY_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinalUrl(String finalUrl) {
    this.finalUrl = finalUrl;
  }


  public AdGroupAdServiceAd reviewFinalUrl(String reviewFinalUrl) {
    
    this.reviewFinalUrl = reviewFinalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中の最終リンク先URLです。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Landing Page URL on editorial review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewFinalUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewFinalUrl() {
    return reviewFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewFinalUrl(String reviewFinalUrl) {
    this.reviewFinalUrl = reviewFinalUrl;
  }


  public AdGroupAdServiceAd smartphoneFinalUrl(String smartphoneFinalUrl) {
    
    this.smartphoneFinalUrl = smartphoneFinalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最終リンク先URL（スマートフォン）です。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがDYNAMIC_SEARCH_LINKED_ADの場合は無視されます。&lt;br&gt; SET時、adTypeがRESPONSIVE_SEARCH_ADの場合のみ更新可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Landing Page URL (Smartphone).&lt;br&gt; This field is optional in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD, this field will be ignored.&lt;/div&gt; 
   * @return smartphoneFinalUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSmartphoneFinalUrl() {
    return smartphoneFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmartphoneFinalUrl(String smartphoneFinalUrl) {
    this.smartphoneFinalUrl = smartphoneFinalUrl;
  }


  public AdGroupAdServiceAd reviewSmartphoneFinalUrl(String reviewSmartphoneFinalUrl) {
    
    this.reviewSmartphoneFinalUrl = reviewSmartphoneFinalUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中の最終リンク先URL（スマートフォン）です。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Landing Page URL (Smartphone) on editorial review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewSmartphoneFinalUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewSmartphoneFinalUrl() {
    return reviewSmartphoneFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewSmartphoneFinalUrl(String reviewSmartphoneFinalUrl) {
    this.reviewSmartphoneFinalUrl = reviewSmartphoneFinalUrl;
  }


  public AdGroupAdServiceAd isRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemove isRemoveSmartphoneFinalUrl) {
    
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
    return this;
  }

   /**
   * Get isRemoveSmartphoneFinalUrl
   * @return isRemoveSmartphoneFinalUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemove getIsRemoveSmartphoneFinalUrl() {
    return isRemoveSmartphoneFinalUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_SMARTPHONE_FINAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveSmartphoneFinalUrl(AdGroupAdServiceIsRemove isRemoveSmartphoneFinalUrl) {
    this.isRemoveSmartphoneFinalUrl = isRemoveSmartphoneFinalUrl;
  }


  public AdGroupAdServiceAd trackingUrl(String trackingUrl) {
    
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキングURLです。&lt;br&gt; ADD時、このフィールドは省略可能となります。&lt;br&gt; SET時、adTypeがRESPONSIVE_SEARCH_ADの場合のみ更新可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL.&lt;br&gt; This field is optional in ADD operation.&lt;/div&gt; 
   * @return trackingUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingUrl() {
    return trackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  public AdGroupAdServiceAd reviewTrackingUrl(String reviewTrackingUrl) {
    
    this.reviewTrackingUrl = reviewTrackingUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;審査中のトラッキングURLです。&lt;br&gt; このフィールドは、リクエストの際には無視されます。&lt;br&gt; 審査中の間のみ、レスポンスの際に返却されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking URL on editorial review.&lt;br&gt; This field will be ignored on input.&lt;br&gt; It will be returned at the time of response only during the review.&lt;/div&gt; 
   * @return reviewTrackingUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewTrackingUrl() {
    return reviewTrackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewTrackingUrl(String reviewTrackingUrl) {
    this.reviewTrackingUrl = reviewTrackingUrl;
  }


  public AdGroupAdServiceAd isRemoveTrackingUrl(AdGroupAdServiceIsRemove isRemoveTrackingUrl) {
    
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
    return this;
  }

   /**
   * Get isRemoveTrackingUrl
   * @return isRemoveTrackingUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceIsRemove getIsRemoveTrackingUrl() {
    return isRemoveTrackingUrl;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemoveTrackingUrl(AdGroupAdServiceIsRemove isRemoveTrackingUrl) {
    this.isRemoveTrackingUrl = isRemoveTrackingUrl;
  }


  public AdGroupAdServiceAd customParameters(AdGroupAdServiceCustomParameters customParameters) {
    
    this.customParameters = customParameters;
    return this;
  }

   /**
   * Get customParameters
   * @return customParameters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceCustomParameters getCustomParameters() {
    return customParameters;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomParameters(AdGroupAdServiceCustomParameters customParameters) {
    this.customParameters = customParameters;
  }


  public AdGroupAdServiceAd reviewCustomParameters(AdGroupAdServiceCustomParameters reviewCustomParameters) {
    
    this.reviewCustomParameters = reviewCustomParameters;
    return this;
  }

   /**
   * Get reviewCustomParameters
   * @return reviewCustomParameters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceCustomParameters getReviewCustomParameters() {
    return reviewCustomParameters;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_CUSTOM_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewCustomParameters(AdGroupAdServiceCustomParameters reviewCustomParameters) {
    this.reviewCustomParameters = reviewCustomParameters;
  }


  public AdGroupAdServiceAd devicePreference(AdGroupAdServiceDevicePreference devicePreference) {
    
    this.devicePreference = devicePreference;
    return this;
  }

   /**
   * Get devicePreference
   * @return devicePreference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceDevicePreference getDevicePreference() {
    return devicePreference;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevicePreference(AdGroupAdServiceDevicePreference devicePreference) {
    this.devicePreference = devicePreference;
  }


  public AdGroupAdServiceAd displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;表示URLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Display URL.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return displayUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayUrl() {
    return displayUrl;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }


  public AdGroupAdServiceAd url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;移行前のリンク先URLです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Destination URL before upgrading. &lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        Objects.equals(this.textAd2, adGroupAdServiceAd.textAd2) &&
        Objects.equals(this.appAd, adGroupAdServiceAd.appAd) &&
        Objects.equals(this.extendedTextAd, adGroupAdServiceAd.extendedTextAd) &&
        Objects.equals(this.dynamicSearchLinkedAd, adGroupAdServiceAd.dynamicSearchLinkedAd) &&
        Objects.equals(this.responsiveSearchAd, adGroupAdServiceAd.responsiveSearchAd) &&
        Objects.equals(this.finalUrl, adGroupAdServiceAd.finalUrl) &&
        Objects.equals(this.reviewFinalUrl, adGroupAdServiceAd.reviewFinalUrl) &&
        Objects.equals(this.smartphoneFinalUrl, adGroupAdServiceAd.smartphoneFinalUrl) &&
        Objects.equals(this.reviewSmartphoneFinalUrl, adGroupAdServiceAd.reviewSmartphoneFinalUrl) &&
        Objects.equals(this.isRemoveSmartphoneFinalUrl, adGroupAdServiceAd.isRemoveSmartphoneFinalUrl) &&
        Objects.equals(this.trackingUrl, adGroupAdServiceAd.trackingUrl) &&
        Objects.equals(this.reviewTrackingUrl, adGroupAdServiceAd.reviewTrackingUrl) &&
        Objects.equals(this.isRemoveTrackingUrl, adGroupAdServiceAd.isRemoveTrackingUrl) &&
        Objects.equals(this.customParameters, adGroupAdServiceAd.customParameters) &&
        Objects.equals(this.reviewCustomParameters, adGroupAdServiceAd.reviewCustomParameters) &&
        Objects.equals(this.devicePreference, adGroupAdServiceAd.devicePreference) &&
        Objects.equals(this.displayUrl, adGroupAdServiceAd.displayUrl) &&
        Objects.equals(this.url, adGroupAdServiceAd.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, textAd2, appAd, extendedTextAd, dynamicSearchLinkedAd, responsiveSearchAd, finalUrl, reviewFinalUrl, smartphoneFinalUrl, reviewSmartphoneFinalUrl, isRemoveSmartphoneFinalUrl, trackingUrl, reviewTrackingUrl, isRemoveTrackingUrl, customParameters, reviewCustomParameters, devicePreference, displayUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceAd {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    textAd2: ").append(toIndentedString(textAd2)).append("\n");
    sb.append("    appAd: ").append(toIndentedString(appAd)).append("\n");
    sb.append("    extendedTextAd: ").append(toIndentedString(extendedTextAd)).append("\n");
    sb.append("    dynamicSearchLinkedAd: ").append(toIndentedString(dynamicSearchLinkedAd)).append("\n");
    sb.append("    responsiveSearchAd: ").append(toIndentedString(responsiveSearchAd)).append("\n");
    sb.append("    finalUrl: ").append(toIndentedString(finalUrl)).append("\n");
    sb.append("    reviewFinalUrl: ").append(toIndentedString(reviewFinalUrl)).append("\n");
    sb.append("    smartphoneFinalUrl: ").append(toIndentedString(smartphoneFinalUrl)).append("\n");
    sb.append("    reviewSmartphoneFinalUrl: ").append(toIndentedString(reviewSmartphoneFinalUrl)).append("\n");
    sb.append("    isRemoveSmartphoneFinalUrl: ").append(toIndentedString(isRemoveSmartphoneFinalUrl)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    reviewTrackingUrl: ").append(toIndentedString(reviewTrackingUrl)).append("\n");
    sb.append("    isRemoveTrackingUrl: ").append(toIndentedString(isRemoveTrackingUrl)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    reviewCustomParameters: ").append(toIndentedString(reviewCustomParameters)).append("\n");
    sb.append("    devicePreference: ").append(toIndentedString(devicePreference)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
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

