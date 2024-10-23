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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v15.model.AdGroupAdServiceAppStore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceAppAdオブジェクトは、アプリ向けの広告です。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがAPP_ADの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceAppAd object is for Mobile App ads.&lt;br&gt; This field is optional in ADD operation. *If adType is APP_AD, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceAppAdオブジェクトは、アプリ向けの広告です。<br> ADD時、このフィールドは省略可能となります。※adTypeがAPP_ADの場合は必須です。</div> <div lang=\"en\">AdGroupAdServiceAppAd object is for Mobile App ads.<br> This field is optional in ADD operation. *If adType is APP_AD, this field is required.</div> ")
@JsonPropertyOrder({
  AdGroupAdServiceAppAd.JSON_PROPERTY_APP_ID,
  AdGroupAdServiceAppAd.JSON_PROPERTY_APP_STORE,
  AdGroupAdServiceAppAd.JSON_PROPERTY_HEADLINE,
  AdGroupAdServiceAppAd.JSON_PROPERTY_DESCRIPTION,
  AdGroupAdServiceAppAd.JSON_PROPERTY_DESCRIPTION2
})
@JsonTypeName("AdGroupAdServiceAppAd")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceAppAd {
  public static final String JSON_PROPERTY_APP_ID = "appId";
  private String appId;

  public static final String JSON_PROPERTY_APP_STORE = "appStore";
  private AdGroupAdServiceAppStore appStore;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DESCRIPTION2 = "description2";
  private String description2;

  public AdGroupAdServiceAppAd() { 
  }

  public AdGroupAdServiceAppAd appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリIDです。&lt;br&gt; ※アプリキャンペーンの 場合、自動で設定され ます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App ID.&lt;br&gt; *Automatically set for Mobile app campaign.&lt;/div&gt; 
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリIDです。<br> ※アプリキャンペーンの 場合、自動で設定され ます。</div> <div lang=\"en\">App ID.<br> *Automatically set for Mobile app campaign.</div> ")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(String appId) {
    this.appId = appId;
  }


  public AdGroupAdServiceAppAd appStore(AdGroupAdServiceAppStore appStore) {
    
    this.appStore = appStore;
    return this;
  }

   /**
   * Get appStore
   * @return appStore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdGroupAdServiceAppStore getAppStore() {
    return appStore;
  }


  @JsonProperty(JSON_PROPERTY_APP_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppStore(AdGroupAdServiceAppStore appStore) {
    this.appStore = appStore;
  }


  public AdGroupAdServiceAppAd headline(String headline) {
    
    this.headline = headline;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;タイトル文です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Title of ad.&lt;br&gt; This field is required in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD or RESPONSIVE_SEARCH_AD, this field will be ignored.&lt;/div&gt; 
   * @return headline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">タイトル文です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Title of ad.<br> This field is required in ADD operation. *If adType is DYNAMIC_SEARCH_LINKED_AD or RESPONSIVE_SEARCH_AD, this field will be ignored.</div> ")
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public AdGroupAdServiceAppAd description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;説明文です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;br&gt;自動挿入をサポートしていません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description of ad.&lt;br&gt; This field is required in ADD operation. *If adType is RESPONSIVE_SEARCH_AD, this field will be ignored.&lt;br&gt;Does not support Data Auto Insertion.&lt;/div&gt; 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">説明文です。<br> ADD時、このフィールドは必須となります。<br>自動挿入をサポートしていません。</div> <div lang=\"en\">Description of ad.<br> This field is required in ADD operation. *If adType is RESPONSIVE_SEARCH_AD, this field will be ignored.<br>Does not support Data Auto Insertion.</div> ")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AdGroupAdServiceAppAd description2(String description2) {
    
    this.description2 = description2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;説明文（2行目）2です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description2 (line2) of the ad.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return description2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">説明文（2行目）2です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Description2 (line2) of the ad.<br> This field is required in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription2() {
    return description2;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription2(String description2) {
    this.description2 = description2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceAppAd adGroupAdServiceAppAd = (AdGroupAdServiceAppAd) o;
    return Objects.equals(this.appId, adGroupAdServiceAppAd.appId) &&
        Objects.equals(this.appStore, adGroupAdServiceAppAd.appStore) &&
        Objects.equals(this.headline, adGroupAdServiceAppAd.headline) &&
        Objects.equals(this.description, adGroupAdServiceAppAd.description) &&
        Objects.equals(this.description2, adGroupAdServiceAppAd.description2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appStore, headline, description, description2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceAppAd {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appStore: ").append(toIndentedString(appStore)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
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

