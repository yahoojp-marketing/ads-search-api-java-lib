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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceTextAd2オブジェクトは、検索広告のPCおよびスマートフォン向けの広告を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがTEXT_AD2の場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceTextAd2 object is a text ad type for Sponsored Search on PC and smartphone.&lt;br&gt; This field is optional in ADD operation. *If adType is TEXT_AD2, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceTextAd2オブジェクトは、検索広告のPCおよびスマートフォン向けの広告を表します。<br> ADD時、このフィールドは省略可能となります。※adTypeがTEXT_AD2の場合は必須です。</div> <div lang=\"en\">AdGroupAdServiceTextAd2 object is a text ad type for Sponsored Search on PC and smartphone.<br> This field is optional in ADD operation. *If adType is TEXT_AD2, this field is required.</div> ")
@JsonPropertyOrder({
  AdGroupAdServiceTextAd2.JSON_PROPERTY_HEADLINE,
  AdGroupAdServiceTextAd2.JSON_PROPERTY_DESCRIPTION,
  AdGroupAdServiceTextAd2.JSON_PROPERTY_DESCRIPTION2
})
@JsonTypeName("AdGroupAdServiceTextAd2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupAdServiceTextAd2 {
  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DESCRIPTION2 = "description2";
  private String description2;

  public AdGroupAdServiceTextAd2() { 
  }

  public AdGroupAdServiceTextAd2 headline(String headline) {
    
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


  public AdGroupAdServiceTextAd2 description(String description) {
    
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


  public AdGroupAdServiceTextAd2 description2(String description2) {
    
    this.description2 = description2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;説明文2（2行目）です。&lt;br&gt; ADD時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description2 (line2) of the ad.&lt;br&gt; This field is required in ADD operation.&lt;/div&gt; 
   * @return description2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">説明文2（2行目）です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Description2 (line2) of the ad.<br> This field is required in ADD operation.</div> ")
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
    AdGroupAdServiceTextAd2 adGroupAdServiceTextAd2 = (AdGroupAdServiceTextAd2) o;
    return Objects.equals(this.headline, adGroupAdServiceTextAd2.headline) &&
        Objects.equals(this.description, adGroupAdServiceTextAd2.description) &&
        Objects.equals(this.description2, adGroupAdServiceTextAd2.description2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, description, description2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceTextAd2 {\n");
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

